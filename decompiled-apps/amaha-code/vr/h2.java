package vr;

import io.grpc.StatusRuntimeException;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import tr.f;
import vr.i3;
import vr.s2;
/* compiled from: MessageDeframer.java */
/* loaded from: classes2.dex */
public final class h2 implements Closeable, z {
    public byte[] A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public v F;
    public v G;
    public long H;
    public boolean I;
    public boolean J;
    public volatile boolean K;

    /* renamed from: u  reason: collision with root package name */
    public a f35679u;

    /* renamed from: v  reason: collision with root package name */
    public int f35680v;

    /* renamed from: w  reason: collision with root package name */
    public final g3 f35681w;

    /* renamed from: x  reason: collision with root package name */
    public final m3 f35682x;

    /* renamed from: y  reason: collision with root package name */
    public tr.n f35683y;

    /* renamed from: z  reason: collision with root package name */
    public v0 f35684z;

    /* compiled from: MessageDeframer.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(i3.a aVar);

        void c(boolean z10);

        void d(int i6);

        void e(Throwable th2);
    }

    /* compiled from: MessageDeframer.java */
    /* loaded from: classes2.dex */
    public static class b implements i3.a {

        /* renamed from: u  reason: collision with root package name */
        public InputStream f35685u;

        public b(InputStream inputStream) {
            this.f35685u = inputStream;
        }

        @Override // vr.i3.a
        public final InputStream next() {
            InputStream inputStream = this.f35685u;
            this.f35685u = null;
            return inputStream;
        }
    }

    public h2(a aVar, int i6, g3 g3Var, m3 m3Var) {
        f.b bVar = f.b.f33465a;
        this.C = 1;
        this.D = 5;
        this.G = new v();
        this.I = false;
        this.J = false;
        this.K = false;
        sc.b.w(aVar, "sink");
        this.f35679u = aVar;
        this.f35683y = bVar;
        this.f35680v = i6;
        this.f35681w = g3Var;
        sc.b.w(m3Var, "transportTracer");
        this.f35682x = m3Var;
    }

