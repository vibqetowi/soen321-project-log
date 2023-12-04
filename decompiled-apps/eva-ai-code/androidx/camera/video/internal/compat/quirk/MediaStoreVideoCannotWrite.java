package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
/* loaded from: classes.dex */
public class MediaStoreVideoCannotWrite implements Quirk {
    public static boolean isPositivoTwist2Pro() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean isItelW6004() {
        return "itel".equalsIgnoreCase(Build.BRAND) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return isPositivoTwist2Pro() || isItelW6004();
    }
}
