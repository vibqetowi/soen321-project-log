package ku;

import gt.a0;
import wu.b0;
import wu.i0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public final class j extends g<hs.f<? extends fu.b, ? extends fu.e>> {

    /* renamed from: b  reason: collision with root package name */
    public final fu.b f23944b;

    /* renamed from: c  reason: collision with root package name */
    public final fu.e f23945c;

    public j(fu.b bVar, fu.e eVar) {
        super(new hs.f(bVar, eVar));
        this.f23944b = bVar;
        this.f23945c = eVar;
    }

    @Override // ku.g
    public final b0 a(a0 module) {
        kotlin.jvm.internal.i.g(module, "module");
        fu.b bVar = this.f23944b;
        gt.e a10 = gt.t.a(module, bVar);
        i0 i0Var = null;
        if (a10 != null) {
            if (!iu.g.n(a10, 3)) {
                a10 = null;
            }
            if (a10 != null) {
                i0Var = a10.r();
            }
        }
        if (i0Var == null) {
            yu.h hVar = yu.h.U;
            String bVar2 = bVar.toString();
            kotlin.jvm.internal.i.f(bVar2, "enumClassId.toString()");
            String str = this.f23945c.f15930u;
            kotlin.jvm.internal.i.f(str, "enumEntryName.toString()");
            return yu.i.c(hVar, bVar2, str);
        }
        return i0Var;
    }

    @Override // ku.g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23944b.j());
        sb2.append('.');
        sb2.append(this.f23945c);
        return sb2.toString();
    }
}
