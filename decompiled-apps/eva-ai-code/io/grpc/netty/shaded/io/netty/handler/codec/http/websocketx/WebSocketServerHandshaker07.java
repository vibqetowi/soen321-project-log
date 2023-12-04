package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx;

import io.grpc.netty.shaded.io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.grpc.netty.shaded.io.netty.handler.codec.http.FullHttpRequest;
import io.grpc.netty.shaded.io.netty.handler.codec.http.FullHttpResponse;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaderNames;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaderValues;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpResponseStatus;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpVersion;
import io.grpc.netty.shaded.io.netty.util.CharsetUtil;
/* loaded from: classes4.dex */
public class WebSocketServerHandshaker07 extends WebSocketServerHandshaker {
    public static final String WEBSOCKET_07_ACCEPT_GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    public WebSocketServerHandshaker07(String str, String str2, boolean z, int i) {
        this(str, str2, z, i, false);
    }

    public WebSocketServerHandshaker07(String str, String str2, boolean z, int i, boolean z2) {
        this(str, str2, WebSocketDecoderConfig.newBuilder().allowExtensions(z).maxFramePayloadLength(i).allowMaskMismatch(z2).build());
    }

    public WebSocketServerHandshaker07(String str, String str2, WebSocketDecoderConfig webSocketDecoderConfig) {
        super(WebSocketVersion.V07, str, str2, webSocketDecoderConfig);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected FullHttpResponse newHandshakeResponse(FullHttpRequest fullHttpRequest, HttpHeaders httpHeaders) {
        String str = fullHttpRequest.headers().get(HttpHeaderNames.SEC_WEBSOCKET_KEY);
        if (str == null) {
            throw new WebSocketHandshakeException("not a WebSocket request: missing key");
        }
        DefaultFullHttpResponse defaultFullHttpResponse = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.SWITCHING_PROTOCOLS, fullHttpRequest.content().alloc().buffer(0));
        if (httpHeaders != null) {
            defaultFullHttpResponse.headers().add(httpHeaders);
        }
        String base64 = WebSocketUtil.base64(WebSocketUtil.sha1((((Object) str) + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(CharsetUtil.US_ASCII)));
        if (logger.isDebugEnabled()) {
            logger.debug("WebSocket version 07 server handshake key: {}, response: {}.", str, base64);
        }
        defaultFullHttpResponse.headers().set(HttpHeaderNames.UPGRADE, HttpHeaderValues.WEBSOCKET).set(HttpHeaderNames.CONNECTION, HttpHeaderValues.UPGRADE).set(HttpHeaderNames.SEC_WEBSOCKET_ACCEPT, base64);
        String str2 = fullHttpRequest.headers().get(HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL);
        if (str2 != null) {
            String selectSubprotocol = selectSubprotocol(str2);
            if (selectSubprotocol == null) {
                if (logger.isDebugEnabled()) {
                    logger.debug("Requested subprotocol(s) not supported: {}", str2);
                }
            } else {
                defaultFullHttpResponse.headers().add(HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL, selectSubprotocol);
            }
        }
        return defaultFullHttpResponse;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket07FrameDecoder(decoderConfig());
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket07FrameEncoder(false);
    }
}
