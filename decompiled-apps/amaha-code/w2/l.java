package w2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.work.q;
/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f36305a = androidx.work.q.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        int i6;
        String str;
        String str2 = "enabled";
        String str3 = f36305a;
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i6 = 1;
            } else {
                i6 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i6, 1);
            androidx.work.q d10 = androidx.work.q.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            if (z10) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb2.append(str);
            d10.a(str3, sb2.toString());
        } catch (Exception e10) {
            androidx.work.q d11 = androidx.work.q.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            if (!z10) {
                str2 = "disabled";
            }
            sb3.append(str2);
            String sb4 = sb3.toString();
            if (((q.a) d11).f3335c <= 3) {
                Log.d(str3, sb4, e10);
            }
        }
    }
}
