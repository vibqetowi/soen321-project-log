package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsFirstAppOpenUpUseCaseFactory implements Factory<AnalyticsFirstAppOpenUseCase> {
    private final Provider<AnalyticsSender> firebaseAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsFirstAppOpenUpUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.firebaseAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsFirstAppOpenUseCase get() {
        return provideAnalyticsFirstAppOpenUpUseCase(this.module, this.firebaseAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsFirstAppOpenUpUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsFirstAppOpenUpUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsFirstAppOpenUseCase provideAnalyticsFirstAppOpenUpUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsFirstAppOpenUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsFirstAppOpenUpUseCase(analyticsSender));
    }
}
