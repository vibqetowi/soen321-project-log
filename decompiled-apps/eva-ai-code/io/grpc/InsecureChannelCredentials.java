package io.grpc;
/* loaded from: classes4.dex */
public final class InsecureChannelCredentials extends ChannelCredentials {
    @Override // io.grpc.ChannelCredentials
    public ChannelCredentials withoutBearerTokens() {
        return this;
    }

    public static ChannelCredentials create() {
        return new InsecureChannelCredentials();
    }

    private InsecureChannelCredentials() {
    }
}
