package kt;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ModuleDescriptorImpl.kt */
/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.k implements ss.a<o> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g0 f23834u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var) {
        super(0);
        this.f23834u = g0Var;
    }

    @Override // ss.a
    public final o invoke() {
        g0 g0Var = this.f23834u;
        c0 c0Var = g0Var.A;
        if (c0Var != null) {
            List<g0> a10 = c0Var.a();
            g0Var.D0();
            a10.contains(g0Var);
            for (g0 g0Var2 : a10) {
                g0Var2.getClass();
            }
            ArrayList arrayList = new ArrayList(is.i.H1(a10, 10));
            for (g0 g0Var3 : a10) {
                gt.e0 e0Var = g0Var3.B;
                kotlin.jvm.internal.i.d(e0Var);
                arrayList.add(e0Var);
            }
            return new o("CompositeProvider@ModuleDescriptor for " + g0Var.getName(), arrayList);
        }
        StringBuilder sb2 = new StringBuilder("Dependencies of module ");
        String str = g0Var.getName().f15930u;
        kotlin.jvm.internal.i.f(str, "name.toString()");
        sb2.append(str);
        sb2.append(" were not set before querying module content");
        throw new AssertionError(sb2.toString());
    }
}
