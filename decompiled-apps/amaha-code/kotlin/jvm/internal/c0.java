package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: TypeIntrinsics.java */
/* loaded from: classes2.dex */
public final class c0 {
    public static Collection a(Collection collection) {
        if ((collection instanceof ts.a) && !(collection instanceof ts.b)) {
            f(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        return collection;
    }

    public static List b(Object obj) {
        if ((obj instanceof ts.a) && !(obj instanceof ts.c)) {
            f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            i.m(c0.class.getName(), e10);
            throw e10;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof ts.a) && !(obj instanceof ts.d)) {
            f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            i.m(c0.class.getName(), e10);
            throw e10;
        }
    }

    public static Set d(Object obj) {
        if ((obj instanceof ts.a) && !(obj instanceof ts.e)) {
            f(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            i.m(c0.class.getName(), e10);
            throw e10;
        }
    }

    public static void e(int i6, Object obj) {
        int i10;
        if (obj != null) {
            boolean z10 = false;
            if (obj instanceof hs.a) {
                if (obj instanceof e) {
                    i10 = ((e) obj).getArity();
                } else if (obj instanceof ss.a) {
                    i10 = 0;
                } else if (obj instanceof ss.l) {
                    i10 = 1;
                } else if (obj instanceof ss.p) {
                    i10 = 2;
                } else if (obj instanceof ss.q) {
                    i10 = 3;
                } else if (obj instanceof ss.r) {
                    i10 = 4;
                } else if (obj instanceof ss.s) {
                    i10 = 5;
                } else if (obj instanceof ss.t) {
                    i10 = 6;
                } else if (obj instanceof ss.u) {
                    i10 = 7;
                } else if (obj instanceof ss.v) {
                    i10 = 8;
                } else if (obj instanceof ss.w) {
                    i10 = 9;
                } else if (obj instanceof ss.b) {
                    i10 = 10;
                } else if (obj instanceof ss.c) {
                    i10 = 11;
                } else if (obj instanceof ss.d) {
                    i10 = 12;
                } else if (obj instanceof ss.e) {
                    i10 = 13;
                } else if (obj instanceof ss.f) {
                    i10 = 14;
                } else if (obj instanceof ss.g) {
                    i10 = 15;
                } else if (obj instanceof ss.h) {
                    i10 = 16;
                } else if (obj instanceof ss.i) {
                    i10 = 17;
                } else if (obj instanceof ss.j) {
                    i10 = 18;
                } else if (obj instanceof ss.k) {
                    i10 = 19;
                } else if (obj instanceof ss.m) {
                    i10 = 20;
                } else if (obj instanceof ss.n) {
                    i10 = 21;
                } else if (obj instanceof ss.o) {
                    i10 = 22;
                } else {
                    i10 = -1;
                }
                if (i10 == i6) {
                    z10 = true;
                }
            }
            if (!z10) {
                f(obj, "kotlin.jvm.functions.Function" + i6);
                throw null;
            }
        }
    }

    public static void f(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(defpackage.d.f(name, " cannot be cast to ", str));
        i.m(c0.class.getName(), classCastException);
        throw classCastException;
    }
}
