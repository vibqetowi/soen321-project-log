package com.ifriend.app.di.modules;

import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class RateUsModule_ProvideShowRateUsUseCaseFactory implements Factory<ShowRateUsUseCase> {
    private final RateUsModule module;
    private final Provider<RateAppShowingPlanner> rateAppShowingPlannerProvider;
    private final Provider<RateUsStateStorage> rateUsStateStorageProvider;

    public RateUsModule_ProvideShowRateUsUseCaseFactory(RateUsModule rateUsModule, Provider<RateUsStateStorage> provider, Provider<RateAppShowingPlanner> provider2) {
        this.module = rateUsModule;
        this.rateUsStateStorageProvider = provider;
        this.rateAppShowingPlannerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ShowRateUsUseCase get() {
        return provideShowRateUsUseCase(this.module, this.rateUsStateStorageProvider.get(), this.rateAppShowingPlannerProvider.get());
    }

    public static RateUsModule_ProvideShowRateUsUseCaseFactory create(RateUsModule rateUsModule, Provider<RateUsStateStorage> provider, Provider<RateAppShowingPlanner> provider2) {
        return new RateUsModule_ProvideShowRateUsUseCaseFactory(rateUsModule, provider, provider2);
    }

    public static ShowRateUsUseCase provideShowRateUsUseCase(RateUsModule rateUsModule, RateUsStateStorage rateUsStateStorage, RateAppShowingPlanner rateAppShowingPlanner) {
        return (ShowRateUsUseCase) Preconditions.checkNotNullFromProvides(rateUsModule.provideShowRateUsUseCase(rateUsStateStorage, rateAppShowingPlanner));
    }
}
