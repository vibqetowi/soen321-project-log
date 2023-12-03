package f4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    public final InputStream f14800u;

    /* renamed from: v  reason: collision with root package name */
    public final Charset f14801v;

    /* renamed from: w  reason: collision with root package name */
    public byte[] f14802w;

    /* renamed from: x  reason: collision with root package name */
    public int f14803x;

    /* renamed from: y  reason: collision with root package name */
    public int f14804y;

    /* compiled from: StrictLineReader.java */
    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i6) {
            super(i6);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i6 = ((ByteArrayOutputStream) this).count;
            if (i6 > 0 && ((ByteArrayOutputStream) this).buf[i6 - 1] == 13) {
                i6--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i6, b.this.f14801v.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(c.f14806a)) {
                this.f14800u = fileInputStream;
                this.f14801v = charset;
                this.f14802w = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final String a() {
        int i6;
        synchronized (this.f14800u) {
            byte[] bArr = this.f14802w;
            if (bArr != null) {
                if (this.f14803x >= this.f14804y) {
                    int read = this.f14800u.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f14803x = 0;
                        this.f14804y = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i10 = this.f14803x; i10 != this.f14804y; i10++) {
                    byte[] bArr2 = this.f14802w;
                    if (bArr2[i10] == 10) {
                        int i11 = this.f14803x;
                        if (i10 != i11) {
                            i6 = i10 - 1;
                            if (bArr2[i6] == 13) {
                                String str = new String(bArr2, i11, i6 - i11, this.f14801v.name());
                                this.f14803x = i10 + 1;
                                return str;
                            }
                        }
                        i6 = i10;
                        String str2 = new String(bArr2, i11, i6 - i11, this.f14801v.name());
                        this.f14803x = i10 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f14804y - this.f14803x) + 80);
                while (true) {
                    byte[] bArr3 = this.f14802w;
                    int i12 = this.f14803x;
                    aVar.write(bArr3, i12, this.f14804y - i12);
                    this.f14804y = -1;
                    byte[] bArr4 = this.f14802w;
                    int read2 = this.f14800u.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f14803x = 0;
                        this.f14804y = read2;
                        for (int i13 = 0; i13 != this.f14804y; i13++) {
                            byte[] bArr5 = this.f14802w;
                            if (bArr5[i13] == 10) {
                                int i14 = this.f14803x;
                                if (i13 != i14) {
                                    aVar.write(bArr5, i14, i13 - i14);
                                }
                                this.f14803x = i13 + 1;
                                return aVar.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f14800u) {
            if (this.f14802w != null) {
                this.f14802w = null;
                this.f14800u.close();
            }
        }
    }
}
