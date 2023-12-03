package u7;

import u7.t;
/* compiled from: IndexSeekMap.java */
/* loaded from: classes.dex */
public final class r implements t {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f33901a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f33902b;

    /* renamed from: c  reason: collision with root package name */
    public final long f33903c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f33904d;

    public r(long j10, long[] jArr, long[] jArr2) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33904d = z11;
        if (z11 && jArr2[0] > 0) {
            int i6 = length + 1;
            long[] jArr3 = new long[i6];
            this.f33901a = jArr3;
            long[] jArr4 = new long[i6];
            this.f33902b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f33901a = jArr;
            this.f33902b = jArr2;
        }
        this.f33903c = j10;
    }

    @Override // u7.t
    public final boolean d() {
        return this.f33904d;
    }

    @Override // u7.t
    public final t.a i(long j10) {
        if (!this.f33904d) {
            u uVar = u.f33910c;
            return new t.a(uVar, uVar);
        }
        long[] jArr = this.f33902b;
        int f = c9.w.f(jArr, j10, true);
        long j11 = jArr[f];
        long[] jArr2 = this.f33901a;
        u uVar2 = new u(j11, jArr2[f]);
        if (j11 != j10 && f != jArr.length - 1) {
            int i6 = f + 1;
            return new t.a(uVar2, new u(jArr[i6], jArr2[i6]));
        }
        return new t.a(uVar2, uVar2);
    }

    @Override // u7.t
    public final long j() {
        return this.f33903c;
    }
}
