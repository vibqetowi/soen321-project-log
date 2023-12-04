package com.ifriend.presentation.features.profile.actions;

import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.domain.useCases.bot.BotHaveUpdateUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatProfileActionDelegateImpl_Factory implements Factory<ChatProfileActionDelegateImpl> {
    private final Provider<BotHaveUpdateUseCase> botHaveUpdateUseCaseProvider;
    private final Provider<ChatScreenAnalyticsUseCase> chatScreenAnalyticsUseCaseProvider;

    public ChatProfileActionDelegateImpl_Factory(Provider<BotHaveUpdateUseCase> provider, Provider<ChatScreenAnalyticsUseCase> provider2) {
        this.botHaveUpdateUseCaseProvider = provider;
        this.chatScreenAnalyticsUseCaseProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatProfileActionDelegateImpl get() {
        return newInstance(this.botHaveUpdateUseCaseProvider.get(), this.chatScreenAnalyticsUseCaseProvider.get());
    }

    public static ChatProfileActionDelegateImpl_Factory create(Provider<BotHaveUpdateUseCase> provider, Provider<ChatScreenAnalyticsUseCase> provider2) {
        return new ChatProfileActionDelegateImpl_Factory(provider, provider2);
    }

    public static ChatProfileActionDelegateImpl newInstance(BotHaveUpdateUseCase botHaveUpdateUseCase, ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase) {
        return new ChatProfileActionDelegateImpl(botHaveUpdateUseCase, chatScreenAnalyticsUseCase);
    }
}
