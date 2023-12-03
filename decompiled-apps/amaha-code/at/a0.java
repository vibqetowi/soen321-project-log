package at;

import gt.b;
import java.lang.reflect.Type;
/* compiled from: KParameterImpl.kt */
/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.k implements ss.a<Type> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b0 f3465u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var) {
        super(0);
        this.f3465u = b0Var;
    }

    @Override // ss.a
    public final Type invoke() {
        b0 b0Var = this.f3465u;
        gt.i0 e10 = b0Var.e();
        boolean z10 = e10 instanceof gt.n0;
        e<?> eVar = b0Var.f3468u;
        if (z10 && kotlin.jvm.internal.i.b(t0.g(eVar.t()), e10) && eVar.t().m0() == b.a.FAKE_OVERRIDE) {
            gt.j c10 = eVar.t().c();
            kotlin.jvm.internal.i.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> j10 = t0.j((gt.e) c10);
            if (j10 == null) {
                throw new hs.e("Cannot determine receiver Java type of inherited declaration: " + e10, 2);
            }
            return j10;
        }
        return eVar.o().a().get(b0Var.f3469v);
    }
}
