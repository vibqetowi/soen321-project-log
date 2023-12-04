package io.grpc.netty.shaded.io.netty.handler.codec.http2;
/* loaded from: classes4.dex */
public interface Http2HeadersFrame extends Http2StreamFrame {
    Http2Headers headers();

    boolean isEndStream();

    int padding();
}
