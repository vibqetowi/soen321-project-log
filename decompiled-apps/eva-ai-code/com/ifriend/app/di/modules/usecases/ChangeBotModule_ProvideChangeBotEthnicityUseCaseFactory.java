package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.bot.ChangeBotEthnicityUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeBotModule_ProvideChangeBotEthnicityUseCaseFactory implements Factory<ChangeBotEthnicityUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final ChangeBotModule module;

    public ChangeBotModule_ProvideChangeBotEthnicityUseCaseFactory(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        this.module = changeBotModule;
        this.botRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChangeBotEthnicityUseCase get() {
        return provideChangeBotEthnicityUseCase(this.module, this.botRepositoryProvider.get());
    }

    public static ChangeBotModule_ProvideChangeBotEthnicityUseCaseFactory create(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        return new ChangeBotModule_ProvideChangeBotEthnicityUseCaseFactory(changeBotModule, provider);
    }

    public static ChangeBotEthnicityUseCase provideChangeBotEthnicityUseCase(ChangeBotModule changeBotModule, BotRepository botRepository) {
        return (ChangeBotEthnicityUseCase) Preconditions.checkNotNullFromProvides(changeBotModule.provideChangeBotEthnicityUseCase(botRepository));
    }
}
