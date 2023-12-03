package at;

import at.c;
import at.n0;
import bt.f;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import eu.d;
import gt.z0;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: KFunctionImpl.kt */
/* loaded from: classes2.dex */
public final class t extends e<Object> implements kotlin.jvm.internal.e<Object>, ys.g<Object>, ss.a, ss.l, ss.b, ss.c, ss.d, ss.e, ss.f, ss.g, ss.h, ss.i, ss.j, ss.k, ss.p, ss.m, ss.n, ss.o, ss.q, ss.r, ss.s, ss.t, ss.u, ss.v, ss.w {
    public static final /* synthetic */ ys.m<Object>[] E = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(t.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(t.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(t.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
    public final Object A;
    public final n0.a B;
    public final n0.b C;
    public final n0.b D;

    /* renamed from: y  reason: collision with root package name */
    public final o f3599y;

    /* renamed from: z  reason: collision with root package name */
    public final String f3600z;

    /* compiled from: KFunctionImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<bt.e<? extends Member>> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final bt.e<? extends Member> invoke() {
            Object obj;
            bt.f c0097f;
            bt.f fVar;
            fu.b bVar = r0.f3597a;
            t tVar = t.this;
            at.c c10 = r0.c(tVar.t());
            boolean z10 = c10 instanceof c.d;
            o oVar = tVar.f3599y;
            if (z10) {
                if (tVar.v()) {
                    Class<?> e10 = oVar.e();
                    List<ys.j> parameters = tVar.getParameters();
                    ArrayList arrayList = new ArrayList(is.i.H1(parameters, 10));
                    for (ys.j jVar : parameters) {
                        String name = jVar.getName();
                        kotlin.jvm.internal.i.d(name);
                        arrayList.add(name);
                    }
                    return new bt.a(e10, arrayList, 2);
                }
                String desc = ((c.d) c10).f3477a.f14562b;
                oVar.getClass();
                kotlin.jvm.internal.i.g(desc, "desc");
                Class<?> e11 = oVar.e();
                try {
                    Object[] array = oVar.u(desc).toArray(new Class[0]);
                    kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    Class[] clsArr = (Class[]) array;
                    obj = e11.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                } catch (NoSuchMethodException unused) {
                    obj = null;
                }
            } else if (c10 instanceof c.e) {
                d.b bVar2 = ((c.e) c10).f3479a;
                obj = oVar.m(bVar2.f14561a, bVar2.f14562b);
            } else if (c10 instanceof c.C0054c) {
                obj = ((c.C0054c) c10).f3476a;
            } else if (c10 instanceof c.b) {
                obj = ((c.b) c10).f3474a;
            } else if (c10 instanceof c.a) {
                Class<?> e12 = oVar.e();
                List<Method> list = ((c.a) c10).f3472a;
                ArrayList arrayList2 = new ArrayList(is.i.H1(list, 10));
                for (Method method : list) {
                    arrayList2.add(method.getName());
                }
                return new bt.a(e12, arrayList2, 2, 1, list);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (obj instanceof Constructor) {
                fVar = t.z(tVar, (Constructor) obj, tVar.t(), false);
            } else if (obj instanceof Method) {
                Method method2 = (Method) obj;
                boolean isStatic = Modifier.isStatic(method2.getModifiers());
                Object obj2 = tVar.A;
                if (!isStatic) {
                    if (tVar.w()) {
                        c0097f = new f.g.a(method2, sp.b.f(obj2, tVar.t()));
                    } else {
                        c0097f = new f.g.d(method2);
                    }
                } else if (tVar.t().getAnnotations().l(t0.f3605a) != null) {
                    if (tVar.w()) {
                        c0097f = new f.g.b(method2);
                    } else {
                        c0097f = new f.g.e(method2);
                    }
                } else if (tVar.w()) {
                    c0097f = new f.g.c(method2, sp.b.f(obj2, tVar.t()));
                } else {
                    c0097f = new f.g.C0097f(method2);
                }
                fVar = c0097f;
            } else {
                throw new hs.e("Could not compute caller for function: " + tVar.t() + " (member = " + obj + ')', 2);
            }
            return sp.b.k(fVar, tVar.t(), false);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<bt.e<? extends Member>> {
        public b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.reflect.Member, java.lang.Object] */
        @Override // ss.a
        public final bt.e<? extends Member> invoke() {
            GenericDeclaration declaredConstructor;
            bt.f fVar;
            bt.f c0097f;
            fu.b bVar = r0.f3597a;
            t tVar = t.this;
            at.c c10 = r0.c(tVar.t());
            boolean z10 = c10 instanceof c.e;
            o oVar = tVar.f3599y;
            bt.e<? extends Member> eVar = null;
            if (z10) {
                d.b bVar2 = ((c.e) c10).f3479a;
                String name = bVar2.f14561a;
                ?? b10 = tVar.o().b();
                kotlin.jvm.internal.i.d(b10);
                boolean z11 = !Modifier.isStatic(b10.getModifiers());
                oVar.getClass();
                kotlin.jvm.internal.i.g(name, "name");
                String desc = bVar2.f14562b;
                kotlin.jvm.internal.i.g(desc, "desc");
                if (!kotlin.jvm.internal.i.b(name, "<init>")) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        arrayList.add(oVar.e());
                    }
                    oVar.g(desc, arrayList, false);
                    Class<?> s10 = oVar.s();
                    String concat = name.concat("$default");
                    Object[] array = arrayList.toArray(new Class[0]);
                    kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    declaredConstructor = o.v(s10, concat, (Class[]) array, oVar.w(gv.r.N0(desc, ')', 0, false, 6) + 1, desc.length(), desc), z11);
                }
                declaredConstructor = null;
            } else {
                if (c10 instanceof c.d) {
                    if (tVar.v()) {
                        Class<?> e10 = oVar.e();
                        List<ys.j> parameters = tVar.getParameters();
                        ArrayList arrayList2 = new ArrayList(is.i.H1(parameters, 10));
                        for (ys.j jVar : parameters) {
                            String name2 = jVar.getName();
                            kotlin.jvm.internal.i.d(name2);
                            arrayList2.add(name2);
                        }
                        return new bt.a(e10, arrayList2, 1);
                    }
                    String desc2 = ((c.d) c10).f3477a.f14562b;
                    oVar.getClass();
                    kotlin.jvm.internal.i.g(desc2, "desc");
                    Class<?> e11 = oVar.e();
                    ArrayList arrayList3 = new ArrayList();
                    oVar.g(desc2, arrayList3, true);
                    hs.k kVar = hs.k.f19476a;
                    try {
                        Object[] array2 = arrayList3.toArray(new Class[0]);
                        kotlin.jvm.internal.i.e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        Class[] clsArr = (Class[]) array2;
                        declaredConstructor = e11.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (c10 instanceof c.a) {
                    Class<?> e12 = oVar.e();
                    List<Method> list = ((c.a) c10).f3472a;
                    ArrayList arrayList4 = new ArrayList(is.i.H1(list, 10));
                    for (Method method : list) {
                        arrayList4.add(method.getName());
                    }
                    return new bt.a(e12, arrayList4, 1, 1, list);
                }
                declaredConstructor = null;
            }
            if (declaredConstructor instanceof Constructor) {
                fVar = t.z(tVar, (Constructor) declaredConstructor, tVar.t(), true);
            } else if (declaredConstructor instanceof Method) {
                if (tVar.t().getAnnotations().l(t0.f3605a) != null) {
                    gt.j c11 = tVar.t().c();
                    kotlin.jvm.internal.i.e(c11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (!((gt.e) c11).w()) {
                        Method method2 = (Method) declaredConstructor;
                        if (tVar.w()) {
                            c0097f = new f.g.b(method2);
                        } else {
                            c0097f = new f.g.e(method2);
                        }
                        fVar = c0097f;
                    }
                }
                Method method3 = (Method) declaredConstructor;
                if (tVar.w()) {
                    c0097f = new f.g.c(method3, sp.b.f(tVar.A, tVar.t()));
                } else {
                    c0097f = new f.g.C0097f(method3);
                }
                fVar = c0097f;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                eVar = sp.b.k(fVar, tVar.t(), true);
            }
            return eVar;
        }
    }

    /* compiled from: KFunctionImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<gt.u> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f3604v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f3604v = str;
        }

        @Override // ss.a
        public final gt.u invoke() {
            Collection<gt.u> p10;
            String concat;
            t tVar = t.this;
            o oVar = tVar.f3599y;
            oVar.getClass();
            String name = this.f3604v;
            kotlin.jvm.internal.i.g(name, "name");
            String signature = tVar.f3600z;
            kotlin.jvm.internal.i.g(signature, "signature");
            if (kotlin.jvm.internal.i.b(name, "<init>")) {
                p10 = is.u.I2(oVar.o());
            } else {
                p10 = oVar.p(fu.e.j(name));
            }
            Collection<gt.u> collection = p10;
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (kotlin.jvm.internal.i.b(r0.c((gt.u) obj).a(), signature)) {
                    arrayList.add(obj);
                }
            }
            boolean z10 = true;
            if (arrayList.size() != 1) {
                String m22 = is.u.m2(collection, "\n", null, null, p.f3591u, 30);
                StringBuilder sb2 = new StringBuilder("Function '");
                sb2.append(name);
                sb2.append("' (JVM signature: ");
                sb2.append(signature);
                sb2.append(") not resolved in ");
                sb2.append(oVar);
                sb2.append(':');
                if (m22.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    concat = " no members found";
                } else {
                    concat = "\n".concat(m22);
                }
                sb2.append(concat);
                throw new hs.e(sb2.toString(), 2);
            }
            return (gt.u) is.u.y2(arrayList);
        }
    }

    public t(o oVar, String str, String str2, gt.u uVar, Object obj) {
        this.f3599y = oVar;
        this.f3600z = str2;
        this.A = obj;
        this.B = new n0.a(uVar, new c(str));
        this.C = new n0.b(new a());
        this.D = new n0.b(new b());
    }

    public static final bt.f z(t tVar, Constructor constructor, gt.u uVar, boolean z10) {
        gt.d dVar;
        boolean z11;
        if (!z10) {
            tVar.getClass();
            if (uVar instanceof gt.d) {
                dVar = (gt.d) uVar;
            } else {
                dVar = null;
            }
            if (dVar != null && !gt.p.e(dVar.getVisibility())) {
                gt.e A = dVar.A();
                kotlin.jvm.internal.i.f(A, "constructorDescriptor.constructedClass");
                if (!iu.i.b(A) && !iu.g.q(dVar.A())) {
                    List<z0> i6 = dVar.i();
                    kotlin.jvm.internal.i.f(i6, "constructorDescriptor.valueParameters");
                    if (!i6.isEmpty()) {
                        for (z0 z0Var : i6) {
                            wu.b0 a10 = z0Var.a();
                            kotlin.jvm.internal.i.f(a10, "it.type");
                            if (kotlin.jvm.internal.h.f0(a10)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                }
            }
            z11 = false;
            if (z11) {
                if (tVar.w()) {
                    return new f.a(constructor, sp.b.f(tVar.A, tVar.t()));
                }
                return new f.b(constructor);
            }
        }
        if (tVar.w()) {
            return new f.c(constructor, sp.b.f(tVar.A, tVar.t()));
        }
        return new f.d(constructor);
    }

    @Override // at.e
    /* renamed from: A */
    public final gt.u t() {
        ys.m<Object> mVar = E[0];
        Object invoke = this.B.invoke();
        kotlin.jvm.internal.i.f(invoke, "<get-descriptor>(...)");
        return (gt.u) invoke;
    }

    @Override // ss.t
    public final Object e(String str, Integer num, Boolean bool, String str2, Boolean bool2, LibraryCollection libraryCollection) {
        return call(str, num, bool, str2, bool2, libraryCollection);
    }

    public final boolean equals(Object obj) {
        t b10 = t0.b(obj);
        if (b10 == null || !kotlin.jvm.internal.i.b(this.f3599y, b10.f3599y) || !kotlin.jvm.internal.i.b(getName(), b10.getName()) || !kotlin.jvm.internal.i.b(this.f3600z, b10.f3600z) || !kotlin.jvm.internal.i.b(this.A, b10.A)) {
            return false;
        }
        return true;
    }

    @Override // ss.u
    public final Object g(String str, String str2, String str3, Boolean bool, String str4, Integer num, String str5) {
        return call(str, str2, str3, bool, str4, num, str5);
    }

    @Override // kotlin.jvm.internal.e
    public final int getArity() {
        return ca.a.b0(o());
    }

    @Override // ys.c
    public final String getName() {
        String f = t().getName().f();
        kotlin.jvm.internal.i.f(f, "descriptor.name.asString()");
        return f;
    }

    public final int hashCode() {
        int hashCode = getName().hashCode();
        return this.f3600z.hashCode() + ((hashCode + (this.f3599y.hashCode() * 31)) * 31);
    }

    @Override // ss.a
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // ys.g
    public final boolean isExternal() {
        return t().isExternal();
    }

    @Override // ys.g
    public final boolean isInfix() {
        return t().isInfix();
    }

    @Override // ys.g
    public final boolean isInline() {
        return t().isInline();
    }

    @Override // ys.g
    public final boolean isOperator() {
        return t().isOperator();
    }

    @Override // ys.c
    public final boolean isSuspend() {
        return t().isSuspend();
    }

    @Override // at.e
    public final bt.e<?> o() {
        ys.m<Object> mVar = E[1];
        Object invoke = this.C.invoke();
        kotlin.jvm.internal.i.f(invoke, "<get-caller>(...)");
        return (bt.e) invoke;
    }

    @Override // at.e
    public final o p() {
        return this.f3599y;
    }

    @Override // ss.c
    public final Object q(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, Boolean bool3, Integer num, Boolean bool4, String str6) {
        return call(str, str2, str3, bool, bool2, str4, str5, bool3, num, bool4, str6);
    }

    @Override // ss.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // at.e
    public final bt.e<?> s() {
        ys.m<Object> mVar = E[2];
        return (bt.e) this.D.invoke();
    }

    public final String toString() {
        hu.d dVar = p0.f3592a;
        return p0.b(t());
    }

    @Override // ss.v
    public final Object u(String str, String str2, String str3, Boolean bool, String str4, String str5, Integer num, Boolean bool2) {
        return call(str, str2, str3, bool, str4, str5, num, bool2);
    }

    @Override // at.e
    public final boolean w() {
        return !kotlin.jvm.internal.i.b(this.A, kotlin.jvm.internal.a.NO_RECEIVER);
    }

    @Override // ss.b
    public final Object x(String str, String str2, String str3, Boolean bool, Boolean bool2, String str4, String str5, Boolean bool3, Integer num, String str6) {
        return call(str, str2, str3, bool, bool2, str4, str5, bool3, num, str6);
    }

    @Override // ss.s
    public final Object y(String str, String str2, Object obj, String str3, Object obj2) {
        return call(str, str2, obj, str3, obj2);
    }

    @Override // ss.l
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // ss.p
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // ss.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(o container, gt.u descriptor) {
        this(container, r3, r0.c(descriptor).a(), descriptor, kotlin.jvm.internal.a.NO_RECEIVER);
        kotlin.jvm.internal.i.g(container, "container");
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        String f = descriptor.getName().f();
        kotlin.jvm.internal.i.f(f, "descriptor.name.asString()");
    }
}
