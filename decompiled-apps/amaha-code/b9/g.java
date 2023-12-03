package b9;

import java.io.InputStream;
/* compiled from: DataSourceInputStream.java */
/* loaded from: classes.dex */
public final class g extends InputStream {

    /* renamed from: u  reason: collision with root package name */
    public final f f4122u;

    /* renamed from: v  reason: collision with root package name */
    public final h f4123v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4125x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4126y = false;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f4124w = new byte[1];

    public g(t tVar, h hVar) {
        this.f4122u = tVar;
        this.f4123v = hVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f4126y) {
            this.f4122u.close();
            this.f4126y = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f4124w;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        sc.b.C(!this.f4126y);
        boolean z10 = this.f4125x;
        f fVar = this.f4122u;
        if (!z10) {
            fVar.h(this.f4123v);
            this.f4125x = true;
        }
        int read = fVar.read(bArr, i6, i10);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
