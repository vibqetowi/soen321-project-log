package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.socket.SocketUrlProvider;
import com.ifriend.data.socket.mapper.SocketMessageToMessagesSourceMessageMapper;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideControllableMessagesSourceFactory implements Factory<MessagesSource> {
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<SocketMessageToMessagesSourceMessageMapper> socketMessageToMessagesSourceMessageMapperProvider;
    private final Provider<SocketUrlProvider> urlProvider;

    public MessagesModule_Companion_ProvideControllableMessagesSourceFactory(Provider<SocketUrlProvider> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3, Provider<Logger> provider4, Provider<Context> provider5, Provider<SocketMessageToMessagesSourceMessageMapper> provider6) {
        this.urlProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.coroutineDispatchersProvider = provider3;
        this.loggerProvider = provider4;
        this.contextProvider = provider5;
        this.socketMessageToMessagesSourceMessageMapperProvider = provider6;
    }

    @Override // javax.inject.Provider
    public MessagesSource get() {
        return provideControllableMessagesSource(this.urlProvider.get(), this.coroutineScopeProvider.get(), this.coroutineDispatchersProvider.get(), this.loggerProvider.get(), this.contextProvider.get(), this.socketMessageToMessagesSourceMessageMapperProvider.get());
    }

    public static MessagesModule_Companion_ProvideControllableMessagesSourceFactory create(Provider<SocketUrlProvider> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3, Provider<Logger> provider4, Provider<Context> provider5, Provider<SocketMessageToMessagesSourceMessageMapper> provider6) {
        return new MessagesModule_Companion_ProvideControllableMessagesSourceFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MessagesSource provideControllableMessagesSource(SocketUrlProvider socketUrlProvider, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger, Context context, SocketMessageToMessagesSourceMessageMapper socketMessageToMessagesSourceMessageMapper) {
        return (MessagesSource) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideControllableMessagesSource(socketUrlProvider, coroutineScope, coroutineDispatchers, logger, context, socketMessageToMessagesSourceMessageMapper));
    }
}
