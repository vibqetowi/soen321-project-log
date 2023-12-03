package ta;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class d5 implements Runnable {
    public final /* synthetic */ Object A;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32524u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f32525v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f32526w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ m6 f32527x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ boolean f32528y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ l5 f32529z;

    public d5(l5 l5Var, String str, String str2, m6 m6Var, boolean z10, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.f32529z = l5Var;
        this.f32525v = str;
        this.f32526w = str2;
        this.f32527x = m6Var;
        this.f32528y = z10;
        this.A = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        l5 l5Var;
        m2 m2Var;
        Bundle bundle;
        y3 y3Var;
        m2 m2Var2;
        String str;
        switch (this.f32524u) {
            case 0:
                m6 m6Var = this.f32527x;
                String str2 = this.f32525v;
                Object obj = this.A;
                l5 l5Var2 = this.f32529z;
                Bundle bundle2 = new Bundle();
                try {
                    try {
                        m2Var2 = l5Var2.f32730x;
                        str = this.f32526w;
                    } catch (Throwable th2) {
                        th = th2;
                        bundle = bundle2;
                    }
                } catch (RemoteException e10) {
                    e = e10;
                }
                if (m2Var2 == null) {
                    w2 w2Var = l5Var2.f32943u.C;
                    y3.k(w2Var);
                    w2Var.f32925z.d("Failed to get user properties; not connected to service", str2, str);
                    y3Var = l5Var2.f32943u;
                    k6 k6Var = y3Var.F;
                    y3.i(k6Var);
                    k6Var.B((com.google.android.gms.internal.measurement.n0) obj, bundle2);
                    return;
                }
                v9.o.h(m6Var);
                List<g6> G = m2Var2.G(str2, str, this.f32528y, m6Var);
                bundle = new Bundle();
                if (G != null) {
                    for (g6 g6Var : G) {
                        String str3 = g6Var.f32581y;
                        String str4 = g6Var.f32578v;
                        if (str3 != null) {
                            bundle.putString(str4, str3);
                        } else {
                            Long l2 = g6Var.f32580x;
                            if (l2 != null) {
                                bundle.putLong(str4, l2.longValue());
                            } else {
                                Double d10 = g6Var.A;
                                if (d10 != null) {
                                    bundle.putDouble(str4, d10.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    l5Var2.s();
                    k6 k6Var2 = l5Var2.f32943u.F;
                    y3.i(k6Var2);
                    k6Var2.B((com.google.android.gms.internal.measurement.n0) obj, bundle);
                    return;
                } catch (RemoteException e11) {
                    e = e11;
                    bundle2 = bundle;
                    w2 w2Var2 = l5Var2.f32943u.C;
                    y3.k(w2Var2);
                    w2Var2.f32925z.d("Failed to get user properties; remote exception", str2, e);
                    y3Var = l5Var2.f32943u;
                    k6 k6Var3 = y3Var.F;
                    y3.i(k6Var3);
                    k6Var3.B((com.google.android.gms.internal.measurement.n0) obj, bundle2);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    k6 k6Var4 = l5Var2.f32943u.F;
                    y3.i(k6Var4);
                    k6Var4.B((com.google.android.gms.internal.measurement.n0) obj, bundle);
                    throw th;
                }
            default:
                synchronized (((AtomicReference) this.A)) {
                    try {
                        l5Var = this.f32529z;
                        m2Var = l5Var.f32730x;
                    } catch (RemoteException e12) {
                        w2 w2Var3 = this.f32529z.f32943u.C;
                        y3.k(w2Var3);
                        w2Var3.f32925z.e("(legacy) Failed to get user properties; remote exception", null, this.f32525v, e12);
                        ((AtomicReference) this.A).set(Collections.emptyList());
                        atomicReference = (AtomicReference) this.A;
                    }
                    if (m2Var == null) {
                        w2 w2Var4 = l5Var.f32943u.C;
                        y3.k(w2Var4);
                        w2Var4.f32925z.e("(legacy) Failed to get user properties; not connected to service", null, this.f32525v, this.f32526w);
                        ((AtomicReference) this.A).set(Collections.emptyList());
                        ((AtomicReference) this.A).notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        v9.o.h(this.f32527x);
                        ((AtomicReference) this.A).set(m2Var.G(this.f32525v, this.f32526w, this.f32528y, this.f32527x));
                    } else {
                        ((AtomicReference) this.A).set(m2Var.Q(null, this.f32525v, this.f32526w, this.f32528y));
                    }
                    this.f32529z.s();
                    atomicReference = (AtomicReference) this.A;
                    atomicReference.notify();
                    return;
                }
        }
    }

    public d5(l5 l5Var, AtomicReference atomicReference, String str, String str2, m6 m6Var, boolean z10) {
        this.f32529z = l5Var;
        this.A = atomicReference;
        this.f32525v = str;
        this.f32526w = str2;
        this.f32527x = m6Var;
        this.f32528y = z10;
    }
}
