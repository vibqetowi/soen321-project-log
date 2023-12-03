package a8;

import c9.w;
import u7.t;
import u7.u;
/* compiled from: VbriSeeker.java */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f364a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f365b;

    /* renamed from: c  reason: collision with root package name */
    public final long f366c;

    /* renamed from: d  reason: collision with root package name */
    public final long f367d;

    public f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f364a = jArr;
        this.f365b = jArr2;
        this.f366c = j10;
        this.f367d = j11;
    }

    @Override // a8.e
    public final long c() {
        return this.f367d;
    }

    @Override // u7.t
    public final boolean d() {
        return true;
    }

    @Override // a8.e
    public final long e(long j10) {
        return this.f364a[w.f(this.f365b, j10, true)];
    }

    @Override // u7.t
    public final t.a i(long j10) {
        long[] jArr = this.f364a;
        int f = w.f(jArr, j10, true);
        long j11 = jArr[f];
        long[] jArr2 = this.f365b;
        u uVar = new u(j11, jArr2[f]);
        if (j11 < j10 && f != jArr.length - 1) {
            int i6 = f + 1;
            return new t.a(uVar, new u(jArr[i6], jArr2[i6]));
        }
        return new t.a(uVar, uVar);
    }

    @Override // u7.t
    public final long j() {
        return this.f366c;
    }
}
