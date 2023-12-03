package je;

import com.google.protobuf.l1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import qf.a;
import rf.i;
import rf.p;
import rf.q;
import rf.t;
/* compiled from: LocalSerializer.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ne.t f21836a;

    public i(ne.t tVar) {
        this.f21836a = tVar;
    }

    public static ArrayList a(qf.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (a.b bVar : aVar.M()) {
            ke.m u10 = ke.m.u(bVar.M());
            int i6 = 2;
            if (v.h.b(bVar.O(), 2)) {
                i6 = 3;
            } else if (bVar.N().equals(a.b.EnumC0501b.ASCENDING)) {
                i6 = 1;
            }
            arrayList.add(new ke.d(u10, i6));
        }
        return arrayList;
    }

    public final ke.n b(me.a aVar) {
        int d10 = v.h.d(aVar.R());
        ne.t tVar = this.f21836a;
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 == 2) {
                    me.d U = aVar.U();
                    ke.i b10 = tVar.b(U.P());
                    ke.r e10 = ne.t.e(U.Q());
                    ke.n nVar = new ke.n(b10);
                    nVar.f23287d = e10;
                    nVar.f23286c = 4;
                    nVar.f = new ke.o();
                    nVar.f23289g = 2;
                    return nVar;
                }
                ca.a.V("Unknown MaybeDocument %s", aVar);
                throw null;
            }
            rf.d Q = aVar.Q();
            boolean S = aVar.S();
            ke.i b11 = tVar.b(Q.R());
            ke.r e11 = ne.t.e(Q.S());
            ke.o e12 = ke.o.e(Q.Q());
            ke.n nVar2 = new ke.n(b11);
            nVar2.j(e11, e12);
            if (S) {
                nVar2.f23289g = 2;
            }
            return nVar2;
        }
        me.b T = aVar.T();
        boolean S2 = aVar.S();
        ke.n n10 = ke.n.n(tVar.b(T.P()), ne.t.e(T.Q()));
        if (S2) {
            n10.f23289g = 2;
        }
        return n10;
    }

    public final le.g c(me.e eVar) {
        boolean z10;
        int S = eVar.S();
        l1 T = eVar.T();
        ne.t tVar = this.f21836a;
        tVar.getClass();
        sc.h hVar = new sc.h(T.P(), T.Q());
        int R = eVar.R();
        ArrayList arrayList = new ArrayList(R);
        for (int i6 = 0; i6 < R; i6++) {
            arrayList.add(tVar.c(eVar.Q(i6)));
        }
        ArrayList arrayList2 = new ArrayList(eVar.V());
        int i10 = 0;
        while (i10 < eVar.V()) {
            rf.t U = eVar.U(i10);
            int i11 = i10 + 1;
            if (i11 < eVar.V() && eVar.U(i11).b0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ca.a.u0(eVar.U(i10).c0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                t.a f02 = rf.t.f0(U);
                for (i.b bVar : eVar.U(i11).V().N()) {
                    f02.u();
                    rf.t.N((rf.t) f02.f10073v, bVar);
                }
                arrayList2.add(tVar.c(f02.r()));
                i10 = i11;
            } else {
                arrayList2.add(tVar.c(U));
            }
            i10++;
        }
        return new le.g(S, hVar, arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b1 d(me.c cVar) {
        ke.p n10;
        ke.p pVar;
        String str;
        List<he.l> emptyList;
        int Y;
        ArrayList emptyList2;
        long j10;
        he.e eVar;
        he.e eVar2;
        he.d0 d0Var;
        int i6;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ke.p n11;
        int a02 = cVar.a0();
        l1 Z = cVar.Z();
        this.f21836a.getClass();
        ke.r e10 = ne.t.e(Z);
        ke.r e11 = ne.t.e(cVar.V());
        com.google.protobuf.h Y2 = cVar.Y();
        long W = cVar.W();
        int ordinal = cVar.b0().ordinal();
        int i10 = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                q.b U = cVar.U();
                int P = U.P();
                if (P == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ca.a.u0(z13, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(P));
                ke.p d10 = ne.t.d(U.O());
                if (d10.p() == 4) {
                    n11 = ke.p.f23292v;
                } else {
                    n11 = ne.t.n(d10);
                }
                d0Var = he.y.a(n11).k();
            } else {
                ca.a.V("Unknown targetType %d", cVar.b0());
                throw null;
            }
        } else {
            q.c X = cVar.X();
            String P2 = X.P();
            rf.p Q = X.Q();
            ke.p d11 = ne.t.d(P2);
            if (d11.p() == 4) {
                n10 = ke.p.f23292v;
            } else {
                n10 = ne.t.n(d11);
            }
            int V = Q.V();
            if (V > 0) {
                if (V == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ca.a.u0(z12, "StructuredQuery.from with more than one collection is not supported.", new Object[0]);
                p.b U2 = Q.U();
                if (U2.O()) {
                    pVar = n10;
                    str = U2.P();
                    if (!Q.e0()) {
                        he.l a10 = ne.t.a(Q.a0());
                        if (a10 instanceof he.g) {
                            he.g gVar = (he.g) a10;
                            Iterator it = gVar.f17499a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((he.l) it.next()) instanceof he.g) {
                                        z10 = false;
                                        break;
                                    }
                                } else {
                                    z10 = true;
                                    break;
                                }
                            }
                            if (z10 && gVar.f()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                emptyList = gVar.b();
                            }
                        }
                        emptyList = Collections.singletonList(a10);
                    } else {
                        emptyList = Collections.emptyList();
                    }
                    List<he.l> list = emptyList;
                    Y = Q.Y();
                    if (Y <= 0) {
                        ArrayList arrayList = new ArrayList(Y);
                        int i11 = 0;
                        while (i11 < Y) {
                            p.h X2 = Q.X(i11);
                            ke.m u10 = ke.m.u(X2.P().O());
                            int i12 = Y;
                            int ordinal2 = X2.O().ordinal();
                            if (ordinal2 != i10) {
                                if (ordinal2 == 2) {
                                    i6 = 2;
                                } else {
                                    ca.a.V("Unrecognized direction %d", X2.O());
                                    throw null;
                                }
                            } else {
                                i6 = 1;
                            }
                            arrayList.add(new he.x(i6, u10));
                            i11++;
                            Y = i12;
                            i10 = 1;
                        }
                        emptyList2 = arrayList;
                    } else {
                        emptyList2 = Collections.emptyList();
                    }
                    if (!Q.c0()) {
                        j10 = Q.W().O();
                    } else {
                        j10 = -1;
                    }
                    if (!Q.d0()) {
                        eVar = new he.e(Q.Z().p(), Q.Z().O());
                    } else {
                        eVar = null;
                    }
                    if (!Q.b0()) {
                        eVar2 = new he.e(Q.T().p(), !Q.T().O());
                    } else {
                        eVar2 = null;
                    }
                    d0Var = new he.d0(pVar, str, list, emptyList2, j10, eVar, eVar2);
                } else {
                    n10 = n10.d(U2.P());
                }
            }
            pVar = n10;
            str = null;
            if (!Q.e0()) {
            }
            List<he.l> list2 = emptyList;
            Y = Q.Y();
            if (Y <= 0) {
            }
            if (!Q.c0()) {
            }
            if (!Q.d0()) {
            }
            if (!Q.b0()) {
            }
            d0Var = new he.d0(pVar, str, list2, emptyList2, j10, eVar, eVar2);
        }
        return new b1(d0Var, a02, W, a0.LISTEN, e10, e11, Y2);
    }
}
