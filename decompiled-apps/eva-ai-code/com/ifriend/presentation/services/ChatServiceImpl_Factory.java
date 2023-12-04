package com.ifriend.presentation.services;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatServiceImpl_Factory implements Factory<ChatServiceImpl> {
    private final Provider<ChatEventsInteractor> chatEventsInteractorProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ChatsRefreshConfigurationUseCase> refreshConfigurationUseCaseProvider;

    public ChatServiceImpl_Factory(Provider<CoroutineScope> provider, Provider<DispatcherProvider> provider2, Provider<ChatEventsInteractor> provider3, Provider<ChatsRefreshConfigurationUseCase> provider4) {
        this.coroutineScopeProvider = provider;
        this.dispatcherProvider = provider2;
        this.chatEventsInteractorProvider = provider3;
        this.refreshConfigurationUseCaseProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ChatServiceImpl get() {
        return newInstance(this.coroutineScopeProvider.get(), this.dispatcherProvider.get(), this.chatEventsInteractorProvider.get(), this.refreshConfigurationUseCaseProvider.get());
    }

    public static ChatServiceImpl_Factory create(Provider<CoroutineScope> provider, Provider<DispatcherProvider> provider2, Provider<ChatEventsInteractor> provider3, Provider<ChatsRefreshConfigurationUseCase> provider4) {
        return new ChatServiceImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static ChatServiceImpl newInstance(CoroutineScope coroutineScope, DispatcherProvider dispatcherProvider, ChatEventsInteractor chatEventsInteractor, ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase) {
        return new ChatServiceImpl(coroutineScope, dispatcherProvider, chatEventsInteractor, chatsRefreshConfigurationUseCase);
    }
}
