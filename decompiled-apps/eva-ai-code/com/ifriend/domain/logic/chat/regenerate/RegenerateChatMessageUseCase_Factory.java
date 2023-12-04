package com.ifriend.domain.logic.chat.regenerate;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class RegenerateChatMessageUseCase_Factory implements Factory<RegenerateChatMessageUseCase> {
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatMessagesRepository> chatMessagesRepositoryProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;

    public RegenerateChatMessageUseCase_Factory(Provider<ChatClientInteractor> provider, Provider<ChatMessagesRepository> provider2, Provider<DispatcherProvider> provider3) {
        this.chatClientInteractorProvider = provider;
        this.chatMessagesRepositoryProvider = provider2;
        this.dispatcherProvider = provider3;
    }

    @Override // javax.inject.Provider
    public RegenerateChatMessageUseCase get() {
        return newInstance(this.chatClientInteractorProvider.get(), this.chatMessagesRepositoryProvider.get(), this.dispatcherProvider.get());
    }

    public static RegenerateChatMessageUseCase_Factory create(Provider<ChatClientInteractor> provider, Provider<ChatMessagesRepository> provider2, Provider<DispatcherProvider> provider3) {
        return new RegenerateChatMessageUseCase_Factory(provider, provider2, provider3);
    }

    public static RegenerateChatMessageUseCase newInstance(ChatClientInteractor chatClientInteractor, ChatMessagesRepository chatMessagesRepository, DispatcherProvider dispatcherProvider) {
        return new RegenerateChatMessageUseCase(chatClientInteractor, chatMessagesRepository, dispatcherProvider);
    }
}
