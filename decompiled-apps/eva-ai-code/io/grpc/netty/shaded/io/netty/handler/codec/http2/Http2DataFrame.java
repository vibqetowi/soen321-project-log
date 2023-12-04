package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.ByteBufHolder;
/* loaded from: classes4.dex */
public interface Http2DataFrame extends Http2StreamFrame, ByteBufHolder {
    ByteBuf content();

    Http2DataFrame copy();

    Http2DataFrame duplicate();

    int initialFlowControlledBytes();

    boolean isEndStream();

    int padding();

    Http2DataFrame replace(ByteBuf byteBuf);

    Http2DataFrame retain();

    Http2DataFrame retain(int i);

    Http2DataFrame retainedDuplicate();

    Http2DataFrame touch();

    Http2DataFrame touch(Object obj);
}
