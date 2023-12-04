package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleTrustManagerFactory;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
/* loaded from: classes4.dex */
final class TrustManagerFactoryWrapper extends SimpleTrustManagerFactory {
    private final TrustManager tm;

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected void engineInit(KeyStore keyStore) throws Exception {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected void engineInit(ManagerFactoryParameters managerFactoryParameters) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TrustManagerFactoryWrapper(TrustManager trustManager) {
        this.tm = (TrustManager) ObjectUtil.checkNotNull(trustManager, "tm");
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleTrustManagerFactory
    protected TrustManager[] engineGetTrustManagers() {
        return new TrustManager[]{this.tm};
    }
}
