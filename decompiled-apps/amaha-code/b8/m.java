package b8;

import c9.w;
/* compiled from: TrackSampleTable.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final j f4102a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4103b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f4104c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f4105d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4106e;
    public final long[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4107g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4108h;

    public m(j jVar, long[] jArr, int[] iArr, int i6, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        sc.b.q(z11);
        sc.b.q(iArr2.length == jArr2.length);
        this.f4102a = jVar;
        this.f4104c = jArr;
        this.f4105d = iArr;
        this.f4106e = i6;
        this.f = jArr2;
        this.f4107g = iArr2;
        this.f4108h = j10;
        this.f4103b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f;
        for (int b10 = w.b(jArr, j10, true); b10 < jArr.length; b10++) {
            if ((this.f4107g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
