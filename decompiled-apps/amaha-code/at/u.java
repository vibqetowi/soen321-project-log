package at;

import at.g0;
import at.n0;
import ys.h;
/* compiled from: KProperty0Impl.kt */
/* loaded from: classes2.dex */
public final class u<V> extends c0<V> implements ys.h {
    public final n0.b<a<V>> H;

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes2.dex */
    public static final class a<R> extends g0.c<R> implements ss.l {
        public final u<R> B;

        public a(u<R> property) {
            kotlin.jvm.internal.i.g(property, "property");
            this.B = property;
        }

        @Override // at.g0.a
        public final g0 A() {
            return this.B;
        }

        @Override // ss.l
        public final Object invoke(Object obj) {
            a<R> invoke = this.B.H.invoke();
            kotlin.jvm.internal.i.f(invoke, "_setter()");
            invoke.call(obj);
            return hs.k.f19476a;
        }
    }

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<a<V>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ u<V> f3607u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u<V> uVar) {
            super(0);
            this.f3607u = uVar;
        }

        @Override // ss.a
        public final Object invoke() {
            return new a(this.f3607u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o container, gt.k0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        this.H = n0.b(new b(this));
    }

    @Override // ys.h
    public final h.a h() {
        a<V> invoke = this.H.invoke();
        kotlin.jvm.internal.i.f(invoke, "_setter()");
        return invoke;
    }
}
