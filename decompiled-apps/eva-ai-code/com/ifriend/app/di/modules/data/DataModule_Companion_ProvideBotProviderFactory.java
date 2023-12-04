package com.ifriend.app.di.modules.data;

import com.ifriend.domain.data.BotProvider;
import com.ifriend.domain.data.BotRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideBotProviderFactory implements Factory<BotProvider> {
    private final Provider<BotRepository> botRepositoryProvider;

    public DataModule_Companion_ProvideBotProviderFactory(Provider<BotRepository> provider) {
        this.botRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public BotProvider get() {
        return provideBotProvider(this.botRepositoryProvider.get());
    }

    public static DataModule_Companion_ProvideBotProviderFactory create(Provider<BotRepository> provider) {
        return new DataModule_Companion_ProvideBotProviderFactory(provider);
    }

    public static BotProvider provideBotProvider(BotRepository botRepository) {
        return (BotProvider) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideBotProvider(botRepository));
    }
}
