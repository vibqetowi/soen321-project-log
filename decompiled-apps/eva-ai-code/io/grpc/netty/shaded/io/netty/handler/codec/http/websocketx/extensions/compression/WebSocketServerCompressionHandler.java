package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.compression;

import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandler;
/* loaded from: classes4.dex */
public class WebSocketServerCompressionHandler extends WebSocketServerExtensionHandler {
    public WebSocketServerCompressionHandler() {
        super(new PerMessageDeflateServerExtensionHandshaker(), new DeflateFrameServerExtensionHandshaker());
    }
}
