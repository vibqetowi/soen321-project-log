package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements Quirk {
    private static final Set<String> BUILD_HARDWARE_SET = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && BUILD_HARDWARE_SET.contains(Build.HARDWARE.toLowerCase());
    }
}
