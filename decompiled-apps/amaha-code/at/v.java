package at;

import at.g0;
import at.n0;
import ys.h;
import ys.i;
/* compiled from: KProperty1Impl.kt */
/* loaded from: classes2.dex */
public final class v<T, V> extends d0<T, V> implements ys.i<T, V> {
    public final n0.b<a<T, V>> H;

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes2.dex */
    public static final class a<T, V> extends g0.c<V> implements i.a<T, V> {
        public final v<T, V> B;

        public a(v<T, V> property) {
            kotlin.jvm.internal.i.g(property, "property");
            this.B = property;
        }

        @Override // at.g0.a
        public final g0 A() {
            return this.B;
        }

        @Override // ss.p
        public final hs.k invoke(Object obj, Object obj2) {
            a<T, V> invoke = this.B.H.invoke();
            kotlin.jvm.internal.i.f(invoke, "_setter()");
            invoke.call(obj, obj2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<a<T, V>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ v<T, V> f3610u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v<T, V> vVar) {
            super(0);
            this.f3610u = vVar;
        }

        @Override // ss.a
        public final Object invoke() {
            return new a(this.f3610u);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(signature, "signature");
        this.H = n0.b(new b(this));
    }

    @Override // ys.i, ys.h
    public final h.a h() {
        a<T, V> invoke = this.H.invoke();
        kotlin.jvm.internal.i.f(invoke, "_setter()");
        return invoke;
    }

    @Override // ys.i, ys.h
    public final i.a h() {
        a<T, V> invoke = this.H.invoke();
        kotlin.jvm.internal.i.f(invoke, "_setter()");
        return invoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o container, gt.k0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        this.H = n0.b(new b(this));
    }
}
