package p7;

import android.os.Looper;
import android.util.SparseArray;
import b9.b;
import c9.j;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.google.android.gms.internal.p000firebaseauthapi.le;
import com.google.common.collect.l0;
import com.google.common.collect.m0;
import com.google.common.collect.s;
import com.google.common.collect.t;
import com.theinnerhour.b2b.utils.Constants;
import java.io.IOException;
import java.util.List;
import o8.p;
import p7.o;
/* compiled from: AnalyticsCollector.java */
/* loaded from: classes.dex */
public final class n implements w.d, com.google.android.exoplayer2.audio.a, d9.o, com.google.android.exoplayer2.source.j, b.a, com.google.android.exoplayer2.drm.c {
    public w A;
    public c9.i B;
    public boolean C;

    /* renamed from: u  reason: collision with root package name */
    public final c9.b f27963u;

    /* renamed from: v  reason: collision with root package name */
    public final e0.b f27964v;

    /* renamed from: w  reason: collision with root package name */
    public final e0.c f27965w;

    /* renamed from: x  reason: collision with root package name */
    public final a f27966x;

    /* renamed from: y  reason: collision with root package name */
    public final SparseArray<o.a> f27967y;

    /* renamed from: z  reason: collision with root package name */
    public c9.j<o> f27968z;

    /* compiled from: AnalyticsCollector.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final e0.b f27969a;

        /* renamed from: b  reason: collision with root package name */
        public s<i.a> f27970b;

        /* renamed from: c  reason: collision with root package name */
        public m0 f27971c;

        /* renamed from: d  reason: collision with root package name */
        public i.a f27972d;

        /* renamed from: e  reason: collision with root package name */
        public i.a f27973e;
        public i.a f;

        public a(e0.b bVar) {
            this.f27969a = bVar;
            s.b bVar2 = s.f9446v;
            this.f27970b = l0.f9412y;
            this.f27971c = m0.A;
        }

        public static i.a b(w wVar, s<i.a> sVar, i.a aVar, e0.b bVar) {
            Object m10;
            int i6;
            e0 Q = wVar.Q();
            int s10 = wVar.s();
            if (Q.q()) {
                m10 = null;
            } else {
                m10 = Q.m(s10);
            }
            if (!wVar.b() && !Q.q()) {
                i6 = Q.g(s10, bVar, false).c(c9.w.y(wVar.getCurrentPosition()) - bVar.f6469y);
            } else {
                i6 = -1;
            }
            for (int i10 = 0; i10 < sVar.size(); i10++) {
                i.a aVar2 = sVar.get(i10);
                if (c(aVar2, m10, wVar.b(), wVar.I(), wVar.w(), i6)) {
                    return aVar2;
                }
            }
            if (sVar.isEmpty() && aVar != null) {
                if (c(aVar, m10, wVar.b(), wVar.I(), wVar.w(), i6)) {
                    return aVar;
                }
            }
            return null;
        }

        public static boolean c(i.a aVar, Object obj, boolean z10, int i6, int i10, int i11) {
            if (!aVar.f27272a.equals(obj)) {
                return false;
            }
            int i12 = aVar.f27273b;
            if ((!z10 || i12 != i6 || aVar.f27274c != i10) && (z10 || i12 != -1 || aVar.f27276e != i11)) {
                return false;
            }
            return true;
        }

        public final void a(t.a<i.a, e0> aVar, i.a aVar2, e0 e0Var) {
            if (aVar2 == null) {
                return;
            }
            if (e0Var.c(aVar2.f27272a) != -1) {
                aVar.b(aVar2, e0Var);
                return;
            }
            e0 e0Var2 = (e0) this.f27971c.get(aVar2);
            if (e0Var2 != null) {
                aVar.b(aVar2, e0Var2);
            }
        }

