package gf;

import java.io.IOException;
import java.io.InputStream;
import kf.i;
import lf.h;
/* compiled from: InstrHttpInputStream.java */
/* loaded from: classes.dex */
public final class a extends InputStream {

    /* renamed from: u  reason: collision with root package name */
    public final InputStream f16469u;

    /* renamed from: v  reason: collision with root package name */
    public final ef.d f16470v;

    /* renamed from: w  reason: collision with root package name */
    public final i f16471w;

    /* renamed from: y  reason: collision with root package name */
    public long f16473y;

    /* renamed from: x  reason: collision with root package name */
    public long f16472x = -1;

    /* renamed from: z  reason: collision with root package name */
    public long f16474z = -1;

    public a(InputStream inputStream, ef.d dVar, i iVar) {
        this.f16471w = iVar;
        this.f16469u = inputStream;
        this.f16470v = dVar;
        this.f16473y = ((h) dVar.f13953x.f10073v).i0();
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.f16469u.available();
        } catch (IOException e10) {
            long a10 = this.f16471w.a();
            ef.d dVar = this.f16470v;
            dVar.j(a10);
            g.c(dVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ef.d dVar = this.f16470v;
        i iVar = this.f16471w;
        long a10 = iVar.a();
        if (this.f16474z == -1) {
            this.f16474z = a10;
        }
        try {
            this.f16469u.close();
            long j10 = this.f16472x;
            if (j10 != -1) {
                dVar.i(j10);
            }
            long j11 = this.f16473y;
            if (j11 != -1) {
                h.a aVar = dVar.f13953x;
                aVar.u();
                h.T((h) aVar.f10073v, j11);
            }
            dVar.j(this.f16474z);
            dVar.b();
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i6) {
        this.f16469u.mark(i6);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f16469u.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        i iVar = this.f16471w;
        ef.d dVar = this.f16470v;
        try {
            int read = this.f16469u.read();
            long a10 = iVar.a();
            if (this.f16473y == -1) {
                this.f16473y = a10;
            }
            if (read == -1 && this.f16474z == -1) {
                this.f16474z = a10;
                dVar.j(a10);
                dVar.b();
            } else {
                long j10 = this.f16472x + 1;
                this.f16472x = j10;
                dVar.i(j10);
            }
            return read;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.f16469u.reset();
        } catch (IOException e10) {
            long a10 = this.f16471w.a();
            ef.d dVar = this.f16470v;
            dVar.j(a10);
            g.c(dVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        i iVar = this.f16471w;
        ef.d dVar = this.f16470v;
        try {
            long skip = this.f16469u.skip(j10);
            long a10 = iVar.a();
            if (this.f16473y == -1) {
                this.f16473y = a10;
            }
            if (skip == -1 && this.f16474z == -1) {
                this.f16474z = a10;
                dVar.j(a10);
            } else {
                long j11 = this.f16472x + skip;
                this.f16472x = j11;
                dVar.i(j11);
            }
            return skip;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        i iVar = this.f16471w;
        ef.d dVar = this.f16470v;
        try {
            int read = this.f16469u.read(bArr, i6, i10);
            long a10 = iVar.a();
            if (this.f16473y == -1) {
                this.f16473y = a10;
            }
            if (read == -1 && this.f16474z == -1) {
                this.f16474z = a10;
                dVar.j(a10);
                dVar.b();
            } else {
                long j10 = this.f16472x + read;
                this.f16472x = j10;
                dVar.i(j10);
            }
            return read;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        i iVar = this.f16471w;
        ef.d dVar = this.f16470v;
        try {
            int read = this.f16469u.read(bArr);
            long a10 = iVar.a();
            if (this.f16473y == -1) {
                this.f16473y = a10;
            }
            if (read == -1 && this.f16474z == -1) {
                this.f16474z = a10;
                dVar.j(a10);
                dVar.b();
            } else {
                long j10 = this.f16472x + read;
                this.f16472x = j10;
                dVar.i(j10);
            }
            return read;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }
}
