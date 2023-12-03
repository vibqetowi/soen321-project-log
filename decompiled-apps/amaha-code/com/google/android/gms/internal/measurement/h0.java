package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final x1 f8398a;

    /* renamed from: b  reason: collision with root package name */
    public v.c f8399b;

    /* renamed from: c  reason: collision with root package name */
    public final s1.s f8400c;

    /* renamed from: d  reason: collision with root package name */
    public final ta f8401d;

    public h0() {
        x1 x1Var = new x1();
        this.f8398a = x1Var;
        this.f8399b = x1Var.f8681b.h();
        this.f8400c = new s1.s(11);
        this.f8401d = new ta();
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ h0 f8299v;

            {
                this.f8299v = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i6 = r2;
                h0 h0Var = this.f8299v;
                switch (i6) {
                    case 0:
                        return new r5(h0Var.f8401d);
                    default:
                        return new r5(h0Var.f8400c);
                }
            }
        };
        y4 y4Var = x1Var.f8683d;
        y4Var.f8701a.put("internal.registerCallback", callable);
        y4Var.f8701a.put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ h0 f8299v;

            {
                this.f8299v = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i6 = r2;
                h0 h0Var = this.f8299v;
                switch (i6) {
                    case 0:
                        return new r5(h0Var.f8401d);
                    default:
                        return new r5(h0Var.f8400c);
                }
            }
        });
    }

    public final void a(h3 h3Var) {
        i iVar;
        x1 x1Var = this.f8398a;
        try {
            this.f8399b = x1Var.f8681b.h();
            if (!(x1Var.a(this.f8399b, (j3[]) h3Var.w().toArray(new j3[0])) instanceof g)) {
                for (g3 g3Var : h3Var.u().x()) {
                    b6 w10 = g3Var.w();
                    String v10 = g3Var.v();
                    Iterator it = w10.iterator();
                    while (it.hasNext()) {
                        o a10 = x1Var.a(this.f8399b, (j3) it.next());
                        if (a10 instanceof l) {
                            v.c cVar = this.f8399b;
                            if (!cVar.s(v10)) {
                                iVar = null;
                            } else {
                                o m10 = cVar.m(v10);
                                if (m10 instanceof i) {
                                    iVar = (i) m10;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(v10)));
                                }
                            }
                            if (iVar != null) {
                                iVar.a(this.f8399b, Collections.singletonList(a10));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(v10)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    public final boolean b(b bVar) {
        s1.s sVar = this.f8400c;
        try {
            sVar.f31224v = bVar;
            sVar.f31225w = bVar.clone();
            ((List) sVar.f31226x).clear();
            this.f8398a.f8682c.r("runtime.counter", new h(Double.valueOf(0.0d)));
            this.f8401d.a(this.f8399b.h(), sVar);
            if (!(!((b) sVar.f31225w).equals((b) sVar.f31224v))) {
                if (!(!((List) sVar.f31226x).isEmpty())) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }
}
