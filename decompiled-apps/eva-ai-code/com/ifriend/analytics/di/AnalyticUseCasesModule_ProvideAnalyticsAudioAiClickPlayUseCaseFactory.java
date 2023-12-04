package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickPlayUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsAudioAiClickPlayUseCaseFactory implements Factory<AnalyticsAudioAiClickPlayUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsAudioAiClickPlayUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsAudioAiClickPlayUseCase get() {
        return provideAnalyticsAudioAiClickPlayUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsAudioAiClickPlayUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsAudioAiClickPlayUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsAudioAiClickPlayUseCase provideAnalyticsAudioAiClickPlayUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsAudioAiClickPlayUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsAudioAiClickPlayUseCase(analyticsSender));
    }
}
