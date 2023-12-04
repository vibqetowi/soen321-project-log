package io.grpc.netty.shaded.io.netty.handler.codec.http;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
/* loaded from: classes4.dex */
public interface FullHttpMessage extends HttpMessage, LastHttpContent {
    FullHttpMessage copy();

    FullHttpMessage duplicate();

    FullHttpMessage replace(ByteBuf byteBuf);

    FullHttpMessage retain();

    FullHttpMessage retain(int i);

    FullHttpMessage retainedDuplicate();

    FullHttpMessage touch();

    FullHttpMessage touch(Object obj);
}
