package io.grpc.netty.shaded.io.netty.channel;

import io.grpc.netty.shaded.io.netty.util.ReferenceCounted;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes4.dex */
public interface FileRegion extends ReferenceCounted {
    long count();

    long position();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    FileRegion retain();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    FileRegion retain(int i);

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    FileRegion touch();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    FileRegion touch(Object obj);

    long transferTo(WritableByteChannel writableByteChannel, long j) throws IOException;

    @Deprecated
    long transfered();

    long transferred();
}
