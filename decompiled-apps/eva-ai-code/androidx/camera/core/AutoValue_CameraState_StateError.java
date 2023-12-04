package androidx.camera.core;

import androidx.camera.core.CameraState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CameraState_StateError extends CameraState.StateError {
    private final Throwable cause;
    private final int code;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CameraState_StateError(int i, Throwable th) {
        this.code = i;
        this.cause = th;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.code;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public Throwable getCause() {
        return this.cause;
    }

    public String toString() {
        return "StateError{code=" + this.code + ", cause=" + this.cause + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState.StateError) {
            CameraState.StateError stateError = (CameraState.StateError) obj;
            if (this.code == stateError.getCode()) {
                Throwable th = this.cause;
                if (th == null) {
                    if (stateError.getCause() == null) {
                        return true;
                    }
                } else if (th.equals(stateError.getCause())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = (this.code ^ 1000003) * 1000003;
        Throwable th = this.cause;
        return i ^ (th == null ? 0 : th.hashCode());
    }
}
