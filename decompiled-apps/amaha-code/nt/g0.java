package nt;

import java.lang.reflect.Type;
import java.util.Iterator;
/* compiled from: ReflectJavaType.kt */
/* loaded from: classes2.dex */
public abstract class g0 implements wt.w {
    public abstract Type R();

    public final boolean equals(Object obj) {
        if ((obj instanceof g0) && kotlin.jvm.internal.i.b(R(), ((g0) obj).R())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return R().hashCode();
    }

    @Override // wt.d
    public wt.a l(fu.c fqName) {
        Object obj;
        kotlin.jvm.internal.i.g(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            fu.b g5 = ((wt.a) next).g();
            if (g5 != null) {
                obj = g5.b();
            }
            if (kotlin.jvm.internal.i.b(obj, fqName)) {
                obj = next;
                break;
            }
        }
        return (wt.a) obj;
    }

    public final String toString() {
        return getClass().getName() + ": " + R();
    }
}
