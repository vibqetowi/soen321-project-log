package com.ifriend.domain.logic.chat;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.chat.ChatBackgroundRepository;
import com.ifriend.domain.featuretoggles.ChatVideoBackgroundFeatureToggle;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatBackgroundUseCase_Factory implements Factory<ChatBackgroundUseCase> {
    private final Provider<BotRepository> botDataRepositoryProvider;
    private final Provider<ChatBackgroundRepository> chatBackgroundRepositoryProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<ChatVideoBackgroundFeatureToggle> videoFeatureToggleProvider;

    public ChatBackgroundUseCase_Factory(Provider<ChatBackgroundRepository> provider, Provider<ChatsInfoInteractor> provider2, Provider<ChatVideoBackgroundFeatureToggle> provider3, Provider<BotRepository> provider4) {
        this.chatBackgroundRepositoryProvider = provider;
        this.chatsInfoInteractorProvider = provider2;
        this.videoFeatureToggleProvider = provider3;
        this.botDataRepositoryProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ChatBackgroundUseCase get() {
        return newInstance(this.chatBackgroundRepositoryProvider.get(), this.chatsInfoInteractorProvider.get(), this.videoFeatureToggleProvider.get(), this.botDataRepositoryProvider.get());
    }

    public static ChatBackgroundUseCase_Factory create(Provider<ChatBackgroundRepository> provider, Provider<ChatsInfoInteractor> provider2, Provider<ChatVideoBackgroundFeatureToggle> provider3, Provider<BotRepository> provider4) {
        return new ChatBackgroundUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static ChatBackgroundUseCase newInstance(ChatBackgroundRepository chatBackgroundRepository, ChatsInfoInteractor chatsInfoInteractor, ChatVideoBackgroundFeatureToggle chatVideoBackgroundFeatureToggle, BotRepository botRepository) {
        return new ChatBackgroundUseCase(chatBackgroundRepository, chatsInfoInteractor, chatVideoBackgroundFeatureToggle, botRepository);
    }
}
