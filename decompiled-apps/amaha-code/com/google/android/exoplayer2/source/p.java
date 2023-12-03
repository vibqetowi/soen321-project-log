package com.google.android.exoplayer2.source;

import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import c9.w;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.source.o;
import java.io.EOFException;
import u7.v;
/* compiled from: SampleQueue.java */
/* loaded from: classes.dex */
public final class p implements v {
    public com.google.android.exoplayer2.n A;
    public boolean B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final o f6974a;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.d f6977d;

    /* renamed from: e  reason: collision with root package name */
    public final c.a f6978e;
    public final Looper f;

    /* renamed from: g  reason: collision with root package name */
    public c f6979g;

    /* renamed from: h  reason: collision with root package name */
    public com.google.android.exoplayer2.n f6980h;

    /* renamed from: i  reason: collision with root package name */
    public DrmSession f6981i;

    /* renamed from: q  reason: collision with root package name */
    public int f6989q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public int f6990s;

    /* renamed from: t  reason: collision with root package name */
    public int f6991t;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6995x;

    /* renamed from: b  reason: collision with root package name */
    public final a f6975b = new a();

    /* renamed from: j  reason: collision with root package name */
    public int f6982j = 1000;

    /* renamed from: k  reason: collision with root package name */
    public int[] f6983k = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    public long[] f6984l = new long[1000];

    /* renamed from: o  reason: collision with root package name */
    public long[] f6987o = new long[1000];

    /* renamed from: n  reason: collision with root package name */
    public int[] f6986n = new int[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f6985m = new int[1000];

    /* renamed from: p  reason: collision with root package name */
    public v.a[] f6988p = new v.a[1000];

    /* renamed from: c  reason: collision with root package name */
    public final o8.n<b> f6976c = new o8.n<>(new p7.e(16));

    /* renamed from: u  reason: collision with root package name */
    public long f6992u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f6993v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    public long f6994w = Long.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6997z = true;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6996y = true;

    /* compiled from: SampleQueue.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f6998a;

        /* renamed from: b  reason: collision with root package name */
        public long f6999b;

        /* renamed from: c  reason: collision with root package name */
        public v.a f7000c;
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.n f7001a;

        /* renamed from: b  reason: collision with root package name */
        public final d.b f7002b;

        public b(com.google.android.exoplayer2.n nVar, d.b bVar) {
            this.f7001a = nVar;
            this.f7002b = bVar;
        }
    }

