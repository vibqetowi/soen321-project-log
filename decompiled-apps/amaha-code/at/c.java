package at;

import eu.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
/* compiled from: RuntimeTypeMapper.kt */
/* loaded from: classes2.dex */
public abstract class c {

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final List<Method> f3472a;

        /* compiled from: RuntimeTypeMapper.kt */
        /* renamed from: at.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0053a extends kotlin.jvm.internal.k implements ss.l<Method, CharSequence> {

            /* renamed from: u  reason: collision with root package name */
            public static final C0053a f3473u = new C0053a();

            public C0053a() {
                super(1);
            }

            @Override // ss.l
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                kotlin.jvm.internal.i.f(returnType, "it.returnType");
                return nt.d.b(returnType);
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class b<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return sp.b.g(((Method) t3).getName(), ((Method) t10).getName());
            }
        }

        public a(Class<?> jClass) {
            kotlin.jvm.internal.i.g(jClass, "jClass");
            Method[] declaredMethods = jClass.getDeclaredMethods();
            kotlin.jvm.internal.i.f(declaredMethods, "jClass.declaredMethods");
            this.f3472a = is.k.f2(declaredMethods, new b());
        }

        @Override // at.c
        public final String a() {
            return is.u.m2(this.f3472a, "", "<init>(", ")V", C0053a.f3473u, 24);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Constructor<?> f3474a;

        /* compiled from: RuntimeTypeMapper.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.l<Class<?>, CharSequence> {

            /* renamed from: u  reason: collision with root package name */
            public static final a f3475u = new a();

            public a() {
                super(1);
            }

            @Override // ss.l
            public final CharSequence invoke(Class<?> cls) {
                Class<?> it = cls;
                kotlin.jvm.internal.i.f(it, "it");
                return nt.d.b(it);
            }
        }

        public b(Constructor<?> constructor) {
            kotlin.jvm.internal.i.g(constructor, "constructor");
            this.f3474a = constructor;
        }

        @Override // at.c
        public final String a() {
            Class<?>[] parameterTypes = this.f3474a.getParameterTypes();
            kotlin.jvm.internal.i.f(parameterTypes, "constructor.parameterTypes");
            return is.k.Z1(parameterTypes, "", "<init>(", ")V", a.f3475u, 24);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: at.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0054c extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Method f3476a;

        public C0054c(Method method) {
            this.f3476a = method;
        }

        @Override // at.c
        public final String a() {
            return sp.b.c(this.f3476a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes2.dex */
    public static final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public final d.b f3477a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3478b;

        public d(d.b bVar) {
            this.f3477a = bVar;
            this.f3478b = bVar.a();
        }

        @Override // at.c
        public final String a() {
            return this.f3478b;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* loaded from: classes2.dex */
    public static final class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public final d.b f3479a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3480b;

        public e(d.b bVar) {
            this.f3479a = bVar;
            this.f3480b = bVar.a();
        }

        @Override // at.c
        public final String a() {
            return this.f3480b;
        }
    }

    public abstract String a();
}
