package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.e;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o7.x;
import u7.t;
import u7.v;
/* compiled from: ProgressiveMediaPeriod.java */
/* loaded from: classes.dex */
public final class m implements h, u7.j, Loader.a<a>, Loader.e, p.c {

    /* renamed from: g0  reason: collision with root package name */
    public static final Map<String, String> f6913g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final com.google.android.exoplayer2.n f6914h0;
    public final b A;
    public final b9.i B;
    public final String C;
    public final long D;
    public final l F;
    public h.a K;
    public k8.b L;
    public boolean O;
    public boolean P;
    public boolean Q;
    public e R;
    public t S;
    public boolean U;
    public boolean W;
    public boolean X;
    public int Y;

    /* renamed from: a0  reason: collision with root package name */
    public long f6915a0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f6917d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f6918f0;

    /* renamed from: u  reason: collision with root package name */
    public final Uri f6919u;

    /* renamed from: v  reason: collision with root package name */
    public final b9.f f6920v;

    /* renamed from: w  reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.d f6921w;

    /* renamed from: x  reason: collision with root package name */
    public final b9.r f6922x;

    /* renamed from: y  reason: collision with root package name */
    public final j.a f6923y;

    /* renamed from: z  reason: collision with root package name */
    public final c.a f6924z;
    public final Loader E = new Loader("ProgressiveMediaPeriod");
    public final c9.d G = new c9.d();
    public final o8.j H = new Runnable(this) { // from class: o8.j

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ com.google.android.exoplayer2.source.m f27289v;

        {
            this.f27289v = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6 = r2;
            com.google.android.exoplayer2.source.m mVar = this.f27289v;
            switch (i6) {
                case 0:
                    mVar.x();
                    return;
                default:
                    if (!mVar.f6918f0) {
                        h.a aVar = mVar.K;
                        aVar.getClass();
                        aVar.a(mVar);
                        return;
                    }
                    return;
            }
        }
    };
    public final o8.j I = new Runnable(this) { // from class: o8.j

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ com.google.android.exoplayer2.source.m f27289v;

        {
            this.f27289v = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6 = r2;
            com.google.android.exoplayer2.source.m mVar = this.f27289v;
            switch (i6) {
                case 0:
                    mVar.x();
                    return;
                default:
                    if (!mVar.f6918f0) {
                        h.a aVar = mVar.K;
                        aVar.getClass();
                        aVar.a(mVar);
                        return;
                    }
                    return;
            }
        }
    };
    public final Handler J = w.j(null);
    public d[] N = new d[0];
    public p[] M = new p[0];

