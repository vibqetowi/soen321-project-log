package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Locale;
/* loaded from: classes.dex */
public class StillCaptureFlashStopRepeatingQuirk implements Quirk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return "SAMSUNG".equals(Build.MANUFACTURER.toUpperCase(Locale.US)) && Build.MODEL.toUpperCase(Locale.US).startsWith("SM-A716");
    }
}
