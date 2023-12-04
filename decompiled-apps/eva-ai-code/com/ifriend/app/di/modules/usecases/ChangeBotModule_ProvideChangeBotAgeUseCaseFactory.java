package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeBotModule_ProvideChangeBotAgeUseCaseFactory implements Factory<ChangeBotAgeUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final ChangeBotModule module;

    public ChangeBotModule_ProvideChangeBotAgeUseCaseFactory(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        this.module = changeBotModule;
        this.botRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChangeBotAgeUseCase get() {
        return provideChangeBotAgeUseCase(this.module, this.botRepositoryProvider.get());
    }

    public static ChangeBotModule_ProvideChangeBotAgeUseCaseFactory create(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        return new ChangeBotModule_ProvideChangeBotAgeUseCaseFactory(changeBotModule, provider);
    }

    public static ChangeBotAgeUseCase provideChangeBotAgeUseCase(ChangeBotModule changeBotModule, BotRepository botRepository) {
        return (ChangeBotAgeUseCase) Preconditions.checkNotNullFromProvides(changeBotModule.provideChangeBotAgeUseCase(botRepository));
    }
}
