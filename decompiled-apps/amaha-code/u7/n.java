package u7;

import u7.o;
import u7.t;
/* compiled from: FlacSeekTableSeekMap.java */
/* loaded from: classes.dex */
public final class n implements t {

    /* renamed from: a  reason: collision with root package name */
    public final o f33882a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33883b;

    public n(o oVar, long j10) {
        this.f33882a = oVar;
        this.f33883b = j10;
    }

    @Override // u7.t
    public final boolean d() {
        return true;
    }

    @Override // u7.t
    public final t.a i(long j10) {
        long j11;
        o oVar = this.f33882a;
        sc.b.E(oVar.f33893k);
        o.a aVar = oVar.f33893k;
        long[] jArr = aVar.f33895a;
        int f = c9.w.f(jArr, c9.w.i((oVar.f33888e * j10) / 1000000, 0L, oVar.f33892j - 1), false);
        long j12 = 0;
        if (f == -1) {
            j11 = 0;
        } else {
            j11 = jArr[f];
        }
        long[] jArr2 = aVar.f33896b;
        if (f != -1) {
            j12 = jArr2[f];
        }
        int i6 = oVar.f33888e;
        long j13 = (j11 * 1000000) / i6;
        long j14 = this.f33883b;
        u uVar = new u(j13, j12 + j14);
        if (j13 != j10 && f != jArr.length - 1) {
            int i10 = f + 1;
            return new t.a(uVar, new u((jArr[i10] * 1000000) / i6, j14 + jArr2[i10]));
        }
        return new t.a(uVar, uVar);
    }

    @Override // u7.t
    public final long j() {
        return this.f33882a.c();
    }
}
