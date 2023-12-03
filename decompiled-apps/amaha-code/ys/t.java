package ys;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: TypesJVM.kt */
/* loaded from: classes2.dex */
public final class t {

    /* compiled from: TypesJVM.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38988a;

        static {
            int[] iArr = new int[v.h.e(3).length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38988a = iArr;
        }
    }

    public static final String a(Type type) {
        String name;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                fv.h x02 = fv.k.x0(u.f38989u, type);
                name = ((Class) fv.t.F0(x02)).getName() + gv.n.D0(fv.t.z0(x02), "[]");
            } else {
                name = cls.getName();
            }
            kotlin.jvm.internal.i.f(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }

    public static final Type b(n nVar, boolean z10) {
        Class C;
        int i6;
        e f = nVar.f();
        if (f instanceof o) {
            return new s((o) f);
        }
        if (f instanceof d) {
            if (z10) {
                C = sp.b.D((d) f);
            } else {
                C = sp.b.C((d) f);
            }
            List<p> d10 = nVar.d();
            if (d10.isEmpty()) {
                return C;
            }
            if (C.isArray()) {
                if (C.getComponentType().isPrimitive()) {
                    return C;
                }
                p pVar = (p) is.u.A2(d10);
                if (pVar != null) {
                    int i10 = pVar.f38975a;
                    if (i10 == 0) {
                        i6 = -1;
                    } else {
                        i6 = a.f38988a[v.h.d(i10)];
                    }
                    if (i6 != -1 && i6 != 1) {
                        if (i6 != 2 && i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n nVar2 = pVar.f38976b;
                        kotlin.jvm.internal.i.d(nVar2);
                        Type b10 = b(nVar2, false);
                        if (!(b10 instanceof Class)) {
                            return new ys.a(b10);
                        }
                        return C;
                    }
                    return C;
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + nVar);
            }
            return c(C, d10);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + nVar);
    }

    public static final r c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(d((p) it.next()));
            }
            return new r(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(is.i.H1(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((p) it2.next()));
            }
            return new r(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            r c10 = c(declaringClass, list.subList(length, list.size()));
            List<p> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(is.i.H1(subList, 10));
            for (p pVar : subList) {
                arrayList3.add(d(pVar));
            }
            return new r(cls, c10, arrayList3);
        }
    }

    public static final Type d(p pVar) {
        int i6 = pVar.f38975a;
        if (i6 == 0) {
            return v.f38990w;
        }
        n nVar = pVar.f38976b;
        kotlin.jvm.internal.i.d(nVar);
        int d10 = v.h.d(i6);
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 == 2) {
                    return new v(b(nVar, true), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new v(null, b(nVar, true));
        }
        return b(nVar, true);
    }
}
