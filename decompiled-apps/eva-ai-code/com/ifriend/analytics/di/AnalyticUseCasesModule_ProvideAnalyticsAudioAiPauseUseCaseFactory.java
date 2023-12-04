package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiPauseUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsAudioAiPauseUseCaseFactory implements Factory<AnalyticsAudioAiPauseUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsAudioAiPauseUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsAudioAiPauseUseCase get() {
        return provideAnalyticsAudioAiPauseUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsAudioAiPauseUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsAudioAiPauseUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsAudioAiPauseUseCase provideAnalyticsAudioAiPauseUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsAudioAiPauseUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsAudioAiPauseUseCase(analyticsSender));
    }
}
