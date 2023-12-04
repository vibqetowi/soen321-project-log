package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.channel.ChannelPipeline;
import io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator;
/* loaded from: classes4.dex */
public class WebSocketFrameAggregator extends MessageAggregator<WebSocketFrame, WebSocketFrame, ContinuationWebSocketFrame, WebSocketFrame> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    public boolean isContentLengthInvalid(WebSocketFrame webSocketFrame, int i) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    public Object newContinueResponse(WebSocketFrame webSocketFrame, int i, ChannelPipeline channelPipeline) {
        return null;
    }

    public WebSocketFrameAggregator(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    public boolean isStartMessage(WebSocketFrame webSocketFrame) throws Exception {
        return (webSocketFrame instanceof TextWebSocketFrame) || (webSocketFrame instanceof BinaryWebSocketFrame);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    public boolean isContentMessage(WebSocketFrame webSocketFrame) throws Exception {
        return webSocketFrame instanceof ContinuationWebSocketFrame;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    public boolean isLastContentMessage(ContinuationWebSocketFrame continuationWebSocketFrame) throws Exception {
        return isContentMessage((WebSocketFrame) continuationWebSocketFrame) && continuationWebSocketFrame.isFinalFragment();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    public boolean isAggregated(WebSocketFrame webSocketFrame) throws Exception {
        if (webSocketFrame.isFinalFragment()) {
            return !isContentMessage(webSocketFrame);
        }
        return (isStartMessage(webSocketFrame) || isContentMessage(webSocketFrame)) ? false : true;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    protected boolean closeAfterContinueResponse(Object obj) throws Exception {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    protected boolean ignoreContentAfterContinueResponse(Object obj) throws Exception {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.MessageAggregator
    public WebSocketFrame beginAggregation(WebSocketFrame webSocketFrame, ByteBuf byteBuf) throws Exception {
        if (webSocketFrame instanceof TextWebSocketFrame) {
            return new TextWebSocketFrame(true, webSocketFrame.rsv(), byteBuf);
        }
        if (webSocketFrame instanceof BinaryWebSocketFrame) {
            return new BinaryWebSocketFrame(true, webSocketFrame.rsv(), byteBuf);
        }
        throw new Error();
    }
}
