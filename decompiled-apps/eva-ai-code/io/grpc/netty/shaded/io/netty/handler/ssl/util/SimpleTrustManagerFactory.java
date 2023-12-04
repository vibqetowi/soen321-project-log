package io.grpc.netty.shaded.io.netty.handler.ssl.util;

import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Provider;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.TrustManagerFactorySpi;
import javax.net.ssl.X509TrustManager;
/* loaded from: classes4.dex */
public abstract class SimpleTrustManagerFactory extends TrustManagerFactory {
    private static final Provider PROVIDER = new Provider("", 0.0d, "") { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleTrustManagerFactory.1
        private static final long serialVersionUID = -2680540247105807895L;
    };
    private static final FastThreadLocal<SimpleTrustManagerFactorySpi> CURRENT_SPI = new FastThreadLocal<SimpleTrustManagerFactorySpi>() { // from class: io.grpc.netty.shaded.io.netty.handler.ssl.util.SimpleTrustManagerFactory.2
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.grpc.netty.shaded.io.netty.util.concurrent.FastThreadLocal
        public SimpleTrustManagerFactorySpi initialValue() {
            return new SimpleTrustManagerFactorySpi();
        }
    };

    protected abstract TrustManager[] engineGetTrustManagers();

    protected abstract void engineInit(KeyStore keyStore) throws Exception;

    protected abstract void engineInit(ManagerFactoryParameters managerFactoryParameters) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleTrustManagerFactory() {
        this("");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected SimpleTrustManagerFactory(String str) {
        super(r0.get(), PROVIDER, str);
        FastThreadLocal<SimpleTrustManagerFactorySpi> fastThreadLocal = CURRENT_SPI;
        fastThreadLocal.get().init(this);
        fastThreadLocal.remove();
        ObjectUtil.checkNotNull(str, "name");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class SimpleTrustManagerFactorySpi extends TrustManagerFactorySpi {
        private SimpleTrustManagerFactory parent;
        private volatile TrustManager[] trustManagers;

        SimpleTrustManagerFactorySpi() {
        }

        void init(SimpleTrustManagerFactory simpleTrustManagerFactory) {
            this.parent = simpleTrustManagerFactory;
        }

        @Override // javax.net.ssl.TrustManagerFactorySpi
        protected void engineInit(KeyStore keyStore) throws KeyStoreException {
            try {
                this.parent.engineInit(keyStore);
            } catch (KeyStoreException e) {
                throw e;
            } catch (Exception e2) {
                throw new KeyStoreException(e2);
            }
        }

        @Override // javax.net.ssl.TrustManagerFactorySpi
        protected void engineInit(ManagerFactoryParameters managerFactoryParameters) throws InvalidAlgorithmParameterException {
            try {
                this.parent.engineInit(managerFactoryParameters);
            } catch (InvalidAlgorithmParameterException e) {
                throw e;
            } catch (Exception e2) {
                throw new InvalidAlgorithmParameterException(e2);
            }
        }

        @Override // javax.net.ssl.TrustManagerFactorySpi
        protected TrustManager[] engineGetTrustManagers() {
            TrustManager[] trustManagerArr = this.trustManagers;
            if (trustManagerArr == null) {
                trustManagerArr = this.parent.engineGetTrustManagers();
                if (PlatformDependent.javaVersion() >= 7) {
                    wrapIfNeeded(trustManagerArr);
                }
                this.trustManagers = trustManagerArr;
            }
            return (TrustManager[]) trustManagerArr.clone();
        }

        private static void wrapIfNeeded(TrustManager[] trustManagerArr) {
            for (int i = 0; i < trustManagerArr.length; i++) {
                TrustManager trustManager = trustManagerArr[i];
                if ((trustManager instanceof X509TrustManager) && !CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m$2(trustManager)) {
                    trustManagerArr[i] = new X509TrustManagerWrapper((X509TrustManager) trustManager);
                }
            }
        }
    }
}
