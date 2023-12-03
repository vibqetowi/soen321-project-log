package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
/* compiled from: PoolingByteArrayOutputStream.java */
/* loaded from: classes.dex */
public final class k extends ByteArrayOutputStream {

    /* renamed from: u  reason: collision with root package name */
    public final c f5899u;

    public k(c cVar, int i6) {
        this.f5899u = cVar;
        ((ByteArrayOutputStream) this).buf = cVar.a(Math.max(i6, 256));
    }

    public final void a(int i6) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i6 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        c cVar = this.f5899u;
        byte[] a10 = cVar.a((i10 + i6) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a10, 0, ((ByteArrayOutputStream) this).count);
        cVar.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a10;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5899u.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f5899u.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i6, int i10) {
        a(i10);
        super.write(bArr, i6, i10);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i6) {
        a(1);
        super.write(i6);
    }
}
