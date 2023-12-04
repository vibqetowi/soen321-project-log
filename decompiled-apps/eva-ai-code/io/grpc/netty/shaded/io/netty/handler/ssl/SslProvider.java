package io.grpc.netty.shaded.io.netty.handler.ssl;
/* loaded from: classes4.dex */
public enum SslProvider {
    JDK,
    OPENSSL,
    OPENSSL_REFCNT;

    /* renamed from: io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$SslProvider;

        static {
            int[] iArr = new int[SslProvider.values().length];
            $SwitchMap$io$netty$handler$ssl$SslProvider = iArr;
            try {
                iArr[SslProvider.JDK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$SslProvider[SslProvider.OPENSSL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$ssl$SslProvider[SslProvider.OPENSSL_REFCNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean isAlpnSupported(SslProvider sslProvider) {
        int i = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider[sslProvider.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return OpenSsl.isAlpnSupported();
            }
            throw new Error("Unknown SslProvider: " + sslProvider);
        }
        return JdkAlpnApplicationProtocolNegotiator.isAlpnSupported();
    }

    public static boolean isTlsv13Supported(SslProvider sslProvider) {
        int i = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider[sslProvider.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return OpenSsl.isTlsv13Supported();
            }
            throw new Error("Unknown SslProvider: " + sslProvider);
        }
        return SslUtils.isTLSv13SupportedByJDK();
    }

    static boolean isTlsv13EnabledByDefault(SslProvider sslProvider) {
        int i = AnonymousClass1.$SwitchMap$io$netty$handler$ssl$SslProvider[sslProvider.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return OpenSsl.isTlsv13Supported();
            }
            throw new Error("Unknown SslProvider: " + sslProvider);
        }
        return SslUtils.isTLSv13EnabledByJDK();
    }
}
