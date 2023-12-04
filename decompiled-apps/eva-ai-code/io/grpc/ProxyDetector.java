package io.grpc;

import java.io.IOException;
import java.net.SocketAddress;
import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public interface ProxyDetector {
    @Nullable
    ProxiedSocketAddress proxyFor(SocketAddress socketAddress) throws IOException;
}
