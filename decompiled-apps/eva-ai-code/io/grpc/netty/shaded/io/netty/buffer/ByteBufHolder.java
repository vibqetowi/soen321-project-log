package io.grpc.netty.shaded.io.netty.buffer;

import io.grpc.netty.shaded.io.netty.util.ReferenceCounted;
/* loaded from: classes4.dex */
public interface ByteBufHolder extends ReferenceCounted {
    ByteBuf content();

    ByteBufHolder copy();

    ByteBufHolder duplicate();

    ByteBufHolder replace(ByteBuf byteBuf);

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    ByteBufHolder retain();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    ByteBufHolder retain(int i);

    ByteBufHolder retainedDuplicate();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    ByteBufHolder touch();

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    ByteBufHolder touch(Object obj);
}
