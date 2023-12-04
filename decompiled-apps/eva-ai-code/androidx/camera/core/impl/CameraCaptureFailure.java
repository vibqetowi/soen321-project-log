package androidx.camera.core.impl;
/* loaded from: classes.dex */
public class CameraCaptureFailure {
    private final Reason mReason;

    /* loaded from: classes.dex */
    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(Reason reason) {
        this.mReason = reason;
    }

    public Reason getReason() {
        return this.mReason;
    }
}
