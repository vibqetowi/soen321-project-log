package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.video.Quality;
/* loaded from: classes.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean load() {
        return isHuaweiMate20() || isHuaweiMate20Pro();
    }

    private static boolean isHuaweiMate20() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean isHuaweiMate20Pro() {
        return "Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL);
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(Quality quality) {
        return quality == Quality.UHD;
    }
}
