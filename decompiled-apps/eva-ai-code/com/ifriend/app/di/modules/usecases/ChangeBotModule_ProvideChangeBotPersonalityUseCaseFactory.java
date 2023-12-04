package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.bot.ChangeBotPersonalityUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeBotModule_ProvideChangeBotPersonalityUseCaseFactory implements Factory<ChangeBotPersonalityUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final ChangeBotModule module;

    public ChangeBotModule_ProvideChangeBotPersonalityUseCaseFactory(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        this.module = changeBotModule;
        this.botRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChangeBotPersonalityUseCase get() {
        return provideChangeBotPersonalityUseCase(this.module, this.botRepositoryProvider.get());
    }

    public static ChangeBotModule_ProvideChangeBotPersonalityUseCaseFactory create(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        return new ChangeBotModule_ProvideChangeBotPersonalityUseCaseFactory(changeBotModule, provider);
    }

    public static ChangeBotPersonalityUseCase provideChangeBotPersonalityUseCase(ChangeBotModule changeBotModule, BotRepository botRepository) {
        return (ChangeBotPersonalityUseCase) Preconditions.checkNotNullFromProvides(changeBotModule.provideChangeBotPersonalityUseCase(botRepository));
    }
}
