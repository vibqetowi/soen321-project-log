package com.ifriend.app.di.modules.data;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.config.parser.ConditionsChecker;
import com.ifriend.domain.data.BotRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ConfigModule_Companion_ProvideConditionsCheckerFactory implements Factory<ConditionsChecker> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<Logger> loggerProvider;

    public ConfigModule_Companion_ProvideConditionsCheckerFactory(Provider<BotRepository> provider, Provider<Logger> provider2) {
        this.botRepositoryProvider = provider;
        this.loggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ConditionsChecker get() {
        return provideConditionsChecker(this.botRepositoryProvider.get(), this.loggerProvider.get());
    }

    public static ConfigModule_Companion_ProvideConditionsCheckerFactory create(Provider<BotRepository> provider, Provider<Logger> provider2) {
        return new ConfigModule_Companion_ProvideConditionsCheckerFactory(provider, provider2);
    }

    public static ConditionsChecker provideConditionsChecker(BotRepository botRepository, Logger logger) {
        return (ConditionsChecker) Preconditions.checkNotNullFromProvides(ConfigModule.Companion.provideConditionsChecker(botRepository, logger));
    }
}
