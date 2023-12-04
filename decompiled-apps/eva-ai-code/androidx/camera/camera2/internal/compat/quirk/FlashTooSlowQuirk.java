package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class FlashTooSlowQuirk implements UseTorchAsFlashQuirk {
    private static final List<String> AFFECTED_MODELS = Arrays.asList("PIXEL 3A", "PIXEL 3A XL");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return AFFECTED_MODELS.contains(Build.MODEL.toUpperCase(Locale.US)) && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
