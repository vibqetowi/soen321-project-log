package com.ifriend.data.repository.chat.providers;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.newChat.chat.ChatSystemsFactory;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatClientProvider_Factory implements Factory<ChatClientProvider> {
    private final Provider<ChatSystemsFactory> chatSystemsFactoryProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<Logger> loggerProvider;

    public ChatClientProvider_Factory(Provider<CoroutineScope> provider, Provider<ChatSystemsFactory> provider2, Provider<Logger> provider3) {
        this.coroutineScopeProvider = provider;
        this.chatSystemsFactoryProvider = provider2;
        this.loggerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatClientProvider get() {
        return newInstance(this.coroutineScopeProvider.get(), this.chatSystemsFactoryProvider.get(), this.loggerProvider.get());
    }

    public static ChatClientProvider_Factory create(Provider<CoroutineScope> provider, Provider<ChatSystemsFactory> provider2, Provider<Logger> provider3) {
        return new ChatClientProvider_Factory(provider, provider2, provider3);
    }

    public static ChatClientProvider newInstance(CoroutineScope coroutineScope, ChatSystemsFactory chatSystemsFactory, Logger logger) {
        return new ChatClientProvider(coroutineScope, chatSystemsFactory, logger);
    }
}
