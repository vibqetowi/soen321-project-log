package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.photoAi.AnalyticsPhotoAiOpenUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsPhotoAiOpenUseCaseFactory implements Factory<AnalyticsPhotoAiOpenUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsPhotoAiOpenUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsPhotoAiOpenUseCase get() {
        return provideAnalyticsPhotoAiOpenUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsPhotoAiOpenUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsPhotoAiOpenUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsPhotoAiOpenUseCase provideAnalyticsPhotoAiOpenUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsPhotoAiOpenUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsPhotoAiOpenUseCase(analyticsSender));
    }
}
