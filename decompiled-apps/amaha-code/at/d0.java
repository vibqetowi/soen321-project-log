package at;

import at.g0;
import at.n0;
import java.lang.reflect.Member;
import ys.l;
/* compiled from: KProperty1Impl.kt */
/* loaded from: classes2.dex */
public class d0<T, V> extends g0<V> implements ys.l<T, V> {
    public final n0.b<a<T, V>> F;
    public final hs.d<Member> G;

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes2.dex */
    public static final class a<T, V> extends g0.b<V> implements l.a<T, V> {
        public final d0<T, V> B;

        /* JADX WARN: Multi-variable type inference failed */
        public a(d0<T, ? extends V> property) {
            kotlin.jvm.internal.i.g(property, "property");
            this.B = property;
        }

        @Override // at.g0.a
        public final g0 A() {
            return this.B;
        }

        @Override // ss.l
        public final V invoke(T t3) {
            return this.B.get(t3);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<a<T, ? extends V>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ d0<T, V> f3493u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d0<T, ? extends V> d0Var) {
            super(0);
            this.f3493u = d0Var;
        }

        @Override // ss.a
        public final Object invoke() {
            return new a(this.f3493u);
        }
    }

    /* compiled from: KProperty1Impl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<Member> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ d0<T, V> f3494u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(d0<T, ? extends V> d0Var) {
            super(0);
            this.f3494u = d0Var;
        }

        @Override // ss.a
        public final Member invoke() {
            return this.f3494u.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(o container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(signature, "signature");
        this.F = new n0.b<>(new b(this));
        this.G = sp.b.N(2, new c(this));
    }

    @Override // ys.l
    /* renamed from: C */
    public final a<T, V> n() {
        a<T, V> invoke = this.F.invoke();
        kotlin.jvm.internal.i.f(invoke, "_getter()");
        return invoke;
    }

    @Override // ys.l
    public final V get(T t3) {
        return n().call(t3);
    }

    @Override // ss.l
    public final V invoke(T t3) {
        return get(t3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(o container, gt.k0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        this.F = new n0.b<>(new b(this));
        this.G = sp.b.N(2, new c(this));
    }
}
