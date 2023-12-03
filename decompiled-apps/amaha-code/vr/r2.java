package vr;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;
/* compiled from: ReadableBuffer.java */
/* loaded from: classes2.dex */
public interface r2 extends Closeable {
    void D0(ByteBuffer byteBuffer);

    void K(int i6, byte[] bArr, int i10);

    void a0();

    int b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean markSupported();

    void r0(OutputStream outputStream, int i6);

    int readUnsignedByte();

    void reset();

    void skipBytes(int i6);

    r2 y(int i6);
}
