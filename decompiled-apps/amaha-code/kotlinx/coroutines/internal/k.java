package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.k1;
/* compiled from: MainDispatchers.kt */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k1 f23608a;

    static {
        String str;
        Object next;
        k1 b10;
        int i6 = s.f23616a;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List<? extends j> a12 = ca.a.a1(fv.t.J0(fv.k.u0(defpackage.e.o())));
        Iterator it = a12.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int c10 = ((j) next).c();
                do {
                    Object next2 = it.next();
                    int c11 = ((j) next2).c();
                    if (c10 < c11) {
                        next = next2;
                        c10 = c11;
                    }
                } while (it.hasNext());
            }
        }
        j jVar = (j) next;
        if (jVar != null && (b10 = jVar.b(a12)) != null) {
            f23608a = b10;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
