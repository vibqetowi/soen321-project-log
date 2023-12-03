package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetNetworkRequest;
import com.google.firebase.storage.network.NetworkRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class FileDownloadTask extends StorageTask<TaskSnapshot> {
    static final int PREFERRED_CHUNK_SIZE = 262144;
    private static final String TAG = "FileDownloadTask";
    private long mBytesDownloaded;
    private final Uri mDestinationFile;
    private int mResultCode;
    private ExponentialBackoffSender mSender;
    private StorageReference mStorageRef;
    private long mTotalBytes = -1;
    private String mETagVerification = null;
    private volatile Exception mException = null;
    private long mResumeOffset = 0;

    /* loaded from: classes.dex */
    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {
        private final long mBytesDownloaded;

        public TaskSnapshot(Exception exc, long j10) {
            super(exc);
            this.mBytesDownloaded = j10;
        }

        public long getBytesTransferred() {
            return this.mBytesDownloaded;
        }

        public long getTotalByteCount() {
            return FileDownloadTask.this.getTotalBytes();
        }
    }

    public FileDownloadTask(StorageReference storageReference, Uri uri) {
        this.mStorageRef = storageReference;
        this.mDestinationFile = uri;
        FirebaseStorage storage = storageReference.getStorage();
        sc.e app = storage.getApp();
        app.b();
        this.mSender = new ExponentialBackoffSender(app.f31432a, storage.getAuthProvider(), storage.getAppCheckProvider(), storage.getMaxDownloadRetryTimeMillis());
    }

    private int fillBuffer(InputStream inputStream, byte[] bArr) {
        int read;
        int i6 = 0;
        boolean z10 = false;
        while (i6 != bArr.length && (read = inputStream.read(bArr, i6, bArr.length - i6)) != -1) {
            try {
                i6 += read;
                z10 = true;
            } catch (IOException e10) {
                this.mException = e10;
            }
        }
        if (!z10) {
            return -1;
        }
        return i6;
    }

    private boolean isValidHttpResponseCode(int i6) {
        if (i6 != 308 && (i6 < 200 || i6 >= 300)) {
            return false;
        }
        return true;
    }

    private boolean processResponse(NetworkRequest networkRequest) {
        FileOutputStream fileOutputStream;
        InputStream stream = networkRequest.getStream();
        if (stream != null) {
            File file = new File(this.mDestinationFile.getPath());
            if (!file.exists()) {
                if (this.mResumeOffset <= 0) {
                    if (!file.createNewFile()) {
                        Log.w(TAG, "unable to create file:" + file.getAbsolutePath());
                    }
                } else {
                    throw new IOException("The file to download to has been deleted.");
                }
            }
            boolean z10 = true;
            if (this.mResumeOffset > 0) {
                Log.d(TAG, "Resuming download file " + file.getAbsolutePath() + " at " + this.mResumeOffset);
                fileOutputStream = new FileOutputStream(file, true);
            } else {
                fileOutputStream = new FileOutputStream(file);
            }
            try {
                byte[] bArr = new byte[PREFERRED_CHUNK_SIZE];
                while (z10) {
                    int fillBuffer = fillBuffer(stream, bArr);
                    if (fillBuffer == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, fillBuffer);
                    this.mBytesDownloaded += fillBuffer;
                    if (this.mException != null) {
                        Log.d(TAG, "Exception occurred during file download. Retrying.", this.mException);
                        this.mException = null;
                        z10 = false;
                    }
                    if (!tryChangeState(4, false)) {
                        z10 = false;
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                stream.close();
                return z10;
            } catch (Throwable th2) {
                fileOutputStream.flush();
                fileOutputStream.close();
                stream.close();
                throw th2;
            }
        }
        this.mException = new IllegalStateException("Unable to open Firebase Storage stream.");
        return false;
    }

    public long getDownloadedSizeInBytes() {
        return this.mBytesDownloaded;
    }

    @Override // com.google.firebase.storage.StorageTask
    public StorageReference getStorage() {
        return this.mStorageRef;
    }

    public long getTotalBytes() {
        return this.mTotalBytes;
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onCanceled() {
        this.mSender.cancel();
        this.mException = StorageException.fromErrorStatus(Status.D);
    }

    @Override // com.google.firebase.storage.StorageTask
    public void run() {
        Exception exc;
        boolean z10;
        String str;
        if (this.mException != null) {
            tryChangeState(64, false);
        } else if (!tryChangeState(4, false)) {
        } else {
            do {
                this.mBytesDownloaded = 0L;
                this.mException = null;
                this.mSender.reset();
                GetNetworkRequest getNetworkRequest = new GetNetworkRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mResumeOffset);
                this.mSender.sendWithExponentialBackoff(getNetworkRequest, false);
                this.mResultCode = getNetworkRequest.getResultCode();
                if (getNetworkRequest.getException() != null) {
                    exc = getNetworkRequest.getException();
                } else {
                    exc = this.mException;
                }
                this.mException = exc;
                boolean z11 = true;
                if (isValidHttpResponseCode(this.mResultCode) && this.mException == null && getInternalState() == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.mTotalBytes = getNetworkRequest.getResultingContentLength() + this.mResumeOffset;
                    String resultString = getNetworkRequest.getResultString("ETag");
                    if (!TextUtils.isEmpty(resultString) && (str = this.mETagVerification) != null && !str.equals(resultString)) {
                        Log.w(TAG, "The file at the server has changed.  Restarting from the beginning.");
                        this.mResumeOffset = 0L;
                        this.mETagVerification = null;
                        getNetworkRequest.performRequestEnd();
                        schedule();
                        return;
                    }
                    this.mETagVerification = resultString;
                    try {
                        z10 = processResponse(getNetworkRequest);
                    } catch (IOException e10) {
                        Log.e(TAG, "Exception occurred during file write.  Aborting.", e10);
                        this.mException = e10;
                    }
                }
                getNetworkRequest.performRequestEnd();
                if ((z10 && this.mException == null && getInternalState() == 4) ? false : false) {
                    tryChangeState(128, false);
                    return;
                }
                File file = new File(this.mDestinationFile.getPath());
                if (file.exists()) {
                    this.mResumeOffset = file.length();
                } else {
                    this.mResumeOffset = 0L;
                }
                if (getInternalState() == 8) {
                    tryChangeState(16, false);
                    return;
                } else if (getInternalState() == 32) {
                    if (!tryChangeState(256, false)) {
                        Log.w(TAG, "Unable to change download task to final state from " + getInternalState());
                        return;
                    }
                    return;
                }
            } while (this.mBytesDownloaded > 0);
            tryChangeState(64, false);
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    public void schedule() {
        StorageTaskScheduler.getInstance().scheduleDownload(getRunnable());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.firebase.storage.StorageTask
    public TaskSnapshot snapStateImpl() {
        return new TaskSnapshot(StorageException.fromExceptionAndHttpCode(this.mException, this.mResultCode), this.mBytesDownloaded + this.mResumeOffset);
    }
}
