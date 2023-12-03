package d5;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.FilterInputStream;
/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes.dex */
public final class h extends FilterInputStream {

    /* renamed from: u  reason: collision with root package name */
    public int f12197u;

    public h(d dVar) {
        super(dVar);
        this.f12197u = LinearLayoutManager.INVALID_OFFSET;
    }

    public final long a(long j10) {
        int i6 = this.f12197u;
        if (i6 == 0) {
            return -1L;
        }
        if (i6 != Integer.MIN_VALUE && j10 > i6) {
            return i6;
        }
        return j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i6 = this.f12197u;
        if (i6 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i6, super.available());
    }

    public final void e(long j10) {
        int i6 = this.f12197u;
        if (i6 != Integer.MIN_VALUE && j10 != -1) {
            this.f12197u = (int) (i6 - j10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        super.mark(i6);
        this.f12197u = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        e(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f12197u = LinearLayoutManager.INVALID_OFFSET;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0L;
        }
        long skip = super.skip(a10);
        e(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        int a10 = (int) a(i10);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i6, a10);
        e(read);
        return read;
    }
}
