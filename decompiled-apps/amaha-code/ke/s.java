package ke;

import he.d0;
import he.k;
import he.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.l;
/* compiled from: TargetIndexMatcher.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f23295a;

    /* renamed from: b  reason: collision with root package name */
    public final he.k f23296b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f23297c;

    /* renamed from: d  reason: collision with root package name */
    public final List<x> f23298d;

    public s(d0 d0Var) {
        boolean z10;
        String str = d0Var.f17474e;
        this.f23295a = str == null ? d0Var.f17473d.k() : str;
        this.f23298d = d0Var.f17471b;
        this.f23296b = null;
        this.f23297c = new ArrayList();
        Iterator<he.l> it = d0Var.f17472c.iterator();
        while (it.hasNext()) {
            he.k kVar = (he.k) it.next();
            if (kVar.g()) {
                he.k kVar2 = this.f23296b;
                if (kVar2 != null && !kVar2.f17539c.equals(kVar.f17539c)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ca.a.u0(z10, "Only a single inequality is supported", new Object[0]);
                this.f23296b = kVar;
            } else {
                this.f23297c.add(kVar);
            }
        }
    }

    public static boolean b(he.k kVar, l.c cVar) {
        boolean z10;
        if (kVar == null) {
            return false;
        }
        if (!kVar.f17539c.equals(cVar.d())) {
            return false;
        }
        k.a aVar = k.a.ARRAY_CONTAINS;
        k.a aVar2 = kVar.f17537a;
        if (!aVar2.equals(aVar) && !aVar2.equals(k.a.ARRAY_CONTAINS_ANY)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (v.h.b(cVar.f(), 3) != z10) {
            return false;
        }
        return true;
    }

    public static boolean c(x xVar, l.c cVar) {
        if (!xVar.f17574b.equals(cVar.d())) {
            return false;
        }
        boolean b10 = v.h.b(cVar.f(), 1);
        int i6 = xVar.f17573a;
        if ((!b10 || !v.h.b(i6, 1)) && (!v.h.b(cVar.f(), 2) || !v.h.b(i6, 2))) {
            return false;
        }
        return true;
    }

    public final boolean a(l.c cVar) {
        Iterator it = this.f23297c.iterator();
        while (it.hasNext()) {
            if (b((he.k) it.next(), cVar)) {
                return true;
            }
        }
        return false;
    }
}
