package com.google.firebase.storage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.internal.AdaptiveStreamBuffer;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.internal.Sleeper;
import com.google.firebase.storage.internal.SleeperImpl;
import com.google.firebase.storage.internal.StorageReferenceUri;
import com.google.firebase.storage.internal.Util;
import com.google.firebase.storage.network.NetworkRequest;
import com.google.firebase.storage.network.ResumableUploadByteRequest;
import com.google.firebase.storage.network.ResumableUploadCancelRequest;
import com.google.firebase.storage.network.ResumableUploadQueryRequest;
import com.google.firebase.storage.network.ResumableUploadStartRequest;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.b0;
import org.json.JSONException;
import org.json.JSONObject;
import v9.o;
/* loaded from: classes.dex */
public class UploadTask extends StorageTask<TaskSnapshot> {
    private static final String APPLICATION_OCTET_STREAM = "application/octet-stream";
    private static final int MAXIMUM_CHUNK_SIZE = 33554432;
    static final int PREFERRED_CHUNK_SIZE = 262144;
    private static final String RESUMABLE_FINAL_STATUS = "final";
    private static final String TAG = "UploadTask";
    private static final String X_GOOG_UPLOAD_URL = "X-Goog-Upload-URL";
    private final cd.b mAppCheckProvider;
    private final gd.b mAuthProvider;
    private final AtomicLong mBytesUploaded;
    private int mCurrentChunkSize;
    private volatile Exception mException;
    private boolean mIsStreamOwned;
    private volatile StorageMetadata mMetadata;
    private volatile int mResultCode;
    private ExponentialBackoffSender mSender;
    private volatile Exception mServerException;
    private volatile String mServerStatus;
    private final StorageReference mStorageRef;
    private final AdaptiveStreamBuffer mStreamBuffer;
    private final long mTotalByteCount;
    private volatile Uri mUploadUri;
    private final Uri mUri;
    private volatile long maxSleepTime;
    private final int minimumSleepInterval;
    private int sleepTime;
    private static final Random random = new Random();
    static Sleeper sleeper = new SleeperImpl();
    static aa.c clock = b0.f23449u;