        public final void d(e0 e0Var) {
            t.a<i.a, e0> aVar = new t.a<>(4);
            if (this.f27970b.isEmpty()) {
                a(aVar, this.f27973e, e0Var);
                if (!f6.b.v0(this.f, this.f27973e)) {
                    a(aVar, this.f, e0Var);
                }
                if (!f6.b.v0(this.f27972d, this.f27973e) && !f6.b.v0(this.f27972d, this.f)) {
                    a(aVar, this.f27972d, e0Var);
                }
            } else {
                for (int i6 = 0; i6 < this.f27970b.size(); i6++) {
                    a(aVar, this.f27970b.get(i6), e0Var);
                }
                if (!this.f27970b.contains(this.f27972d)) {
                    a(aVar, this.f27972d, e0Var);
                }
            }
            this.f27971c = aVar.a();
        }
    }

    public n(c9.s sVar) {
        this.f27963u = sVar;
        int i6 = c9.w.f5205a;
        Looper myLooper = Looper.myLooper();
        this.f27968z = new c9.j<>(myLooper == null ? Looper.getMainLooper() : myLooper, sVar, new com.google.firebase.messaging.j(21));
        e0.b bVar = new e0.b();
        this.f27964v = bVar;
        this.f27965w = new e0.c();
        this.f27966x = new a(bVar);
        this.f27967y = new SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void A(r rVar) {
        o.a m02 = m0();
        r0(m02, 14, new dd.a(m02, 14, rVar));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void B(String str) {
        o.a q02 = q0();
        r0(q02, 1013, new k(q02, str, 1));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void C(boolean z10) {
        o.a m02 = m0();
        r0(m02, 9, new m(0, m02, z10));
    }

    @Override // d9.o
    public final void E(le leVar) {
        o.a o02 = o0(this.f27966x.f27973e);
        r0(o02, 1025, new h(2, o02, leVar));
    }

    @Override // d9.o
    public final void F(int i6, long j10) {
        o.a o02 = o0(this.f27966x.f27973e);
        r0(o02, 1023, new i(o02, i6, j10));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void G(p pVar, z8.h hVar) {
        o.a m02 = m0();
        r0(m02, 2, new i7.a(5, m02, pVar, hVar));
    }

    @Override // d9.o
    public final void H(long j10, String str, long j11) {
        o.a q02 = q0();
        r0(q02, 1021, new hn.a(q02, str, j11, j10, 1));
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void I(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1001, new p7.a(p02, dVar, eVar, 2));
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void J(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1000, new p7.a(p02, dVar, eVar, 0));
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void K(int i6, i.a aVar, o8.d dVar, o8.e eVar) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1002, new p7.a(p02, dVar, eVar, 1));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void L(int i6) {
        w wVar = this.A;
        wVar.getClass();
        a aVar = this.f27966x;
        aVar.f27972d = a.b(wVar, aVar.f27970b, aVar.f27973e, aVar.f27969a);
        aVar.d(wVar.Q());
        o.a m02 = m0();
        r0(m02, 0, new g(m02, i6, 2));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void M(le leVar) {
        o.a o02 = o0(this.f27966x.f27973e);
        r0(o02, 1014, new h(0, o02, leVar));
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void O(int i6, i.a aVar) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1034, new e(p02, 4));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void P(le leVar) {
        o.a q02 = q0();
        r0(q02, 1008, new h(1, q02, leVar));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void Q(long j10, String str, long j11) {
        o.a q02 = q0();
        r0(q02, 1009, new hn.a(q02, str, j11, j10, 0));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void R(q qVar, int i6) {
        o.a m02 = m0();
        r0(m02, 1, new j7.f(m02, qVar, i6, 2));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void S(Exception exc) {
        o.a q02 = q0();
        r0(q02, 1018, new b(q02, exc, 1));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void U(com.google.android.exoplayer2.n nVar, r7.f fVar) {
        o.a q02 = q0();
        r0(q02, 1010, new l(q02, nVar, fVar, 1));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void V(int i6, boolean z10) {
        o.a m02 = m0();
        r0(m02, -1, new j(m02, z10, i6, 1));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void W(long j10) {
        o.a q02 = q0();
        r0(q02, 1011, new k7.j(2, j10, q02));
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void X(int i6, i.a aVar) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1031, new e(p02, 5));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void Y(Exception exc) {
        o.a q02 = q0();
        r0(q02, 1037, new b(q02, exc, 2));
    }

    @Override // d9.o
    public final void Z(Exception exc) {
        o.a q02 = q0();
        r0(q02, 1038, new b(q02, exc, 0));
    }

    @Override // com.google.android.exoplayer2.w.d
    public final void a(g8.a aVar) {
        o.a m02 = m0();
        r0(m02, 1007, new dd.a(m02, 10, aVar));
    }

    @Override // d9.o
    public final void a0(com.google.android.exoplayer2.n nVar, r7.f fVar) {
        o.a q02 = q0();
        r0(q02, 1022, new l(q02, nVar, fVar, 0));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void b() {
        o.a m02 = m0();
        r0(m02, -1, new e(m02, 2));
    }

    @Override // d9.o
    public final void b0(long j10, Object obj) {
        o.a q02 = q0();
        r0(q02, 1027, new j7.i(j10, q02, obj));
    }

    @Override // com.google.android.exoplayer2.w.d
    public final void c(d9.q qVar) {
        o.a q02 = q0();
        r0(q02, 1028, new dd.a(q02, 12, qVar));
    }

    @Override // d9.o
    public final void c0(le leVar) {
        o.a q02 = q0();
        r0(q02, 1020, new h(3, q02, leVar));
    }

    @Override // com.google.android.exoplayer2.w.d
    public final void e0(int i6, int i10) {
        o.a q02 = q0();
        r0(q02, 1029, new defpackage.c(q02, i6, i10));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void f0(v vVar) {
        o.a m02 = m0();
        r0(m02, 12, new dd.a(m02, 15, vVar));
    }

    @Override // com.google.android.exoplayer2.w.d
    public final void g(boolean z10) {
        o.a q02 = q0();
        r0(q02, 1017, new m(3, q02, z10));
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void g0(int i6, i.a aVar, int i10) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1030, new g(p02, i10, 4));
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void h0(int i6, i.a aVar) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1035, new e(p02, 3));
    }

    @Override // com.google.android.exoplayer2.w.d
    public final void i0(q7.d dVar) {
        o.a q02 = q0();
        r0(q02, 1016, new dd.a(q02, 8, dVar));
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final void j0(int i6, long j10, long j11) {
        o.a q02 = q0();
        r0(q02, 1012, new d(q02, i6, j10, j11, 0));
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void k0(int i6, i.a aVar) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1033, new e(p02, 6));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l(int i6) {
        o.a m02 = m0();
        r0(m02, 6, new g(m02, i6, 0));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void l0(boolean z10) {
        o.a m02 = m0();
        r0(m02, 7, new m(2, m02, z10));
    }

    @Override // d9.o
    public final void m(String str) {
        o.a q02 = q0();
        r0(q02, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, new k(q02, str, 0));
    }

    public final o.a m0() {
        return o0(this.f27966x.f27972d);
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void n(int i6, i.a aVar, o8.e eVar) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1004, new dd.a(p02, 17, eVar));
    }

    public final o.a n0(e0 e0Var, int i6, i.a aVar) {
        i.a aVar2;
        boolean z10;
        long E;
        if (e0Var.q()) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        long d10 = this.f27963u.d();
        boolean z11 = false;
        if (e0Var.equals(this.A.Q()) && i6 == this.A.K()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar2 != null && aVar2.a()) {
            if (z10 && this.A.I() == aVar2.f27273b && this.A.w() == aVar2.f27274c) {
                z11 = true;
            }
            if (z11) {
                E = this.A.getCurrentPosition();
            }
            E = 0;
        } else if (z10) {
            E = this.A.D();
        } else {
            if (!e0Var.q()) {
                E = c9.w.E(e0Var.n(i6, this.f27965w).G);
            }
            E = 0;
        }
        return new o.a(d10, e0Var, i6, aVar2, E, this.A.Q(), this.A.K(), this.f27966x.f27972d, this.A.getCurrentPosition(), this.A.e());
    }

    @Override // d9.o
    public final void o(int i6, long j10) {
        o.a o02 = o0(this.f27966x.f27973e);
        r0(o02, 1026, new i(o02, j10, i6));
    }

    public final o.a o0(i.a aVar) {
        e0 e0Var;
        boolean z10;
        this.A.getClass();
        if (aVar == null) {
            e0Var = null;
        } else {
            e0Var = (e0) this.f27966x.f27971c.get(aVar);
        }
        if (aVar != null && e0Var != null) {
            return n0(e0Var, e0Var.h(aVar.f27272a, this.f27964v).f6467w, aVar);
        }
        int K = this.A.K();
        e0 Q = this.A.Q();
        if (K < Q.p()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Q = e0.f6464u;
        }
        return n0(Q, K, null);
    }

    @Override // com.google.android.exoplayer2.source.j
    public final void p(int i6, i.a aVar, o8.d dVar, o8.e eVar, IOException iOException, boolean z10) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1003, new defpackage.d(p02, dVar, eVar, iOException, z10));
    }

    public final o.a p0(int i6, i.a aVar) {
        this.A.getClass();
        boolean z10 = false;
        if (aVar != null) {
            if (((e0) this.f27966x.f27971c.get(aVar)) != null) {
                z10 = true;
            }
            if (z10) {
                return o0(aVar);
            }
            return n0(e0.f6464u, i6, aVar);
        }
        e0 Q = this.A.Q();
        if (i6 < Q.p()) {
            z10 = true;
        }
        if (!z10) {
            Q = e0.f6464u;
        }
        return n0(Q, i6, null);
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException exoPlaybackException) {
        o.a aVar;
        o8.f fVar;
        if ((exoPlaybackException instanceof ExoPlaybackException) && (fVar = exoPlaybackException.B) != null) {
            aVar = o0(new i.a(fVar));
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = m0();
        }
        r0(aVar, 10, new dd.a(aVar, 11, exoPlaybackException));
    }

    public final o.a q0() {
        return o0(this.f27966x.f);
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void r(f0 f0Var) {
        o.a m02 = m0();
        r0(m02, 2, new dd.a(m02, 13, f0Var));
    }

    public final void r0(o.a aVar, int i6, j.a<o> aVar2) {
        this.f27967y.put(i6, aVar);
        c9.j<o> jVar = this.f27968z;
        jVar.b(i6, aVar2);
        jVar.a();
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void s(boolean z10) {
        o.a m02 = m0();
        r0(m02, 3, new m(1, m02, z10));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void t(w.a aVar) {
        o.a m02 = m0();
        r0(m02, 13, new dd.a(m02, 16, aVar));
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final void u(int i6, i.a aVar, Exception exc) {
        o.a p02 = p0(i6, aVar);
        r0(p02, 1032, new b(p02, exc, 3));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void v(int i6, boolean z10) {
        o.a m02 = m0();
        r0(m02, 5, new j(m02, z10, i6, 0));
    }

    @Override // com.google.android.exoplayer2.w.d
    public final void w(final float f) {
        final o.a q02 = q0();
        r0(q02, 1019, new j.a(q02, f) { // from class: p7.f
            @Override // c9.j.a
            public final void invoke(Object obj) {
                ((o) obj).f0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void x(int i6) {
        o.a m02 = m0();
        r0(m02, 4, new g(m02, i6, 3));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void y(int i6) {
        o.a m02 = m0();
        r0(m02, 8, new g(m02, i6, 1));
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void z(final int i6, final w.e eVar, final w.e eVar2) {
        if (i6 == 1) {
            this.C = false;
        }
        w wVar = this.A;
        wVar.getClass();
        a aVar = this.f27966x;
        aVar.f27972d = a.b(wVar, aVar.f27970b, aVar.f27973e, aVar.f27969a);
        final o.a m02 = m0();
        r0(m02, 11, new j.a(i6, eVar, eVar2, m02) { // from class: p7.c
            @Override // c9.j.a
            public final void invoke(Object obj) {
                o oVar = (o) obj;
                oVar.i();
                oVar.h0();
            }
        });
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void N() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void T() {
    }

    @Override // com.google.android.exoplayer2.audio.a
    public final /* synthetic */ void d() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void d0() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void e() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void f() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void i() {
    }

    @Override // d9.o
    public final /* synthetic */ void j() {
    }

    @Override // com.google.android.exoplayer2.drm.c
    public final /* synthetic */ void k() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void h(List list) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void D(w wVar, w.c cVar) {
    }
}
