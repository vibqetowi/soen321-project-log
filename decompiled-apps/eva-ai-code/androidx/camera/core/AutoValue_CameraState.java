package androidx.camera.core;

import androidx.camera.core.CameraState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AutoValue_CameraState extends CameraState {
    private final CameraState.StateError error;
    private final CameraState.Type type;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CameraState(CameraState.Type type, CameraState.StateError stateError) {
        if (type == null) {
            throw new NullPointerException("Null type");
        }
        this.type = type;
        this.error = stateError;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.Type getType() {
        return this.type;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.StateError getError() {
        return this.error;
    }

    public String toString() {
        return "CameraState{type=" + this.type + ", error=" + this.error + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState) {
            CameraState cameraState = (CameraState) obj;
            if (this.type.equals(cameraState.getType())) {
                CameraState.StateError stateError = this.error;
                if (stateError == null) {
                    if (cameraState.getError() == null) {
                        return true;
                    }
                } else if (stateError.equals(cameraState.getError())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.error;
        return hashCode ^ (stateError == null ? 0 : stateError.hashCode());
    }
}
