package com.google.android.exoplayer2.source;

import c9.w;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.h;
import o7.x;
/* compiled from: ClippingMediaPeriod.java */
/* loaded from: classes.dex */
public final class b implements h, h.a {
    public ClippingMediaSource.IllegalClippingException A;

    /* renamed from: u  reason: collision with root package name */
    public final h f6836u;

    /* renamed from: v  reason: collision with root package name */
    public h.a f6837v;

    /* renamed from: w  reason: collision with root package name */
    public a[] f6838w = new a[0];

    /* renamed from: x  reason: collision with root package name */
    public long f6839x;

    /* renamed from: y  reason: collision with root package name */
    public long f6840y;

    /* renamed from: z  reason: collision with root package name */
    public long f6841z;

    /* compiled from: ClippingMediaPeriod.java */
    /* loaded from: classes.dex */
    public final class a implements o8.k {

        /* renamed from: u  reason: collision with root package name */
        public final o8.k f6842u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f6843v;

        public a(o8.k kVar) {
            this.f6842u = kVar;
        }

        @Override // o8.k
        public final void b() {
            this.f6842u.b();
        }

        @Override // o8.k
        public final int c(long j10) {
            if (b.this.e()) {
                return -3;
            }
            return this.f6842u.c(j10);
        }

        @Override // o8.k
        public final int f(androidx.appcompat.widget.l lVar, DecoderInputBuffer decoderInputBuffer, int i6) {
            b bVar = b.this;
            if (bVar.e()) {
                return -3;
            }
            if (this.f6843v) {
                decoderInputBuffer.f30528u = 4;
                return -4;
            }
            int f = this.f6842u.f(lVar, decoderInputBuffer, i6);
            if (f == -5) {
                com.google.android.exoplayer2.n nVar = (com.google.android.exoplayer2.n) lVar.f1472w;
                nVar.getClass();
                int i10 = nVar.V;
                int i11 = nVar.W;
                if (i10 != 0 || i11 != 0) {
                    if (bVar.f6840y != 0) {
                        i10 = 0;
                    }
                    if (bVar.f6841z != Long.MIN_VALUE) {
                        i11 = 0;
                    }
                    n.a b10 = nVar.b();
                    b10.A = i10;
                    b10.B = i11;
                    lVar.f1472w = b10.a();
                }
                return -5;
            }
            long j10 = bVar.f6841z;
            if (j10 != Long.MIN_VALUE && ((f == -4 && decoderInputBuffer.f6362y >= j10) || (f == -3 && bVar.g() == Long.MIN_VALUE && !decoderInputBuffer.f6361x))) {
                decoderInputBuffer.n();
                decoderInputBuffer.f30528u = 4;
                this.f6843v = true;
                return -4;
            }
            return f;
        }

        @Override // o8.k
        public final boolean isReady() {
            if (!b.this.e() && this.f6842u.isReady()) {
                return true;
            }
            return false;
        }
    }

    public b(h hVar, boolean z10, long j10, long j11) {
        long j12;
        this.f6836u = hVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f6839x = j12;
        this.f6840y = j10;
        this.f6841z = j11;
    }

