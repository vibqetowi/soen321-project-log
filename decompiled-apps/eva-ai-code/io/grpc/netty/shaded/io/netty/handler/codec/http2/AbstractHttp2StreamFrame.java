package io.grpc.netty.shaded.io.netty.handler.codec.http2;
/* loaded from: classes4.dex */
public abstract class AbstractHttp2StreamFrame implements Http2StreamFrame {
    private Http2FrameStream stream;

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2StreamFrame
    public AbstractHttp2StreamFrame stream(Http2FrameStream http2FrameStream) {
        this.stream = http2FrameStream;
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2StreamFrame
    public Http2FrameStream stream() {
        return this.stream;
    }

    public boolean equals(Object obj) {
        Http2FrameStream http2FrameStream;
        if (obj instanceof Http2StreamFrame) {
            Http2StreamFrame http2StreamFrame = (Http2StreamFrame) obj;
            return this.stream == http2StreamFrame.stream() || ((http2FrameStream = this.stream) != null && http2FrameStream.equals(http2StreamFrame.stream()));
        }
        return false;
    }

    public int hashCode() {
        Http2FrameStream http2FrameStream = this.stream;
        if (http2FrameStream == null) {
            return super.hashCode();
        }
        return http2FrameStream.hashCode();
    }
}
