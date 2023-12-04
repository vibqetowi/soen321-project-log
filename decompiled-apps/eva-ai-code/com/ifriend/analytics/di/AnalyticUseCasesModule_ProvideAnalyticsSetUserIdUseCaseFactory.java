package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsSetUserIdUseCaseFactory implements Factory<AnalyticsSetUserIdUseCase> {
    private final Provider<AnalyticsSender> appsFlyerAnalyticsSenderProvider;
    private final Provider<AnalyticsSender> firebaseAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsSetUserIdUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider, Provider<AnalyticsSender> provider2) {
        this.module = analyticUseCasesModule;
        this.firebaseAnalyticsSenderProvider = provider;
        this.appsFlyerAnalyticsSenderProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnalyticsSetUserIdUseCase get() {
        return provideAnalyticsSetUserIdUseCase(this.module, this.firebaseAnalyticsSenderProvider.get(), this.appsFlyerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsSetUserIdUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider, Provider<AnalyticsSender> provider2) {
        return new AnalyticUseCasesModule_ProvideAnalyticsSetUserIdUseCaseFactory(analyticUseCasesModule, provider, provider2);
    }

    public static AnalyticsSetUserIdUseCase provideAnalyticsSetUserIdUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender, AnalyticsSender analyticsSender2) {
        return (AnalyticsSetUserIdUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsSetUserIdUseCase(analyticsSender, analyticsSender2));
    }
}
