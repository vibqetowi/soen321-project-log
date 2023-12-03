package com.google.firebase.firestore;

import com.google.firebase.firestore.b;
import fe.e;
import fe.w;
import he.j;
import he.k;
import he.l;
import he.n;
import he.t;
import he.x;
import he.y;
import he.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ke.m;
import ke.p;
import ke.q;
import oe.f;
import oe.g;
import r1.b0;
import rf.a;
import rf.s;
import v.h;
import ya.i;
import ya.v;
/* compiled from: Query.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final y f9634a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseFirestore f9635b;

    public d(y yVar, FirebaseFirestore firebaseFirestore) {
        yVar.getClass();
        this.f9634a = yVar;
        firebaseFirestore.getClass();
        this.f9635b = firebaseFirestore;
    }

    public static void h(Object obj, k.a aVar) {
        if ((obj instanceof List) && ((List) obj).size() != 0) {
            return;
        }
        throw new IllegalArgumentException(b0.b(new StringBuilder("Invalid Query. A non-empty array is required for '"), aVar.f17545u, "' filters."));
    }

    public static void j(m mVar, m mVar2) {
        if (mVar.equals(mVar2)) {
            return;
        }
        String h10 = mVar2.h();
        throw new IllegalArgumentException(String.format("Invalid query. You have an inequality where filter (whereLessThan(), whereGreaterThan(), etc.) on field '%s' and so you must also have '%s' as your first orderBy() field, but your first orderBy() is currently on field '%s' instead.", h10, h10, mVar.h()));
    }

    public final v a() {
        i();
        i iVar = new i();
        i iVar2 = new i();
        j.a aVar = new j.a();
        aVar.f17532a = true;
        aVar.f17533b = true;
        aVar.f17534c = true;
        f fVar = g.f27421b;
        e eVar = new e(iVar, iVar2, 1);
        i();
        he.d dVar = new he.d(fVar, new fe.f(this, eVar, 1));
        n nVar = this.f9635b.f9617i;
        y yVar = this.f9634a;
        synchronized (nVar.f17552d.f27381a) {
        }
        z zVar = new z(yVar, aVar, dVar);
        nVar.f17552d.b(new he.m(nVar, zVar, 0));
        iVar2.b(new t(this.f9635b.f9617i, zVar, dVar));
        return iVar.f38392a;
    }

    public final d b(long j10) {
        if (j10 > 0) {
            return new d(this.f9634a.h(j10), this.f9635b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j10 + ") is invalid. Limit must be positive.");
    }

    public final d c(String str) {
        return e(fe.j.a(str), 1);
    }

    public final d d(String str) {
        return e(fe.j.a(str), 2);
    }

    public final d e(fe.j jVar, int i6) {
        int i10;
        m f;
        defpackage.d.r(i6, "Provided direction must not be null.");
        y yVar = this.f9634a;
        if (yVar.f17584i == null) {
            if (yVar.f17585j == null) {
                m f2 = yVar.f();
                m d10 = yVar.d();
                m mVar = jVar.f14996a;
                if (d10 == null && f2 != null) {
                    j(mVar, f2);
                }
                if (i6 == 1) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                x xVar = new x(i10, mVar);
                ca.a.u0(!yVar.g(), "No ordering is allowed for document query", new Object[0]);
                List<x> list = yVar.f17577a;
                if (list.isEmpty() && (f = yVar.f()) != null && !f.equals(mVar)) {
                    ca.a.V("First orderBy must match inequality field", new Object[0]);
                    throw null;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(xVar);
                return new d(new y(yVar.f17581e, yVar.f, yVar.f17580d, arrayList, yVar.f17582g, yVar.f17583h, yVar.f17584i, yVar.f17585j), this.f9635b);
            }
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
        throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f9634a.equals(dVar.f9634a) && this.f9635b.equals(dVar.f9635b)) {
            return true;
        }
        return false;
    }

    public final s f(Object obj) {
        boolean z10;
        boolean z11 = obj instanceof String;
        FirebaseFirestore firebaseFirestore = this.f9635b;
        if (z11) {
            String str = (String) obj;
            if (!str.isEmpty()) {
                y yVar = this.f9634a;
                if (yVar.f != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && str.contains("/")) {
                    throw new IllegalArgumentException(defpackage.b.m("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '", str, "' contains a '/' character."));
                }
                p f = yVar.f17581e.f(p.u(str));
                if (ke.i.j(f)) {
                    return ke.t.l(firebaseFirestore.f9611b, new ke.i(f));
                }
                throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + f + "' is not because it has an odd number of segments (" + f.p() + ").");
            }
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
        } else if (obj instanceof a) {
            return ke.t.l(firebaseFirestore.f9611b, ((a) obj).f9625a);
        } else {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: ".concat(oe.n.i(obj)));
        }
    }

    public final d g(fe.g gVar) {
        boolean z10;
        if (gVar != null) {
            ke.g gVar2 = gVar.f14990c;
            if (gVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ArrayList arrayList = new ArrayList();
                y yVar = this.f9634a;
                Iterator<x> it = yVar.e().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    FirebaseFirestore firebaseFirestore = this.f9635b;
                    if (hasNext) {
                        x next = it.next();
                        if (next.f17574b.equals(m.f23283v)) {
                            arrayList.add(ke.t.l(firebaseFirestore.f9611b, gVar2.getKey()));
                        } else {
                            m mVar = next.f17574b;
                            s e10 = gVar2.e(mVar);
                            if (!q.c(e10)) {
                                if (e10 != null) {
                                    arrayList.add(e10);
                                } else {
                                    throw new IllegalArgumentException("Invalid query. You are trying to start or end a query using a document for which the field '" + mVar + "' (used as the orderBy) does not exist.");
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid query. You are trying to start or end a query using a document for which the field '" + mVar + "' is an uncommitted server timestamp. (Since the value of this field is unknown, you cannot start/end a query with it.)");
                            }
                        }
                    } else {
                        return new d(new y(yVar.f17581e, yVar.f, yVar.f17580d, yVar.f17577a, yVar.f17582g, yVar.f17583h, new he.e(arrayList, false), yVar.f17585j), firebaseFirestore);
                    }
                }
            } else {
                throw new IllegalArgumentException("Can't use a DocumentSnapshot for a document that doesn't exist for startAfter().");
            }
        } else {
            throw new NullPointerException("Provided snapshot must not be null.");
        }
    }

    public final int hashCode() {
        return this.f9635b.hashCode() + (this.f9634a.hashCode() * 31);
    }

    public final void i() {
        y yVar = this.f9634a;
        if (h.b(yVar.f17583h, 2) && yVar.f17577a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    public final d k(b.a aVar) {
        boolean z10;
        s e10;
        List asList;
        k.a aVar2;
        fe.j jVar = aVar.f9627a;
        ca.a.w(jVar, "Provided field path must not be null.");
        k.a aVar3 = aVar.f9628b;
        ca.a.w(aVar3, "Provided op must not be null.");
        m mVar = jVar.f14996a;
        boolean v10 = mVar.v();
        k.a aVar4 = k.a.ARRAY_CONTAINS_ANY;
        k.a aVar5 = k.a.IN;
        k.a aVar6 = k.a.NOT_IN;
        char c10 = 0;
        int i6 = 1;
        FirebaseFirestore firebaseFirestore = this.f9635b;
        Object obj = aVar.f9629c;
        if (v10) {
            if (aVar3 != k.a.ARRAY_CONTAINS && aVar3 != aVar4) {
                if (aVar3 != aVar5 && aVar3 != aVar6) {
                    e10 = f(obj);
                } else {
                    h(obj, aVar3);
                    a.C0520a S = rf.a.S();
                    for (Object obj2 : (List) obj) {
                        s f = f(obj2);
                        S.u();
                        rf.a.M((rf.a) S.f10073v, f);
                    }
                    s.a j02 = s.j0();
                    j02.x(S);
                    e10 = j02.r();
                }
            } else {
                throw new IllegalArgumentException(b0.b(new StringBuilder("Invalid query. You can't perform '"), aVar3.f17545u, "' queries on FieldPath.documentId()."));
            }
        } else {
            if (aVar3 == aVar5 || aVar3 == aVar6 || aVar3 == aVar4) {
                h(obj, aVar3);
            }
            w wVar = firebaseFirestore.f9615g;
            if (aVar3 != aVar5 && aVar3 != aVar6) {
                z10 = false;
            } else {
                z10 = true;
            }
            e10 = wVar.e(obj, z10);
        }
        k f2 = k.f(mVar, aVar3, e10);
        if (Collections.singletonList(f2).isEmpty()) {
            return this;
        }
        y yVar = this.f9634a;
        y yVar2 = yVar;
        for (k kVar : Collections.singletonList(f2)) {
            k.a aVar7 = kVar.f17537a;
            if (kVar.g()) {
                m f10 = yVar2.f();
                m mVar2 = kVar.f17539c;
                if (f10 != null && !f10.equals(mVar2)) {
                    Object[] objArr = new Object[2];
                    objArr[c10] = f10.h();
                    objArr[i6] = mVar2.h();
                    throw new IllegalArgumentException(String.format("All where filters with an inequality (notEqualTo, notIn, lessThan, lessThanOrEqualTo, greaterThan, or greaterThanOrEqualTo) must be on the same field. But you have filters on '%s' and '%s'", objArr));
                }
                m d10 = yVar2.d();
                if (d10 != null) {
                    j(d10, mVar2);
                }
            }
            List<l> list = yVar2.f17580d;
            int ordinal = aVar7.ordinal();
            k.a aVar8 = k.a.NOT_EQUAL;
            if (ordinal != 3) {
                if (ordinal != 7 && ordinal != 8) {
                    if (ordinal != 9) {
                        asList = new ArrayList();
                    } else {
                        k.a[] aVarArr = new k.a[4];
                        aVarArr[c10] = aVar4;
                        aVarArr[i6] = aVar5;
                        aVarArr[2] = aVar6;
                        aVarArr[3] = aVar8;
                        asList = Arrays.asList(aVarArr);
                    }
                } else {
                    k.a[] aVarArr2 = new k.a[i6];
                    aVarArr2[c10] = aVar6;
                    asList = Arrays.asList(aVarArr2);
                }
            } else {
                k.a[] aVarArr3 = new k.a[2];
                aVarArr3[c10] = aVar8;
                aVarArr3[i6] = aVar6;
                asList = Arrays.asList(aVarArr3);
            }
            Iterator<l> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    for (k kVar2 : it.next().d()) {
                        if (asList.contains(kVar2.f17537a)) {
                            aVar2 = kVar2.f17537a;
                            break;
                        }
                    }
                } else {
                    aVar2 = null;
                    break;
                }
            }
            if (aVar2 != null) {
                String str = aVar7.f17545u;
                if (aVar2 == aVar7) {
                    throw new IllegalArgumentException(defpackage.b.m("Invalid Query. You cannot use more than one '", str, "' filter."));
                }
                throw new IllegalArgumentException(b0.b(defpackage.d.g("Invalid Query. You cannot use '", str, "' filters with '"), aVar2.f17545u, "' filters."));
            }
            yVar2 = yVar2.c(kVar);
            c10 = 0;
            i6 = 1;
        }
        return new d(yVar.c(f2), firebaseFirestore);
    }

    public final d l(Object obj, String str) {
        return k(new b.a(fe.j.a(str), k.a.ARRAY_CONTAINS, obj));
    }

    public final d m(Object obj, String str) {
        return k(new b.a(fe.j.a(str), k.a.EQUAL, obj));
    }

    public final d n(Number number, String str) {
        return k(new b.a(fe.j.a(str), k.a.GREATER_THAN_OR_EQUAL, number));
    }

    public final d o(String str, List<? extends Object> list) {
        return k(new b.a(fe.j.a(str), k.a.IN, list));
    }

    public final d p(Number number, String str) {
        return k(new b.a(fe.j.a(str), k.a.LESS_THAN_OR_EQUAL, number));
    }
}
