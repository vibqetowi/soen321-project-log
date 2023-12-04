package com.ifriend.chat.presentation.di;

import com.ifriend.chat.domain.chat.ShouldReloadMessagesUseCase;
import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatModule_ProvideShouldReloadMessagesUseCaseFactory implements Factory<ShouldReloadMessagesUseCase> {
    private final Provider<MessagesSource> messagesSourceProvider;
    private final ChatModule module;

    public ChatModule_ProvideShouldReloadMessagesUseCaseFactory(ChatModule chatModule, Provider<MessagesSource> provider) {
        this.module = chatModule;
        this.messagesSourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public ShouldReloadMessagesUseCase get() {
        return provideShouldReloadMessagesUseCase(this.module, this.messagesSourceProvider.get());
    }

    public static ChatModule_ProvideShouldReloadMessagesUseCaseFactory create(ChatModule chatModule, Provider<MessagesSource> provider) {
        return new ChatModule_ProvideShouldReloadMessagesUseCaseFactory(chatModule, provider);
    }

    public static ShouldReloadMessagesUseCase provideShouldReloadMessagesUseCase(ChatModule chatModule, MessagesSource messagesSource) {
        return (ShouldReloadMessagesUseCase) Preconditions.checkNotNullFromProvides(chatModule.provideShouldReloadMessagesUseCase(messagesSource));
    }
}
