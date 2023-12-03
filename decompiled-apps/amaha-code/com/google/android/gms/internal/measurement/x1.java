package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.appcompat.widget.l f8680a;

    /* renamed from: b  reason: collision with root package name */
    public final v.c f8681b;

    /* renamed from: c  reason: collision with root package name */
    public final v.c f8682c;

    /* renamed from: d  reason: collision with root package name */
    public final y4 f8683d;

    public x1() {
        androidx.appcompat.widget.l lVar = new androidx.appcompat.widget.l(22);
        this.f8680a = lVar;
        v.c cVar = new v.c((v.c) null, lVar);
        this.f8682c = cVar;
        this.f8681b = cVar.h();
        y4 y4Var = new y4();
        this.f8683d = y4Var;
        cVar.r("require", new sa(y4Var));
        y4Var.f8701a.put("internal.platform", h1.f8402u);
        cVar.r("runtime.counter", new h(Double.valueOf(0.0d)));
    }

    public final o a(v.c cVar, j3... j3VarArr) {
        o oVar = o.f8520d;
        for (j3 j3Var : j3VarArr) {
            oVar = g4.a(j3Var);
            l3.c(this.f8682c);
            if ((oVar instanceof p) || (oVar instanceof n)) {
                oVar = this.f8680a.z(cVar, oVar);
            }
        }
        return oVar;
    }
}
