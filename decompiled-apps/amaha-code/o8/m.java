package o8;

import android.net.Uri;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.q;
/* compiled from: SinglePeriodTimeline.java */
/* loaded from: classes.dex */
public final class m extends e0 {
    public static final Object F = new Object();
    public final boolean A;
    public final boolean B;
    public final Object C;
    public final q D;
    public final q.e E;

    /* renamed from: v  reason: collision with root package name */
    public final long f27293v;

    /* renamed from: w  reason: collision with root package name */
    public final long f27294w;

    /* renamed from: x  reason: collision with root package name */
    public final long f27295x;

    /* renamed from: y  reason: collision with root package name */
    public final long f27296y;

    /* renamed from: z  reason: collision with root package name */
    public final long f27297z;

    static {
        q.a aVar = new q.a();
        aVar.f6689a = "SinglePeriodTimeline";
        aVar.f6690b = Uri.EMPTY;
        aVar.a();
    }

    public m(long j10, boolean z10, boolean z11, q qVar) {
        q.e eVar;
        if (z11) {
            eVar = qVar.f6686w;
        } else {
            eVar = null;
        }
        this.f27293v = -9223372036854775807L;
        this.f27294w = -9223372036854775807L;
        this.f27295x = -9223372036854775807L;
        this.f27296y = j10;
        this.f27297z = j10;
        this.A = z10;
        this.B = false;
        this.C = null;
        qVar.getClass();
        this.D = qVar;
        this.E = eVar;
    }

    @Override // com.google.android.exoplayer2.e0
    public final int c(Object obj) {
        if (F.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.e0
    public final e0.b g(int i6, e0.b bVar, boolean z10) {
        Object obj;
        sc.b.v(i6, 1);
        if (z10) {
            obj = F;
        } else {
            obj = null;
        }
        long j10 = this.f27296y;
        bVar.getClass();
        bVar.g(null, obj, 0, j10, 0L, com.google.android.exoplayer2.source.ads.a.A, false);
        return bVar;
    }

    @Override // com.google.android.exoplayer2.e0
    public final int i() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.e0
    public final Object m(int i6) {
        sc.b.v(i6, 1);
        return F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r1 > r5) goto L9;
     */
    @Override // com.google.android.exoplayer2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e0.c o(int i6, e0.c cVar, long j10) {
        long j11;
        sc.b.v(i6, 1);
        boolean z10 = this.B;
        long j12 = 0;
        if (z10 && j10 != 0) {
            long j13 = this.f27297z;
            if (j13 != -9223372036854775807L) {
                j12 = 0 + j10;
            }
            j11 = -9223372036854775807L;
            cVar.d(e0.c.L, this.D, this.C, this.f27293v, this.f27294w, this.f27295x, this.A, z10, this.E, j11, this.f27297z, 0, 0, 0L);
            return cVar;
        }
        j11 = j12;
        cVar.d(e0.c.L, this.D, this.C, this.f27293v, this.f27294w, this.f27295x, this.A, z10, this.E, j11, this.f27297z, 0, 0, 0L);
        return cVar;
    }

    @Override // com.google.android.exoplayer2.e0
    public final int p() {
        return 1;
    }
}
