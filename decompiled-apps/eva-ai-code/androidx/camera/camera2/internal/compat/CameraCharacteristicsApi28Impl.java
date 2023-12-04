package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CameraCharacteristicsApi28Impl extends CameraCharacteristicsBaseImpl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraCharacteristicsApi28Impl(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public Set<String> getPhysicalCameraIds() {
        return this.mCameraCharacteristics.getPhysicalCameraIds();
    }
}
