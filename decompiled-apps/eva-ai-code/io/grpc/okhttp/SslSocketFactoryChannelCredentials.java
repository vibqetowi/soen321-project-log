package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes4.dex */
public final class SslSocketFactoryChannelCredentials {
    private SslSocketFactoryChannelCredentials() {
    }

    public static io.grpc.ChannelCredentials create(SSLSocketFactory sSLSocketFactory) {
        return new ChannelCredentials(sSLSocketFactory);
    }

    /* loaded from: classes4.dex */
    static final class ChannelCredentials extends io.grpc.ChannelCredentials {
        private final SSLSocketFactory factory;

        @Override // io.grpc.ChannelCredentials
        public io.grpc.ChannelCredentials withoutBearerTokens() {
            return this;
        }

        private ChannelCredentials(SSLSocketFactory sSLSocketFactory) {
            this.factory = (SSLSocketFactory) Preconditions.checkNotNull(sSLSocketFactory, "factory");
        }

        public SSLSocketFactory getFactory() {
            return this.factory;
        }
    }
}
