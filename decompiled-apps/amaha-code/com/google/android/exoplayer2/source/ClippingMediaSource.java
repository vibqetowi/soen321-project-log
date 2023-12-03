package com.google.android.exoplayer2.source;

import b9.u;
import c9.w;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ClippingMediaSource extends c<Void> {

    /* renamed from: j  reason: collision with root package name */
    public final i f6795j;

    /* renamed from: k  reason: collision with root package name */
    public final long f6796k;

    /* renamed from: l  reason: collision with root package name */
    public final long f6797l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6798m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f6799n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6800o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<b> f6801p;

    /* renamed from: q  reason: collision with root package name */
    public final e0.c f6802q;
    public a r;

    /* renamed from: s  reason: collision with root package name */
    public IllegalClippingException f6803s;

    /* renamed from: t  reason: collision with root package name */
    public long f6804t;

    /* renamed from: u  reason: collision with root package name */
    public long f6805u;

    /* loaded from: classes.dex */
    public static final class IllegalClippingException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public IllegalClippingException(int i6) {
            super(r3);
            String str;
            String str2;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        str = "unknown";
                    } else {
                        str = "start exceeds end";
                    }
                } else {
                    str = "not seekable to start";
                }
            } else {
                str = "invalid period count";
            }
            if (str.length() != 0) {
                str2 = "Illegal clipping: ".concat(str);
            } else {
                str2 = new String("Illegal clipping: ");
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends o8.c {

        /* renamed from: w  reason: collision with root package name */
        public final long f6806w;

        /* renamed from: x  reason: collision with root package name */
        public final long f6807x;

        /* renamed from: y  reason: collision with root package name */
        public final long f6808y;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f6809z;

        public a(e0 e0Var, long j10, long j11) {
            super(e0Var);
            long max;
            long j12;
            boolean z10 = false;
            if (e0Var.i() == 1) {
                e0.c n10 = e0Var.n(0, new e0.c());
                long max2 = Math.max(0L, j10);
                if (!n10.F && max2 != 0 && !n10.B) {
                    throw new IllegalClippingException(1);
                }
                if (j11 == Long.MIN_VALUE) {
                    max = n10.H;
                } else {
                    max = Math.max(0L, j11);
                }
                long j13 = n10.H;
                if (j13 != -9223372036854775807L) {
                    max = max > j13 ? j13 : max;
                    if (max2 > max) {
                        throw new IllegalClippingException(2);
                    }
                }
                this.f6806w = max2;
                this.f6807x = max;
                int i6 = (max > (-9223372036854775807L) ? 1 : (max == (-9223372036854775807L) ? 0 : -1));
                if (i6 == 0) {
                    j12 = -9223372036854775807L;
                } else {
                    j12 = max - max2;
                }
                this.f6808y = j12;
                if (n10.C && (i6 == 0 || (j13 != -9223372036854775807L && max == j13))) {
                    z10 = true;
                }
                this.f6809z = z10;
                return;
            }
            throw new IllegalClippingException(0);
        }

        @Override // o8.c, com.google.android.exoplayer2.e0
        public final e0.b g(int i6, e0.b bVar, boolean z10) {
            long j10;
            this.f27263v.g(0, bVar, z10);
            long j11 = bVar.f6469y - this.f6806w;
            long j12 = this.f6808y;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - j11;
            }
            bVar.g(bVar.f6465u, bVar.f6466v, 0, j10, j11, com.google.android.exoplayer2.source.ads.a.A, false);
            return bVar;
        }

        @Override // o8.c, com.google.android.exoplayer2.e0
        public final e0.c o(int i6, e0.c cVar, long j10) {
            this.f27263v.o(0, cVar, 0L);
            long j11 = cVar.K;
            long j12 = this.f6806w;
            cVar.K = j11 + j12;
            cVar.H = this.f6808y;
            cVar.C = this.f6809z;
            long j13 = cVar.G;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                cVar.G = max;
                long j14 = this.f6807x;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                cVar.G = max - j12;
            }
            long E = w.E(j12);
            long j15 = cVar.f6475y;
            if (j15 != -9223372036854775807L) {
                cVar.f6475y = j15 + E;
            }
            long j16 = cVar.f6476z;
            if (j16 != -9223372036854775807L) {
                cVar.f6476z = j16 + E;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(i iVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        if (j10 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        sc.b.q(z13);
        iVar.getClass();
        this.f6795j = iVar;
        this.f6796k = j10;
        this.f6797l = j11;
        this.f6798m = z10;
        this.f6799n = z11;
        this.f6800o = z12;
        this.f6801p = new ArrayList<>();
        this.f6802q = new e0.c();
    }

    @Override // com.google.android.exoplayer2.source.i
    public final h a(i.a aVar, b9.i iVar, long j10) {
        b bVar = new b(this.f6795j.a(aVar, iVar, j10), this.f6798m, this.f6804t, this.f6805u);
        this.f6801p.add(bVar);
        return bVar;
    }

    @Override // com.google.android.exoplayer2.source.i
    public final com.google.android.exoplayer2.q g() {
        return this.f6795j.g();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public final void j() {
        IllegalClippingException illegalClippingException = this.f6803s;
        if (illegalClippingException == null) {
            super.j();
            return;
        }
        throw illegalClippingException;
    }

    @Override // com.google.android.exoplayer2.source.i
    public final void l(h hVar) {
        ArrayList<b> arrayList = this.f6801p;
        sc.b.C(arrayList.remove(hVar));
        this.f6795j.l(((b) hVar).f6836u);
        if (arrayList.isEmpty() && !this.f6799n) {
            a aVar = this.r;
            aVar.getClass();
            w(aVar.f27263v);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public final void q(u uVar) {
        this.f6847i = uVar;
        this.f6846h = w.j(null);
        v(null, this.f6795j);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public final void s() {
        super.s();
        this.f6803s = null;
        this.r = null;
    }

    @Override // com.google.android.exoplayer2.source.c
    public final void u(Void r12, i iVar, e0 e0Var) {
        if (this.f6803s == null) {
            w(e0Var);
        }
    }

    public final void w(e0 e0Var) {
        long j10;
        long j11;
        long j12;
        e0.c cVar = this.f6802q;
        e0Var.n(0, cVar);
        long j13 = cVar.K;
        a aVar = this.r;
        long j14 = this.f6797l;
        long j15 = Long.MIN_VALUE;
        ArrayList<b> arrayList = this.f6801p;
        if (aVar != null && !arrayList.isEmpty() && !this.f6799n) {
            long j16 = this.f6804t - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f6805u - j13;
            }
            j12 = j15;
            j11 = j16;
        } else {
            boolean z10 = this.f6800o;
            long j17 = this.f6796k;
            if (z10) {
                long j18 = cVar.G;
                j17 += j18;
                j10 = j18 + j14;
            } else {
                j10 = j14;
            }
            this.f6804t = j13 + j17;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j10;
            }
            this.f6805u = j15;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                b bVar = arrayList.get(i6);
                long j19 = this.f6804t;
                long j20 = this.f6805u;
                bVar.f6840y = j19;
                bVar.f6841z = j20;
            }
            j11 = j17;
            j12 = j10;
        }
        try {
            a aVar2 = new a(e0Var, j11, j12);
            this.r = aVar2;
            r(aVar2);
        } catch (IllegalClippingException e10) {
            this.f6803s = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                arrayList.get(i10).A = this.f6803s;
            }
        }
    }
}
