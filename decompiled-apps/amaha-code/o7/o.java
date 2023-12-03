package o7;

import android.util.Pair;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.t;
/* compiled from: MediaPeriodHolder.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.exoplayer2.source.h f27211a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f27212b;

    /* renamed from: c  reason: collision with root package name */
    public final o8.k[] f27213c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27214d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27215e;
    public p f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f27216g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f27217h;

    /* renamed from: i  reason: collision with root package name */
    public final u[] f27218i;

    /* renamed from: j  reason: collision with root package name */
    public final z8.k f27219j;

    /* renamed from: k  reason: collision with root package name */
    public final com.google.android.exoplayer2.t f27220k;

    /* renamed from: l  reason: collision with root package name */
    public o f27221l;

    /* renamed from: m  reason: collision with root package name */
    public o8.p f27222m;

    /* renamed from: n  reason: collision with root package name */
    public z8.l f27223n;

    /* renamed from: o  reason: collision with root package name */
    public long f27224o;

    public o(u[] uVarArr, long j10, z8.k kVar, b9.i iVar, com.google.android.exoplayer2.t tVar, p pVar, z8.l lVar) {
        this.f27218i = uVarArr;
        this.f27224o = j10;
        this.f27219j = kVar;
        this.f27220k = tVar;
        i.a aVar = pVar.f27225a;
        this.f27212b = aVar.f27272a;
        this.f = pVar;
        this.f27222m = o8.p.f27305x;
        this.f27223n = lVar;
        this.f27213c = new o8.k[uVarArr.length];
        this.f27217h = new boolean[uVarArr.length];
        long j11 = pVar.f27228d;
        tVar.getClass();
        int i6 = com.google.android.exoplayer2.a.f6162y;
        Pair pair = (Pair) aVar.f27272a;
        Object obj = pair.first;
        i.a b10 = aVar.b(pair.second);
        t.c cVar = (t.c) tVar.f7027c.get(obj);
        cVar.getClass();
        tVar.f7031h.add(cVar);
        t.b bVar = tVar.f7030g.get(cVar);
        if (bVar != null) {
            bVar.f7039a.n(bVar.f7040b);
        }
        cVar.f7044c.add(b10);
        com.google.android.exoplayer2.source.h a10 = cVar.f7042a.a(b10, iVar, pVar.f27226b);
        tVar.f7026b.put(a10, cVar);
        tVar.c();
        this.f27211a = j11 != -9223372036854775807L ? new com.google.android.exoplayer2.source.b(a10, true, 0L, j11) : a10;
    }

    public final long a(z8.l lVar, long j10, boolean z10, boolean[] zArr) {
        u[] uVarArr;
        o8.k[] kVarArr;
        boolean z11;
        int i6 = 0;
        while (true) {
            boolean z12 = true;
            if (i6 >= lVar.f39350a) {
                break;
            }
            if (z10 || !lVar.a(this.f27223n, i6)) {
                z12 = false;
            }
            this.f27217h[i6] = z12;
            i6++;
        }
        int i10 = 0;
        while (true) {
            uVarArr = this.f27218i;
            int length = uVarArr.length;
            kVarArr = this.f27213c;
            if (i10 >= length) {
                break;
            }
            if (((com.google.android.exoplayer2.e) uVarArr[i10]).f6458u == -2) {
                kVarArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f27223n = lVar;
        c();
        long k10 = this.f27211a.k(lVar.f39352c, this.f27217h, this.f27213c, zArr, j10);
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            if (((com.google.android.exoplayer2.e) uVarArr[i11]).f6458u == -2 && this.f27223n.b(i11)) {
                kVarArr[i11] = new sc.b();
            }
        }
        this.f27215e = false;
        for (int i12 = 0; i12 < kVarArr.length; i12++) {
            if (kVarArr[i12] != null) {
                sc.b.C(lVar.b(i12));
                if (((com.google.android.exoplayer2.e) uVarArr[i12]).f6458u != -2) {
                    this.f27215e = true;
                }
            } else {
                if (lVar.f39352c[i12] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sc.b.C(z11);
            }
        }
        return k10;
    }

    public final void b() {
        boolean z10;
        int i6 = 0;
        if (this.f27221l == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        while (true) {
            z8.l lVar = this.f27223n;
            if (i6 < lVar.f39350a) {
                boolean b10 = lVar.b(i6);
                z8.d dVar = this.f27223n.f39352c[i6];
                if (b10 && dVar != null) {
                    dVar.e();
                }
                i6++;
            } else {
                return;
            }
        }
    }

    public final void c() {
        boolean z10;
        int i6 = 0;
        if (this.f27221l == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        while (true) {
            z8.l lVar = this.f27223n;
            if (i6 < lVar.f39350a) {
                boolean b10 = lVar.b(i6);
                z8.d dVar = this.f27223n.f39352c[i6];
                if (b10 && dVar != null) {
                    dVar.g();
                }
                i6++;
            } else {
                return;
            }
        }
    }

    public final long d() {
        long j10;
        if (!this.f27214d) {
            return this.f.f27226b;
        }
        if (this.f27215e) {
            j10 = this.f27211a.g();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f.f27229e;
        }
        return j10;
    }

    public final long e() {
        return this.f.f27226b + this.f27224o;
    }

    public final void f() {
        b();
        com.google.android.exoplayer2.source.h hVar = this.f27211a;
        try {
            boolean z10 = hVar instanceof com.google.android.exoplayer2.source.b;
            com.google.android.exoplayer2.t tVar = this.f27220k;
            if (z10) {
                tVar.f(((com.google.android.exoplayer2.source.b) hVar).f6836u);
            } else {
                tVar.f(hVar);
            }
        } catch (RuntimeException e10) {
            ca.a.Q("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final z8.l g(float f, e0 e0Var) {
        z8.d[] dVarArr;
        o8.p pVar = this.f27222m;
        i.a aVar = this.f.f27225a;
        z8.l b10 = this.f27219j.b(this.f27218i, pVar);
        for (z8.d dVar : b10.f39352c) {
            if (dVar != null) {
                dVar.d();
            }
        }
        return b10;
    }

    public final void h() {
        com.google.android.exoplayer2.source.h hVar = this.f27211a;
        if (hVar instanceof com.google.android.exoplayer2.source.b) {
            long j10 = this.f.f27228d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            com.google.android.exoplayer2.source.b bVar = (com.google.android.exoplayer2.source.b) hVar;
            bVar.f6840y = 0L;
            bVar.f6841z = j10;
        }
    }
}
