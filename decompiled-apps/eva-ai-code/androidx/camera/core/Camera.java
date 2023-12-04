package androidx.camera.core;

import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public interface Camera {

    /* renamed from: androidx.camera.core.Camera$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static boolean $default$isUseCasesCombinationSupported(Camera _this, UseCase... useCaseArr) {
            return true;
        }
    }

    CameraControl getCameraControl();

    CameraInfo getCameraInfo();

    LinkedHashSet<CameraInternal> getCameraInternals();

    CameraConfig getExtendedConfig();

    boolean isUseCasesCombinationSupported(UseCase... useCaseArr);

    void setExtendedConfig(CameraConfig cameraConfig);
}
