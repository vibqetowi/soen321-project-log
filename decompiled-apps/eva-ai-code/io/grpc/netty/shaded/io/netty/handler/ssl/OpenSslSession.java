package io.grpc.netty.shaded.io.netty.handler.ssl;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public interface OpenSslSession extends SSLSession {
    void handshakeFinished() throws SSLException;

    void tryExpandApplicationBufferSize(int i);
}
