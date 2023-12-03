package gf;

import java.io.IOException;
import java.io.OutputStream;
import kf.i;
import lf.h;
/* compiled from: InstrHttpOutputStream.java */
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: u  reason: collision with root package name */
    public final OutputStream f16475u;

    /* renamed from: v  reason: collision with root package name */
    public final i f16476v;

    /* renamed from: w  reason: collision with root package name */
    public final ef.d f16477w;

    /* renamed from: x  reason: collision with root package name */
    public long f16478x = -1;

    public b(OutputStream outputStream, ef.d dVar, i iVar) {
        this.f16475u = outputStream;
        this.f16477w = dVar;
        this.f16476v = iVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10 = this.f16478x;
        ef.d dVar = this.f16477w;
        if (j10 != -1) {
            dVar.f(j10);
        }
        i iVar = this.f16476v;
        long a10 = iVar.a();
        h.a aVar = dVar.f13953x;
        aVar.u();
        h.S((h) aVar.f10073v, a10);
        try {
            this.f16475u.close();
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.f16475u.flush();
        } catch (IOException e10) {
            long a10 = this.f16476v.a();
            ef.d dVar = this.f16477w;
            dVar.j(a10);
            g.c(dVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i6) {
        ef.d dVar = this.f16477w;
        try {
            this.f16475u.write(i6);
            long j10 = this.f16478x + 1;
            this.f16478x = j10;
            dVar.f(j10);
        } catch (IOException e10) {
            defpackage.b.t(this.f16476v, dVar, dVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        ef.d dVar = this.f16477w;
        try {
            this.f16475u.write(bArr);
            long length = this.f16478x + bArr.length;
            this.f16478x = length;
            dVar.f(length);
        } catch (IOException e10) {
            defpackage.b.t(this.f16476v, dVar, dVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i10) {
        ef.d dVar = this.f16477w;
        try {
            this.f16475u.write(bArr, i6, i10);
            long j10 = this.f16478x + i10;
            this.f16478x = j10;
            dVar.f(j10);
        } catch (IOException e10) {
            defpackage.b.t(this.f16476v, dVar, dVar);
            throw e10;
        }
    }
}
