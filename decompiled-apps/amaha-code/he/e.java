package he;

import java.util.List;
/* compiled from: Bound.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17477a;

    /* renamed from: b  reason: collision with root package name */
    public final List<rf.s> f17478b;

    public e(List<rf.s> list, boolean z10) {
        this.f17478b = list;
        this.f17477a = z10;
    }

    public final int a(List<x> list, ke.g gVar) {
        boolean z10;
        boolean z11;
        int c10;
        List<rf.s> list2 = this.f17478b;
        if (list2.size() <= list.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Bound has more components than query's orderBy", new Object[0]);
        int i6 = 0;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            x xVar = list.get(i10);
            rf.s sVar = list2.get(i10);
            if (xVar.f17574b.equals(ke.m.f23283v)) {
                ca.a.u0(ke.t.k(sVar), "Bound has a non-key value where the key path is being used %s", sVar);
                c10 = ke.i.h(sVar.f0()).compareTo(gVar.getKey());
            } else {
                rf.s e10 = gVar.e(xVar.f17574b);
                if (e10 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ca.a.u0(z11, "Field should exist since document matched the orderBy already.", new Object[0]);
                c10 = ke.t.c(sVar, e10);
            }
            if (v.h.b(xVar.f17573a, 2)) {
                c10 *= -1;
            }
            i6 = c10;
            if (i6 != 0) {
                break;
            }
        }
        return i6;
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (rf.s sVar : this.f17478b) {
            if (!z10) {
                sb2.append(",");
            }
            sb2.append(ke.t.a(sVar));
            z10 = false;
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f17477a == eVar.f17477a && this.f17478b.equals(eVar.f17478b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17478b.hashCode() + ((this.f17477a ? 1 : 0) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Bound(inclusive=");
        sb2.append(this.f17477a);
        sb2.append(", position=");
        int i6 = 0;
        while (true) {
            List<rf.s> list = this.f17478b;
            if (i6 < list.size()) {
                if (i6 > 0) {
                    sb2.append(" and ");
                }
                sb2.append(ke.t.a(list.get(i6)));
                i6++;
            } else {
                sb2.append(")");
                return sb2.toString();
            }
        }
    }
}
