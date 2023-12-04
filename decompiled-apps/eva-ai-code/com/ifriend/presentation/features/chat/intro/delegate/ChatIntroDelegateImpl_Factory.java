package com.ifriend.presentation.features.chat.intro.delegate;

import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.intro.GetChatIntroSlidesUseCase;
import com.ifriend.presentation.features.chat.intro.analytics.ChatIntroAnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatIntroDelegateImpl_Factory implements Factory<ChatIntroDelegateImpl> {
    private final Provider<ChatIntroAnalyticsInteractor> chatIntroAnalyticsInteractorProvider;
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<GetChatIntroSlidesUseCase> chatsIntroSlidesUseCaseProvider;

    public ChatIntroDelegateImpl_Factory(Provider<ChatsConfigurationInteractor> provider, Provider<GetChatIntroSlidesUseCase> provider2, Provider<ChatIntroAnalyticsInteractor> provider3) {
        this.chatsConfigurationInteractorProvider = provider;
        this.chatsIntroSlidesUseCaseProvider = provider2;
        this.chatIntroAnalyticsInteractorProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatIntroDelegateImpl get() {
        return newInstance(this.chatsConfigurationInteractorProvider.get(), this.chatsIntroSlidesUseCaseProvider.get(), this.chatIntroAnalyticsInteractorProvider.get());
    }

    public static ChatIntroDelegateImpl_Factory create(Provider<ChatsConfigurationInteractor> provider, Provider<GetChatIntroSlidesUseCase> provider2, Provider<ChatIntroAnalyticsInteractor> provider3) {
        return new ChatIntroDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static ChatIntroDelegateImpl newInstance(ChatsConfigurationInteractor chatsConfigurationInteractor, GetChatIntroSlidesUseCase getChatIntroSlidesUseCase, ChatIntroAnalyticsInteractor chatIntroAnalyticsInteractor) {
        return new ChatIntroDelegateImpl(chatsConfigurationInteractor, getChatIntroSlidesUseCase, chatIntroAnalyticsInteractor);
    }
}
