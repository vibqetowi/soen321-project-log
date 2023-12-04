package com.ifriend.chat.presentation.di;

import com.ifriend.chat.domain.chat.reset.ResetAiUseCase;
import com.ifriend.chat.domain.data.ResetAiApiDelegate;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatModule_ProvideResetAiUseCaseFactory implements Factory<ResetAiUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final ChatModule module;
    private final Provider<ResetAiApiDelegate> resetDelegateProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatModule_ProvideResetAiUseCaseFactory(ChatModule chatModule, Provider<ResetAiApiDelegate> provider, Provider<UserRepository> provider2, Provider<BotRepository> provider3, Provider<ChatClientInteractor> provider4, Provider<InternalNotificationHandler> provider5) {
        this.module = chatModule;
        this.resetDelegateProvider = provider;
        this.userRepositoryProvider = provider2;
        this.botRepositoryProvider = provider3;
        this.chatClientInteractorProvider = provider4;
        this.internalNotificationHandlerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ResetAiUseCase get() {
        return provideResetAiUseCase(this.module, this.resetDelegateProvider.get(), this.userRepositoryProvider.get(), this.botRepositoryProvider.get(), this.chatClientInteractorProvider.get(), this.internalNotificationHandlerProvider.get());
    }

    public static ChatModule_ProvideResetAiUseCaseFactory create(ChatModule chatModule, Provider<ResetAiApiDelegate> provider, Provider<UserRepository> provider2, Provider<BotRepository> provider3, Provider<ChatClientInteractor> provider4, Provider<InternalNotificationHandler> provider5) {
        return new ChatModule_ProvideResetAiUseCaseFactory(chatModule, provider, provider2, provider3, provider4, provider5);
    }

    public static ResetAiUseCase provideResetAiUseCase(ChatModule chatModule, ResetAiApiDelegate resetAiApiDelegate, UserRepository userRepository, BotRepository botRepository, ChatClientInteractor chatClientInteractor, InternalNotificationHandler internalNotificationHandler) {
        return (ResetAiUseCase) Preconditions.checkNotNullFromProvides(chatModule.provideResetAiUseCase(resetAiApiDelegate, userRepository, botRepository, chatClientInteractor, internalNotificationHandler));
    }
}
