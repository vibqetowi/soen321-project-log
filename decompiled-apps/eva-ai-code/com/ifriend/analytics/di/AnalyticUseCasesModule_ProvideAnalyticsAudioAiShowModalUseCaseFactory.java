package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiShowModalUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsAudioAiShowModalUseCaseFactory implements Factory<AnalyticsAudioAiShowModalUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsAudioAiShowModalUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsAudioAiShowModalUseCase get() {
        return provideAnalyticsAudioAiShowModalUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsAudioAiShowModalUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsAudioAiShowModalUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsAudioAiShowModalUseCase provideAnalyticsAudioAiShowModalUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsAudioAiShowModalUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsAudioAiShowModalUseCase(analyticsSender));
    }
}
