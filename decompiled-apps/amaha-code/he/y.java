package he;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: Query.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: k  reason: collision with root package name */
    public static final x f17575k;

    /* renamed from: l  reason: collision with root package name */
    public static final x f17576l;

    /* renamed from: a  reason: collision with root package name */
    public final List<x> f17577a;

    /* renamed from: b  reason: collision with root package name */
    public List<x> f17578b;

    /* renamed from: c  reason: collision with root package name */
    public d0 f17579c;

    /* renamed from: d  reason: collision with root package name */
    public final List<l> f17580d;

    /* renamed from: e  reason: collision with root package name */
    public final ke.p f17581e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final long f17582g;

    /* renamed from: h  reason: collision with root package name */
    public final int f17583h;

    /* renamed from: i  reason: collision with root package name */
    public final e f17584i;

    /* renamed from: j  reason: collision with root package name */
    public final e f17585j;

    /* compiled from: Query.java */
    /* loaded from: classes.dex */
    public static class a implements Comparator<ke.g> {

        /* renamed from: u  reason: collision with root package name */
        public final List<x> f17586u;

        public a(List<x> list) {
            boolean z10;
            loop0: while (true) {
                for (x xVar : list) {
                    z10 = z10 || xVar.f17574b.equals(ke.m.f23283v);
                }
            }
            if (z10) {
                this.f17586u = list;
                return;
            }
            throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
        }

        @Override // java.util.Comparator
        public final int compare(ke.g gVar, ke.g gVar2) {
            int i6;
            boolean z10;
            int a10;
            int c10;
            ke.g gVar3 = gVar;
            ke.g gVar4 = gVar2;
            Iterator<x> it = this.f17586u.iterator();
            do {
                i6 = 0;
                if (!it.hasNext()) {
                    break;
                }
                x next = it.next();
                next.getClass();
                ke.m mVar = ke.m.f23283v;
                ke.m mVar2 = next.f17574b;
                boolean equals = mVar2.equals(mVar);
                int i10 = next.f17573a;
                if (equals) {
                    a10 = defpackage.d.a(i10);
                    c10 = gVar3.getKey().compareTo(gVar4.getKey());
                } else {
                    rf.s e10 = gVar3.e(mVar2);
                    rf.s e11 = gVar4.e(mVar2);
                    if (e10 != null && e11 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ca.a.u0(z10, "Trying to compare documents on fields that don't exist.", new Object[0]);
                    a10 = defpackage.d.a(i10);
                    c10 = ke.t.c(e10, e11);
                }
                i6 = c10 * a10;
            } while (i6 == 0);
            return i6;
        }
    }

    static {
        ke.m mVar = ke.m.f23283v;
        f17575k = new x(1, mVar);
        f17576l = new x(2, mVar);
    }

    /* JADX WARN: Incorrect types in method signature: (Lke/p;Ljava/lang/String;Ljava/util/List<Lhe/l;>;Ljava/util/List<Lhe/x;>;JLjava/lang/Object;Lhe/e;Lhe/e;)V */
    public y(ke.p pVar, String str, List list, List list2, long j10, int i6, e eVar, e eVar2) {
        this.f17581e = pVar;
        this.f = str;
        this.f17577a = list2;
        this.f17580d = list;
        this.f17582g = j10;
        this.f17583h = i6;
        this.f17584i = eVar;
        this.f17585j = eVar2;
    }

    public static y a(ke.p pVar) {
        return new y(pVar, null, Collections.emptyList(), Collections.emptyList(), -1L, 1, null, null);
    }

    public final a b() {
        return new a(e());
    }

    public final y c(l lVar) {
        boolean z10;
        boolean z11 = true;
        ca.a.u0(!g(), "No filter is allowed for document query", new Object[0]);
        ke.m c10 = lVar.c();
        ke.m f = f();
        if (f != null && c10 != null && !f.equals(c10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ca.a.u0(z10, "Query must only have one inequality field", new Object[0]);
        List<x> list = this.f17577a;
        if (!list.isEmpty() && c10 != null && !list.get(0).f17574b.equals(c10)) {
            z11 = false;
        }
        ca.a.u0(z11, "First orderBy must match inequality field", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f17580d);
        arrayList.add(lVar);
        return new y(this.f17581e, this.f, arrayList, this.f17577a, this.f17582g, this.f17583h, this.f17584i, this.f17585j);
    }

    public final ke.m d() {
        List<x> list = this.f17577a;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0).f17574b;
    }

    public final List<x> e() {
        int i6;
        if (this.f17578b == null) {
            ke.m f = f();
            ke.m d10 = d();
            boolean z10 = false;
            x xVar = f17575k;
            if (f != null && d10 == null) {
                if (f.v()) {
                    this.f17578b = Collections.singletonList(xVar);
                } else {
                    this.f17578b = Arrays.asList(new x(1, f), xVar);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                List<x> list = this.f17577a;
                for (x xVar2 : list) {
                    arrayList.add(xVar2);
                    if (xVar2.f17574b.equals(ke.m.f23283v)) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    if (list.size() > 0) {
                        i6 = list.get(list.size() - 1).f17573a;
                    } else {
                        i6 = 1;
                    }
                    if (!v.h.b(i6, 1)) {
                        xVar = f17576l;
                    }
                    arrayList.add(xVar);
                }
                this.f17578b = arrayList;
            }
        }
        return this.f17578b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f17583h != yVar.f17583h) {
            return false;
        }
        return k().equals(yVar.k());
    }

    public final ke.m f() {
        for (l lVar : this.f17580d) {
            ke.m c10 = lVar.c();
            if (c10 != null) {
                return c10;
            }
        }
        return null;
    }

    public final boolean g() {
        if (ke.i.j(this.f17581e) && this.f == null && this.f17580d.isEmpty()) {
            return true;
        }
        return false;
    }

    public final y h(long j10) {
        return new y(this.f17581e, this.f, this.f17580d, this.f17577a, j10, 1, this.f17584i, this.f17585j);
    }

    public final int hashCode() {
        return v.h.d(this.f17583h) + (k().hashCode() * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r4.n(r0) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r4.p() == (r0.p() - 1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
        if (r0 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00de, code lost:
        if (r9 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(ke.g gVar) {
        boolean equals;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (!gVar.b()) {
            return false;
        }
        ke.p pVar = gVar.getKey().f23275u;
        String str = this.f;
        ke.p pVar2 = this.f17581e;
        if (str != null) {
            ke.p pVar3 = gVar.getKey().f23275u;
            if (pVar3.p() >= 2) {
                if (pVar3.f23268u.get(pVar3.p() - 2).equals(str)) {
                    z14 = true;
                    if (z14) {
                    }
                    equals = false;
                }
            }
            z14 = false;
            if (z14) {
            }
            equals = false;
        } else if (ke.i.j(pVar2)) {
            equals = pVar2.equals(pVar);
        } else {
            if (pVar2.n(pVar)) {
            }
            equals = false;
        }
        if (!equals) {
            return false;
        }
        Iterator<x> it = e().iterator();
        while (true) {
            if (it.hasNext()) {
                x next = it.next();
                if (!next.f17574b.equals(ke.m.f23283v) && gVar.e(next.f17574b) == null) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return false;
        }
        Iterator<l> it2 = this.f17580d.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!it2.next().e(gVar)) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        if (!z11) {
            return false;
        }
        e eVar = this.f17584i;
        if (eVar != null) {
            int a10 = eVar.a(e(), gVar);
            if (!eVar.f17477a ? a10 < 0 : a10 <= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        e eVar2 = this.f17585j;
        if (eVar2 != null) {
            int a11 = eVar2.a(e(), gVar);
            if (!eVar2.f17477a ? a11 > 0 : a11 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        boolean z15 = true;
        if (!z15) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (this.f17580d.isEmpty() && this.f17582g == -1 && this.f17584i == null && this.f17585j == null) {
            List<x> list = this.f17577a;
            if (list.isEmpty()) {
                return true;
            }
            if (list.size() == 1 && d().v()) {
                return true;
            }
        }
        return false;
    }

    public final d0 k() {
        e eVar;
        if (this.f17579c == null) {
            if (this.f17583h == 1) {
                this.f17579c = new d0(this.f17581e, this.f, this.f17580d, e(), this.f17582g, this.f17584i, this.f17585j);
            } else {
                ArrayList arrayList = new ArrayList();
                for (x xVar : e()) {
                    int i6 = 2;
                    if (xVar.f17573a == 2) {
                        i6 = 1;
                    }
                    arrayList.add(new x(i6, xVar.f17574b));
                }
                e eVar2 = null;
                e eVar3 = this.f17585j;
                if (eVar3 != null) {
                    eVar = new e(eVar3.f17478b, eVar3.f17477a);
                } else {
                    eVar = null;
                }
                e eVar4 = this.f17584i;
                if (eVar4 != null) {
                    eVar2 = new e(eVar4.f17478b, eVar4.f17477a);
                }
                this.f17579c = new d0(this.f17581e, this.f, this.f17580d, arrayList, this.f17582g, eVar, eVar2);
            }
        }
        return this.f17579c;
    }

    public final String toString() {
        return "Query(target=" + k().toString() + ";limitType=" + defpackage.e.v(this.f17583h) + ")";
    }
}
