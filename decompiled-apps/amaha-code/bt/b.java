package bt;

import is.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
/* compiled from: AnnotationConstructorCaller.kt */
/* loaded from: classes2.dex */
public final class b {

    /* compiled from: AnnotationConstructorCaller.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<Integer> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f4679u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(0);
            this.f4679u = map;
        }

        @Override // ss.a
        public final Integer invoke() {
            int hashCode;
            Iterator<T> it = this.f4679u.entrySet().iterator();
            int i6 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    hashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    hashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    hashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    hashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    hashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    hashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    hashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    hashCode = Arrays.hashCode((double[]) value);
                } else if (value instanceof Object[]) {
                    hashCode = Arrays.hashCode((Object[]) value);
                } else {
                    hashCode = value.hashCode();
                }
                i6 += hashCode ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(i6);
        }
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    /* renamed from: bt.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0094b implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class<T> f4680a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f4681b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ hs.d<String> f4682c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ hs.d<Integer> f4683d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ List<Method> f4684e;

        public C0094b(Class cls, Map map, hs.i iVar, hs.i iVar2, List list) {
            this.f4680a = cls;
            this.f4681b = map;
            this.f4682c = iVar;
            this.f4683d = iVar2;
            this.f4684e = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] args) {
            boolean z10;
            Annotation annotation;
            boolean b10;
            boolean z11;
            String name = method.getName();
            GenericDeclaration genericDeclaration = this.f4680a;
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1776922004) {
                    if (hashCode != 147696667) {
                        if (hashCode == 1444986633 && name.equals("annotationType")) {
                            return genericDeclaration;
                        }
                    } else if (name.equals("hashCode")) {
                        return Integer.valueOf(this.f4683d.getValue().intValue());
                    }
                } else if (name.equals("toString")) {
                    return this.f4682c.getValue();
                }
            }
            boolean b11 = kotlin.jvm.internal.i.b(name, "equals");
            Map<String, Object> map = this.f4681b;
            boolean z12 = false;
            if (b11) {
                if (args != null && args.length == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    kotlin.jvm.internal.i.f(args, "args");
                    Object e22 = is.k.e2(args);
                    Class cls = null;
                    if (e22 instanceof Annotation) {
                        annotation = (Annotation) e22;
                    } else {
                        annotation = null;
                    }
                    if (annotation != null) {
                        cls = sp.b.C(sp.b.r(annotation));
                    }
                    if (kotlin.jvm.internal.i.b(cls, genericDeclaration)) {
                        List<Method> list = this.f4684e;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (Method method2 : list) {
                                Object obj2 = map.get(method2.getName());
                                Object invoke = method2.invoke(e22, new Object[0]);
                                if (obj2 instanceof boolean[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                                    b10 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                                    continue;
                                } else if (obj2 instanceof char[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                                    b10 = Arrays.equals((char[]) obj2, (char[]) invoke);
                                    continue;
                                } else if (obj2 instanceof byte[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                                    b10 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                                    continue;
                                } else if (obj2 instanceof short[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                                    b10 = Arrays.equals((short[]) obj2, (short[]) invoke);
                                    continue;
                                } else if (obj2 instanceof int[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                                    b10 = Arrays.equals((int[]) obj2, (int[]) invoke);
                                    continue;
                                } else if (obj2 instanceof float[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                                    b10 = Arrays.equals((float[]) obj2, (float[]) invoke);
                                    continue;
                                } else if (obj2 instanceof long[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                                    b10 = Arrays.equals((long[]) obj2, (long[]) invoke);
                                    continue;
                                } else if (obj2 instanceof double[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                                    b10 = Arrays.equals((double[]) obj2, (double[]) invoke);
                                    continue;
                                } else if (obj2 instanceof Object[]) {
                                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                                    b10 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                                    continue;
                                } else {
                                    b10 = kotlin.jvm.internal.i.b(obj2, invoke);
                                    continue;
                                }
                                if (!b10) {
                                    z11 = false;
                                    break;
                                }
                            }
                        }
                        z11 = true;
                        if (z11) {
                            z12 = true;
                        }
                    }
                    return Boolean.valueOf(z12);
                }
            }
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (args == null) {
                args = new Object[0];
            }
            sb2.append(is.k.i2(args));
            sb2.append(')');
            throw new hs.e(sb2.toString(), 2);
        }
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Class<T> f4685u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f4686v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f4685u = cls;
            this.f4686v = map;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(this.f4685u.getCanonicalName());
            u.l2(this.f4686v.entrySet(), sb2, ", ", "(", ")", bt.c.f4687u, 48);
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    public static final <T> T a(Class<T> annotationClass, Map<String, ? extends Object> map, List<Method> methods) {
        kotlin.jvm.internal.i.g(annotationClass, "annotationClass");
        kotlin.jvm.internal.i.g(methods, "methods");
        hs.i O = sp.b.O(new a(map));
        T t3 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new C0094b(annotationClass, map, sp.b.O(new c(annotationClass, map)), O, methods));
        kotlin.jvm.internal.i.e(t3, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t3;
    }
}
