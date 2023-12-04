package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class PreviewPixelHDRnetQuirk implements Quirk {
    private static final List<String> SUPPORTED_DEVICES = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return "Google".equals(Build.MANUFACTURER) && SUPPORTED_DEVICES.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
