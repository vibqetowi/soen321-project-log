package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsOpenSubscriptionScreenUseCaseFactory implements Factory<AnalyticsOpenSubscriptionScreenUseCase> {
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;
    private final Provider<AnalyticsSender> appsFlyerAnalyticsSenderProvider;
    private final Provider<AnalyticsSender> firebaseAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsOpenSubscriptionScreenUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppIdentityConverter> provider, Provider<AnalyticsSender> provider2, Provider<AnalyticsSender> provider3) {
        this.module = analyticUseCasesModule;
        this.appIdentityConverterProvider = provider;
        this.firebaseAnalyticsSenderProvider = provider2;
        this.appsFlyerAnalyticsSenderProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AnalyticsOpenSubscriptionScreenUseCase get() {
        return provideAnalyticsOpenSubscriptionScreenUseCase(this.module, this.appIdentityConverterProvider.get(), this.firebaseAnalyticsSenderProvider.get(), this.appsFlyerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsOpenSubscriptionScreenUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppIdentityConverter> provider, Provider<AnalyticsSender> provider2, Provider<AnalyticsSender> provider3) {
        return new AnalyticUseCasesModule_ProvideAnalyticsOpenSubscriptionScreenUseCaseFactory(analyticUseCasesModule, provider, provider2, provider3);
    }

    public static AnalyticsOpenSubscriptionScreenUseCase provideAnalyticsOpenSubscriptionScreenUseCase(AnalyticUseCasesModule analyticUseCasesModule, AppIdentityConverter appIdentityConverter, AnalyticsSender analyticsSender, AnalyticsSender analyticsSender2) {
        return (AnalyticsOpenSubscriptionScreenUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsOpenSubscriptionScreenUseCase(appIdentityConverter, analyticsSender, analyticsSender2));
    }
}
