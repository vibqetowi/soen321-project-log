package io.grpc.netty.shaded.io.netty.handler.codec.http2;

import io.grpc.netty.shaded.io.netty.channel.ChannelDuplexHandler;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
/* loaded from: classes4.dex */
public abstract class Http2ChannelDuplexHandler extends ChannelDuplexHandler {
    private volatile Http2FrameCodec frameCodec;

    protected void handlerAdded0(ChannelHandlerContext channelHandlerContext) throws Exception {
    }

    protected void handlerRemoved0(ChannelHandlerContext channelHandlerContext) throws Exception {
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
    public final void handlerAdded(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.frameCodec = requireHttp2FrameCodec(channelHandlerContext);
        handlerAdded0(channelHandlerContext);
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.ChannelHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelHandler
    public final void handlerRemoved(ChannelHandlerContext channelHandlerContext) throws Exception {
        try {
            handlerRemoved0(channelHandlerContext);
        } finally {
            this.frameCodec = null;
        }
    }

    public final Http2FrameStream newStream() {
        Http2FrameCodec http2FrameCodec = this.frameCodec;
        if (http2FrameCodec == null) {
            throw new IllegalStateException(StringUtil.simpleClassName((Class<?>) Http2FrameCodec.class) + " not found. Has the handler been added to a pipeline?");
        }
        return http2FrameCodec.newStream();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void forEachActiveStream(Http2FrameStreamVisitor http2FrameStreamVisitor) throws Http2Exception {
        this.frameCodec.forEachActiveStream(http2FrameStreamVisitor);
    }

    private static Http2FrameCodec requireHttp2FrameCodec(ChannelHandlerContext channelHandlerContext) {
        ChannelHandlerContext context = channelHandlerContext.pipeline().context(Http2FrameCodec.class);
        if (context == null) {
            throw new IllegalArgumentException("Http2FrameCodec was not found in the channel pipeline.");
        }
        return (Http2FrameCodec) context.handler();
    }
}
