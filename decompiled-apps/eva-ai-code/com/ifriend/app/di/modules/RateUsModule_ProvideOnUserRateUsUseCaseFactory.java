package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class RateUsModule_ProvideOnUserRateUsUseCaseFactory implements Factory<OnUserRatedAppUseCase> {
    private final RateUsModule module;
    private final Provider<Preferences> preferencesProvider;

    public RateUsModule_ProvideOnUserRateUsUseCaseFactory(RateUsModule rateUsModule, Provider<Preferences> provider) {
        this.module = rateUsModule;
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public OnUserRatedAppUseCase get() {
        return provideOnUserRateUsUseCase(this.module, this.preferencesProvider.get());
    }

    public static RateUsModule_ProvideOnUserRateUsUseCaseFactory create(RateUsModule rateUsModule, Provider<Preferences> provider) {
        return new RateUsModule_ProvideOnUserRateUsUseCaseFactory(rateUsModule, provider);
    }

    public static OnUserRatedAppUseCase provideOnUserRateUsUseCase(RateUsModule rateUsModule, Preferences preferences) {
        return (OnUserRatedAppUseCase) Preconditions.checkNotNullFromProvides(rateUsModule.provideOnUserRateUsUseCase(preferences));
    }
}
