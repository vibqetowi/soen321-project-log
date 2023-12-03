package zv;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* compiled from: BufferedSource.kt */
/* loaded from: classes2.dex */
public interface h extends z, ReadableByteChannel {
    boolean B();

    void C0(long j10);

    int F0(q qVar);

    long I0();

    InputStream J0();

    String L(long j10);

    long S(e eVar);

    String V(Charset charset);

    e c();

    boolean d0(long j10);

    String j0();

    i p(long j10);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    long u(i iVar);
}
