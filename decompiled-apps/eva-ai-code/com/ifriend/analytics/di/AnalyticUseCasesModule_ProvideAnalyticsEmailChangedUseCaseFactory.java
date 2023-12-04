package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.confirmEmail.AnalyticsEmailChangedUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsEmailChangedUseCaseFactory implements Factory<AnalyticsEmailChangedUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsEmailChangedUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsEmailChangedUseCase get() {
        return provideAnalyticsEmailChangedUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsEmailChangedUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsEmailChangedUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsEmailChangedUseCase provideAnalyticsEmailChangedUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsEmailChangedUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsEmailChangedUseCase(analyticsSender));
    }
}
