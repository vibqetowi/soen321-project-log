package dt;

import gt.p;
import gt.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kt.h0;
import kt.t0;
import vu.c;
import wu.n1;
/* compiled from: suspendFunctionTypes.kt */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f13421a;

    static {
        yu.i iVar = yu.i.f39090a;
        kt.r rVar = new kt.r(yu.i.f39091b, n.f13385d);
        fu.e f = n.f13386e.f();
        c.a aVar = vu.c.f36140e;
        h0 h0Var = new h0(rVar, f, aVar);
        h0Var.D = z.ABSTRACT;
        p.h hVar = gt.p.f16804e;
        if (hVar != null) {
            h0Var.E = hVar;
            List O0 = ca.a.O0(t0.Q0(h0Var, n1.IN_VARIANCE, fu.e.j("T"), 0, aVar));
            if (h0Var.G == null) {
                ArrayList arrayList = new ArrayList(O0);
                h0Var.G = arrayList;
                h0Var.F = new wu.k(h0Var, arrayList, h0Var.H, h0Var.I);
                Set<gt.d> emptySet = Collections.emptySet();
                if (emptySet != null) {
                    for (gt.d dVar : emptySet) {
                        ((kt.l) dVar).U0(h0Var.r());
                    }
                    f13421a = h0Var;
                    return;
                }
                h0.D0(13);
                throw null;
            }
            throw new IllegalStateException("Type parameters are already set for " + h0Var.getName());
        }
        h0.D0(9);
        throw null;
    }
}
