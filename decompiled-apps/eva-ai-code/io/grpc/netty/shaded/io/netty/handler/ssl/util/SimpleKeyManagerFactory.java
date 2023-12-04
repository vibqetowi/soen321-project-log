package io.grpc.netty.shaded.io.netty.handler.ssl.util;

import io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Provider;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;
/* loaded from: classes4.dex */
public abstract class SimpleKeyManagerFactory extends KeyManagerFactory {
    private static final Provider PROVIDER = new Provider("", 0.0d, "") { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleKeyManagerFactory.1
        private static final long serialVersionUID = -2680540247105807895L;
    };
    private static final FastThreadLocal<SimpleKeyManagerFactorySpi> CURRENT_SPI = new FastThreadLocal<SimpleKeyManagerFactorySpi>() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleKeyManagerFactory.2
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal
        public SimpleKeyManagerFactorySpi initialValue() {
            return new SimpleKeyManagerFactorySpi();
        }
    };

    protected abstract KeyManager[] engineGetKeyManagers();

    protected abstract void engineInit(KeyStore keyStore, char[] cArr) throws Exception;

    protected abstract void engineInit(ManagerFactoryParameters managerFactoryParameters) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleKeyManagerFactory() {
        this("");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected SimpleKeyManagerFactory(String str) {
        super(r0.get(), PROVIDER, (String) ObjectUtil.checkNotNull(str, "name"));
        FastThreadLocal<SimpleKeyManagerFactorySpi> fastThreadLocal = CURRENT_SPI;
        fastThreadLocal.get().init(this);
        fastThreadLocal.remove();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SimpleKeyManagerFactorySpi extends KeyManagerFactorySpi {
        private volatile KeyManager[] keyManagers;
        private SimpleKeyManagerFactory parent;

        private SimpleKeyManagerFactorySpi() {
        }

        void init(SimpleKeyManagerFactory simpleKeyManagerFactory) {
            this.parent = simpleKeyManagerFactory;
        }

        @Override // javax.net.ssl.KeyManagerFactorySpi
        protected void engineInit(KeyStore keyStore, char[] cArr) throws KeyStoreException {
            try {
                this.parent.engineInit(keyStore, cArr);
            } catch (KeyStoreException e) {
                throw e;
            } catch (Exception e2) {
                throw new KeyStoreException(e2);
            }
        }

        @Override // javax.net.ssl.KeyManagerFactorySpi
        protected void engineInit(ManagerFactoryParameters managerFactoryParameters) throws InvalidAlgorithmParameterException {
            try {
                this.parent.engineInit(managerFactoryParameters);
            } catch (InvalidAlgorithmParameterException e) {
                throw e;
            } catch (Exception e2) {
                throw new InvalidAlgorithmParameterException(e2);
            }
        }

        @Override // javax.net.ssl.KeyManagerFactorySpi
        protected KeyManager[] engineGetKeyManagers() {
            KeyManager[] keyManagerArr = this.keyManagers;
            if (keyManagerArr == null) {
                keyManagerArr = this.parent.engineGetKeyManagers();
                if (PlatformDependent.javaVersion() >= 7) {
                    wrapIfNeeded(keyManagerArr);
                }
                this.keyManagers = keyManagerArr;
            }
            return (KeyManager[]) keyManagerArr.clone();
        }

        private static void wrapIfNeeded(KeyManager[] keyManagerArr) {
            for (int i = 0; i < keyManagerArr.length; i++) {
                KeyManager keyManager = keyManagerArr[i];
                if ((keyManager instanceof X509KeyManager) && !(keyManager instanceof X509ExtendedKeyManager)) {
                    keyManagerArr[i] = new X509KeyManagerWrapper((X509KeyManager) keyManager);
                }
            }
        }
    }
}
