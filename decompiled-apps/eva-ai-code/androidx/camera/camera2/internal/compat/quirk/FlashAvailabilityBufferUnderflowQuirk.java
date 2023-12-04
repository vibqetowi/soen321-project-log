package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements Quirk {
    private static final Set<Pair<String, String>> KNOWN_AFFECTED_MODELS = new HashSet(Arrays.asList(new Pair("sprd", "lemp")));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return KNOWN_AFFECTED_MODELS.contains(new Pair(Build.MANUFACTURER.toLowerCase(Locale.US), Build.MODEL.toLowerCase(Locale.US)));
    }
}
