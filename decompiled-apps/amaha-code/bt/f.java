package bt;

import bt.e;
import is.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import vr.b1;
/* compiled from: CallerImpl.kt */
/* loaded from: classes2.dex */
public abstract class f<M extends Member> implements bt.e<M> {

    /* renamed from: a  reason: collision with root package name */
    public final M f4688a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f4689b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f4690c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Type> f4691d;

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f<Constructor<?>> implements bt.d {

        /* renamed from: e  reason: collision with root package name */
        public final Object f4692e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Constructor<?> constructor, Object obj) {
            super(constructor, r0, null, (Type[]) r1);
            Object L1;
            kotlin.jvm.internal.i.g(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.i.f(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.i.f(genericParameterTypes, "constructor.genericParameterTypes");
            if (genericParameterTypes.length <= 2) {
                L1 = new Type[0];
            } else {
                L1 = is.i.L1(1, genericParameterTypes.length - 1, genericParameterTypes);
            }
            this.f4692e = obj;
        }

        @Override // bt.e
        public final Object call(Object[] args) {
            kotlin.jvm.internal.i.g(args, "args");
            e.a.a(this, args);
            b1 b1Var = new b1(3);
            b1Var.a(this.f4692e);
            b1Var.b(args);
            b1Var.a(null);
            return ((Constructor) this.f4688a).newInstance(b1Var.e(new Object[b1Var.d()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(Constructor<?> constructor) {
            super(constructor, r0, null, (Type[]) r1);
            Object L1;
            kotlin.jvm.internal.i.g(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.i.f(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.i.f(genericParameterTypes, "constructor.genericParameterTypes");
            if (genericParameterTypes.length <= 1) {
                L1 = new Type[0];
            } else {
                L1 = is.i.L1(0, genericParameterTypes.length - 1, genericParameterTypes);
            }
        }

        @Override // bt.e
        public final Object call(Object[] args) {
            kotlin.jvm.internal.i.g(args, "args");
            e.a.a(this, args);
            b1 b1Var = new b1(2);
            b1Var.b(args);
            b1Var.a(null);
            return ((Constructor) this.f4688a).newInstance(b1Var.e(new Object[b1Var.d()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends f<Constructor<?>> implements bt.d {

        /* renamed from: e  reason: collision with root package name */
        public final Object f4693e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(Constructor<?> constructor, Object obj) {
            super(constructor, r0, null, r1);
            kotlin.jvm.internal.i.g(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.i.f(declaringClass, "constructor.declaringClass");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.i.f(genericParameterTypes, "constructor.genericParameterTypes");
            this.f4693e = obj;
        }

        @Override // bt.e
        public final Object call(Object[] args) {
            kotlin.jvm.internal.i.g(args, "args");
            e.a.a(this, args);
            b1 b1Var = new b1(2);
            b1Var.a(this.f4693e);
            b1Var.b(args);
            return ((Constructor) this.f4688a).newInstance(b1Var.e(new Object[b1Var.d()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class d extends f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(Constructor<?> constructor) {
            super(constructor, r0, r2, r1);
            kotlin.jvm.internal.i.g(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            kotlin.jvm.internal.i.f(declaringClass, "constructor.declaringClass");
            Class<?> declaringClass2 = constructor.getDeclaringClass();
            Class<?> cls = (declaringClass2.getDeclaringClass() == null || Modifier.isStatic(declaringClass2.getModifiers())) ? null : null;
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            kotlin.jvm.internal.i.f(genericParameterTypes, "constructor.genericParameterTypes");
        }

        @Override // bt.e
        public final Object call(Object[] args) {
            kotlin.jvm.internal.i.g(args, "args");
            e.a.a(this, args);
            return ((Constructor) this.f4688a).newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes2.dex */
    public static abstract class e extends f<Field> {

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class a extends e implements bt.d {

            /* renamed from: e  reason: collision with root package name */
            public final Object f4694e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false);
                kotlin.jvm.internal.i.g(field, "field");
                this.f4694e = obj;
            }

            @Override // bt.f.e, bt.e
            public final Object call(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                e.a.a(this, args);
                return ((Field) this.f4688a).get(this.f4694e);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class b extends e implements bt.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false);
                kotlin.jvm.internal.i.g(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class c extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true);
                kotlin.jvm.internal.i.g(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class d extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true);
                kotlin.jvm.internal.i.g(field, "field");
            }

            @Override // bt.f
            public final void c(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                e.a.a(this, args);
                d(k.T1(args));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: bt.f$e$e  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0095e extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0095e(Field field) {
                super(field, false);
                kotlin.jvm.internal.i.g(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(Field field, boolean z10) {
            super(field, r0, r4, new Type[0]);
            Class<?> cls;
            Type genericType = field.getGenericType();
            kotlin.jvm.internal.i.f(genericType, "field.genericType");
            if (z10) {
                cls = field.getDeclaringClass();
            } else {
                cls = null;
            }
        }

        @Override // bt.e
        public Object call(Object[] args) {
            Object obj;
            kotlin.jvm.internal.i.g(args, "args");
            c(args);
            Field field = (Field) this.f4688a;
            if (this.f4690c != null) {
                obj = k.S1(args);
            } else {
                obj = null;
            }
            return field.get(obj);
        }
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: bt.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0096f extends f<Field> {

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4695e;

        /* compiled from: CallerImpl.kt */
        /* renamed from: bt.f$f$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC0096f implements bt.d {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false);
                kotlin.jvm.internal.i.g(field, "field");
                this.f = obj;
            }

            @Override // bt.f.AbstractC0096f, bt.e
            public final Object call(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                c(args);
                ((Field) this.f4688a).set(this.f, k.S1(args));
                return hs.k.f19476a;
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: bt.f$f$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC0096f implements bt.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false);
                kotlin.jvm.internal.i.g(field, "field");
            }

            @Override // bt.f.AbstractC0096f, bt.e
            public final Object call(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                c(args);
                ((Field) this.f4688a).set(null, k.a2(args));
                return hs.k.f19476a;
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: bt.f$f$c */
        /* loaded from: classes2.dex */
        public static final class c extends AbstractC0096f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true);
                kotlin.jvm.internal.i.g(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: bt.f$f$d */
        /* loaded from: classes2.dex */
        public static final class d extends AbstractC0096f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true);
                kotlin.jvm.internal.i.g(field, "field");
            }

            @Override // bt.f.AbstractC0096f, bt.f
            public final void c(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                super.c(args);
                d(k.T1(args));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: bt.f$f$e */
        /* loaded from: classes2.dex */
        public static final class e extends AbstractC0096f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false);
                kotlin.jvm.internal.i.g(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AbstractC0096f(Field field, boolean z10, boolean z11) {
            super(field, TYPE, r7, new Type[]{r2});
            Class<?> cls;
            Class TYPE = Void.TYPE;
            kotlin.jvm.internal.i.f(TYPE, "TYPE");
            if (z11) {
                cls = field.getDeclaringClass();
            } else {
                cls = null;
            }
            Type genericType = field.getGenericType();
            kotlin.jvm.internal.i.f(genericType, "field.genericType");
            this.f4695e = z10;
        }

        @Override // bt.f
        public void c(Object[] args) {
            kotlin.jvm.internal.i.g(args, "args");
            e.a.a(this, args);
            if (this.f4695e && k.a2(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // bt.e
        public Object call(Object[] args) {
            Object obj;
            kotlin.jvm.internal.i.g(args, "args");
            c(args);
            Field field = (Field) this.f4688a;
            if (this.f4690c != null) {
                obj = k.S1(args);
            } else {
                obj = null;
            }
            field.set(obj, k.a2(args));
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> i22;
        this.f4688a = member;
        this.f4689b = type;
        this.f4690c = cls;
        if (cls != null) {
            b1 b1Var = new b1(2);
            b1Var.a(cls);
            b1Var.b(typeArr);
            i22 = ca.a.P0(b1Var.e(new Type[b1Var.d()]));
        } else {
            i22 = k.i2(typeArr);
        }
        this.f4691d = i22;
    }

    @Override // bt.e
    public final List<Type> a() {
        return this.f4691d;
    }

    @Override // bt.e
    public final M b() {
        return this.f4688a;
    }

    public void c(Object[] objArr) {
        e.a.a(this, objArr);
    }

    public final void d(Object obj) {
        if (obj != null && this.f4688a.getDeclaringClass().isInstance(obj)) {
            return;
        }
        throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
    }

    @Override // bt.e
    public final Type getReturnType() {
        return this.f4689b;
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes2.dex */
    public static abstract class g extends f<Method> {

        /* renamed from: e  reason: collision with root package name */
        public final boolean f4696e;

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class a extends g implements bt.d {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, 4);
                kotlin.jvm.internal.i.g(method, "method");
                this.f = obj;
            }

            @Override // bt.e
            public final Object call(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                e.a.a(this, args);
                return e(this.f, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class b extends g implements bt.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, 4);
                kotlin.jvm.internal.i.g(method, "method");
            }

            @Override // bt.e
            public final Object call(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                e.a.a(this, args);
                return e(null, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class c extends g implements bt.d {
            public final Object f;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public c(Method method, Object obj) {
                super(method, false, (Type[]) r0);
                Object L1;
                kotlin.jvm.internal.i.g(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                kotlin.jvm.internal.i.f(genericParameterTypes, "method.genericParameterTypes");
                if (genericParameterTypes.length <= 1) {
                    L1 = new Type[0];
                } else {
                    L1 = is.i.L1(1, genericParameterTypes.length, genericParameterTypes);
                }
                this.f = obj;
            }

            @Override // bt.e
            public final Object call(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                e.a.a(this, args);
                b1 b1Var = new b1(2);
                b1Var.a(this.f);
                b1Var.b(args);
                return e(null, b1Var.e(new Object[b1Var.d()]));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, 6);
                kotlin.jvm.internal.i.g(method, "method");
            }

            @Override // bt.e
            public final Object call(Object[] args) {
                Object[] L1;
                kotlin.jvm.internal.i.g(args, "args");
                e.a.a(this, args);
                Object obj = args[0];
                if (args.length <= 1) {
                    L1 = new Object[0];
                } else {
                    L1 = is.i.L1(1, args.length, args);
                }
                return e(obj, L1);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes2.dex */
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, 4);
                kotlin.jvm.internal.i.g(method, "method");
            }

            @Override // bt.e
            public final Object call(Object[] args) {
                Object[] L1;
                kotlin.jvm.internal.i.g(args, "args");
                e.a.a(this, args);
                d(k.T1(args));
                if (args.length <= 1) {
                    L1 = new Object[0];
                } else {
                    L1 = is.i.L1(1, args.length, args);
                }
                return e(null, L1);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: bt.f$g$f  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0097f extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0097f(Method method) {
                super(method, false, 6);
                kotlin.jvm.internal.i.g(method, "method");
            }

            @Override // bt.e
            public final Object call(Object[] args) {
                kotlin.jvm.internal.i.g(args, "args");
                e.a.a(this, args);
                return e(null, args);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ g(Method method, boolean z10, int i6) {
            this(method, z10, r4);
            Type[] typeArr;
            z10 = (i6 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10;
            if ((i6 & 4) != 0) {
                typeArr = method.getGenericParameterTypes();
                kotlin.jvm.internal.i.f(typeArr, "method.genericParameterTypes");
            } else {
                typeArr = null;
            }
        }

        public final Object e(Object obj, Object[] args) {
            kotlin.jvm.internal.i.g(args, "args");
            Object invoke = ((Method) this.f4688a).invoke(obj, Arrays.copyOf(args, args.length));
            if (this.f4696e) {
                return hs.k.f19476a;
            }
            return invoke;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(Method method, boolean z10, Type[] typeArr) {
            super(method, r0, z10 ? method.getDeclaringClass() : null, typeArr);
            Type genericReturnType = method.getGenericReturnType();
            kotlin.jvm.internal.i.f(genericReturnType, "method.genericReturnType");
            this.f4696e = kotlin.jvm.internal.i.b(genericReturnType, Void.TYPE);
        }
    }
}
