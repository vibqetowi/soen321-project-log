package com.ifriend.domain.logic.chat.buy;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.ChatsRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.chat.info.ActivateNewChatUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyChatInteractor_Factory implements Factory<BuyChatInteractor> {
    private final Provider<ActivateNewChatUseCase> activateNewChatUseCaseProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<ChatsRepository> chatsRepositoryProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;

    public BuyChatInteractor_Factory(Provider<ActivateNewChatUseCase> provider, Provider<ChatsInfoRepository> provider2, Provider<UserBalanceRepository> provider3, Provider<ChatsRepository> provider4) {
        this.activateNewChatUseCaseProvider = provider;
        this.chatsInfoRepositoryProvider = provider2;
        this.userBalanceRepositoryProvider = provider3;
        this.chatsRepositoryProvider = provider4;
    }

    @Override // javax.inject.Provider
    public BuyChatInteractor get() {
        return newInstance(this.activateNewChatUseCaseProvider.get(), this.chatsInfoRepositoryProvider.get(), this.userBalanceRepositoryProvider.get(), this.chatsRepositoryProvider.get());
    }

    public static BuyChatInteractor_Factory create(Provider<ActivateNewChatUseCase> provider, Provider<ChatsInfoRepository> provider2, Provider<UserBalanceRepository> provider3, Provider<ChatsRepository> provider4) {
        return new BuyChatInteractor_Factory(provider, provider2, provider3, provider4);
    }

    public static BuyChatInteractor newInstance(ActivateNewChatUseCase activateNewChatUseCase, ChatsInfoRepository chatsInfoRepository, UserBalanceRepository userBalanceRepository, ChatsRepository chatsRepository) {
        return new BuyChatInteractor(activateNewChatUseCase, chatsInfoRepository, userBalanceRepository, chatsRepository);
    }
}
