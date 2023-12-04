package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationReceivedUseCase;
import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsNotificationReceivedUseCaseFactory implements Factory<AnalyticsNotificationReceivedUseCase> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsNotificationReceivedUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppIdentityConverter> provider, Provider<AnalyticsSender> provider2) {
        this.module = analyticUseCasesModule;
        this.appIdentityConverterProvider = provider;
        this.annalsTrackerAnalyticsSenderProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AnalyticsNotificationReceivedUseCase get() {
        return provideAnalyticsNotificationReceivedUseCase(this.module, this.appIdentityConverterProvider.get(), this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsNotificationReceivedUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppIdentityConverter> provider, Provider<AnalyticsSender> provider2) {
        return new AnalyticUseCasesModule_ProvideAnalyticsNotificationReceivedUseCaseFactory(analyticUseCasesModule, provider, provider2);
    }

    public static AnalyticsNotificationReceivedUseCase provideAnalyticsNotificationReceivedUseCase(AnalyticUseCasesModule analyticUseCasesModule, AppIdentityConverter appIdentityConverter, AnalyticsSender analyticsSender) {
        return (AnalyticsNotificationReceivedUseCase) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsNotificationReceivedUseCase(appIdentityConverter, analyticsSender));
    }
}
