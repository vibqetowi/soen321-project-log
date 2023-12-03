package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import c9.h;
import c9.j;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.source.g;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.x;
import com.google.common.collect.l0;
import com.google.common.collect.s;
import g8.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import o8.l;
/* compiled from: ExoPlayerImpl.java */
/* loaded from: classes.dex */
public final class k extends d {
    public static final /* synthetic */ int H = 0;
    public o8.l A;
    public w.a B;
    public r C;
    public r D;
    public o7.s E;
    public int F;
    public long G;

    /* renamed from: b  reason: collision with root package name */
    public final z8.l f6533b;

    /* renamed from: c  reason: collision with root package name */
    public final w.a f6534c;

    /* renamed from: d  reason: collision with root package name */
    public final z[] f6535d;

    /* renamed from: e  reason: collision with root package name */
    public final z8.k f6536e;
    public final c9.i f;

    /* renamed from: g  reason: collision with root package name */
    public final o7.l f6537g;

    /* renamed from: h  reason: collision with root package name */
    public final m f6538h;

    /* renamed from: i  reason: collision with root package name */
    public final c9.j<w.b> f6539i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArraySet<j.a> f6540j;

    /* renamed from: k  reason: collision with root package name */
    public final e0.b f6541k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f6542l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6543m;

    /* renamed from: n  reason: collision with root package name */
    public final o8.i f6544n;

    /* renamed from: o  reason: collision with root package name */
    public final p7.n f6545o;

    /* renamed from: p  reason: collision with root package name */
    public final Looper f6546p;

    /* renamed from: q  reason: collision with root package name */
    public final b9.b f6547q;
    public final long r;

    /* renamed from: s  reason: collision with root package name */
    public final long f6548s;

    /* renamed from: t  reason: collision with root package name */
    public final c9.b f6549t;

    /* renamed from: u  reason: collision with root package name */
    public int f6550u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6551v;

    /* renamed from: w  reason: collision with root package name */
    public int f6552w;

    /* renamed from: x  reason: collision with root package name */
    public int f6553x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6554y;

    /* renamed from: z  reason: collision with root package name */
    public int f6555z;

    /* compiled from: ExoPlayerImpl.java */
    /* loaded from: classes.dex */
    public static final class a implements o7.q {

        /* renamed from: a  reason: collision with root package name */
        public final Object f6556a;

        /* renamed from: b  reason: collision with root package name */
        public e0 f6557b;

        public a(g.a aVar, Object obj) {
            this.f6556a = obj;
            this.f6557b = aVar;
        }

        @Override // o7.q
        public final Object a() {
            return this.f6556a;
        }

        @Override // o7.q
        public final e0 b() {
            return this.f6557b;
        }
    }

    static {
        o7.m.a("goog.exo.exoplayer");
    }

