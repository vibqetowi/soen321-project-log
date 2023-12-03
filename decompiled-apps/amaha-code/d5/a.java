package d5;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ByteBufferUtil.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f12178a = 0;

    /* compiled from: ByteBufferUtil.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12181a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12182b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12183c;

        public b(int i6, byte[] bArr, int i10) {
            this.f12183c = bArr;
            this.f12181a = i6;
            this.f12182b = i10;
        }
    }

    static {
        new AtomicReference();
    }

    public static MappedByteBuffer a(File file) {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        try {
                            MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                            try {
                                fileChannel.close();
                            } catch (IOException unused) {
                            }
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused2) {
                            }
                            return load;
                        } catch (Throwable th3) {
                            th2 = th3;
                            Throwable th4 = th2;
                            fileChannel2 = fileChannel;
                            th = th4;
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        fileChannel = null;
                    }
                } else {
                    throw new IOException("File unsuitable for memory mapping");
                }
            } else {
                throw new IOException("File too large to map into memory");
            }
        } catch (Throwable th6) {
            th = th6;
            randomAccessFile = null;
        }
    }

    public static void b(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: d5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0184a extends InputStream {

        /* renamed from: u  reason: collision with root package name */
        public final ByteBuffer f12179u;

        /* renamed from: v  reason: collision with root package name */
        public int f12180v = -1;

        public C0184a(ByteBuffer byteBuffer) {
            this.f12179u = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f12179u.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i6) {
            this.f12180v = this.f12179u.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f12179u;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i6 = this.f12180v;
            if (i6 != -1) {
                this.f12179u.position(i6);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f12179u;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j10, available());
            byteBuffer.position((int) (byteBuffer.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i10) {
            ByteBuffer byteBuffer = this.f12179u;
            if (byteBuffer.hasRemaining()) {
                int min = Math.min(i10, available());
                byteBuffer.get(bArr, i6, min);
                return min;
            }
            return -1;
        }
    }
}
