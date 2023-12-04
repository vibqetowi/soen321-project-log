package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationPermissionChangedUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsNotificationPermissionChangedUseCaseFactory implements Factory<AnalyticsNotificationPermissionChangedUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsNotificationPermissionChangedUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        this.module = analyticUseCasesModule;
        this.annalsTrackerAnalyticsSenderProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsNotificationPermissionChangedUseCase get() {
        return provideAnalyticsNotificationPermissionChangedUseCase(this.module, this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsNotificationPermissionChangedUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AnalyticsSender> provider) {
        return new AnalyticUseCasesModule_ProvideAnalyticsNotificationPermissionChangedUseCaseFactory(analyticUseCasesModule, provider);
    }

    public static AnalyticsNotificationPermissionChangedUseCase provideAnalyticsNotificationPermissionChangedUseCase(AnalyticUseCasesModule analyticUseCasesModule, AnalyticsSender analyticsSender) {
        return (AnalyticsNotificationPermissionChangedUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsNotificationPermissionChangedUseCase(analyticsSender));
    }
}
