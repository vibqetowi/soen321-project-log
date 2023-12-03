package k9;

import android.app.job.JobParameters;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.internal.measurement.l2;
import com.google.android.gms.internal.measurement.p2;
import com.google.android.gms.internal.measurement.q2;
import com.google.android.gms.internal.measurement.zzd;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k9.e;
import ta.d4;
import ta.d6;
import ta.f6;
import ta.g6;
import ta.j3;
import ta.k3;
import ta.k6;
import ta.l3;
import ta.l5;
import ta.m2;
import ta.m6;
import ta.p5;
import ta.q5;
import ta.r3;
import ta.t4;
import ta.u2;
import ta.w2;
import ta.w3;
import ta.y3;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f23104u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f23105v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f23106w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f23107x;

    public /* synthetic */ d0(int i6, Object obj, Object obj2, Object obj3) {
        this.f23104u = i6;
        this.f23106w = obj;
        this.f23105v = obj2;
        this.f23107x = obj3;
    }

    private final void a() {
        AtomicReference atomicReference;
        j3 j3Var;
        synchronized (((AtomicReference) this.f23106w)) {
            try {
                j3Var = ((l5) this.f23107x).f32943u.B;
                y3.i(j3Var);
            } catch (RemoteException e10) {
                w2 w2Var = ((l5) this.f23107x).f32943u.C;
                y3.k(w2Var);
                w2Var.f32925z.c(e10, "Failed to get app instance id");
                atomicReference = (AtomicReference) this.f23106w;
            }
            if (!j3Var.n().f(ta.g.ANALYTICS_STORAGE)) {
                w2 w2Var2 = ((l5) this.f23107x).f32943u.C;
                y3.k(w2Var2);
                w2Var2.E.b("Analytics storage consent denied; will not get app instance id");
                t4 t4Var = ((l5) this.f23107x).f32943u.J;
                y3.j(t4Var);
                t4Var.A.set(null);
                j3 j3Var2 = ((l5) this.f23107x).f32943u.B;
                y3.i(j3Var2);
                j3Var2.f32680z.b(null);
                ((AtomicReference) this.f23106w).set(null);
                ((AtomicReference) this.f23106w).notify();
                return;
            }
            l5 l5Var = (l5) this.f23107x;
            m2 m2Var = l5Var.f32730x;
            if (m2Var == null) {
                w2 w2Var3 = l5Var.f32943u.C;
                y3.k(w2Var3);
                w2Var3.f32925z.b("Failed to get app instance id");
                ((AtomicReference) this.f23106w).notify();
                return;
            }
            v9.o.h((m6) this.f23105v);
            ((AtomicReference) this.f23106w).set(m2Var.Y0((m6) this.f23105v));
            String str = (String) ((AtomicReference) this.f23106w).get();
            if (str != null) {
                t4 t4Var2 = ((l5) this.f23107x).f32943u.J;
                y3.j(t4Var2);
                t4Var2.A.set(str);
                j3 j3Var3 = ((l5) this.f23107x).f32943u.B;
                y3.i(j3Var3);
                j3Var3.f32680z.b(str);
            }
            ((l5) this.f23107x).s();
            atomicReference = (AtomicReference) this.f23106w;
            atomicReference.notify();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.d dVar;
        ta.q qVar;
        ta.q qVar2;
        y3 y3Var;
        Bundle bundle = null;
        r6 = null;
        r6 = null;
        String str = null;
        com.google.android.gms.internal.measurement.h0 h0Var = null;
        Bundle bundle2 = null;
        switch (this.f23104u) {
            case 0:
                e0 e0Var = (e0) this.f23106w;
                String str2 = (String) this.f23105v;
                String str3 = (String) this.f23107x;
                synchronized (e0Var.f23116b.C) {
                    dVar = (e.d) e0Var.f23116b.C.get(str2);
                }
                if (dVar != null) {
                    CastDevice castDevice = e0Var.f23116b.A;
                    dVar.a(str3);
                    return;
                }
                f0.G.b("Discarded message for unknown namespace '%s'", str2);
                return;
            case 1:
                f1 f1Var = (f1) this.f23107x;
                int i6 = f1Var.f7376v;
                Object obj = this.f23106w;
                if (i6 > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj;
                    Bundle bundle3 = f1Var.f7377w;
                    if (bundle3 != null) {
                        bundle = bundle3.getBundle((String) this.f23105v);
                    }
                    lifecycleCallback.onCreate(bundle);
                }
                if (f1Var.f7376v >= 2) {
                    ((LifecycleCallback) obj).onStart();
                }
                if (f1Var.f7376v >= 3) {
                    ((LifecycleCallback) obj).onResume();
                }
                if (f1Var.f7376v >= 4) {
                    ((LifecycleCallback) obj).onStop();
                }
                if (f1Var.f7376v >= 5) {
                    ((LifecycleCallback) obj).onDestroy();
                    return;
                }
                return;
            case 2:
                g1 g1Var = (g1) this.f23107x;
                int i10 = g1Var.f7383v;
                Object obj2 = this.f23106w;
                if (i10 > 0) {
                    LifecycleCallback lifecycleCallback2 = (LifecycleCallback) obj2;
                    Bundle bundle4 = g1Var.f7384w;
                    if (bundle4 != null) {
                        bundle2 = bundle4.getBundle((String) this.f23105v);
                    }
                    lifecycleCallback2.onCreate(bundle2);
                }
                if (g1Var.f7383v >= 2) {
                    ((LifecycleCallback) obj2).onStart();
                }
                if (g1Var.f7383v >= 3) {
                    ((LifecycleCallback) obj2).onResume();
                }
                if (g1Var.f7383v >= 4) {
                    ((LifecycleCallback) obj2).onStop();
                }
                if (g1Var.f7383v >= 5) {
                    ((LifecycleCallback) obj2).onDestroy();
                    return;
                }
                return;
            case 3:
                k3 k3Var = (k3) this.f23107x;
                l3 l3Var = k3Var.f32692v;
                com.google.android.gms.internal.measurement.c0 c0Var = (com.google.android.gms.internal.measurement.c0) this.f23106w;
                y3 y3Var2 = l3Var.f32704a;
                w3 w3Var = y3Var2.D;
                y3.k(w3Var);
                w3Var.h();
                Bundle bundle5 = new Bundle();
                bundle5.putString("package_name", k3Var.f32691u);
                try {
                    if (c0Var.D0(bundle5) == null) {
                        w2 w2Var = y3Var2.C;
                        y3.k(w2Var);
                        w2Var.f32925z.b("Install Referrer Service returned a null response");
                    }
                } catch (Exception e10) {
                    w2 w2Var2 = y3Var2.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.c(e10.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                w3 w3Var2 = y3Var2.D;
                y3.k(w3Var2);
                w3Var2.h();
                throw new IllegalStateException("Unexpected call on client side");
            case 4:
                String str4 = (String) this.f23105v;
                Bundle bundle6 = (Bundle) this.f23107x;
                ta.k kVar = ((d4) this.f23106w).f32521a.f32532w;
                d6.H(kVar);
                kVar.h();
                kVar.i();
                v9.o.e(str4);
                v9.o.e("dep");
                TextUtils.isEmpty("");
                y3 y3Var3 = kVar.f32943u;
                if (bundle6 != null && !bundle6.isEmpty()) {
                    Bundle bundle7 = new Bundle(bundle6);
                    Iterator<String> it = bundle7.keySet().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next == null) {
                            w2 w2Var3 = y3Var3.C;
                            y3.k(w2Var3);
                            w2Var3.f32925z.b("Param name can't be null");
                            it.remove();
                        } else {
                            k6 k6Var = y3Var3.F;
                            y3.i(k6Var);
                            Object l2 = k6Var.l(bundle7.get(next), next);
                            if (l2 == null) {
                                w2 w2Var4 = y3Var3.C;
                                y3.k(w2Var4);
                                w2Var4.C.c(y3Var3.G.e(next), "Param value can't be null");
                                it.remove();
                            } else {
                                k6 k6Var2 = y3Var3.F;
                                y3.i(k6Var2);
                                k6Var2.y(bundle7, next, l2);
                            }
                        }
                    }
                    qVar = new ta.q(bundle7);
                } else {
                    qVar = new ta.q(new Bundle());
                }
                f6 f6Var = kVar.f32947v.A;
                d6.H(f6Var);
                l2 y10 = com.google.android.gms.internal.measurement.m2.y();
                y10.i();
                com.google.android.gms.internal.measurement.m2.K(0L, (com.google.android.gms.internal.measurement.m2) y10.f8613v);
                for (String str5 : qVar.f32819u.keySet()) {
                    p2 y11 = q2.y();
                    y11.l(str5);
                    Object obj3 = qVar.f32819u.get(str5);
                    v9.o.h(obj3);
                    f6Var.F(y11, obj3);
                    y10.m(y11);
                }
                byte[] g5 = ((com.google.android.gms.internal.measurement.m2) y10.f()).g();
                w2 w2Var5 = y3Var3.C;
                y3.k(w2Var5);
                w2Var5.H.d("Saving default event parameters, appId, data size", y3Var3.G.d(str4), Integer.valueOf(g5.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", g5);
                try {
                    if (kVar.A().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        y3.k(w2Var5);
                        w2Var5.f32925z.c(w2.q(str4), "Failed to insert default event parameters (got -1). appId");
                        return;
                    }
                    return;
                } catch (SQLiteException e11) {
                    y3.k(w2Var5);
                    w2Var5.f32925z.d("Error storing default event parameters. appId", w2.q(str4), e11);
                    return;
                }
            case 5:
                d4 d4Var = (d4) this.f23107x;
                d4Var.f32521a.e();
                ta.c cVar = (ta.c) this.f23106w;
                Object f02 = cVar.f32493w.f0();
                Object obj4 = this.f23105v;
                if (f02 == null) {
                    d4Var.f32521a.n(cVar, (m6) obj4);
                    return;
                } else {
                    d4Var.f32521a.q(cVar, (m6) obj4);
                    return;
                }
            case 6:
                d4 d4Var2 = (d4) this.f23107x;
                ta.s sVar = (ta.s) this.f23106w;
                d4Var2.getClass();
                if ("_cmp".equals(sVar.f32858u) && (qVar2 = sVar.f32859v) != null && qVar2.f32819u.size() != 0) {
                    String string = qVar2.f32819u.getString("_cis");
                    if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                        d4Var2.f32521a.b().F.c(sVar.toString(), "Event has been filtered ");
                        sVar = new ta.s("_cmpx", sVar.f32859v, sVar.f32860w, sVar.f32861x);
                    }
                }
                String str6 = sVar.f32858u;
                m6 m6Var = (m6) this.f23105v;
                d6 d6Var = d4Var2.f32521a;
                r3 r3Var = d6Var.f32530u;
                f6 f6Var2 = d6Var.A;
                d6.H(r3Var);
                if (!r3Var.t(m6Var.f32748u)) {
                    d4Var2.z(sVar, m6Var);
                    return;
                }
                u2 u2Var = d6Var.b().H;
                String str7 = m6Var.f32748u;
                u2Var.c(str7, "EES config found for");
                r3 r3Var2 = d6Var.f32530u;
                d6.H(r3Var2);
                if (!TextUtils.isEmpty(str7)) {
                    h0Var = (com.google.android.gms.internal.measurement.h0) r3Var2.D.b(str7);
                }
                if (h0Var != null) {
                    try {
                        s1.s sVar2 = h0Var.f8400c;
                        d6.H(f6Var2);
                        HashMap E = f6.E(sVar.f32859v.f0(), true);
                        String r02 = kotlin.jvm.internal.h.r0(str6, kc.f.f23227q0, kc.f.f23225o0);
                        if (r02 == null) {
                            r02 = str6;
                        }
                        if (h0Var.b(new com.google.android.gms.internal.measurement.b(r02, sVar.f32861x, E))) {
                            s1.s sVar3 = h0Var.f8400c;
                            if (!((com.google.android.gms.internal.measurement.b) sVar3.f31225w).equals((com.google.android.gms.internal.measurement.b) sVar3.f31224v)) {
                                d6Var.b().H.c(str6, "EES edited event");
                                d6.H(f6Var2);
                                d4Var2.z(f6.y((com.google.android.gms.internal.measurement.b) sVar2.f31225w), m6Var);
                            } else {
                                d4Var2.z(sVar, m6Var);
                            }
                            if (!((List) h0Var.f8400c.f31226x).isEmpty()) {
                                for (com.google.android.gms.internal.measurement.b bVar : (List) sVar2.f31226x) {
                                    d6Var.b().H.c(bVar.f8305a, "EES logging created event");
                                    d6.H(f6Var2);
                                    d4Var2.z(f6.y(bVar), m6Var);
                                }
                                return;
                            }
                            return;
                        }
                    } catch (zzd unused) {
                        d6Var.b().f32925z.d("EES error. appId, eventName", m6Var.f32749v, str6);
                    }
                    d6Var.b().H.c(str6, "EES was not applied to event");
                    d4Var2.z(sVar, m6Var);
                    return;
                }
                d6Var.b().H.c(str7, "EES not loaded for");
                d4Var2.z(sVar, m6Var);
                return;
            case 7:
                d4 d4Var3 = (d4) this.f23107x;
                d4Var3.f32521a.e();
                d4Var3.f32521a.j((ta.s) this.f23106w, (String) this.f23105v);
                return;
            case 8:
                d4 d4Var4 = (d4) this.f23107x;
                d4Var4.f32521a.e();
                g6 g6Var = (g6) this.f23106w;
                Object f03 = g6Var.f0();
                Object obj5 = this.f23105v;
                if (f03 == null) {
                    d4Var4.f32521a.o(g6Var, (m6) obj5);
                    return;
                } else {
                    d4Var4.f32521a.s(g6Var, (m6) obj5);
                    return;
                }
            case 9:
                a();
                return;
            case 10:
                Object obj6 = this.f23106w;
                Object obj7 = this.f23105v;
                Object obj8 = this.f23107x;
                try {
                    try {
                        j3 j3Var = ((l5) obj8).f32943u.B;
                        y3.i(j3Var);
                        if (!j3Var.n().f(ta.g.ANALYTICS_STORAGE)) {
                            w2 w2Var6 = ((l5) obj8).f32943u.C;
                            y3.k(w2Var6);
                            w2Var6.E.b("Analytics storage consent denied; will not get app instance id");
                            t4 t4Var = ((l5) obj8).f32943u.J;
                            y3.j(t4Var);
                            t4Var.A.set(null);
                            j3 j3Var2 = ((l5) obj8).f32943u.B;
                            y3.i(j3Var2);
                            j3Var2.f32680z.b(null);
                            y3Var = ((l5) obj8).f32943u;
                        } else {
                            l5 l5Var = (l5) obj8;
                            m2 m2Var = l5Var.f32730x;
                            if (m2Var == null) {
                                w2 w2Var7 = l5Var.f32943u.C;
                                y3.k(w2Var7);
                                w2Var7.f32925z.b("Failed to get app instance id");
                                y3Var = ((l5) obj8).f32943u;
                            } else {
                                v9.o.h((m6) obj6);
                                str = m2Var.Y0((m6) obj6);
                                if (str != null) {
                                    t4 t4Var2 = ((l5) obj8).f32943u.J;
                                    y3.j(t4Var2);
                                    t4Var2.A.set(str);
                                    j3 j3Var3 = ((l5) obj8).f32943u.B;
                                    y3.i(j3Var3);
                                    j3Var3.f32680z.b(str);
                                }
                                ((l5) obj8).s();
                                y3Var = ((l5) obj8).f32943u;
                            }
                        }
                    } catch (Throwable th2) {
                        k6 k6Var3 = ((l5) obj8).f32943u.F;
                        y3.i(k6Var3);
                        k6Var3.F(null, (com.google.android.gms.internal.measurement.n0) obj7);
                        throw th2;
                    }
                } catch (RemoteException e12) {
                    w2 w2Var8 = ((l5) obj8).f32943u.C;
                    y3.k(w2Var8);
                    w2Var8.f32925z.c(e12, "Failed to get app instance id");
                    y3Var = ((l5) obj8).f32943u;
                }
                k6 k6Var4 = y3Var.F;
                y3.i(k6Var4);
                k6Var4.F(str, (com.google.android.gms.internal.measurement.n0) obj7);
                return;
            case 11:
                Object obj9 = this.f23106w;
                l5 l5Var2 = (l5) this.f23107x;
                m2 m2Var2 = l5Var2.f32730x;
                if (m2Var2 == null) {
                    w2 w2Var9 = l5Var2.f32943u.C;
                    y3.k(w2Var9);
                    w2Var9.f32925z.b("Failed to send default event parameters to service");
                    return;
                }
                try {
                    v9.o.h((m6) obj9);
                    m2Var2.G0((Bundle) this.f23105v, (m6) obj9);
                    return;
                } catch (RemoteException e13) {
                    w2 w2Var10 = l5Var2.f32943u.C;
                    y3.k(w2Var10);
                    w2Var10.f32925z.c(e13, "Failed to send default event parameters to service");
                    return;
                }
            default:
                q5 q5Var = (q5) this.f23106w;
                q5Var.getClass();
                ((w2) this.f23105v).H.b("AppMeasurementJobService processed last upload request.");
                ((p5) q5Var.f32832a).b((JobParameters) this.f23107x);
                return;
        }
    }

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i6) {
        this.f23104u = i6;
        this.f23107x = obj;
        this.f23106w = obj2;
        this.f23105v = obj3;
    }
}
