package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class RateUsModule_ProvideRateUsStateStorageFactory implements Factory<RateUsStateStorage> {
    private final RateUsModule module;
    private final Provider<Preferences> preferencesProvider;

    public RateUsModule_ProvideRateUsStateStorageFactory(RateUsModule rateUsModule, Provider<Preferences> provider) {
        this.module = rateUsModule;
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public RateUsStateStorage get() {
        return provideRateUsStateStorage(this.module, this.preferencesProvider.get());
    }

    public static RateUsModule_ProvideRateUsStateStorageFactory create(RateUsModule rateUsModule, Provider<Preferences> provider) {
        return new RateUsModule_ProvideRateUsStateStorageFactory(rateUsModule, provider);
    }

    public static RateUsStateStorage provideRateUsStateStorage(RateUsModule rateUsModule, Preferences preferences) {
        return (RateUsStateStorage) Preconditions.checkNotNullFromProvides(rateUsModule.provideRateUsStateStorage(preferences));
    }
}
