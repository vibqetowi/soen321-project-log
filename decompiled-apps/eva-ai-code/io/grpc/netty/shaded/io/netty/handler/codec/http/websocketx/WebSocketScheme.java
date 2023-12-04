package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx;

import io.grpc.internal.GrpcUtil;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
/* loaded from: classes4.dex */
public final class WebSocketScheme {
    public static final WebSocketScheme WS = new WebSocketScheme(80, "ws");
    public static final WebSocketScheme WSS = new WebSocketScheme(GrpcUtil.DEFAULT_PORT_SSL, "wss");
    private final AsciiString name;
    private final int port;

    private WebSocketScheme(int i, String str) {
        this.port = i;
        this.name = AsciiString.cached(str);
    }

    public AsciiString name() {
        return this.name;
    }

    public int port() {
        return this.port;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WebSocketScheme) {
            WebSocketScheme webSocketScheme = (WebSocketScheme) obj;
            return webSocketScheme.port() == this.port && webSocketScheme.name().equals(this.name);
        }
        return false;
    }

    public int hashCode() {
        return (this.port * 31) + this.name.hashCode();
    }

    public String toString() {
        return this.name.toString();
    }
}
