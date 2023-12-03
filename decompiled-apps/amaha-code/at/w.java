package at;

import at.g0;
import at.n0;
import ys.h;
/* compiled from: KProperty2Impl.kt */
/* loaded from: classes2.dex */
public final class w<D, E, V> extends e0<D, E, V> implements ys.h {
    public final n0.b<a<D, E, V>> H;

    /* compiled from: KProperty2Impl.kt */
    /* loaded from: classes2.dex */
    public static final class a<D, E, V> extends g0.c<V> implements ss.q {
        public final w<D, E, V> B;

        public a(w<D, E, V> property) {
            kotlin.jvm.internal.i.g(property, "property");
            this.B = property;
        }

        @Override // at.g0.a
        public final g0 A() {
            return this.B;
        }

        @Override // ss.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            a<D, E, V> invoke = this.B.H.invoke();
            kotlin.jvm.internal.i.f(invoke, "_setter()");
            invoke.call(obj, obj2, obj3);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o container, gt.k0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        this.H = n0.b(new f0(this, 2));
    }

    @Override // ys.h
    public final h.a h() {
        a<D, E, V> invoke = this.H.invoke();
        kotlin.jvm.internal.i.f(invoke, "_setter()");
        return invoke;
    }
}
