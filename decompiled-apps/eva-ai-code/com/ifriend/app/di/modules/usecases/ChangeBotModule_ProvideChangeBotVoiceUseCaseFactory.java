package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.bot.ChangeBotVoiceUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeBotModule_ProvideChangeBotVoiceUseCaseFactory implements Factory<ChangeBotVoiceUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final ChangeBotModule module;

    public ChangeBotModule_ProvideChangeBotVoiceUseCaseFactory(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        this.module = changeBotModule;
        this.botRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChangeBotVoiceUseCase get() {
        return provideChangeBotVoiceUseCase(this.module, this.botRepositoryProvider.get());
    }

    public static ChangeBotModule_ProvideChangeBotVoiceUseCaseFactory create(ChangeBotModule changeBotModule, Provider<BotRepository> provider) {
        return new ChangeBotModule_ProvideChangeBotVoiceUseCaseFactory(changeBotModule, provider);
    }

    public static ChangeBotVoiceUseCase provideChangeBotVoiceUseCase(ChangeBotModule changeBotModule, BotRepository botRepository) {
        return (ChangeBotVoiceUseCase) Preconditions.checkNotNullFromProvides(changeBotModule.provideChangeBotVoiceUseCase(botRepository));
    }
}
