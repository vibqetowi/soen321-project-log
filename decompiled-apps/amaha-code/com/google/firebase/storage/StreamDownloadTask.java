package com.google.firebase.storage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.network.GetNetworkRequest;
import com.google.firebase.storage.network.NetworkRequest;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import v9.o;
/* loaded from: classes.dex */
public class StreamDownloadTask extends StorageTask<TaskSnapshot> {
    static final long PREFERRED_CHUNK_SIZE = 262144;
    private static final String TAG = "StreamDownloadTask";
    private long bytesDownloaded;
    private long bytesDownloadedSnapped;
    private String eTagVerification;
    private InputStream inputStream;
    private StreamProcessor processor;
    private NetworkRequest request;
    private ExponentialBackoffSender sender;
    private StorageReference storageRef;
    private volatile Exception exception = null;
    private volatile int resultCode = 0;
    private long totalBytes = -1;

    /* loaded from: classes.dex */
    public interface StreamProcessor {
        void doInBackground(TaskSnapshot taskSnapshot, InputStream inputStream);
    }

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

        public InputStream getStream() {
            return StreamDownloadTask.this.inputStream;
        }

        public long getTotalByteCount() {
            return StreamDownloadTask.this.getTotalBytes();
        }
    }

    public StreamDownloadTask(StorageReference storageReference) {
        this.storageRef = storageReference;
        FirebaseStorage storage = storageReference.getStorage();
        sc.e app = storage.getApp();
        app.b();
        this.sender = new ExponentialBackoffSender(app.f31432a, storage.getAuthProvider(), storage.getAppCheckProvider(), storage.getMaxDownloadRetryTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream createDownloadStream() {
        Exception exc;
        String str;
        this.sender.reset();
        NetworkRequest networkRequest = this.request;
        if (networkRequest != null) {
            networkRequest.performRequestEnd();
        }
        GetNetworkRequest getNetworkRequest = new GetNetworkRequest(this.storageRef.getStorageReferenceUri(), this.storageRef.getApp(), this.bytesDownloaded);
        this.request = getNetworkRequest;
        boolean z10 = false;
        this.sender.sendWithExponentialBackoff(getNetworkRequest, false);
        this.resultCode = this.request.getResultCode();
        if (this.request.getException() != null) {
            exc = this.request.getException();
        } else {
            exc = this.exception;
        }
        this.exception = exc;
        if (isValidHttpResponseCode(this.resultCode) && this.exception == null && getInternalState() == 4) {
            z10 = true;
        }
        if (z10) {
            String resultString = this.request.getResultString("ETag");
            if (!TextUtils.isEmpty(resultString) && (str = this.eTagVerification) != null && !str.equals(resultString)) {
                this.resultCode = 409;
                throw new IOException("The ETag on the server changed.");
            }
            this.eTagVerification = resultString;
            this.totalBytes = this.request.getResultingContentLength() + this.bytesDownloaded;
            return this.request.getStream();
        }
        throw new IOException("Could not open resulting stream.");
    }

    private boolean isValidHttpResponseCode(int i6) {
        if (i6 != 308 && (i6 < 200 || i6 >= 300)) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.storage.StorageTask
    public StorageReference getStorage() {
        return this.storageRef;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onCanceled() {
        this.sender.cancel();
        this.exception = StorageException.fromErrorStatus(Status.D);
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onProgress() {
        this.bytesDownloadedSnapped = this.bytesDownloaded;
    }

    @Override // com.google.firebase.storage.StorageTask, com.google.firebase.storage.ControllableTask
    public boolean pause() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    public void recordDownloadedBytes(long j10) {
        long j11 = this.bytesDownloaded + j10;
        this.bytesDownloaded = j11;
        if (this.bytesDownloadedSnapped + PREFERRED_CHUNK_SIZE <= j11) {
            if (getInternalState() == 4) {
                tryChangeState(4, false);
            } else {
                this.bytesDownloadedSnapped = this.bytesDownloaded;
            }
        }
    }

    @Override // com.google.firebase.storage.StorageTask, com.google.firebase.storage.ControllableTask
    public boolean resume() {
        throw new UnsupportedOperationException("this operation is not supported on StreamDownloadTask.");
    }

    @Override // com.google.firebase.storage.StorageTask
    public void run() {
        boolean z10;
        int i6 = 64;
        if (this.exception != null) {
            tryChangeState(64, false);
        } else if (!tryChangeState(4, false)) {
        } else {
            StreamProgressWrapper streamProgressWrapper = new StreamProgressWrapper(new Callable<InputStream>() { // from class: com.google.firebase.storage.StreamDownloadTask.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public InputStream call() {
                    return StreamDownloadTask.this.createDownloadStream();
                }
            }, this);
            this.inputStream = new BufferedInputStream(streamProgressWrapper);
            try {
                streamProgressWrapper.ensureStream();
                StreamProcessor streamProcessor = this.processor;
                if (streamProcessor != null) {
                    try {
                        streamProcessor.doInBackground(snapState(), this.inputStream);
                    } catch (Exception e10) {
                        Log.w(TAG, "Exception occurred calling doInBackground.", e10);
                        this.exception = e10;
                    }
                }
            } catch (IOException e11) {
                Log.d(TAG, "Initial opening of Stream failed", e11);
                this.exception = e11;
            }
            if (this.inputStream == null) {
                this.request.performRequestEnd();
                this.request = null;
            }
            if (this.exception == null && getInternalState() == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                tryChangeState(4, false);
                tryChangeState(128, false);
                return;
            }
            if (getInternalState() == 32) {
                i6 = 256;
            }
            if (!tryChangeState(i6, false)) {
                Log.w(TAG, "Unable to change download task to final state from " + getInternalState());
            }
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    public void schedule() {
        StorageTaskScheduler.getInstance().scheduleDownload(getRunnable());
    }

    public StreamDownloadTask setStreamProcessor(StreamProcessor streamProcessor) {
        boolean z10;
        o.h(streamProcessor);
        if (this.processor == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.processor = streamProcessor;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.firebase.storage.StorageTask
    public TaskSnapshot snapStateImpl() {
        return new TaskSnapshot(StorageException.fromExceptionAndHttpCode(this.exception, this.resultCode), this.bytesDownloadedSnapped);
    }

    /* loaded from: classes.dex */
    public static class StreamProgressWrapper extends InputStream {
        private long mDownloadedBytes;
        private Callable<InputStream> mInputStreamCallable;
        private long mLastExceptionPosition;
        private StreamDownloadTask mParentTask;
        private boolean mStreamClosed;
        private IOException mTemporaryException;
        private InputStream mWrappedStream;

        public StreamProgressWrapper(Callable<InputStream> callable, StreamDownloadTask streamDownloadTask) {
            this.mParentTask = streamDownloadTask;
            this.mInputStreamCallable = callable;
        }

        private void checkCancel() {
            StreamDownloadTask streamDownloadTask = this.mParentTask;
            if (streamDownloadTask != null && streamDownloadTask.getInternalState() == 32) {
                throw new CancelException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean ensureStream() {
            checkCancel();
            if (this.mTemporaryException != null) {
                try {
                    InputStream inputStream = this.mWrappedStream;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException unused) {
                }
                this.mWrappedStream = null;
                if (this.mLastExceptionPosition == this.mDownloadedBytes) {
                    Log.i(StreamDownloadTask.TAG, "Encountered exception during stream operation. Aborting.", this.mTemporaryException);
                    return false;
                }
                Log.i(StreamDownloadTask.TAG, "Encountered exception during stream operation. Retrying at " + this.mDownloadedBytes, this.mTemporaryException);
                this.mLastExceptionPosition = this.mDownloadedBytes;
                this.mTemporaryException = null;
            }
            if (!this.mStreamClosed) {
                if (this.mWrappedStream == null) {
                    try {
                        this.mWrappedStream = this.mInputStreamCallable.call();
                        return true;
                    } catch (Exception e10) {
                        if (e10 instanceof IOException) {
                            throw ((IOException) e10);
                        }
                        throw new IOException("Unable to open stream", e10);
                    }
                }
                return true;
            }
            throw new IOException("Can't perform operation on closed stream");
        }

        private void recordDownloadedBytes(long j10) {
            StreamDownloadTask streamDownloadTask = this.mParentTask;
            if (streamDownloadTask != null) {
                streamDownloadTask.recordDownloadedBytes(j10);
            }
            this.mDownloadedBytes += j10;
        }

        @Override // java.io.InputStream
        public int available() {
            while (ensureStream()) {
                try {
                    return this.mWrappedStream.available();
                } catch (IOException e10) {
                    this.mTemporaryException = e10;
                }
            }
            throw this.mTemporaryException;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            InputStream inputStream = this.mWrappedStream;
            if (inputStream != null) {
                inputStream.close();
            }
            this.mStreamClosed = true;
            StreamDownloadTask streamDownloadTask = this.mParentTask;
            if (streamDownloadTask != null && streamDownloadTask.request != null) {
                this.mParentTask.request.performRequestEnd();
                this.mParentTask.request = null;
            }
            checkCancel();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read() {
            while (ensureStream()) {
                try {
                    int read = this.mWrappedStream.read();
                    if (read != -1) {
                        recordDownloadedBytes(1L);
                    }
                    return read;
                } catch (IOException e10) {
                    this.mTemporaryException = e10;
                }
            }
            throw this.mTemporaryException;
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            long j11 = 0;
            while (ensureStream()) {
                while (j10 > StreamDownloadTask.PREFERRED_CHUNK_SIZE) {
                    try {
                        long skip = this.mWrappedStream.skip(StreamDownloadTask.PREFERRED_CHUNK_SIZE);
                        if (skip < 0) {
                            if (j11 == 0) {
                                return -1L;
                            }
                            return j11;
                        }
                        j11 += skip;
                        j10 -= skip;
                        recordDownloadedBytes(skip);
                        checkCancel();
                    } catch (IOException e10) {
                        this.mTemporaryException = e10;
                    }
                }
                if (j10 > 0) {
                    long skip2 = this.mWrappedStream.skip(j10);
                    if (skip2 < 0) {
                        if (j11 == 0) {
                            return -1L;
                        }
                        return j11;
                    }
                    j11 += skip2;
                    j10 -= skip2;
                    recordDownloadedBytes(skip2);
                }
                if (j10 == 0) {
                    return j11;
                }
            }
            throw this.mTemporaryException;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i10) {
            int i11 = 0;
            while (ensureStream()) {
                while (i10 > StreamDownloadTask.PREFERRED_CHUNK_SIZE) {
                    try {
                        int read = this.mWrappedStream.read(bArr, i6, 262144);
                        if (read == -1) {
                            if (i11 == 0) {
                                return -1;
                            }
                            return i11;
                        }
                        i11 += read;
                        i6 += read;
                        i10 -= read;
                        recordDownloadedBytes(read);
                        checkCancel();
                    } catch (IOException e10) {
                        this.mTemporaryException = e10;
                    }
                }
                if (i10 > 0) {
                    int read2 = this.mWrappedStream.read(bArr, i6, i10);
                    if (read2 == -1) {
                        if (i11 == 0) {
                            return -1;
                        }
                        return i11;
                    }
                    i6 += read2;
                    i11 += read2;
                    i10 -= read2;
                    recordDownloadedBytes(read2);
                }
                if (i10 == 0) {
                    return i11;
                }
            }
            throw this.mTemporaryException;
        }

        @Override // java.io.InputStream
        public void mark(int i6) {
        }
    }
}
