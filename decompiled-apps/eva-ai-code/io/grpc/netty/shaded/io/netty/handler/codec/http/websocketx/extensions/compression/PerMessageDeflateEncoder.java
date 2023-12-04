package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.compression;

import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilter;
import java.util.List;
/* loaded from: classes4.dex */
class PerMessageDeflateEncoder extends DeflateEncoder {
    private boolean compressing;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.compression.DeflateEncoder, io.grpc.netty.shaded.io.netty.handler.codec.MessageToMessageEncoder
    public /* bridge */ /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, List list) throws Exception {
        encode(channelHandlerContext, webSocketFrame, (List<Object>) list);
    }

    PerMessageDeflateEncoder(int i, int i2, boolean z) {
        super(i, i2, z, WebSocketExtensionFilter.NEVER_SKIP);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PerMessageDeflateEncoder(int i, int i2, boolean z, WebSocketExtensionFilter webSocketExtensionFilter) {
        super(i, i2, z, webSocketExtensionFilter);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageToMessageEncoder
    public boolean acceptOutboundMessage(Object obj) throws Exception {
        if (super.acceptOutboundMessage(obj)) {
            WebSocketFrame webSocketFrame = (WebSocketFrame) obj;
            if (!extensionEncoderFilter().mustSkip(webSocketFrame)) {
                return (((webSocketFrame instanceof TextWebSocketFrame) || (webSocketFrame instanceof BinaryWebSocketFrame)) && (webSocketFrame.rsv() & 4) == 0) || ((webSocketFrame instanceof ContinuationWebSocketFrame) && this.compressing);
            } else if (this.compressing) {
                throw new IllegalStateException("Cannot skip per message deflate encoder, compression in progress");
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.compression.DeflateEncoder
    protected int rsv(WebSocketFrame webSocketFrame) {
        return ((webSocketFrame instanceof TextWebSocketFrame) || (webSocketFrame instanceof BinaryWebSocketFrame)) ? webSocketFrame.rsv() | 4 : webSocketFrame.rsv();
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.compression.DeflateEncoder
    protected boolean removeFrameTail(WebSocketFrame webSocketFrame) {
        return webSocketFrame.isFinalFragment();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.compression.DeflateEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, List<Object> list) throws Exception {
        super.encode2(channelHandlerContext, webSocketFrame, list);
        if (webSocketFrame.isFinalFragment()) {
            this.compressing = false;
        } else if ((webSocketFrame instanceof TextWebSocketFrame) || (webSocketFrame instanceof BinaryWebSocketFrame)) {
            this.compressing = true;
        }
    }
}
