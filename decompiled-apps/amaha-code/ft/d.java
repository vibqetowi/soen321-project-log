package ft;

import gt.a0;
import gt.d0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.l<a0, dt.b> {

    /* renamed from: u  reason: collision with root package name */
    public static final d f15867u = new d();

    public d() {
        super(1);
    }

    @Override // ss.l
    public final dt.b invoke(a0 a0Var) {
        a0 module = a0Var;
        kotlin.jvm.internal.i.g(module, "module");
        List<d0> J = module.H(e.f).J();
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            if (obj instanceof dt.b) {
                arrayList.add(obj);
            }
        }
        return (dt.b) is.u.g2(arrayList);
    }
}