    /* renamed from: b0  reason: collision with root package name */
    public long f6916b0 = -9223372036854775807L;
    public long Z = -1;
    public long T = -9223372036854775807L;
    public int V = 1;

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class a implements Loader.d, e.a {

        /* renamed from: b  reason: collision with root package name */
        public final Uri f6926b;

        /* renamed from: c  reason: collision with root package name */
        public final b9.t f6927c;

        /* renamed from: d  reason: collision with root package name */
        public final l f6928d;

        /* renamed from: e  reason: collision with root package name */
        public final u7.j f6929e;
        public final c9.d f;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f6931h;

        /* renamed from: j  reason: collision with root package name */
        public long f6933j;

        /* renamed from: m  reason: collision with root package name */
        public p f6936m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f6937n;

        /* renamed from: g  reason: collision with root package name */
        public final u7.s f6930g = new u7.s();

        /* renamed from: i  reason: collision with root package name */
        public boolean f6932i = true;

        /* renamed from: l  reason: collision with root package name */
        public long f6935l = -1;

        /* renamed from: a  reason: collision with root package name */
        public final long f6925a = o8.d.f27264b.getAndIncrement();

        /* renamed from: k  reason: collision with root package name */
        public b9.h f6934k = c(0);

        public a(Uri uri, b9.f fVar, l lVar, u7.j jVar, c9.d dVar) {
            this.f6926b = uri;
            this.f6927c = new b9.t(fVar);
            this.f6928d = lVar;
            this.f6929e = jVar;
            this.f = dVar;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.d
        public final void a() {
            b9.f fVar;
            int i6;
            int i10 = 0;
            while (i10 == 0 && !this.f6931h) {
                try {
                    long j10 = this.f6930g.f33905a;
                    b9.h c10 = c(j10);
                    this.f6934k = c10;
                    long h10 = this.f6927c.h(c10);
                    this.f6935l = h10;
                    if (h10 != -1) {
                        this.f6935l = h10 + j10;
                    }
                    m.this.L = k8.b.a(this.f6927c.j());
                    b9.t tVar = this.f6927c;
                    k8.b bVar = m.this.L;
                    if (bVar != null && (i6 = bVar.f23073z) != -1) {
                        fVar = new com.google.android.exoplayer2.source.e(tVar, i6, this);
                        m mVar = m.this;
                        mVar.getClass();
                        p A = mVar.A(new d(0, true));
                        this.f6936m = A;
                        A.e(m.f6914h0);
                    } else {
                        fVar = tVar;
                    }
                    long j11 = j10;
                    ((s1.s) this.f6928d).B(fVar, this.f6926b, this.f6927c.j(), j10, this.f6935l, this.f6929e);
                    if (m.this.L != null) {
                        Object obj = ((s1.s) this.f6928d).f31225w;
                        if (((u7.h) obj) instanceof a8.d) {
                            ((a8.d) ((u7.h) obj)).r = true;
                        }
                    }
                    if (this.f6932i) {
                        l lVar = this.f6928d;
                        long j12 = this.f6933j;
                        u7.h hVar = (u7.h) ((s1.s) lVar).f31225w;
                        hVar.getClass();
                        hVar.g(j11, j12);
                        this.f6932i = false;
                    }
                    while (true) {
                        long j13 = j11;
                        while (i10 == 0 && !this.f6931h) {
                            try {
                                c9.d dVar = this.f;
                                synchronized (dVar) {
                                    while (!dVar.f5132b) {
                                        dVar.wait();
                                    }
                                }
                                l lVar2 = this.f6928d;
                                u7.s sVar = this.f6930g;
                                s1.s sVar2 = (s1.s) lVar2;
                                u7.h hVar2 = (u7.h) sVar2.f31225w;
                                hVar2.getClass();
                                u7.i iVar = (u7.i) sVar2.f31226x;
                                iVar.getClass();
                                i10 = hVar2.h(iVar, sVar);
                                j11 = ((s1.s) this.f6928d).q();
                                if (j11 > m.this.D + j13) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f.b();
                        m mVar2 = m.this;
                        mVar2.J.post(mVar2.I);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (((s1.s) this.f6928d).q() != -1) {
                        this.f6930g.f33905a = ((s1.s) this.f6928d).q();
                    }
                    b9.t tVar2 = this.f6927c;
                    if (tVar2 != null) {
                        try {
                            tVar2.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    if (i10 != 1 && ((s1.s) this.f6928d).q() != -1) {
                        this.f6930g.f33905a = ((s1.s) this.f6928d).q();
                    }
                    b9.t tVar3 = this.f6927c;
                    if (tVar3 != null) {
                        try {
                            tVar3.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.d
        public final void b() {
            this.f6931h = true;
        }

        public final b9.h c(long j10) {
            Collections.emptyMap();
            String str = m.this.C;
            Map<String, String> map = m.f6913g0;
            Uri uri = this.f6926b;
            sc.b.F(uri, "The uri must be set.");
            return new b9.h(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class c implements o8.k {

        /* renamed from: u  reason: collision with root package name */
        public final int f6939u;

        public c(int i6) {
            this.f6939u = i6;
        }

        @Override // o8.k
        public final void b() {
            m mVar = m.this;
            p pVar = mVar.M[this.f6939u];
            DrmSession drmSession = pVar.f6981i;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.DrmSessionException error = pVar.f6981i.getError();
                error.getClass();
                throw error;
            }
            int a10 = ((com.google.android.exoplayer2.upstream.a) mVar.f6922x).a(mVar.V);
            Loader loader = mVar.E;
            IOException iOException = loader.f7163c;
            if (iOException == null) {
                Loader.c<? extends Loader.d> cVar = loader.f7162b;
                if (cVar != null) {
                    if (a10 == Integer.MIN_VALUE) {
                        a10 = cVar.f7166u;
                    }
                    IOException iOException2 = cVar.f7170y;
                    if (iOException2 != null && cVar.f7171z > a10) {
                        throw iOException2;
                    }
                    return;
                }
                return;
            }
            throw iOException;
        }

        @Override // o8.k
        public final int c(long j10) {
            boolean z10;
            m mVar = m.this;
            int i6 = this.f6939u;
            int i10 = 0;
            if (!mVar.C()) {
                mVar.y(i6);
                p pVar = mVar.M[i6];
                boolean z11 = mVar.e0;
                synchronized (pVar) {
                    int k10 = pVar.k(pVar.f6991t);
                    int i11 = pVar.f6991t;
                    int i12 = pVar.f6989q;
                    if (i11 != i12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && j10 >= pVar.f6987o[k10]) {
                        if (j10 > pVar.f6994w && z11) {
                            i10 = i12 - i11;
                        } else {
                            int h10 = pVar.h(k10, i12 - i11, j10, true);
                            if (h10 != -1) {
                                i10 = h10;
                            }
                        }
                    }
                }
                pVar.t(i10);
                if (i10 == 0) {
                    mVar.z(i6);
                }
            }
            return i10;
        }

        @Override // o8.k
        public final int f(androidx.appcompat.widget.l lVar, DecoderInputBuffer decoderInputBuffer, int i6) {
            boolean z10;
            boolean z11;
            int i10;
            m mVar = m.this;
            int i11 = this.f6939u;
            if (mVar.C()) {
                return -3;
            }
            mVar.y(i11);
            p pVar = mVar.M[i11];
            boolean z12 = mVar.e0;
            pVar.getClass();
            boolean z13 = false;
            if ((i6 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            p.a aVar = pVar.f6975b;
            synchronized (pVar) {
                decoderInputBuffer.f6361x = false;
                int i12 = pVar.f6991t;
                if (i12 != pVar.f6989q) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (!z12 && !pVar.f6995x) {
                        com.google.android.exoplayer2.n nVar = pVar.A;
                        if (nVar != null && (z10 || nVar != pVar.f6980h)) {
                            pVar.o(nVar, lVar);
                            i10 = -5;
                        } else {
                            i10 = -3;
                        }
                    }
                    decoderInputBuffer.f30528u = 4;
                    i10 = -4;
                } else {
                    com.google.android.exoplayer2.n nVar2 = pVar.f6976c.a(pVar.r + i12).f7001a;
                    if (!z10 && nVar2 == pVar.f6980h) {
                        int k10 = pVar.k(pVar.f6991t);
                        if (!pVar.n(k10)) {
                            decoderInputBuffer.f6361x = true;
                            i10 = -3;
                        } else {
                            decoderInputBuffer.f30528u = pVar.f6986n[k10];
                            long j10 = pVar.f6987o[k10];
                            decoderInputBuffer.f6362y = j10;
                            if (j10 < pVar.f6992u) {
                                decoderInputBuffer.j(LinearLayoutManager.INVALID_OFFSET);
                            }
                            aVar.f6998a = pVar.f6985m[k10];
                            aVar.f6999b = pVar.f6984l[k10];
                            aVar.f7000c = pVar.f6988p[k10];
                            i10 = -4;
                        }
                    }
                    pVar.o(nVar2, lVar);
                    i10 = -5;
                }
            }
            if (i10 == -4 && !decoderInputBuffer.k(4)) {
                if ((i6 & 1) != 0) {
                    z13 = true;
                }
                if ((i6 & 4) == 0) {
                    if (z13) {
                        o oVar = pVar.f6974a;
                        o.e(oVar.f6967e, decoderInputBuffer, pVar.f6975b, oVar.f6965c);
                    } else {
                        o oVar2 = pVar.f6974a;
                        oVar2.f6967e = o.e(oVar2.f6967e, decoderInputBuffer, pVar.f6975b, oVar2.f6965c);
                    }
                }
                if (!z13) {
                    pVar.f6991t++;
                }
            }
            if (i10 == -3) {
                mVar.z(i11);
            }
            return i10;
        }

        @Override // o8.k
        public final boolean isReady() {
            m mVar = m.this;
            if (!mVar.C() && mVar.M[this.f6939u].m(mVar.e0)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f6941a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6942b;

        public d(int i6, boolean z10) {
            this.f6941a = i6;
            this.f6942b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f6941a == dVar.f6941a && this.f6942b == dVar.f6942b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f6941a * 31) + (this.f6942b ? 1 : 0);
        }
    }

    /* compiled from: ProgressiveMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final o8.p f6943a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f6944b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f6945c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f6946d;

        public e(o8.p pVar, boolean[] zArr) {
            this.f6943a = pVar;
            this.f6944b = zArr;
            int i6 = pVar.f27306u;
            this.f6945c = new boolean[i6];
            this.f6946d = new boolean[i6];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f6913g0 = Collections.unmodifiableMap(hashMap);
        n.a aVar = new n.a();
        aVar.f6656a = "icy";
        aVar.f6665k = "application/x-icy";
        f6914h0 = aVar.a();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [o8.j] */
    /* JADX WARN: Type inference failed for: r1v5, types: [o8.j] */
    public m(Uri uri, b9.f fVar, s1.s sVar, com.google.android.exoplayer2.drm.d dVar, c.a aVar, b9.r rVar, j.a aVar2, b bVar, b9.i iVar, String str, int i6) {
        this.f6919u = uri;
        this.f6920v = fVar;
        this.f6921w = dVar;
        this.f6924z = aVar;
        this.f6922x = rVar;
        this.f6923y = aVar2;
        this.A = bVar;
        this.B = iVar;
        this.C = str;
        this.D = i6;
        this.F = sVar;
    }

    public final p A(d dVar) {
        int length = this.M.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (dVar.equals(this.N[i6])) {
                return this.M[i6];
            }
        }
        Looper looper = this.J.getLooper();
        looper.getClass();
        com.google.android.exoplayer2.drm.d dVar2 = this.f6921w;
        dVar2.getClass();
        c.a aVar = this.f6924z;
        aVar.getClass();
        p pVar = new p(this.B, looper, dVar2, aVar);
        pVar.f6979g = this;
        int i10 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.N, i10);
        dVarArr[length] = dVar;
        int i11 = w.f5205a;
        this.N = dVarArr;
        p[] pVarArr = (p[]) Arrays.copyOf(this.M, i10);
        pVarArr[length] = pVar;
        this.M = pVarArr;
        return pVar;
    }

    public final void B() {
        a aVar = new a(this.f6919u, this.f6920v, this.F, this, this.G);
        if (this.P) {
            sc.b.C(v());
            long j10 = this.T;
            if (j10 != -9223372036854775807L && this.f6916b0 > j10) {
                this.e0 = true;
                this.f6916b0 = -9223372036854775807L;
                return;
            }
            t tVar = this.S;
            tVar.getClass();
            long j11 = tVar.i(this.f6916b0).f33906a.f33912b;
            long j12 = this.f6916b0;
            aVar.f6930g.f33905a = j11;
            aVar.f6933j = j12;
            aVar.f6932i = true;
            aVar.f6937n = false;
            for (p pVar : this.M) {
                pVar.f6992u = this.f6916b0;
            }
            this.f6916b0 = -9223372036854775807L;
        }
        this.f6917d0 = p();
        this.f6923y.i(new o8.d(aVar.f6925a, aVar.f6934k, this.E.b(aVar, this, ((com.google.android.exoplayer2.upstream.a) this.f6922x).a(this.V))), null, aVar.f6933j, this.T);
    }

    public final boolean C() {
        if (!this.X && !v()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.a
    public final void a(a aVar, long j10, long j11, boolean z10) {
        a aVar2 = aVar;
        b9.t tVar = aVar2.f6927c;
        Uri uri = tVar.f4214c;
        o8.d dVar = new o8.d(tVar.f4215d);
        this.f6922x.getClass();
        this.f6923y.c(dVar, aVar2.f6933j, this.T);
        if (!z10) {
            if (this.Z == -1) {
                this.Z = aVar2.f6935l;
            }
            for (p pVar : this.M) {
                pVar.p(false);
            }
            if (this.Y > 0) {
                h.a aVar3 = this.K;
                aVar3.getClass();
                aVar3.a(this);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.a
    public final void b(a aVar, long j10, long j11) {
        t tVar;
        long j12;
        a aVar2 = aVar;
        if (this.T == -9223372036854775807L && (tVar = this.S) != null) {
            boolean d10 = tVar.d();
            long q10 = q();
            if (q10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = q10 + 10000;
            }
            this.T = j12;
            ((n) this.A).u(j12, d10, this.U);
        }
        b9.t tVar2 = aVar2.f6927c;
        Uri uri = tVar2.f4214c;
        o8.d dVar = new o8.d(tVar2.f4215d);
        this.f6922x.getClass();
        this.f6923y.e(dVar, null, aVar2.f6933j, this.T);
        if (this.Z == -1) {
            this.Z = aVar2.f6935l;
        }
        this.e0 = true;
        h.a aVar3 = this.K;
        aVar3.getClass();
        aVar3.a(this);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long c() {
        if (this.Y == 0) {
            return Long.MIN_VALUE;
        }
        return g();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean d(long j10) {
        boolean z10;
        if (!this.e0) {
            Loader loader = this.E;
            if (loader.f7163c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !this.c0 && (!this.P || this.Y != 0)) {
                boolean c10 = this.G.c();
                if (!loader.a()) {
                    B();
                    return true;
                }
                return c10;
            }
        }
        return false;
    }

    @Override // u7.j
    public final void e() {
        this.O = true;
        this.J.post(this.H);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean f() {
        boolean z10;
        if (this.E.a()) {
            c9.d dVar = this.G;
            synchronized (dVar) {
                z10 = dVar.f5132b;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long g() {
        long j10;
        boolean z10;
        o();
        boolean[] zArr = this.R.f6944b;
        if (this.e0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.f6916b0;
        }
        if (this.Q) {
            int length = this.M.length;
            j10 = Long.MAX_VALUE;
            for (int i6 = 0; i6 < length; i6++) {
                if (zArr[i6]) {
                    p pVar = this.M[i6];
                    synchronized (pVar) {
                        z10 = pVar.f6995x;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.M[i6].i());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = q();
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f6915a0;
        }
        return j10;
    }

    @Override // u7.j
    public final void i(t tVar) {
        this.J.post(new q7.f(this, 3, tVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fb  */
    @Override // com.google.android.exoplayer2.upstream.Loader.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Loader.b j(a aVar, long j10, long j11, IOException iOException, int i6) {
        long j12;
        int i10;
        boolean z10;
        boolean z11;
        Loader.b bVar;
        Loader.b bVar2;
        t tVar;
        boolean z12;
        boolean z13;
        a aVar2 = aVar;
        if (this.Z == -1) {
            this.Z = aVar2.f6935l;
        }
        b9.t tVar2 = aVar2.f6927c;
        Uri uri = tVar2.f4214c;
        o8.d dVar = new o8.d(tVar2.f4215d);
        w.E(aVar2.f6933j);
        w.E(this.T);
        b9.r rVar = this.f6922x;
        ((com.google.android.exoplayer2.upstream.a) rVar).getClass();
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException instanceof Loader.UnexpectedLoaderException)) {
            int i11 = DataSourceException.f7152v;
            Throwable th2 = iOException;
            while (true) {
                if (th2 != null) {
                    if ((th2 instanceof DataSourceException) && ((DataSourceException) th2).f7153u == 2008) {
                        z13 = true;
                        break;
                    }
                    th2 = th2.getCause();
                } else {
                    z13 = false;
                    break;
                }
            }
            if (!z13) {
                j12 = Math.min((i6 - 1) * 1000, 5000);
                if (j12 != -9223372036854775807L) {
                    bVar2 = Loader.f7160e;
                    z10 = false;
                } else {
                    int p10 = p();
                    if (p10 > this.f6917d0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (this.Z == -1 && ((tVar = this.S) == null || tVar.j() == -9223372036854775807L)) {
                        if (this.P && !C()) {
                            this.c0 = true;
                            z11 = false;
                            z10 = false;
                            if (!z11) {
                                bVar = new Loader.b(i10, j12);
                            } else {
                                bVar = Loader.f7159d;
                            }
                            bVar2 = bVar;
                        } else {
                            this.X = this.P;
                            this.f6915a0 = 0L;
                            z10 = false;
                            this.f6917d0 = 0;
                            for (p pVar : this.M) {
                                pVar.p(false);
                            }
                            aVar2.f6930g.f33905a = 0L;
                            aVar2.f6933j = 0L;
                            aVar2.f6932i = true;
                            aVar2.f6937n = false;
                        }
                    } else {
                        z10 = false;
                        this.f6917d0 = p10;
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    bVar2 = bVar;
                }
                int i12 = bVar2.f7164a;
                z12 = !((i12 != 0 || i12 == 1) ? true : true);
                this.f6923y.g(dVar, 1, null, aVar2.f6933j, this.T, iOException, z12);
                if (z12) {
                    rVar.getClass();
                }
                return bVar2;
            }
        }
        j12 = -9223372036854775807L;
        if (j12 != -9223372036854775807L) {
        }
        int i122 = bVar2.f7164a;
        z12 = !((i122 != 0 || i122 == 1) ? true : true);
        this.f6923y.g(dVar, 1, null, aVar2.f6933j, this.T, iOException, z12);
        if (z12) {
        }
        return bVar2;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long k(z8.d[] dVarArr, boolean[] zArr, o8.k[] kVarArr, boolean[] zArr2, long j10) {
        boolean[] zArr3;
        boolean z10;
        z8.d dVar;
        boolean z11;
        boolean z12;
        o();
        e eVar = this.R;
        o8.p pVar = eVar.f6943a;
        int i6 = this.Y;
        int i10 = 0;
        while (true) {
            int length = dVarArr.length;
            zArr3 = eVar.f6945c;
            if (i10 >= length) {
                break;
            }
            o8.k kVar = kVarArr[i10];
            if (kVar != null && (dVarArr[i10] == null || !zArr[i10])) {
                int i11 = ((c) kVar).f6939u;
                sc.b.C(zArr3[i11]);
                this.Y--;
                zArr3[i11] = false;
                kVarArr[i10] = null;
            }
            i10++;
        }
        if (!this.W ? j10 != 0 : i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            if (kVarArr[i12] == null && (dVar = dVarArr[i12]) != null) {
                if (dVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sc.b.C(z11);
                if (dVar.h(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sc.b.C(z12);
                int b10 = pVar.b(dVar.b());
                sc.b.C(!zArr3[b10]);
                this.Y++;
                zArr3[b10] = true;
                kVarArr[i12] = new c(b10);
                zArr2[i12] = true;
                if (!z10) {
                    p pVar2 = this.M[b10];
                    if (!pVar2.s(true, j10) && pVar2.r + pVar2.f6991t != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.Y == 0) {
            this.c0 = false;
            this.X = false;
            Loader loader = this.E;
            if (loader.a()) {
                for (p pVar3 : this.M) {
                    pVar3.g();
                }
                Loader.c<? extends Loader.d> cVar = loader.f7162b;
                sc.b.E(cVar);
                cVar.a(false);
            } else {
                for (p pVar4 : this.M) {
                    pVar4.p(false);
                }
            }
        } else if (z10) {
            j10 = m(j10);
            for (int i13 = 0; i13 < kVarArr.length; i13++) {
                if (kVarArr[i13] != null) {
                    zArr2[i13] = true;
                }
            }
        }
        this.W = true;
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void l() {
        int a10 = ((com.google.android.exoplayer2.upstream.a) this.f6922x).a(this.V);
        Loader loader = this.E;
        IOException iOException = loader.f7163c;
        if (iOException == null) {
            Loader.c<? extends Loader.d> cVar = loader.f7162b;
            if (cVar != null) {
                if (a10 == Integer.MIN_VALUE) {
                    a10 = cVar.f7166u;
                }
                IOException iOException2 = cVar.f7170y;
                if (iOException2 != null && cVar.f7171z > a10) {
                    throw iOException2;
                }
            }
            if (this.e0 && !this.P) {
                throw ParserException.a("Loading finished before preparation is complete.", null);
            }
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long m(long j10) {
        boolean z10;
        o();
        boolean[] zArr = this.R.f6944b;
        if (!this.S.d()) {
            j10 = 0;
        }
        this.X = false;
        this.f6915a0 = j10;
        if (v()) {
            this.f6916b0 = j10;
            return j10;
        }
        if (this.V != 7) {
            int length = this.M.length;
            for (int i6 = 0; i6 < length; i6++) {
                if (!this.M[i6].s(false, j10) && (zArr[i6] || !this.Q)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return j10;
            }
        }
        this.c0 = false;
        this.f6916b0 = j10;
        this.e0 = false;
        Loader loader = this.E;
        if (loader.a()) {
            for (p pVar : this.M) {
                pVar.g();
            }
            Loader.c<? extends Loader.d> cVar = loader.f7162b;
            sc.b.E(cVar);
            cVar.a(false);
        } else {
            loader.f7163c = null;
            for (p pVar2 : this.M) {
                pVar2.p(false);
            }
        }
        return j10;
    }

    @Override // u7.j
    public final v n(int i6, int i10) {
        return A(new d(i6, false));
    }

    public final void o() {
        sc.b.C(this.P);
        this.R.getClass();
        this.S.getClass();
    }

    public final int p() {
        p[] pVarArr;
        int i6 = 0;
        for (p pVar : this.M) {
            i6 += pVar.r + pVar.f6989q;
        }
        return i6;
    }

    public final long q() {
        long j10 = Long.MIN_VALUE;
        for (p pVar : this.M) {
            j10 = Math.max(j10, pVar.i());
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void r(boolean z10, long j10) {
        long j11;
        int i6;
        int i10;
        o();
        if (v()) {
            return;
        }
        boolean[] zArr = this.R.f6945c;
        int length = this.M.length;
        for (int i11 = 0; i11 < length; i11++) {
            p pVar = this.M[i11];
            boolean z11 = zArr[i11];
            o oVar = pVar.f6974a;
            synchronized (pVar) {
                int i12 = pVar.f6989q;
                if (i12 != 0) {
                    long[] jArr = pVar.f6987o;
                    int i13 = pVar.f6990s;
                    if (j10 >= jArr[i13]) {
                        if (z11 && (i10 = pVar.f6991t) != i12) {
                            i6 = i10 + 1;
                        } else {
                            i6 = i12;
                        }
                        int h10 = pVar.h(i13, i6, j10, z10);
                        if (h10 != -1) {
                            j11 = pVar.f(h10);
                        } else {
                            j11 = -1;
                        }
                    }
                }
                j11 = -1;
            }
            oVar.a(j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long s() {
        if (this.X) {
            if (this.e0 || p() > this.f6917d0) {
                this.X = false;
                return this.f6915a0;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void t(h.a aVar, long j10) {
        this.K = aVar;
        this.G.c();
        B();
    }

    @Override // com.google.android.exoplayer2.source.h
    public final o8.p u() {
        o();
        return this.R.f6943a;
    }

    public final boolean v() {
        if (this.f6916b0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (java.lang.Math.abs(r7 - r18) <= java.lang.Math.abs(r9 - r18)) goto L32;
     */
    @Override // com.google.android.exoplayer2.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long w(long j10, x xVar) {
        boolean z10;
        o();
        if (!this.S.d()) {
            return 0L;
        }
        t.a i6 = this.S.i(j10);
        long j11 = i6.f33906a.f33911a;
        long j12 = i6.f33907b.f33911a;
        long j13 = xVar.f27257b;
        long j14 = xVar.f27256a;
        if (j14 == 0 && j13 == 0) {
            return j10;
        }
        int i10 = w.f5205a;
        long j15 = j10 - j14;
        if (((j14 ^ j10) & (j10 ^ j15)) < 0) {
            j15 = Long.MIN_VALUE;
        }
        long j16 = j10 + j13;
        if (((j13 ^ j16) & (j10 ^ j16)) < 0) {
            j16 = Long.MAX_VALUE;
        }
        boolean z11 = true;
        if (j15 <= j11 && j11 <= j16) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (j15 > j12 || j12 > j16) ? false : false;
        if (!z10 || !z11) {
            if (!z10) {
                if (!z11) {
                    return j15;
                }
                return j12;
            }
            return j11;
        }
    }

    public final void x() {
        boolean z10;
        g8.a a10;
        int i6;
        if (!this.f6918f0 && !this.P && this.O && this.S != null) {
            for (p pVar : this.M) {
                if (pVar.l() == null) {
                    return;
                }
            }
            c9.d dVar = this.G;
            synchronized (dVar) {
                dVar.f5132b = false;
            }
            int length = this.M.length;
            o8.o[] oVarArr = new o8.o[length];
            boolean[] zArr = new boolean[length];
            for (int i10 = 0; i10 < length; i10++) {
                com.google.android.exoplayer2.n l2 = this.M[i10].l();
                l2.getClass();
                String str = l2.F;
                boolean h10 = c9.l.h(str);
                if (!h10 && !c9.l.j(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zArr[i10] = z10;
                this.Q = z10 | this.Q;
                k8.b bVar = this.L;
                if (bVar != null) {
                    if (h10 || this.N[i10].f6942b) {
                        g8.a aVar = l2.D;
                        if (aVar == null) {
                            a10 = new g8.a(bVar);
                        } else {
                            a10 = aVar.a(bVar);
                        }
                        n.a aVar2 = new n.a(l2);
                        aVar2.f6663i = a10;
                        l2 = new com.google.android.exoplayer2.n(aVar2);
                    }
                    if (h10 && l2.f6655z == -1 && l2.A == -1 && (i6 = bVar.f23068u) != -1) {
                        n.a aVar3 = new n.a(l2);
                        aVar3.f = i6;
                        l2 = new com.google.android.exoplayer2.n(aVar3);
                    }
                }
                int d10 = this.f6921w.d(l2);
                n.a b10 = l2.b();
                b10.D = d10;
                oVarArr[i10] = new o8.o(b10.a());
            }
            this.R = new e(new o8.p(oVarArr), zArr);
            this.P = true;
            h.a aVar4 = this.K;
            aVar4.getClass();
            aVar4.b(this);
        }
    }

    public final void y(int i6) {
        o();
        e eVar = this.R;
        boolean[] zArr = eVar.f6946d;
        if (!zArr[i6]) {
            com.google.android.exoplayer2.n nVar = eVar.f6943a.f27307v[i6].f27303v[0];
            int g5 = c9.l.g(nVar.F);
            long j10 = this.f6915a0;
            j.a aVar = this.f6923y;
            aVar.b(new o8.e(1, g5, nVar, 0, null, aVar.a(j10), -9223372036854775807L));
            zArr[i6] = true;
        }
    }

    public final void z(int i6) {
        o();
        boolean[] zArr = this.R.f6944b;
        if (this.c0 && zArr[i6] && !this.M[i6].m(false)) {
            this.f6916b0 = 0L;
            this.c0 = false;
            this.X = true;
            this.f6915a0 = 0L;
            this.f6917d0 = 0;
            for (p pVar : this.M) {
                pVar.p(false);
            }
            h.a aVar = this.K;
            aVar.getClass();
            aVar.a(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final void h(long j10) {
    }
}
