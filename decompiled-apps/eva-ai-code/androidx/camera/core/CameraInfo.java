package androidx.camera.core;

import androidx.lifecycle.LiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public interface CameraInfo {
    public static final String IMPLEMENTATION_TYPE_CAMERA2 = "androidx.camera.camera2";
    public static final String IMPLEMENTATION_TYPE_CAMERA2_LEGACY = "androidx.camera.camera2.legacy";
    public static final String IMPLEMENTATION_TYPE_FAKE = "androidx.camera.fake";
    public static final String IMPLEMENTATION_TYPE_UNKNOWN = "<unknown>";

    /* renamed from: androidx.camera.core.CameraInfo$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static boolean $default$isFocusMeteringSupported(CameraInfo _this, FocusMeteringAction focusMeteringAction) {
            return false;
        }

        public static boolean $default$isPrivateReprocessingSupported(CameraInfo _this) {
            return false;
        }

        public static boolean $default$isYuvReprocessingSupported(CameraInfo _this) {
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ImplementationType {
    }

    CameraSelector getCameraSelector();

    LiveData<CameraState> getCameraState();

    ExposureState getExposureState();

    String getImplementationType();

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i);

    LiveData<Integer> getTorchState();

    LiveData<ZoomState> getZoomState();

    boolean hasFlashUnit();

    boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction);

    boolean isPrivateReprocessingSupported();

    boolean isYuvReprocessingSupported();
}
