package androidx.work;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c4.b0;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.z9;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k9.d0;
import k9.e;
import k9.e0;
import k9.f0;
import p9.a0;
import ta.b3;
import ta.d3;
import ta.d4;
import ta.d6;
import ta.f4;
import ta.g3;
import ta.h4;
import ta.i3;
import ta.j2;
import ta.j3;
import ta.k5;
import ta.k6;
import ta.l3;
import ta.l5;
import ta.m2;
import ta.m6;
import ta.n2;
import ta.n5;
import ta.o6;
import ta.q2;
import ta.r3;
import ta.t4;
import ta.u2;
import ta.v5;
import ta.w2;
import ta.w3;
import ta.w5;
import ta.y3;
import ta.z4;
import v9.g0;
import v9.i;
import v9.i1;
/* compiled from: ListenableFuture.kt */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f3327u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f3328v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f3329w;

    public /* synthetic */ n(int i6, Object obj, Object obj2) {
        this.f3327u = i6;
        this.f3328v = obj;
        this.f3329w = obj2;
    }

    private final void a() {
        r9.l lVar = (r9.l) this.f3328v;
        int i6 = ((r9.n) this.f3329w).f30634a;
        synchronized (lVar) {
            r9.n<?> nVar = lVar.f30631y.get(i6);
            if (nVar != null) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Timing out request: ");
                sb2.append(i6);
                Log.w("MessengerIpcClient", sb2.toString());
                lVar.f30631y.remove(i6);
                nVar.c(new zzq("Timed out waiting for response", null));
                lVar.c();
            }
        }
    }

    private final void b() {
        synchronized (((ya.p) this.f3329w).f38407c) {
            try {
                Object obj = ((ya.p) this.f3329w).f38408d;
                if (((ya.d) obj) != null) {
                    ((ya.d) obj).a((ya.h) this.f3328v);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        synchronized (((ya.p) this.f3329w).f38407c) {
            Object obj = ((ya.p) this.f3329w).f38408d;
            if (((ya.e) obj) != null) {
                Exception exception = ((ya.h) this.f3328v).getException();
                v9.o.h(exception);
                ((ya.e) obj).onFailure(exception);
            }
        }
    }

    private final void d() {
        synchronized (((ya.p) this.f3329w).f38407c) {
            try {
                Object obj = ((ya.p) this.f3329w).f38408d;
                if (((ya.f) obj) != null) {
                    ((ya.f) obj).onSuccess(((ya.h) this.f3328v).getResult());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void e() {
        Object obj = this.f3328v;
        try {
            ((ya.v) obj).b(((Callable) this.f3329w).call());
        } catch (Exception e10) {
            ((ya.v) obj).a(e10);
        } catch (Throwable th2) {
            ((ya.v) obj).a(new RuntimeException(th2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x074d, code lost:
        if (android.text.TextUtils.isEmpty(r2.G) == false) goto L246;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0333 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        v9.i i1Var;
        v9.i iVar;
        Set<Scope> set;
        boolean z20;
        ta.h hVar;
        ta.f fVar;
        ta.f fVar2;
        boolean g5;
        SharedPreferences sharedPreferences;
        boolean contains;
        Bundle bundle;
        boolean equals;
        boolean z21;
        Long l2;
        androidx.appcompat.widget.l lVar;
        boolean z22;
        switch (this.f3327u) {
            case 0:
                Object obj = this.f3328v;
                try {
                    ((kotlinx.coroutines.j) obj).resumeWith(((rc.b) this.f3329w).get());
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        cause = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        ((kotlinx.coroutines.j) obj).w(cause);
                        return;
                    } else {
                        ((kotlinx.coroutines.j) obj).resumeWith(sp.b.j(cause));
                        return;
                    }
                }
            case 1:
                Future future = (Future) this.f3328v;
                Runnable runnable = (Runnable) this.f3329w;
                if (!future.isDone() && !future.isCancelled()) {
                    future.cancel(true);
                    oa.i.f("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                c4.a aVar = (c4.a) this.f3328v;
                c4.g gVar = (c4.g) this.f3329w;
                if (((b0) aVar.f4883e.f1472w).f4898a != null) {
                    ((b0) aVar.f4883e.f1472w).f4898a.i(gVar, null);
                    return;
                }
                int i6 = b0.f4897d;
                ((b0) aVar.f4883e.f1472w).getClass();
                oa.i.f("BillingClient", "No valid listener is set in BroadcastManager");
                return;
            case 3:
                p9.y yVar = (p9.y) this.f3328v;
                a0 a0Var = (a0) this.f3329w;
                p9.b bVar = p9.y.f28064p0;
                k9.d dVar = a0Var.f28032x;
                boolean e10 = p9.a.e(dVar, yVar.W);
                e.c cVar = yVar.Y;
                if (!e10) {
                    yVar.W = dVar;
                    cVar.c(dVar);
                }
                double d10 = a0Var.f28029u;
                if (!Double.isNaN(d10) && Math.abs(d10 - yVar.f28072h0) > 1.0E-7d) {
                    yVar.f28072h0 = d10;
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z23 = yVar.e0;
                boolean z24 = a0Var.f28030v;
                if (z24 != z23) {
                    yVar.e0 = z24;
                    z10 = true;
                }
                Double.isNaN(a0Var.A);
                Object[] objArr = {Boolean.valueOf(z10), Boolean.valueOf(yVar.f28071g0)};
                p9.b bVar2 = p9.y.f28064p0;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr);
                if (cVar != null && (z10 || yVar.f28071g0)) {
                    cVar.f();
                }
                int i10 = yVar.f28074j0;
                int i11 = a0Var.f28031w;
                if (i11 != i10) {
                    yVar.f28074j0 = i11;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(yVar.f28071g0));
                if (cVar != null && (z11 || yVar.f28071g0)) {
                    cVar.a(yVar.f28074j0);
                }
                int i12 = yVar.f28075k0;
                int i13 = a0Var.f28033y;
                if (i13 != i12) {
                    yVar.f28075k0 = i13;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(yVar.f28071g0));
                if (cVar != null && (z12 || yVar.f28071g0)) {
                    cVar.e(yVar.f28075k0);
                }
                k9.v vVar = yVar.f28073i0;
                k9.v vVar2 = a0Var.f28034z;
                if (!p9.a.e(vVar, vVar2)) {
                    yVar.f28073i0 = vVar2;
                }
                yVar.f28071g0 = false;
                return;
            case 4:
                p9.y yVar2 = (p9.y) this.f3328v;
                p9.b bVar3 = p9.y.f28064p0;
                String str = ((p9.c) this.f3329w).f28038u;
                if (!p9.a.e(str, yVar2.f28069d0)) {
                    yVar2.f28069d0 = str;
                    z13 = true;
                } else {
                    z13 = false;
                }
                p9.y.f28064p0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z13), Boolean.valueOf(yVar2.f28070f0));
                e.c cVar2 = yVar2.Y;
                if (cVar2 != null && (z13 || yVar2.f28070f0)) {
                    cVar2.d();
                }
                yVar2.f28070f0 = false;
                return;
            case 5:
                a0 a0Var2 = (a0) this.f3329w;
                f0 f0Var = ((e0) this.f3328v).f23116b;
                p9.b bVar4 = f0.G;
                k9.d dVar2 = a0Var2.f28032x;
                boolean e11 = p9.a.e(dVar2, f0Var.f23127t);
                e.c cVar3 = f0Var.D;
                if (!e11) {
                    f0Var.f23127t = dVar2;
                    cVar3.c(dVar2);
                }
                double d11 = a0Var2.f28029u;
                if (!Double.isNaN(d11) && Math.abs(d11 - f0Var.f23129v) > 1.0E-7d) {
                    f0Var.f23129v = d11;
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z25 = f0Var.f23130w;
                boolean z26 = a0Var2.f28030v;
                if (z26 != z25) {
                    f0Var.f23130w = z26;
                    z14 = true;
                }
                Object[] objArr2 = {Boolean.valueOf(z14), Boolean.valueOf(f0Var.f23121m)};
                p9.b bVar5 = f0.G;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr2);
                if (cVar3 != null && (z14 || f0Var.f23121m)) {
                    cVar3.f();
                }
                Double.isNaN(a0Var2.A);
                int i14 = f0Var.f23131x;
                int i15 = a0Var2.f28031w;
                if (i15 != i14) {
                    f0Var.f23131x = i15;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(f0Var.f23121m));
                if (cVar3 != null && (z15 || f0Var.f23121m)) {
                    cVar3.a(f0Var.f23131x);
                }
                int i16 = f0Var.f23132y;
                int i17 = a0Var2.f28033y;
                if (i17 != i16) {
                    f0Var.f23132y = i17;
                    z16 = true;
                } else {
                    z16 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(f0Var.f23121m));
                if (cVar3 != null && (z16 || f0Var.f23121m)) {
                    cVar3.e(f0Var.f23132y);
                }
                k9.v vVar3 = f0Var.f23133z;
                k9.v vVar4 = a0Var2.f28034z;
                if (!p9.a.e(vVar3, vVar4)) {
                    f0Var.f23133z = vVar4;
                }
                f0Var.f23121m = false;
                return;
            case 6:
                f0 f0Var2 = ((e0) this.f3328v).f23116b;
                p9.b bVar6 = f0.G;
                String str2 = ((p9.c) this.f3329w).f28038u;
                if (!p9.a.e(str2, f0Var2.f23128u)) {
                    f0Var2.f23128u = str2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                f0.G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z17), Boolean.valueOf(f0Var2.f23122n));
                e.c cVar4 = f0Var2.D;
                if (cVar4 != null && (z17 || f0Var2.f23122n)) {
                    cVar4.d();
                }
                f0Var2.f23122n = false;
                return;
            case 7:
                r9.l lVar2 = (r9.l) this.f3328v;
                IBinder iBinder = (IBinder) this.f3329w;
                synchronized (lVar2) {
                    try {
                        if (iBinder == null) {
                            lVar2.a(0, "Null service connection");
                            return;
                        }
                        try {
                            lVar2.f30629w = new androidx.appcompat.widget.l(iBinder);
                            lVar2.f30627u = 2;
                            ((ScheduledExecutorService) lVar2.f30632z.f30641d).execute(new r9.k(lVar2, 1));
                            return;
                        } catch (RemoteException e12) {
                            lVar2.a(0, e12.getMessage());
                            return;
                        }
                    } finally {
                    }
                }
            case 8:
                a();
                return;
            case 9:
            default:
                e();
                return;
            case 10:
                q0 q0Var = (q0) this.f3329w;
                wa.l lVar3 = (wa.l) this.f3328v;
                va.b bVar7 = q0.f7422i;
                s9.b bVar8 = lVar3.f36663v;
                if (bVar8.f31323v == 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    g0 g0Var = lVar3.f36664w;
                    v9.o.h(g0Var);
                    s9.b bVar9 = g0Var.f34901w;
                    if (bVar9.f31323v == 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (!z19) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar9)), new Exception());
                        ((com.google.android.gms.common.api.internal.e0) q0Var.f7428h).b(bVar9);
                        q0Var.f7427g.h();
                        return;
                    }
                    p0 p0Var = q0Var.f7428h;
                    IBinder iBinder2 = g0Var.f34900v;
                    if (iBinder2 == null) {
                        iVar = null;
                    } else {
                        int i18 = i.a.f34909b;
                        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        if (queryLocalInterface instanceof v9.i) {
                            i1Var = (v9.i) queryLocalInterface;
                        } else {
                            i1Var = new i1(iBinder2);
                        }
                        iVar = i1Var;
                    }
                    com.google.android.gms.common.api.internal.e0 e0Var = (com.google.android.gms.common.api.internal.e0) p0Var;
                    e0Var.getClass();
                    if (iVar != null && (set = q0Var.f7426e) != null) {
                        e0Var.f7363c = iVar;
                        e0Var.f7364d = set;
                        if (e0Var.f7365e) {
                            e0Var.f7361a.f(iVar, set);
                        }
                    } else {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        e0Var.b(new s9.b(4));
                    }
                } else {
                    ((com.google.android.gms.common.api.internal.e0) q0Var.f7428h).b(bVar8);
                }
                q0Var.f7427g.h();
                return;
            case 11:
                ((com.google.android.gms.internal.cast.c) this.f3328v).Z1((r1.k) this.f3329w);
                return;
            case 12:
                ((f4) this.f3328v).d();
                if (kotlinx.coroutines.e0.x()) {
                    ((f4) this.f3328v).a().p(this);
                    return;
                }
                if (((ta.m) this.f3329w).f32738c != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                ((ta.m) this.f3329w).f32738c = 0L;
                if (z20) {
                    ((ta.m) this.f3329w).b();
                    return;
                }
                return;
            case 13:
                y3 y3Var = (y3) this.f3329w;
                h4 h4Var = (h4) this.f3328v;
                w3 w3Var = y3Var.D;
                y3.k(w3Var);
                w3Var.h();
                ta.f fVar3 = y3Var.A;
                fVar3.f32943u.getClass();
                ta.n nVar = new ta.n(y3Var);
                nVar.k();
                y3Var.P = nVar;
                n2 n2Var = new n2(y3Var, h4Var.f);
                n2Var.j();
                y3Var.Q = n2Var;
                q2 q2Var = new q2(y3Var);
                q2Var.j();
                y3Var.N = q2Var;
                l5 l5Var = new l5(y3Var);
                l5Var.j();
                y3Var.O = l5Var;
                k6 k6Var = y3Var.F;
                if (!k6Var.f32544v) {
                    k6Var.L();
                    k6Var.f32943u.e();
                    k6Var.f32544v = true;
                    j3 j3Var = y3Var.B;
                    if (!j3Var.f32544v) {
                        j3Var.m();
                        j3Var.f32943u.e();
                        j3Var.f32544v = true;
                        n2 n2Var2 = y3Var.Q;
                        if (!n2Var2.f32741v) {
                            n2Var2.l();
                            n2Var2.f32943u.e();
                            n2Var2.f32741v = true;
                            w2 w2Var = y3Var.C;
                            y3.k(w2Var);
                            fVar3.m();
                            u2 u2Var = w2Var.F;
                            u2Var.c(74029L, "App measurement initialized, version");
                            y3.k(w2Var);
                            u2Var.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            String m10 = n2Var.m();
                            if (TextUtils.isEmpty(y3Var.f32954v)) {
                                if (TextUtils.isEmpty(m10)) {
                                    equals = false;
                                } else {
                                    equals = k6Var.f32943u.A.i("debug.firebase.analytics.app").equals(m10);
                                }
                                if (equals) {
                                    y3.k(w2Var);
                                    u2Var.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                } else {
                                    y3.k(w2Var);
                                    u2Var.b("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(m10)));
                                }
                            }
                            y3.k(w2Var);
                            w2Var.G.b("Debug-level message logging enabled");
                            int i19 = y3Var.Y;
                            AtomicInteger atomicInteger = y3Var.Z;
                            if (i19 != atomicInteger.get()) {
                                y3.k(w2Var);
                                w2Var.f32925z.d("Not all components initialized", Integer.valueOf(y3Var.Y), Integer.valueOf(atomicInteger.get()));
                            }
                            y3Var.R = true;
                            t0 t0Var = h4Var.f32597g;
                            w3 w3Var2 = y3Var.D;
                            y3.k(w3Var2);
                            w3Var2.h();
                            j3 j3Var2 = y3Var.B;
                            y3.i(j3Var2);
                            ta.h n10 = j3Var2.n();
                            j3Var2.h();
                            int i20 = j3Var2.l().getInt("consent_source", 100);
                            ta.f fVar4 = y3Var.A;
                            y3 y3Var2 = fVar4.f32943u;
                            Boolean p10 = fVar4.p("google_analytics_default_allow_ad_storage");
                            Boolean p11 = fVar4.p("google_analytics_default_allow_analytics_storage");
                            long j10 = y3Var.f32952a0;
                            t4 t4Var = y3Var.J;
                            int i21 = -10;
                            if ((p10 != null || p11 != null) && j3Var2.s(-10)) {
                                hVar = new ta.h(p10, p11);
                            } else {
                                if (!TextUtils.isEmpty(y3Var.p().n()) && (i20 == 0 || i20 == 30 || i20 == 10 || i20 == 30 || i20 == 30 || i20 == 40)) {
                                    y3.j(t4Var);
                                    t4Var.u(ta.h.f32583b, -10, j10);
                                } else if (TextUtils.isEmpty(y3Var.p().n()) && t0Var != null && (bundle = t0Var.A) != null && j3Var2.s(30)) {
                                    hVar = ta.h.a(bundle);
                                    if (!hVar.equals(ta.h.f32583b)) {
                                        i21 = 30;
                                    }
                                }
                                hVar = null;
                                i21 = 100;
                            }
                            if (hVar != null) {
                                y3.j(t4Var);
                                t4Var.u(hVar, i21, j10);
                                n10 = hVar;
                            }
                            y3.j(t4Var);
                            t4Var.v(n10);
                            g3 g3Var = j3Var2.f32679y;
                            long a10 = g3Var.a();
                            w2 w2Var2 = y3Var.C;
                            if (a10 == 0) {
                                y3.k(w2Var2);
                                w2Var2.H.c(Long.valueOf(j10), "Persisting first open");
                                g3Var.b(j10);
                            }
                            y3.j(t4Var);
                            o6 o6Var = t4Var.H;
                            if (o6Var.b() && o6Var.c()) {
                                j3 j3Var3 = o6Var.f32791a.B;
                                y3.i(j3Var3);
                                j3Var3.O.b(null);
                            }
                            boolean h10 = y3Var.h();
                            k6 k6Var2 = y3Var.F;
                            if (!h10) {
                                if (y3Var.g()) {
                                    y3.i(k6Var2);
                                    if (!k6Var2.P("android.permission.INTERNET")) {
                                        y3.k(w2Var2);
                                        w2Var2.f32925z.b("App is missing INTERNET permission");
                                    }
                                    if (!k6Var2.P("android.permission.ACCESS_NETWORK_STATE")) {
                                        y3.k(w2Var2);
                                        w2Var2.f32925z.b("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    Context context = y3Var.f32953u;
                                    if (!ca.c.a(context).c() && !fVar4.u()) {
                                        if (!k6.U(context)) {
                                            y3.k(w2Var2);
                                            w2Var2.f32925z.b("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!k6.V(context)) {
                                            y3.k(w2Var2);
                                            w2Var2.f32925z.b("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    y3.k(w2Var2);
                                    w2Var2.f32925z.b("Uploading is not possible. App measurement disabled");
                                }
                            } else {
                                boolean isEmpty = TextUtils.isEmpty(y3Var.p().n());
                                i3 i3Var = j3Var2.f32680z;
                                if (isEmpty) {
                                    n2 p12 = y3Var.p();
                                    p12.i();
                                    if (TextUtils.isEmpty(p12.G)) {
                                        fVar = fVar4;
                                        if (!j3Var2.n().f(ta.g.ANALYTICS_STORAGE)) {
                                            i3Var.b(null);
                                        }
                                        y3.j(t4Var);
                                        t4Var.A.set(i3Var.a());
                                        ((v8) u8.f8623v.f8624u.a()).a();
                                        fVar2 = fVar;
                                        if (fVar2.q(null, j2.c0)) {
                                            y3.i(k6Var2);
                                            try {
                                                k6Var2.f32943u.f32953u.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            } catch (ClassNotFoundException unused) {
                                                i3 i3Var2 = j3Var2.N;
                                                if (!TextUtils.isEmpty(i3Var2.a())) {
                                                    y3.k(w2Var2);
                                                    w2Var2.C.b("Remote config removed with active feature rollouts");
                                                    i3Var2.b(null);
                                                }
                                            }
                                        }
                                        if (TextUtils.isEmpty(y3Var.p().n())) {
                                            n2 p13 = y3Var.p();
                                            p13.i();
                                            break;
                                        }
                                        g5 = y3Var.g();
                                        sharedPreferences = j3Var2.f32677w;
                                        if (sharedPreferences != null) {
                                            contains = false;
                                        } else {
                                            contains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!contains && !fVar2.s()) {
                                            j3Var2.q(!g5);
                                        }
                                        if (g5) {
                                            y3.j(t4Var);
                                            t4Var.D();
                                        }
                                        v5 v5Var = y3Var.E;
                                        y3.j(v5Var);
                                        v5Var.f32916x.a();
                                        y3Var.t().y(new AtomicReference());
                                        l5 t3 = y3Var.t();
                                        Bundle a11 = j3Var2.Q.a();
                                        t3.h();
                                        t3.i();
                                        t3.t(new d0(t3, t3.q(false), a11, 11));
                                    }
                                }
                                y3.i(k6Var2);
                                String n11 = y3Var.p().n();
                                j3Var2.h();
                                String string = j3Var2.l().getString("gmp_app_id", null);
                                n2 p14 = y3Var.p();
                                p14.i();
                                String str3 = p14.G;
                                j3Var2.h();
                                fVar = fVar4;
                                String string2 = j3Var2.l().getString("admob_app_id", null);
                                k6Var2.getClass();
                                if (k6.W(n11, string, str3, string2)) {
                                    y3.k(w2Var2);
                                    w2Var2.F.b("Rechecking which service to use due to a GMP App Id change");
                                    j3Var2.h();
                                    Boolean o10 = j3Var2.o();
                                    SharedPreferences.Editor edit = j3Var2.l().edit();
                                    edit.clear();
                                    edit.apply();
                                    if (o10 != null) {
                                        j3Var2.p(o10);
                                    }
                                    y3Var.q().m();
                                    y3Var.O.x();
                                    y3Var.O.w();
                                    g3Var.b(j10);
                                    i3Var.b(null);
                                }
                                String n12 = y3Var.p().n();
                                j3Var2.h();
                                SharedPreferences.Editor edit2 = j3Var2.l().edit();
                                edit2.putString("gmp_app_id", n12);
                                edit2.apply();
                                n2 p15 = y3Var.p();
                                p15.i();
                                String str4 = p15.G;
                                j3Var2.h();
                                SharedPreferences.Editor edit3 = j3Var2.l().edit();
                                edit3.putString("admob_app_id", str4);
                                edit3.apply();
                                if (!j3Var2.n().f(ta.g.ANALYTICS_STORAGE)) {
                                }
                                y3.j(t4Var);
                                t4Var.A.set(i3Var.a());
                                ((v8) u8.f8623v.f8624u.a()).a();
                                fVar2 = fVar;
                                if (fVar2.q(null, j2.c0)) {
                                }
                                if (TextUtils.isEmpty(y3Var.p().n())) {
                                }
                                g5 = y3Var.g();
                                sharedPreferences = j3Var2.f32677w;
                                if (sharedPreferences != null) {
                                }
                                if (!contains) {
                                    j3Var2.q(!g5);
                                }
                                if (g5) {
                                }
                                v5 v5Var2 = y3Var.E;
                                y3.j(v5Var2);
                                v5Var2.f32916x.a();
                                y3Var.t().y(new AtomicReference());
                                l5 t32 = y3Var.t();
                                Bundle a112 = j3Var2.Q.a();
                                t32.h();
                                t32.i();
                                t32.t(new d0(t32, t32.q(false), a112, 11));
                            }
                            j3Var2.G.a(true);
                            return;
                        }
                        throw new IllegalStateException("Can't initialize twice");
                    }
                    throw new IllegalStateException("Can't initialize twice");
                }
                throw new IllegalStateException("Can't initialize twice");
            case 14:
                d4 d4Var = (d4) this.f3329w;
                d4Var.f32521a.e();
                ta.c cVar5 = (ta.c) this.f3328v;
                if (cVar5.f32493w.f0() == null) {
                    d6 d6Var = d4Var.f32521a;
                    d6Var.getClass();
                    String str5 = cVar5.f32491u;
                    v9.o.h(str5);
                    m6 y10 = d6Var.y(str5);
                    if (y10 != null) {
                        d6Var.n(cVar5, y10);
                        return;
                    }
                    return;
                }
                d6 d6Var2 = d4Var.f32521a;
                d6Var2.getClass();
                String str6 = cVar5.f32491u;
                v9.o.h(str6);
                m6 y11 = d6Var2.y(str6);
                if (y11 != null) {
                    d6Var2.q(cVar5, y11);
                    return;
                }
                return;
            case 15:
                t4 t4Var2 = (t4) this.f3328v;
                String str7 = (String) this.f3329w;
                n2 p16 = t4Var2.f32943u.p();
                String str8 = p16.J;
                if (str8 != null && !str8.equals(str7)) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                p16.J = str7;
                if (z21) {
                    t4Var2.f32943u.p().o();
                    return;
                }
                return;
            case 16:
                t4 t4Var3 = (t4) this.f3329w;
                v5 v5Var3 = t4Var3.f32943u.E;
                y3.j(v5Var3);
                ((aa) z9.f8734v.f8735u.a()).a();
                boolean q10 = v5Var3.f32943u.A.q(null, j2.f32667p0);
                y3 y3Var3 = v5Var3.f32943u;
                if (q10) {
                    j3 j3Var4 = y3Var3.B;
                    y3.i(j3Var4);
                    if (!j3Var4.n().f(ta.g.ANALYTICS_STORAGE)) {
                        w2 w2Var3 = y3Var3.C;
                        y3.k(w2Var3);
                        w2Var3.E.b("Analytics storage consent denied; will not get session id");
                    } else {
                        j3 j3Var5 = y3Var3.B;
                        y3.i(j3Var5);
                        y3Var3.H.getClass();
                        if (!j3Var5.r(System.currentTimeMillis())) {
                            j3 j3Var6 = y3Var3.B;
                            y3.i(j3Var6);
                            if (j3Var6.I.a() != 0) {
                                j3 j3Var7 = y3Var3.B;
                                y3.i(j3Var7);
                                l2 = Long.valueOf(j3Var7.I.a());
                                Object obj2 = this.f3328v;
                                if (l2 == null) {
                                    k6 k6Var3 = t4Var3.f32943u.F;
                                    y3.i(k6Var3);
                                    k6Var3.E((n0) obj2, l2.longValue());
                                    return;
                                }
                                try {
                                    ((n0) obj2).t(null);
                                    return;
                                } catch (RemoteException e13) {
                                    w2 w2Var4 = t4Var3.f32943u.C;
                                    y3.k(w2Var4);
                                    w2Var4.f32925z.c(e13, "getSessionId failed with exception");
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    w2 w2Var5 = y3Var3.C;
                    y3.k(w2Var5);
                    w2Var5.E.b("getSessionId has been disabled.");
                }
                l2 = null;
                Object obj22 = this.f3328v;
                if (l2 == null) {
                }
            case 17:
                ((t4) this.f3329w).y((Boolean) this.f3328v, true);
                return;
            case 18:
                Object obj3 = this.f3329w;
                l5 l5Var2 = (l5) obj3;
                m2 m2Var = l5Var2.f32730x;
                y3 y3Var4 = l5Var2.f32943u;
                if (m2Var == null) {
                    w2 w2Var6 = y3Var4.C;
                    y3.k(w2Var6);
                    w2Var6.f32925z.b("Failed to send current screen to service");
                    return;
                }
                try {
                    z4 z4Var = (z4) this.f3328v;
                    if (z4Var == null) {
                        m2Var.O0(0L, null, null, y3Var4.f32953u.getPackageName());
                    } else {
                        m2Var.O0(z4Var.f32976c, z4Var.f32974a, z4Var.f32975b, y3Var4.f32953u.getPackageName());
                    }
                    ((l5) obj3).s();
                    return;
                } catch (RemoteException e14) {
                    w2 w2Var7 = l5Var2.f32943u.C;
                    y3.k(w2Var7);
                    w2Var7.f32925z.c(e14, "Failed to send current screen to the service");
                    return;
                }
            case 19:
                l5.v(((k5) this.f3329w).f32697w, (ComponentName) this.f3328v);
                return;
            case 20:
                d6 d6Var3 = (d6) this.f3328v;
                d6Var3.e();
                Runnable runnable2 = (Runnable) this.f3329w;
                d6Var3.a().h();
                if (d6Var3.J == null) {
                    d6Var3.J = new ArrayList();
                }
                d6Var3.J.add(runnable2);
                d6Var3.t();
                return;
            case 21:
                d6 d6Var4 = (d6) this.f3329w;
                d6Var4.a().h();
                d6Var4.E = new l3(d6Var4);
                ta.k kVar = new ta.k(d6Var4);
                kVar.j();
                d6Var4.f32532w = kVar;
                ta.f J = d6Var4.J();
                r3 r3Var = d6Var4.f32530u;
                v9.o.h(r3Var);
                J.f32551w = r3Var;
                n5 n5Var = new n5(d6Var4);
                n5Var.j();
                d6Var4.C = n5Var;
                ta.b bVar10 = new ta.b(d6Var4);
                bVar10.j();
                d6Var4.f32535z = bVar10;
                b3 b3Var = new b3(d6Var4, 1);
                b3Var.j();
                d6Var4.B = b3Var;
                w5 w5Var = new w5(d6Var4);
                w5Var.j();
                d6Var4.f32534y = w5Var;
                d6Var4.f32533x = new d3(d6Var4);
                if (d6Var4.K != d6Var4.L) {
                    d6Var4.b().f32925z.d("Not all upload components initialized", Integer.valueOf(d6Var4.K), Integer.valueOf(d6Var4.L));
                }
                d6Var4.G = true;
                d6Var4.a().h();
                ta.k kVar2 = d6Var4.f32532w;
                d6.H(kVar2);
                kVar2.Q();
                if (d6Var4.C.A.a() == 0) {
                    g3 g3Var2 = d6Var4.C.A;
                    ((kotlin.jvm.internal.b0) d6Var4.c()).getClass();
                    g3Var2.b(System.currentTimeMillis());
                }
                d6Var4.C();
                return;
            case 22:
                t4 t4Var4 = ((AppMeasurementDynamiteService) this.f3329w).f8742a.J;
                y3.j(t4Var4);
                androidx.appcompat.widget.l lVar4 = (androidx.appcompat.widget.l) this.f3328v;
                t4Var4.h();
                t4Var4.i();
                if (lVar4 != null && lVar4 != (lVar = t4Var4.f32884x)) {
                    if (lVar == null) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    v9.o.j("EventInterceptor already set.", z22);
                }
                t4Var4.f32884x = lVar4;
                return;
            case 23:
                Object obj4 = this.f3328v;
                boolean isCanceled = ((ya.h) obj4).isCanceled();
                Object obj5 = this.f3329w;
                if (isCanceled) {
                    ((ya.v) ((ya.p) obj5).f38408d).c();
                    return;
                }
                try {
                    ((ya.v) ((ya.p) obj5).f38408d).b(((ya.b) ((ya.p) obj5).f38407c).then((ya.h) obj4));
                    return;
                } catch (RuntimeExecutionException e15) {
                    if (e15.getCause() instanceof Exception) {
                        ((ya.v) ((ya.p) obj5).f38408d).a((Exception) e15.getCause());
                        return;
                    } else {
                        ((ya.v) ((ya.p) obj5).f38408d).a(e15);
                        return;
                    }
                } catch (Exception e16) {
                    ((ya.v) ((ya.p) obj5).f38408d).a(e16);
                    return;
                }
            case 24:
                Object obj6 = this.f3329w;
                try {
                    ya.h hVar2 = (ya.h) ((ya.b) ((ya.q) obj6).f38412d).then((ya.h) this.f3328v);
                    if (hVar2 == null) {
                        ((ya.q) obj6).onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    w2.r rVar = ya.j.f38394b;
                    ya.q qVar = (ya.q) obj6;
                    hVar2.addOnSuccessListener(rVar, qVar);
                    hVar2.addOnFailureListener(rVar, qVar);
                    hVar2.addOnCanceledListener(rVar, qVar);
                    return;
                } catch (RuntimeExecutionException e17) {
                    if (e17.getCause() instanceof Exception) {
                        ((ya.q) obj6).f38411c.a((Exception) e17.getCause());
                        return;
                    } else {
                        ((ya.q) obj6).f38411c.a(e17);
                        return;
                    }
                } catch (Exception e18) {
                    ((ya.q) obj6).f38411c.a(e18);
                    return;
                }
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                Object obj7 = this.f3329w;
                try {
                    ya.h h11 = ((ya.g) ((ya.q) obj7).f38412d).h(((ya.h) this.f3328v).getResult());
                    if (h11 == null) {
                        ((ya.q) obj7).onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    w2.r rVar2 = ya.j.f38394b;
                    ya.q qVar2 = (ya.q) obj7;
                    h11.addOnSuccessListener(rVar2, qVar2);
                    h11.addOnFailureListener(rVar2, qVar2);
                    h11.addOnCanceledListener(rVar2, qVar2);
                    return;
                } catch (RuntimeExecutionException e19) {
                    if (e19.getCause() instanceof Exception) {
                        ((ya.q) obj7).onFailure((Exception) e19.getCause());
                        return;
                    } else {
                        ((ya.q) obj7).onFailure(e19);
                        return;
                    }
                } catch (CancellationException unused2) {
                    ((ya.q) obj7).b();
                    return;
                } catch (Exception e20) {
                    ((ya.q) obj7).onFailure(e20);
                    return;
                }
        }
    }

    public /* synthetic */ n(Object obj, int i6, Object obj2) {
        this.f3327u = i6;
        this.f3328v = obj;
        this.f3329w = obj2;
    }

    public /* synthetic */ n(Object obj, Object obj2, int i6) {
        this.f3327u = i6;
        this.f3329w = obj;
        this.f3328v = obj2;
    }
}
