package i4;

import java.io.FileOutputStream;
import java.io.OutputStream;
/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: u  reason: collision with root package name */
    public final OutputStream f19806u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f19807v;

    /* renamed from: w  reason: collision with root package name */
    public final l4.b f19808w;

    /* renamed from: x  reason: collision with root package name */
    public int f19809x;

    public c(FileOutputStream fileOutputStream, l4.b bVar) {
        this.f19806u = fileOutputStream;
        this.f19808w = bVar;
        this.f19807v = (byte[]) bVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.f19806u;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f19807v;
            if (bArr != null) {
                this.f19808w.put(bArr);
                this.f19807v = null;
            }
        } catch (Throwable th2) {
            outputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i6 = this.f19809x;
        OutputStream outputStream = this.f19806u;
        if (i6 > 0) {
            outputStream.write(this.f19807v, 0, i6);
            this.f19809x = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i6) {
        byte[] bArr = this.f19807v;
        int i10 = this.f19809x;
        int i11 = i10 + 1;
        this.f19809x = i11;
        bArr[i10] = (byte) i6;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.f19806u.write(bArr, 0, i11);
        this.f19809x = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i10) {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i6 + i11;
            int i14 = this.f19809x;
            OutputStream outputStream = this.f19806u;
            if (i14 == 0 && i12 >= this.f19807v.length) {
                outputStream.write(bArr, i13, i12);
                return;
            }
            int min = Math.min(i12, this.f19807v.length - i14);
            System.arraycopy(bArr, i13, this.f19807v, this.f19809x, min);
            int i15 = this.f19809x + min;
            this.f19809x = i15;
            i11 += min;
            byte[] bArr2 = this.f19807v;
            if (i15 == bArr2.length && i15 > 0) {
                outputStream.write(bArr2, 0, i15);
                this.f19809x = 0;
                continue;
            }
        } while (i11 < i10);
    }
}
