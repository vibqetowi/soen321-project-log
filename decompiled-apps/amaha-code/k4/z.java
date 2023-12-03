package k4;

import i4.d;
import k4.h;
import o4.n;
/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class z implements d.a<Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n.a f22957u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a0 f22958v;

    public z(a0 a0Var, n.a aVar) {
        this.f22958v = a0Var;
        this.f22957u = aVar;
    }

    @Override // i4.d.a
    public final void d(Exception exc) {
        boolean z10;
        a0 a0Var = this.f22958v;
        n.a<?> aVar = this.f22957u;
        n.a<?> aVar2 = a0Var.f22823z;
        if (aVar2 != null && aVar2 == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f fVar = a0Var.A;
            i4.d<?> dVar = aVar.f27081c;
            a0Var.f22819v.f(fVar, exc, dVar, dVar.e());
        }
    }

    @Override // i4.d.a
    public final void f(Object obj) {
        boolean z10;
        a0 a0Var = this.f22958v;
        n.a<?> aVar = this.f22957u;
        n.a<?> aVar2 = a0Var.f22823z;
        if (aVar2 != null && aVar2 == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            l lVar = a0Var.f22818u.f22857p;
            if (obj != null && lVar.c(aVar.f27081c.e())) {
                a0Var.f22822y = obj;
                a0Var.f22819v.d();
                return;
            }
            h.a aVar3 = a0Var.f22819v;
            h4.e eVar = aVar.f27079a;
            i4.d<?> dVar = aVar.f27081c;
            aVar3.h(eVar, obj, dVar, dVar.e(), a0Var.A);
        }
    }
}
