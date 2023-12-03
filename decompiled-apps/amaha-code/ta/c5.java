package ta;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.theinnerhour.b2b.utils.SessionManager;
import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class c5 extends m3 {
    public Activity A;
    public volatile boolean B;
    public volatile z4 C;
    public z4 D;
    public boolean E;
    public final Object F;

    /* renamed from: w  reason: collision with root package name */
    public volatile z4 f32509w;

    /* renamed from: x  reason: collision with root package name */
    public volatile z4 f32510x;

    /* renamed from: y  reason: collision with root package name */
    public z4 f32511y;

    /* renamed from: z  reason: collision with root package name */
    public final ConcurrentHashMap f32512z;

    public c5(y3 y3Var) {
        super(y3Var);
        this.F = new Object();
        this.f32512z = new ConcurrentHashMap();
    }

    @Override // ta.m3
    public final boolean k() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(z4 z4Var, z4 z4Var2, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        Bundle bundle2;
        String str;
        long j11;
        h();
        boolean z12 = false;
        if (z4Var2 != null) {
            if (z4Var2.f32976c == z4Var.f32976c && f6.b.Y0(z4Var2.f32975b, z4Var.f32975b) && f6.b.Y0(z4Var2.f32974a, z4Var.f32974a)) {
                z11 = false;
                if (z10 && this.f32511y != null) {
                    z12 = true;
                }
                y3 y3Var = this.f32943u;
                if (z11) {
                    if (bundle != null) {
                        bundle2 = new Bundle(bundle);
                    } else {
                        bundle2 = new Bundle();
                    }
                    Bundle bundle3 = bundle2;
                    k6.u(z4Var, bundle3, true);
                    if (z4Var2 != null) {
                        String str2 = z4Var2.f32974a;
                        if (str2 != null) {
                            bundle3.putString("_pn", str2);
                        }
                        String str3 = z4Var2.f32975b;
                        if (str3 != null) {
                            bundle3.putString("_pc", str3);
                        }
                        bundle3.putLong("_pi", z4Var2.f32976c);
                    }
                    if (z12) {
                        v5 v5Var = y3Var.E;
                        y3.j(v5Var);
                        mh.e eVar = v5Var.f32917y;
                        long j12 = j10 - eVar.f25071d;
                        eVar.f25071d = j10;
                        if (j12 > 0) {
                            k6 k6Var = y3Var.F;
                            y3.i(k6Var);
                            k6Var.s(bundle3, j12);
                        }
                    }
                    if (!y3Var.A.r()) {
                        bundle3.putLong("_mst", 1L);
                    }
                    if (true != z4Var.f32978e) {
                        str = "auto";
                    } else {
                        str = "app";
                    }
                    String str4 = str;
                    y3Var.H.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (z4Var.f32978e) {
                        long j13 = z4Var.f;
                        if (j13 != 0) {
                            j11 = j13;
                            t4 t4Var = y3Var.J;
                            y3.j(t4Var);
                            t4Var.p(j11, bundle3, str4, "_vs");
                        }
                    }
                    j11 = currentTimeMillis;
                    t4 t4Var2 = y3Var.J;
                    y3.j(t4Var2);
                    t4Var2.p(j11, bundle3, str4, "_vs");
                }
                if (z12) {
                    m(this.f32511y, true, j10);
                }
                this.f32511y = z4Var;
                if (z4Var.f32978e) {
                    this.D = z4Var;
                }
                l5 t3 = y3Var.t();
                t3.h();
                t3.i();
                t3.t(new androidx.work.n(t3, z4Var, 18));
            }
        }
        z11 = true;
        if (z10) {
            z12 = true;
        }
        y3 y3Var2 = this.f32943u;
        if (z11) {
        }
        if (z12) {
        }
        this.f32511y = z4Var;
        if (z4Var.f32978e) {
        }
        l5 t32 = y3Var2.t();
        t32.h();
        t32.i();
        t32.t(new androidx.work.n(t32, z4Var, 18));
    }

    public final void m(z4 z4Var, boolean z10, long j10) {
        boolean z11;
        y3 y3Var = this.f32943u;
        q1 m10 = y3Var.m();
        y3Var.H.getClass();
        m10.k(SystemClock.elapsedRealtime());
        if (z4Var != null && z4Var.f32977d) {
            z11 = true;
        } else {
            z11 = false;
        }
        v5 v5Var = y3Var.E;
        y3.j(v5Var);
        if (v5Var.f32917y.b(j10, z11, z10) && z4Var != null) {
            z4Var.f32977d = false;
        }
    }

    public final z4 n(boolean z10) {
        i();
        h();
        if (!z10) {
            return this.f32511y;
        }
        z4 z4Var = this.f32511y;
        if (z4Var != null) {
            return z4Var;
        }
        return this.D;
    }

    public final String o(Class cls) {
        String str;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str = split[length - 1];
        } else {
            str = "";
        }
        int length2 = str.length();
        this.f32943u.getClass();
        if (length2 > 100) {
            return str.substring(0, 100);
        }
        return str;
    }

    public final void p(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f32943u.A.r() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f32512z.put(activity, new z4(bundle2.getLong("id"), bundle2.getString(SessionManager.KEY_NAME), bundle2.getString("referrer_name")));
    }

    public final z4 q(Activity activity) {
        v9.o.h(activity);
        z4 z4Var = (z4) this.f32512z.get(activity);
        if (z4Var == null) {
            String o10 = o(activity.getClass());
            k6 k6Var = this.f32943u.F;
            y3.i(k6Var);
            z4 z4Var2 = new z4(k6Var.j0(), null, o10);
            this.f32512z.put(activity, z4Var2);
            z4Var = z4Var2;
        }
        if (this.C != null) {
            return this.C;
        }
        return z4Var;
    }

    public final void r(Activity activity, z4 z4Var, boolean z10) {
        z4 z4Var2;
        z4 z4Var3;
        String str;
        if (this.f32509w == null) {
            z4Var2 = this.f32510x;
        } else {
            z4Var2 = this.f32509w;
        }
        z4 z4Var4 = z4Var2;
        if (z4Var.f32975b == null) {
            if (activity != null) {
                str = o(activity.getClass());
            } else {
                str = null;
            }
            z4Var3 = new z4(z4Var.f32974a, str, z4Var.f32976c, z4Var.f32978e, z4Var.f);
        } else {
            z4Var3 = z4Var;
        }
        this.f32510x = this.f32509w;
        this.f32509w = z4Var3;
        this.f32943u.H.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        w3 w3Var = this.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new a5(this, z4Var3, z4Var4, elapsedRealtime, z10));
    }
}
