package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsAppOpenUpUseCaseFactory implements Factory<AnalyticsAppOpenUseCase> {
    private final Provider<AnalyticsSender> appsFlyerAnalyticsSenderProvider;
    private final Provider<AnalyticsSender> firebaseAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsAppOpenUpUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider, Provider<AnalyticsSender> provider2) {
        this.module = analyticUseCasesModule;
        this.firebaseAnalyticsSenderProvider = provider;
        this.appsFlyerAnalyticsSenderProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnalyticsAppOpenUseCase get() {
        return provideAnalyticsAppOpenUpUseCase(this.module, this.firebaseAnalyticsSenderProvider.get(), this.appsFlyerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsAppOpenUpUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider, Provider<AnalyticsSender> provider2) {
        return new AnalyticUseCasesModule_ProvideAnalyticsAppOpenUpUseCaseFactory(analyticUseCasesModule, provider, provider2);
    }

    public static AnalyticsAppOpenUseCase provideAnalyticsAppOpenUpUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender, AnalyticsSender analyticsSender2) {
        return (AnalyticsAppOpenUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsAppOpenUpUseCase(analyticsSender, analyticsSender2));
    }
}
