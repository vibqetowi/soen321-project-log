package androidx.biometric;

import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
class PackageUtils {
    private PackageUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasSystemFeatureFingerprint(Context context) {
        return (context == null || context.getPackageManager() == null || !Api23Impl.hasSystemFeatureFingerprint(context.getPackageManager())) ? false : true;
    }

    /* loaded from: classes.dex */
    private static class Api23Impl {
        private Api23Impl() {
        }

        static boolean hasSystemFeatureFingerprint(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }
}
