package com.ifriend.domain.useCases.bot;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeBotNameUseCase_Factory implements Factory<ChangeBotNameUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChangeBotNameUseCase_Factory(Provider<BotRepository> provider, Provider<UserRepository> provider2, Provider<ChatsInfoRepository> provider3) {
        this.botRepositoryProvider = provider;
        this.userRepositoryProvider = provider2;
        this.chatsInfoRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChangeBotNameUseCase get() {
        return newInstance(this.botRepositoryProvider.get(), this.userRepositoryProvider.get(), this.chatsInfoRepositoryProvider.get());
    }

    public static ChangeBotNameUseCase_Factory create(Provider<BotRepository> provider, Provider<UserRepository> provider2, Provider<ChatsInfoRepository> provider3) {
        return new ChangeBotNameUseCase_Factory(provider, provider2, provider3);
    }

    public static ChangeBotNameUseCase newInstance(BotRepository botRepository, UserRepository userRepository, ChatsInfoRepository chatsInfoRepository) {
        return new ChangeBotNameUseCase(botRepository, userRepository, chatsInfoRepository);
    }
}
