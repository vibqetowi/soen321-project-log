package vr;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
/* compiled from: ReadableBuffers.java */
/* loaded from: classes2.dex */
public final class s2 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f35952a = new b(0, new byte[0], 0);

    /* compiled from: ReadableBuffers.java */
    /* loaded from: classes2.dex */
    public static class b extends c {

        /* renamed from: u  reason: collision with root package name */
        public int f35954u;

        /* renamed from: v  reason: collision with root package name */
        public final int f35955v;

        /* renamed from: w  reason: collision with root package name */
        public final byte[] f35956w;

        /* renamed from: x  reason: collision with root package name */
        public int f35957x = -1;

        public b(int i6, byte[] bArr, int i10) {
            boolean z10;
            boolean z11;
            if (i6 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.s("offset must be >= 0", z10);
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            sc.b.s("length must be >= 0", z11);
            int i11 = i10 + i6;
            sc.b.s("offset + length exceeds array boundary", i11 <= bArr.length);
            this.f35956w = bArr;
            this.f35954u = i6;
            this.f35955v = i11;
        }

        @Override // vr.r2
        public final void D0(ByteBuffer byteBuffer) {
            sc.b.w(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            a(remaining);
            byteBuffer.put(this.f35956w, this.f35954u, remaining);
            this.f35954u += remaining;
        }

        @Override // vr.r2
        public final void K(int i6, byte[] bArr, int i10) {
            System.arraycopy(this.f35956w, this.f35954u, bArr, i6, i10);
            this.f35954u += i10;
        }

        @Override // vr.c, vr.r2
        public final void a0() {
            this.f35957x = this.f35954u;
        }

        @Override // vr.r2
        public final int b() {
            return this.f35955v - this.f35954u;
        }

        @Override // vr.r2
        public final void r0(OutputStream outputStream, int i6) {
            a(i6);
            outputStream.write(this.f35956w, this.f35954u, i6);
            this.f35954u += i6;
        }

        @Override // vr.r2
        public final int readUnsignedByte() {
            a(1);
            int i6 = this.f35954u;
            this.f35954u = i6 + 1;
            return this.f35956w[i6] & 255;
        }

        @Override // vr.c, vr.r2
        public final void reset() {
            int i6 = this.f35957x;
            if (i6 != -1) {
                this.f35954u = i6;
                return;
            }
            throw new InvalidMarkException();
        }

        @Override // vr.r2
        public final void skipBytes(int i6) {
            a(i6);
            this.f35954u += i6;
        }

        @Override // vr.r2
        public final r2 y(int i6) {
            a(i6);
            int i10 = this.f35954u;
            this.f35954u = i10 + i6;
            return new b(i10, this.f35956w, i6);
        }
    }

    /* compiled from: ReadableBuffers.java */
    /* loaded from: classes2.dex */
    public static final class a extends InputStream implements tr.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final r2 f35953u;

        public a(r2 r2Var) {
            sc.b.w(r2Var, "buffer");
            this.f35953u = r2Var;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f35953u.b();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f35953u.close();
        }

        @Override // java.io.InputStream
        public final void mark(int i6) {
            this.f35953u.a0();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.f35953u.markSupported();
        }

        @Override // java.io.InputStream
        public final int read() {
            r2 r2Var = this.f35953u;
            if (r2Var.b() == 0) {
                return -1;
            }
            return r2Var.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public final void reset() {
            this.f35953u.reset();
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            r2 r2Var = this.f35953u;
            int min = (int) Math.min(r2Var.b(), j10);
            r2Var.skipBytes(min);
            return min;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i10) {
            r2 r2Var = this.f35953u;
            if (r2Var.b() == 0) {
                return -1;
            }
            int min = Math.min(r2Var.b(), i10);
            r2Var.K(i6, bArr, min);
            return min;
        }
    }
}
