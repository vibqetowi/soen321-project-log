package bf;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
/* compiled from: DeviceCacheManager.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final df.a f4276c = df.a.d();

    /* renamed from: d  reason: collision with root package name */
    public static v f4277d;

    /* renamed from: a  reason: collision with root package name */
    public volatile SharedPreferences f4278a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f4279b;

    public v(ExecutorService executorService) {
        this.f4279b = executorService;
    }

    public static Context a() {
        try {
            sc.e.e();
            sc.e e10 = sc.e.e();
            e10.b();
            return e10.f31432a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final synchronized void b(Context context) {
        if (this.f4278a == null && context != null) {
            this.f4279b.execute(new ne.u(this, 7, context));
        }
    }

    public final void c(float f, String str) {
        if (this.f4278a == null) {
            b(a());
            if (this.f4278a == null) {
                return;
            }
        }
        this.f4278a.edit().putFloat(str, f).apply();
    }

    public final void d(long j10, String str) {
        if (this.f4278a == null) {
            b(a());
            if (this.f4278a == null) {
                return;
            }
        }
        this.f4278a.edit().putLong(str, j10).apply();
    }

    public final void e(String str, String str2) {
        if (this.f4278a == null) {
            b(a());
            if (this.f4278a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f4278a.edit().remove(str).apply();
        } else {
            this.f4278a.edit().putString(str, str2).apply();
        }
    }

    public final void f(String str, boolean z10) {
        if (this.f4278a == null) {
            b(a());
            if (this.f4278a == null) {
                return;
            }
        }
        this.f4278a.edit().putBoolean(str, z10).apply();
    }
}