    public final boolean G() {
        g3 g3Var = this.f35681w;
        int i6 = 0;
        try {
            if (this.F == null) {
                this.F = new v();
            }
            int i10 = 0;
            while (true) {
                try {
                    int i11 = this.D - this.F.f36009w;
                    if (i11 > 0) {
                        if (this.f35684z != null) {
                            try {
                                byte[] bArr = this.A;
                                if (bArr == null || this.B == bArr.length) {
                                    this.A = new byte[Math.min(i11, 2097152)];
                                    this.B = 0;
                                }
                                int a10 = this.f35684z.a(this.B, this.A, Math.min(i11, this.A.length - this.B));
                                v0 v0Var = this.f35684z;
                                int i12 = v0Var.G;
                                v0Var.G = 0;
                                i10 += i12;
                                v0Var.H = 0;
                                if (a10 == 0) {
                                    if (i10 > 0) {
                                        this.f35679u.d(i10);
                                        if (this.C == 2) {
                                            if (this.f35684z != null) {
                                                g3Var.a();
                                            } else {
                                                g3Var.a();
                                            }
                                        }
                                    }
                                    return false;
                                }
                                v vVar = this.F;
                                byte[] bArr2 = this.A;
                                int i13 = this.B;
                                s2.b bVar = s2.f35952a;
                                vVar.e(new s2.b(i13, bArr2, a10));
                                this.B += a10;
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            } catch (DataFormatException e11) {
                                throw new RuntimeException(e11);
                            }
                        } else {
                            int i14 = this.G.f36009w;
                            if (i14 == 0) {
                                if (i10 > 0) {
                                    this.f35679u.d(i10);
                                    if (this.C == 2) {
                                        if (this.f35684z != null) {
                                            g3Var.a();
                                        } else {
                                            g3Var.a();
                                        }
                                    }
                                }
                                return false;
                            }
                            int min = Math.min(i11, i14);
                            i10 += min;
                            this.F.e(this.G.y(min));
                        }
                    } else if (i10 > 0) {
                        this.f35679u.d(i10);
                        if (this.C == 2) {
                            if (this.f35684z != null) {
                                g3Var.a();
                                return true;
                            }
                            g3Var.a();
                            return true;
                        }
                        return true;
                    } else {
                        return true;
                    }
                } catch (Throwable th2) {
                    int i15 = i10;
                    th = th2;
                    i6 = i15;
                    if (i6 > 0) {
                        this.f35679u.d(i6);
                        if (this.C == 2) {
                            if (this.f35684z != null) {
                                g3Var.a();
                            } else {
                                g3Var.a();
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void a() {
        if (this.I) {
            return;
        }
        boolean z10 = true;
        this.I = true;
        while (!this.K && this.H > 0 && G()) {
            try {
                int d10 = v.h.d(this.C);
                if (d10 != 0) {
                    if (d10 == 1) {
                        o();
                        this.H--;
                    } else {
                        throw new AssertionError("Invalid state: " + pl.a.m(this.C));
                    }
                } else {
                    s();
                }
            } catch (Throwable th2) {
                this.I = false;
                throw th2;
            }
        }
        if (this.K) {
            close();
            this.I = false;
            return;
        }
        if (this.J) {
            v0 v0Var = this.f35684z;
            if (v0Var != null) {
                sc.b.B("GzipInflatingBuffer is closed", true ^ v0Var.C);
                z10 = v0Var.I;
            } else if (this.G.f36009w != 0) {
                z10 = false;
            }
            if (z10) {
                close();
            }
        }
        this.I = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
        if (r0 == false) goto L22;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable, vr.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        boolean z10;
        boolean z11;
        if (isClosed()) {
            return;
        }
        v vVar = this.F;
        boolean z12 = false;
        if (vVar != null && vVar.f36009w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            v0 v0Var = this.f35684z;
            if (v0Var != null) {
                if (!z10) {
                    sc.b.B("GzipInflatingBuffer is closed", !v0Var.C);
                    if (v0Var.f36013w.d() == 0 && v0Var.B == 1) {
                        z11 = false;
                    }
                    z11 = true;
                }
                z12 = true;
                this.f35684z.close();
                z10 = z12;
            }
            v vVar2 = this.G;
            if (vVar2 != null) {
                vVar2.close();
            }
            v vVar3 = this.F;
            if (vVar3 != null) {
                vVar3.close();
            }
            this.f35684z = null;
            this.G = null;
            this.F = null;
            this.f35679u.c(z10);
        } catch (Throwable th2) {
            this.f35684z = null;
            this.G = null;
            this.F = null;
            throw th2;
        }
    }

    @Override // vr.z
    public final void e(int i6) {
        boolean z10;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.s("numMessages must be > 0", z10);
        if (isClosed()) {
            return;
        }
        this.H += i6;
        a();
    }

    @Override // vr.z
    public final void g(int i6) {
        this.f35680v = i6;
    }

    @Override // vr.z
    public final void h(tr.n nVar) {
        boolean z10;
        if (this.f35684z == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.B("Already set full stream decompressor", z10);
        this.f35683y = nVar;
    }

    public final boolean isClosed() {
        if (this.G == null && this.f35684z == null) {
            return true;
        }
        return false;
    }

    @Override // vr.z
    public final void j() {
        boolean z10;
        if (isClosed()) {
            return;
        }
        v0 v0Var = this.f35684z;
        if (v0Var != null) {
            sc.b.B("GzipInflatingBuffer is closed", !v0Var.C);
            z10 = v0Var.I;
        } else if (this.G.f36009w == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            close();
        } else {
            this.J = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:3:0x0006, B:5:0x000d, B:11:0x0017, B:13:0x001b, B:16:0x002d), top: B:29:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // vr.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(r2 r2Var) {
        boolean z10;
        sc.b.w(r2Var, "data");
        boolean z11 = true;
        try {
            if (!isClosed() && !this.J) {
                z10 = false;
                if (!z10) {
                    v0 v0Var = this.f35684z;
                    if (v0Var != null) {
                        sc.b.B("GzipInflatingBuffer is closed", !v0Var.C);
                        v0Var.f36011u.e(r2Var);
                        v0Var.I = false;
                    } else {
                        this.G.e(r2Var);
                    }
                    try {
                        a();
                        z11 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = false;
                        if (z11) {
                            r2Var.close();
                        }
                        throw th;
                    }
                }
                if (!z11) {
                    r2Var.close();
                    return;
                }
                return;
            }
            z10 = true;
            if (!z10) {
            }
            if (!z11) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void o() {
        InputStream aVar;
        g3 g3Var = this.f35681w;
        for (com.android.volley.toolbox.a aVar2 : g3Var.f35635a) {
            aVar2.getClass();
        }
        if (this.E) {
            tr.n nVar = this.f35683y;
            if (nVar != f.b.f33465a) {
                try {
                    v vVar = this.F;
                    s2.b bVar = s2.f35952a;
                    aVar = new c(nVar.b(new s2.a(vVar)), this.f35680v, g3Var);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new StatusRuntimeException(tr.i0.f33487l.g("Can't decode compressed gRPC message as compression not configured"));
            }
        } else {
            int i6 = this.F.f36009w;
            for (com.android.volley.toolbox.a aVar3 : g3Var.f35635a) {
                aVar3.getClass();
            }
            v vVar2 = this.F;
            s2.b bVar2 = s2.f35952a;
            aVar = new s2.a(vVar2);
        }
        this.F = null;
        this.f35679u.a(new b(aVar));
        this.C = 1;
        this.D = 5;
    }

    public final void s() {
        boolean z10;
        int readUnsignedByte = this.F.readUnsignedByte();
        if ((readUnsignedByte & 254) == 0) {
            if ((readUnsignedByte & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.E = z10;
            v vVar = this.F;
            vVar.a(4);
            int readUnsignedByte2 = vVar.readUnsignedByte() | (vVar.readUnsignedByte() << 24) | (vVar.readUnsignedByte() << 16) | (vVar.readUnsignedByte() << 8);
            this.D = readUnsignedByte2;
            if (readUnsignedByte2 >= 0 && readUnsignedByte2 <= this.f35680v) {
                for (com.android.volley.toolbox.a aVar : this.f35681w.f35635a) {
                    aVar.getClass();
                }
                m3 m3Var = this.f35682x;
                m3Var.f35770b.add(1L);
                m3Var.f35769a.a();
                this.C = 2;
                return;
            }
            throw new StatusRuntimeException(tr.i0.f33486k.g(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f35680v), Integer.valueOf(this.D))));
        }
        throw new StatusRuntimeException(tr.i0.f33487l.g("gRPC frame header malformed: reserved bits not zero"));
    }

    /* compiled from: MessageDeframer.java */
    /* loaded from: classes2.dex */
    public static final class c extends FilterInputStream {

        /* renamed from: u  reason: collision with root package name */
        public final int f35686u;

        /* renamed from: v  reason: collision with root package name */
        public final g3 f35687v;

        /* renamed from: w  reason: collision with root package name */
        public long f35688w;

        /* renamed from: x  reason: collision with root package name */
        public long f35689x;

        /* renamed from: y  reason: collision with root package name */
        public long f35690y;

        public c(InputStream inputStream, int i6, g3 g3Var) {
            super(inputStream);
            this.f35690y = -1L;
            this.f35686u = i6;
            this.f35687v = g3Var;
        }

        public final void a() {
            if (this.f35689x > this.f35688w) {
                for (com.android.volley.toolbox.a aVar : this.f35687v.f35635a) {
                    aVar.getClass();
                }
                this.f35688w = this.f35689x;
            }
        }

        public final void e() {
            long j10 = this.f35689x;
            int i6 = this.f35686u;
            if (j10 <= i6) {
                return;
            }
            tr.i0 i0Var = tr.i0.f33486k;
            throw new StatusRuntimeException(i0Var.g("Decompressed gRPC message exceeds maximum size " + i6));
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i6) {
            ((FilterInputStream) this).in.mark(i6);
            this.f35690y = this.f35689x;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f35689x++;
            }
            e();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f35690y != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f35689x = this.f35690y;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j10) {
            long skip = ((FilterInputStream) this).in.skip(j10);
            this.f35689x += skip;
            e();
            a();
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i6, int i10) {
            int read = ((FilterInputStream) this).in.read(bArr, i6, i10);
            if (read != -1) {
                this.f35689x += read;
            }
            e();
            a();
            return read;
        }
    }
}