    @Override // com.google.android.exoplayer2.source.q.a
    public final void a(h hVar) {
        h.a aVar = this.f6837v;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public final void b(h hVar) {
        if (this.A != null) {
            return;
        }
        h.a aVar = this.f6837v;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long c() {
        long c10 = this.f6836u.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.f6841z;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean d(long j10) {
        return this.f6836u.d(j10);
    }

    public final boolean e() {
        if (this.f6839x != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean f() {
        return this.f6836u.f();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long g() {
        long g5 = this.f6836u.g();
        if (g5 != Long.MIN_VALUE) {
            long j10 = this.f6841z;
            if (j10 == Long.MIN_VALUE || g5 < j10) {
                return g5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final void h(long j10) {
        this.f6836u.h(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r1 > r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // com.google.android.exoplayer2.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(z8.d[] dVarArr, boolean[] zArr, o8.k[] kVarArr, boolean[] zArr2, long j10) {
        long j11;
        boolean z10;
        this.f6838w = new a[kVarArr.length];
        o8.k[] kVarArr2 = new o8.k[kVarArr.length];
        int i6 = 0;
        while (true) {
            o8.k kVar = null;
            if (i6 >= kVarArr.length) {
                break;
            }
            a[] aVarArr = this.f6838w;
            a aVar = (a) kVarArr[i6];
            aVarArr[i6] = aVar;
            if (aVar != null) {
                kVar = aVar.f6842u;
            }
            kVarArr2[i6] = kVar;
            i6++;
        }
        long k10 = this.f6836u.k(dVarArr, zArr, kVarArr2, zArr2, j10);
        boolean z11 = true;
        if (e()) {
            long j12 = this.f6840y;
            if (j10 == j12) {
                if (j12 != 0) {
                    for (z8.d dVar : dVarArr) {
                        if (dVar != null) {
                            com.google.android.exoplayer2.n i10 = dVar.i();
                            if (!c9.l.a(i10.F, i10.C)) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    j11 = k10;
                    this.f6839x = j11;
                    if (k10 != j10) {
                        if (k10 >= this.f6840y) {
                            long j13 = this.f6841z;
                            if (j13 != Long.MIN_VALUE) {
                            }
                        }
                        z11 = false;
                    }
                    sc.b.C(z11);
                    for (int i11 = 0; i11 < kVarArr.length; i11++) {
                        o8.k kVar2 = kVarArr2[i11];
                        if (kVar2 == null) {
                            this.f6838w[i11] = null;
                        } else {
                            a[] aVarArr2 = this.f6838w;
                            a aVar2 = aVarArr2[i11];
                            if (aVar2 == null || aVar2.f6842u != kVar2) {
                                aVarArr2[i11] = new a(kVar2);
                            }
                        }
                        kVarArr[i11] = this.f6838w[i11];
                    }
                    return k10;
                }
            }
        }
        j11 = -9223372036854775807L;
        this.f6839x = j11;
        if (k10 != j10) {
        }
        sc.b.C(z11);
        while (i11 < kVarArr.length) {
        }
        return k10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void l() {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.A;
        if (illegalClippingException == null) {
            this.f6836u.l();
            return;
        }
        throw illegalClippingException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0 > r7) goto L18;
     */
    @Override // com.google.android.exoplayer2.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m(long j10) {
        a[] aVarArr;
        this.f6839x = -9223372036854775807L;
        boolean z10 = false;
        for (a aVar : this.f6838w) {
            if (aVar != null) {
                aVar.f6843v = false;
            }
        }
        long m10 = this.f6836u.m(j10);
        if (m10 != j10) {
            if (m10 >= this.f6840y) {
                long j11 = this.f6841z;
                if (j11 != Long.MIN_VALUE) {
                }
            }
            sc.b.C(z10);
            return m10;
        }
        z10 = true;
        sc.b.C(z10);
        return m10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void r(boolean z10, long j10) {
        this.f6836u.r(z10, j10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long s() {
        boolean z10;
        if (e()) {
            long j10 = this.f6839x;
            this.f6839x = -9223372036854775807L;
            long s10 = s();
            if (s10 != -9223372036854775807L) {
                return s10;
            }
            return j10;
        }
        long s11 = this.f6836u.s();
        if (s11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = true;
        if (s11 >= this.f6840y) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        long j11 = this.f6841z;
        if (j11 != Long.MIN_VALUE && s11 > j11) {
            z11 = false;
        }
        sc.b.C(z11);
        return s11;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void t(h.a aVar, long j10) {
        this.f6837v = aVar;
        this.f6836u.t(this, j10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public final o8.p u() {
        return this.f6836u.u();
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long w(long j10, x xVar) {
        long j11;
        long j12 = this.f6840y;
        if (j10 == j12) {
            return j12;
        }
        long i6 = w.i(xVar.f27256a, 0L, j10 - j12);
        long j13 = xVar.f27257b;
        long j14 = this.f6841z;
        if (j14 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j14 - j10;
        }
        long i10 = w.i(j13, 0L, j11);
        if (i6 != xVar.f27256a || i10 != xVar.f27257b) {
            xVar = new x(i6, i10);
        }
        return this.f6836u.w(j10, xVar);
    }
}
