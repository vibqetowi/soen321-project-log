package od;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: QueueFile.java */
/* loaded from: classes.dex */
public final class f implements Closeable {
    public static final Logger A = Logger.getLogger(f.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public final RandomAccessFile f27357u;

    /* renamed from: v  reason: collision with root package name */
    public int f27358v;

    /* renamed from: w  reason: collision with root package name */
    public int f27359w;

    /* renamed from: x  reason: collision with root package name */
    public a f27360x;

    /* renamed from: y  reason: collision with root package name */
    public a f27361y;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f27362z;

    /* compiled from: QueueFile.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f27363c = new a(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f27364a;

        /* renamed from: b  reason: collision with root package name */
        public final int f27365b;

        public a(int i6, int i10) {
            this.f27364a = i6;
            this.f27365b = i10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f27364a);
            sb2.append(", length = ");
            return pl.a.g(sb2, this.f27365b, "]");
        }
    }

    public f(File file) {
        byte[] bArr = new byte[16];
        this.f27362z = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i6 = 0;
                int i10 = 0;
                for (int i11 = 4; i6 < i11; i11 = 4) {
                    int i12 = iArr[i6];
                    bArr2[i10] = (byte) (i12 >> 24);
                    bArr2[i10 + 1] = (byte) (i12 >> 16);
                    bArr2[i10 + 2] = (byte) (i12 >> 8);
                    bArr2[i10 + 3] = (byte) i12;
                    i10 += 4;
                    i6++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f27357u = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int m10 = m(bArr, 0);
        this.f27358v = m10;
        if (m10 <= randomAccessFile2.length()) {
            this.f27359w = m(bArr, 4);
            int m11 = m(bArr, 8);
            int m12 = m(bArr, 12);
            this.f27360x = j(m11);
            this.f27361y = j(m12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f27358v + ", Actual length: " + randomAccessFile2.length());
    }

    public static int m(byte[] bArr, int i6) {
        return ((bArr[i6] & 255) << 24) + ((bArr[i6 + 1] & 255) << 16) + ((bArr[i6 + 2] & 255) << 8) + (bArr[i6 + 3] & 255);
    }

    public final void G(int i6, int i10, byte[] bArr) {
        int J = J(i6);
        int i11 = J + i10;
        int i12 = this.f27358v;
        RandomAccessFile randomAccessFile = this.f27357u;
        if (i11 <= i12) {
            randomAccessFile.seek(J);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - J;
        randomAccessFile.seek(J);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, 0 + i13, i10 - i13);
    }

    public final int I() {
        if (this.f27359w == 0) {
            return 16;
        }
        a aVar = this.f27361y;
        int i6 = aVar.f27364a;
        int i10 = this.f27360x.f27364a;
        if (i6 >= i10) {
            return (i6 - i10) + 4 + aVar.f27365b + 16;
        }
        return (((i6 + 4) + aVar.f27365b) + this.f27358v) - i10;
    }

    public final int J(int i6) {
        int i10 = this.f27358v;
        if (i6 >= i10) {
            return (i6 + 16) - i10;
        }
        return i6;
    }

    public final void O(int i6, int i10, int i11, int i12) {
        int i13 = 0;
        int[] iArr = {i6, i10, i11, i12};
        int i14 = 0;
        while (true) {
            byte[] bArr = this.f27362z;
            if (i13 < 4) {
                int i15 = iArr[i13];
                bArr[i14] = (byte) (i15 >> 24);
                bArr[i14 + 1] = (byte) (i15 >> 16);
                bArr[i14 + 2] = (byte) (i15 >> 8);
                bArr[i14 + 3] = (byte) i15;
                i14 += 4;
                i13++;
            } else {
                RandomAccessFile randomAccessFile = this.f27357u;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    public final void a(byte[] bArr) {
        int J;
        int i6;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    g(length);
                    boolean h10 = h();
                    if (h10) {
                        J = 16;
                    } else {
                        a aVar = this.f27361y;
                        J = J(aVar.f27364a + 4 + aVar.f27365b);
                    }
                    a aVar2 = new a(J, length);
                    byte[] bArr2 = this.f27362z;
                    bArr2[0] = (byte) (length >> 24);
                    bArr2[1] = (byte) (length >> 16);
                    bArr2[2] = (byte) (length >> 8);
                    bArr2[3] = (byte) length;
                    G(J, 4, bArr2);
                    G(J + 4, length, bArr);
                    if (h10) {
                        i6 = J;
                    } else {
                        i6 = this.f27360x.f27364a;
                    }
                    O(this.f27358v, this.f27359w + 1, i6, J);
                    this.f27361y = aVar2;
                    this.f27359w++;
                    if (h10) {
                        this.f27360x = aVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f27357u.close();
    }

    public final synchronized void e() {
        O(4096, 0, 0, 0);
        this.f27359w = 0;
        a aVar = a.f27363c;
        this.f27360x = aVar;
        this.f27361y = aVar;
        if (this.f27358v > 4096) {
            RandomAccessFile randomAccessFile = this.f27357u;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f27358v = 4096;
    }

    public final void g(int i6) {
        int i10 = i6 + 4;
        int I = this.f27358v - I();
        if (I >= i10) {
            return;
        }
        int i11 = this.f27358v;
        do {
            I += i11;
            i11 <<= 1;
        } while (I < i10);
        RandomAccessFile randomAccessFile = this.f27357u;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        a aVar = this.f27361y;
        int J = J(aVar.f27364a + 4 + aVar.f27365b);
        if (J < this.f27360x.f27364a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f27358v);
            long j10 = J - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.f27361y.f27364a;
        int i13 = this.f27360x.f27364a;
        if (i12 < i13) {
            int i14 = (this.f27358v + i12) - 16;
            O(i11, this.f27359w, i13, i14);
            this.f27361y = new a(i14, this.f27361y.f27365b);
        } else {
            O(i11, this.f27359w, i13, i12);
        }
        this.f27358v = i11;
    }

    public final synchronized boolean h() {
        boolean z10;
        if (this.f27359w == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final a j(int i6) {
        if (i6 == 0) {
            return a.f27363c;
        }
        RandomAccessFile randomAccessFile = this.f27357u;
        randomAccessFile.seek(i6);
        return new a(i6, randomAccessFile.readInt());
    }

    public final synchronized void o() {
        if (!h()) {
            if (this.f27359w == 1) {
                e();
            } else {
                a aVar = this.f27360x;
                int J = J(aVar.f27364a + 4 + aVar.f27365b);
                s(J, 0, 4, this.f27362z);
                int m10 = m(this.f27362z, 0);
                O(this.f27358v, this.f27359w - 1, J, this.f27361y.f27364a);
                this.f27359w--;
                this.f27360x = new a(J, m10);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void s(int i6, int i10, int i11, byte[] bArr) {
        int J = J(i6);
        int i12 = J + i11;
        int i13 = this.f27358v;
        RandomAccessFile randomAccessFile = this.f27357u;
        if (i12 <= i13) {
            randomAccessFile.seek(J);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - J;
        randomAccessFile.seek(J);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f27358v);
        sb2.append(", size=");
        sb2.append(this.f27359w);
        sb2.append(", first=");
        sb2.append(this.f27360x);
        sb2.append(", last=");
        sb2.append(this.f27361y);
        sb2.append(", element lengths=[");
        try {
            synchronized (this) {
                int i6 = this.f27360x.f27364a;
                boolean z10 = true;
                for (int i10 = 0; i10 < this.f27359w; i10++) {
                    a j10 = j(i6);
                    new b(j10);
                    int i11 = j10.f27365b;
                    if (z10) {
                        z10 = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i11);
                    i6 = J(j10.f27364a + 4 + j10.f27365b);
                }
            }
        } catch (IOException e10) {
            A.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* compiled from: QueueFile.java */
    /* loaded from: classes.dex */
    public final class b extends InputStream {

        /* renamed from: u  reason: collision with root package name */
        public int f27366u;

        /* renamed from: v  reason: collision with root package name */
        public int f27367v;

        public b(a aVar) {
            this.f27366u = f.this.J(aVar.f27364a + 4);
            this.f27367v = aVar.f27365b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i10) {
            if (bArr != null) {
                if ((i6 | i10) >= 0 && i10 <= bArr.length - i6) {
                    int i11 = this.f27367v;
                    if (i11 > 0) {
                        if (i10 > i11) {
                            i10 = i11;
                        }
                        int i12 = this.f27366u;
                        f fVar = f.this;
                        fVar.s(i12, i6, i10, bArr);
                        this.f27366u = fVar.J(this.f27366u + i10);
                        this.f27367v -= i10;
                        return i10;
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            throw new NullPointerException("buffer");
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f27367v == 0) {
                return -1;
            }
            f fVar = f.this;
            fVar.f27357u.seek(this.f27366u);
            int read = fVar.f27357u.read();
            this.f27366u = fVar.J(this.f27366u + 1);
            this.f27367v--;
            return read;
        }
    }
}
