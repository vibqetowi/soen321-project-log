package com.google.android.exoplayer2.source;

import b9.f;
import b9.u;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.upstream.Loader;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: ProgressiveMediaSource.java */
/* loaded from: classes.dex */
public final class n extends com.google.android.exoplayer2.source.a implements m.b {

    /* renamed from: g  reason: collision with root package name */
    public final com.google.android.exoplayer2.q f6947g;

    /* renamed from: h  reason: collision with root package name */
    public final q.g f6948h;

    /* renamed from: i  reason: collision with root package name */
    public final f.a f6949i;

    /* renamed from: j  reason: collision with root package name */
    public final l.a f6950j;

    /* renamed from: k  reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.d f6951k;

    /* renamed from: l  reason: collision with root package name */
    public final b9.r f6952l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6953m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6954n;

    /* renamed from: o  reason: collision with root package name */
    public long f6955o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6956p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6957q;
    public u r;

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes.dex */
    public class a extends o8.c {
        public a(o8.m mVar) {
            super(mVar);
        }

        @Override // o8.c, com.google.android.exoplayer2.e0
        public final e0.b g(int i6, e0.b bVar, boolean z10) {
            super.g(i6, bVar, z10);
            bVar.f6470z = true;
            return bVar;
        }

        @Override // o8.c, com.google.android.exoplayer2.e0
        public final e0.c o(int i6, e0.c cVar, long j10) {
            super.o(i6, cVar, j10);
            cVar.F = true;
            return cVar;
        }
    }

    public n(com.google.android.exoplayer2.q qVar, f.a aVar, l.a aVar2, com.google.android.exoplayer2.drm.d dVar, b9.r rVar, int i6) {
        q.g gVar = qVar.f6685v;
        gVar.getClass();
        this.f6948h = gVar;
        this.f6947g = qVar;
        this.f6949i = aVar;
        this.f6950j = aVar2;
        this.f6951k = dVar;
        this.f6952l = rVar;
        this.f6953m = i6;
        this.f6954n = true;
        this.f6955o = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.i
    public final h a(i.a aVar, b9.i iVar, long j10) {
        b9.f a10 = this.f6949i.a();
        u uVar = this.r;
        if (uVar != null) {
            a10.c(uVar);
        }
        q.g gVar = this.f6948h;
        return new m(gVar.f6735a, a10, new s1.s((u7.k) ((f0.b) this.f6950j).f14603v), this.f6951k, new c.a(this.f6821d.f6440c, 0, aVar), this.f6952l, new j.a(this.f6820c.f6898c, 0, aVar), this, iVar, gVar.f6739e, this.f6953m);
    }

    @Override // com.google.android.exoplayer2.source.i
    public final com.google.android.exoplayer2.q g() {
        return this.f6947g;
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void l(h hVar) {
        p[] pVarArr;
        m mVar = (m) hVar;
        if (mVar.P) {
            for (p pVar : mVar.M) {
                pVar.g();
                DrmSession drmSession = pVar.f6981i;
                if (drmSession != null) {
                    drmSession.b(pVar.f6978e);
                    pVar.f6981i = null;
                    pVar.f6980h = null;
                }
            }
        }
        Loader loader = mVar.E;
        Loader.c<? extends Loader.d> cVar = loader.f7162b;
        if (cVar != null) {
            cVar.a(true);
        }
        Loader.f fVar = new Loader.f(mVar);
        ExecutorService executorService = loader.f7161a;
        executorService.execute(fVar);
        executorService.shutdown();
        mVar.J.removeCallbacksAndMessages(null);
        mVar.K = null;
        mVar.f6918f0 = true;
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void q(u uVar) {
        this.r = uVar;
        this.f6951k.l();
        t();
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void s() {
        this.f6951k.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.exoplayer2.source.n$a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.exoplayer2.source.a, com.google.android.exoplayer2.source.n] */
    public final void t() {
        o8.m mVar = new o8.m(this.f6955o, this.f6956p, this.f6957q, this.f6947g);
        if (this.f6954n) {
            mVar = new a(mVar);
        }
        r(mVar);
    }

    public final void u(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f6955o;
        }
        if (!this.f6954n && this.f6955o == j10 && this.f6956p == z10 && this.f6957q == z11) {
            return;
        }
        this.f6955o = j10;
        this.f6956p = z10;
        this.f6957q = z11;
        this.f6954n = false;
        t();
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void j() {
    }

    /* compiled from: ProgressiveMediaSource.java */
    /* loaded from: classes.dex */
    public static final class b implements o8.i {

        /* renamed from: a  reason: collision with root package name */
        public final f.a f6958a;

        /* renamed from: b  reason: collision with root package name */
        public final l.a f6959b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6960c;

        /* renamed from: d  reason: collision with root package name */
        public s7.c f6961d;

        /* renamed from: e  reason: collision with root package name */
        public b9.r f6962e;
        public final int f;

        public b(f.a aVar, u7.k kVar) {
            f0.b bVar = new f0.b(19, kVar);
            this.f6958a = aVar;
            this.f6959b = bVar;
            this.f6961d = new com.google.android.exoplayer2.drm.a();
            this.f6962e = new com.google.android.exoplayer2.upstream.a();
            this.f = 1048576;
        }

        @Override // o8.i
        public final o8.i a(String str) {
            if (!this.f6960c) {
                ((com.google.android.exoplayer2.drm.a) this.f6961d).f6428y = str;
            }
            return this;
        }

        @Override // o8.i
        public final o8.i c(b9.o oVar) {
            if (!this.f6960c) {
                ((com.google.android.exoplayer2.drm.a) this.f6961d).f6427x = oVar;
            }
            return this;
        }

        @Override // o8.i
        public final o8.i e(b9.r rVar) {
            if (rVar == null) {
                rVar = new com.google.android.exoplayer2.upstream.a();
            }
            this.f6962e = rVar;
            return this;
        }

        @Override // o8.i
        public final /* bridge */ /* synthetic */ o8.i f(s7.c cVar) {
            i(cVar);
            return this;
        }

        @Override // o8.i
        public final o8.i g(com.google.android.exoplayer2.drm.d dVar) {
            if (dVar == null) {
                i(null);
            } else {
                i(new f0.b(20, dVar));
            }
            return this;
        }

        @Override // o8.i
        /* renamed from: h */
        public final n d(com.google.android.exoplayer2.q qVar) {
            qVar.f6685v.getClass();
            Object obj = qVar.f6685v.f6740g;
            return new n(qVar, this.f6958a, this.f6959b, this.f6961d.a(qVar), this.f6962e, this.f);
        }

        public final void i(s7.c cVar) {
            if (cVar != null) {
                this.f6961d = cVar;
                this.f6960c = true;
                return;
            }
            this.f6961d = new com.google.android.exoplayer2.drm.a();
            this.f6960c = false;
        }

        @Override // o8.i
        public final o8.i b(List list) {
            return this;
        }
    }
}
