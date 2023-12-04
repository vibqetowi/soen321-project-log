package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
/* loaded from: classes4.dex */
public class DefaultHttp2PingFrame implements Http2PingFrame {
    private final boolean ack;
    private final long content;

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2Frame
    public String name() {
        return "PING";
    }

    public DefaultHttp2PingFrame(long j) {
        this(j, false);
    }

    public DefaultHttp2PingFrame(long j, boolean z) {
        this.content = j;
        this.ack = z;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2PingFrame
    public boolean ack() {
        return this.ack;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http2.Http2PingFrame
    public long content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Http2PingFrame) {
            Http2PingFrame http2PingFrame = (Http2PingFrame) obj;
            return this.ack == http2PingFrame.ack() && this.content == http2PingFrame.content();
        }
        return false;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.ack ? 1 : 0);
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "(content=" + this.content + ", ack=" + this.ack + ')';
    }
}
