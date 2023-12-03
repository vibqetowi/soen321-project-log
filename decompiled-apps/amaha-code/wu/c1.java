package wu;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import wu.a1;
import wu.z0;
/* compiled from: TypeParameterUpperBoundEraser.kt */
/* loaded from: classes2.dex */
public final class c1 extends kotlin.jvm.internal.k implements ss.l<a1.a, b0> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a1 f37217u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a1 a1Var) {
        super(1);
        this.f37217u = a1Var;
    }

    @Override // ss.l
    public final b0 invoke(a1.a aVar) {
        d1 H;
        a1.a aVar2 = aVar;
        gt.v0 v0Var = aVar2.f37206a;
        a1 a1Var = this.f37217u;
        a1Var.getClass();
        u uVar = aVar2.f37207b;
        Set<gt.v0> c10 = uVar.c();
        if (c10 != null && c10.contains(v0Var.b())) {
            return a1Var.a(uVar);
        }
        i0 r = v0Var.r();
        kotlin.jvm.internal.i.f(r, "typeParameter.defaultType");
        LinkedHashSet<gt.v0> linkedHashSet = new LinkedHashSet();
        hc.d.v(r, r, linkedHashSet, c10);
        int P = sp.b.P(is.i.H1(linkedHashSet, 10));
        if (P < 16) {
            P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P);
        for (gt.v0 v0Var2 : linkedHashSet) {
            if (c10 != null && c10.contains(v0Var2)) {
                H = k1.n(v0Var2, uVar);
            } else {
                H = a1Var.f37202a.H(v0Var2, uVar, a1Var, a1Var.b(v0Var2, uVar.d(v0Var)));
            }
            linkedHashMap.put(v0Var2.l(), H);
        }
        z0.a aVar3 = z0.f37326b;
        boolean z10 = false;
        j1 e10 = j1.e(new y0(linkedHashMap, false));
        List<b0> upperBounds = v0Var.getUpperBounds();
        kotlin.jvm.internal.i.f(upperBounds, "typeParameter.upperBounds");
        js.g c11 = a1Var.c(e10, upperBounds, uVar);
        if (!c11.isEmpty()) {
            a1Var.f37203b.getClass();
            if (c11.g() == 1) {
                z10 = true;
            }
            if (z10) {
                return (b0) is.u.x2(c11);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
        }
        return a1Var.a(uVar);
    }
}
