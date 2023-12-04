package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiClickConvertToTextMessageUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextMessageUseCaseFactory implements Factory<AnalyticsAudioAiClickConvertToTextMessageUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextMessageUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsAudioAiClickConvertToTextMessageUseCase get() {
        return provideAnalyticsAudioAiConvertToTextMessageUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextMessageUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsAudioAiConvertToTextMessageUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsAudioAiClickConvertToTextMessageUseCase provideAnalyticsAudioAiConvertToTextMessageUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsAudioAiClickConvertToTextMessageUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsAudioAiConvertToTextMessageUseCase(analyticsSender));
    }
}
