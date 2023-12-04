package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
/* loaded from: classes.dex */
final class AutoValue_Camera2CameraImpl_UseCaseInfo extends Camera2CameraImpl.UseCaseInfo {
    private final SessionConfig sessionConfig;
    private final Size surfaceResolution;
    private final String useCaseId;
    private final Class<?> useCaseType;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Camera2CameraImpl_UseCaseInfo(String str, Class<?> cls, SessionConfig sessionConfig, Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.useCaseId = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.useCaseType = cls;
        if (sessionConfig == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.sessionConfig = sessionConfig;
        this.surfaceResolution = size;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    String getUseCaseId() {
        return this.useCaseId;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    Class<?> getUseCaseType() {
        return this.useCaseType;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    SessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    Size getSurfaceResolution() {
        return this.surfaceResolution;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.useCaseId + ", useCaseType=" + this.useCaseType + ", sessionConfig=" + this.sessionConfig + ", surfaceResolution=" + this.surfaceResolution + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Camera2CameraImpl.UseCaseInfo) {
            Camera2CameraImpl.UseCaseInfo useCaseInfo = (Camera2CameraImpl.UseCaseInfo) obj;
            if (this.useCaseId.equals(useCaseInfo.getUseCaseId()) && this.useCaseType.equals(useCaseInfo.getUseCaseType()) && this.sessionConfig.equals(useCaseInfo.getSessionConfig())) {
                Size size = this.surfaceResolution;
                if (size == null) {
                    if (useCaseInfo.getSurfaceResolution() == null) {
                        return true;
                    }
                } else if (size.equals(useCaseInfo.getSurfaceResolution())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.useCaseId.hashCode() ^ 1000003) * 1000003) ^ this.useCaseType.hashCode()) * 1000003) ^ this.sessionConfig.hashCode()) * 1000003;
        Size size = this.surfaceResolution;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }
}
