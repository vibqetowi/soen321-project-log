package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsEditBotUseCaseFactory implements Factory<AnalyticsEditBotUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsEditBotUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsEditBotUseCase get() {
        return provideAnalyticsEditBotUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsEditBotUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsEditBotUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsEditBotUseCase provideAnalyticsEditBotUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsEditBotUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsEditBotUseCase(analyticsSender));
    }
}
