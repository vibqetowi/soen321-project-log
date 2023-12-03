package zv;

import java.nio.channels.WritableByteChannel;
/* compiled from: BufferedSink.kt */
/* loaded from: classes2.dex */
public interface g extends x, WritableByteChannel {
    g E0(long j10);

    g H();

    g T(String str);

    g Z(long j10);

    e c();

    @Override // zv.x, java.io.Flushable
    void flush();

    g t0(int i6, byte[] bArr, int i10);

    g write(byte[] bArr);

    g writeByte(int i6);

    g writeInt(int i6);

    g writeShort(int i6);

    g z(i iVar);
}
