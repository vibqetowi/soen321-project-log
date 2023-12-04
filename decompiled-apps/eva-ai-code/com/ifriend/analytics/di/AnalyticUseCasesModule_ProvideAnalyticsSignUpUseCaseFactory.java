package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.domain.data.install.AppInstallStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AnalyticUseCasesModule_ProvideAnalyticsSignUpUseCaseFactory implements Factory<UserAuthorizedAnalyticsSender> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final Provider<AppInstallStorage> appInstallStorageProvider;
    private final Provider<AnalyticsSender> appsFlyerAnalyticsSenderProvider;
    private final Provider<AnalyticsSender> firebaseAnalyticsSenderProvider;
    private final AnalyticUseCasesModule module;

    public AnalyticUseCasesModule_ProvideAnalyticsSignUpUseCaseFactory(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppInstallStorage> provider, Provider<AnalyticsSender> provider2, Provider<AnalyticsSender> provider3, Provider<AnalyticsSender> provider4) {
        this.module = analyticUseCasesModule;
        this.appInstallStorageProvider = provider;
        this.firebaseAnalyticsSenderProvider = provider2;
        this.appsFlyerAnalyticsSenderProvider = provider3;
        this.annalsTrackerAnalyticsSenderProvider = provider4;
    }

    @Override // javax.inject.Provider
    public UserAuthorizedAnalyticsSender get() {
        return provideAnalyticsSignUpUseCase(this.module, this.appInstallStorageProvider.get(), this.firebaseAnalyticsSenderProvider.get(), this.appsFlyerAnalyticsSenderProvider.get(), this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AnalyticUseCasesModule_ProvideAnalyticsSignUpUseCaseFactory create(AnalyticUseCasesModule analyticUseCasesModule, Provider<AppInstallStorage> provider, Provider<AnalyticsSender> provider2, Provider<AnalyticsSender> provider3, Provider<AnalyticsSender> provider4) {
        return new AnalyticUseCasesModule_ProvideAnalyticsSignUpUseCaseFactory(analyticUseCasesModule, provider, provider2, provider3, provider4);
    }

    public static UserAuthorizedAnalyticsSender provideAnalyticsSignUpUseCase(AnalyticUseCasesModule analyticUseCasesModule, AppInstallStorage appInstallStorage, AnalyticsSender analyticsSender, AnalyticsSender analyticsSender2, AnalyticsSender analyticsSender3) {
        return (UserAuthorizedAnalyticsSender) Preconditions.checkNotNullFromProvides(analyticUseCasesModule.provideAnalyticsSignUpUseCase(appInstallStorage, analyticsSender, analyticsSender2, analyticsSender3));
    }
}
