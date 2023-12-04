package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UseCasesModule_Companion_ProvideGetBotUseCaseFactory implements Factory<GetBotUseCase> {
    private final Provider<BotRepository> repositoryProvider;

    public UseCasesModule_Companion_ProvideGetBotUseCaseFactory(Provider<BotRepository> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public GetBotUseCase get() {
        return provideGetBotUseCase(this.repositoryProvider.get());
    }

    public static UseCasesModule_Companion_ProvideGetBotUseCaseFactory create(Provider<BotRepository> provider) {
        return new UseCasesModule_Companion_ProvideGetBotUseCaseFactory(provider);
    }

    public static GetBotUseCase provideGetBotUseCase(BotRepository botRepository) {
        return (GetBotUseCase) Preconditions.checkNotNullFromProvides(UseCasesModule.Companion.provideGetBotUseCase(botRepository));
    }
}
