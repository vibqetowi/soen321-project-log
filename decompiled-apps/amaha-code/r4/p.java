package r4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes.dex */
public final class p extends FilterInputStream {

    /* renamed from: u  reason: collision with root package name */
    public volatile byte[] f30429u;

    /* renamed from: v  reason: collision with root package name */
    public int f30430v;

    /* renamed from: w  reason: collision with root package name */
    public int f30431w;

    /* renamed from: x  reason: collision with root package name */
    public int f30432x;

    /* renamed from: y  reason: collision with root package name */
    public int f30433y;

    /* renamed from: z  reason: collision with root package name */
    public final l4.b f30434z;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public p(InputStream inputStream, l4.b bVar) {
        super(inputStream);
        this.f30432x = -1;
        this.f30434z = bVar;
        this.f30429u = (byte[]) bVar.c(65536, byte[].class);
    }

    public static void g() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i6 = this.f30432x;
        if (i6 != -1) {
            int i10 = this.f30433y - i6;
            int i11 = this.f30431w;
            if (i10 < i11) {
                if (i6 == 0 && i11 > bArr.length && this.f30430v == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f30434z.c(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f30429u = bArr2;
                    this.f30434z.put(bArr);
                    bArr = bArr2;
                } else if (i6 > 0) {
                    System.arraycopy(bArr, i6, bArr, 0, bArr.length - i6);
                }
                int i12 = this.f30433y - this.f30432x;
                this.f30433y = i12;
                this.f30432x = 0;
                this.f30430v = 0;
                int read = inputStream.read(bArr, i12, bArr.length - i12);
                int i13 = this.f30433y;
                if (read > 0) {
                    i13 += read;
                }
                this.f30430v = i13;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f30432x = -1;
            this.f30433y = 0;
            this.f30430v = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f30429u != null && inputStream != null) {
        } else {
            g();
            throw null;
        }
        return (this.f30430v - this.f30433y) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f30429u != null) {
            this.f30434z.put(this.f30429u);
            this.f30429u = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void e() {
        if (this.f30429u != null) {
            this.f30434z.put(this.f30429u);
            this.f30429u = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i6) {
        this.f30431w = Math.max(this.f30431w, i6);
        this.f30432x = this.f30433y;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f30429u;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f30433y < this.f30430v || a(inputStream, bArr) != -1) {
                if (bArr != this.f30429u && (bArr = this.f30429u) == null) {
                    g();
                    throw null;
                }
                int i6 = this.f30430v;
                int i10 = this.f30433y;
                if (i6 - i10 > 0) {
                    this.f30433y = i10 + 1;
                    return bArr[i10] & 255;
                }
                return -1;
            }
            return -1;
        }
        g();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f30429u != null) {
            int i6 = this.f30432x;
            if (-1 != i6) {
                this.f30433y = i6;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f30433y + " markLimit: " + this.f30431w);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f30429u;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i6 = this.f30430v;
                int i10 = this.f30433y;
                if (i6 - i10 >= j10) {
                    this.f30433y = (int) (i10 + j10);
                    return j10;
                }
                long j11 = i6 - i10;
                this.f30433y = i6;
                if (this.f30432x != -1 && j10 <= this.f30431w) {
                    if (a(inputStream, bArr) == -1) {
                        return j11;
                    }
                    int i11 = this.f30430v;
                    int i12 = this.f30433y;
                    if (i11 - i12 >= j10 - j11) {
                        this.f30433y = (int) ((i12 + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + i11) - i12;
                    this.f30433y = i11;
                    return j12;
                }
                return j11 + inputStream.skip(j10 - j11);
            }
            g();
            throw null;
        }
        g();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i6, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f30429u;
        if (bArr2 == null) {
            g();
            throw null;
        } else if (i10 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i13 = this.f30433y;
                int i14 = this.f30430v;
                if (i13 < i14) {
                    int i15 = i14 - i13;
                    if (i15 >= i10) {
                        i15 = i10;
                    }
                    System.arraycopy(bArr2, i13, bArr, i6, i15);
                    this.f30433y += i15;
                    if (i15 == i10 || inputStream.available() == 0) {
                        return i15;
                    }
                    i6 += i15;
                    i11 = i10 - i15;
                } else {
                    i11 = i10;
                }
                while (true) {
                    if (this.f30432x == -1 && i11 >= bArr2.length) {
                        i12 = inputStream.read(bArr, i6, i11);
                        if (i12 == -1) {
                            return i11 != i10 ? i10 - i11 : -1;
                        }
                    } else if (a(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    } else {
                        if (bArr2 != this.f30429u && (bArr2 = this.f30429u) == null) {
                            g();
                            throw null;
                        }
                        int i16 = this.f30430v;
                        int i17 = this.f30433y;
                        i12 = i16 - i17;
                        if (i12 >= i11) {
                            i12 = i11;
                        }
                        System.arraycopy(bArr2, i17, bArr, i6, i12);
                        this.f30433y += i12;
                    }
                    i11 -= i12;
                    if (i11 == 0) {
                        return i10;
                    }
                    if (inputStream.available() == 0) {
                        return i10 - i11;
                    }
                    i6 += i12;
                }
            } else {
                g();
                throw null;
            }
        }
    }
}
