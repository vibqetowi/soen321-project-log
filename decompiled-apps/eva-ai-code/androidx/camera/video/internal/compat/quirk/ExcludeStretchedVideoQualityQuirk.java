package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.video.Quality;
/* loaded from: classes.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return isSamsungJ4();
    }

    private static boolean isSamsungJ4() {
        return "Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(Quality quality) {
        if (isSamsungJ4()) {
            return quality == Quality.FHD || quality == Quality.UHD;
        }
        return false;
    }
}
