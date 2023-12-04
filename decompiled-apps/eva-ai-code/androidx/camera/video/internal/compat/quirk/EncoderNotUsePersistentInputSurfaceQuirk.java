package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class EncoderNotUsePersistentInputSurfaceQuirk implements Quirk {
    private static final List<String> DEVICE_MODELS = Arrays.asList("SM-N9208", "SM-G920V");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return DEVICE_MODELS.contains(Build.MODEL.toUpperCase());
    }
}
