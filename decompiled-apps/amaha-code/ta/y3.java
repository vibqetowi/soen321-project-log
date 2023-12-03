package ta;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class y3 implements f4 {

    /* renamed from: b0  reason: collision with root package name */
    public static volatile y3 f32951b0;
    public final f A;
    public final j3 B;
    public final w2 C;
    public final w3 D;
    public final v5 E;
    public final k6 F;
    public final r2 G;
    public final kotlin.jvm.internal.b0 H;
    public final c5 I;
    public final t4 J;
    public final q1 K;
    public final y4 L;
    public final String M;
    public q2 N;
    public l5 O;
    public n P;
    public n2 Q;
    public Boolean S;
    public long T;
    public volatile Boolean U;
    public final Boolean V;
    public final Boolean W;
    public volatile boolean X;
    public int Y;

    /* renamed from: a0  reason: collision with root package name */
    public final long f32952a0;

    /* renamed from: u  reason: collision with root package name */
    public final Context f32953u;

    /* renamed from: v  reason: collision with root package name */
    public final String f32954v;

    /* renamed from: w  reason: collision with root package name */
    public final String f32955w;

    /* renamed from: x  reason: collision with root package name */
    public final String f32956x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f32957y;

    /* renamed from: z  reason: collision with root package name */
    public final kotlinx.coroutines.e0 f32958z;
    public boolean R = false;
    public final AtomicInteger Z = new AtomicInteger(0);

    public y3(h4 h4Var) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z10 = false;
        Context context = h4Var.f32592a;
        kotlinx.coroutines.e0 e0Var = new kotlinx.coroutines.e0((Object) null);
        this.f32958z = e0Var;
        sc.b.N = e0Var;
        this.f32953u = context;
        this.f32954v = h4Var.f32593b;
        this.f32955w = h4Var.f32594c;
        this.f32956x = h4Var.f32595d;
        this.f32957y = h4Var.f32598h;
        this.U = h4Var.f32596e;
        this.M = h4Var.f32600j;
        this.X = true;
        com.google.android.gms.internal.measurement.t0 t0Var = h4Var.f32597g;
        if (t0Var != null && (bundle = t0Var.A) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.V = (Boolean) obj;
            }
            Object obj2 = t0Var.A.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.W = (Boolean) obj2;
            }
        }
        if (com.google.android.gms.internal.measurement.h4.f8403g == null) {
            Object obj3 = com.google.android.gms.internal.measurement.h4.f;
            synchronized (obj3) {
                if (com.google.android.gms.internal.measurement.h4.f8403g == null) {
                    synchronized (obj3) {
                        com.google.android.gms.internal.measurement.o3 o3Var = com.google.android.gms.internal.measurement.h4.f8403g;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        if (o3Var == null || o3Var.f8527a != applicationContext) {
                            com.google.android.gms.internal.measurement.q3.c();
                            com.google.android.gms.internal.measurement.i4.b();
                            com.google.android.gms.internal.measurement.u3.c();
                            com.google.android.gms.internal.measurement.h4.f8403g = new com.google.android.gms.internal.measurement.o3(applicationContext, sp.b.m0(new com.google.android.gms.internal.measurement.z3(applicationContext)));
                            com.google.android.gms.internal.measurement.h4.f8404h.incrementAndGet();
                        }
                    }
                }
            }
        }
        this.H = kotlin.jvm.internal.b0.f23449u;
        Long l2 = h4Var.f32599i;
        if (l2 != null) {
            currentTimeMillis = l2.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f32952a0 = currentTimeMillis;
        this.A = new f(this);
        j3 j3Var = new j3(this);
        j3Var.k();
        this.B = j3Var;
        w2 w2Var = new w2(this);
        w2Var.k();
        this.C = w2Var;
        k6 k6Var = new k6(this);
        k6Var.k();
        this.F = k6Var;
        this.G = new r2(new x3(this));
        this.K = new q1(this);
        c5 c5Var = new c5(this);
        c5Var.j();
        this.I = c5Var;
        t4 t4Var = new t4(this);
        t4Var.j();
        this.J = t4Var;
        v5 v5Var = new v5(this);
        v5Var.j();
        this.E = v5Var;
        y4 y4Var = new y4(this);
        y4Var.k();
        this.L = y4Var;
        w3 w3Var = new w3(this);
        w3Var.k();
        this.D = w3Var;
        com.google.android.gms.internal.measurement.t0 t0Var2 = h4Var.f32597g;
        z10 = (t0Var2 == null || t0Var2.f8606v == 0) ? true : true;
        if (context.getApplicationContext() instanceof Application) {
            j(t4Var);
            if (t4Var.f32943u.f32953u.getApplicationContext() instanceof Application) {
                Application application = (Application) t4Var.f32943u.f32953u.getApplicationContext();
                if (t4Var.f32883w == null) {
                    t4Var.f32883w = new s4(t4Var);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(t4Var.f32883w);
                    application.registerActivityLifecycleCallbacks(t4Var.f32883w);
                    w2 w2Var2 = t4Var.f32943u.C;
                    k(w2Var2);
                    w2Var2.H.b("Registered activity lifecycle callback");
                }
            }
        } else {
            k(w2Var);
            w2Var.C.b("Application context is not an Application");
        }
        w3Var.p(new androidx.work.n(this, h4Var, 13));
    }

    public static final void i(e4 e4Var) {
        if (e4Var != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void j(m3 m3Var) {
        if (m3Var != null) {
            if (m3Var.f32741v) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(m3Var.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void k(e4 e4Var) {
        if (e4Var != null) {
            if (e4Var.f32544v) {
                return;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(e4Var.getClass())));
        }
        throw new IllegalStateException("Component not created");
    }

    public static y3 s(Context context, com.google.android.gms.internal.measurement.t0 t0Var, Long l2) {
        Bundle bundle;
        if (t0Var != null && (t0Var.f8609y == null || t0Var.f8610z == null)) {
            t0Var = new com.google.android.gms.internal.measurement.t0(t0Var.f8605u, t0Var.f8606v, t0Var.f8607w, t0Var.f8608x, null, null, t0Var.A, null);
        }
        v9.o.h(context);
        v9.o.h(context.getApplicationContext());
        if (f32951b0 == null) {
            synchronized (y3.class) {
                if (f32951b0 == null) {
                    f32951b0 = new y3(new h4(context, t0Var, l2));
                }
            }
        } else if (t0Var != null && (bundle = t0Var.A) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            v9.o.h(f32951b0);
            f32951b0.U = Boolean.valueOf(t0Var.A.getBoolean("dataCollectionDefaultEnabled"));
        }
        v9.o.h(f32951b0);
        return f32951b0;
    }

    @Override // ta.f4
    public final w3 a() {
        w3 w3Var = this.D;
        k(w3Var);
        return w3Var;
    }

    @Override // ta.f4
    public final w2 b() {
        w2 w2Var = this.C;
        k(w2Var);
        return w2Var;
    }

    @Override // ta.f4
    public final aa.c c() {
        return this.H;
    }

    @Override // ta.f4
    public final kotlinx.coroutines.e0 d() {
        return this.f32958z;
    }

    public final void e() {
        this.Z.incrementAndGet();
    }

    @Override // ta.f4
    public final Context f() {
        return this.f32953u;
    }

    public final boolean g() {
        if (l() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.T) > 1000) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
        if (android.text.TextUtils.isEmpty(r0.G) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h() {
        boolean z10;
        Boolean valueOf;
        if (this.R) {
            w3 w3Var = this.D;
            k(w3Var);
            w3Var.h();
            Boolean bool = this.S;
            kotlin.jvm.internal.b0 b0Var = this.H;
            if (bool != null && this.T != 0) {
                if (!bool.booleanValue()) {
                    b0Var.getClass();
                }
                return this.S.booleanValue();
            }
            b0Var.getClass();
            this.T = SystemClock.elapsedRealtime();
            k6 k6Var = this.F;
            i(k6Var);
            boolean z11 = false;
            if (k6Var.P("android.permission.INTERNET") && k6Var.P("android.permission.ACCESS_NETWORK_STATE")) {
                Context context = this.f32953u;
                if (ca.c.a(context).c() || this.A.u() || (k6.U(context) && k6.V(context))) {
                    z10 = true;
                    valueOf = Boolean.valueOf(z10);
                    this.S = valueOf;
                    if (valueOf.booleanValue()) {
                        String n10 = p().n();
                        n2 p10 = p();
                        p10.i();
                        if (!k6Var.H(n10, p10.G)) {
                            n2 p11 = p();
                            p11.i();
                        }
                        z11 = true;
                        this.S = Boolean.valueOf(z11);
                    }
                    return this.S.booleanValue();
                }
            }
            z10 = false;
            valueOf = Boolean.valueOf(z10);
            this.S = valueOf;
            if (valueOf.booleanValue()) {
            }
            return this.S.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final int l() {
        w3 w3Var = this.D;
        k(w3Var);
        w3Var.h();
        if (this.A.s()) {
            return 1;
        }
        Boolean bool = this.W;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        w3 w3Var2 = this.D;
        k(w3Var2);
        w3Var2.h();
        if (!this.X) {
            return 8;
        }
        j3 j3Var = this.B;
        i(j3Var);
        Boolean o10 = j3Var.o();
        if (o10 != null) {
            if (o10.booleanValue()) {
                return 0;
            }
            return 3;
        }
        f fVar = this.A;
        kotlinx.coroutines.e0 e0Var = fVar.f32943u.f32958z;
        Boolean p10 = fVar.p("firebase_analytics_collection_enabled");
        if (p10 != null) {
            if (p10.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.V;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        } else if (this.U == null || this.U.booleanValue()) {
            return 0;
        } else {
            return 7;
        }
    }

    public final q1 m() {
        q1 q1Var = this.K;
        if (q1Var != null) {
            return q1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final f n() {
        return this.A;
    }

    public final n o() {
        k(this.P);
        return this.P;
    }

    public final n2 p() {
        j(this.Q);
        return this.Q;
    }

    public final q2 q() {
        j(this.N);
        return this.N;
    }

    public final r2 r() {
        return this.G;
    }

    public final l5 t() {
        j(this.O);
        return this.O;
    }
}
