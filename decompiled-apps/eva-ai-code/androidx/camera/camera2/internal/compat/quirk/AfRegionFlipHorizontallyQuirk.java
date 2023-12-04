package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.impl.Quirk;
/* loaded from: classes.dex */
public class AfRegionFlipHorizontallyQuirk implements Quirk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }
}