    /* loaded from: classes.dex */
    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {
        private final long mBytesUploaded;
        private final StorageMetadata mMetadata;
        private final Uri mUploadUri;

        public TaskSnapshot(Exception exc, long j10, Uri uri, StorageMetadata storageMetadata) {
            super(exc);
            this.mBytesUploaded = j10;
            this.mUploadUri = uri;
            this.mMetadata = storageMetadata;
        }

        public long getBytesTransferred() {
            return this.mBytesUploaded;
        }

        public StorageMetadata getMetadata() {
            return this.mMetadata;
        }

        public long getTotalByteCount() {
            return UploadTask.this.getTotalByteCount();
        }

        public Uri getUploadSessionUri() {
            return this.mUploadUri;
        }
    }

    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, byte[] bArr) {
        this.mBytesUploaded = new AtomicLong(0L);
        this.mCurrentChunkSize = PREFERRED_CHUNK_SIZE;
        this.mUploadUri = null;
        this.mException = null;
        this.mServerException = null;
        this.mResultCode = 0;
        this.sleepTime = 0;
        this.minimumSleepInterval = 1000;
        o.h(storageReference);
        o.h(bArr);
        FirebaseStorage storage = storageReference.getStorage();
        this.mTotalByteCount = bArr.length;
        this.mStorageRef = storageReference;
        this.mMetadata = storageMetadata;
        gd.b authProvider = storage.getAuthProvider();
        this.mAuthProvider = authProvider;
        cd.b appCheckProvider = storage.getAppCheckProvider();
        this.mAppCheckProvider = appCheckProvider;
        this.mUri = null;
        this.mStreamBuffer = new AdaptiveStreamBuffer(new ByteArrayInputStream(bArr), PREFERRED_CHUNK_SIZE);
        this.mIsStreamOwned = true;
        this.maxSleepTime = storage.getMaxChunkUploadRetry();
        sc.e app = storage.getApp();
        app.b();
        this.mSender = new ExponentialBackoffSender(app.f31432a, authProvider, appCheckProvider, storage.getMaxDownloadRetryTimeMillis());
    }

    private void beginResumableUpload() {
        String str;
        JSONObject jSONObject = null;
        if (this.mMetadata != null) {
            str = this.mMetadata.getContentType();
        } else {
            str = null;
        }
        if (this.mUri != null && TextUtils.isEmpty(str)) {
            sc.e app = this.mStorageRef.getStorage().getApp();
            app.b();
            str = app.f31432a.getContentResolver().getType(this.mUri);
        }
        if (TextUtils.isEmpty(str)) {
            str = APPLICATION_OCTET_STREAM;
        }
        StorageReferenceUri storageReferenceUri = this.mStorageRef.getStorageReferenceUri();
        sc.e app2 = this.mStorageRef.getApp();
        if (this.mMetadata != null) {
            jSONObject = this.mMetadata.createJSONObject();
        }
        ResumableUploadStartRequest resumableUploadStartRequest = new ResumableUploadStartRequest(storageReferenceUri, app2, jSONObject, str);
        if (!sendWithRetry(resumableUploadStartRequest)) {
            return;
        }
        String resultString = resumableUploadStartRequest.getResultString(X_GOOG_UPLOAD_URL);
        if (!TextUtils.isEmpty(resultString)) {
            this.mUploadUri = Uri.parse(resultString);
        }
    }

    private boolean delaySend(NetworkRequest networkRequest) {
        try {
            Log.d(TAG, "Waiting " + this.sleepTime + " milliseconds");
            sleeper.sleep(this.sleepTime + random.nextInt(250));
            boolean send = send(networkRequest);
            if (send) {
                this.sleepTime = 0;
            }
            return send;
        } catch (InterruptedException e10) {
            Log.w(TAG, "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.mServerException = e10;
            return false;
        }
    }

    private boolean isValidHttpResponseCode(int i6) {
        if (i6 != 308 && (i6 < 200 || i6 >= 300)) {
            return false;
        }
        return true;
    }

    private boolean processResultValid(NetworkRequest networkRequest) {
        int resultCode = networkRequest.getResultCode();
        if (this.mSender.isRetryableError(resultCode)) {
            resultCode = -2;
        }
        this.mResultCode = resultCode;
        this.mServerException = networkRequest.getException();
        this.mServerStatus = networkRequest.getResultString("X-Goog-Upload-Status");
        if (isValidHttpResponseCode(this.mResultCode) && this.mServerException == null) {
            return true;
        }
        return false;
    }

    private boolean recoverStatus(boolean z10) {
        long j10;
        ResumableUploadQueryRequest resumableUploadQueryRequest = new ResumableUploadQueryRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mUploadUri);
        if (RESUMABLE_FINAL_STATUS.equals(this.mServerStatus)) {
            return false;
        }
        if (z10) {
            if (!sendWithRetry(resumableUploadQueryRequest)) {
                return false;
            }
        } else if (!send(resumableUploadQueryRequest)) {
            return false;
        }
        if (RESUMABLE_FINAL_STATUS.equals(resumableUploadQueryRequest.getResultString("X-Goog-Upload-Status"))) {
            this.mException = new IOException("The server has terminated the upload session");
            return false;
        }
        String resultString = resumableUploadQueryRequest.getResultString("X-Goog-Upload-Size-Received");
        if (!TextUtils.isEmpty(resultString)) {
            j10 = Long.parseLong(resultString);
        } else {
            j10 = 0;
        }
        long j11 = this.mBytesUploaded.get();
        int i6 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i6 > 0) {
            this.mException = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        } else if (i6 < 0) {
            try {
                long j12 = j10 - j11;
                if (this.mStreamBuffer.advance((int) j12) != j12) {
                    this.mException = new IOException("Unexpected end of stream encountered.");
                    return false;
                } else if (!this.mBytesUploaded.compareAndSet(j11, j10)) {
                    Log.e(TAG, "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.mException = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                } else {
                    return true;
                }
            } catch (IOException e10) {
                Log.e(TAG, "Unable to recover position in Stream during resumable upload", e10);
                this.mException = e10;
                return false;
            }
        } else {
            return true;
        }
    }

    private boolean send(NetworkRequest networkRequest) {
        String currentAuthToken = Util.getCurrentAuthToken(this.mAuthProvider);
        String currentAppCheckToken = Util.getCurrentAppCheckToken(this.mAppCheckProvider);
        sc.e app = this.mStorageRef.getApp();
        app.b();
        networkRequest.performRequest(currentAuthToken, currentAppCheckToken, app.f31432a);
        return processResultValid(networkRequest);
    }

    private boolean sendWithRetry(NetworkRequest networkRequest) {
        this.mSender.sendWithExponentialBackoff(networkRequest);
        return processResultValid(networkRequest);
    }

    private boolean serverStateValid() {
        if (RESUMABLE_FINAL_STATUS.equals(this.mServerStatus)) {
            if (this.mException == null) {
                this.mException = new IOException("The server has terminated the upload session", this.mServerException);
            }
            tryChangeState(64, false);
            return false;
        }
        return true;
    }

    private boolean shouldContinue() {
        boolean z10;
        if (getInternalState() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.mException = new InterruptedException();
            tryChangeState(64, false);
            return false;
        } else if (getInternalState() == 32) {
            tryChangeState(256, false);
            return false;
        } else if (getInternalState() == 8) {
            tryChangeState(16, false);
            return false;
        } else if (!serverStateValid()) {
            return false;
        } else {
            if (this.mUploadUri == null) {
                if (this.mException == null) {
                    this.mException = new IllegalStateException("Unable to obtain an upload URL.");
                }
                tryChangeState(64, false);
                return false;
            } else if (this.mException != null) {
                tryChangeState(64, false);
                return false;
            } else {
                if (this.mServerException == null && this.mResultCode >= 200 && this.mResultCode < 300) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ((b0) clock).getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() + this.maxSleepTime;
                ((b0) clock).getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + this.sleepTime;
                if (z10) {
                    if (elapsedRealtime2 <= elapsedRealtime && recoverStatus(true)) {
                        this.sleepTime = Math.max(this.sleepTime * 2, 1000);
                    } else {
                        if (serverStateValid()) {
                            tryChangeState(64, false);
                        }
                        return false;
                    }
                }
                return true;
            }
        }
    }

    private void uploadChunk() {
        try {
            this.mStreamBuffer.fill(this.mCurrentChunkSize);
            int min = Math.min(this.mCurrentChunkSize, this.mStreamBuffer.available());
            ResumableUploadByteRequest resumableUploadByteRequest = new ResumableUploadByteRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mUploadUri, this.mStreamBuffer.get(), this.mBytesUploaded.get(), min, this.mStreamBuffer.isFinished());
            if (!delaySend(resumableUploadByteRequest)) {
                this.mCurrentChunkSize = PREFERRED_CHUNK_SIZE;
                Log.d(TAG, "Resetting chunk size to " + this.mCurrentChunkSize);
                return;
            }
            this.mBytesUploaded.getAndAdd(min);
            if (!this.mStreamBuffer.isFinished()) {
                this.mStreamBuffer.advance(min);
                int i6 = this.mCurrentChunkSize;
                if (i6 < MAXIMUM_CHUNK_SIZE) {
                    this.mCurrentChunkSize = i6 * 2;
                    Log.d(TAG, "Increasing chunk size to " + this.mCurrentChunkSize);
                    return;
                }
                return;
            }
            try {
                this.mMetadata = new StorageMetadata.Builder(resumableUploadByteRequest.getResultBody(), this.mStorageRef).build();
                tryChangeState(4, false);
                tryChangeState(128, false);
            } catch (JSONException e10) {
                Log.e(TAG, "Unable to parse resulting metadata from upload:" + resumableUploadByteRequest.getRawResult(), e10);
                this.mException = e10;
            }
        } catch (IOException e11) {
            Log.e(TAG, "Unable to read bytes for uploading", e11);
            this.mException = e11;
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    public StorageReference getStorage() {
        return this.mStorageRef;
    }

    public long getTotalByteCount() {
        return this.mTotalByteCount;
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onCanceled() {
        final ResumableUploadCancelRequest resumableUploadCancelRequest;
        this.mSender.cancel();
        if (this.mUploadUri != null) {
            resumableUploadCancelRequest = new ResumableUploadCancelRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mUploadUri);
        } else {
            resumableUploadCancelRequest = null;
        }
        if (resumableUploadCancelRequest != null) {
            StorageTaskScheduler.getInstance().scheduleCommand(new Runnable() { // from class: com.google.firebase.storage.UploadTask.1
                @Override // java.lang.Runnable
                public void run() {
                    NetworkRequest networkRequest = resumableUploadCancelRequest;
                    String currentAuthToken = Util.getCurrentAuthToken(UploadTask.this.mAuthProvider);
                    String currentAppCheckToken = Util.getCurrentAppCheckToken(UploadTask.this.mAppCheckProvider);
                    sc.e app = UploadTask.this.mStorageRef.getApp();
                    app.b();
                    networkRequest.performRequest(currentAuthToken, currentAppCheckToken, app.f31432a);
                }
            });
        }
        this.mException = StorageException.fromErrorStatus(Status.D);
        super.onCanceled();
    }

    @Override // com.google.firebase.storage.StorageTask
    public void resetState() {
        this.mException = null;
        this.mServerException = null;
        this.mResultCode = 0;
        this.mServerStatus = null;
    }

    @Override // com.google.firebase.storage.StorageTask
    public void run() {
        this.mSender.reset();
        if (!tryChangeState(4, false)) {
            Log.d(TAG, "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.mStorageRef.getParent() == null) {
            this.mException = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.mException != null) {
            return;
        }
        if (this.mUploadUri == null) {
            beginResumableUpload();
        } else {
            recoverStatus(false);
        }
        boolean shouldContinue = shouldContinue();
        while (shouldContinue) {
            uploadChunk();
            shouldContinue = shouldContinue();
            if (shouldContinue) {
                tryChangeState(4, false);
            }
        }
        if (this.mIsStreamOwned && getInternalState() != 16) {
            try {
                this.mStreamBuffer.close();
            } catch (IOException e10) {
                Log.e(TAG, "Unable to close stream.", e10);
            }
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    public void schedule() {
        StorageTaskScheduler.getInstance().scheduleUpload(getRunnable());
    }

    @Override // com.google.firebase.storage.StorageTask
    public TaskSnapshot snapStateImpl() {
        return new TaskSnapshot(StorageException.fromExceptionAndHttpCode(this.mException != null ? this.mException : this.mServerException, this.mResultCode), this.mBytesUploaded.get(), this.mUploadUri, this.mMetadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, Uri uri, Uri uri2) {
        long j10;
        ContentResolver contentResolver;
        long j11;
        int available;
        ParcelFileDescriptor openFileDescriptor;
        this.mBytesUploaded = new AtomicLong(0L);
        this.mCurrentChunkSize = PREFERRED_CHUNK_SIZE;
        InputStream inputStream = null;
        this.mUploadUri = null;
        this.mException = null;
        this.mServerException = null;
        this.mResultCode = 0;
        this.sleepTime = 0;
        this.minimumSleepInterval = 1000;
        o.h(storageReference);
        o.h(uri);
        FirebaseStorage storage = storageReference.getStorage();
        this.mStorageRef = storageReference;
        this.mMetadata = storageMetadata;
        gd.b authProvider = storage.getAuthProvider();
        this.mAuthProvider = authProvider;
        cd.b appCheckProvider = storage.getAppCheckProvider();
        this.mAppCheckProvider = appCheckProvider;
        this.mUri = uri;
        this.maxSleepTime = storage.getMaxChunkUploadRetry();
        sc.e app = storageReference.getApp();
        app.b();
        long j12 = app.f31432a;
        this.mSender = new ExponentialBackoffSender(j12, authProvider, appCheckProvider, storage.getMaxUploadRetryTimeMillis());
        long j13 = -1;
        try {
            try {
                sc.e app2 = storageReference.getStorage().getApp();
                app2.b();
                contentResolver = app2.f31432a.getContentResolver();
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                } catch (IOException e10) {
                    e = e10;
                    j11 = -1;
                } catch (NullPointerException e11) {
                    e = e11;
                }
            } catch (FileNotFoundException e12) {
                e = e12;
                Log.e(TAG, "could not locate file for uploading:" + this.mUri.toString());
                this.mException = e;
                j10 = j12;
                this.mTotalByteCount = j10;
                this.mStreamBuffer = new AdaptiveStreamBuffer(inputStream, PREFERRED_CHUNK_SIZE);
                this.mIsStreamOwned = true;
                this.mUploadUri = uri2;
            }
        } catch (FileNotFoundException e13) {
            e = e13;
            j12 = j13;
            Log.e(TAG, "could not locate file for uploading:" + this.mUri.toString());
            this.mException = e;
            j10 = j12;
            this.mTotalByteCount = j10;
            this.mStreamBuffer = new AdaptiveStreamBuffer(inputStream, PREFERRED_CHUNK_SIZE);
            this.mIsStreamOwned = true;
            this.mUploadUri = uri2;
        }
        if (openFileDescriptor != null) {
            j11 = openFileDescriptor.getStatSize();
            try {
                openFileDescriptor.close();
                j12 = j11;
            } catch (IOException e14) {
                e = e14;
                Log.w(TAG, "could not retrieve file size for upload " + this.mUri.toString(), e);
                j12 = j11;
                inputStream = contentResolver.openInputStream(this.mUri);
                j10 = j12;
                if (inputStream != null) {
                }
                this.mTotalByteCount = j10;
                this.mStreamBuffer = new AdaptiveStreamBuffer(inputStream, PREFERRED_CHUNK_SIZE);
                this.mIsStreamOwned = true;
                this.mUploadUri = uri2;
            } catch (NullPointerException e15) {
                e = e15;
                Log.w(TAG, "NullPointerException during file size calculation.", e);
                j12 = -1;
                inputStream = contentResolver.openInputStream(this.mUri);
                j10 = j12;
                if (inputStream != null) {
                }
                this.mTotalByteCount = j10;
                this.mStreamBuffer = new AdaptiveStreamBuffer(inputStream, PREFERRED_CHUNK_SIZE);
                this.mIsStreamOwned = true;
                this.mUploadUri = uri2;
            }
            inputStream = contentResolver.openInputStream(this.mUri);
            j10 = j12;
            if (inputStream != null) {
                if (j12 == -1) {
                    try {
                        available = inputStream.available();
                    } catch (IOException unused) {
                    }
                    if (available >= 0) {
                        j13 = available;
                        inputStream = new BufferedInputStream(inputStream);
                        j10 = j13;
                    }
                }
                j13 = j12;
                inputStream = new BufferedInputStream(inputStream);
                j10 = j13;
            }
            this.mTotalByteCount = j10;
            this.mStreamBuffer = new AdaptiveStreamBuffer(inputStream, PREFERRED_CHUNK_SIZE);
            this.mIsStreamOwned = true;
            this.mUploadUri = uri2;
        }
        j12 = -1;
        inputStream = contentResolver.openInputStream(this.mUri);
        j10 = j12;
        if (inputStream != null) {
        }
        this.mTotalByteCount = j10;
        this.mStreamBuffer = new AdaptiveStreamBuffer(inputStream, PREFERRED_CHUNK_SIZE);
        this.mIsStreamOwned = true;
        this.mUploadUri = uri2;
    }

    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, InputStream inputStream) {
        this.mBytesUploaded = new AtomicLong(0L);
        this.mCurrentChunkSize = PREFERRED_CHUNK_SIZE;
        this.mUploadUri = null;
        this.mException = null;
        this.mServerException = null;
        this.mResultCode = 0;
        this.sleepTime = 0;
        this.minimumSleepInterval = 1000;
        o.h(storageReference);
        o.h(inputStream);
        FirebaseStorage storage = storageReference.getStorage();
        this.mTotalByteCount = -1L;
        this.mStorageRef = storageReference;
        this.mMetadata = storageMetadata;
        gd.b authProvider = storage.getAuthProvider();
        this.mAuthProvider = authProvider;
        cd.b appCheckProvider = storage.getAppCheckProvider();
        this.mAppCheckProvider = appCheckProvider;
        this.mStreamBuffer = new AdaptiveStreamBuffer(inputStream, PREFERRED_CHUNK_SIZE);
        this.mIsStreamOwned = false;
        this.mUri = null;
        this.maxSleepTime = storage.getMaxChunkUploadRetry();
        sc.e app = storageReference.getApp();
        app.b();
        this.mSender = new ExponentialBackoffSender(app.f31432a, authProvider, appCheckProvider, storage.getMaxUploadRetryTimeMillis());
    }
}
