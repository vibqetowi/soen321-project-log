package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.rateUs.AnalyticsReviewUsModalUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsReviewUsModalUseCaseFactory implements Factory<AnalyticsReviewUsModalUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsReviewUsModalUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsReviewUsModalUseCase get() {
        return provideAnalyticsReviewUsModalUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsReviewUsModalUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsReviewUsModalUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsReviewUsModalUseCase provideAnalyticsReviewUsModalUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsReviewUsModalUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsReviewUsModalUseCase(analyticsSender));
    }
}
