package vr;

import vr.s2;
/* compiled from: AbstractReadableBuffer.java */
/* loaded from: classes2.dex */
public abstract class c implements r2 {
    public final void a(int i6) {
        if (b() >= i6) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // vr.r2
    public boolean markSupported() {
        return this instanceof s2.b;
    }

    @Override // vr.r2
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // vr.r2
    public void a0() {
    }

    @Override // vr.r2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
