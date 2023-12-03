package i4;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f19813w = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: x  reason: collision with root package name */
    public static final int f19814x = 31;

    /* renamed from: u  reason: collision with root package name */
    public final byte f19815u;

    /* renamed from: v  reason: collision with root package name */
    public int f19816v;

    public g(InputStream inputStream, int i6) {
        super(inputStream);
        if (i6 >= -1 && i6 <= 8) {
            this.f19815u = (byte) i6;
            return;
        }
        throw new IllegalArgumentException(defpackage.c.p("Cannot add invalid orientation: ", i6));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i6;
        int i10 = this.f19816v;
        if (i10 < 2 || i10 > (i6 = f19814x)) {
            read = super.read();
        } else if (i10 == i6) {
            read = this.f19815u;
        } else {
            read = f19813w[i10 - 2] & 255;
        }
        if (read != -1) {
            this.f19816v++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f19816v = (int) (this.f19816v + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        int i11;
        int i12 = this.f19816v;
        int i13 = f19814x;
        if (i12 > i13) {
            i11 = super.read(bArr, i6, i10);
        } else if (i12 == i13) {
            bArr[i6] = this.f19815u;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i6, 2 - i12);
        } else {
            int min = Math.min(i13 - i12, i10);
            System.arraycopy(f19813w, this.f19816v - 2, bArr, i6, min);
            i11 = min;
        }
        if (i11 > 0) {
            this.f19816v += i11;
        }
        return i11;
    }
}
