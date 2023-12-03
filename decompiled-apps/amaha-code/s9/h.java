package s9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f31342b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f31343c = false;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f31341a = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f31344d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f31343c) {
                PackageInfo b10 = ca.c.a(context).b(64, "com.google.android.gms");
                i.a(context);
                if (b10 != null && !i.d(b10, false) && i.d(b10, true)) {
                    f31342b = true;
                } else {
                    f31342b = false;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f31343c = true;
        }
        if (!f31342b && "user".equals(Build.TYPE)) {
            return false;
        }
        return true;
    }

    public static boolean b(Context context) {
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if ("com.google.android.gms".equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
