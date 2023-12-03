package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.x;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import g8.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes.dex */
public final class m implements Handler.Callback, h.a, t.d, h.a, x.a {
    public final b9.b A;
    public final c9.i B;
    public final HandlerThread C;
    public final Looper D;
    public final e0.c E;
    public final e0.b F;
    public final long G;
    public final boolean H;
    public final h I;
    public final ArrayList<c> J;
    public final c9.b K;
    public final e L;
    public final s M;
    public final t N;
    public final p O;
    public final long P;
    public o7.x Q;
    public o7.s R;
    public d S;
    public boolean T;
    public boolean U = false;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6559a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6560b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f6561d0;
    public g e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f6562f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f6563g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f6564h0;

    /* renamed from: i0  reason: collision with root package name */
    public ExoPlaybackException f6565i0;

    /* renamed from: u  reason: collision with root package name */
    public final z[] f6566u;

    /* renamed from: v  reason: collision with root package name */
    public final Set<z> f6567v;

    /* renamed from: w  reason: collision with root package name */
    public final o7.u[] f6568w;

    /* renamed from: x  reason: collision with root package name */
    public final z8.k f6569x;

    /* renamed from: y  reason: collision with root package name */
    public final z8.l f6570y;

    /* renamed from: z  reason: collision with root package name */
    public final o7.n f6571z;

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<t.c> f6572a;

        /* renamed from: b  reason: collision with root package name */
        public final o8.l f6573b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6574c;

        /* renamed from: d  reason: collision with root package name */
        public final long f6575d;

