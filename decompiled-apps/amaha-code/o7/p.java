package o7;

import com.google.android.exoplayer2.source.i;
/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final i.a f27225a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27226b;

    /* renamed from: c  reason: collision with root package name */
    public final long f27227c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27228d;

    /* renamed from: e  reason: collision with root package name */
    public final long f27229e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f27230g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f27231h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f27232i;

    public p(i.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        sc.b.q(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        sc.b.q(z15);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z16 = true;
        }
        sc.b.q(z16);
        this.f27225a = aVar;
        this.f27226b = j10;
        this.f27227c = j11;
        this.f27228d = j12;
        this.f27229e = j13;
        this.f = z10;
        this.f27230g = z11;
        this.f27231h = z12;
        this.f27232i = z13;
    }

    public final p a(long j10) {
        if (j10 == this.f27227c) {
            return this;
        }
        return new p(this.f27225a, this.f27226b, j10, this.f27228d, this.f27229e, this.f, this.f27230g, this.f27231h, this.f27232i);
    }

    public final p b(long j10) {
        if (j10 == this.f27226b) {
            return this;
        }
        return new p(this.f27225a, j10, this.f27227c, this.f27228d, this.f27229e, this.f, this.f27230g, this.f27231h, this.f27232i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f27226b == pVar.f27226b && this.f27227c == pVar.f27227c && this.f27228d == pVar.f27228d && this.f27229e == pVar.f27229e && this.f == pVar.f && this.f27230g == pVar.f27230g && this.f27231h == pVar.f27231h && this.f27232i == pVar.f27232i && c9.w.a(this.f27225a, pVar.f27225a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f27225a.hashCode() + 527) * 31) + ((int) this.f27226b)) * 31) + ((int) this.f27227c)) * 31) + ((int) this.f27228d)) * 31) + ((int) this.f27229e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f27230g ? 1 : 0)) * 31) + (this.f27231h ? 1 : 0)) * 31) + (this.f27232i ? 1 : 0);
    }
}