    public k(z[] zVarArr, z8.k kVar, o8.i iVar, o7.n nVar, b9.b bVar, p7.n nVar2, boolean z10, o7.x xVar, long j10, long j11, g gVar, long j12, c9.s sVar, Looper looper, w wVar, w.a aVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = c9.w.f5209e;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str, ri.e.c(hexString, 30)), "Init ", hexString, " [ExoPlayerLib/2.16.0] [", str);
        n10.append("]");
        Log.i("ExoPlayerImpl", n10.toString());
        boolean z11 = true;
        sc.b.C(zVarArr.length > 0);
        this.f6535d = zVarArr;
        kVar.getClass();
        this.f6536e = kVar;
        this.f6544n = iVar;
        this.f6547q = bVar;
        this.f6545o = nVar2;
        this.f6543m = z10;
        this.r = j10;
        this.f6548s = j11;
        this.f6546p = looper;
        this.f6549t = sVar;
        this.f6550u = 0;
        w wVar2 = wVar != null ? wVar : this;
        this.f6539i = new c9.j<>(looper, sVar, new f0.b(16, wVar2));
        this.f6540j = new CopyOnWriteArraySet<>();
        this.f6542l = new ArrayList();
        this.A = new l.a();
        z8.l lVar = new z8.l(new o7.v[zVarArr.length], new z8.d[zVarArr.length], f0.f6487v, null);
        this.f6533b = lVar;
        this.f6541k = new e0.b();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30};
        int i6 = 0;
        for (int i10 = 12; i6 < i10; i10 = 12) {
            int i11 = iArr[i6];
            sc.b.C(!false);
            sparseBooleanArray.append(i11, true);
            i6++;
        }
        if (kVar instanceof z8.c) {
            sc.b.C(!false);
            sparseBooleanArray.append(29, true);
        }
        int i12 = 0;
        while (true) {
            c9.h hVar = aVar.f7198u;
            if (i12 >= hVar.b()) {
                break;
            }
            int a10 = hVar.a(i12);
            sc.b.C(true);
            sparseBooleanArray.append(a10, true);
            i12++;
        }
        sc.b.C(true);
        w.a aVar2 = new w.a(new c9.h(sparseBooleanArray));
        this.f6534c = aVar2;
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        int i13 = 0;
        while (true) {
            c9.h hVar2 = aVar2.f7198u;
            if (i13 >= hVar2.b()) {
                break;
            }
            int a11 = hVar2.a(i13);
            sc.b.C(true);
            sparseBooleanArray2.append(a11, true);
            i13++;
        }
        sc.b.C(true);
        sparseBooleanArray2.append(4, true);
        sc.b.C(true);
        sparseBooleanArray2.append(10, true);
        sc.b.C(true);
        this.B = new w.a(new c9.h(sparseBooleanArray2));
        r rVar = r.f6751a0;
        this.C = rVar;
        this.D = rVar;
        this.F = -1;
        this.f = sVar.b(looper, null);
        o7.l lVar2 = new o7.l(this, 0);
        this.f6537g = lVar2;
        this.E = o7.s.i(lVar);
        if (nVar2 != null) {
            if (nVar2.A != null && !nVar2.f27966x.f27970b.isEmpty()) {
                z11 = false;
            }
            sc.b.C(z11);
            nVar2.A = wVar2;
            nVar2.B = nVar2.f27963u.b(looper, null);
            c9.j<p7.o> jVar = nVar2.f27968z;
            nVar2.f27968z = new c9.j<>(jVar.f5144d, looper, jVar.f5141a, new dd.a(nVar2, 9, wVar2));
            i0(nVar2);
            bVar.c(new Handler(looper), nVar2);
        }
        this.f6538h = new m(zVarArr, kVar, lVar, nVar, bVar, this.f6550u, this.f6551v, nVar2, xVar, gVar, j12, looper, sVar, lVar2);
    }

    public static long r0(o7.s sVar) {
        e0.c cVar = new e0.c();
        e0.b bVar = new e0.b();
        sVar.f27235a.h(sVar.f27236b.f27272a, bVar);
        long j10 = sVar.f27237c;
        if (j10 == -9223372036854775807L) {
            return sVar.f27235a.n(bVar.f6467w, cVar).G;
        }
        return bVar.f6469y + j10;
    }

    public static boolean s0(o7.s sVar) {
        if (sVar.f27239e == 3 && sVar.f27245l && sVar.f27246m == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(final o7.s sVar, final int i6, final int i10, boolean z10, boolean z11, int i11, long j10, int i12) {
        Pair pair;
        int i13;
        q qVar;
        int i14;
        Object obj;
        q qVar2;
        Object obj2;
        int i15;
        long j11;
        long r02;
        Object obj3;
        q qVar3;
        Object obj4;
        int i16;
        long j12;
        o7.s sVar2 = this.E;
        this.E = sVar;
        boolean z12 = !sVar2.f27235a.equals(sVar.f27235a);
        e0 e0Var = sVar2.f27235a;
        e0 e0Var2 = sVar.f27235a;
        if (e0Var2.q() && e0Var.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (e0Var2.q() != e0Var.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            i.a aVar = sVar2.f27236b;
            Object obj5 = aVar.f27272a;
            e0.b bVar = this.f6541k;
            int i17 = e0Var.h(obj5, bVar).f6467w;
            e0.c cVar = this.f6355a;
            Object obj6 = e0Var.n(i17, cVar).f6471u;
            i.a aVar2 = sVar.f27236b;
            if (!obj6.equals(e0Var2.n(e0Var2.h(aVar2.f27272a, bVar).f6467w, cVar).f6471u)) {
                if (z11 && i11 == 0) {
                    i13 = 1;
                } else if (z11 && i11 == 1) {
                    i13 = 2;
                } else if (z12) {
                    i13 = 3;
                } else {
                    throw new IllegalStateException();
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i13));
            } else if (z11 && i11 == 0 && aVar.f27275d < aVar2.f27275d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        r rVar = this.C;
        if (booleanValue) {
            if (!sVar.f27235a.q()) {
                qVar = sVar.f27235a.n(sVar.f27235a.h(sVar.f27236b.f27272a, this.f6541k).f6467w, this.f6355a).f6473w;
            } else {
                qVar = null;
            }
            this.D = r.f6751a0;
        } else {
            qVar = null;
        }
        if (booleanValue || !sVar2.f27243j.equals(sVar.f27243j)) {
            r rVar2 = this.D;
            rVar2.getClass();
            r.a aVar3 = new r.a(rVar2);
            List<g8.a> list = sVar.f27243j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                g8.a aVar4 = list.get(i18);
                int i19 = 0;
                while (true) {
                    a.b[] bVarArr = aVar4.f16378u;
                    if (i19 < bVarArr.length) {
                        bVarArr[i19].r(aVar3);
                        i19++;
                    }
                }
            }
            this.D = new r(aVar3);
            rVar = k0();
        }
        boolean z13 = !rVar.equals(this.C);
        this.C = rVar;
        if (!sVar2.f27235a.equals(sVar.f27235a)) {
            this.f6539i.b(0, new j.a() { // from class: o7.i
                @Override // c9.j.a
                public final void invoke(Object obj7) {
                    int i20 = r2;
                    int i21 = i6;
                    s sVar3 = sVar;
                    switch (i20) {
                        case 0:
                            e0 e0Var3 = sVar3.f27235a;
                            ((w.b) obj7).L(i21);
                            return;
                        default:
                            ((w.b) obj7).v(i21, sVar3.f27245l);
                            return;
                    }
                }
            });
        }
        if (z11) {
            e0.b bVar2 = new e0.b();
            if (!sVar2.f27235a.q()) {
                Object obj7 = sVar2.f27236b.f27272a;
                sVar2.f27235a.h(obj7, bVar2);
                int i20 = bVar2.f6467w;
                obj2 = obj7;
                i14 = i20;
                i15 = sVar2.f27235a.c(obj7);
                obj = sVar2.f27235a.n(i20, this.f6355a).f6471u;
                qVar2 = this.f6355a.f6473w;
            } else {
                i14 = i12;
                obj = null;
                qVar2 = null;
                obj2 = null;
                i15 = -1;
            }
            if (i11 == 0) {
                j11 = bVar2.f6469y + bVar2.f6468x;
                if (sVar2.f27236b.a()) {
                    i.a aVar5 = sVar2.f27236b;
                    j11 = bVar2.b(aVar5.f27273b, aVar5.f27274c);
                    r02 = r0(sVar2);
                    long E = c9.w.E(j11);
                    long E2 = c9.w.E(r02);
                    i.a aVar6 = sVar2.f27236b;
                    w.e eVar = new w.e(obj, i14, qVar2, obj2, i15, E, E2, aVar6.f27273b, aVar6.f27274c);
                    int K = K();
                    if (this.E.f27235a.q()) {
                        o7.s sVar3 = this.E;
                        Object obj8 = sVar3.f27236b.f27272a;
                        sVar3.f27235a.h(obj8, this.f6541k);
                        int c10 = this.E.f27235a.c(obj8);
                        e0 e0Var3 = this.E.f27235a;
                        e0.c cVar2 = this.f6355a;
                        i16 = c10;
                        obj4 = obj8;
                        obj3 = e0Var3.n(K, cVar2).f6471u;
                        qVar3 = cVar2.f6473w;
                    } else {
                        obj3 = null;
                        qVar3 = null;
                        obj4 = null;
                        i16 = -1;
                    }
                    long E3 = c9.w.E(j10);
                    if (!this.E.f27236b.a()) {
                        j12 = c9.w.E(r0(this.E));
                    } else {
                        j12 = E3;
                    }
                    i.a aVar7 = this.E.f27236b;
                    this.f6539i.b(11, new j7.f(i11, eVar, new w.e(obj3, K, qVar3, obj4, i16, E3, j12, aVar7.f27273b, aVar7.f27274c)));
                } else {
                    if (sVar2.f27236b.f27276e != -1 && this.E.f27236b.a()) {
                        j11 = r0(this.E);
                    }
                    r02 = j11;
                    long E4 = c9.w.E(j11);
                    long E22 = c9.w.E(r02);
                    i.a aVar62 = sVar2.f27236b;
                    w.e eVar2 = new w.e(obj, i14, qVar2, obj2, i15, E4, E22, aVar62.f27273b, aVar62.f27274c);
                    int K2 = K();
                    if (this.E.f27235a.q()) {
                    }
                    long E32 = c9.w.E(j10);
                    if (!this.E.f27236b.a()) {
                    }
                    i.a aVar72 = this.E.f27236b;
                    this.f6539i.b(11, new j7.f(i11, eVar2, new w.e(obj3, K2, qVar3, obj4, i16, E32, j12, aVar72.f27273b, aVar72.f27274c)));
                }
            } else if (sVar2.f27236b.a()) {
                j11 = sVar2.f27251s;
                r02 = r0(sVar2);
                long E42 = c9.w.E(j11);
                long E222 = c9.w.E(r02);
                i.a aVar622 = sVar2.f27236b;
                w.e eVar22 = new w.e(obj, i14, qVar2, obj2, i15, E42, E222, aVar622.f27273b, aVar622.f27274c);
                int K22 = K();
                if (this.E.f27235a.q()) {
                }
                long E322 = c9.w.E(j10);
                if (!this.E.f27236b.a()) {
                }
                i.a aVar722 = this.E.f27236b;
                this.f6539i.b(11, new j7.f(i11, eVar22, new w.e(obj3, K22, qVar3, obj4, i16, E322, j12, aVar722.f27273b, aVar722.f27274c)));
            } else {
                j11 = bVar2.f6469y + sVar2.f27251s;
                r02 = j11;
                long E422 = c9.w.E(j11);
                long E2222 = c9.w.E(r02);
                i.a aVar6222 = sVar2.f27236b;
                w.e eVar222 = new w.e(obj, i14, qVar2, obj2, i15, E422, E2222, aVar6222.f27273b, aVar6222.f27274c);
                int K222 = K();
                if (this.E.f27235a.q()) {
                }
                long E3222 = c9.w.E(j10);
                if (!this.E.f27236b.a()) {
                }
                i.a aVar7222 = this.E.f27236b;
                this.f6539i.b(11, new j7.f(i11, eVar222, new w.e(obj3, K222, qVar3, obj4, i16, E3222, j12, aVar7222.f27273b, aVar7222.f27274c)));
            }
        }
        if (booleanValue) {
            this.f6539i.b(1, new o7.k(intValue, qVar));
        }
        if (sVar2.f != sVar.f) {
            this.f6539i.b(10, new j.a() { // from class: o7.j
                @Override // c9.j.a
                public final void invoke(Object obj9) {
                    int i21 = r2;
                    s sVar4 = sVar;
                    switch (i21) {
                        case 0:
                            ((w.b) obj9).x(sVar4.f27239e);
                            return;
                        case 1:
                            ((w.b) obj9).l(sVar4.f27246m);
                            return;
                        case 2:
                            ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                            return;
                        case 3:
                            ((w.b) obj9).f0(sVar4.f27247n);
                            return;
                        case 4:
                            ExoPlaybackException exoPlaybackException = sVar4.f;
                            ((w.b) obj9).d0();
                            return;
                        case 5:
                            ((w.b) obj9).q(sVar4.f);
                            return;
                        case 6:
                            ((w.b) obj9).r(sVar4.f27242i.f39353d);
                            return;
                        case 7:
                            w.b bVar3 = (w.b) obj9;
                            boolean z14 = sVar4.f27240g;
                            bVar3.e();
                            bVar3.s(sVar4.f27240g);
                            return;
                        default:
                            ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                            return;
                    }
                }
            });
            if (sVar.f != null) {
                this.f6539i.b(10, new j.a() { // from class: o7.j
                    @Override // c9.j.a
                    public final void invoke(Object obj9) {
                        int i21 = r2;
                        s sVar4 = sVar;
                        switch (i21) {
                            case 0:
                                ((w.b) obj9).x(sVar4.f27239e);
                                return;
                            case 1:
                                ((w.b) obj9).l(sVar4.f27246m);
                                return;
                            case 2:
                                ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                                return;
                            case 3:
                                ((w.b) obj9).f0(sVar4.f27247n);
                                return;
                            case 4:
                                ExoPlaybackException exoPlaybackException = sVar4.f;
                                ((w.b) obj9).d0();
                                return;
                            case 5:
                                ((w.b) obj9).q(sVar4.f);
                                return;
                            case 6:
                                ((w.b) obj9).r(sVar4.f27242i.f39353d);
                                return;
                            case 7:
                                w.b bVar3 = (w.b) obj9;
                                boolean z14 = sVar4.f27240g;
                                bVar3.e();
                                bVar3.s(sVar4.f27240g);
                                return;
                            default:
                                ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                                return;
                        }
                    }
                });
            }
        }
        z8.l lVar = sVar2.f27242i;
        z8.l lVar2 = sVar.f27242i;
        if (lVar != lVar2) {
            this.f6536e.a(lVar2.f39354e);
            this.f6539i.b(2, new dd.a(sVar, 7, new z8.h(sVar.f27242i.f39352c)));
            this.f6539i.b(2, new j.a() { // from class: o7.j
                @Override // c9.j.a
                public final void invoke(Object obj9) {
                    int i21 = r2;
                    s sVar4 = sVar;
                    switch (i21) {
                        case 0:
                            ((w.b) obj9).x(sVar4.f27239e);
                            return;
                        case 1:
                            ((w.b) obj9).l(sVar4.f27246m);
                            return;
                        case 2:
                            ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                            return;
                        case 3:
                            ((w.b) obj9).f0(sVar4.f27247n);
                            return;
                        case 4:
                            ExoPlaybackException exoPlaybackException = sVar4.f;
                            ((w.b) obj9).d0();
                            return;
                        case 5:
                            ((w.b) obj9).q(sVar4.f);
                            return;
                        case 6:
                            ((w.b) obj9).r(sVar4.f27242i.f39353d);
                            return;
                        case 7:
                            w.b bVar3 = (w.b) obj9;
                            boolean z14 = sVar4.f27240g;
                            bVar3.e();
                            bVar3.s(sVar4.f27240g);
                            return;
                        default:
                            ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                            return;
                    }
                }
            });
        }
        if (z13) {
            this.f6539i.b(14, new f0.b(15, this.C));
        }
        if (sVar2.f27240g != sVar.f27240g) {
            this.f6539i.b(3, new j.a() { // from class: o7.j
                @Override // c9.j.a
                public final void invoke(Object obj9) {
                    int i21 = r2;
                    s sVar4 = sVar;
                    switch (i21) {
                        case 0:
                            ((w.b) obj9).x(sVar4.f27239e);
                            return;
                        case 1:
                            ((w.b) obj9).l(sVar4.f27246m);
                            return;
                        case 2:
                            ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                            return;
                        case 3:
                            ((w.b) obj9).f0(sVar4.f27247n);
                            return;
                        case 4:
                            ExoPlaybackException exoPlaybackException = sVar4.f;
                            ((w.b) obj9).d0();
                            return;
                        case 5:
                            ((w.b) obj9).q(sVar4.f);
                            return;
                        case 6:
                            ((w.b) obj9).r(sVar4.f27242i.f39353d);
                            return;
                        case 7:
                            w.b bVar3 = (w.b) obj9;
                            boolean z14 = sVar4.f27240g;
                            bVar3.e();
                            bVar3.s(sVar4.f27240g);
                            return;
                        default:
                            ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                            return;
                    }
                }
            });
        }
        if (sVar2.f27239e != sVar.f27239e || sVar2.f27245l != sVar.f27245l) {
            this.f6539i.b(-1, new j.a() { // from class: o7.j
                @Override // c9.j.a
                public final void invoke(Object obj9) {
                    int i21 = r2;
                    s sVar4 = sVar;
                    switch (i21) {
                        case 0:
                            ((w.b) obj9).x(sVar4.f27239e);
                            return;
                        case 1:
                            ((w.b) obj9).l(sVar4.f27246m);
                            return;
                        case 2:
                            ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                            return;
                        case 3:
                            ((w.b) obj9).f0(sVar4.f27247n);
                            return;
                        case 4:
                            ExoPlaybackException exoPlaybackException = sVar4.f;
                            ((w.b) obj9).d0();
                            return;
                        case 5:
                            ((w.b) obj9).q(sVar4.f);
                            return;
                        case 6:
                            ((w.b) obj9).r(sVar4.f27242i.f39353d);
                            return;
                        case 7:
                            w.b bVar3 = (w.b) obj9;
                            boolean z14 = sVar4.f27240g;
                            bVar3.e();
                            bVar3.s(sVar4.f27240g);
                            return;
                        default:
                            ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                            return;
                    }
                }
            });
        }
        if (sVar2.f27239e != sVar.f27239e) {
            this.f6539i.b(4, new j.a() { // from class: o7.j
                @Override // c9.j.a
                public final void invoke(Object obj9) {
                    int i21 = r2;
                    s sVar4 = sVar;
                    switch (i21) {
                        case 0:
                            ((w.b) obj9).x(sVar4.f27239e);
                            return;
                        case 1:
                            ((w.b) obj9).l(sVar4.f27246m);
                            return;
                        case 2:
                            ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                            return;
                        case 3:
                            ((w.b) obj9).f0(sVar4.f27247n);
                            return;
                        case 4:
                            ExoPlaybackException exoPlaybackException = sVar4.f;
                            ((w.b) obj9).d0();
                            return;
                        case 5:
                            ((w.b) obj9).q(sVar4.f);
                            return;
                        case 6:
                            ((w.b) obj9).r(sVar4.f27242i.f39353d);
                            return;
                        case 7:
                            w.b bVar3 = (w.b) obj9;
                            boolean z14 = sVar4.f27240g;
                            bVar3.e();
                            bVar3.s(sVar4.f27240g);
                            return;
                        default:
                            ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                            return;
                    }
                }
            });
        }
        if (sVar2.f27245l != sVar.f27245l) {
            this.f6539i.b(5, new j.a() { // from class: o7.i
                @Override // c9.j.a
                public final void invoke(Object obj72) {
                    int i202 = r2;
                    int i21 = i10;
                    s sVar32 = sVar;
                    switch (i202) {
                        case 0:
                            e0 e0Var32 = sVar32.f27235a;
                            ((w.b) obj72).L(i21);
                            return;
                        default:
                            ((w.b) obj72).v(i21, sVar32.f27245l);
                            return;
                    }
                }
            });
        }
        if (sVar2.f27246m != sVar.f27246m) {
            this.f6539i.b(6, new j.a() { // from class: o7.j
                @Override // c9.j.a
                public final void invoke(Object obj9) {
                    int i21 = r2;
                    s sVar4 = sVar;
                    switch (i21) {
                        case 0:
                            ((w.b) obj9).x(sVar4.f27239e);
                            return;
                        case 1:
                            ((w.b) obj9).l(sVar4.f27246m);
                            return;
                        case 2:
                            ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                            return;
                        case 3:
                            ((w.b) obj9).f0(sVar4.f27247n);
                            return;
                        case 4:
                            ExoPlaybackException exoPlaybackException = sVar4.f;
                            ((w.b) obj9).d0();
                            return;
                        case 5:
                            ((w.b) obj9).q(sVar4.f);
                            return;
                        case 6:
                            ((w.b) obj9).r(sVar4.f27242i.f39353d);
                            return;
                        case 7:
                            w.b bVar3 = (w.b) obj9;
                            boolean z14 = sVar4.f27240g;
                            bVar3.e();
                            bVar3.s(sVar4.f27240g);
                            return;
                        default:
                            ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                            return;
                    }
                }
            });
        }
        if (s0(sVar2) != s0(sVar)) {
            this.f6539i.b(7, new j.a() { // from class: o7.j
                @Override // c9.j.a
                public final void invoke(Object obj9) {
                    int i21 = r2;
                    s sVar4 = sVar;
                    switch (i21) {
                        case 0:
                            ((w.b) obj9).x(sVar4.f27239e);
                            return;
                        case 1:
                            ((w.b) obj9).l(sVar4.f27246m);
                            return;
                        case 2:
                            ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                            return;
                        case 3:
                            ((w.b) obj9).f0(sVar4.f27247n);
                            return;
                        case 4:
                            ExoPlaybackException exoPlaybackException = sVar4.f;
                            ((w.b) obj9).d0();
                            return;
                        case 5:
                            ((w.b) obj9).q(sVar4.f);
                            return;
                        case 6:
                            ((w.b) obj9).r(sVar4.f27242i.f39353d);
                            return;
                        case 7:
                            w.b bVar3 = (w.b) obj9;
                            boolean z14 = sVar4.f27240g;
                            bVar3.e();
                            bVar3.s(sVar4.f27240g);
                            return;
                        default:
                            ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                            return;
                    }
                }
            });
        }
        if (!sVar2.f27247n.equals(sVar.f27247n)) {
            this.f6539i.b(12, new j.a() { // from class: o7.j
                @Override // c9.j.a
                public final void invoke(Object obj9) {
                    int i21 = r2;
                    s sVar4 = sVar;
                    switch (i21) {
                        case 0:
                            ((w.b) obj9).x(sVar4.f27239e);
                            return;
                        case 1:
                            ((w.b) obj9).l(sVar4.f27246m);
                            return;
                        case 2:
                            ((w.b) obj9).l0(com.google.android.exoplayer2.k.s0(sVar4));
                            return;
                        case 3:
                            ((w.b) obj9).f0(sVar4.f27247n);
                            return;
                        case 4:
                            ExoPlaybackException exoPlaybackException = sVar4.f;
                            ((w.b) obj9).d0();
                            return;
                        case 5:
                            ((w.b) obj9).q(sVar4.f);
                            return;
                        case 6:
                            ((w.b) obj9).r(sVar4.f27242i.f39353d);
                            return;
                        case 7:
                            w.b bVar3 = (w.b) obj9;
                            boolean z14 = sVar4.f27240g;
                            bVar3.e();
                            bVar3.s(sVar4.f27240g);
                            return;
                        default:
                            ((w.b) obj9).V(sVar4.f27239e, sVar4.f27245l);
                            return;
                    }
                }
            });
        }
        if (z10) {
            this.f6539i.b(-1, new com.google.firebase.messaging.j(0));
        }
        z0();
        this.f6539i.a();
        if (sVar2.f27248o != sVar.f27248o) {
            Iterator<j.a> it = this.f6540j.iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        }
        if (sVar2.f27249p != sVar.f27249p) {
            Iterator<j.a> it2 = this.f6540j.iterator();
            while (it2.hasNext()) {
                it2.next().u();
            }
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final void B(int i6) {
        if (this.f6550u != i6) {
            this.f6550u = i6;
            this.f6538h.B.b(11, i6, 0).a();
            d9.p pVar = new d9.p(i6);
            c9.j<w.b> jVar = this.f6539i;
            jVar.b(8, pVar);
            z0();
            jVar.a();
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final long C() {
        return this.f6548s;
    }

    @Override // com.google.android.exoplayer2.w
    public final long D() {
        if (b()) {
            o7.s sVar = this.E;
            e0 e0Var = sVar.f27235a;
            Object obj = sVar.f27236b.f27272a;
            e0.b bVar = this.f6541k;
            e0Var.h(obj, bVar);
            o7.s sVar2 = this.E;
            if (sVar2.f27237c == -9223372036854775807L) {
                return c9.w.E(sVar2.f27235a.n(K(), this.f6355a).G);
            }
            return c9.w.E(bVar.f6469y) + c9.w.E(this.E.f27237c);
        }
        return getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.w
    public final void E(w.d dVar) {
        i0(dVar);
    }

    @Override // com.google.android.exoplayer2.w
    public final long F() {
        if (b()) {
            o7.s sVar = this.E;
            if (sVar.f27244k.equals(sVar.f27236b)) {
                return c9.w.E(this.E.f27250q);
            }
            return getDuration();
        }
        return T();
    }

    @Override // com.google.android.exoplayer2.w
    public final List G() {
        s.b bVar = com.google.common.collect.s.f9446v;
        return l0.f9412y;
    }

    @Override // com.google.android.exoplayer2.w
    public final ExoPlaybackException H() {
        return this.E.f;
    }

    @Override // com.google.android.exoplayer2.w
    public final int I() {
        if (b()) {
            return this.E.f27236b.f27273b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.w
    public final w.a J() {
        return this.B;
    }

    @Override // com.google.android.exoplayer2.w
    public final int K() {
        int o02 = o0();
        if (o02 == -1) {
            return 0;
        }
        return o02;
    }

    @Override // com.google.android.exoplayer2.w
    public final int O() {
        return this.E.f27246m;
    }

    @Override // com.google.android.exoplayer2.w
    public final f0 P() {
        return this.E.f27242i.f39353d;
    }

    @Override // com.google.android.exoplayer2.w
    public final e0 Q() {
        return this.E.f27235a;
    }

    @Override // com.google.android.exoplayer2.w
    public final Looper R() {
        return this.f6546p;
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean S() {
        return this.f6551v;
    }

    @Override // com.google.android.exoplayer2.w
    public final long T() {
        if (this.E.f27235a.q()) {
            return this.G;
        }
        o7.s sVar = this.E;
        if (sVar.f27244k.f27275d != sVar.f27236b.f27275d) {
            return c9.w.E(sVar.f27235a.n(K(), this.f6355a).H);
        }
        long j10 = sVar.f27250q;
        if (this.E.f27244k.a()) {
            o7.s sVar2 = this.E;
            e0.b h10 = sVar2.f27235a.h(sVar2.f27244k.f27272a, this.f6541k);
            long j11 = h10.A.b(this.E.f27244k.f27273b).f6830u;
            if (j11 == Long.MIN_VALUE) {
                j10 = h10.f6468x;
            } else {
                j10 = j11;
            }
        }
        o7.s sVar3 = this.E;
        e0 e0Var = sVar3.f27235a;
        Object obj = sVar3.f27244k.f27272a;
        e0.b bVar = this.f6541k;
        e0Var.h(obj, bVar);
        return c9.w.E(j10 + bVar.f6469y);
    }

    @Override // com.google.android.exoplayer2.w
    public final r Y() {
        return this.C;
    }

    @Override // com.google.android.exoplayer2.w
    public final void Z(List list) {
        w0(l0(list), -1, -9223372036854775807L, true);
    }

    @Override // com.google.android.exoplayer2.w
    public final void a() {
        String str;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = c9.w.f5209e;
        HashSet<String> hashSet = o7.m.f27209a;
        synchronized (o7.m.class) {
            str = o7.m.f27210b;
        }
        StringBuilder n10 = defpackage.e.n(ri.e.c(str, ri.e.c(str2, ri.e.c(hexString, 36))), "Release ", hexString, " [ExoPlayerLib/2.16.0] [", str2);
        n10.append("] [");
        n10.append(str);
        n10.append("]");
        Log.i("ExoPlayerImpl", n10.toString());
        if (!this.f6538h.z()) {
            c9.j<w.b> jVar = this.f6539i;
            jVar.b(10, new com.google.firebase.messaging.j(1));
            jVar.a();
        }
        this.f6539i.c();
        this.f.h();
        p7.n nVar = this.f6545o;
        if (nVar != null) {
            this.f6547q.e(nVar);
        }
        o7.s g5 = this.E.g(1);
        this.E = g5;
        o7.s a10 = g5.a(g5.f27236b);
        this.E = a10;
        a10.f27250q = a10.f27251s;
        this.E.r = 0L;
    }

    @Override // com.google.android.exoplayer2.w
    public final long a0() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean b() {
        return this.E.f27236b.a();
    }

    @Override // com.google.android.exoplayer2.w
    public final v c() {
        return this.E.f27247n;
    }

    @Override // com.google.android.exoplayer2.w
    public final void d(v vVar) {
        if (this.E.f27247n.equals(vVar)) {
            return;
        }
        o7.s f = this.E.f(vVar);
        this.f6552w++;
        this.f6538h.B.k(4, vVar).a();
        A0(f, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.w
    public final long e() {
        return c9.w.E(this.E.r);
    }

    @Override // com.google.android.exoplayer2.w
    public final void f(int i6, long j10) {
        e0 e0Var = this.E.f27235a;
        if (i6 >= 0 && (e0Var.q() || i6 < e0Var.p())) {
            int i10 = 1;
            this.f6552w++;
            if (b()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                m.d dVar = new m.d(this.E);
                dVar.a(1);
                k kVar = this.f6537g.f27208v;
                kVar.getClass();
                kVar.f.f(new g.v(kVar, 28, dVar));
                return;
            }
            if (this.E.f27239e != 1) {
                i10 = 2;
            }
            int K = K();
            o7.s t02 = t0(this.E.g(i10), e0Var, q0(e0Var, i6, j10));
            long y10 = c9.w.y(j10);
            m mVar = this.f6538h;
            mVar.getClass();
            mVar.B.k(3, new m.g(e0Var, i6, y10)).a();
            A0(t02, 0, 1, true, true, 1, n0(t02), K);
            return;
        }
        throw new IllegalSeekPositionException();
    }

    @Override // com.google.android.exoplayer2.w
    public final void g(ArrayList arrayList, int i6, long j10) {
        w0(l0(arrayList), i6, j10, false);
    }

    @Override // com.google.android.exoplayer2.w
    public final long getCurrentPosition() {
        return c9.w.E(n0(this.E));
    }

    @Override // com.google.android.exoplayer2.w
    public final long getDuration() {
        if (b()) {
            o7.s sVar = this.E;
            i.a aVar = sVar.f27236b;
            Object obj = aVar.f27272a;
            e0 e0Var = sVar.f27235a;
            e0.b bVar = this.f6541k;
            e0Var.h(obj, bVar);
            return c9.w.E(bVar.b(aVar.f27273b, aVar.f27274c));
        }
        e0 e0Var2 = this.E.f27235a;
        if (e0Var2.q()) {
            return -9223372036854775807L;
        }
        return c9.w.E(e0Var2.n(K(), this.f6355a).H);
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean h() {
        return this.E.f27245l;
    }

    public final void i0(w.b bVar) {
        c9.j<w.b> jVar = this.f6539i;
        if (!jVar.f5146g) {
            bVar.getClass();
            jVar.f5144d.add(new j.c<>(bVar));
        }
    }

    public final ArrayList j0(int i6, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            t.c cVar = new t.c((com.google.android.exoplayer2.source.i) list.get(i10), this.f6543m);
            arrayList.add(cVar);
            this.f6542l.add(i10 + i6, new a(cVar.f7042a.f6888n, cVar.f7043b));
        }
        this.A = this.A.e(i6, arrayList.size());
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.w
    public final void k(final boolean z10) {
        if (this.f6551v != z10) {
            this.f6551v = z10;
            this.f6538h.B.b(12, z10 ? 1 : 0, 0).a();
            j.a<w.b> aVar = new j.a() { // from class: o7.h
                @Override // c9.j.a
                public final void invoke(Object obj) {
                    ((w.b) obj).C(z10);
                }
            };
            c9.j<w.b> jVar = this.f6539i;
            jVar.b(9, aVar);
            z0();
            jVar.a();
        }
    }

    public final r k0() {
        q j10 = j();
        if (j10 == null) {
            return this.D;
        }
        r rVar = this.D;
        rVar.getClass();
        r.a aVar = new r.a(rVar);
        r rVar2 = j10.f6687x;
        if (rVar2 != null) {
            CharSequence charSequence = rVar2.f6753u;
            if (charSequence != null) {
                aVar.f6759a = charSequence;
            }
            CharSequence charSequence2 = rVar2.f6754v;
            if (charSequence2 != null) {
                aVar.f6760b = charSequence2;
            }
            CharSequence charSequence3 = rVar2.f6755w;
            if (charSequence3 != null) {
                aVar.f6761c = charSequence3;
            }
            CharSequence charSequence4 = rVar2.f6756x;
            if (charSequence4 != null) {
                aVar.f6762d = charSequence4;
            }
            CharSequence charSequence5 = rVar2.f6757y;
            if (charSequence5 != null) {
                aVar.f6763e = charSequence5;
            }
            CharSequence charSequence6 = rVar2.f6758z;
            if (charSequence6 != null) {
                aVar.f = charSequence6;
            }
            CharSequence charSequence7 = rVar2.A;
            if (charSequence7 != null) {
                aVar.f6764g = charSequence7;
            }
            Uri uri = rVar2.B;
            if (uri != null) {
                aVar.f6765h = uri;
            }
            y yVar = rVar2.C;
            if (yVar != null) {
                aVar.f6766i = yVar;
            }
            y yVar2 = rVar2.D;
            if (yVar2 != null) {
                aVar.f6767j = yVar2;
            }
            byte[] bArr = rVar2.E;
            if (bArr != null) {
                aVar.f6768k = (byte[]) bArr.clone();
                aVar.f6769l = rVar2.F;
            }
            Uri uri2 = rVar2.G;
            if (uri2 != null) {
                aVar.f6770m = uri2;
            }
            Integer num = rVar2.H;
            if (num != null) {
                aVar.f6771n = num;
            }
            Integer num2 = rVar2.I;
            if (num2 != null) {
                aVar.f6772o = num2;
            }
            Integer num3 = rVar2.J;
            if (num3 != null) {
                aVar.f6773p = num3;
            }
            Boolean bool = rVar2.K;
            if (bool != null) {
                aVar.f6774q = bool;
            }
            Integer num4 = rVar2.L;
            if (num4 != null) {
                aVar.r = num4;
            }
            Integer num5 = rVar2.M;
            if (num5 != null) {
                aVar.r = num5;
            }
            Integer num6 = rVar2.N;
            if (num6 != null) {
                aVar.f6775s = num6;
            }
            Integer num7 = rVar2.O;
            if (num7 != null) {
                aVar.f6776t = num7;
            }
            Integer num8 = rVar2.P;
            if (num8 != null) {
                aVar.f6777u = num8;
            }
            Integer num9 = rVar2.Q;
            if (num9 != null) {
                aVar.f6778v = num9;
            }
            Integer num10 = rVar2.R;
            if (num10 != null) {
                aVar.f6779w = num10;
            }
            CharSequence charSequence8 = rVar2.S;
            if (charSequence8 != null) {
                aVar.f6780x = charSequence8;
            }
            CharSequence charSequence9 = rVar2.T;
            if (charSequence9 != null) {
                aVar.f6781y = charSequence9;
            }
            CharSequence charSequence10 = rVar2.U;
            if (charSequence10 != null) {
                aVar.f6782z = charSequence10;
            }
            Integer num11 = rVar2.V;
            if (num11 != null) {
                aVar.A = num11;
            }
            Integer num12 = rVar2.W;
            if (num12 != null) {
                aVar.B = num12;
            }
            CharSequence charSequence11 = rVar2.X;
            if (charSequence11 != null) {
                aVar.C = charSequence11;
            }
            CharSequence charSequence12 = rVar2.Y;
            if (charSequence12 != null) {
                aVar.D = charSequence12;
            }
            Bundle bundle = rVar2.Z;
            if (bundle != null) {
                aVar.E = bundle;
            }
        }
        return new r(aVar);
    }

    @Override // com.google.android.exoplayer2.w
    public final void l() {
        int i6;
        o7.s sVar = this.E;
        if (sVar.f27239e != 1) {
            return;
        }
        o7.s e10 = sVar.e(null);
        if (e10.f27235a.q()) {
            i6 = 4;
        } else {
            i6 = 2;
        }
        o7.s g5 = e10.g(i6);
        this.f6552w++;
        this.f6538h.B.g(0).a();
        A0(g5, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final ArrayList l0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            arrayList.add(this.f6544n.d((q) list.get(i6)));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.w
    @Deprecated
    public final void m(boolean z10) {
        y0(true, null);
    }

    public final x m0(x.b bVar) {
        return new x(this.f6538h, bVar, this.E.f27235a, K(), this.f6549t, this.f6538h.D);
    }

    public final long n0(o7.s sVar) {
        if (sVar.f27235a.q()) {
            return c9.w.y(this.G);
        }
        if (sVar.f27236b.a()) {
            return sVar.f27251s;
        }
        e0 e0Var = sVar.f27235a;
        i.a aVar = sVar.f27236b;
        long j10 = sVar.f27251s;
        Object obj = aVar.f27272a;
        e0.b bVar = this.f6541k;
        e0Var.h(obj, bVar);
        return j10 + bVar.f6469y;
    }

    @Override // com.google.android.exoplayer2.w
    public final void o() {
        o7.s v02 = v0(Math.min((int) SubsamplingScaleImageView.TILE_SIZE_AUTO, this.f6542l.size()));
        A0(v02, 0, 1, false, !v02.f27236b.f27272a.equals(this.E.f27236b.f27272a), 4, n0(v02), -1);
    }

    public final int o0() {
        if (this.E.f27235a.q()) {
            return this.F;
        }
        o7.s sVar = this.E;
        return sVar.f27235a.h(sVar.f27236b.f27272a, this.f6541k).f6467w;
    }

    @Override // com.google.android.exoplayer2.w
    public final int p() {
        return this.E.f27239e;
    }

    public final Pair p0(e0 e0Var, o7.t tVar) {
        boolean z10;
        long D = D();
        int i6 = -1;
        if (!e0Var.q() && !tVar.q()) {
            Pair<Object, Long> j10 = e0Var.j(this.f6355a, this.f6541k, K(), c9.w.y(D));
            Object obj = j10.first;
            if (tVar.c(obj) != -1) {
                return j10;
            }
            Object I = m.I(this.f6355a, this.f6541k, this.f6550u, this.f6551v, obj, e0Var, tVar);
            if (I != null) {
                e0.b bVar = this.f6541k;
                tVar.h(I, bVar);
                int i10 = bVar.f6467w;
                return q0(tVar, i10, c9.w.E(tVar.n(i10, this.f6355a).G));
            }
            return q0(tVar, -1, -9223372036854775807L);
        }
        if (!e0Var.q() && tVar.q()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i6 = o0();
        }
        if (z10) {
            D = -9223372036854775807L;
        }
        return q0(tVar, i6, D);
    }

    public final Pair<Object, Long> q0(e0 e0Var, int i6, long j10) {
        if (e0Var.q()) {
            this.F = i6;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.G = j10;
            return null;
        }
        if (i6 == -1 || i6 >= e0Var.p()) {
            i6 = e0Var.b(this.f6551v);
            j10 = c9.w.E(e0Var.n(i6, this.f6355a).G);
        }
        return e0Var.j(this.f6355a, this.f6541k, i6, c9.w.y(j10));
    }

    @Override // com.google.android.exoplayer2.w
    public final int r() {
        return this.f6550u;
    }

    @Override // com.google.android.exoplayer2.w
    public final int s() {
        if (this.E.f27235a.q()) {
            return 0;
        }
        o7.s sVar = this.E;
        return sVar.f27235a.c(sVar.f27236b.f27272a);
    }

    @Override // com.google.android.exoplayer2.w
    public final void stop() {
        y0(false, null);
    }

    public final o7.s t0(o7.s sVar, e0 e0Var, Pair<Object, Long> pair) {
        boolean z10;
        i.a aVar;
        o8.p pVar;
        i.a aVar2;
        z8.l lVar;
        List<g8.a> list;
        int i6;
        long j10;
        if (!e0Var.q() && pair == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        sc.b.q(z10);
        e0 e0Var2 = sVar.f27235a;
        o7.s h10 = sVar.h(e0Var);
        if (e0Var.q()) {
            i.a aVar3 = o7.s.f27234t;
            long y10 = c9.w.y(this.G);
            o8.p pVar2 = o8.p.f27305x;
            z8.l lVar2 = this.f6533b;
            s.b bVar = com.google.common.collect.s.f9446v;
            o7.s a10 = h10.b(aVar3, y10, y10, y10, 0L, pVar2, lVar2, l0.f9412y).a(aVar3);
            a10.f27250q = a10.f27251s;
            return a10;
        }
        Object obj = h10.f27236b.f27272a;
        int i10 = c9.w.f5205a;
        boolean z11 = !obj.equals(pair.first);
        if (z11) {
            aVar = new i.a(pair.first);
        } else {
            aVar = h10.f27236b;
        }
        i.a aVar4 = aVar;
        long longValue = ((Long) pair.second).longValue();
        long y11 = c9.w.y(D());
        if (!e0Var2.q()) {
            y11 -= e0Var2.h(obj, this.f6541k).f6469y;
        }
        if (!z11 && longValue >= y11) {
            if (i6 == 0) {
                int c10 = e0Var.c(h10.f27244k.f27272a);
                if (c10 == -1 || e0Var.g(c10, this.f6541k, false).f6467w != e0Var.h(aVar4.f27272a, this.f6541k).f6467w) {
                    e0Var.h(aVar4.f27272a, this.f6541k);
                    if (aVar4.a()) {
                        j10 = this.f6541k.b(aVar4.f27273b, aVar4.f27274c);
                    } else {
                        j10 = this.f6541k.f6468x;
                    }
                    h10 = h10.b(aVar4, h10.f27251s, h10.f27251s, h10.f27238d, j10 - h10.f27251s, h10.f27241h, h10.f27242i, h10.f27243j).a(aVar4);
                    h10.f27250q = j10;
                }
            } else {
                sc.b.C(!aVar4.a());
                long max = Math.max(0L, h10.r - (longValue - y11));
                long j11 = h10.f27250q;
                if (h10.f27244k.equals(h10.f27236b)) {
                    j11 = longValue + max;
                }
                h10 = h10.b(aVar4, longValue, longValue, longValue, max, h10.f27241h, h10.f27242i, h10.f27243j);
                h10.f27250q = j11;
            }
            return h10;
        }
        sc.b.C(!aVar4.a());
        if (z11) {
            pVar = o8.p.f27305x;
        } else {
            pVar = h10.f27241h;
        }
        o8.p pVar3 = pVar;
        if (z11) {
            aVar2 = aVar4;
            lVar = this.f6533b;
        } else {
            aVar2 = aVar4;
            lVar = h10.f27242i;
        }
        z8.l lVar3 = lVar;
        if (z11) {
            s.b bVar2 = com.google.common.collect.s.f9446v;
            list = l0.f9412y;
        } else {
            list = h10.f27243j;
        }
        o7.s a11 = h10.b(aVar2, longValue, longValue, longValue, 0L, pVar3, lVar3, list).a(aVar2);
        a11.f27250q = longValue;
        return a11;
    }

    @Override // com.google.android.exoplayer2.w
    public final d9.q u() {
        return d9.q.f12712y;
    }

    public final void u0(w.b bVar) {
        c9.j<w.b> jVar = this.f6539i;
        CopyOnWriteArraySet<j.c<w.b>> copyOnWriteArraySet = jVar.f5144d;
        Iterator<j.c<w.b>> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            j.c<w.b> next = it.next();
            if (next.f5147a.equals(bVar)) {
                next.f5150d = true;
                if (next.f5149c) {
                    c9.h b10 = next.f5148b.b();
                    jVar.f5143c.f(next.f5147a, b10);
                }
                copyOnWriteArraySet.remove(next);
            }
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final void v(w.d dVar) {
        u0(dVar);
    }

    public final o7.s v0(int i6) {
        boolean z10;
        ArrayList arrayList = this.f6542l;
        boolean z11 = true;
        if (i6 >= 0 && i6 <= arrayList.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        int K = K();
        e0 e0Var = this.E.f27235a;
        int size = arrayList.size();
        this.f6552w++;
        for (int i10 = i6 - 1; i10 >= 0; i10--) {
            arrayList.remove(i10);
        }
        this.A = this.A.b(i6);
        o7.t tVar = new o7.t(arrayList, this.A);
        o7.s t02 = t0(this.E, tVar, p0(e0Var, tVar));
        int i11 = t02.f27239e;
        if ((i11 == 1 || i11 == 4 || i6 <= 0 || i6 != size || K < t02.f27235a.p()) ? false : false) {
            t02 = t02.g(4);
        }
        this.f6538h.B.c(this.A, 20, 0, i6).a();
        return t02;
    }

    @Override // com.google.android.exoplayer2.w
    public final int w() {
        if (b()) {
            return this.E.f27236b.f27274c;
        }
        return -1;
    }

    public final void w0(List<com.google.android.exoplayer2.source.i> list, int i6, long j10, boolean z10) {
        long j11;
        int i10;
        int i11;
        int i12 = i6;
        int o02 = o0();
        long currentPosition = getCurrentPosition();
        boolean z11 = true;
        this.f6552w++;
        ArrayList arrayList = this.f6542l;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i13 = size - 1; i13 >= 0; i13--) {
                arrayList.remove(i13);
            }
            this.A = this.A.b(size);
        }
        ArrayList j02 = j0(0, list);
        o7.t tVar = new o7.t(arrayList, this.A);
        boolean q10 = tVar.q();
        int i14 = tVar.f27252z;
        if (!q10 && i12 >= i14) {
            throw new IllegalSeekPositionException();
        }
        if (z10) {
            i12 = tVar.b(this.f6551v);
            j11 = -9223372036854775807L;
        } else if (i12 == -1) {
            i10 = o02;
            j11 = currentPosition;
            o7.s t02 = t0(this.E, tVar, q0(tVar, i10, j11));
            i11 = t02.f27239e;
            if (i10 != -1 && i11 != 1) {
                i11 = (!tVar.q() || i10 >= i14) ? 4 : 2;
            }
            o7.s g5 = t02.g(i11);
            long y10 = c9.w.y(j11);
            o8.l lVar = this.A;
            m mVar = this.f6538h;
            mVar.getClass();
            mVar.B.k(17, new m.a(j02, lVar, i10, y10)).a();
            A0(g5, 0, 1, false, (!this.E.f27236b.f27272a.equals(g5.f27236b.f27272a) || this.E.f27235a.q()) ? false : false, 4, n0(g5), -1);
        } else {
            j11 = j10;
        }
        i10 = i12;
        o7.s t022 = t0(this.E, tVar, q0(tVar, i10, j11));
        i11 = t022.f27239e;
        if (i10 != -1) {
            if (tVar.q()) {
            }
        }
        o7.s g52 = t022.g(i11);
        long y102 = c9.w.y(j11);
        o8.l lVar2 = this.A;
        m mVar2 = this.f6538h;
        mVar2.getClass();
        mVar2.B.k(17, new m.a(j02, lVar2, i10, y102)).a();
        A0(g52, 0, 1, false, (!this.E.f27236b.f27272a.equals(g52.f27236b.f27272a) || this.E.f27235a.q()) ? false : false, 4, n0(g52), -1);
    }

    public final void x0(int i6, int i10, boolean z10) {
        o7.s sVar = this.E;
        if (sVar.f27245l == z10 && sVar.f27246m == i6) {
            return;
        }
        this.f6552w++;
        o7.s d10 = sVar.d(i6, z10);
        m mVar = this.f6538h;
        mVar.getClass();
        mVar.B.b(1, z10 ? 1 : 0, i6).a();
        A0(d10, 0, i10, false, false, 5, -9223372036854775807L, -1);
    }

    public final void y0(boolean z10, ExoPlaybackException exoPlaybackException) {
        o7.s a10;
        boolean z11;
        if (z10) {
            a10 = v0(this.f6542l.size()).e(null);
        } else {
            o7.s sVar = this.E;
            a10 = sVar.a(sVar.f27236b);
            a10.f27250q = a10.f27251s;
            a10.r = 0L;
        }
        o7.s g5 = a10.g(1);
        if (exoPlaybackException != null) {
            g5 = g5.e(exoPlaybackException);
        }
        o7.s sVar2 = g5;
        this.f6552w++;
        this.f6538h.B.g(6).a();
        if (sVar2.f27235a.q() && !this.E.f27235a.q()) {
            z11 = true;
        } else {
            z11 = false;
        }
        A0(sVar2, 0, 1, false, z11, 4, n0(sVar2), -1);
    }

    @Override // com.google.android.exoplayer2.w
    public final void z(boolean z10) {
        x0(0, 1, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        w.a aVar;
        boolean z18;
        boolean z19;
        w.a aVar2 = this.B;
        w.a.C0141a c0141a = new w.a.C0141a();
        c9.h hVar = this.f6534c.f7198u;
        h.a aVar3 = c0141a.f7199a;
        aVar3.getClass();
        boolean z20 = false;
        for (int i6 = 0; i6 < hVar.b(); i6++) {
            aVar3.a(hVar.a(i6));
        }
        c0141a.a(4, !b());
        if (e0() && !b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c0141a.a(5, z10);
        if (c0() != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !b()) {
            z12 = true;
        } else {
            z12 = false;
        }
        c0141a.a(6, z12);
        if (!this.E.f27235a.q()) {
            if (c0() != -1) {
                z19 = true;
            } else {
                z19 = false;
            }
            if ((z19 || !d0() || e0()) && !b()) {
                z13 = true;
                c0141a.a(7, z13);
                if (b0() == -1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14 && !b()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                c0141a.a(8, z15);
                if (!this.E.f27235a.q()) {
                    if (b0() != -1) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((z18 || (d0() && N())) && !b()) {
                        z16 = true;
                        c0141a.a(9, z16);
                        c0141a.a(10, !b());
                        if (!e0() && !b()) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        c0141a.a(11, z17);
                        if (e0() && !b()) {
                            z20 = true;
                        }
                        c0141a.a(12, z20);
                        aVar = new w.a(aVar3.b());
                        this.B = aVar;
                        if (!aVar.equals(aVar2)) {
                            this.f6539i.b(13, new o7.l(this, 1));
                            return;
                        }
                        return;
                    }
                }
                z16 = false;
                c0141a.a(9, z16);
                c0141a.a(10, !b());
                if (!e0()) {
                }
                z17 = false;
                c0141a.a(11, z17);
                if (e0()) {
                    z20 = true;
                }
                c0141a.a(12, z20);
                aVar = new w.a(aVar3.b());
                this.B = aVar;
                if (!aVar.equals(aVar2)) {
                }
            }
        }
        z13 = false;
        c0141a.a(7, z13);
        if (b0() == -1) {
        }
        if (!z14) {
        }
        z15 = false;
        c0141a.a(8, z15);
        if (!this.E.f27235a.q()) {
        }
        z16 = false;
        c0141a.a(9, z16);
        c0141a.a(10, !b());
        if (!e0()) {
        }
        z17 = false;
        c0141a.a(11, z17);
        if (e0()) {
        }
        c0141a.a(12, z20);
        aVar = new w.a(aVar3.b());
        this.B = aVar;
        if (!aVar.equals(aVar2)) {
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final void n() {
    }

    @Override // com.google.android.exoplayer2.w
    public final void M(SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.w
    public final void W(TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.w
    public final void t(TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.w
    public final void x(SurfaceView surfaceView) {
    }
}
