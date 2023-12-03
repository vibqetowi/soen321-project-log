package zv;

import java.io.OutputStream;
/* compiled from: Buffer.kt */
/* loaded from: classes2.dex */
public final class f extends OutputStream {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f39887u;

    public f(e eVar) {
        this.f39887u = eVar;
    }

    public final String toString() {
        return this.f39887u + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i6) {
        this.f39887u.L0(i6);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i6, int i10) {
        kotlin.jvm.internal.i.g(data, "data");
        this.f39887u.y0(i6, data, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }
}
