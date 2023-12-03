package at;

import at.n0;
import gt.b;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import pu.k;
/* compiled from: KDeclarationContainerImpl.kt */
/* loaded from: classes2.dex */
public abstract class o implements kotlin.jvm.internal.b {

    /* renamed from: u  reason: collision with root package name */
    public static final gv.e f3587u = new gv.e("<v#(\\d+)>");

    /* compiled from: KDeclarationContainerImpl.kt */
    /* loaded from: classes2.dex */
    public abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ ys.m<Object>[] f3588b = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(a.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a  reason: collision with root package name */
        public final n0.a f3589a;

        /* compiled from: KDeclarationContainerImpl.kt */
        /* renamed from: at.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0059a extends kotlin.jvm.internal.k implements ss.a<mt.f> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ o f3590u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0059a(o oVar) {
                super(0);
                this.f3590u = oVar;
            }

            @Override // ss.a
            public final mt.f invoke() {
                return m0.a(this.f3590u.e());
            }
        }

        public a(o oVar) {
            this.f3589a = n0.c(new C0059a(oVar));
        }
    }

    public static Method v(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Class j02;
        Method v10;
        if (z10) {
            clsArr[0] = cls;
        }
        Method x10 = x(cls, str, clsArr, cls2);
        if (x10 != null) {
            return x10;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (v10 = v(superclass, str, clsArr, cls2, z10)) != null) {
            return v10;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.i.f(interfaces, "interfaces");
        for (Class<?> superInterface : interfaces) {
            kotlin.jvm.internal.i.f(superInterface, "superInterface");
            Method v11 = v(superInterface, str, clsArr, cls2, z10);
            if (v11 != null) {
                return v11;
            }
            if (z10 && (j02 = kotlin.jvm.internal.h.j0(nt.d.d(superInterface), superInterface.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = superInterface;
                Method x11 = x(j02, str, clsArr, cls2);
                if (x11 != null) {
                    return x11;
                }
            }
        }
        return null;
    }

    public static Method x(Class cls, String str, Class[] clsArr, Class cls2) {
        Method declaredMethod;
        boolean z10;
        try {
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
        }
        if (!kotlin.jvm.internal.i.b(declaredMethod.getReturnType(), cls2)) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.i.f(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.i.b(method.getName(), str) && kotlin.jvm.internal.i.b(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return method;
                }
            }
            return null;
        }
        return declaredMethod;
    }

    public final void g(String str, ArrayList arrayList, boolean z10) {
        ArrayList u10 = u(str);
        arrayList.addAll(u10);
        int size = ((u10.size() + 32) - 1) / 32;
        for (int i6 = 0; i6 < size; i6++) {
            Class TYPE = Integer.TYPE;
            kotlin.jvm.internal.i.f(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        if (z10) {
            arrayList.remove(kotlin.jvm.internal.d.class);
            arrayList.add(kotlin.jvm.internal.d.class);
            return;
        }
        arrayList.add(Object.class);
    }

    public final Method m(String name, String desc) {
        Method v10;
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(desc, "desc");
        if (kotlin.jvm.internal.i.b(name, "<init>")) {
            return null;
        }
        Object[] array = u(desc).toArray(new Class[0]);
        kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Class[] clsArr = (Class[]) array;
        Class w10 = w(gv.r.N0(desc, ')', 0, false, 6) + 1, desc.length(), desc);
        Method v11 = v(s(), name, clsArr, w10, false);
        if (v11 != null) {
            return v11;
        }
        if (!s().isInterface() || (v10 = v(Object.class, name, clsArr, w10, false)) == null) {
            return null;
        }
        return v10;
    }

    public abstract Collection<gt.i> o();

    public abstract Collection<gt.u> p(fu.e eVar);

    public abstract gt.k0 q(int i6);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List r(pu.i scope, int i6) {
        e eVar;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(scope, "scope");
        defpackage.d.j(i6, "belonginess");
        s sVar = new s(this);
        Collection<gt.j> a10 = k.a.a(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (gt.j jVar : a10) {
            if (jVar instanceof gt.b) {
                gt.b bVar = (gt.b) jVar;
                if (!kotlin.jvm.internal.i.b(bVar.getVisibility(), gt.p.f16806h)) {
                    b.a m02 = bVar.m0();
                    m02.getClass();
                    boolean z12 = false;
                    if (m02 != b.a.FAKE_OVERRIDE) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i6 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 == z11) {
                        z12 = true;
                    }
                    if (z12) {
                        eVar = (e) jVar.F(sVar, hs.k.f19476a);
                        if (eVar == null) {
                            arrayList.add(eVar);
                        }
                    }
                }
            }
            eVar = null;
            if (eVar == null) {
            }
        }
        return is.u.I2(arrayList);
    }

    public Class<?> s() {
        Class<?> e10 = e();
        List<ys.d<? extends Object>> list = nt.d.f26795a;
        kotlin.jvm.internal.i.g(e10, "<this>");
        Class<? extends Object> cls = nt.d.f26797c.get(e10);
        if (cls == null) {
            return e();
        }
        return cls;
    }

    public abstract Collection<gt.k0> t(fu.e eVar);

    public final ArrayList u(String str) {
        int N0;
        ArrayList arrayList = new ArrayList();
        int i6 = 1;
        while (str.charAt(i6) != ')') {
            int i10 = i6;
            while (str.charAt(i10) == '[') {
                i10++;
            }
            char charAt = str.charAt(i10);
            if (gv.r.I0("VZCBSIFJD", charAt)) {
                N0 = i10 + 1;
            } else if (charAt == 'L') {
                N0 = gv.r.N0(str, ';', i6, false, 4) + 1;
            } else {
                throw new hs.e("Unknown type prefix in the method signature: ".concat(str), 2);
            }
            arrayList.add(w(i6, N0, str));
            i6 = N0;
        }
        return arrayList;
    }

    public final Class w(int i6, int i10, String str) {
        char charAt = str.charAt(i6);
        if (charAt == 'L') {
            ClassLoader d10 = nt.d.d(e());
            String substring = str.substring(i6 + 1, i10 - 1);
            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> loadClass = d10.loadClass(gv.n.E0(substring, '/', '.'));
            kotlin.jvm.internal.i.f(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == '[') {
            Class w10 = w(i6 + 1, i10, str);
            fu.c cVar = t0.f3605a;
            kotlin.jvm.internal.i.g(w10, "<this>");
            return Array.newInstance(w10, 0).getClass();
        } else if (charAt == 'V') {
            Class TYPE = Void.TYPE;
            kotlin.jvm.internal.i.f(TYPE, "TYPE");
            return TYPE;
        } else if (charAt == 'Z') {
            return Boolean.TYPE;
        } else {
            if (charAt == 'C') {
                return Character.TYPE;
            }
            if (charAt == 'B') {
                return Byte.TYPE;
            }
            if (charAt == 'S') {
                return Short.TYPE;
            }
            if (charAt == 'I') {
                return Integer.TYPE;
            }
            if (charAt == 'F') {
                return Float.TYPE;
            }
            if (charAt == 'J') {
                return Long.TYPE;
            }
            if (charAt == 'D') {
                return Double.TYPE;
            }
            throw new hs.e("Unknown type prefix in the method signature: ".concat(str), 2);
        }
    }
}
