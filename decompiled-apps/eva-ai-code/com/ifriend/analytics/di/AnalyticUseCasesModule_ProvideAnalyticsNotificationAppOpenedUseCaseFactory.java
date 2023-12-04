package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationAppOpenedUseCase;
import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsNotificationAppOpenedUseCaseFactory implements Factory<AnalyticsNotificationAppOpenedUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;
    private final AnalyticUseCasesModule module;
    private final Provider<AnalyticsSender> pushNotificationOpenedAnalyticsSenderProvider;

    public AnalyticUseCasesModule_ProvideAnalyticsNotificationAppOpenedUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppIdentityConverter> provider, Provider<AnalyticsSender> provider2, Provider<AnalyticsSender> provider3) {
        this.module = analyticUseCasesModule;
        this.appIdentityConverterProvider = provider;
        this.annalsTrackerAnalyticsSenderProvider = provider2;
        this.pushNotificationOpenedAnalyticsSenderProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AnalyticsNotificationAppOpenedUseCase get() {
        return provideAnalyticsNotificationAppOpenedUseCase(this.module, this.appIdentityConverterProvider.get(), this.annalsTrackerAnalyticsSenderProvider.get(), this.pushNotificationOpenedAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsNotificationAppOpenedUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppIdentityConverter> provider, Provider<AnalyticsSender> provider2, Provider<AnalyticsSender> provider3) {
        return new AnalyticUseCasesModule_ProvideAnalyticsNotificationAppOpenedUseCaseFactory(analyticUseCasesModule, provider, provider2, provider3);
    }

    public static AnalyticsNotificationAppOpenedUseCase provideAnalyticsNotificationAppOpenedUseCase(AnalyticUseCasesModule analyticUseCasesModule, AppIdentityConverter appIdentityConverter, AnalyticsSender analyticsSender, AnalyticsSender analyticsSender2) {
        return (AnalyticsNotificationAppOpenedUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsNotificationAppOpenedUseCase(appIdentityConverter, analyticsSender, analyticsSender2));
    }
}
