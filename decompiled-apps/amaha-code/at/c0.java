package at;

import at.g0;
import at.n0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
/* compiled from: KProperty0Impl.kt */
/* loaded from: classes2.dex */
public class c0<V> extends g0<V> implements ys.k<V> {
    public final n0.b<a<V>> F;
    public final hs.d<Object> G;

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes2.dex */
    public static final class a<R> extends g0.b<R> implements ss.a {
        public final c0<R> B;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c0<? extends R> property) {
            kotlin.jvm.internal.i.g(property, "property");
            this.B = property;
        }

        @Override // at.g0.a
        public final g0 A() {
            return this.B;
        }

        @Override // ss.a
        public final R invoke() {
            return this.B.B().call(new Object[0]);
        }
    }

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<a<? extends V>> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ c0<V> f3481u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c0<? extends V> c0Var) {
            super(0);
            this.f3481u = c0Var;
        }

        @Override // ss.a
        public final Object invoke() {
            return new a(this.f3481u);
        }
    }

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ c0<V> f3482u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(c0<? extends V> c0Var) {
            super(0);
            this.f3482u = c0Var;
        }

        @Override // ss.a
        public final Object invoke() {
            Object obj;
            boolean z10;
            AccessibleObject accessibleObject;
            c0<V> c0Var = this.f3482u;
            Member z11 = c0Var.z();
            try {
                Object obj2 = g0.E;
                if (c0Var.w()) {
                    obj = sp.b.f(c0Var.B, c0Var.t());
                } else {
                    obj = null;
                }
                if (obj != obj2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    obj = null;
                }
                c0Var.w();
                if (z11 instanceof AccessibleObject) {
                    accessibleObject = (AccessibleObject) z11;
                } else {
                    accessibleObject = null;
                }
                if (accessibleObject != null) {
                    accessibleObject.setAccessible(sp.b.I(c0Var));
                }
                if (z11 == null) {
                    return null;
                }
                if (z11 instanceof Field) {
                    return ((Field) z11).get(obj);
                }
                if (z11 instanceof Method) {
                    int length = ((Method) z11).getParameterTypes().length;
                    if (length != 0) {
                        if (length != 1) {
                            if (length == 2) {
                                Method method = (Method) z11;
                                Class<?> cls = ((Method) z11).getParameterTypes()[1];
                                kotlin.jvm.internal.i.f(cls, "fieldOrMethod.parameterTypes[1]");
                                return method.invoke(null, obj, t0.e(cls));
                            }
                            throw new AssertionError("delegate method " + z11 + " should take 0, 1, or 2 parameters");
                        }
                        Method method2 = (Method) z11;
                        Object[] objArr = new Object[1];
                        if (obj == null) {
                            Class<?> cls2 = ((Method) z11).getParameterTypes()[0];
                            kotlin.jvm.internal.i.f(cls2, "fieldOrMethod.parameterTypes[0]");
                            obj = t0.e(cls2);
                        }
                        objArr[0] = obj;
                        return method2.invoke(null, objArr);
                    }
                    return ((Method) z11).invoke(null, new Object[0]);
                }
                throw new AssertionError("delegate field/method " + z11 + " neither field nor method");
            } catch (IllegalAccessException e10) {
                throw new IllegalPropertyDelegateAccessException(e10);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(o container, gt.k0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        this.F = new n0.b<>(new b(this));
        this.G = sp.b.N(2, new c(this));
    }

    @Override // at.g0
    /* renamed from: C */
    public final a<V> B() {
        a<V> invoke = this.F.invoke();
        kotlin.jvm.internal.i.f(invoke, "_getter()");
        return invoke;
    }

    @Override // ss.a
    public final V invoke() {
        return B().call(new Object[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(o container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(signature, "signature");
        this.F = new n0.b<>(new b(this));
        this.G = sp.b.N(2, new c(this));
    }
}
