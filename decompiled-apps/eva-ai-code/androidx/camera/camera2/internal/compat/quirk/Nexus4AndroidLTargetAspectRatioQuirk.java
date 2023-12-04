package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class Nexus4AndroidLTargetAspectRatioQuirk implements Quirk {
    private static final List<String> DEVICE_MODELS = Arrays.asList("NEXUS 4");

    public int getCorrectedAspectRatio() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }
}
