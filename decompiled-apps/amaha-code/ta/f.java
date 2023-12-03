package ta;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class f extends x3 {

    /* renamed from: v  reason: collision with root package name */
    public Boolean f32550v;

    /* renamed from: w  reason: collision with root package name */
    public e f32551w;

    /* renamed from: x  reason: collision with root package name */
    public Boolean f32552x;

    public f(y3 y3Var) {
        super(y3Var, 1);
        this.f32551w = sc.b.O;
    }

    public final String i(String str) {
        y3 y3Var = this.f32943u;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            v9.o.h(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.f32925z.c(e10, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            w2 w2Var2 = y3Var.C;
            y3.k(w2Var2);
            w2Var2.f32925z.c(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            w2 w2Var3 = y3Var.C;
            y3.k(w2Var3);
            w2Var3.f32925z.c(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            w2 w2Var4 = y3Var.C;
            y3.k(w2Var4);
            w2Var4.f32925z.c(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double j(String str, i2 i2Var) {
        if (str == null) {
            return ((Double) i2Var.a(null)).doubleValue();
        }
        String e10 = this.f32551w.e(str, i2Var.f32615a);
        if (TextUtils.isEmpty(e10)) {
            return ((Double) i2Var.a(null)).doubleValue();
        }
        try {
            return ((Double) i2Var.a(Double.valueOf(Double.parseDouble(e10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) i2Var.a(null)).doubleValue();
        }
    }

    public final int k() {
        k6 k6Var = this.f32943u.F;
        y3.i(k6Var);
        Boolean bool = k6Var.f32943u.t().f32731y;
        if (k6Var.h0() < 201500) {
            if (bool == null || bool.booleanValue()) {
                return 25;
            }
            return 100;
        }
        return 100;
    }

    public final int l(String str, i2 i2Var) {
        if (str == null) {
            return ((Integer) i2Var.a(null)).intValue();
        }
        String e10 = this.f32551w.e(str, i2Var.f32615a);
        if (TextUtils.isEmpty(e10)) {
            return ((Integer) i2Var.a(null)).intValue();
        }
        try {
            return ((Integer) i2Var.a(Integer.valueOf(Integer.parseInt(e10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) i2Var.a(null)).intValue();
        }
    }

    public final void m() {
        this.f32943u.getClass();
    }

    public final long n(String str, i2 i2Var) {
        if (str == null) {
            return ((Long) i2Var.a(null)).longValue();
        }
        String e10 = this.f32551w.e(str, i2Var.f32615a);
        if (TextUtils.isEmpty(e10)) {
            return ((Long) i2Var.a(null)).longValue();
        }
        try {
            return ((Long) i2Var.a(Long.valueOf(Long.parseLong(e10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) i2Var.a(null)).longValue();
        }
    }

    public final Bundle o() {
        y3 y3Var = this.f32943u;
        try {
            if (y3Var.f32953u.getPackageManager() == null) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.f32925z.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = ca.c.a(y3Var.f32953u).a(128, y3Var.f32953u.getPackageName());
            if (a10 == null) {
                w2 w2Var2 = y3Var.C;
                y3.k(w2Var2);
                w2Var2.f32925z.b("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a10.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            w2 w2Var3 = y3Var.C;
            y3.k(w2Var3);
            w2Var3.f32925z.c(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean p(String str) {
        v9.o.e(str);
        Bundle o10 = o();
        if (o10 == null) {
            w2 w2Var = this.f32943u.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!o10.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(o10.getBoolean(str));
        }
    }

    public final boolean q(String str, i2 i2Var) {
        if (str == null) {
            return ((Boolean) i2Var.a(null)).booleanValue();
        }
        String e10 = this.f32551w.e(str, i2Var.f32615a);
        if (TextUtils.isEmpty(e10)) {
            return ((Boolean) i2Var.a(null)).booleanValue();
        }
        return ((Boolean) i2Var.a(Boolean.valueOf("1".equals(e10)))).booleanValue();
    }

    public final boolean r() {
        Boolean p10 = p("google_analytics_automatic_screen_reporting_enabled");
        if (p10 != null && !p10.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean s() {
        this.f32943u.getClass();
        Boolean p10 = p("firebase_analytics_collection_deactivated");
        if (p10 != null && p10.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean t(String str) {
        return "1".equals(this.f32551w.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean u() {
        if (this.f32550v == null) {
            Boolean p10 = p("app_measurement_lite");
            this.f32550v = p10;
            if (p10 == null) {
                this.f32550v = Boolean.FALSE;
            }
        }
        if (!this.f32550v.booleanValue() && this.f32943u.f32957y) {
            return false;
        }
        return true;
    }
}
