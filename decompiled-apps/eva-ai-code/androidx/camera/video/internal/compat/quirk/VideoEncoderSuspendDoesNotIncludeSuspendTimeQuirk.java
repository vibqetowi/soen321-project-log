package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
/* loaded from: classes.dex */
public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements Quirk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 29;
    }
}
