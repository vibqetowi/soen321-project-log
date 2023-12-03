package ne;

import as.b;
import com.google.protobuf.h;
import com.google.protobuf.l1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oe.a;
import rf.u;
import tr.d0;
/* compiled from: WriteStream.java */
/* loaded from: classes.dex */
public final class f0 extends b<rf.u, rf.v, a> {

    /* renamed from: v  reason: collision with root package name */
    public static final h.C0164h f26217v = com.google.protobuf.h.f9922v;

    /* renamed from: s  reason: collision with root package name */
    public final t f26218s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f26219t;

    /* renamed from: u  reason: collision with root package name */
    public com.google.protobuf.h f26220u;

    /* compiled from: WriteStream.java */
    /* loaded from: classes.dex */
    public interface a extends z {
        void b();

        void d(ke.r rVar, ArrayList arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0(n nVar, oe.a aVar, t tVar, w wVar) {
        super(nVar, r0, aVar, a.c.WRITE_STREAM_CONNECTION_BACKOFF, a.c.WRITE_STREAM_IDLE, wVar);
        tr.d0<rf.u, rf.v> d0Var = rf.k.f30668a;
        if (d0Var == null) {
            synchronized (rf.k.class) {
                d0Var = rf.k.f30668a;
                if (d0Var == null) {
                    d0.b bVar = d0.b.BIDI_STREAMING;
                    String a10 = tr.d0.a("google.firestore.v1.Firestore", "Write");
                    rf.u P = rf.u.P();
                    com.google.protobuf.n nVar2 = as.b.f3460a;
                    d0Var = new tr.d0<>(bVar, a10, new b.a(P), new b.a(rf.v.N()), true);
                    rf.k.f30668a = d0Var;
                }
            }
        }
        this.f26219t = false;
        this.f26220u = f26217v;
        this.f26218s = tVar;
    }

    @Override // ne.b
    public final void e(rf.v vVar) {
        rf.v vVar2 = vVar;
        this.f26220u = vVar2.O();
        boolean z10 = this.f26219t;
        CallbackT callbackt = this.f26172m;
        if (!z10) {
            this.f26219t = true;
            ((a) callbackt).b();
            return;
        }
        this.f26171l.f = 0L;
        l1 M = vVar2.M();
        this.f26218s.getClass();
        ke.r e10 = t.e(M);
        int Q = vVar2.Q();
        ArrayList arrayList = new ArrayList(Q);
        for (int i6 = 0; i6 < Q; i6++) {
            rf.w P = vVar2.P(i6);
            ke.r e11 = t.e(P.O());
            if (ke.r.f23293v.equals(e11)) {
                e11 = e10;
            }
            int N = P.N();
            ArrayList arrayList2 = new ArrayList(N);
            for (int i10 = 0; i10 < N; i10++) {
                arrayList2.add(P.M(i10));
            }
            arrayList.add(new le.h(e11, arrayList2));
        }
        ((a) callbackt).d(e10, arrayList);
    }

    @Override // ne.b
    public final void f() {
        this.f26219t = false;
        super.f();
    }

    @Override // ne.b
    public final void g() {
        if (this.f26219t) {
            i(Collections.emptyList());
        }
    }

    public final void i(List<le.f> list) {
        ca.a.u0(c(), "Writing mutations requires an opened stream", new Object[0]);
        ca.a.u0(this.f26219t, "Handshake must be complete before writing mutations", new Object[0]);
        u.a Q = rf.u.Q();
        for (le.f fVar : list) {
            rf.t i6 = this.f26218s.i(fVar);
            Q.u();
            rf.u.O((rf.u) Q.f10073v, i6);
        }
        com.google.protobuf.h hVar = this.f26220u;
        Q.u();
        rf.u.N((rf.u) Q.f10073v, hVar);
        h(Q.r());
    }
}
