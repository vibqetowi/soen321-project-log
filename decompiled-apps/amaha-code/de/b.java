package de;

import java.io.OutputStream;
/* compiled from: LengthCountingOutputStream.java */
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: u  reason: collision with root package name */
    public long f12816u = 0;

    @Override // java.io.OutputStream
    public final void write(int i6) {
        this.f12816u++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f12816u += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i10) {
        int i11;
        if (i6 >= 0 && i6 <= bArr.length && i10 >= 0 && (i11 = i6 + i10) <= bArr.length && i11 >= 0) {
            this.f12816u += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
