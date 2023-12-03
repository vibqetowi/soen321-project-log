package zv;

import com.appsflyer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: RealBufferedSource.kt */
/* loaded from: classes2.dex */
public final class t implements h {

    /* renamed from: u  reason: collision with root package name */
    public final z f39914u;

    /* renamed from: v  reason: collision with root package name */
    public final e f39915v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f39916w;

    public t(z source) {
        kotlin.jvm.internal.i.g(source, "source");
        this.f39914u = source;
        this.f39915v = new e();
    }

    @Override // zv.h
    public final boolean B() {
        if (!this.f39916w) {
            e eVar = this.f39915v;
            if (eVar.B() && this.f39914u.o0(eVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.h
    public final void C0(long j10) {
        if (d0(j10)) {
            return;
        }
        throw new EOFException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        return -1;
     */
    @Override // zv.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F0(q options) {
        kotlin.jvm.internal.i.g(options, "options");
        if (!(!this.f39916w)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            e eVar = this.f39915v;
            int b10 = aw.a.b(eVar, options, true);
            if (b10 != -2) {
                if (b10 != -1) {
                    eVar.skip(options.f39907u[b10].h());
                    return b10;
                }
            } else if (this.f39914u.o0(eVar, 8192L) == -1) {
                break;
            }
        }
    }

    @Override // zv.h
    public final long I0() {
        e eVar;
        byte m10;
        C0(1L);
        int i6 = 0;
        while (true) {
            int i10 = i6 + 1;
            boolean d02 = d0(i10);
            eVar = this.f39915v;
            if (!d02) {
                break;
            }
            m10 = eVar.m(i6);
            if ((m10 < ((byte) 48) || m10 > ((byte) 57)) && ((m10 < ((byte) 97) || m10 > ((byte) R.styleable.AppCompatTheme_textAppearanceLargePopupMenu)) && (m10 < ((byte) 65) || m10 > ((byte) 70)))) {
                break;
            }
            i6 = i10;
        }
        if (i6 == 0) {
            ca.a.x(16);
            ca.a.x(16);
            String num = Integer.toString(m10, 16);
            kotlin.jvm.internal.i.f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new NumberFormatException(kotlin.jvm.internal.i.n(num, "Expected leading [0-9a-fA-F] character but was 0x"));
        }
        return eVar.I0();
    }

    @Override // zv.h
    public final InputStream J0() {
        return new a();
    }

    @Override // zv.h
    public final String L(long j10) {
        boolean z10;
        long j11;
        e eVar;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long a10 = a(b10, 0L, j11);
            e eVar2 = this.f39915v;
            if (a10 != -1) {
                return aw.a.a(eVar2, a10);
            }
            if (j11 < Long.MAX_VALUE && d0(j11) && eVar2.m(j11 - 1) == ((byte) 13) && d0(1 + j11) && eVar2.m(j11) == b10) {
                return aw.a.a(eVar2, j11);
            }
            eVar2.j(new e(), 0L, Math.min(32, eVar2.f39885v));
            throw new EOFException("\\n not found: limit=" + Math.min(eVar2.f39885v, j10) + " content=" + eVar.e0().i() + (char) 8230);
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "limit < 0: ").toString());
    }

    @Override // zv.h
    public final long S(e eVar) {
        e eVar2;
        long j10 = 0;
        while (true) {
            z zVar = this.f39914u;
            eVar2 = this.f39915v;
            if (zVar.o0(eVar2, 8192L) == -1) {
                break;
            }
            long h10 = eVar2.h();
            if (h10 > 0) {
                j10 += h10;
                eVar.n(eVar2, h10);
            }
        }
        long j11 = eVar2.f39885v;
        if (j11 > 0) {
            long j12 = j10 + j11;
            eVar.n(eVar2, j11);
            return j12;
        }
        return j10;
    }

    @Override // zv.h
    public final String V(Charset charset) {
        e eVar = this.f39915v;
        eVar.K0(this.f39914u);
        return eVar.h0(eVar.f39885v, charset);
    }

    public final long a(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f39916w) {
            long j12 = 0;
            if (0 > j11) {
                z10 = false;
            }
            if (z10) {
                while (j12 < j11) {
                    long G = this.f39915v.G(b10, j12, j11);
                    if (G != -1) {
                        return G;
                    }
                    e eVar = this.f39915v;
                    long j13 = eVar.f39885v;
                    if (j13 >= j11 || this.f39914u.o0(eVar, 8192L) == -1) {
                        return -1L;
                    }
                    j12 = Math.max(j12, j13);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // zv.h, zv.g
    public final e c() {
        return this.f39915v;
    }

    @Override // zv.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f39916w) {
            this.f39916w = true;
            this.f39914u.close();
            this.f39915v.a();
        }
    }

    @Override // zv.z
    public final a0 d() {
        return this.f39914u.d();
    }

    @Override // zv.h
    public final boolean d0(long j10) {
        boolean z10;
        e eVar;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.f39916w) {
                do {
                    eVar = this.f39915v;
                    if (eVar.f39885v >= j10) {
                        return true;
                    }
                } while (this.f39914u.o0(eVar, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r10 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        ca.a.x(16);
        ca.a.x(16);
        r1 = java.lang.Integer.toString(r8, 16);
        kotlin.jvm.internal.i.f(r1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        throw new java.lang.NumberFormatException(kotlin.jvm.internal.i.n(r1, "Expected a digit or '-' but was 0x"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e() {
        e eVar;
        C0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            boolean d02 = d0(j11);
            eVar = this.f39915v;
            if (!d02) {
                break;
            }
            byte m10 = eVar.m(j10);
            if ((m10 < ((byte) 48) || m10 > ((byte) 57)) && !(j10 == 0 && m10 == ((byte) 45))) {
                break;
            }
            j10 = j11;
        }
        return eVar.f0();
    }

    public final int g() {
        C0(4L);
        int readInt = this.f39915v.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f39916w;
    }

    @Override // zv.h
    public final String j0() {
        return L(Long.MAX_VALUE);
    }

    @Override // zv.z
    public final long o0(e sink, long j10) {
        boolean z10;
        kotlin.jvm.internal.i.g(sink, "sink");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (true ^ this.f39916w) {
                e eVar = this.f39915v;
                if (eVar.f39885v == 0 && this.f39914u.o0(eVar, 8192L) == -1) {
                    return -1L;
                }
                return eVar.o0(sink, Math.min(j10, eVar.f39885v));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.i.n(Long.valueOf(j10), "byteCount < 0: ").toString());
    }

    @Override // zv.h
    public final i p(long j10) {
        C0(j10);
        return this.f39915v.p(j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.g(sink, "sink");
        e eVar = this.f39915v;
        if (eVar.f39885v == 0 && this.f39914u.o0(eVar, 8192L) == -1) {
            return -1;
        }
        return eVar.read(sink);
    }

    @Override // zv.h
    public final byte readByte() {
        C0(1L);
        return this.f39915v.readByte();
    }

    @Override // zv.h
    public final int readInt() {
        C0(4L);
        return this.f39915v.readInt();
    }

    @Override // zv.h
    public final short readShort() {
        C0(2L);
        return this.f39915v.readShort();
    }

    @Override // zv.h
    public final void skip(long j10) {
        if (!this.f39916w) {
            while (j10 > 0) {
                e eVar = this.f39915v;
                if (eVar.f39885v == 0 && this.f39914u.o0(eVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, eVar.f39885v);
                eVar.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f39914u + ')';
    }

    @Override // zv.h
    public final long u(i targetBytes) {
        kotlin.jvm.internal.i.g(targetBytes, "targetBytes");
        if (!this.f39916w) {
            long j10 = 0;
            while (true) {
                e eVar = this.f39915v;
                long J = eVar.J(targetBytes, j10);
                if (J == -1) {
                    long j11 = eVar.f39885v;
                    if (this.f39914u.o0(eVar, 8192L) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, j11);
                } else {
                    return J;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* compiled from: RealBufferedSource.kt */
    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() {
            t tVar = t.this;
            if (!tVar.f39916w) {
                return (int) Math.min(tVar.f39915v.f39885v, (long) SubsamplingScaleImageView.TILE_SIZE_AUTO);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            t.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            t tVar = t.this;
            if (!tVar.f39916w) {
                e eVar = tVar.f39915v;
                if (eVar.f39885v == 0 && tVar.f39914u.o0(eVar, 8192L) == -1) {
                    return -1;
                }
                return tVar.f39915v.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return t.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] data, int i6, int i10) {
            kotlin.jvm.internal.i.g(data, "data");
            t tVar = t.this;
            if (!tVar.f39916w) {
                ta.v.m(data.length, i6, i10);
                e eVar = tVar.f39915v;
                if (eVar.f39885v == 0 && tVar.f39914u.o0(eVar, 8192L) == -1) {
                    return -1;
                }
                return tVar.f39915v.read(data, i6, i10);
            }
            throw new IOException("closed");
        }
    }
}
