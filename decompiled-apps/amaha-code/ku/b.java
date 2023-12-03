package ku;

import dt.n;
import gt.a0;
import java.util.List;
import wu.b0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public class b extends g<List<? extends g<?>>> {

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<a0, b0> f23937b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends g<?>> list, ss.l<? super a0, ? extends b0> computeType) {
        super(list);
        kotlin.jvm.internal.i.g(computeType, "computeType");
        this.f23937b = computeType;
    }

    @Override // ku.g
    public final b0 a(a0 module) {
        kotlin.jvm.internal.i.g(module, "module");
        b0 invoke = this.f23937b.invoke(module);
        if (!dt.j.z(invoke) && !dt.j.G(invoke) && !dt.j.C(invoke, n.a.V.i()) && !dt.j.C(invoke, n.a.W.i()) && !dt.j.C(invoke, n.a.X.i())) {
            dt.j.C(invoke, n.a.Y.i());
        }
        return invoke;
    }
}
