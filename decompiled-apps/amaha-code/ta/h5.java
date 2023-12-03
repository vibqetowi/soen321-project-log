package ta;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class h5 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32601u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f32602v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f32603w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ m6 f32604x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ l5 f32605y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f32606z;

    public h5(l5 l5Var, String str, String str2, m6 m6Var, com.google.android.gms.internal.measurement.n0 n0Var) {
        this.f32605y = l5Var;
        this.f32602v = str;
        this.f32603w = str2;
        this.f32604x = m6Var;
        this.f32606z = n0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [ta.k6, ta.e4] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.measurement.n0] */
    @Override // java.lang.Runnable
    public final void run() {
        y3 y3Var;
        AtomicReference atomicReference;
        l5 l5Var;
        m2 m2Var;
        switch (this.f32601u) {
            case 0:
                synchronized (((AtomicReference) this.f32606z)) {
                    try {
                        l5Var = this.f32605y;
                        m2Var = l5Var.f32730x;
                    } catch (RemoteException e10) {
                        w2 w2Var = this.f32605y.f32943u.C;
                        y3.k(w2Var);
                        w2Var.f32925z.e("(legacy) Failed to get conditional properties; remote exception", null, this.f32602v, e10);
                        ((AtomicReference) this.f32606z).set(Collections.emptyList());
                        atomicReference = (AtomicReference) this.f32606z;
                    }
                    if (m2Var == null) {
                        w2 w2Var2 = l5Var.f32943u.C;
                        y3.k(w2Var2);
                        w2Var2.f32925z.e("(legacy) Failed to get conditional properties; not connected to service", null, this.f32602v, this.f32603w);
                        ((AtomicReference) this.f32606z).set(Collections.emptyList());
                        ((AtomicReference) this.f32606z).notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        v9.o.h(this.f32604x);
                        ((AtomicReference) this.f32606z).set(m2Var.v0(this.f32602v, this.f32603w, this.f32604x));
                    } else {
                        ((AtomicReference) this.f32606z).set(m2Var.i0(null, this.f32602v, this.f32603w));
                    }
                    this.f32605y.s();
                    atomicReference = (AtomicReference) this.f32606z;
                    atomicReference.notify();
                    return;
                }
            default:
                m6 m6Var = this.f32604x;
                String str = this.f32603w;
                String str2 = this.f32602v;
                ?? r32 = this.f32606z;
                l5 l5Var2 = this.f32605y;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        m2 m2Var2 = l5Var2.f32730x;
                        if (m2Var2 == null) {
                            w2 w2Var3 = l5Var2.f32943u.C;
                            y3.k(w2Var3);
                            w2Var3.f32925z.d("Failed to get conditional properties; not connected to service", str2, str);
                            y3Var = l5Var2.f32943u;
                        } else {
                            v9.o.h(m6Var);
                            arrayList = k6.r(m2Var2.v0(str2, str, m6Var));
                            l5Var2.s();
                            y3Var = l5Var2.f32943u;
                        }
                    } catch (RemoteException e11) {
                        w2 w2Var4 = l5Var2.f32943u.C;
                        y3.k(w2Var4);
                        w2Var4.f32925z.e("Failed to get conditional properties; remote exception", str2, str, e11);
                        y3Var = l5Var2.f32943u;
                    }
                    ?? r02 = y3Var.F;
                    y3.i(r02);
                    r32 = (com.google.android.gms.internal.measurement.n0) r32;
                    r02.A(r32, arrayList);
                    return;
                } catch (Throwable th2) {
                    k6 k6Var = l5Var2.f32943u.F;
                    y3.i(k6Var);
                    k6Var.A((com.google.android.gms.internal.measurement.n0) r32, arrayList);
                    throw th2;
                }
        }
    }

    public h5(l5 l5Var, AtomicReference atomicReference, String str, String str2, m6 m6Var) {
        this.f32605y = l5Var;
        this.f32606z = atomicReference;
        this.f32602v = str;
        this.f32603w = str2;
        this.f32604x = m6Var;
    }
}
