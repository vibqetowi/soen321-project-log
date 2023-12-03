package at;

import at.g0;
import at.n0;
import java.lang.reflect.Member;
/* compiled from: KProperty2Impl.kt */
/* loaded from: classes2.dex */
public class e0<D, E, V> extends g0<V> implements ss.p {
    public final n0.b<a<D, E, V>> F;
    public final hs.d<Member> G;

    /* compiled from: KProperty2Impl.kt */
    /* loaded from: classes2.dex */
    public static final class a<D, E, V> extends g0.b<V> implements ss.p {
        public final e0<D, E, V> B;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e0<D, E, ? extends V> property) {
            kotlin.jvm.internal.i.g(property, "property");
            this.B = property;
        }

        @Override // at.g0.a
        public final g0 A() {
            return this.B;
        }

        @Override // ss.p
        public final V invoke(D d10, E e10) {
            a<D, E, V> invoke = this.B.F.invoke();
            kotlin.jvm.internal.i.f(invoke, "_getter()");
            return invoke.call(d10, e10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(o container, gt.k0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        this.F = new n0.b<>(new f0(this, 0));
        this.G = sp.b.N(2, new f0(this, 1));
    }

    @Override // at.g0
    public final g0.b B() {
        a<D, E, V> invoke = this.F.invoke();
        kotlin.jvm.internal.i.f(invoke, "_getter()");
        return invoke;
    }

    @Override // ss.p
    public final V invoke(D d10, E e10) {
        a<D, E, V> invoke = this.F.invoke();
        kotlin.jvm.internal.i.f(invoke, "_getter()");
        return invoke.call(d10, e10);
    }
}
