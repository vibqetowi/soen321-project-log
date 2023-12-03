package ut;

import gt.v0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import v.h;
import wu.a1;
import wu.b0;
import wu.d1;
import wu.f1;
import wu.k1;
import wu.n1;
import wu.u;
/* compiled from: RawProjectionComputer.kt */
/* loaded from: classes2.dex */
public final class e extends sc.b {
    @Override // sc.b
    public final d1 H(v0 v0Var, u typeAttr, a1 typeParameterUpperBoundEraser, b0 erasedUpperBound) {
        i.g(typeAttr, "typeAttr");
        i.g(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        i.g(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof a)) {
            return super.H(v0Var, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        a aVar = (a) typeAttr;
        if (!aVar.f34509c) {
            aVar = aVar.f(1);
        }
        int d10 = h.d(aVar.f34508b);
        n1 n1Var = n1.INVARIANT;
        if (d10 != 0 && d10 != 1) {
            if (d10 == 2) {
                return new f1(erasedUpperBound, n1Var);
            }
            throw new NoWhenBranchMatchedException();
        } else if (!v0Var.O().f37279v) {
            return new f1(mu.a.e(v0Var).o(), n1Var);
        } else {
            List<v0> parameters = erasedUpperBound.O0().getParameters();
            i.f(parameters, "erasedUpperBound.constructor.parameters");
            if (true ^ parameters.isEmpty()) {
                return new f1(erasedUpperBound, n1.OUT_VARIANCE);
            }
            return k1.n(v0Var, aVar);
        }
    }
}
