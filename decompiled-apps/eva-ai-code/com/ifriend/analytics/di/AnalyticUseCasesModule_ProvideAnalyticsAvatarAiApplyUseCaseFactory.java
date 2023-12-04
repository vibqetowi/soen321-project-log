package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.avatarAi.AnalyticsAvatarAiApplyUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsAvatarAiApplyUseCaseFactory implements Factory<AnalyticsAvatarAiApplyUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsAvatarAiApplyUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsAvatarAiApplyUseCase get() {
        return provideAnalyticsAvatarAiApplyUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsAvatarAiApplyUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsAvatarAiApplyUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsAvatarAiApplyUseCase provideAnalyticsAvatarAiApplyUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsAvatarAiApplyUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsAvatarAiApplyUseCase(analyticsSender));
    }
}
