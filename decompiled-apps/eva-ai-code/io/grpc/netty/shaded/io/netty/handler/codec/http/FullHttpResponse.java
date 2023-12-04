package io.grpc.netty.shaded.io.netty.handler.codec.http;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
/* loaded from: classes4.dex */
public interface FullHttpResponse extends HttpResponse, FullHttpMessage {
    FullHttpResponse copy();

    FullHttpResponse duplicate();

    FullHttpResponse replace(ByteBuf byteBuf);

    FullHttpResponse retain();

    FullHttpResponse retain(int i);

    FullHttpResponse retainedDuplicate();

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpResponse, io.grpc.netty.shaded.io.netty.handler.codec.http.HttpMessage, io.grpc.netty.shaded.io.netty.handler.codec.http.HttpRequest, io.grpc.netty.shaded.io.netty.handler.codec.http.FullHttpRequest
    FullHttpResponse setProtocolVersion(HttpVersion httpVersion);

    @Override // 
    FullHttpResponse setStatus(HttpResponseStatus httpResponseStatus);

    FullHttpResponse touch();

    FullHttpResponse touch(Object obj);
}
