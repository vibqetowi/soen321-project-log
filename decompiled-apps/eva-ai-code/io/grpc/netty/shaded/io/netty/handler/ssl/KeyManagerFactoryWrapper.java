package io.grpc.netty.shaded.io.netty.handler.ssl;

import io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleKeyManagerFactory;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.security.KeyStore;
import javax.net.ssl.KeyManager;
import javax.net.ssl.ManagerFactoryParameters;
/* loaded from: classes4.dex */
final class KeyManagerFactoryWrapper extends SimpleKeyManagerFactory {
    private final KeyManager km;

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleKeyManagerFactory
    protected void engineInit(KeyStore keyStore, char[] cArr) throws Exception {
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleKeyManagerFactory
    protected void engineInit(ManagerFactoryParameters managerFactoryParameters) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyManagerFactoryWrapper(KeyManager keyManager) {
        this.km = (KeyManager) ObjectUtil.checkNotNull(keyManager, "km");
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleKeyManagerFactory
    protected KeyManager[] engineGetKeyManagers() {
        return new KeyManager[]{this.km};
    }
}
