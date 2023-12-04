package io.grpc.netty.shaded.io.netty.handler.codec.rtsp;

import io.grpc.netty.shaded.io.netty.channel.ChannelHandler;
import io.grpc.netty.shaded.io.netty.handler.codec.http.FullHttpMessage;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpMessage;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpObjectEncoder;
@ChannelHandler.Sharable
@Deprecated
/* loaded from: classes4.dex */
public abstract class RtspObjectEncoder<H extends HttpMessage> extends HttpObjectEncoder<H> {
    protected RtspObjectEncoder() {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpObjectEncoder, io.grpc.netty.shaded.io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(Object obj) throws Exception {
        return obj instanceof FullHttpMessage;
    }
}
