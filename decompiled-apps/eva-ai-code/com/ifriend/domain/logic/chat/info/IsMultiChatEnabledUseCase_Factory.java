package com.ifriend.domain.logic.chat.info;

import com.ifriend.domain.data.BotRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class IsMultiChatEnabledUseCase_Factory implements Factory<IsMultiChatEnabledUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;

    public IsMultiChatEnabledUseCase_Factory(Provider<BotRepository> provider) {
        this.botRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public IsMultiChatEnabledUseCase get() {
        return newInstance(this.botRepositoryProvider.get());
    }

    public static IsMultiChatEnabledUseCase_Factory create(Provider<BotRepository> provider) {
        return new IsMultiChatEnabledUseCase_Factory(provider);
    }

    public static IsMultiChatEnabledUseCase newInstance(BotRepository botRepository) {
        return new IsMultiChatEnabledUseCase(botRepository);
    }
}
