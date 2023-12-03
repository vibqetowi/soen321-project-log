package ta;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class o4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32782u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f32783v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f32784w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f32785x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f32786y;

    public /* synthetic */ o4(int i6, Object obj, Object obj2, Object obj3, String str) {
        this.f32782u = i6;
        this.f32786y = obj;
        this.f32784w = obj2;
        this.f32783v = str;
        this.f32785x = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [ta.k6, ta.e4] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.measurement.n0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [ta.x3, ta.l5] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    public final void run() {
        y3 y3Var;
        int i6 = this.f32782u;
        String str = this.f32783v;
        ?? r32 = this.f32785x;
        Object obj = this.f32784w;
        ?? r52 = this.f32786y;
        switch (i6) {
            case 0:
                l5 t3 = ((t4) r52).f32943u.t();
                t3.h();
                t3.i();
                t3.t(new h5(t3, (AtomicReference) obj, this.f32783v, (String) r32, t3.q(false)));
                return;
            case 1:
                byte[] bArr = null;
                try {
                    try {
                        l5 l5Var = (l5) r52;
                        m2 m2Var = l5Var.f32730x;
                        if (m2Var == null) {
                            w2 w2Var = l5Var.f32943u.C;
                            y3.k(w2Var);
                            w2Var.f32925z.b("Discarding data. Failed to send event to service to bundle");
                            l5 l5Var2 = (l5) r52;
                            y3Var = l5Var2.f32943u;
                            r52 = l5Var2;
                        } else {
                            bArr = m2Var.N0((s) obj, str);
                            ((l5) r52).s();
                            l5 l5Var3 = (l5) r52;
                            y3Var = l5Var3.f32943u;
                            r52 = l5Var3;
                        }
                    } catch (RemoteException e10) {
                        w2 w2Var2 = r52.f32943u.C;
                        y3.k(w2Var2);
                        w2Var2.f32925z.c(e10, "Failed to send event to the service to bundle");
                        r52 = (l5) r52;
                        y3Var = r52.f32943u;
                    }
                    ?? r12 = y3Var.F;
                    y3.i(r12);
                    r32 = (com.google.android.gms.internal.measurement.n0) r32;
                    r12.C(r32, bArr);
                    return;
                } catch (Throwable th2) {
                    k6 k6Var = ((l5) r52).f32943u.F;
                    y3.i(k6Var);
                    k6Var.C((com.google.android.gms.internal.measurement.n0) r32, bArr);
                    throw th2;
                }
            case 2:
                l5 t10 = ((AppMeasurementDynamiteService) r52).f8742a.t();
                com.google.android.gms.internal.measurement.n0 n0Var = (com.google.android.gms.internal.measurement.n0) obj;
                s sVar = (s) r32;
                String str2 = this.f32783v;
                t10.h();
                t10.i();
                y3 y3Var2 = t10.f32943u;
                k6 k6Var2 = y3Var2.F;
                y3.i(k6Var2);
                k6Var2.getClass();
                if (s9.f.f31339b.b(12451000, k6Var2.f32943u.f32953u) != 0) {
                    w2 w2Var3 = y3Var2.C;
                    y3.k(w2Var3);
                    w2Var3.C.b("Not bundling data. Service unavailable or out of date");
                    k6 k6Var3 = y3Var2.F;
                    y3.i(k6Var3);
                    k6Var3.C(n0Var, new byte[0]);
                    return;
                }
                t10.t(new o4(1, t10, sVar, n0Var, str2));
                return;
            case 3:
                a6 a6Var = (a6) r52;
                d6 d6Var = a6Var.f32474u;
                ((kotlin.jvm.internal.b0) d6Var.c()).getClass();
                s n02 = a6Var.f32474u.P().n0((String) r32, (Bundle) obj, "auto", System.currentTimeMillis(), false);
                v9.o.h(n02);
                d6Var.j(n02, str);
                return;
            default:
                l5 t11 = ((AppMeasurementDynamiteService) r52).f8742a.t();
                t11.h();
                t11.i();
                t11.t(new h5(t11, this.f32783v, (String) r32, t11.q(false), (com.google.android.gms.internal.measurement.n0) obj));
                return;
        }
    }

    public o4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var, s sVar, String str) {
        this.f32782u = 2;
        this.f32786y = appMeasurementDynamiteService;
        this.f32784w = n0Var;
        this.f32785x = sVar;
        this.f32783v = str;
    }

    public o4(t4 t4Var, AtomicReference atomicReference, String str, String str2) {
        this.f32782u = 0;
        this.f32786y = t4Var;
        this.f32784w = atomicReference;
        this.f32783v = str;
        this.f32785x = str2;
    }

    public o4(a6 a6Var, String str, Bundle bundle) {
        this.f32782u = 3;
        this.f32786y = a6Var;
        this.f32783v = str;
        this.f32785x = "_err";
        this.f32784w = bundle;
    }
}