    /* compiled from: SampleQueue.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public p(b9.i iVar, Looper looper, com.google.android.exoplayer2.drm.d dVar, c.a aVar) {
        this.f = looper;
        this.f6977d = dVar;
        this.f6978e = aVar;
        this.f6974a = new o(iVar);
    }

    @Override // u7.v
    public final void a(int i6, c9.q qVar) {
        b(qVar, i6);
    }

    @Override // u7.v
    public final void b(c9.q qVar, int i6) {
        while (true) {
            o oVar = this.f6974a;
            if (i6 > 0) {
                int b10 = oVar.b(i6);
                o.a aVar = oVar.f;
                b9.a aVar2 = aVar.f6972d;
                qVar.b(((int) (oVar.f6968g - aVar.f6969a)) + aVar2.f4110b, aVar2.f4109a, b10);
                i6 -= b10;
                long j10 = oVar.f6968g + b10;
                oVar.f6968g = j10;
                o.a aVar3 = oVar.f;
                if (j10 == aVar3.f6970b) {
                    oVar.f = aVar3.f6973e;
                }
            } else {
                oVar.getClass();
                return;
            }
        }
    }

    @Override // u7.v
    public final int c(b9.d dVar, int i6, boolean z10) {
        return r(dVar, i6, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
        if (r10.valueAt(r10.size() - 1).f7001a.equals(r9.A) == false) goto L46;
     */
    @Override // u7.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j10, int i6, int i10, int i11, v.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        d.b bVar;
        boolean z13;
        boolean z14;
        boolean z15;
        int i12 = i6 & 1;
        if (i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6996y) {
            if (!z10) {
                return;
            }
            this.f6996y = false;
        }
        long j11 = j10 + 0;
        if (this.B) {
            if (j11 < this.f6992u) {
                return;
            }
            if (i12 == 0) {
                if (!this.C) {
                    String valueOf = String.valueOf(this.A);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 50);
                    sb2.append("Overriding unexpected non-sync sample for format: ");
                    sb2.append(valueOf);
                    Log.w("SampleQueue", sb2.toString());
                    this.C = true;
                }
                i6 |= 1;
            }
        }
        long j12 = (this.f6974a.f6968g - i10) - i11;
        synchronized (this) {
            int i13 = this.f6989q;
            if (i13 > 0) {
                int k10 = k(i13 - 1);
                if (this.f6984l[k10] + this.f6985m[k10] <= j12) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                sc.b.q(z15);
            }
            if ((536870912 & i6) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f6995x = z11;
            this.f6994w = Math.max(this.f6994w, j11);
            int k11 = k(this.f6989q);
            this.f6987o[k11] = j11;
            this.f6984l[k11] = j12;
            this.f6985m[k11] = i10;
            this.f6986n[k11] = i6;
            this.f6988p[k11] = aVar;
            this.f6983k[k11] = 0;
            if (this.f6976c.f27299b.size() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                SparseArray<b> sparseArray = this.f6976c.f27299b;
            }
            com.google.android.exoplayer2.drm.d dVar = this.f6977d;
            if (dVar != null) {
                Looper looper = this.f;
                looper.getClass();
                bVar = dVar.b(looper, this.f6978e, this.A);
            } else {
                bVar = d.b.f6444a;
            }
            o8.n<b> nVar = this.f6976c;
            int i14 = this.r + this.f6989q;
            com.google.android.exoplayer2.n nVar2 = this.A;
            nVar2.getClass();
            b bVar2 = new b(nVar2, bVar);
            int i15 = nVar.f27298a;
            SparseArray<b> sparseArray2 = nVar.f27299b;
            if (i15 == -1) {
                if (sparseArray2.size() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                sc.b.C(z14);
                nVar.f27298a = 0;
            }
            if (sparseArray2.size() > 0) {
                int keyAt = sparseArray2.keyAt(sparseArray2.size() - 1);
                if (i14 >= keyAt) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sc.b.q(z13);
                if (keyAt == i14) {
                    nVar.f27300c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
                }
            }
            sparseArray2.append(i14, bVar2);
            int i16 = this.f6989q + 1;
            this.f6989q = i16;
            int i17 = this.f6982j;
            if (i16 == i17) {
                int i18 = i17 + 1000;
                int[] iArr = new int[i18];
                long[] jArr = new long[i18];
                long[] jArr2 = new long[i18];
                int[] iArr2 = new int[i18];
                int[] iArr3 = new int[i18];
                v.a[] aVarArr = new v.a[i18];
                int i19 = this.f6990s;
                int i20 = i17 - i19;
                System.arraycopy(this.f6984l, i19, jArr, 0, i20);
                System.arraycopy(this.f6987o, this.f6990s, jArr2, 0, i20);
                System.arraycopy(this.f6986n, this.f6990s, iArr2, 0, i20);
                System.arraycopy(this.f6985m, this.f6990s, iArr3, 0, i20);
                System.arraycopy(this.f6988p, this.f6990s, aVarArr, 0, i20);
                System.arraycopy(this.f6983k, this.f6990s, iArr, 0, i20);
                int i21 = this.f6990s;
                System.arraycopy(this.f6984l, 0, jArr, i20, i21);
                System.arraycopy(this.f6987o, 0, jArr2, i20, i21);
                System.arraycopy(this.f6986n, 0, iArr2, i20, i21);
                System.arraycopy(this.f6985m, 0, iArr3, i20, i21);
                System.arraycopy(this.f6988p, 0, aVarArr, i20, i21);
                System.arraycopy(this.f6983k, 0, iArr, i20, i21);
                this.f6984l = jArr;
                this.f6987o = jArr2;
                this.f6986n = iArr2;
                this.f6985m = iArr3;
                this.f6988p = aVarArr;
                this.f6983k = iArr;
                this.f6990s = 0;
                this.f6982j = i18;
            }
        }
    }

    @Override // u7.v
    public final void e(com.google.android.exoplayer2.n nVar) {
        boolean z10;
        boolean z11;
        synchronized (this) {
            z10 = false;
            this.f6997z = false;
            if (!w.a(nVar, this.A)) {
                if (this.f6976c.f27299b.size() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    SparseArray<b> sparseArray = this.f6976c.f27299b;
                    if (sparseArray.valueAt(sparseArray.size() - 1).f7001a.equals(nVar)) {
                        SparseArray<b> sparseArray2 = this.f6976c.f27299b;
                        this.A = sparseArray2.valueAt(sparseArray2.size() - 1).f7001a;
                        com.google.android.exoplayer2.n nVar2 = this.A;
                        this.B = c9.l.a(nVar2.F, nVar2.C);
                        this.C = false;
                        z10 = true;
                    }
                }
                this.A = nVar;
                com.google.android.exoplayer2.n nVar22 = this.A;
                this.B = c9.l.a(nVar22.F, nVar22.C);
                this.C = false;
                z10 = true;
            }
        }
        c cVar = this.f6979g;
        if (cVar != null && z10) {
            m mVar = (m) cVar;
            mVar.J.post(mVar.H);
        }
    }

    public final long f(int i6) {
        int i10;
        this.f6993v = Math.max(this.f6993v, j(i6));
        this.f6989q -= i6;
        int i11 = this.r + i6;
        this.r = i11;
        int i12 = this.f6990s + i6;
        this.f6990s = i12;
        int i13 = this.f6982j;
        if (i12 >= i13) {
            this.f6990s = i12 - i13;
        }
        int i14 = this.f6991t - i6;
        this.f6991t = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f6991t = 0;
        }
        while (true) {
            o8.n<b> nVar = this.f6976c;
            SparseArray<b> sparseArray = nVar.f27299b;
            if (i15 >= sparseArray.size() - 1) {
                break;
            }
            int i16 = i15 + 1;
            if (i11 < sparseArray.keyAt(i16)) {
                break;
            }
            nVar.f27300c.accept(sparseArray.valueAt(i15));
            sparseArray.removeAt(i15);
            int i17 = nVar.f27298a;
            if (i17 > 0) {
                nVar.f27298a = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f6989q == 0) {
            int i18 = this.f6990s;
            if (i18 == 0) {
                i18 = this.f6982j;
            }
            return this.f6984l[i18 - 1] + this.f6985m[i10];
        }
        return this.f6984l[this.f6990s];
    }

    public final void g() {
        long f;
        o oVar = this.f6974a;
        synchronized (this) {
            int i6 = this.f6989q;
            if (i6 == 0) {
                f = -1;
            } else {
                f = f(i6);
            }
        }
        oVar.a(f);
    }

    public final int h(int i6, int i10, long j10, boolean z10) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j11 = this.f6987o[i6];
            if (j11 <= j10) {
                if (!z10 || (this.f6986n[i6] & 1) != 0) {
                    if (j11 == j10) {
                        return i12;
                    }
                    i11 = i12;
                }
                i6++;
                if (i6 == this.f6982j) {
                    i6 = 0;
                }
            } else {
                return i11;
            }
        }
        return i11;
    }

    public final synchronized long i() {
        return this.f6994w;
    }

    public final long j(int i6) {
        long j10 = Long.MIN_VALUE;
        if (i6 == 0) {
            return Long.MIN_VALUE;
        }
        int k10 = k(i6 - 1);
        for (int i10 = 0; i10 < i6; i10++) {
            j10 = Math.max(j10, this.f6987o[k10]);
            if ((this.f6986n[k10] & 1) != 0) {
                break;
            }
            k10--;
            if (k10 == -1) {
                k10 = this.f6982j - 1;
            }
        }
        return j10;
    }

    public final int k(int i6) {
        int i10 = this.f6990s + i6;
        int i11 = this.f6982j;
        if (i10 >= i11) {
            return i10 - i11;
        }
        return i10;
    }

    public final synchronized com.google.android.exoplayer2.n l() {
        com.google.android.exoplayer2.n nVar;
        if (this.f6997z) {
            nVar = null;
        } else {
            nVar = this.A;
        }
        return nVar;
    }

    public final synchronized boolean m(boolean z10) {
        boolean z11;
        com.google.android.exoplayer2.n nVar;
        int i6 = this.f6991t;
        boolean z12 = true;
        if (i6 != this.f6989q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (!z10 && !this.f6995x && ((nVar = this.A) == null || nVar == this.f6980h)) {
                z12 = false;
            }
            return z12;
        } else if (this.f6976c.a(this.r + i6).f7001a != this.f6980h) {
            return true;
        } else {
            return n(k(this.f6991t));
        }
    }

    public final boolean n(int i6) {
        DrmSession drmSession = this.f6981i;
        if (drmSession != null && drmSession.getState() != 4 && ((this.f6986n[i6] & 1073741824) != 0 || !this.f6981i.d())) {
            return false;
        }
        return true;
    }

    public final void o(com.google.android.exoplayer2.n nVar, androidx.appcompat.widget.l lVar) {
        boolean z10;
        com.google.android.exoplayer2.drm.b bVar;
        com.google.android.exoplayer2.n nVar2;
        com.google.android.exoplayer2.n nVar3 = this.f6980h;
        if (nVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bVar = null;
        } else {
            bVar = nVar3.I;
        }
        this.f6980h = nVar;
        com.google.android.exoplayer2.drm.b bVar2 = nVar.I;
        com.google.android.exoplayer2.drm.d dVar = this.f6977d;
        if (dVar != null) {
            int d10 = dVar.d(nVar);
            n.a b10 = nVar.b();
            b10.D = d10;
            nVar2 = b10.a();
        } else {
            nVar2 = nVar;
        }
        lVar.f1472w = nVar2;
        lVar.f1471v = this.f6981i;
        if (dVar == null) {
            return;
        }
        if (!z10 && w.a(bVar, bVar2)) {
            return;
        }
        DrmSession drmSession = this.f6981i;
        Looper looper = this.f;
        looper.getClass();
        c.a aVar = this.f6978e;
        DrmSession c10 = dVar.c(looper, aVar, nVar);
        this.f6981i = c10;
        lVar.f1471v = c10;
        if (drmSession != null) {
            drmSession.b(aVar);
        }
    }

    public final void p(boolean z10) {
        o8.n<b> nVar;
        SparseArray<b> sparseArray;
        o oVar = this.f6974a;
        o.a aVar = oVar.f6966d;
        boolean z11 = aVar.f6971c;
        int i6 = 0;
        b9.i iVar = oVar.f6963a;
        int i10 = oVar.f6964b;
        if (z11) {
            o.a aVar2 = oVar.f;
            int i11 = (((int) (aVar2.f6969a - aVar.f6969a)) / i10) + (aVar2.f6971c ? 1 : 0);
            b9.a[] aVarArr = new b9.a[i11];
            int i12 = 0;
            while (i12 < i11) {
                aVarArr[i12] = aVar.f6972d;
                aVar.f6972d = null;
                o.a aVar3 = aVar.f6973e;
                aVar.f6973e = null;
                i12++;
                aVar = aVar3;
            }
            iVar.a(aVarArr);
        }
        o.a aVar4 = new o.a(i10, 0L);
        oVar.f6966d = aVar4;
        oVar.f6967e = aVar4;
        oVar.f = aVar4;
        oVar.f6968g = 0L;
        iVar.c();
        this.f6989q = 0;
        this.r = 0;
        this.f6990s = 0;
        this.f6991t = 0;
        this.f6996y = true;
        this.f6992u = Long.MIN_VALUE;
        this.f6993v = Long.MIN_VALUE;
        this.f6994w = Long.MIN_VALUE;
        this.f6995x = false;
        while (true) {
            nVar = this.f6976c;
            sparseArray = nVar.f27299b;
            if (i6 >= sparseArray.size()) {
                break;
            }
            nVar.f27300c.accept(sparseArray.valueAt(i6));
            i6++;
        }
        nVar.f27298a = -1;
        sparseArray.clear();
        if (z10) {
            this.A = null;
            this.f6997z = true;
        }
    }

    public final synchronized void q() {
        this.f6991t = 0;
        o oVar = this.f6974a;
        oVar.f6967e = oVar.f6966d;
    }

    public final int r(b9.d dVar, int i6, boolean z10) {
        o oVar = this.f6974a;
        int b10 = oVar.b(i6);
        o.a aVar = oVar.f;
        b9.a aVar2 = aVar.f6972d;
        int read = dVar.read(aVar2.f4109a, ((int) (oVar.f6968g - aVar.f6969a)) + aVar2.f4110b, b10);
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = oVar.f6968g + read;
        oVar.f6968g = j10;
        o.a aVar3 = oVar.f;
        if (j10 == aVar3.f6970b) {
            oVar.f = aVar3.f6973e;
            return read;
        }
        return read;
    }

    public final synchronized boolean s(boolean z10, long j10) {
        boolean z11;
        q();
        int k10 = k(this.f6991t);
        int i6 = this.f6991t;
        int i10 = this.f6989q;
        if (i6 != i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && j10 >= this.f6987o[k10] && (j10 <= this.f6994w || z10)) {
            int h10 = h(k10, i10 - i6, j10, true);
            if (h10 == -1) {
                return false;
            }
            this.f6992u = j10;
            this.f6991t += h10;
            return true;
        }
        return false;
    }

    public final synchronized void t(int i6) {
        boolean z10;
        if (i6 >= 0) {
            try {
                if (this.f6991t + i6 <= this.f6989q) {
                    z10 = true;
                    sc.b.q(z10);
                    this.f6991t += i6;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        sc.b.q(z10);
        this.f6991t += i6;
    }
}
