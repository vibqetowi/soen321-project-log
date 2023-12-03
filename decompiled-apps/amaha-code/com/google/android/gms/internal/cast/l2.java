package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class l2 extends m2 {

    /* renamed from: x  reason: collision with root package name */
    public final int f7576x;

    public l2(byte[] bArr) {
        super(bArr);
        n2.v(bArr.length);
        this.f7576x = 47;
    }

    @Override // com.google.android.gms.internal.cast.m2, com.google.android.gms.internal.cast.n2
    public final byte e(int i6) {
        int i10 = this.f7576x;
        if (((i10 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new ArrayIndexOutOfBoundsException(defpackage.b.h(22, "Index < 0: ", i6));
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i6);
            sb2.append(", ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        return this.f7589w[i6];
    }

    @Override // com.google.android.gms.internal.cast.m2, com.google.android.gms.internal.cast.n2
    public final byte g(int i6) {
        return this.f7589w[i6];
    }

    @Override // com.google.android.gms.internal.cast.m2, com.google.android.gms.internal.cast.n2
    public final int m() {
        return this.f7576x;
    }

    @Override // com.google.android.gms.internal.cast.m2
    public final void z() {
    }
}
