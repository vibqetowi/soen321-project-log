package aa;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f441a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f442b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f443c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f444d;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        boolean z10;
        boolean z11;
        PackageManager packageManager = context.getPackageManager();
        if (f441a == null) {
            f441a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f441a.booleanValue()) {
            if (Build.VERSION.SDK_INT >= 24) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (f442b == null) {
            f442b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f442b.booleanValue()) {
            if (g.a()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                }
            }
            return true;
        }
        return false;
    }
}
