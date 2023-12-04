package com.squareup.okhttp;

import io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolNames;
import java.io.IOException;
/* loaded from: classes4.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1(ApplicationProtocolNames.HTTP_1_1),
    SPDY_3(ApplicationProtocolNames.SPDY_3_1),
    HTTP_2(ApplicationProtocolNames.HTTP_2);
    
    private final String protocol;

    Protocol(String str) {
        this.protocol = str;
    }

    public static Protocol get(String str) throws IOException {
        Protocol protocol = HTTP_1_0;
        if (str.equals(protocol.protocol)) {
            return protocol;
        }
        Protocol protocol2 = HTTP_1_1;
        if (str.equals(protocol2.protocol)) {
            return protocol2;
        }
        Protocol protocol3 = HTTP_2;
        if (str.equals(protocol3.protocol)) {
            return protocol3;
        }
        Protocol protocol4 = SPDY_3;
        if (str.equals(protocol4.protocol)) {
            return protocol4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
