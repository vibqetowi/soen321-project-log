package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class x4 extends a5 {

    /* renamed from: x  reason: collision with root package name */
    public final int f8686x;

    public x4(byte[] bArr, int i6) {
        super(bArr);
        b5.v(0, i6, bArr.length);
        this.f8686x = i6;
    }

    @Override // com.google.android.gms.internal.measurement.a5, com.google.android.gms.internal.measurement.b5
    public final byte e(int i6) {
        int i10 = this.f8686x;
        if (((i10 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new ArrayIndexOutOfBoundsException(defpackage.c.p("Index < 0: ", i6));
            }
            throw new ArrayIndexOutOfBoundsException(defpackage.b.j("Index > length: ", i6, ", ", i10));
        }
        return this.f8302w[i6];
    }

    @Override // com.google.android.gms.internal.measurement.a5, com.google.android.gms.internal.measurement.b5
    public final byte g(int i6) {
        return this.f8302w[i6];
    }

    @Override // com.google.android.gms.internal.measurement.a5, com.google.android.gms.internal.measurement.b5
    public final int m() {
        return this.f8686x;
    }

    @Override // com.google.android.gms.internal.measurement.a5
    public final void C() {
    }
}
