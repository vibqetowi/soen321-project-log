package nt;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: reflectClassUtil.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final List<ys.d<? extends Object>> f26795a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f26796b;

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f26797c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Class<? extends hs.a<?>>, Integer> f26798d;

    /* compiled from: reflectClassUtil.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<ParameterizedType, ParameterizedType> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f26799u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            ParameterizedType it = parameterizedType;
            kotlin.jvm.internal.i.g(it, "it");
            Type ownerType = it.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* compiled from: reflectClassUtil.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<ParameterizedType, fv.h<? extends Type>> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f26800u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final fv.h<? extends Type> invoke(ParameterizedType parameterizedType) {
            ParameterizedType it = parameterizedType;
            kotlin.jvm.internal.i.g(it, "it");
            Type[] actualTypeArguments = it.getActualTypeArguments();
            kotlin.jvm.internal.i.f(actualTypeArguments, "it.actualTypeArguments");
            return is.k.P1(actualTypeArguments);
        }
    }

    static {
        int i6 = 0;
        List<ys.d<? extends Object>> P0 = ca.a.P0(kotlin.jvm.internal.y.a(Boolean.TYPE), kotlin.jvm.internal.y.a(Byte.TYPE), kotlin.jvm.internal.y.a(Character.TYPE), kotlin.jvm.internal.y.a(Double.TYPE), kotlin.jvm.internal.y.a(Float.TYPE), kotlin.jvm.internal.y.a(Integer.TYPE), kotlin.jvm.internal.y.a(Long.TYPE), kotlin.jvm.internal.y.a(Short.TYPE));
        f26795a = P0;
        ArrayList arrayList = new ArrayList(is.i.H1(P0, 10));
        Iterator<T> it = P0.iterator();
        while (it.hasNext()) {
            ys.d dVar = (ys.d) it.next();
            arrayList.add(new hs.f(sp.b.D(dVar), sp.b.E(dVar)));
        }
        f26796b = is.e0.w0(arrayList);
        List<ys.d<? extends Object>> list = f26795a;
        ArrayList arrayList2 = new ArrayList(is.i.H1(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ys.d dVar2 = (ys.d) it2.next();
            arrayList2.add(new hs.f(sp.b.E(dVar2), sp.b.D(dVar2)));
        }
        f26797c = is.e0.w0(arrayList2);
        List P02 = ca.a.P0(ss.a.class, ss.l.class, ss.p.class, ss.q.class, ss.r.class, ss.s.class, ss.t.class, ss.u.class, ss.v.class, ss.w.class, ss.b.class, ss.c.class, ss.d.class, ss.e.class, ss.f.class, ss.g.class, ss.h.class, ss.i.class, ss.j.class, ss.k.class, ss.m.class, ss.n.class, ss.o.class);
        ArrayList arrayList3 = new ArrayList(is.i.H1(P02, 10));
        for (Object obj : P02) {
            int i10 = i6 + 1;
            if (i6 >= 0) {
                arrayList3.add(new hs.f((Class) obj, Integer.valueOf(i6)));
                i6 = i10;
            } else {
                ca.a.t1();
                throw null;
            }
        }
        f26798d = is.e0.w0(arrayList3);
    }

    public static final fu.b a(Class<?> cls) {
        boolean z10;
        fu.b a10;
        kotlin.jvm.internal.i.g(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                    if (cls.getSimpleName().length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        Class<?> declaringClass = cls.getDeclaringClass();
                        if (declaringClass != null && (a10 = a(declaringClass)) != null) {
                            return a10.d(fu.e.j(cls.getSimpleName()));
                        }
                        return fu.b.l(new fu.c(cls.getName()));
                    }
                }
                fu.c cVar = new fu.c(cls.getName());
                return new fu.b(cVar.e(), fu.c.j(cVar.f()), true);
            }
            throw new IllegalArgumentException(defpackage.b.l("Can't compute ClassId for array type: ", cls));
        }
        throw new IllegalArgumentException(defpackage.b.l("Can't compute ClassId for primitive type: ", cls));
    }

    public static final String b(Class<?> cls) {
        kotlin.jvm.internal.i.g(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException(defpackage.b.l("Unsupported primitive type: ", cls));
        } else if (cls.isArray()) {
            return gv.n.E0(cls.getName(), '.', '/');
        } else {
            return "L" + gv.n.E0(cls.getName(), '.', '/') + ';';
        }
    }

    public static final List<Type> c(Type type) {
        kotlin.jvm.internal.i.g(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return is.w.f20676u;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            kotlin.jvm.internal.i.f(actualTypeArguments, "actualTypeArguments");
            return is.k.i2(actualTypeArguments);
        }
        return ca.a.a1(fv.t.J0(fv.t.E0(fv.k.x0(a.f26799u, type), b.f26800u)));
    }

    public static final ClassLoader d(Class<?> cls) {
        kotlin.jvm.internal.i.g(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            kotlin.jvm.internal.i.f(systemClassLoader, "getSystemClassLoader()");
            return systemClassLoader;
        }
        return classLoader;
    }
}
