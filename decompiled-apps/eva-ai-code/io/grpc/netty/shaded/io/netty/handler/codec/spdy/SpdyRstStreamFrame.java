package io.grpc.netty.shaded.io.netty.handler.codec.spdy;
/* loaded from: classes4.dex */
public interface SpdyRstStreamFrame extends SpdyStreamFrame {
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.spdy.SpdyStreamFrame, io.grpc.netty.shaded.io.netty.handler.codec.spdy.SpdyDataFrame
    SpdyRstStreamFrame setLast(boolean z);

    SpdyRstStreamFrame setStatus(SpdyStreamStatus spdyStreamStatus);

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.spdy.SpdyStreamFrame, io.grpc.netty.shaded.io.netty.handler.codec.spdy.SpdyDataFrame
    SpdyRstStreamFrame setStreamId(int i);

    SpdyStreamStatus status();
}
