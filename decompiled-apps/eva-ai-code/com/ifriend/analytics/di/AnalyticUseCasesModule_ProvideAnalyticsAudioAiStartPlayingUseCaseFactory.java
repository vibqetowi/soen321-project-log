package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiStartPlayingUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsAudioAiStartPlayingUseCaseFactory implements Factory<AnalyticsAudioAiStartPlayingUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsAudioAiStartPlayingUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsAudioAiStartPlayingUseCase get() {
        return provideAnalyticsAudioAiStartPlayingUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsAudioAiStartPlayingUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsAudioAiStartPlayingUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsAudioAiStartPlayingUseCase provideAnalyticsAudioAiStartPlayingUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsAudioAiStartPlayingUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsAudioAiStartPlayingUseCase(analyticsSender));
    }
}
