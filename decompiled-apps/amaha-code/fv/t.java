package fv;

import fv.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: _Sequences.kt */
/* loaded from: classes2.dex */
public class t extends p {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h<T> A0(h<? extends T> hVar, int i6) {
        boolean z10;
        if (i6 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 != 0) {
                if (hVar instanceof c) {
                    return ((c) hVar).a(i6);
                }
                return new b(hVar, i6);
            }
            return hVar;
        }
        throw new IllegalArgumentException(defpackage.c.q("Requested element count ", i6, " is less than zero.").toString());
    }

    public static final e B0(h hVar, ss.l predicate) {
        kotlin.jvm.internal.i.g(predicate, "predicate");
        return new e(hVar, true, predicate);
    }

    public static final e C0(h hVar, ss.l predicate) {
        kotlin.jvm.internal.i.g(predicate, "predicate");
        return new e(hVar, false, predicate);
    }

    public static final Object D0(e eVar) {
        e.a aVar = new e.a(eVar);
        if (!aVar.hasNext()) {
            return null;
        }
        return aVar.next();
    }

    public static final f E0(h hVar, ss.l transform) {
        kotlin.jvm.internal.i.g(transform, "transform");
        return new f(hVar, transform, s.f15990u);
    }

    public static final <T> T F0(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final v G0(h hVar, ss.l transform) {
        kotlin.jvm.internal.i.g(transform, "transform");
        return new v(hVar, transform);
    }

    public static final e H0(h hVar, ss.l transform) {
        kotlin.jvm.internal.i.g(transform, "transform");
        return C0(new v(hVar, transform), r.f15989u);
    }

    public static final f I0(v vVar, Object obj) {
        return k.w0(k.y0(vVar, k.y0(obj)));
    }

    public static final ArrayList J0(h hVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : hVar) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final <T> int z0(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            it.next();
            i6++;
            if (i6 < 0) {
                ca.a.s1();
                throw null;
            }
        }
        return i6;
    }
}
