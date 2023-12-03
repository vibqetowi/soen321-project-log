package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.h;
import g.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
/* compiled from: MergingMediaPeriod.java */
/* loaded from: classes.dex */
public final class k implements h, h.a {
    public h[] A;
    public x B;

    /* renamed from: u  reason: collision with root package name */
    public final h[] f6902u;

    /* renamed from: v  reason: collision with root package name */
    public final IdentityHashMap<o8.k, Integer> f6903v;

    /* renamed from: w  reason: collision with root package name */
    public final tr.r f6904w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<h> f6905x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public h.a f6906y;

    /* renamed from: z  reason: collision with root package name */
    public o8.p f6907z;

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class a implements h, h.a {

        /* renamed from: u  reason: collision with root package name */
        public final h f6908u;

        /* renamed from: v  reason: collision with root package name */
        public final long f6909v;

        /* renamed from: w  reason: collision with root package name */
        public h.a f6910w;

        public a(h hVar, long j10) {
            this.f6908u = hVar;
            this.f6909v = j10;
        }

        @Override // com.google.android.exoplayer2.source.q.a
        public final void a(h hVar) {
            h.a aVar = this.f6910w;
            aVar.getClass();
            aVar.a(this);
        }

        @Override // com.google.android.exoplayer2.source.h.a
        public final void b(h hVar) {
            h.a aVar = this.f6910w;
            aVar.getClass();
            aVar.b(this);
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public final long c() {
            long c10 = this.f6908u.c();
            if (c10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f6909v + c10;
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public final boolean d(long j10) {
            return this.f6908u.d(j10 - this.f6909v);
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public final boolean f() {
            return this.f6908u.f();
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public final long g() {
            long g5 = this.f6908u.g();
            if (g5 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f6909v + g5;
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public final void h(long j10) {
            this.f6908u.h(j10 - this.f6909v);
        }

        @Override // com.google.android.exoplayer2.source.h
        public final long k(z8.d[] dVarArr, boolean[] zArr, o8.k[] kVarArr, boolean[] zArr2, long j10) {
            o8.k[] kVarArr2 = new o8.k[kVarArr.length];
            int i6 = 0;
            while (true) {
                o8.k kVar = null;
                if (i6 >= kVarArr.length) {
                    break;
                }
                b bVar = (b) kVarArr[i6];
                if (bVar != null) {
                    kVar = bVar.f6911u;
                }
                kVarArr2[i6] = kVar;
                i6++;
            }
            h hVar = this.f6908u;
            long j11 = this.f6909v;
            long k10 = hVar.k(dVarArr, zArr, kVarArr2, zArr2, j10 - j11);
            for (int i10 = 0; i10 < kVarArr.length; i10++) {
                o8.k kVar2 = kVarArr2[i10];
                if (kVar2 == null) {
                    kVarArr[i10] = null;
                } else {
                    o8.k kVar3 = kVarArr[i10];
                    if (kVar3 == null || ((b) kVar3).f6911u != kVar2) {
                        kVarArr[i10] = new b(kVar2, j11);
                    }
                }
            }
            return k10 + j11;
        }

        @Override // com.google.android.exoplayer2.source.h
        public final void l() {
            this.f6908u.l();
        }

        @Override // com.google.android.exoplayer2.source.h
        public final long m(long j10) {
            long j11 = this.f6909v;
            return this.f6908u.m(j10 - j11) + j11;
        }

        @Override // com.google.android.exoplayer2.source.h
        public final void r(boolean z10, long j10) {
            this.f6908u.r(z10, j10 - this.f6909v);
        }

        @Override // com.google.android.exoplayer2.source.h
        public final long s() {
            long s10 = this.f6908u.s();
            if (s10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f6909v + s10;
        }

        @Override // com.google.android.exoplayer2.source.h
        public final void t(h.a aVar, long j10) {
            this.f6910w = aVar;
            this.f6908u.t(this, j10 - this.f6909v);
        }

        @Override // com.google.android.exoplayer2.source.h
        public final o8.p u() {
            return this.f6908u.u();
        }

        @Override // com.google.android.exoplayer2.source.h
        public final long w(long j10, o7.x xVar) {
            long j11 = this.f6909v;
            return this.f6908u.w(j10 - j11, xVar) + j11;
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class b implements o8.k {

        /* renamed from: u  reason: collision with root package name */
        public final o8.k f6911u;

        /* renamed from: v  reason: collision with root package name */
        public final long f6912v;

        public b(o8.k kVar, long j10) {
            this.f6911u = kVar;
            this.f6912v = j10;
        }

        @Override // o8.k
        public final void b() {
            this.f6911u.b();
        }

        @Override // o8.k
        public final int c(long j10) {
            return this.f6911u.c(j10 - this.f6912v);
        }

        @Override // o8.k
        public final int f(androidx.appcompat.widget.l lVar, DecoderInputBuffer decoderInputBuffer, int i6) {
            int f = this.f6911u.f(lVar, decoderInputBuffer, i6);
            if (f == -4) {
                decoderInputBuffer.f6362y = Math.max(0L, decoderInputBuffer.f6362y + this.f6912v);
            }
            return f;
        }

        @Override // o8.k
        public final boolean isReady() {
            return this.f6911u.isReady();
        }
    }

    public k(tr.r rVar, long[] jArr, h... hVarArr) {
        this.f6904w = rVar;
        this.f6902u = hVarArr;
        rVar.getClass();
        this.B = new x(9, new q[0]);
        this.f6903v = new IdentityHashMap<>();
        this.A = new h[0];
        for (int i6 = 0; i6 < hVarArr.length; i6++) {
            long j10 = jArr[i6];
            if (j10 != 0) {
                this.f6902u[i6] = new a(hVarArr[i6], j10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.q.a
    public final void a(h hVar) {
        h.a aVar = this.f6906y;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public final void b(h hVar) {
        ArrayList<h> arrayList = this.f6905x;
        arrayList.remove(hVar);
        if (!arrayList.isEmpty()) {
            return;
        }
        h[] hVarArr = this.f6902u;
        int i6 = 0;
        for (h hVar2 : hVarArr) {
            i6 += hVar2.u().f27306u;
        }
        o8.o[] oVarArr = new o8.o[i6];
        int i10 = 0;
        for (h hVar3 : hVarArr) {
            o8.p u10 = hVar3.u();
            int i11 = u10.f27306u;
            int i12 = 0;
            while (i12 < i11) {
                oVarArr[i10] = u10.f27307v[i12];
                i12++;
                i10++;
            }
        }
        this.f6907z = new o8.p(oVarArr);
        h.a aVar = this.f6906y;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long c() {
        return this.B.c();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean d(long j10) {
        ArrayList<h> arrayList = this.f6905x;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).d(j10);
            }
            return false;
        }
        return this.B.d(j10);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final boolean f() {
        return this.B.f();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final long g() {
        return this.B.g();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public final void h(long j10) {
        this.B.h(j10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long k(z8.d[] dVarArr, boolean[] zArr, o8.k[] kVarArr, boolean[] zArr2, long j10) {
        IdentityHashMap<o8.k, Integer> identityHashMap;
        h[] hVarArr;
        o8.k kVar;
        z8.d dVar;
        Integer num;
        int intValue;
        int[] iArr = new int[dVarArr.length];
        int[] iArr2 = new int[dVarArr.length];
        int i6 = 0;
        while (true) {
            int length = dVarArr.length;
            identityHashMap = this.f6903v;
            hVarArr = this.f6902u;
            if (i6 >= length) {
                break;
            }
            o8.k kVar2 = kVarArr[i6];
            if (kVar2 == null) {
                num = null;
            } else {
                num = identityHashMap.get(kVar2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i6] = intValue;
            iArr2[i6] = -1;
            z8.d dVar2 = dVarArr[i6];
            if (dVar2 != null) {
                o8.o b10 = dVar2.b();
                int i10 = 0;
                while (true) {
                    if (i10 >= hVarArr.length) {
                        break;
                    } else if (hVarArr[i10].u().b(b10) != -1) {
                        iArr2[i6] = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            i6++;
        }
        identityHashMap.clear();
        int length2 = dVarArr.length;
        o8.k[] kVarArr2 = new o8.k[length2];
        o8.k[] kVarArr3 = new o8.k[dVarArr.length];
        z8.d[] dVarArr2 = new z8.d[dVarArr.length];
        ArrayList arrayList = new ArrayList(hVarArr.length);
        long j11 = j10;
        int i11 = 0;
        while (i11 < hVarArr.length) {
            for (int i12 = 0; i12 < dVarArr.length; i12++) {
                if (iArr[i12] == i11) {
                    kVar = kVarArr[i12];
                } else {
                    kVar = null;
                }
                kVarArr3[i12] = kVar;
                if (iArr2[i12] == i11) {
                    dVar = dVarArr[i12];
                } else {
                    dVar = null;
                }
                dVarArr2[i12] = dVar;
            }
            int i13 = i11;
            ArrayList arrayList2 = arrayList;
            z8.d[] dVarArr3 = dVarArr2;
            long k10 = hVarArr[i11].k(dVarArr2, zArr, kVarArr3, zArr2, j11);
            if (i13 == 0) {
                j11 = k10;
            } else if (k10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < dVarArr.length; i14++) {
                boolean z11 = true;
                if (iArr2[i14] == i13) {
                    o8.k kVar3 = kVarArr3[i14];
                    kVar3.getClass();
                    kVarArr2[i14] = kVarArr3[i14];
                    identityHashMap.put(kVar3, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr[i14] == i13) {
                    if (kVarArr3[i14] != null) {
                        z11 = false;
                    }
                    sc.b.C(z11);
                }
            }
            if (z10) {
                arrayList2.add(hVarArr[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            dVarArr2 = dVarArr3;
        }
        System.arraycopy(kVarArr2, 0, kVarArr, 0, length2);
        h[] hVarArr2 = (h[]) arrayList.toArray(new h[0]);
        this.A = hVarArr2;
        this.f6904w.getClass();
        this.B = new x(9, hVarArr2);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void l() {
        for (h hVar : this.f6902u) {
            hVar.l();
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long m(long j10) {
        long m10 = this.A[0].m(j10);
        int i6 = 1;
        while (true) {
            h[] hVarArr = this.A;
            if (i6 < hVarArr.length) {
                if (hVarArr[i6].m(m10) == m10) {
                    i6++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return m10;
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void r(boolean z10, long j10) {
        for (h hVar : this.A) {
            hVar.r(z10, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long s() {
        h[] hVarArr;
        h[] hVarArr2;
        long j10 = -9223372036854775807L;
        for (h hVar : this.A) {
            long s10 = hVar.s();
            if (s10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (h hVar2 : this.A) {
                        if (hVar2 == hVar) {
                            break;
                        } else if (hVar2.m(s10) != s10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = s10;
                } else if (s10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && hVar.m(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final void t(h.a aVar, long j10) {
        this.f6906y = aVar;
        ArrayList<h> arrayList = this.f6905x;
        h[] hVarArr = this.f6902u;
        Collections.addAll(arrayList, hVarArr);
        for (h hVar : hVarArr) {
            hVar.t(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public final o8.p u() {
        o8.p pVar = this.f6907z;
        pVar.getClass();
        return pVar;
    }

    @Override // com.google.android.exoplayer2.source.h
    public final long w(long j10, o7.x xVar) {
        h hVar;
        h[] hVarArr = this.A;
        if (hVarArr.length > 0) {
            hVar = hVarArr[0];
        } else {
            hVar = this.f6902u[0];
        }
        return hVar.w(j10, xVar);
    }
}
