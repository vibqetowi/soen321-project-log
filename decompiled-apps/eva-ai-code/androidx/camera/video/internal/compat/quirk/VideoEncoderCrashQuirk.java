package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.video.Quality;
/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return isPositivoTwist2Pro();
    }

    private static boolean isPositivoTwist2Pro() {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(Quality quality) {
        return isPositivoTwist2Pro() && quality == Quality.SD;
    }
}