        public a(ArrayList arrayList, o8.l lVar, int i6, long j10) {
            this.f6572a = arrayList;
            this.f6573b = lVar;
            this.f6574c = i6;
            this.f6575d = j10;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static class b {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {
        public c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6576a;

        /* renamed from: b  reason: collision with root package name */
        public o7.s f6577b;

        /* renamed from: c  reason: collision with root package name */
        public int f6578c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6579d;

        /* renamed from: e  reason: collision with root package name */
        public int f6580e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public int f6581g;

        public d(o7.s sVar) {
            this.f6577b = sVar;
        }

        public final void a(int i6) {
            boolean z10;
            boolean z11 = this.f6576a;
            if (i6 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6576a = z11 | z10;
            this.f6578c += i6;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final i.a f6582a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6583b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6584c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f6585d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6586e;
        public final boolean f;

        public f(i.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f6582a = aVar;
            this.f6583b = j10;
            this.f6584c = j11;
            this.f6585d = z10;
            this.f6586e = z11;
            this.f = z12;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final e0 f6587a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6588b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6589c;

        public g(e0 e0Var, int i6, long j10) {
            this.f6587a = e0Var;
            this.f6588b = i6;
            this.f6589c = j10;
        }
    }

    public m(z[] zVarArr, z8.k kVar, z8.l lVar, o7.n nVar, b9.b bVar, int i6, boolean z10, p7.n nVar2, o7.x xVar, com.google.android.exoplayer2.g gVar, long j10, Looper looper, c9.s sVar, o7.l lVar2) {
        this.L = lVar2;
        this.f6566u = zVarArr;
        this.f6569x = kVar;
        this.f6570y = lVar;
        this.f6571z = nVar;
        this.A = bVar;
        this.Y = i6;
        this.Z = z10;
        this.Q = xVar;
        this.O = gVar;
        this.P = j10;
        this.K = sVar;
        this.G = nVar.b();
        this.H = nVar.a();
        o7.s i10 = o7.s.i(lVar);
        this.R = i10;
        this.S = new d(i10);
        this.f6568w = new o7.u[zVarArr.length];
        for (int i11 = 0; i11 < zVarArr.length; i11++) {
            zVarArr[i11].setIndex(i11);
            this.f6568w[i11] = zVarArr[i11].i();
        }
        this.I = new h(this, sVar);
        this.J = new ArrayList<>();
        this.f6567v = Collections.newSetFromMap(new IdentityHashMap());
        this.E = new e0.c();
        this.F = new e0.b();
        kVar.f39349a = bVar;
        this.f6564h0 = true;
        Handler handler = new Handler(looper);
        this.M = new s(nVar2, handler);
        this.N = new t(this, nVar2, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.C = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.D = looper2;
        this.B = sVar.b(looper2, this);
    }

    public static Pair<Object, Long> H(e0 e0Var, g gVar, boolean z10, int i6, boolean z11, e0.c cVar, e0.b bVar) {
        e0 e0Var2;
        Pair<Object, Long> j10;
        Object I;
        e0 e0Var3 = gVar.f6587a;
        if (e0Var.q()) {
            return null;
        }
        if (e0Var3.q()) {
            e0Var2 = e0Var;
        } else {
            e0Var2 = e0Var3;
        }
        try {
            j10 = e0Var2.j(cVar, bVar, gVar.f6588b, gVar.f6589c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (e0Var.equals(e0Var2)) {
            return j10;
        }
        if (e0Var.c(j10.first) != -1) {
            if (e0Var2.h(j10.first, bVar).f6470z && e0Var2.n(bVar.f6467w, cVar).I == e0Var2.c(j10.first)) {
                return e0Var.j(cVar, bVar, e0Var.h(j10.first, bVar).f6467w, gVar.f6589c);
            }
            return j10;
        }
        if (z10 && (I = I(cVar, bVar, i6, z11, j10.first, e0Var2, e0Var)) != null) {
            return e0Var.j(cVar, bVar, e0Var.h(I, bVar).f6467w, -9223372036854775807L);
        }
        return null;
    }

    public static Object I(e0.c cVar, e0.b bVar, int i6, boolean z10, Object obj, e0 e0Var, e0 e0Var2) {
        int c10 = e0Var.c(obj);
        int i10 = e0Var.i();
        int i11 = c10;
        int i12 = -1;
        for (int i13 = 0; i13 < i10 && i12 == -1; i13++) {
            i11 = e0Var.e(i11, bVar, cVar, i6, z10);
            if (i11 == -1) {
                break;
            }
            i12 = e0Var2.c(e0Var.m(i11));
        }
        if (i12 == -1) {
            return null;
        }
        return e0Var2.m(i12);
    }

    public static void O(z zVar, long j10) {
        zVar.g();
        if (zVar instanceof p8.m) {
            p8.m mVar = (p8.m) zVar;
            sc.b.C(mVar.D);
            mVar.T = j10;
        }
    }

    public static void d(x xVar) {
        synchronized (xVar) {
        }
        try {
            xVar.f7207a.o(xVar.f7210d, xVar.f7211e);
        } finally {
            xVar.b(true);
        }
    }

    public static boolean s(z zVar) {
        if (zVar.getState() != 0) {
            return true;
        }
        return false;
    }

    public final void A() {
        D(true, false, true, false);
        this.f6571z.e();
        Y(1);
        this.C.quit();
        synchronized (this) {
            this.T = true;
            notifyAll();
        }
    }

    public final void B(int i6, int i10, o8.l lVar) {
        boolean z10 = true;
        this.S.a(1);
        t tVar = this.N;
        tVar.getClass();
        sc.b.q((i6 < 0 || i6 > i10 || i10 > tVar.f7025a.size()) ? false : false);
        tVar.f7032i = lVar;
        tVar.g(i6, i10);
        n(tVar.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        boolean z10;
        boolean z11;
        float f2 = this.I.c().f7195u;
        s sVar = this.M;
        o7.o oVar = sVar.f6789h;
        o7.o oVar2 = sVar.f6790i;
        boolean z12 = true;
        for (o7.o oVar3 = oVar; oVar3 != null && oVar3.f27214d; oVar3 = oVar3.f27221l) {
            z8.l g5 = oVar3.g(f2, this.R.f27235a);
            z8.l lVar = oVar3.f27223n;
            if (lVar != null) {
                int length = lVar.f39352c.length;
                z8.d[] dVarArr = g5.f39352c;
                if (length == dVarArr.length) {
                    for (int i6 = 0; i6 < dVarArr.length; i6++) {
                        if (g5.a(lVar, i6)) {
                        }
                    }
                    z10 = true;
                    if (z10) {
                        if (z12) {
                            s sVar2 = this.M;
                            o7.o oVar4 = sVar2.f6789h;
                            boolean k10 = sVar2.k(oVar4);
                            boolean[] zArr = new boolean[this.f6566u.length];
                            long a10 = oVar4.a(g5, this.R.f27251s, k10, zArr);
                            o7.s sVar3 = this.R;
                            if (sVar3.f27239e != 4 && a10 != sVar3.f27251s) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            o7.s sVar4 = this.R;
                            this.R = q(sVar4.f27236b, a10, sVar4.f27237c, sVar4.f27238d, z11, 5);
                            if (z11) {
                                F(a10);
                            }
                            boolean[] zArr2 = new boolean[this.f6566u.length];
                            int i10 = 0;
                            while (true) {
                                z[] zVarArr = this.f6566u;
                                if (i10 >= zVarArr.length) {
                                    break;
                                }
                                z zVar = zVarArr[i10];
                                boolean s10 = s(zVar);
                                zArr2[i10] = s10;
                                o8.k kVar = oVar4.f27213c[i10];
                                if (s10) {
                                    if (kVar != zVar.p()) {
                                        e(zVar);
                                    } else if (zArr[i10]) {
                                        zVar.s(this.f6562f0);
                                    }
                                }
                                i10++;
                            }
                            g(zArr2);
                        } else {
                            this.M.k(oVar3);
                            if (oVar3.f27214d) {
                                oVar3.a(g5, Math.max(oVar3.f.f27226b, this.f6562f0 - oVar3.f27224o), false, new boolean[oVar3.f27218i.length]);
                            }
                        }
                        m(true);
                        if (this.R.f27239e != 4) {
                            u();
                            g0();
                            this.B.j(2);
                            return;
                        }
                        return;
                    }
                    if (oVar3 == oVar2) {
                        z12 = false;
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z10, boolean z11, boolean z12, boolean z13) {
        long j10;
        i.a aVar;
        long j11;
        long j12;
        o8.p pVar;
        z8.l lVar;
        List list;
        boolean z14;
        z[] zVarArr;
        this.B.e();
        ExoPlaybackException exoPlaybackException = null;
        this.f6565i0 = null;
        this.W = false;
        h hVar = this.I;
        hVar.f6512z = false;
        c9.r rVar = hVar.f6507u;
        if (rVar.f5190v) {
            rVar.a(rVar.j());
            rVar.f5190v = false;
        }
        this.f6562f0 = 1000000000000L;
        for (z zVar : this.f6566u) {
            try {
                e(zVar);
            } catch (ExoPlaybackException | RuntimeException e10) {
                ca.a.Q("ExoPlayerImplInternal", "Disable failed.", e10);
            }
        }
        if (z10) {
            for (z zVar2 : this.f6566u) {
                if (this.f6567v.remove(zVar2)) {
                    try {
                        zVar2.reset();
                    } catch (RuntimeException e11) {
                        ca.a.Q("ExoPlayerImplInternal", "Reset failed.", e11);
                    }
                }
            }
        }
        this.f6561d0 = 0;
        o7.s sVar = this.R;
        i.a aVar2 = sVar.f27236b;
        long j13 = sVar.f27251s;
        boolean z15 = true;
        if (!this.R.f27236b.a()) {
            o7.s sVar2 = this.R;
            e0.b bVar = this.F;
            i.a aVar3 = sVar2.f27236b;
            e0 e0Var = sVar2.f27235a;
            if (!e0Var.q() && !e0Var.h(aVar3.f27272a, bVar).f6470z) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (!z14) {
                j10 = this.R.f27251s;
                if (z11) {
                    this.e0 = null;
                    Pair<i.a, Long> j14 = j(this.R.f27235a);
                    aVar2 = (i.a) j14.first;
                    j13 = ((Long) j14.second).longValue();
                    j10 = -9223372036854775807L;
                    if (!aVar2.equals(this.R.f27236b)) {
                        aVar = aVar2;
                        j11 = j13;
                        j12 = -9223372036854775807L;
                        this.M.b();
                        this.X = false;
                        o7.s sVar3 = this.R;
                        e0 e0Var2 = sVar3.f27235a;
                        int i6 = sVar3.f27239e;
                        if (!z13) {
                            exoPlaybackException = sVar3.f;
                        }
                        ExoPlaybackException exoPlaybackException2 = exoPlaybackException;
                        if (z15) {
                            pVar = o8.p.f27305x;
                        } else {
                            pVar = sVar3.f27241h;
                        }
                        o8.p pVar2 = pVar;
                        if (z15) {
                            lVar = this.f6570y;
                        } else {
                            lVar = sVar3.f27242i;
                        }
                        z8.l lVar2 = lVar;
                        if (z15) {
                            s.b bVar2 = com.google.common.collect.s.f9446v;
                            list = l0.f9412y;
                        } else {
                            list = sVar3.f27243j;
                        }
                        this.R = new o7.s(e0Var2, aVar, j12, j11, i6, exoPlaybackException2, false, pVar2, lVar2, list, aVar, sVar3.f27245l, sVar3.f27246m, sVar3.f27247n, j11, 0L, j11, this.c0, false);
                        if (z12) {
                            t tVar = this.N;
                            HashMap<t.c, t.b> hashMap = tVar.f7030g;
                            for (t.b bVar3 : hashMap.values()) {
                                try {
                                    bVar3.f7039a.b(bVar3.f7040b);
                                } catch (RuntimeException e12) {
                                    ca.a.Q("MediaSourceList", "Failed to release child source.", e12);
                                }
                                com.google.android.exoplayer2.source.i iVar = bVar3.f7039a;
                                t.a aVar4 = bVar3.f7041c;
                                iVar.e(aVar4);
                                bVar3.f7039a.i(aVar4);
                            }
                            hashMap.clear();
                            tVar.f7031h.clear();
                            tVar.f7033j = false;
                            return;
                        }
                        return;
                    }
                }
                aVar = aVar2;
                j11 = j13;
                j12 = j10;
                z15 = false;
                this.M.b();
                this.X = false;
                o7.s sVar32 = this.R;
                e0 e0Var22 = sVar32.f27235a;
                int i62 = sVar32.f27239e;
                if (!z13) {
                }
                ExoPlaybackException exoPlaybackException22 = exoPlaybackException;
                if (z15) {
                }
                o8.p pVar22 = pVar;
                if (z15) {
                }
                z8.l lVar22 = lVar;
                if (z15) {
                }
                this.R = new o7.s(e0Var22, aVar, j12, j11, i62, exoPlaybackException22, false, pVar22, lVar22, list, aVar, sVar32.f27245l, sVar32.f27246m, sVar32.f27247n, j11, 0L, j11, this.c0, false);
                if (z12) {
                }
            }
        }
        j10 = this.R.f27237c;
        if (z11) {
        }
        aVar = aVar2;
        j11 = j13;
        j12 = j10;
        z15 = false;
        this.M.b();
        this.X = false;
        o7.s sVar322 = this.R;
        e0 e0Var222 = sVar322.f27235a;
        int i622 = sVar322.f27239e;
        if (!z13) {
        }
        ExoPlaybackException exoPlaybackException222 = exoPlaybackException;
        if (z15) {
        }
        o8.p pVar222 = pVar;
        if (z15) {
        }
        z8.l lVar222 = lVar;
        if (z15) {
        }
        this.R = new o7.s(e0Var222, aVar, j12, j11, i622, exoPlaybackException222, false, pVar222, lVar222, list, aVar, sVar322.f27245l, sVar322.f27246m, sVar322.f27247n, j11, 0L, j11, this.c0, false);
        if (z12) {
        }
    }

    public final void E() {
        boolean z10;
        o7.o oVar = this.M.f6789h;
        if (oVar != null && oVar.f.f27231h && this.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
    }

    public final void F(long j10) {
        s sVar;
        long j11;
        z[] zVarArr;
        z8.d[] dVarArr;
        o7.o oVar = this.M.f6789h;
        if (oVar == null) {
            j11 = 1000000000000L;
        } else {
            j11 = oVar.f27224o;
        }
        long j12 = j10 + j11;
        this.f6562f0 = j12;
        this.I.f6507u.a(j12);
        for (z zVar : this.f6566u) {
            if (s(zVar)) {
                zVar.s(this.f6562f0);
            }
        }
        for (o7.o oVar2 = sVar.f6789h; oVar2 != null; oVar2 = oVar2.f27221l) {
            for (z8.d dVar : oVar2.f27223n.f39352c) {
                if (dVar != null) {
                    dVar.j();
                }
            }
        }
    }

    public final void G(e0 e0Var, e0 e0Var2) {
        if (e0Var.q() && e0Var2.q()) {
            return;
        }
        ArrayList<c> arrayList = this.J;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void J(boolean z10) {
        i.a aVar = this.M.f6789h.f.f27225a;
        long L = L(aVar, this.R.f27251s, true, false);
        if (L != this.R.f27251s) {
            o7.s sVar = this.R;
            this.R = q(aVar, L, sVar.f27237c, sVar.f27238d, z10, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[Catch: all -> 0x0144, TryCatch #0 {all -> 0x0144, blocks: (B:22:0x009d, B:24:0x00a7, B:27:0x00ad, B:29:0x00b3, B:30:0x00b6, B:32:0x00bb, B:34:0x00c5, B:36:0x00cb, B:40:0x00d3, B:42:0x00dd, B:44:0x00ed, B:48:0x00f7, B:53:0x010b, B:57:0x0114, B:61:0x011f), top: B:75:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(g gVar) {
        long longValue;
        long j10;
        boolean z10;
        boolean z11;
        i.a aVar;
        long j11;
        long j12;
        boolean z12;
        long j13;
        long j14;
        boolean z13;
        boolean z14;
        long L;
        boolean z15;
        long j15;
        long j16;
        o7.s sVar;
        int i6;
        boolean z16 = true;
        this.S.a(1);
        Pair<Object, Long> H = H(this.R.f27235a, gVar, true, this.Y, this.Z, this.E, this.F);
        long j17 = -9223372036854775807L;
        try {
            if (H == null) {
                Pair<i.a, Long> j18 = j(this.R.f27235a);
                aVar = (i.a) j18.first;
                longValue = ((Long) j18.second).longValue();
                z11 = !this.R.f27235a.q();
            } else {
                Object obj = H.first;
                longValue = ((Long) H.second).longValue();
                if (gVar.f6589c == -9223372036854775807L) {
                    j10 = -9223372036854775807L;
                } else {
                    j10 = longValue;
                }
                i.a l2 = this.M.l(this.R.f27235a, obj, longValue);
                if (l2.a()) {
                    this.R.f27235a.h(l2.f27272a, this.F);
                    if (this.F.d(l2.f27273b) == l2.f27274c) {
                        j11 = this.F.A.f6826w;
                    } else {
                        j11 = 0;
                    }
                    longValue = j11;
                    j12 = j10;
                    z12 = true;
                    aVar = l2;
                    if (!this.R.f27235a.q()) {
                        this.e0 = gVar;
                    } else if (H == null) {
                        if (this.R.f27239e != 1) {
                            Y(4);
                        }
                        D(false, true, false, true);
                    } else {
                        try {
                            if (aVar.equals(this.R.f27236b)) {
                                o7.o oVar = this.M.f6789h;
                                if (oVar != null && oVar.f27214d && longValue != 0) {
                                    j16 = oVar.f27211a.w(longValue, this.Q);
                                } else {
                                    j16 = longValue;
                                }
                                if (c9.w.E(j16) == c9.w.E(this.R.f27251s) && ((i6 = (sVar = this.R).f27239e) == 2 || i6 == 3)) {
                                    j15 = sVar.f27251s;
                                    this.R = q(aVar, j15, j12, j15, z12, 2);
                                    return;
                                }
                                j14 = j16;
                            } else {
                                j14 = longValue;
                            }
                            o7.s sVar2 = this.R;
                            e0 e0Var = sVar2.f27235a;
                            f0(e0Var, aVar, e0Var, sVar2.f27236b, j12);
                            z12 = z15;
                            j15 = L;
                            this.R = q(aVar, j15, j12, j15, z12, 2);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            z12 = z15;
                            j13 = L;
                            this.R = q(aVar, j13, j12, j13, z12, 2);
                            throw th;
                        }
                        if (this.R.f27239e == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        s sVar3 = this.M;
                        if (sVar3.f6789h != sVar3.f6790i) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        L = L(aVar, j14, z14, z13);
                        if (longValue == L) {
                            z16 = false;
                        }
                        z15 = z16 | z12;
                    }
                    j15 = longValue;
                    this.R = q(aVar, j15, j12, j15, z12, 2);
                    return;
                }
                if (gVar.f6589c == -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z10;
                j17 = j10;
                aVar = l2;
            }
            if (!this.R.f27235a.q()) {
            }
            j15 = longValue;
            this.R = q(aVar, j15, j12, j15, z12, 2);
            return;
        } catch (Throwable th3) {
            th = th3;
            j13 = longValue;
        }
        j12 = j17;
        z12 = z11;
    }

    public final long L(i.a aVar, long j10, boolean z10, boolean z11) {
        d0();
        this.W = false;
        if (z11 || this.R.f27239e == 3) {
            Y(2);
        }
        s sVar = this.M;
        o7.o oVar = sVar.f6789h;
        o7.o oVar2 = oVar;
        while (oVar2 != null && !aVar.equals(oVar2.f.f27225a)) {
            oVar2 = oVar2.f27221l;
        }
        if (z10 || oVar != oVar2 || (oVar2 != null && oVar2.f27224o + j10 < 0)) {
            z[] zVarArr = this.f6566u;
            for (z zVar : zVarArr) {
                e(zVar);
            }
            if (oVar2 != null) {
                while (sVar.f6789h != oVar2) {
                    sVar.a();
                }
                sVar.k(oVar2);
                oVar2.f27224o = 1000000000000L;
                g(new boolean[zVarArr.length]);
            }
        }
        if (oVar2 != null) {
            sVar.k(oVar2);
            if (!oVar2.f27214d) {
                oVar2.f = oVar2.f.b(j10);
            } else if (oVar2.f27215e) {
                com.google.android.exoplayer2.source.h hVar = oVar2.f27211a;
                j10 = hVar.m(j10);
                hVar.r(this.H, j10 - this.G);
            }
            F(j10);
            u();
        } else {
            sVar.b();
            F(j10);
        }
        m(false);
        this.B.j(2);
        return j10;
    }

    public final void M(x xVar) {
        Looper looper = xVar.f;
        Looper looper2 = this.D;
        c9.i iVar = this.B;
        if (looper == looper2) {
            d(xVar);
            int i6 = this.R.f27239e;
            if (i6 == 3 || i6 == 2) {
                iVar.j(2);
                return;
            }
            return;
        }
        iVar.k(15, xVar).a();
    }

    public final void N(x xVar) {
        Looper looper = xVar.f;
        if (!looper.getThread().isAlive()) {
            Log.w("TAG", "Trying to send message on a dead thread.");
            xVar.b(false);
            return;
        }
        this.K.b(looper, null).f(new g.v(this, 29, xVar));
    }

    public final void P(boolean z10, AtomicBoolean atomicBoolean) {
        z[] zVarArr;
        if (this.f6559a0 != z10) {
            this.f6559a0 = z10;
            if (!z10) {
                for (z zVar : this.f6566u) {
                    if (!s(zVar) && this.f6567v.remove(zVar)) {
                        zVar.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(a aVar) {
        this.S.a(1);
        int i6 = aVar.f6574c;
        o8.l lVar = aVar.f6573b;
        List<t.c> list = aVar.f6572a;
        if (i6 != -1) {
            this.e0 = new g(new o7.t(list, lVar), aVar.f6574c, aVar.f6575d);
        }
        t tVar = this.N;
        ArrayList arrayList = tVar.f7025a;
        tVar.g(0, arrayList.size());
        n(tVar.a(arrayList.size(), list, lVar), false);
    }

    public final void R(boolean z10) {
        if (z10 == this.c0) {
            return;
        }
        this.c0 = z10;
        o7.s sVar = this.R;
        int i6 = sVar.f27239e;
        if (!z10 && i6 != 4 && i6 != 1) {
            this.B.j(2);
        } else {
            this.R = sVar.c(z10);
        }
    }

    public final void S(boolean z10) {
        this.U = z10;
        E();
        if (this.V) {
            s sVar = this.M;
            if (sVar.f6790i != sVar.f6789h) {
                J(true);
                m(false);
            }
        }
    }

    public final void T(int i6, int i10, boolean z10, boolean z11) {
        z8.d[] dVarArr;
        this.S.a(z11 ? 1 : 0);
        d dVar = this.S;
        dVar.f6576a = true;
        dVar.f = true;
        dVar.f6581g = i10;
        this.R = this.R.d(i6, z10);
        this.W = false;
        for (o7.o oVar = this.M.f6789h; oVar != null; oVar = oVar.f27221l) {
            for (z8.d dVar2 : oVar.f27223n.f39352c) {
                if (dVar2 != null) {
                    dVar2.a();
                }
            }
        }
        if (!Z()) {
            d0();
            g0();
            return;
        }
        int i11 = this.R.f27239e;
        c9.i iVar = this.B;
        if (i11 == 3) {
            b0();
            iVar.j(2);
        } else if (i11 == 2) {
            iVar.j(2);
        }
    }

    public final void U(v vVar) {
        h hVar = this.I;
        hVar.d(vVar);
        v c10 = hVar.c();
        p(c10, c10.f7195u, true, true);
    }

    public final void V(int i6) {
        this.Y = i6;
        e0 e0Var = this.R.f27235a;
        s sVar = this.M;
        sVar.f = i6;
        if (!sVar.n(e0Var)) {
            J(true);
        }
        m(false);
    }

    public final void W(boolean z10) {
        this.Z = z10;
        e0 e0Var = this.R.f27235a;
        s sVar = this.M;
        sVar.f6788g = z10;
        if (!sVar.n(e0Var)) {
            J(true);
        }
        m(false);
    }

    public final void X(o8.l lVar) {
        this.S.a(1);
        t tVar = this.N;
        int size = tVar.f7025a.size();
        if (lVar.getLength() != size) {
            lVar = lVar.g().e(0, size);
        }
        tVar.f7032i = lVar;
        n(tVar.b(), false);
    }

    public final void Y(int i6) {
        o7.s sVar = this.R;
        if (sVar.f27239e != i6) {
            this.R = sVar.g(i6);
        }
    }

    public final boolean Z() {
        o7.s sVar = this.R;
        if (sVar.f27245l && sVar.f27246m == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.q.a
    public final void a(com.google.android.exoplayer2.source.h hVar) {
        this.B.k(9, hVar).a();
    }

    public final boolean a0(e0 e0Var, i.a aVar) {
        if (aVar.a() || e0Var.q()) {
            return false;
        }
        int i6 = e0Var.h(aVar.f27272a, this.F).f6467w;
        e0.c cVar = this.E;
        e0Var.n(i6, cVar);
        if (!cVar.b() || !cVar.C || cVar.f6476z == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public final void b(com.google.android.exoplayer2.source.h hVar) {
        this.B.k(8, hVar).a();
    }

    public final void b0() {
        z[] zVarArr;
        this.W = false;
        h hVar = this.I;
        hVar.f6512z = true;
        c9.r rVar = hVar.f6507u;
        if (!rVar.f5190v) {
            rVar.f5192x = rVar.f5189u.d();
            rVar.f5190v = true;
        }
        for (z zVar : this.f6566u) {
            if (s(zVar)) {
                zVar.start();
            }
        }
    }

    public final void c(a aVar, int i6) {
        this.S.a(1);
        t tVar = this.N;
        if (i6 == -1) {
            i6 = tVar.f7025a.size();
        }
        n(tVar.a(i6, aVar.f6572a, aVar.f6573b), false);
    }

    public final void c0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.f6559a0) {
            z12 = false;
        } else {
            z12 = true;
        }
        D(z12, false, true, false);
        this.S.a(z11 ? 1 : 0);
        this.f6571z.i();
        Y(1);
    }

    public final void d0() {
        z[] zVarArr;
        h hVar = this.I;
        hVar.f6512z = false;
        c9.r rVar = hVar.f6507u;
        if (rVar.f5190v) {
            rVar.a(rVar.j());
            rVar.f5190v = false;
        }
        for (z zVar : this.f6566u) {
            if (s(zVar) && zVar.getState() == 2) {
                zVar.stop();
            }
        }
    }

    public final void e(z zVar) {
        boolean z10;
        if (zVar.getState() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        h hVar = this.I;
        if (zVar == hVar.f6509w) {
            hVar.f6510x = null;
            hVar.f6509w = null;
            hVar.f6511y = true;
        }
        if (zVar.getState() == 2) {
            zVar.stop();
        }
        zVar.e();
        this.f6561d0--;
    }

    public final void e0() {
        boolean z10;
        o7.o oVar = this.M.f6791j;
        if (!this.X && (oVar == null || !oVar.f27211a.f())) {
            z10 = false;
        } else {
            z10 = true;
        }
        o7.s sVar = this.R;
        if (z10 != sVar.f27240g) {
            this.R = new o7.s(sVar.f27235a, sVar.f27236b, sVar.f27237c, sVar.f27238d, sVar.f27239e, sVar.f, z10, sVar.f27241h, sVar.f27242i, sVar.f27243j, sVar.f27244k, sVar.f27245l, sVar.f27246m, sVar.f27247n, sVar.f27250q, sVar.r, sVar.f27251s, sVar.f27248o, sVar.f27249p);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r0.f6792k < 100) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x04ea, code lost:
        if (r1.f(r24, r57.I.c().f7195u, r57.W, r28) != false) goto L394;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x02e3 A[EDGE_INSN: B:417:0x02e3->B:194:0x02e3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x035d A[EDGE_INSN: B:424:0x035d->B:219:0x035d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12;
        o7.s sVar;
        z8.d[] dVarArr;
        boolean z13;
        long j11;
        boolean z14;
        boolean z15;
        boolean z16;
        long max;
        boolean z17;
        o7.s sVar2;
        int i6;
        boolean z18;
        o7.s sVar3;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        o7.o oVar;
        long j12;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        o7.o oVar2;
        boolean z29;
        boolean Z;
        s sVar4;
        boolean z30;
        o7.o oVar3;
        o7.o oVar4;
        int i10;
        boolean z31;
        z[] zVarArr;
        boolean z32;
        int i11;
        o7.p c10;
        long j13;
        boolean z33;
        boolean z34;
        long a10 = this.K.a();
        if (!this.R.f27235a.q() && this.N.f7033j) {
            s sVar5 = this.M;
            long j14 = this.f6562f0;
            o7.o oVar5 = sVar5.f6791j;
            if (oVar5 != null) {
                if (oVar5.f27221l == null) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                sc.b.C(z34);
                if (oVar5.f27214d) {
                    oVar5.f27211a.h(j14 - oVar5.f27224o);
                }
            }
            s sVar6 = this.M;
            o7.o oVar6 = sVar6.f6791j;
            if (oVar6 != null) {
                if (!oVar6.f.f27232i) {
                    if (oVar6.f27214d && (!oVar6.f27215e || oVar6.f27211a.g() == Long.MIN_VALUE)) {
                        z33 = true;
                    } else {
                        z33 = false;
                    }
                    if (z33) {
                        if (sVar6.f6791j.f.f27229e != -9223372036854775807L) {
                        }
                    }
                }
                z24 = false;
                if (z24) {
                    s sVar7 = this.M;
                    long j15 = this.f6562f0;
                    o7.s sVar8 = this.R;
                    o7.o oVar7 = sVar7.f6791j;
                    if (oVar7 == null) {
                        c10 = sVar7.d(sVar8.f27235a, sVar8.f27236b, sVar8.f27237c, sVar8.f27251s);
                    } else {
                        c10 = sVar7.c(sVar8.f27235a, oVar7, j15);
                    }
                    if (c10 != null) {
                        s sVar9 = this.M;
                        o7.u[] uVarArr = this.f6568w;
                        z8.k kVar = this.f6569x;
                        b9.i h10 = this.f6571z.h();
                        t tVar = this.N;
                        z8.l lVar = this.f6570y;
                        o7.o oVar8 = sVar9.f6791j;
                        if (oVar8 == null) {
                            j13 = 1000000000000L;
                        } else {
                            j13 = (oVar8.f27224o + oVar8.f.f27229e) - c10.f27226b;
                        }
                        o7.o oVar9 = new o7.o(uVarArr, j13, kVar, h10, tVar, c10, lVar);
                        o7.o oVar10 = sVar9.f6791j;
                        if (oVar10 != null) {
                            if (oVar9 != oVar10.f27221l) {
                                oVar10.b();
                                oVar10.f27221l = oVar9;
                                oVar10.c();
                            }
                        } else {
                            sVar9.f6789h = oVar9;
                            sVar9.f6790i = oVar9;
                        }
                        sVar9.f6793l = null;
                        sVar9.f6791j = oVar9;
                        sVar9.f6792k++;
                        sVar9.j();
                        oVar9.f27211a.t(this, c10.f27226b);
                        if (this.M.f6789h == oVar9) {
                            F(c10.f27226b);
                        }
                        m(false);
                    }
                }
                if (!this.X) {
                    this.X = r();
                    e0();
                } else {
                    u();
                }
                s sVar10 = this.M;
                oVar = sVar10.f6790i;
                if (oVar != null) {
                    o7.o oVar11 = oVar.f27221l;
                    z[] zVarArr2 = this.f6566u;
                    if (oVar11 != null && !this.V) {
                        if (oVar.f27214d) {
                            for (int i12 = 0; i12 < zVarArr2.length; i12++) {
                                z zVar = zVarArr2[i12];
                                o8.k kVar2 = oVar.f27213c[i12];
                                if (zVar.p() == kVar2) {
                                    if (kVar2 != null && !zVar.f()) {
                                        o7.o oVar12 = oVar.f27221l;
                                        if (oVar.f.f && oVar12.f27214d && ((zVar instanceof p8.m) || zVar.r() >= oVar12.e())) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        if (!z28) {
                                        }
                                    }
                                }
                            }
                            z25 = true;
                            if (z25) {
                                o7.o oVar13 = oVar.f27221l;
                                if (oVar13.f27214d || this.f6562f0 >= oVar13.e()) {
                                    z8.l lVar2 = oVar.f27223n;
                                    o7.o oVar14 = sVar10.f6790i;
                                    if (oVar14 != null && oVar14.f27221l != null) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    sc.b.C(z26);
                                    sVar10.f6790i = sVar10.f6790i.f27221l;
                                    sVar10.j();
                                    o7.o oVar15 = sVar10.f6790i;
                                    z8.l lVar3 = oVar15.f27223n;
                                    if (oVar15.f27214d && oVar15.f27211a.s() != -9223372036854775807L) {
                                        long e10 = oVar15.e();
                                        for (z zVar2 : zVarArr2) {
                                            if (zVar2.p() != null) {
                                                O(zVar2, e10);
                                            }
                                        }
                                    } else {
                                        for (int i13 = 0; i13 < zVarArr2.length; i13++) {
                                            boolean b10 = lVar2.b(i13);
                                            boolean b11 = lVar3.b(i13);
                                            if (b10 && !zVarArr2[i13].t()) {
                                                if (((com.google.android.exoplayer2.e) this.f6568w[i13]).f6458u == -2) {
                                                    z27 = true;
                                                } else {
                                                    z27 = false;
                                                }
                                                o7.v vVar = lVar2.f39351b[i13];
                                                o7.v vVar2 = lVar3.f39351b[i13];
                                                if (!b11 || !vVar2.equals(vVar) || z27) {
                                                    O(zVarArr2[i13], oVar15.e());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z25 = false;
                        if (z25) {
                        }
                    } else if (oVar.f.f27232i || this.V) {
                        for (int i14 = 0; i14 < zVarArr2.length; i14++) {
                            z zVar3 = zVarArr2[i14];
                            o8.k kVar3 = oVar.f27213c[i14];
                            if (kVar3 != null && zVar3.p() == kVar3 && zVar3.f()) {
                                long j16 = oVar.f.f27229e;
                                if (j16 != -9223372036854775807L && j16 != Long.MIN_VALUE) {
                                    j12 = j16 + oVar.f27224o;
                                } else {
                                    j12 = -9223372036854775807L;
                                }
                                O(zVar3, j12);
                            }
                        }
                    }
                }
                s sVar11 = this.M;
                oVar2 = sVar11.f6790i;
                if (oVar2 != null && sVar11.f6789h != oVar2 && !oVar2.f27216g) {
                    z8.l lVar4 = oVar2.f27223n;
                    i10 = 0;
                    z31 = false;
                    while (true) {
                        zVarArr = this.f6566u;
                        if (i10 < zVarArr.length) {
                            break;
                        }
                        z zVar4 = zVarArr[i10];
                        if (s(zVar4)) {
                            o8.k p10 = zVar4.p();
                            o8.k[] kVarArr = oVar2.f27213c;
                            if (p10 != kVarArr[i10]) {
                                z32 = true;
                            } else {
                                z32 = false;
                            }
                            if (!lVar4.b(i10) || z32) {
                                if (!zVar4.t()) {
                                    z8.d dVar = lVar4.f39352c[i10];
                                    if (dVar != null) {
                                        i11 = dVar.length();
                                    } else {
                                        i11 = 0;
                                    }
                                    n[] nVarArr = new n[i11];
                                    for (int i15 = 0; i15 < i11; i15++) {
                                        nVarArr[i15] = dVar.f(i15);
                                    }
                                    zVar4.l(nVarArr, kVarArr[i10], oVar2.e(), oVar2.f27224o);
                                } else if (zVar4.b()) {
                                    e(zVar4);
                                } else {
                                    z31 = true;
                                }
                            }
                        }
                        i10++;
                    }
                    if (!z31) {
                        g(new boolean[zVarArr.length]);
                    }
                }
                z29 = false;
                while (true) {
                    Z = Z();
                    sVar4 = this.M;
                    if (Z && !this.V && (oVar3 = sVar4.f6789h) != null && (oVar4 = oVar3.f27221l) != null && this.f6562f0 >= oVar4.e() && oVar4.f27216g) {
                        z30 = true;
                    } else {
                        z30 = false;
                    }
                    if (!z30) {
                        break;
                    }
                    if (z29) {
                        v();
                    }
                    o7.o oVar16 = sVar4.f6789h;
                    o7.o a11 = sVar4.a();
                    o7.p pVar = a11.f;
                    i.a aVar = pVar.f27225a;
                    long j17 = pVar.f27226b;
                    o7.s q10 = q(aVar, j17, pVar.f27227c, j17, true, 0);
                    this.R = q10;
                    e0 e0Var = q10.f27235a;
                    f0(e0Var, a11.f.f27225a, e0Var, oVar16.f.f27225a, -9223372036854775807L);
                    E();
                    g0();
                    z29 = true;
                }
            }
            z24 = true;
            if (z24) {
            }
            if (!this.X) {
            }
            s sVar102 = this.M;
            oVar = sVar102.f6790i;
            if (oVar != null) {
            }
            s sVar112 = this.M;
            oVar2 = sVar112.f6790i;
            if (oVar2 != null) {
                z8.l lVar42 = oVar2.f27223n;
                i10 = 0;
                z31 = false;
                while (true) {
                    zVarArr = this.f6566u;
                    if (i10 < zVarArr.length) {
                    }
                    i10++;
                }
                if (!z31) {
                }
            }
            z29 = false;
            while (true) {
                Z = Z();
                sVar4 = this.M;
                if (Z) {
                    z30 = true;
                    if (!z30) {
                    }
                }
                z30 = false;
                if (!z30) {
                }
                o7.o oVar162 = sVar4.f6789h;
                o7.o a112 = sVar4.a();
                o7.p pVar2 = a112.f;
                i.a aVar2 = pVar2.f27225a;
                long j172 = pVar2.f27226b;
                o7.s q102 = q(aVar2, j172, pVar2.f27227c, j172, true, 0);
                this.R = q102;
                e0 e0Var2 = q102.f27235a;
                f0(e0Var2, a112.f.f27225a, e0Var2, oVar162.f.f27225a, -9223372036854775807L);
                E();
                g0();
                z29 = true;
            }
        }
        int i16 = this.R.f27239e;
        if (i16 != 1 && i16 != 4) {
            o7.o oVar17 = this.M.f6789h;
            if (oVar17 == null) {
                c9.i iVar = this.B;
                iVar.e();
                iVar.i(a10 + 10);
                return;
            }
            kc.f.j("doSomeWork");
            g0();
            if (oVar17.f27214d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                oVar17.f27211a.r(this.H, this.R.f27251s - this.G);
                boolean z35 = true;
                z10 = true;
                int i17 = 0;
                while (true) {
                    z[] zVarArr3 = this.f6566u;
                    if (i17 >= zVarArr3.length) {
                        break;
                    }
                    z zVar5 = zVarArr3[i17];
                    if (s(zVar5)) {
                        zVar5.n(this.f6562f0, elapsedRealtime);
                        if (z35 && zVar5.b()) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        if (oVar17.f27213c[i17] != zVar5.p()) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (!z21 && zVar5.f()) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (!z21 && !z22 && !zVar5.isReady() && !zVar5.b()) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        if (z10 && z23) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z23) {
                            zVar5.q();
                        }
                    }
                    i17++;
                }
                z11 = z35;
            } else {
                oVar17.f27211a.l();
                z10 = true;
                z11 = true;
            }
            long j18 = oVar17.f.f27229e;
            if (z11 && oVar17.f27214d) {
                j10 = -9223372036854775807L;
                if (j18 == -9223372036854775807L || j18 <= this.R.f27251s) {
                    z12 = true;
                    if (!z12 && this.V) {
                        this.V = false;
                        T(this.R.f27246m, 5, false, false);
                    }
                    if (!z12 && oVar17.f.f27232i) {
                        Y(4);
                        d0();
                    } else {
                        sVar = this.R;
                        if (sVar.f27239e == 2) {
                            if (this.f6561d0 == 0) {
                                z13 = t();
                            } else {
                                if (z10) {
                                    if (sVar.f27240g) {
                                        e0 e0Var3 = sVar.f27235a;
                                        s sVar12 = this.M;
                                        if (a0(e0Var3, sVar12.f6789h.f.f27225a)) {
                                            j11 = ((com.google.android.exoplayer2.g) this.O).f6500i;
                                        } else {
                                            j11 = j10;
                                        }
                                        o7.o oVar18 = sVar12.f6791j;
                                        if (oVar18.f27214d && (!oVar18.f27215e || oVar18.f27211a.g() == Long.MIN_VALUE)) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14 && oVar18.f.f27232i) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (oVar18.f.f27225a.a() && !oVar18.f27214d) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (!z15 && !z16) {
                                            o7.n nVar = this.f6571z;
                                            long j19 = this.R.f27250q;
                                            o7.o oVar19 = this.M.f6791j;
                                            if (oVar19 == null) {
                                                max = 0;
                                            } else {
                                                max = Math.max(0L, j19 - (this.f6562f0 - oVar19.f27224o));
                                            }
                                        }
                                    }
                                    z13 = true;
                                }
                                z13 = false;
                            }
                            if (z13) {
                                Y(3);
                                this.f6565i0 = null;
                                if (Z()) {
                                    b0();
                                }
                            }
                        }
                        if (this.R.f27239e == 3 && (this.f6561d0 != 0 ? !z10 : !t())) {
                            this.W = Z();
                            Y(2);
                            if (this.W) {
                                for (o7.o oVar20 = this.M.f6789h; oVar20 != null; oVar20 = oVar20.f27221l) {
                                    for (z8.d dVar2 : oVar20.f27223n.f39352c) {
                                        if (dVar2 != null) {
                                            dVar2.k();
                                        }
                                    }
                                }
                                com.google.android.exoplayer2.g gVar = (com.google.android.exoplayer2.g) this.O;
                                long j20 = gVar.f6500i;
                                if (j20 != -9223372036854775807L) {
                                    long j21 = j20 + gVar.f6494b;
                                    gVar.f6500i = j21;
                                    long j22 = gVar.f6499h;
                                    if (j22 != -9223372036854775807L && j21 > j22) {
                                        gVar.f6500i = j22;
                                    }
                                    gVar.f6504m = -9223372036854775807L;
                                }
                            }
                            d0();
                        }
                    }
                    if (this.R.f27239e == 2) {
                        int i18 = 0;
                        while (true) {
                            z[] zVarArr4 = this.f6566u;
                            if (i18 >= zVarArr4.length) {
                                break;
                            }
                            if (s(zVarArr4[i18]) && this.f6566u[i18].p() == oVar17.f27213c[i18]) {
                                this.f6566u[i18].q();
                            }
                            i18++;
                        }
                        o7.s sVar13 = this.R;
                        if (!sVar13.f27240g && sVar13.r < 500000 && r()) {
                            throw new IllegalStateException("Playback stuck buffering and not loading");
                        }
                    }
                    z17 = this.c0;
                    sVar2 = this.R;
                    if (z17 != sVar2.f27248o) {
                        this.R = sVar2.c(z17);
                    }
                    if ((!Z() && this.R.f27239e == 3) || (i6 = this.R.f27239e) == 2) {
                        if (this.c0 && this.f6560b0) {
                            z19 = true;
                            z20 = false;
                        } else {
                            c9.i iVar2 = this.B;
                            iVar2.e();
                            iVar2.i(a10 + 10);
                            z19 = true;
                            z20 = true;
                        }
                        z18 = z20 ^ z19;
                    } else {
                        if (this.f6561d0 == 0 && i6 != 4) {
                            c9.i iVar3 = this.B;
                            iVar3.e();
                            iVar3.i(a10 + 1000);
                        } else {
                            this.B.e();
                        }
                        z18 = false;
                    }
                    sVar3 = this.R;
                    if (sVar3.f27249p != z18) {
                        this.R = new o7.s(sVar3.f27235a, sVar3.f27236b, sVar3.f27237c, sVar3.f27238d, sVar3.f27239e, sVar3.f, sVar3.f27240g, sVar3.f27241h, sVar3.f27242i, sVar3.f27243j, sVar3.f27244k, sVar3.f27245l, sVar3.f27246m, sVar3.f27247n, sVar3.f27250q, sVar3.r, sVar3.f27251s, sVar3.f27248o, z18);
                    }
                    this.f6560b0 = false;
                    kc.f.B();
                    return;
                }
            } else {
                j10 = -9223372036854775807L;
            }
            z12 = false;
            if (!z12) {
            }
            if (!z12) {
            }
            sVar = this.R;
            if (sVar.f27239e == 2) {
            }
            if (this.R.f27239e == 3) {
                this.W = Z();
                Y(2);
                if (this.W) {
                }
                d0();
            }
            if (this.R.f27239e == 2) {
            }
            z17 = this.c0;
            sVar2 = this.R;
            if (z17 != sVar2.f27248o) {
            }
            if (!Z()) {
            }
            if (this.f6561d0 == 0) {
            }
            this.B.e();
            z18 = false;
            sVar3 = this.R;
            if (sVar3.f27249p != z18) {
            }
            this.f6560b0 = false;
            kc.f.B();
            return;
        }
        this.B.e();
    }

    public final void f0(e0 e0Var, i.a aVar, e0 e0Var2, i.a aVar2, long j10) {
        Object obj;
        if (!e0Var.q() && a0(e0Var, aVar)) {
            Object obj2 = aVar.f27272a;
            e0.b bVar = this.F;
            int i6 = e0Var.h(obj2, bVar).f6467w;
            e0.c cVar = this.E;
            e0Var.n(i6, cVar);
            q.e eVar = cVar.E;
            int i10 = c9.w.f5205a;
            com.google.android.exoplayer2.g gVar = (com.google.android.exoplayer2.g) this.O;
            gVar.getClass();
            gVar.f6496d = c9.w.y(eVar.f6725u);
            gVar.f6498g = c9.w.y(eVar.f6726v);
            gVar.f6499h = c9.w.y(eVar.f6727w);
            float f2 = eVar.f6728x;
            if (f2 == -3.4028235E38f) {
                f2 = 0.97f;
            }
            gVar.f6502k = f2;
            float f10 = eVar.f6729y;
            if (f10 == -3.4028235E38f) {
                f10 = 1.03f;
            }
            gVar.f6501j = f10;
            gVar.a();
            if (j10 != -9223372036854775807L) {
                gVar.f6497e = h(e0Var, obj2, j10);
                gVar.a();
                return;
            }
            Object obj3 = cVar.f6471u;
            if (!e0Var2.q()) {
                obj = e0Var2.n(e0Var2.h(aVar2.f27272a, bVar).f6467w, cVar).f6471u;
            } else {
                obj = null;
            }
            if (!c9.w.a(obj, obj3)) {
                gVar.f6497e = -9223372036854775807L;
                gVar.a();
                return;
            }
            return;
        }
        h hVar = this.I;
        float f11 = hVar.c().f7195u;
        v vVar = this.R.f27247n;
        if (f11 != vVar.f7195u) {
            hVar.d(vVar);
        }
    }

    public final void g(boolean[] zArr) {
        z[] zVarArr;
        Set<z> set;
        z[] zVarArr2;
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        c9.k kVar;
        s sVar = this.M;
        o7.o oVar = sVar.f6790i;
        z8.l lVar = oVar.f27223n;
        int i10 = 0;
        while (true) {
            zVarArr = this.f6566u;
            int length = zVarArr.length;
            set = this.f6567v;
            if (i10 >= length) {
                break;
            }
            if (!lVar.b(i10) && set.remove(zVarArr[i10])) {
                zVarArr[i10].reset();
            }
            i10++;
        }
        int i11 = 0;
        while (i11 < zVarArr.length) {
            if (lVar.b(i11)) {
                boolean z13 = zArr[i11];
                z zVar = zVarArr[i11];
                if (!s(zVar)) {
                    o7.o oVar2 = sVar.f6790i;
                    if (oVar2 == sVar.f6789h) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z8.l lVar2 = oVar2.f27223n;
                    o7.v vVar = lVar2.f39351b[i11];
                    z8.d dVar = lVar2.f39352c[i11];
                    if (dVar != null) {
                        i6 = dVar.length();
                    } else {
                        i6 = 0;
                    }
                    n[] nVarArr = new n[i6];
                    for (int i12 = 0; i12 < i6; i12++) {
                        nVarArr[i12] = dVar.f(i12);
                    }
                    if (Z() && this.R.f27239e == 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z13 && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f6561d0++;
                    set.add(zVar);
                    zVarArr2 = zVarArr;
                    zVar.h(vVar, nVarArr, oVar2.f27213c[i11], this.f6562f0, z12, z10, oVar2.e(), oVar2.f27224o);
                    zVar.o(11, new l(this));
                    h hVar = this.I;
                    hVar.getClass();
                    c9.k u10 = zVar.u();
                    if (u10 != null && u10 != (kVar = hVar.f6510x)) {
                        if (kVar == null) {
                            hVar.f6510x = u10;
                            hVar.f6509w = zVar;
                            u10.d(hVar.f6507u.f5193y);
                        } else {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z11) {
                        zVar.start();
                    }
                    i11++;
                    zVarArr = zVarArr2;
                }
            }
            zVarArr2 = zVarArr;
            i11++;
            zVarArr = zVarArr2;
        }
        oVar.f27216g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0134 -> B:66:0x0139). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0() {
        long j10;
        boolean z10;
        boolean z11;
        m mVar;
        m mVar2;
        m mVar3;
        m mVar4;
        m mVar5;
        long j11;
        m mVar6;
        c cVar;
        long max;
        long j12;
        float f2;
        long max2;
        float f10;
        o7.o oVar = this.M.f6789h;
        if (oVar == null) {
            return;
        }
        long j13 = -9223372036854775807L;
        if (oVar.f27214d) {
            j10 = oVar.f27211a.s();
        } else {
            j10 = -9223372036854775807L;
        }
        if (j10 != -9223372036854775807L) {
            F(j10);
            if (j10 != this.R.f27251s) {
                o7.s sVar = this.R;
                this.R = q(sVar.f27236b, j10, sVar.f27237c, j10, true, 5);
            }
            mVar = this;
            mVar2 = mVar;
        } else {
            h hVar = this.I;
            if (oVar != this.M.f6790i) {
                z10 = true;
            } else {
                z10 = false;
            }
            z zVar = hVar.f6509w;
            if (zVar != null && !zVar.b() && (hVar.f6509w.isReady() || (!z10 && !hVar.f6509w.f()))) {
                z11 = false;
            } else {
                z11 = true;
            }
            c9.r rVar = hVar.f6507u;
            if (z11) {
                hVar.f6511y = true;
                if (hVar.f6512z && !rVar.f5190v) {
                    rVar.f5192x = rVar.f5189u.d();
                    rVar.f5190v = true;
                }
            } else {
                c9.k kVar = hVar.f6510x;
                kVar.getClass();
                long j14 = kVar.j();
                if (hVar.f6511y) {
                    if (j14 < rVar.j()) {
                        if (rVar.f5190v) {
                            rVar.a(rVar.j());
                            rVar.f5190v = false;
                        }
                    } else {
                        hVar.f6511y = false;
                        if (hVar.f6512z && !rVar.f5190v) {
                            rVar.f5192x = rVar.f5189u.d();
                            rVar.f5190v = true;
                        }
                    }
                }
                rVar.a(j14);
                v c10 = kVar.c();
                if (!c10.equals(rVar.f5193y)) {
                    rVar.d(c10);
                    ((m) hVar.f6508v).B.k(16, c10).a();
                }
            }
            long j15 = hVar.j();
            this.f6562f0 = j15;
            long j16 = j15 - oVar.f27224o;
            long j17 = this.R.f27251s;
            if (!this.J.isEmpty() && !this.R.f27236b.a()) {
                if (this.f6564h0) {
                    j17--;
                    this.f6564h0 = false;
                }
                o7.s sVar2 = this.R;
                int c11 = sVar2.f27235a.c(sVar2.f27236b.f27272a);
                int min = Math.min(this.f6563g0, this.J.size());
                c cVar2 = null;
                if (min > 0) {
                    cVar = this.J.get(min - 1);
                    mVar = this;
                    mVar2 = mVar;
                    j11 = -9223372036854775807L;
                    mVar6 = mVar2;
                    while (cVar != null) {
                        cVar.getClass();
                        if (c11 >= 0) {
                            if (c11 != 0) {
                                break;
                            }
                            cVar.getClass();
                            if (0 <= j17) {
                                break;
                            }
                        }
                        min--;
                        if (min > 0) {
                            cVar = mVar6.J.get(min - 1);
                        } else {
                            mVar3 = mVar;
                            mVar4 = mVar2;
                            mVar5 = mVar6;
                            j13 = j11;
                            j11 = j13;
                            mVar6 = mVar5;
                            mVar2 = mVar4;
                            mVar = mVar3;
                            cVar = null;
                            while (cVar != null) {
                            }
                        }
                    }
                    if (min < mVar6.J.size()) {
                        cVar2 = mVar6.J.get(min);
                    }
                    if (cVar2 != null) {
                        cVar2.getClass();
                    }
                    if (cVar2 != null) {
                        cVar2.getClass();
                    }
                    mVar6.f6563g0 = min;
                    j13 = j11;
                } else {
                    mVar3 = this;
                    mVar4 = mVar3;
                    mVar5 = mVar4;
                    j11 = j13;
                    mVar6 = mVar5;
                    mVar2 = mVar4;
                    mVar = mVar3;
                    cVar = null;
                    while (cVar != null) {
                    }
                    if (min < mVar6.J.size()) {
                    }
                    if (cVar2 != null) {
                    }
                    if (cVar2 != null) {
                    }
                    mVar6.f6563g0 = min;
                    j13 = j11;
                }
            } else {
                mVar = this;
                mVar2 = mVar;
            }
            mVar.R.f27251s = j16;
        }
        mVar.R.f27250q = mVar.M.f6791j.d();
        o7.s sVar3 = mVar.R;
        long j18 = mVar2.R.f27250q;
        o7.o oVar2 = mVar2.M.f6791j;
        long j19 = 0;
        if (oVar2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j18 - (mVar2.f6562f0 - oVar2.f27224o));
        }
        sVar3.r = max;
        o7.s sVar4 = mVar.R;
        if (sVar4.f27245l && sVar4.f27239e == 3 && mVar.a0(sVar4.f27235a, sVar4.f27236b)) {
            o7.s sVar5 = mVar.R;
            if (sVar5.f27247n.f7195u == 1.0f) {
                p pVar = mVar.O;
                long h10 = mVar.h(sVar5.f27235a, sVar5.f27236b.f27272a, sVar5.f27251s);
                long j20 = mVar2.R.f27250q;
                o7.o oVar3 = mVar2.M.f6791j;
                if (oVar3 != null) {
                    j19 = Math.max(0L, j20 - (mVar2.f6562f0 - oVar3.f27224o));
                }
                com.google.android.exoplayer2.g gVar = (com.google.android.exoplayer2.g) pVar;
                if (gVar.f6496d == j13) {
                    f10 = 1.0f;
                } else {
                    long j21 = h10 - j19;
                    if (gVar.f6505n == j13) {
                        gVar.f6505n = j21;
                        gVar.f6506o = 0L;
                    } else {
                        float f11 = 1.0f - gVar.f6495c;
                        gVar.f6505n = Math.max(j21, (((float) j21) * f11) + (((float) j12) * f2));
                        gVar.f6506o = (f11 * ((float) Math.abs(j21 - max2))) + (((float) gVar.f6506o) * f2);
                    }
                    if (gVar.f6504m != j13 && SystemClock.elapsedRealtime() - gVar.f6504m < 1000) {
                        f10 = gVar.f6503l;
                    } else {
                        gVar.f6504m = SystemClock.elapsedRealtime();
                        long j22 = (gVar.f6506o * 3) + gVar.f6505n;
                        if (gVar.f6500i > j22) {
                            float y10 = (float) c9.w.y(1000L);
                            long[] jArr = {j22, gVar.f, gVar.f6500i - (((gVar.f6503l - 1.0f) * y10) + ((gVar.f6501j - 1.0f) * y10))};
                            long j23 = j22;
                            for (int i6 = 1; i6 < 3; i6++) {
                                long j24 = jArr[i6];
                                if (j24 > j23) {
                                    j23 = j24;
                                }
                            }
                            gVar.f6500i = j23;
                        } else {
                            long i10 = c9.w.i(h10 - (Math.max(0.0f, gVar.f6503l - 1.0f) / 1.0E-7f), gVar.f6500i, j22);
                            gVar.f6500i = i10;
                            long j25 = gVar.f6499h;
                            if (j25 != j13 && i10 > j25) {
                                gVar.f6500i = j25;
                            }
                        }
                        long j26 = h10 - gVar.f6500i;
                        if (Math.abs(j26) < gVar.f6493a) {
                            gVar.f6503l = 1.0f;
                        } else {
                            gVar.f6503l = c9.w.g((1.0E-7f * ((float) j26)) + 1.0f, gVar.f6502k, gVar.f6501j);
                        }
                        f10 = gVar.f6503l;
                    }
                }
                if (mVar.I.c().f7195u != f10) {
                    mVar.I.d(new v(f10, mVar.R.f27247n.f7196v));
                    mVar.p(mVar.R.f27247n, mVar.I.c().f7195u, false, false);
                }
            }
        }
    }

    public final long h(e0 e0Var, Object obj, long j10) {
        long elapsedRealtime;
        e0.b bVar = this.F;
        int i6 = e0Var.h(obj, bVar).f6467w;
        e0.c cVar = this.E;
        e0Var.n(i6, cVar);
        if (cVar.f6476z == -9223372036854775807L || !cVar.b() || !cVar.C) {
            return -9223372036854775807L;
        }
        long j11 = cVar.A;
        int i10 = c9.w.f5205a;
        if (j11 == -9223372036854775807L) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j11 + SystemClock.elapsedRealtime();
        }
        return c9.w.y(elapsedRealtime - cVar.f6476z) - (j10 + bVar.f6469y);
    }

    public final synchronized void h0(o7.g gVar, long j10) {
        long d10 = this.K.d() + j10;
        boolean z10 = false;
        while (!((Boolean) gVar.get()).booleanValue() && j10 > 0) {
            try {
                this.K.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = d10 - this.K.d();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        o7.o oVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6 = 1000;
        try {
            switch (message.what) {
                case 0:
                    y();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    T(message.arg2, 1, z10, true);
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    K((g) message.obj);
                    break;
                case 4:
                    U((v) message.obj);
                    break;
                case 5:
                    this.Q = (o7.x) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    A();
                    return true;
                case 8:
                    o((com.google.android.exoplayer2.source.h) message.obj);
                    break;
                case 9:
                    k((com.google.android.exoplayer2.source.h) message.obj);
                    break;
                case 10:
                    C();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    W(z11);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    P(z12, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    x xVar = (x) message.obj;
                    xVar.getClass();
                    M(xVar);
                    break;
                case 15:
                    N((x) message.obj);
                    break;
                case 16:
                    v vVar = (v) message.obj;
                    p(vVar, vVar.f7195u, true, false);
                    break;
                case 17:
                    Q((a) message.obj);
                    break;
                case 18:
                    c((a) message.obj, message.arg1);
                    break;
                case 19:
                    x((b) message.obj);
                    break;
                case 20:
                    B(message.arg1, message.arg2, (o8.l) message.obj);
                    break;
                case 21:
                    X((o8.l) message.obj);
                    break;
                case 22:
                    w();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    S(z13);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    R(z14);
                    break;
                case 25:
                    J(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e10) {
            e = e10;
            if (e.f6154w == 1 && (oVar = this.M.f6790i) != null) {
                e = e.c(oVar.f.f27225a);
            }
            if (e.C && this.f6565i0 == null) {
                ca.a.B1("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f6565i0 = e;
                c9.i iVar = this.B;
                iVar.d(iVar.k(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f6565i0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f6565i0;
                }
                ca.a.Q("ExoPlayerImplInternal", "Playback error", e);
                c0(true, false);
                this.R = this.R.e(e);
            }
        } catch (ParserException e11) {
            boolean z15 = e11.f6158u;
            int i10 = e11.f6159v;
            if (i10 == 1) {
                if (z15) {
                    i6 = 3001;
                } else {
                    i6 = 3003;
                }
            } else if (i10 == 4) {
                if (z15) {
                    i6 = 3002;
                } else {
                    i6 = 3004;
                }
            }
            l(e11, i6);
        } catch (DrmSession.DrmSessionException e12) {
            l(e12, e12.f6422u);
        } catch (BehindLiveWindowException e13) {
            l(e13, 1002);
        } catch (DataSourceException e14) {
            l(e14, e14.f7153u);
        } catch (IOException e15) {
            l(e15, 2000);
        } catch (RuntimeException e16) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e16, ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) ? 1004 : 1004);
            ca.a.Q("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            c0(true, false);
            this.R = this.R.e(exoPlaybackException2);
        }
        v();
        return true;
    }

    public final long i() {
        o7.o oVar = this.M.f6790i;
        if (oVar == null) {
            return 0L;
        }
        long j10 = oVar.f27224o;
        if (!oVar.f27214d) {
            return j10;
        }
        int i6 = 0;
        while (true) {
            z[] zVarArr = this.f6566u;
            if (i6 < zVarArr.length) {
                if (s(zVarArr[i6]) && zVarArr[i6].p() == oVar.f27213c[i6]) {
                    long r = zVarArr[i6].r();
                    if (r == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(r, j10);
                }
                i6++;
            } else {
                return j10;
            }
        }
    }

    public final Pair<i.a, Long> j(e0 e0Var) {
        long j10 = 0;
        if (e0Var.q()) {
            return Pair.create(o7.s.f27234t, 0L);
        }
        Pair<Object, Long> j11 = e0Var.j(this.E, this.F, e0Var.b(this.Z), -9223372036854775807L);
        i.a l2 = this.M.l(e0Var, j11.first, 0L);
        long longValue = ((Long) j11.second).longValue();
        if (l2.a()) {
            Object obj = l2.f27272a;
            e0.b bVar = this.F;
            e0Var.h(obj, bVar);
            if (l2.f27274c == bVar.d(l2.f27273b)) {
                j10 = bVar.A.f6826w;
            }
            longValue = j10;
        }
        return Pair.create(l2, Long.valueOf(longValue));
    }

    public final void k(com.google.android.exoplayer2.source.h hVar) {
        boolean z10;
        o7.o oVar = this.M.f6791j;
        boolean z11 = true;
        if (oVar != null && oVar.f27211a == hVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        long j10 = this.f6562f0;
        if (oVar != null) {
            if (oVar.f27221l != null) {
                z11 = false;
            }
            sc.b.C(z11);
            if (oVar.f27214d) {
                oVar.f27211a.h(j10 - oVar.f27224o);
            }
        }
        u();
    }

    public final void l(IOException iOException, int i6) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i6);
        o7.o oVar = this.M.f6789h;
        if (oVar != null) {
            exoPlaybackException = exoPlaybackException.c(oVar.f.f27225a);
        }
        ca.a.Q("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        c0(false, false);
        this.R = this.R.e(exoPlaybackException);
    }

    public final void m(boolean z10) {
        i.a aVar;
        long d10;
        o7.o oVar = this.M.f6791j;
        if (oVar == null) {
            aVar = this.R.f27236b;
        } else {
            aVar = oVar.f.f27225a;
        }
        boolean z11 = !this.R.f27244k.equals(aVar);
        if (z11) {
            this.R = this.R.a(aVar);
        }
        o7.s sVar = this.R;
        if (oVar == null) {
            d10 = sVar.f27251s;
        } else {
            d10 = oVar.d();
        }
        sVar.f27250q = d10;
        o7.s sVar2 = this.R;
        long j10 = sVar2.f27250q;
        o7.o oVar2 = this.M.f6791j;
        long j11 = 0;
        if (oVar2 != null) {
            j11 = Math.max(0L, j10 - (this.f6562f0 - oVar2.f27224o));
        }
        sVar2.r = j11;
        if ((z11 || z10) && oVar != null && oVar.f27214d) {
            this.f6571z.g(this.f6566u, oVar.f27223n.f39352c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(e0 e0Var, boolean z10) {
        boolean z11;
        long j10;
        Object obj;
        int i6;
        i.a aVar;
        int i10;
        Object obj2;
        long j11;
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        boolean z16;
        long j12;
        i.a l2;
        boolean z17;
        boolean equals;
        boolean z18;
        boolean z19;
        long j13;
        f fVar;
        long j14;
        int i13;
        boolean z20;
        int i14;
        boolean z21;
        boolean z22;
        boolean z23;
        int i15;
        boolean z24;
        g gVar;
        int i16;
        boolean z25;
        int i17;
        boolean z26;
        boolean z27;
        long j15;
        boolean z28;
        o7.s sVar = this.R;
        g gVar2 = this.e0;
        s sVar2 = this.M;
        int i18 = this.Y;
        boolean z29 = this.Z;
        e0.c cVar = this.E;
        e0.b bVar = this.F;
        long j16 = -9223372036854775807L;
        if (e0Var.q()) {
            f fVar2 = new f(o7.s.f27234t, 0L, -9223372036854775807L, false, true, false);
            fVar = fVar2;
            i15 = fVar2;
        } else {
            i.a aVar2 = sVar.f27236b;
            Object obj3 = aVar2.f27272a;
            e0 e0Var2 = sVar.f27235a;
            boolean q10 = e0Var2.q();
            if (!q10 && !e0Var2.h(aVar2.f27272a, bVar).f6470z) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!sVar.f27236b.a() && !z11) {
                j10 = sVar.f27251s;
            } else {
                j10 = sVar.f27237c;
            }
            long j17 = j10;
            if (gVar2 != null) {
                Pair<Object, Long> H = H(e0Var, gVar2, true, i18, z29, cVar, bVar);
                if (H == null) {
                    i10 = e0Var.b(z29);
                    j11 = j17;
                    obj2 = obj3;
                    z22 = false;
                    z20 = false;
                    z23 = true;
                } else {
                    if (gVar2.f6589c == -9223372036854775807L) {
                        i14 = e0Var.h(H.first, bVar).f6467w;
                        j11 = j17;
                        obj2 = obj3;
                        z20 = false;
                    } else {
                        obj2 = H.first;
                        j11 = ((Long) H.second).longValue();
                        z20 = true;
                        i14 = -1;
                    }
                    if (sVar.f27239e == 4) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z21;
                    i10 = i14;
                    z23 = false;
                }
                z12 = z22;
                z14 = z20;
                z13 = z23;
                aVar = aVar2;
                i6 = -1;
            } else {
                if (sVar.f27235a.q()) {
                    i12 = e0Var.b(z29);
                    obj = obj3;
                    i6 = -1;
                } else {
                    obj = obj3;
                    if (e0Var.c(obj) == -1) {
                        i6 = -1;
                        Object I = I(cVar, bVar, i18, z29, obj, sVar.f27235a, e0Var);
                        if (I == null) {
                            i10 = e0Var.b(z29);
                            z15 = true;
                        } else {
                            i10 = e0Var.h(I, bVar).f6467w;
                            z15 = false;
                        }
                        z16 = z15;
                        aVar = aVar2;
                        z13 = z16;
                        obj2 = obj;
                        j11 = j17;
                        z12 = false;
                        z14 = false;
                    } else {
                        i6 = -1;
                        if (j17 == -9223372036854775807L) {
                            i12 = e0Var.h(obj, bVar).f6467w;
                        } else if (z11) {
                            aVar = aVar2;
                            sVar.f27235a.h(aVar.f27272a, bVar);
                            if (sVar.f27235a.n(bVar.f6467w, cVar).I == sVar.f27235a.c(aVar.f27272a)) {
                                Pair<Object, Long> j18 = e0Var.j(cVar, bVar, e0Var.h(obj, bVar).f6467w, j17 + bVar.f6469y);
                                obj2 = j18.first;
                                j11 = ((Long) j18.second).longValue();
                            } else {
                                obj2 = obj;
                                j11 = j17;
                            }
                            i11 = -1;
                            z12 = false;
                            z13 = false;
                            z14 = true;
                            if (i11 == i6) {
                                Pair<Object, Long> j19 = e0Var.j(cVar, bVar, i11, -9223372036854775807L);
                                obj2 = j19.first;
                                j11 = ((Long) j19.second).longValue();
                                j12 = -9223372036854775807L;
                            } else {
                                j12 = j11;
                            }
                            l2 = sVar2.l(e0Var, obj2, j11);
                            if (l2.f27276e == i6 && ((i13 = aVar.f27276e) == i6 || l2.f27273b < i13)) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            equals = aVar.f27272a.equals(obj2);
                            if (!equals && !aVar.a() && !l2.a() && z17) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            e0Var.h(obj2, bVar);
                            if (!equals && !z11 && j17 == j12 && ((l2.a() && bVar.e(l2.f27273b)) || (aVar.a() && bVar.e(aVar.f27273b)))) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (!z18 || z19) {
                                l2 = aVar;
                            }
                            if (!l2.a()) {
                                if (l2.equals(aVar)) {
                                    j14 = sVar.f27251s;
                                } else {
                                    e0Var.h(l2.f27272a, bVar);
                                    if (l2.f27274c == bVar.d(l2.f27273b)) {
                                        j14 = bVar.A.f6826w;
                                    } else {
                                        j14 = 0;
                                    }
                                }
                                j13 = j14;
                            } else {
                                j13 = j11;
                            }
                            fVar = new f(l2, j13, j12, z12, z13, z14);
                            i15 = q10;
                        } else {
                            aVar = aVar2;
                            i10 = -1;
                            z16 = false;
                            z13 = z16;
                            obj2 = obj;
                            j11 = j17;
                            z12 = false;
                            z14 = false;
                        }
                    }
                }
                i10 = i12;
                aVar = aVar2;
                z16 = false;
                z13 = z16;
                obj2 = obj;
                j11 = j17;
                z12 = false;
                z14 = false;
            }
            i11 = i10;
            if (i11 == i6) {
            }
            l2 = sVar2.l(e0Var, obj2, j11);
            if (l2.f27276e == i6) {
            }
            z17 = true;
            equals = aVar.f27272a.equals(obj2);
            if (!equals) {
            }
            z18 = false;
            e0Var.h(obj2, bVar);
            if (!equals) {
            }
            z19 = false;
            if (!z18) {
            }
            l2 = aVar;
            if (!l2.a()) {
            }
            fVar = new f(l2, j13, j12, z12, z13, z14);
            i15 = q10;
        }
        i.a aVar3 = fVar.f6582a;
        long j20 = fVar.f6584c;
        boolean z30 = fVar.f6585d;
        long j21 = fVar.f6583b;
        if (this.R.f27236b.equals(aVar3) && j21 == this.R.f27251s) {
            z24 = false;
        } else {
            z24 = true;
        }
        try {
            if (fVar.f6586e) {
                if (this.R.f27239e != 1) {
                    Y(4);
                }
                D(false, false, false, true);
            }
            try {
                if (!z24) {
                    try {
                        i17 = 4;
                        z26 = true;
                        z27 = false;
                        if (!this.M.o(e0Var, this.f6562f0, i())) {
                            J(false);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        i15 = 4;
                        z25 = true;
                        gVar = null;
                        i16 = i15;
                        o7.s sVar3 = this.R;
                        e0 e0Var3 = sVar3.f27235a;
                        i.a aVar4 = sVar3.f27236b;
                        if (fVar.f) {
                            j16 = j21;
                        }
                        g gVar3 = gVar;
                        f0(e0Var, aVar3, e0Var3, aVar4, j16);
                        if (z24 || j20 != this.R.f27237c) {
                            o7.s sVar4 = this.R;
                            Object obj4 = sVar4.f27236b.f27272a;
                            e0 e0Var4 = sVar4.f27235a;
                            z25 = (!z24 || !z10 || e0Var4.q() || e0Var4.h(obj4, this.F).f6470z) ? false : false;
                            long j22 = this.R.f27238d;
                            if (e0Var.c(obj4) != -1) {
                                i16 = 3;
                            }
                            this.R = q(aVar3, j21, j20, j22, z25, i16);
                        }
                        E();
                        G(e0Var, this.R.f27235a);
                        this.R = this.R.h(e0Var);
                        if (!e0Var.q()) {
                            this.e0 = gVar3;
                        }
                        m(false);
                        throw th;
                    }
                } else {
                    z27 = false;
                    i17 = 4;
                    z26 = true;
                    if (!e0Var.q()) {
                        for (o7.o oVar = this.M.f6789h; oVar != null; oVar = oVar.f27221l) {
                            if (oVar.f.f27225a.equals(aVar3)) {
                                oVar.f = this.M.g(e0Var, oVar.f);
                                oVar.h();
                            }
                        }
                        s sVar5 = this.M;
                        if (sVar5.f6789h != sVar5.f6790i) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        j21 = L(aVar3, j21, z28, z30);
                    }
                }
                o7.s sVar6 = this.R;
                e0 e0Var5 = sVar6.f27235a;
                i.a aVar5 = sVar6.f27236b;
                if (fVar.f) {
                    j15 = j21;
                } else {
                    j15 = -9223372036854775807L;
                }
                f0(e0Var, aVar3, e0Var5, aVar5, j15);
                if (z24 || j20 != this.R.f27237c) {
                    o7.s sVar7 = this.R;
                    Object obj5 = sVar7.f27236b.f27272a;
                    e0 e0Var6 = sVar7.f27235a;
                    z26 = (!z24 || !z10 || e0Var6.q() || e0Var6.h(obj5, this.F).f6470z) ? false : false;
                    long j23 = this.R.f27238d;
                    if (e0Var.c(obj5) != -1) {
                        i17 = 3;
                    }
                    this.R = q(aVar3, j21, j20, j23, z26, i17);
                }
                E();
                G(e0Var, this.R.f27235a);
                this.R = this.R.h(e0Var);
                if (!e0Var.q()) {
                    this.e0 = null;
                }
                m(z27);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            gVar = null;
            i16 = 4;
            z25 = true;
        }
    }

    public final void o(com.google.android.exoplayer2.source.h hVar) {
        boolean z10;
        s sVar = this.M;
        o7.o oVar = sVar.f6791j;
        if (oVar != null && oVar.f27211a == hVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        float f2 = this.I.c().f7195u;
        e0 e0Var = this.R.f27235a;
        oVar.f27214d = true;
        oVar.f27222m = oVar.f27211a.u();
        z8.l g5 = oVar.g(f2, e0Var);
        o7.p pVar = oVar.f;
        long j10 = pVar.f27226b;
        long j11 = pVar.f27229e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = oVar.a(g5, j10, false, new boolean[oVar.f27218i.length]);
        long j12 = oVar.f27224o;
        o7.p pVar2 = oVar.f;
        oVar.f27224o = (pVar2.f27226b - a10) + j12;
        oVar.f = pVar2.b(a10);
        z8.d[] dVarArr = oVar.f27223n.f39352c;
        o7.n nVar = this.f6571z;
        z[] zVarArr = this.f6566u;
        nVar.g(zVarArr, dVarArr);
        if (oVar == sVar.f6789h) {
            F(oVar.f.f27226b);
            g(new boolean[zVarArr.length]);
            o7.s sVar2 = this.R;
            i.a aVar = sVar2.f27236b;
            long j13 = oVar.f.f27226b;
            this.R = q(aVar, j13, sVar2.f27237c, j13, false, 5);
        }
        u();
    }

    public final void p(v vVar, float f2, boolean z10, boolean z11) {
        int i6;
        if (z10) {
            if (z11) {
                this.S.a(1);
            }
            this.R = this.R.f(vVar);
        }
        float f10 = vVar.f7195u;
        o7.o oVar = this.M.f6789h;
        while (true) {
            i6 = 0;
            if (oVar == null) {
                break;
            }
            z8.d[] dVarArr = oVar.f27223n.f39352c;
            int length = dVarArr.length;
            while (i6 < length) {
                z8.d dVar = dVarArr[i6];
                if (dVar != null) {
                    dVar.d();
                }
                i6++;
            }
            oVar = oVar.f27221l;
        }
        z[] zVarArr = this.f6566u;
        int length2 = zVarArr.length;
        while (i6 < length2) {
            z zVar = zVarArr[i6];
            if (zVar != null) {
                zVar.k(f2, vVar.f7195u);
            }
            i6++;
        }
    }

    public final o7.s q(i.a aVar, long j10, long j11, long j12, boolean z10, int i6) {
        boolean z11;
        o8.p pVar;
        z8.l lVar;
        l0 l0Var;
        long max;
        boolean z12;
        o8.p pVar2;
        z8.l lVar2;
        l0 l0Var2;
        if (!this.f6564h0 && j10 == this.R.f27251s && aVar.equals(this.R.f27236b)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f6564h0 = z11;
        E();
        o7.s sVar = this.R;
        o8.p pVar3 = sVar.f27241h;
        z8.l lVar3 = sVar.f27242i;
        List<g8.a> list = sVar.f27243j;
        if (this.N.f7033j) {
            o7.o oVar = this.M.f6789h;
            if (oVar == null) {
                pVar2 = o8.p.f27305x;
            } else {
                pVar2 = oVar.f27222m;
            }
            if (oVar == null) {
                lVar2 = this.f6570y;
            } else {
                lVar2 = oVar.f27223n;
            }
            z8.d[] dVarArr = lVar2.f39352c;
            s.a aVar2 = new s.a();
            boolean z13 = false;
            for (z8.d dVar : dVarArr) {
                if (dVar != null) {
                    g8.a aVar3 = dVar.f(0).D;
                    if (aVar3 == null) {
                        aVar2.b(new g8.a(new a.b[0]));
                    } else {
                        aVar2.b(aVar3);
                        z13 = true;
                    }
                }
            }
            if (z13) {
                l0Var2 = aVar2.c();
            } else {
                s.b bVar = com.google.common.collect.s.f9446v;
                l0Var2 = l0.f9412y;
            }
            if (oVar != null) {
                o7.p pVar4 = oVar.f;
                if (pVar4.f27227c != j11) {
                    oVar.f = pVar4.a(j11);
                }
            }
            l0Var = l0Var2;
            pVar = pVar2;
            lVar = lVar2;
        } else if (!aVar.equals(sVar.f27236b)) {
            o8.p pVar5 = o8.p.f27305x;
            z8.l lVar4 = this.f6570y;
            s.b bVar2 = com.google.common.collect.s.f9446v;
            pVar = pVar5;
            lVar = lVar4;
            l0Var = l0.f9412y;
        } else {
            pVar = pVar3;
            lVar = lVar3;
            l0Var = list;
        }
        if (z10) {
            d dVar2 = this.S;
            if (dVar2.f6579d && dVar2.f6580e != 5) {
                if (i6 == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sc.b.q(z12);
            } else {
                dVar2.f6576a = true;
                dVar2.f6579d = true;
                dVar2.f6580e = i6;
            }
        }
        o7.s sVar2 = this.R;
        long j13 = sVar2.f27250q;
        o7.o oVar2 = this.M.f6791j;
        if (oVar2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j13 - (this.f6562f0 - oVar2.f27224o));
        }
        return sVar2.b(aVar, j10, j11, j12, max, pVar, lVar, l0Var);
    }

    public final boolean r() {
        long c10;
        o7.o oVar = this.M.f6791j;
        if (oVar == null) {
            return false;
        }
        if (!oVar.f27214d) {
            c10 = 0;
        } else {
            c10 = oVar.f27211a.c();
        }
        if (c10 == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean t() {
        o7.o oVar = this.M.f6789h;
        long j10 = oVar.f.f27229e;
        if (oVar.f27214d && (j10 == -9223372036854775807L || this.R.f27251s < j10 || !Z())) {
            return true;
        }
        return false;
    }

    public final void u() {
        long c10;
        boolean d10;
        boolean r = r();
        boolean z10 = false;
        s sVar = this.M;
        if (!r) {
            d10 = false;
        } else {
            o7.o oVar = sVar.f6791j;
            long j10 = 0;
            if (!oVar.f27214d) {
                c10 = 0;
            } else {
                c10 = oVar.f27211a.c();
            }
            o7.o oVar2 = sVar.f6791j;
            if (oVar2 != null) {
                j10 = Math.max(0L, c10 - (this.f6562f0 - oVar2.f27224o));
            }
            if (oVar != sVar.f6789h) {
                long j11 = oVar.f.f27226b;
            }
            d10 = this.f6571z.d(j10, this.I.c().f7195u);
        }
        this.X = d10;
        if (d10) {
            o7.o oVar3 = sVar.f6791j;
            long j12 = this.f6562f0;
            if (oVar3.f27221l == null) {
                z10 = true;
            }
            sc.b.C(z10);
            oVar3.f27211a.d(j12 - oVar3.f27224o);
        }
        e0();
    }

    public final void v() {
        boolean z10;
        d dVar = this.S;
        o7.s sVar = this.R;
        boolean z11 = dVar.f6576a;
        if (dVar.f6577b != sVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        dVar.f6576a = z12;
        dVar.f6577b = sVar;
        if (z12) {
            k kVar = ((o7.l) this.L).f27208v;
            kVar.getClass();
            kVar.f.f(new g.v(kVar, 28, dVar));
            this.S = new d(this.R);
        }
    }

    public final void w() {
        n(this.N.b(), true);
    }

    public final void x(b bVar) {
        boolean z10 = true;
        this.S.a(1);
        bVar.getClass();
        t tVar = this.N;
        tVar.getClass();
        if (tVar.f7025a.size() < 0) {
            z10 = false;
        }
        sc.b.q(z10);
        tVar.f7032i = null;
        n(tVar.b(), false);
    }

    public final void y() {
        int i6;
        this.S.a(1);
        int i10 = 0;
        D(false, false, false, true);
        this.f6571z.c();
        if (this.R.f27235a.q()) {
            i6 = 4;
        } else {
            i6 = 2;
        }
        Y(i6);
        b9.k d10 = this.A.d();
        t tVar = this.N;
        sc.b.C(!tVar.f7033j);
        tVar.f7034k = d10;
        while (true) {
            ArrayList arrayList = tVar.f7025a;
            if (i10 < arrayList.size()) {
                t.c cVar = (t.c) arrayList.get(i10);
                tVar.e(cVar);
                tVar.f7031h.add(cVar);
                i10++;
            } else {
                tVar.f7033j = true;
                this.B.j(2);
                return;
            }
        }
    }

    public final synchronized boolean z() {
        if (!this.T && this.C.isAlive()) {
            this.B.j(7);
            h0(new o7.g(2, this), this.P);
            return this.T;
        }
        return true;
    }
}
