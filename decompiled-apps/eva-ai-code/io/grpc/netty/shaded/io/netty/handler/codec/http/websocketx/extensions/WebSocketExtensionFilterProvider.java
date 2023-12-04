package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions;
/* loaded from: classes4.dex */
public interface WebSocketExtensionFilterProvider {
    public static final WebSocketExtensionFilterProvider DEFAULT = new WebSocketExtensionFilterProvider() { // from class: io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider.1
        @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider
        public WebSocketExtensionFilter encoderFilter() {
            return WebSocketExtensionFilter.NEVER_SKIP;
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions.WebSocketExtensionFilterProvider
        public WebSocketExtensionFilter decoderFilter() {
            return WebSocketExtensionFilter.NEVER_SKIP;
        }
    };

    WebSocketExtensionFilter decoderFilter();

    WebSocketExtensionFilter encoderFilter();
}
