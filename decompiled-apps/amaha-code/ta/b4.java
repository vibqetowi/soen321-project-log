package ta;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class b4 implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32481u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f32482v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f32483w;

    public /* synthetic */ b4(Object obj, int i6, Object obj2) {
        this.f32481u = i6;
        this.f32483w = obj;
        this.f32482v = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6 = this.f32481u;
        Object obj = this.f32482v;
        Object obj2 = this.f32483w;
        switch (i6) {
            case 0:
                d4 d4Var = (d4) obj2;
                d4Var.f32521a.e();
                k kVar = d4Var.f32521a.f32532w;
                d6.H(kVar);
                return kVar.L((String) obj);
            default:
                d6 d6Var = (d6) obj2;
                m6 m6Var = (m6) obj;
                String str = m6Var.f32748u;
                v9.o.h(str);
                h K = d6Var.K(str);
                g gVar = g.ANALYTICS_STORAGE;
                if (K.f(gVar) && h.b(m6Var.P).f(gVar)) {
                    return d6Var.I(m6Var).E();
                }
                d6Var.b().H.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
