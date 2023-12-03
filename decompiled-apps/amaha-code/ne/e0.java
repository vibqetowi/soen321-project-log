package ne;

import as.b;
import com.google.protobuf.h;
import com.google.protobuf.y;
import java.util.Collections;
import ne.c0;
import oe.a;
import tr.d0;
import tr.i0;
/* compiled from: WatchStream.java */
/* loaded from: classes.dex */
public final class e0 extends b<rf.l, rf.m, a> {

    /* renamed from: t  reason: collision with root package name */
    public static final h.C0164h f26212t = com.google.protobuf.h.f9922v;

    /* renamed from: s  reason: collision with root package name */
    public final t f26213s;

    /* compiled from: WatchStream.java */
    /* loaded from: classes.dex */
    public interface a extends z {
        void c(ke.r rVar, c0 c0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(n nVar, oe.a aVar, t tVar, v vVar) {
        super(nVar, r0, aVar, a.c.LISTEN_STREAM_CONNECTION_BACKOFF, a.c.LISTEN_STREAM_IDLE, vVar);
        tr.d0<rf.l, rf.m> d0Var = rf.k.f30669b;
        if (d0Var == null) {
            synchronized (rf.k.class) {
                d0Var = rf.k.f30669b;
                if (d0Var == null) {
                    d0.b bVar = d0.b.BIDI_STREAMING;
                    String a10 = tr.d0.a("google.firestore.v1.Firestore", "Listen");
                    rf.l Q = rf.l.Q();
                    com.google.protobuf.n nVar2 = as.b.f3460a;
                    d0Var = new tr.d0<>(bVar, a10, new b.a(Q), new b.a(rf.m.M()), true);
                    rf.k.f30669b = d0Var;
                }
            }
        }
        this.f26213s = tVar;
    }

    @Override // ne.b
    public final void e(rf.m mVar) {
        c0.d dVar;
        c0 cVar;
        ke.r e10;
        c0.a aVar;
        rf.m mVar2 = mVar;
        this.f26171l.f = 0L;
        t tVar = this.f26213s;
        tVar.getClass();
        int d10 = v.h.d(mVar2.R());
        i0 i0Var = null;
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 != 2) {
                    if (d10 != 3) {
                        if (d10 == 4) {
                            rf.j Q = mVar2.Q();
                            cVar = new c0.b(Q.O(), new vd.a(Q.M(), 2));
                        } else {
                            throw new IllegalArgumentException("Unknown change type set");
                        }
                    } else {
                        rf.h P = mVar2.P();
                        aVar = new c0.a(Collections.emptyList(), P.O(), tVar.b(P.N()), null);
                    }
                } else {
                    rf.f O = mVar2.O();
                    y.c P2 = O.P();
                    ke.n n10 = ke.n.n(tVar.b(O.N()), t.e(O.O()));
                    aVar = new c0.a(Collections.emptyList(), P2, n10.f23285b, n10);
                }
            } else {
                rf.e N = mVar2.N();
                y.c P3 = N.P();
                y.c O2 = N.O();
                ke.i b10 = tVar.b(N.N().R());
                ke.r e11 = t.e(N.N().S());
                ca.a.u0(!e11.equals(ke.r.f23293v), "Got a document change without an update time", new Object[0]);
                ke.o e12 = ke.o.e(N.N().Q());
                ke.n nVar = new ke.n(b10);
                nVar.j(e11, e12);
                aVar = new c0.a(P3, O2, b10, nVar);
            }
            cVar = aVar;
        } else {
            rf.r S = mVar2.S();
            int ordinal = S.Q().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                dVar = c0.d.Reset;
                            } else {
                                throw new IllegalArgumentException("Unknown target change type");
                            }
                        } else {
                            dVar = c0.d.Current;
                        }
                    } else {
                        dVar = c0.d.Removed;
                        zf.a M = S.M();
                        i0Var = i0.c(M.M()).g(M.O());
                    }
                } else {
                    dVar = c0.d.Added;
                }
            } else {
                dVar = c0.d.NoChange;
            }
            cVar = new c0.c(dVar, S.S(), S.P(), i0Var);
        }
        if (mVar2.R() != 1) {
            e10 = ke.r.f23293v;
        } else if (mVar2.S().R() != 0) {
            e10 = ke.r.f23293v;
        } else {
            e10 = t.e(mVar2.S().O());
        }
        ((a) this.f26172m).c(e10, cVar);
    }
}
