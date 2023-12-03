package at;

import dt.n;
import gu.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ku.q;
import mt.g;
import wu.d1;
/* compiled from: util.kt */
/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final fu.c f3605a = new fu.c("kotlin.jvm.JvmStatic");

    /* compiled from: util.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3606a;

        static {
            int[] iArr = new int[dt.k.values().length];
            try {
                iArr[dt.k.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dt.k.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dt.k.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[dt.k.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[dt.k.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[dt.k.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[dt.k.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[dt.k.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f3606a = iArr;
        }
    }

    public static final e<?> a(Object obj) {
        e<?> eVar;
        if (obj instanceof e) {
            eVar = (e) obj;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            t b10 = b(obj);
            if (b10 == null) {
                return c(obj);
            }
            return b10;
        }
        return eVar;
    }

    public static final t b(Object obj) {
        t tVar;
        kotlin.jvm.internal.f fVar;
        ys.c cVar;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar == null) {
            if (obj instanceof kotlin.jvm.internal.f) {
                fVar = (kotlin.jvm.internal.f) obj;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                cVar = fVar.compute();
            } else {
                cVar = null;
            }
            if (!(cVar instanceof t)) {
                return null;
            }
            return (t) cVar;
        }
        return tVar;
    }

    public static final g0<?> c(Object obj) {
        g0<?> g0Var;
        kotlin.jvm.internal.t tVar;
        ys.c cVar;
        if (obj instanceof g0) {
            g0Var = (g0) obj;
        } else {
            g0Var = null;
        }
        if (g0Var == null) {
            if (obj instanceof kotlin.jvm.internal.t) {
                tVar = (kotlin.jvm.internal.t) obj;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                cVar = tVar.compute();
            } else {
                cVar = null;
            }
            if (!(cVar instanceof g0)) {
                return null;
            }
            return (g0) cVar;
        }
        return g0Var;
    }

    public static final ArrayList d(ht.a aVar) {
        boolean z10;
        List O0;
        Annotation i6;
        nt.e eVar;
        kotlin.jvm.internal.i.g(aVar, "<this>");
        ht.h annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (ht.c cVar : annotations) {
            gt.q0 g5 = cVar.g();
            if (g5 instanceof mt.a) {
                i6 = ((mt.a) g5).f25735b;
            } else if (g5 instanceof g.a) {
                nt.w wVar = ((g.a) g5).f25745b;
                if (wVar instanceof nt.e) {
                    eVar = (nt.e) wVar;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    i6 = eVar.f26802a;
                } else {
                    i6 = null;
                }
            } else {
                i6 = i(cVar);
            }
            if (i6 != null) {
                arrayList.add(i6);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.i.b(sp.b.C(sp.b.r((Annotation) it.next())).getSimpleName(), "Container")) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Annotation annotation = (Annotation) it2.next();
                Class C = sp.b.C(sp.b.r(annotation));
                if (kotlin.jvm.internal.i.b(C.getSimpleName(), "Container") && C.getAnnotation(kotlin.jvm.internal.a0.class) != null) {
                    Object invoke = C.getDeclaredMethod("value", new Class[0]).invoke(annotation, new Object[0]);
                    kotlin.jvm.internal.i.e(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                    O0 = is.i.G1((Annotation[]) invoke);
                } else {
                    O0 = ca.a.O0(annotation);
                }
                is.q.R1(O0, arrayList2);
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            if (kotlin.jvm.internal.i.b(type, Boolean.TYPE)) {
                return Boolean.FALSE;
            }
            if (kotlin.jvm.internal.i.b(type, Character.TYPE)) {
                return (char) 0;
            }
            if (kotlin.jvm.internal.i.b(type, Byte.TYPE)) {
                return (byte) 0;
            }
            if (kotlin.jvm.internal.i.b(type, Short.TYPE)) {
                return (short) 0;
            }
            if (kotlin.jvm.internal.i.b(type, Integer.TYPE)) {
                return 0;
            }
            if (kotlin.jvm.internal.i.b(type, Float.TYPE)) {
                return Float.valueOf(0.0f);
            }
            if (kotlin.jvm.internal.i.b(type, Long.TYPE)) {
                return 0L;
            }
            if (kotlin.jvm.internal.i.b(type, Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            if (kotlin.jvm.internal.i.b(type, Void.TYPE)) {
                throw new IllegalStateException("Parameter with void type is illegal");
            }
            throw new UnsupportedOperationException("Unknown primitive: " + type);
        }
        return null;
    }

    public static final gt.a f(Class moduleAnchor, g.c proto, cu.c nameResolver, cu.e typeTable, cu.a metadataVersion, ss.p createDescriptor) {
        List<au.r> list;
        kotlin.jvm.internal.i.g(moduleAnchor, "moduleAnchor");
        kotlin.jvm.internal.i.g(proto, "proto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.i.g(typeTable, "typeTable");
        kotlin.jvm.internal.i.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.i.g(createDescriptor, "createDescriptor");
        mt.f a10 = m0.a(moduleAnchor);
        if (proto instanceof au.h) {
            list = ((au.h) proto).C;
        } else if (proto instanceof au.m) {
            list = ((au.m) proto).C;
        } else {
            throw new IllegalStateException(("Unsupported message: " + proto).toString());
        }
        List<au.r> typeParameters = list;
        su.l lVar = a10.f25742a;
        gt.a0 a0Var = lVar.f32045b;
        cu.f fVar = cu.f.f12049b;
        kotlin.jvm.internal.i.f(typeParameters, "typeParameters");
        return (gt.a) createDescriptor.invoke(new su.y(new j7.k(lVar, nameResolver, (gt.j) a0Var, typeTable, fVar, metadataVersion, (uu.g) null, (su.j0) null, (List) typeParameters)), proto);
    }

    public static final gt.n0 g(gt.a aVar) {
        kotlin.jvm.internal.i.g(aVar, "<this>");
        if (aVar.f0() != null) {
            gt.j c10 = aVar.c();
            kotlin.jvm.internal.i.e(c10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((gt.e) c10).L0();
        }
        return null;
    }

    public static final Class<?> h(ClassLoader classLoader, fu.b bVar, int i6) {
        String str = ft.c.f15851a;
        fu.d i10 = bVar.b().i();
        kotlin.jvm.internal.i.f(i10, "kotlinClassId.asSingleFqName().toUnsafe()");
        fu.b g5 = ft.c.g(i10);
        if (g5 != null) {
            bVar = g5;
        }
        String b10 = bVar.h().b();
        String b11 = bVar.i().b();
        if (kotlin.jvm.internal.i.b(b10, "kotlin")) {
            switch (b11.hashCode()) {
                case -901856463:
                    if (b11.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b11.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b11.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b11.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b11.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b11.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b11.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b11.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b11.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str2 = b10 + '.' + gv.n.E0(b11, '.', '$');
        if (i6 > 0) {
            str2 = gv.n.D0(i6, "[") + 'L' + str2 + ';';
        }
        return kotlin.jvm.internal.h.j0(classLoader, str2);
    }

    public static final Annotation i(ht.c cVar) {
        Class<?> cls;
        hs.f fVar;
        gt.e d10 = mu.a.d(cVar);
        if (d10 != null) {
            cls = j(d10);
        } else {
            cls = null;
        }
        if (!(cls instanceof Class)) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        Set<Map.Entry<fu.e, ku.g<?>>> entrySet = cVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            fu.e eVar = (fu.e) entry.getKey();
            ClassLoader classLoader = cls.getClassLoader();
            kotlin.jvm.internal.i.f(classLoader, "annotationClass.classLoader");
            Object k10 = k((ku.g) entry.getValue(), classLoader);
            if (k10 != null) {
                fVar = new hs.f(eVar.f(), k10);
            } else {
                fVar = null;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        Map w02 = is.e0.w0(arrayList);
        Set<String> keySet = w02.keySet();
        ArrayList arrayList2 = new ArrayList(is.i.H1(keySet, 10));
        for (String str : keySet) {
            arrayList2.add(cls.getDeclaredMethod(str, new Class[0]));
        }
        return (Annotation) bt.b.a(cls, w02, arrayList2);
    }

    public static final Class<?> j(gt.e eVar) {
        kotlin.jvm.internal.i.g(eVar, "<this>");
        gt.q0 source = eVar.g();
        kotlin.jvm.internal.i.f(source, "source");
        if (source instanceof yt.q) {
            yt.o oVar = ((yt.q) source).f39055b;
            kotlin.jvm.internal.i.e(oVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((mt.c) oVar).f25737a;
        } else if (source instanceof g.a) {
            nt.w wVar = ((g.a) source).f25745b;
            kotlin.jvm.internal.i.e(wVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((nt.s) wVar).f26827a;
        } else {
            fu.b f = mu.a.f(eVar);
            if (f == null) {
                return null;
            }
            return h(nt.d.d(eVar.getClass()), f, 0);
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v18, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v20, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v19, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v23, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(ku.g<?> gVar, ClassLoader classLoader) {
        boolean z10;
        gt.e eVar;
        su.o oVar;
        wu.b0 b0Var;
        dt.k s10;
        int i6;
        gt.e eVar2;
        Class<?> h10;
        short[] sArr;
        if (gVar instanceof ku.a) {
            return i((ht.c) ((ku.a) gVar).f23941a);
        }
        int i10 = 0;
        if (gVar instanceof ku.b) {
            ku.b bVar = (ku.b) gVar;
            if (bVar instanceof su.o) {
                oVar = (su.o) bVar;
            } else {
                oVar = null;
            }
            if (oVar != null && (b0Var = oVar.f32064c) != null) {
                Iterable<ku.g> iterable = (Iterable) bVar.f23941a;
                ArrayList arrayList = new ArrayList(is.i.H1(iterable, 10));
                for (ku.g gVar2 : iterable) {
                    arrayList.add(k(gVar2, classLoader));
                }
                fu.e eVar3 = dt.j.f13360e;
                gt.g a10 = b0Var.O0().a();
                if (a10 == null) {
                    s10 = null;
                } else {
                    s10 = dt.j.s(a10);
                }
                if (s10 == null) {
                    i6 = -1;
                } else {
                    i6 = a.f3606a[s10.ordinal()];
                }
                Object obj = bVar.f23941a;
                switch (i6) {
                    case -1:
                        if (dt.j.z(b0Var)) {
                            wu.b0 a11 = ((d1) is.u.y2(b0Var.M0())).a();
                            kotlin.jvm.internal.i.f(a11, "type.arguments.single().type");
                            gt.g a12 = a11.O0().a();
                            if (a12 instanceof gt.e) {
                                eVar2 = (gt.e) a12;
                            } else {
                                eVar2 = null;
                            }
                            if (eVar2 != null) {
                                if (dt.j.J(a11)) {
                                    int size = ((List) obj).size();
                                    sArr = new String[size];
                                    while (i10 < size) {
                                        Object obj2 = arrayList.get(i10);
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                                        sArr[i10] = (String) obj2;
                                        i10++;
                                    }
                                    break;
                                } else if (dt.j.c(eVar2, n.a.P)) {
                                    int size2 = ((List) obj).size();
                                    sArr = new Class[size2];
                                    while (i10 < size2) {
                                        Object obj3 = arrayList.get(i10);
                                        kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                        sArr[i10] = (Class) obj3;
                                        i10++;
                                    }
                                    break;
                                } else {
                                    fu.b f = mu.a.f(eVar2);
                                    if (f != null && (h10 = h(classLoader, f, 0)) != null) {
                                        Object newInstance = Array.newInstance(h10, ((List) obj).size());
                                        kotlin.jvm.internal.i.e(newInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                                        Object[] objArr = (Object[]) newInstance;
                                        int size3 = arrayList.size();
                                        while (i10 < size3) {
                                            objArr[i10] = arrayList.get(i10);
                                            i10++;
                                        }
                                        return objArr;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(("Not a class type: " + a11).toString());
                            }
                        } else {
                            throw new IllegalStateException(("Not an array type: " + b0Var).toString());
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = ((List) obj).size();
                        sArr = new boolean[size4];
                        while (i10 < size4) {
                            Object obj4 = arrayList.get(i10);
                            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            sArr[i10] = ((Boolean) obj4).booleanValue();
                            i10++;
                        }
                        break;
                    case 2:
                        int size5 = ((List) obj).size();
                        sArr = new char[size5];
                        while (i10 < size5) {
                            Object obj5 = arrayList.get(i10);
                            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.Char");
                            sArr[i10] = ((Character) obj5).charValue();
                            i10++;
                        }
                        break;
                    case 3:
                        int size6 = ((List) obj).size();
                        sArr = new byte[size6];
                        while (i10 < size6) {
                            Object obj6 = arrayList.get(i10);
                            kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            sArr[i10] = ((Byte) obj6).byteValue();
                            i10++;
                        }
                        break;
                    case 4:
                        int size7 = ((List) obj).size();
                        sArr = new short[size7];
                        while (i10 < size7) {
                            Object obj7 = arrayList.get(i10);
                            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i10] = ((Short) obj7).shortValue();
                            i10++;
                        }
                        break;
                    case 5:
                        int size8 = ((List) obj).size();
                        sArr = new int[size8];
                        while (i10 < size8) {
                            Object obj8 = arrayList.get(i10);
                            kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.Int");
                            sArr[i10] = ((Integer) obj8).intValue();
                            i10++;
                        }
                        break;
                    case 6:
                        int size9 = ((List) obj).size();
                        sArr = new float[size9];
                        while (i10 < size9) {
                            Object obj9 = arrayList.get(i10);
                            kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.Float");
                            sArr[i10] = ((Float) obj9).floatValue();
                            i10++;
                        }
                        break;
                    case 7:
                        int size10 = ((List) obj).size();
                        sArr = new long[size10];
                        while (i10 < size10) {
                            Object obj10 = arrayList.get(i10);
                            kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type kotlin.Long");
                            sArr[i10] = ((Long) obj10).longValue();
                            i10++;
                        }
                        break;
                    case 8:
                        int size11 = ((List) obj).size();
                        sArr = new double[size11];
                        while (i10 < size11) {
                            Object obj11 = arrayList.get(i10);
                            kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type kotlin.Double");
                            sArr[i10] = ((Double) obj11).doubleValue();
                            i10++;
                        }
                        break;
                }
                return sArr;
            }
        } else if (gVar instanceof ku.j) {
            hs.f fVar = (hs.f) ((ku.j) gVar).f23941a;
            fu.e eVar4 = (fu.e) fVar.f19465v;
            Class<?> h11 = h(classLoader, (fu.b) fVar.f19464u, 0);
            if (h11 != null) {
                return Enum.valueOf(h11, eVar4.f());
            }
        } else if (gVar instanceof ku.q) {
            q.a aVar = (q.a) ((ku.q) gVar).f23941a;
            if (aVar instanceof q.a.b) {
                ku.f fVar2 = ((q.a.b) aVar).f23955a;
                return h(classLoader, fVar2.f23939a, fVar2.f23940b);
            } else if (aVar instanceof q.a.C0371a) {
                gt.g a13 = ((q.a.C0371a) aVar).f23954a.O0().a();
                if (a13 instanceof gt.e) {
                    eVar = (gt.e) a13;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    return j(eVar);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (gVar instanceof ku.k) {
                z10 = true;
            } else {
                z10 = gVar instanceof ku.s;
            }
            if (!z10) {
                return gVar.b();
            }
        }
        return null;
    }
}
