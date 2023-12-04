package com.ifriend.domain.logic.chat.info;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ActivateNewChatUseCase_Factory implements Factory<ActivateNewChatUseCase> {
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<ChatsRefreshConfigurationUseCase> refreshConfigurationUseCaseProvider;

    public ActivateNewChatUseCase_Factory(Provider<ChatsInfoRepository> provider, Provider<ChatsRefreshConfigurationUseCase> provider2) {
        this.chatsInfoRepositoryProvider = provider;
        this.refreshConfigurationUseCaseProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ActivateNewChatUseCase get() {
        return newInstance(this.chatsInfoRepositoryProvider.get(), this.refreshConfigurationUseCaseProvider.get());
    }

    public static ActivateNewChatUseCase_Factory create(Provider<ChatsInfoRepository> provider, Provider<ChatsRefreshConfigurationUseCase> provider2) {
        return new ActivateNewChatUseCase_Factory(provider, provider2);
    }

    public static ActivateNewChatUseCase newInstance(ChatsInfoRepository chatsInfoRepository, ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase) {
        return new ActivateNewChatUseCase(chatsInfoRepository, chatsRefreshConfigurationUseCase);
    }
}
