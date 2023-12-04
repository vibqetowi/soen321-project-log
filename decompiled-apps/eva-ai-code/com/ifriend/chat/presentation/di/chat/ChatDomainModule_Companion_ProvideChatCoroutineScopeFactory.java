package com.ifriend.chat.presentation.di.chat;

import com.ifriend.common_utils.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatDomainModule_Companion_ProvideChatCoroutineScopeFactory implements Factory<CoroutineScope> {
    private final Provider<Logger> loggerProvider;

    public ChatDomainModule_Companion_ProvideChatCoroutineScopeFactory(Provider<Logger> provider) {
        this.loggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public CoroutineScope get() {
        return provideChatCoroutineScope(this.loggerProvider.get());
    }

    public static ChatDomainModule_Companion_ProvideChatCoroutineScopeFactory create(Provider<Logger> provider) {
        return new ChatDomainModule_Companion_ProvideChatCoroutineScopeFactory(provider);
    }

    public static CoroutineScope provideChatCoroutineScope(Logger logger) {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(ChatDomainModule.Companion.provideChatCoroutineScope(logger));
    }
}
