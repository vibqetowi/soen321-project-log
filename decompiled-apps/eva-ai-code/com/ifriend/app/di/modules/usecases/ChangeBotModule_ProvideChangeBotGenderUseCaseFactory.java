package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.bot.ChangeBotGenderUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeBotModule_ProvideChangeBotGenderUseCaseFactory implements Factory<ChangeBotGenderUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final ChangeBotModule module;

    public ChangeBotModule_ProvideChangeBotGenderUseCaseFactory(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        this.module = changeBotModule;
        this.botRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChangeBotGenderUseCase get() {
        return provideChangeBotGenderUseCase(this.module, this.botRepositoryProvider.get());
    }

    public static ChangeBotModule_ProvideChangeBotGenderUseCaseFactory create(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        return new ChangeBotModule_ProvideChangeBotGenderUseCaseFactory(changeBotModule, provider);
    }

    public static ChangeBotGenderUseCase provideChangeBotGenderUseCase(ChangeBotModule changeBotModule, BotRepository botRepository) {
        return (ChangeBotGenderUseCase) Preconditions.checkNotNullFromProvides(changeBotModule.provideChangeBotGenderUseCase(botRepository));
    }
}
