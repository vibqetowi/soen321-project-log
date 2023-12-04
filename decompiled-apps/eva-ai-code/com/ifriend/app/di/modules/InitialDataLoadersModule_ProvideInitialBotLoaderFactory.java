package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.InitialBotLoader;
import com.ifriend.domain.data.BotRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideInitialBotLoaderFactory implements Factory<InitialBotLoader> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final InitialDataLoadersModule module;

    public InitialDataLoadersModule_ProvideInitialBotLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<BotRepository> provider) {
        this.module = initialDataLoadersModule;
        this.botRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public InitialBotLoader get() {
        return provideInitialBotLoader(this.module, this.botRepositoryProvider.get());
    }

    public static InitialDataLoadersModule_ProvideInitialBotLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<BotRepository> provider) {
        return new InitialDataLoadersModule_ProvideInitialBotLoaderFactory(initialDataLoadersModule, provider);
    }

    public static InitialBotLoader provideInitialBotLoader(InitialDataLoadersModule initialDataLoadersModule, BotRepository botRepository) {
        return (InitialBotLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideInitialBotLoader(botRepository));
    }
}
