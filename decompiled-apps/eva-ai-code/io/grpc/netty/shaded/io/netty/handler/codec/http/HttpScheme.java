package io.grpc.netty.shaded.io.netty.handler.codec.http;

import io.grpc.internal.GrpcUtil;
import io.grpc.netty.shaded.io.netty.util.AsciiString;
import org.apache.http.HttpHost;
/* loaded from: classes4.dex */
public final class HttpScheme {
    public static final HttpScheme HTTP = new HttpScheme(80, HttpHost.DEFAULT_SCHEME_NAME);
    public static final HttpScheme HTTPS = new HttpScheme(GrpcUtil.DEFAULT_PORT_SSL, "https");
    private final AsciiString name;
    private final int port;

    private HttpScheme(int i, String str) {
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
        if (obj instanceof HttpScheme) {
            HttpScheme httpScheme = (HttpScheme) obj;
            return httpScheme.port() == this.port && httpScheme.name().equals(this.name);
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
