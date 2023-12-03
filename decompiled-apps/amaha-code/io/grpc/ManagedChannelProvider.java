package io.grpc;
/* loaded from: classes2.dex */
public abstract class ManagedChannelProvider {

    /* loaded from: classes2.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
        public ProviderNotFoundException() {
            super("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
        }
    }

    public abstract k<?> a(String str);

    public abstract boolean b();

    public abstract int c();
}
