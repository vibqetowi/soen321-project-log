package aa;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class j {
    public static boolean a(int i6, Context context) {
        if (!b(context, "com.google.android.gms", i6)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            s9.i a10 = s9.i.a(context);
            a10.getClass();
            if (packageInfo == null) {
                return false;
            }
            if (!s9.i.d(packageInfo, false)) {
                if (!s9.i.d(packageInfo, true)) {
                    return false;
                }
                if (!s9.h.a(a10.f31346a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    public static boolean b(Context context, String str, int i6) {
        ca.b a10 = ca.c.a(context);
        a10.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f5222a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i6, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
