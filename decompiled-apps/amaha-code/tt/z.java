package tt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import wu.b0;
import wu.c0;
import wu.i0;
import wu.k1;
import wu.n1;
/* compiled from: LazyJavaTypeParameterDescriptor.kt */
/* loaded from: classes2.dex */
public final class z extends kt.c {
    public final q.f E;
    public final wt.x F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q.f fVar, wt.x javaTypeParameter, int i6, gt.j containingDeclaration) {
        super(fVar.b(), containingDeclaration, new st.e(fVar, javaTypeParameter, false), javaTypeParameter.getName(), n1.INVARIANT, false, i6, ((st.c) fVar.f29104v).f31945m);
        kotlin.jvm.internal.i.g(javaTypeParameter, "javaTypeParameter");
        kotlin.jvm.internal.i.g(containingDeclaration, "containingDeclaration");
        this.E = fVar;
        this.F = javaTypeParameter;
    }

    @Override // kt.k
    public final List<b0> I0(List<? extends b0> list) {
        b0 b10;
        q.f fVar = this.E;
        xt.s sVar = ((st.c) fVar.f29104v).r;
        sVar.getClass();
        ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
        for (b0 b0Var : list) {
            xt.r predicate = xt.r.f38076u;
            kotlin.jvm.internal.i.g(b0Var, "<this>");
            kotlin.jvm.internal.i.g(predicate, "predicate");
            if (!k1.c(b0Var, predicate) && (b10 = sVar.b(new xt.u(this, false, fVar, pt.c.TYPE_PARAMETER_BOUNDS), b0Var, is.w.f20676u, null, false)) != null) {
                b0Var = b10;
            }
            arrayList.add(b0Var);
        }
        return arrayList;
    }

    @Override // kt.k
    public final void M0(b0 type) {
        kotlin.jvm.internal.i.g(type, "type");
    }

    @Override // kt.k
    public final List<b0> N0() {
        Collection<wt.j> upperBounds = this.F.getUpperBounds();
        boolean isEmpty = upperBounds.isEmpty();
        q.f fVar = this.E;
        if (isEmpty) {
            i0 f = fVar.a().o().f();
            kotlin.jvm.internal.i.f(f, "c.module.builtIns.anyType");
            i0 p10 = fVar.a().o().p();
            kotlin.jvm.internal.i.f(p10, "c.module.builtIns.nullableAnyType");
            return ca.a.O0(c0.c(f, p10));
        }
        ArrayList arrayList = new ArrayList(is.i.H1(upperBounds, 10));
        for (wt.j jVar : upperBounds) {
            arrayList.add(((ut.c) fVar.f29108z).e(jVar, ca.a.u1(2, false, false, this, 3)));
        }
        return arrayList;
    }
}
