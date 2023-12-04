package androidx.camera.video;

import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.core.util.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class Recording implements AutoCloseable {
    private final CloseGuardHelper mCloseGuard;
    private final AtomicBoolean mIsStopped;
    private final OutputOptions mOutputOptions;
    private final Recorder mRecorder;
    private final long mRecordingId;

    Recording(Recorder recorder, long j, OutputOptions outputOptions, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsStopped = atomicBoolean;
        CloseGuardHelper create = CloseGuardHelper.create();
        this.mCloseGuard = create;
        this.mRecorder = recorder;
        this.mRecordingId = j;
        this.mOutputOptions = outputOptions;
        if (z) {
            atomicBoolean.set(true);
        } else {
            create.open("stop");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Recording from(PendingRecording pendingRecording, long j) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j, pendingRecording.getOutputOptions(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Recording createFinalizedFrom(PendingRecording pendingRecording, long j) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j, pendingRecording.getOutputOptions(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OutputOptions getOutputOptions() {
        return this.mOutputOptions;
    }

    public void pause() {
        if (this.mIsStopped.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.pause(this);
    }

    public void resume() {
        if (this.mIsStopped.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.resume(this);
    }

    public void stop() {
        this.mCloseGuard.close();
        if (this.mIsStopped.getAndSet(true)) {
            return;
        }
        this.mRecorder.stop(this);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        stop();
    }

    protected void finalize() throws Throwable {
        try {
            this.mCloseGuard.warnIfOpen();
            stop();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getRecordingId() {
        return this.mRecordingId;
    }
}
