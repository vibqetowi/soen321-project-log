package ne;

import com.google.protobuf.l1;
import com.google.protobuf.w;
import he.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import le.a;
import rf.a;
import rf.c;
import rf.d;
import rf.g;
import rf.i;
import rf.o;
import rf.p;
import rf.q;
import rf.t;
/* compiled from: RemoteSerializer.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final ke.f f26267a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26268b;

    public t(ke.f fVar) {
        this.f26267a = fVar;
        this.f26268b = m(fVar).h();
    }

    public static he.l a(p.g gVar) {
        int ordinal = gVar.S().ordinal();
        int i6 = 2;
        if (ordinal != 0) {
            k.a aVar = k.a.NOT_EQUAL;
            k.a aVar2 = k.a.EQUAL;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    p.j T = gVar.T();
                    ke.m u10 = ke.m.u(T.P().O());
                    int ordinal2 = T.Q().ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 == 4) {
                                    return he.k.f(u10, aVar, ke.t.f23300b);
                                }
                                ca.a.V("Unrecognized UnaryFilter.operator %d", T.Q());
                                throw null;
                            }
                            return he.k.f(u10, aVar, ke.t.f23299a);
                        }
                        return he.k.f(u10, aVar2, ke.t.f23300b);
                    }
                    return he.k.f(u10, aVar2, ke.t.f23299a);
                }
                ca.a.V("Unrecognized Filter.filterType %d", gVar.S());
                throw null;
            }
            p.e R = gVar.R();
            ke.m u11 = ke.m.u(R.Q().O());
            p.e.b R2 = R.R();
            switch (R2.ordinal()) {
                case 1:
                    aVar = k.a.LESS_THAN;
                    break;
                case 2:
                    aVar = k.a.LESS_THAN_OR_EQUAL;
                    break;
                case 3:
                    aVar = k.a.GREATER_THAN;
                    break;
                case 4:
                    aVar = k.a.GREATER_THAN_OR_EQUAL;
                    break;
                case 5:
                    aVar = aVar2;
                    break;
                case 6:
                    break;
                case 7:
                    aVar = k.a.ARRAY_CONTAINS;
                    break;
                case 8:
                    aVar = k.a.IN;
                    break;
                case 9:
                    aVar = k.a.ARRAY_CONTAINS_ANY;
                    break;
                case 10:
                    aVar = k.a.NOT_IN;
                    break;
                default:
                    ca.a.V("Unhandled FieldFilter.operator %d", R2);
                    throw null;
            }
            return he.k.f(u11, aVar, R.S());
        }
        p.c P = gVar.P();
        ArrayList arrayList = new ArrayList();
        for (p.g gVar2 : P.P()) {
            arrayList.add(a(gVar2));
        }
        int ordinal3 = P.Q().ordinal();
        if (ordinal3 != 1) {
            if (ordinal3 != 2) {
                ca.a.V("Only AND and OR composite filter types are supported.", new Object[0]);
                throw null;
            }
        } else {
            i6 = 1;
        }
        return new he.g(arrayList, i6);
    }

    public static ke.p d(String str) {
        boolean z10;
        ke.p u10 = ke.p.u(str);
        if (u10.p() >= 4 && u10.l(0).equals("projects") && u10.l(2).equals("databases")) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Tried to deserialize invalid key %s", u10);
        return u10;
    }

    public static ke.r e(l1 l1Var) {
        if (l1Var.Q() == 0 && l1Var.P() == 0) {
            return ke.r.f23293v;
        }
        return new ke.r(new sc.h(l1Var.P(), l1Var.Q()));
    }

    public static p.f g(ke.m mVar) {
        p.f.a P = p.f.P();
        String h10 = mVar.h();
        P.u();
        p.f.M((p.f) P.f10073v, h10);
        return P.r();
    }

    public static p.g h(he.l lVar) {
        p.c.b bVar;
        boolean z10;
        boolean z11;
        p.j.b bVar2;
        p.j.b bVar3;
        p.e.b bVar4;
        if (lVar instanceof he.k) {
            he.k kVar = (he.k) lVar;
            k.a aVar = kVar.f17537a;
            k.a aVar2 = k.a.EQUAL;
            ke.m mVar = kVar.f17539c;
            rf.s sVar = kVar.f17538b;
            if (aVar == aVar2 || aVar == k.a.NOT_EQUAL) {
                p.j.a R = p.j.R();
                p.f g5 = g(mVar);
                R.u();
                p.j.N((p.j) R.f10073v, g5);
                rf.s sVar2 = ke.t.f23299a;
                if (sVar != null && Double.isNaN(sVar.b0())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (aVar == aVar2) {
                        bVar3 = p.j.b.IS_NAN;
                    } else {
                        bVar3 = p.j.b.IS_NOT_NAN;
                    }
                    R.u();
                    p.j.M((p.j) R.f10073v, bVar3);
                    p.g.a U = p.g.U();
                    U.u();
                    p.g.M((p.g) U.f10073v, R.r());
                    return U.r();
                }
                if (sVar != null && sVar.i0() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (aVar == aVar2) {
                        bVar2 = p.j.b.IS_NULL;
                    } else {
                        bVar2 = p.j.b.IS_NOT_NULL;
                    }
                    R.u();
                    p.j.M((p.j) R.f10073v, bVar2);
                    p.g.a U2 = p.g.U();
                    U2.u();
                    p.g.M((p.g) U2.f10073v, R.r());
                    return U2.r();
                }
            }
            p.e.a T = p.e.T();
            p.f g10 = g(mVar);
            T.u();
            p.e.M((p.e) T.f10073v, g10);
            switch (aVar.ordinal()) {
                case 0:
                    bVar4 = p.e.b.LESS_THAN;
                    break;
                case 1:
                    bVar4 = p.e.b.LESS_THAN_OR_EQUAL;
                    break;
                case 2:
                    bVar4 = p.e.b.EQUAL;
                    break;
                case 3:
                    bVar4 = p.e.b.NOT_EQUAL;
                    break;
                case 4:
                    bVar4 = p.e.b.GREATER_THAN;
                    break;
                case 5:
                    bVar4 = p.e.b.GREATER_THAN_OR_EQUAL;
                    break;
                case 6:
                    bVar4 = p.e.b.ARRAY_CONTAINS;
                    break;
                case 7:
                    bVar4 = p.e.b.ARRAY_CONTAINS_ANY;
                    break;
                case 8:
                    bVar4 = p.e.b.IN;
                    break;
                case 9:
                    bVar4 = p.e.b.NOT_IN;
                    break;
                default:
                    ca.a.V("Unknown operator %d", aVar);
                    throw null;
            }
            T.u();
            p.e.N((p.e) T.f10073v, bVar4);
            T.u();
            p.e.O((p.e) T.f10073v, sVar);
            p.g.a U3 = p.g.U();
            U3.u();
            p.g.L((p.g) U3.f10073v, T.r());
            return U3.r();
        } else if (lVar instanceof he.g) {
            he.g gVar = (he.g) lVar;
            ArrayList arrayList = new ArrayList(gVar.b().size());
            for (he.l lVar2 : gVar.b()) {
                arrayList.add(h(lVar2));
            }
            if (arrayList.size() == 1) {
                return (p.g) arrayList.get(0);
            }
            p.c.a R2 = p.c.R();
            int d10 = v.h.d(gVar.f17500b);
            if (d10 != 0) {
                if (d10 == 1) {
                    bVar = p.c.b.OR;
                } else {
                    ca.a.V("Unrecognized composite filter type.", new Object[0]);
                    throw null;
                }
            } else {
                bVar = p.c.b.AND;
            }
            R2.u();
            p.c.M((p.c) R2.f10073v, bVar);
            R2.u();
            p.c.N((p.c) R2.f10073v, arrayList);
            p.g.a U4 = p.g.U();
            U4.u();
            p.g.O((p.g) U4.f10073v, R2.r());
            return U4.r();
        } else {
            ca.a.V("Unrecognized filter type %s", lVar.toString());
            throw null;
        }
    }

    public static String k(ke.f fVar, ke.p pVar) {
        return m(fVar).d("documents").f(pVar).h();
    }

    public static l1 l(sc.h hVar) {
        l1.a R = l1.R();
        long j10 = hVar.f31450u;
        R.u();
        l1.M((l1) R.f10073v, j10);
        R.u();
        l1.N((l1) R.f10073v, hVar.f31451v);
        return R.r();
    }

    public static ke.p m(ke.f fVar) {
        List asList = Arrays.asList("projects", fVar.f23269u, "databases", fVar.f23270v);
        ke.p pVar = ke.p.f23292v;
        if (asList.isEmpty()) {
            return ke.p.f23292v;
        }
        return new ke.p(asList);
    }

    public static ke.p n(ke.p pVar) {
        boolean z10;
        if (pVar.p() > 4 && pVar.l(4).equals("documents")) {
            z10 = true;
        } else {
            z10 = false;
        }
        ca.a.u0(z10, "Tried to deserialize invalid key %s", pVar);
        return (ke.p) pVar.r();
    }

    public final ke.i b(String str) {
        ke.p d10 = d(str);
        String l2 = d10.l(1);
        ke.f fVar = this.f26267a;
        ca.a.u0(l2.equals(fVar.f23269u), "Tried to deserialize key from different project.", new Object[0]);
        ca.a.u0(d10.l(3).equals(fVar.f23270v), "Tried to deserialize key from different database.", new Object[0]);
        return new ke.i(n(d10));
    }

    public final le.f c(rf.t tVar) {
        le.l lVar;
        boolean z10;
        le.e eVar;
        le.l lVar2;
        if (tVar.a0()) {
            rf.o S = tVar.S();
            int d10 = v.h.d(S.O());
            if (d10 != 0) {
                if (d10 != 1) {
                    if (d10 == 2) {
                        lVar = le.l.f24227c;
                    } else {
                        ca.a.V("Unknown precondition", new Object[0]);
                        throw null;
                    }
                } else {
                    lVar2 = new le.l(e(S.R()), null);
                }
            } else {
                lVar2 = new le.l(null, Boolean.valueOf(S.Q()));
            }
            lVar = lVar2;
        } else {
            lVar = le.l.f24227c;
        }
        le.l lVar3 = lVar;
        ArrayList arrayList = new ArrayList();
        for (i.b bVar : tVar.Y()) {
            int d11 = v.h.d(bVar.W());
            if (d11 != 0) {
                if (d11 != 1) {
                    if (d11 != 4) {
                        if (d11 == 5) {
                            eVar = new le.e(ke.m.u(bVar.S()), new a.C0379a(bVar.U().p()));
                        } else {
                            ca.a.V("Unknown FieldTransform proto: %s", bVar);
                            throw null;
                        }
                    } else {
                        eVar = new le.e(ke.m.u(bVar.S()), new a.b(bVar.R().p()));
                    }
                } else {
                    eVar = new le.e(ke.m.u(bVar.S()), new le.i(bVar.T()));
                }
            } else {
                if (bVar.V() == i.b.EnumC0521b.REQUEST_TIME) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ca.a.u0(z10, "Unknown transform setToServerValue: %s", bVar.V());
                eVar = new le.e(ke.m.u(bVar.S()), le.m.f24230a);
            }
            arrayList.add(eVar);
        }
        int ordinal = tVar.U().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return new le.p(b(tVar.Z()), lVar3);
                }
                ca.a.V("Unknown mutation operation: %d", tVar.U());
                throw null;
            }
            return new le.c(b(tVar.T()), lVar3);
        } else if (tVar.d0()) {
            ke.i b10 = b(tVar.W().R());
            ke.o e10 = ke.o.e(tVar.W().Q());
            rf.g X = tVar.X();
            int P = X.P();
            HashSet hashSet = new HashSet(P);
            for (int i6 = 0; i6 < P; i6++) {
                hashSet.add(ke.m.u(X.O(i6)));
            }
            return new le.k(b10, e10, new le.d(hashSet), lVar3, arrayList);
        } else {
            return new le.n(b(tVar.W().R()), ke.o.e(tVar.W().Q()), lVar3, arrayList);
        }
    }

    public final rf.d f(ke.i iVar, ke.o oVar) {
        d.a T = rf.d.T();
        String k10 = k(this.f26267a, iVar.f23275u);
        T.u();
        rf.d.M((rf.d) T.f10073v, k10);
        Map<String, rf.s> P = oVar.b().e0().P();
        T.u();
        rf.d.N((rf.d) T.f10073v).putAll(P);
        return T.r();
    }

    public final rf.t i(le.f fVar) {
        boolean z10;
        boolean z11;
        rf.o r;
        i.b r10;
        t.a e0 = rf.t.e0();
        if (fVar instanceof le.n) {
            rf.d f = f(fVar.f24215a, ((le.n) fVar).f24231d);
            e0.u();
            rf.t.O((rf.t) e0.f10073v, f);
        } else if (fVar instanceof le.k) {
            rf.d f2 = f(fVar.f24215a, ((le.k) fVar).f24225d);
            e0.u();
            rf.t.O((rf.t) e0.f10073v, f2);
            le.d d10 = fVar.d();
            g.a Q = rf.g.Q();
            for (ke.m mVar : d10.f24212a) {
                String h10 = mVar.h();
                Q.u();
                rf.g.M((rf.g) Q.f10073v, h10);
            }
            e0.u();
            rf.t.M((rf.t) e0.f10073v, Q.r());
        } else {
            boolean z12 = fVar instanceof le.c;
            ke.f fVar2 = this.f26267a;
            if (z12) {
                String k10 = k(fVar2, fVar.f24215a.f23275u);
                e0.u();
                rf.t.Q((rf.t) e0.f10073v, k10);
            } else if (fVar instanceof le.p) {
                String k11 = k(fVar2, fVar.f24215a.f23275u);
                e0.u();
                rf.t.R((rf.t) e0.f10073v, k11);
            } else {
                ca.a.V("unknown mutation type %s", fVar.getClass());
                throw null;
            }
        }
        for (le.e eVar : fVar.f24217c) {
            le.o oVar = eVar.f24214b;
            boolean z13 = oVar instanceof le.m;
            ke.m mVar2 = eVar.f24213a;
            if (z13) {
                i.b.a X = i.b.X();
                String h11 = mVar2.h();
                X.u();
                i.b.N((i.b) X.f10073v, h11);
                X.u();
                i.b.P((i.b) X.f10073v);
                r10 = X.r();
            } else if (oVar instanceof a.b) {
                i.b.a X2 = i.b.X();
                String h12 = mVar2.h();
                X2.u();
                i.b.N((i.b) X2.f10073v, h12);
                a.C0520a S = rf.a.S();
                List<rf.s> list = ((a.b) oVar).f24208a;
                S.u();
                rf.a.N((rf.a) S.f10073v, list);
                X2.u();
                i.b.M((i.b) X2.f10073v, S.r());
                r10 = X2.r();
            } else if (oVar instanceof a.C0379a) {
                i.b.a X3 = i.b.X();
                String h13 = mVar2.h();
                X3.u();
                i.b.N((i.b) X3.f10073v, h13);
                a.C0520a S2 = rf.a.S();
                List<rf.s> list2 = ((a.C0379a) oVar).f24208a;
                S2.u();
                rf.a.N((rf.a) S2.f10073v, list2);
                X3.u();
                i.b.O((i.b) X3.f10073v, S2.r());
                r10 = X3.r();
            } else if (oVar instanceof le.i) {
                i.b.a X4 = i.b.X();
                String h14 = mVar2.h();
                X4.u();
                i.b.N((i.b) X4.f10073v, h14);
                rf.s sVar = ((le.i) oVar).f24224a;
                X4.u();
                i.b.Q((i.b) X4.f10073v, sVar);
                r10 = X4.r();
            } else {
                ca.a.V("Unknown transform: %s", oVar);
                throw null;
            }
            e0.u();
            rf.t.N((rf.t) e0.f10073v, r10);
        }
        le.l lVar = fVar.f24216b;
        ke.r rVar = lVar.f24228a;
        if (rVar == null && lVar.f24229b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Boolean bool = lVar.f24229b;
            if (rVar == null && bool == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            ca.a.u0(!z11, "Can't serialize an empty precondition", new Object[0]);
            o.a S3 = rf.o.S();
            ke.r rVar2 = lVar.f24228a;
            if (rVar2 != null) {
                l1 l2 = l(rVar2.f23294u);
                S3.u();
                rf.o.N((rf.o) S3.f10073v, l2);
                r = S3.r();
            } else if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                S3.u();
                rf.o.M((rf.o) S3.f10073v, booleanValue);
                r = S3.r();
            } else {
                ca.a.V("Unknown Precondition", new Object[0]);
                throw null;
            }
            e0.u();
            rf.t.P((rf.t) e0.f10073v, r);
        }
        return e0.r();
    }

    public final q.c j(he.d0 d0Var) {
        boolean z10;
        boolean z11;
        q.c.a R = q.c.R();
        p.a f02 = rf.p.f0();
        ke.f fVar = this.f26267a;
        ke.p pVar = d0Var.f17473d;
        boolean z12 = false;
        String str = d0Var.f17474e;
        if (str != null) {
            if (pVar.p() % 2 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ca.a.u0(z11, "Collection Group queries should be within a document path or root.", new Object[0]);
            String k10 = k(fVar, pVar);
            R.u();
            q.c.N((q.c) R.f10073v, k10);
            p.b.a Q = p.b.Q();
            Q.u();
            p.b.M((p.b) Q.f10073v, str);
            Q.u();
            p.b.N((p.b) Q.f10073v);
            f02.u();
            rf.p.M((rf.p) f02.f10073v, Q.r());
        } else {
            if (pVar.p() % 2 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, "Document queries with filters are not supported.", new Object[0]);
            String k11 = k(fVar, pVar.t());
            R.u();
            q.c.N((q.c) R.f10073v, k11);
            p.b.a Q2 = p.b.Q();
            String k12 = pVar.k();
            Q2.u();
            p.b.M((p.b) Q2.f10073v, k12);
            f02.u();
            rf.p.M((rf.p) f02.f10073v, Q2.r());
        }
        List<he.l> list = d0Var.f17472c;
        if (list.size() > 0) {
            p.g h10 = h(new he.g(list, 1));
            f02.u();
            rf.p.N((rf.p) f02.f10073v, h10);
        }
        for (he.x xVar : d0Var.f17471b) {
            p.h.a Q3 = p.h.Q();
            if (v.h.b(xVar.f17573a, 1)) {
                p.d dVar = p.d.ASCENDING;
                Q3.u();
                p.h.N((p.h) Q3.f10073v, dVar);
            } else {
                p.d dVar2 = p.d.DESCENDING;
                Q3.u();
                p.h.N((p.h) Q3.f10073v, dVar2);
            }
            p.f g5 = g(xVar.f17574b);
            Q3.u();
            p.h.M((p.h) Q3.f10073v, g5);
            f02.u();
            rf.p.O((rf.p) f02.f10073v, Q3.r());
        }
        long j10 = d0Var.f;
        if (j10 != -1) {
            z12 = true;
        }
        if (z12) {
            w.a P = com.google.protobuf.w.P();
            P.u();
            com.google.protobuf.w.M((com.google.protobuf.w) P.f10073v, (int) j10);
            f02.u();
            rf.p.R((rf.p) f02.f10073v, P.r());
        }
        he.e eVar = d0Var.f17475g;
        if (eVar != null) {
            c.a Q4 = rf.c.Q();
            Q4.u();
            rf.c.M((rf.c) Q4.f10073v, eVar.f17478b);
            Q4.u();
            rf.c.N((rf.c) Q4.f10073v, eVar.f17477a);
            f02.u();
            rf.p.P((rf.p) f02.f10073v, Q4.r());
        }
        he.e eVar2 = d0Var.f17476h;
        if (eVar2 != null) {
            c.a Q5 = rf.c.Q();
            Q5.u();
            rf.c.M((rf.c) Q5.f10073v, eVar2.f17478b);
            Q5.u();
            rf.c.N((rf.c) Q5.f10073v, !eVar2.f17477a);
            f02.u();
            rf.p.Q((rf.p) f02.f10073v, Q5.r());
        }
        R.u();
        q.c.L((q.c) R.f10073v, f02.r());
        return R.r();
    }
}
