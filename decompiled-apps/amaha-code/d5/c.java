package d5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: u  reason: collision with root package name */
    public final long f12184u;

    /* renamed from: v  reason: collision with root package name */
    public int f12185v;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f12184u = j10;
    }

    public final void a(int i6) {
        if (i6 >= 0) {
            this.f12185v += i6;
            return;
        }
        long j10 = this.f12184u;
        if (j10 - this.f12185v <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j10 + ", but read: " + this.f12185v);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f12184u - this.f12185v, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i6, int i10) {
        int read;
        read = super.read(bArr, i6, i10);
        a(read);
        return read;
    }
}
