package qt;

import dt.n;
import gt.a0;
import gt.z0;
import ss.l;
import wu.b0;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements l<a0, b0> {

    /* renamed from: u  reason: collision with root package name */
    public static final d f30120u = new d();

    public d() {
        super(1);
    }

    @Override // ss.l
    public final b0 invoke(a0 a0Var) {
        b0 b0Var;
        a0 module = a0Var;
        kotlin.jvm.internal.i.g(module, "module");
        z0 I = sc.b.I(c.f30117b, module.o().j(n.a.f13414t));
        if (I != null) {
            b0Var = I.a();
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            return yu.i.c(yu.h.W, new String[0]);
        }
        return b0Var;
    }
}
