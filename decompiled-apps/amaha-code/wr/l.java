package wr;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import ta.v;
import vr.r2;
import zv.u;
/* compiled from: OkHttpReadableBuffer.java */
/* loaded from: classes2.dex */
public final class l extends vr.c {

    /* renamed from: u  reason: collision with root package name */
    public final zv.e f37184u;

    public l(zv.e eVar) {
        this.f37184u = eVar;
    }

    @Override // vr.r2
    public final void D0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // vr.r2
    public final void K(int i6, byte[] bArr, int i10) {
        while (i10 > 0) {
            int read = this.f37184u.read(bArr, i6, i10);
            if (read != -1) {
                i10 -= read;
                i6 += read;
            } else {
                throw new IndexOutOfBoundsException(defpackage.c.q("EOF trying to read ", i10, " bytes"));
            }
        }
    }

    @Override // vr.r2
    public final int b() {
        return (int) this.f37184u.f39885v;
    }

    @Override // vr.c, vr.r2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37184u.a();
    }

    @Override // vr.r2
    public final void r0(OutputStream out, int i6) {
        long j10 = i6;
        zv.e eVar = this.f37184u;
        eVar.getClass();
        kotlin.jvm.internal.i.g(out, "out");
        v.m(eVar.f39885v, 0L, j10);
        u uVar = eVar.f39884u;
        while (j10 > 0) {
            kotlin.jvm.internal.i.d(uVar);
            int min = (int) Math.min(j10, uVar.f39920c - uVar.f39919b);
            out.write(uVar.f39918a, uVar.f39919b, min);
            int i10 = uVar.f39919b + min;
            uVar.f39919b = i10;
            long j11 = min;
            eVar.f39885v -= j11;
            j10 -= j11;
            if (i10 == uVar.f39920c) {
                u a10 = uVar.a();
                eVar.f39884u = a10;
                zv.v.a(uVar);
                uVar = a10;
            }
        }
    }

    @Override // vr.r2
    public final int readUnsignedByte() {
        try {
            return this.f37184u.readByte() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // vr.r2
    public final void skipBytes(int i6) {
        try {
            this.f37184u.skip(i6);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // vr.r2
    public final r2 y(int i6) {
        zv.e eVar = new zv.e();
        eVar.n(this.f37184u, i6);
        return new l(eVar);
    }
}
