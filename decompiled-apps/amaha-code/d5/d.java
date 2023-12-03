package d5;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
/* compiled from: ExceptionCatchingInputStream.java */
/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: w  reason: collision with root package name */
    public static final ArrayDeque f12186w;

    /* renamed from: u  reason: collision with root package name */
    public InputStream f12187u;

    /* renamed from: v  reason: collision with root package name */
    public IOException f12188v;

    static {
        char[] cArr = j.f12201a;
        f12186w = new ArrayDeque(0);
    }

    public final void a() {
        this.f12188v = null;
        this.f12187u = null;
        ArrayDeque arrayDeque = f12186w;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f12187u.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12187u.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i6) {
        this.f12187u.mark(i6);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f12187u.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f12187u.read(bArr);
        } catch (IOException e10) {
            this.f12188v = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f12187u.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        try {
            return this.f12187u.skip(j10);
        } catch (IOException e10) {
            this.f12188v = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        try {
            return this.f12187u.read(bArr, i6, i10);
        } catch (IOException e10) {
            this.f12188v = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f12187u.read();
        } catch (IOException e10) {
            this.f12188v = e10;
            return -1;
        }
    }
}
