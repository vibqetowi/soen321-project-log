package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.SocketShardsApi;
import com.ifriend.data.socket.SocketUrlProvider;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideUrlProviderFactory implements Factory<SocketUrlProvider> {
    private final Provider<SocketShardsApi> apiProvider;
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<String> urlProvider;

    public MessagesModule_Companion_ProvideUrlProviderFactory(Provider<String> provider, Provider<SocketShardsApi> provider2, Provider<AuthDataProvider> provider3, Provider<Logger> provider4) {
        this.urlProvider = provider;
        this.apiProvider = provider2;
        this.authDataProvider = provider3;
        this.loggerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public SocketUrlProvider get() {
        return provideUrlProvider(this.urlProvider.get(), this.apiProvider.get(), this.authDataProvider.get(), this.loggerProvider.get());
    }

    public static MessagesModule_Companion_ProvideUrlProviderFactory create(Provider<String> provider, Provider<SocketShardsApi> provider2, Provider<AuthDataProvider> provider3, Provider<Logger> provider4) {
        return new MessagesModule_Companion_ProvideUrlProviderFactory(provider, provider2, provider3, provider4);
    }

    public static SocketUrlProvider provideUrlProvider(String str, SocketShardsApi socketShardsApi, AuthDataProvider authDataProvider, Logger logger) {
        return (SocketUrlProvider) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideUrlProvider(str, socketShardsApi, authDataProvider, logger));
    }
}
