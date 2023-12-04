package com.ifriend.registration.presentation.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.usecase.auth.AuthScreenOpenedAnalytics;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.install.AppInstallStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AuthAnalyticsModule_ProvideAuthScreenOpenedAnalyticsFactory implements Factory<AuthScreenOpenedAnalytics> {
    private final Provider<AnalyticsSender> annalsTrackerAnalyticsSenderProvider;
    private final Provider<AppInstallStorage> appInstallStorageProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final AuthAnalyticsModule module;
    private final Provider<Preferences> preferencesProvider;

    public AuthAnalyticsModule_ProvideAuthScreenOpenedAnalyticsFactory(AuthAnalyticsModule authAnalyticsModule, Provider<Preferences> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3, Provider<AppInstallStorage> provider4, Provider<AnalyticsSender> provider5) {
        this.module = authAnalyticsModule;
        this.preferencesProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.dispatchersProvider = provider3;
        this.appInstallStorageProvider = provider4;
        this.annalsTrackerAnalyticsSenderProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AuthScreenOpenedAnalytics get() {
        return provideAuthScreenOpenedAnalytics(this.module, this.preferencesProvider.get(), this.coroutineScopeProvider.get(), this.dispatchersProvider.get(), this.appInstallStorageProvider.get(), this.annalsTrackerAnalyticsSenderProvider.get());
    }

    public static AuthAnalyticsModule_ProvideAuthScreenOpenedAnalyticsFactory create(AuthAnalyticsModule authAnalyticsModule, Provider<Preferences> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3, Provider<AppInstallStorage> provider4, Provider<AnalyticsSender> provider5) {
        return new AuthAnalyticsModule_ProvideAuthScreenOpenedAnalyticsFactory(authAnalyticsModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AuthScreenOpenedAnalytics provideAuthScreenOpenedAnalytics(AuthAnalyticsModule authAnalyticsModule, Preferences preferences, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, AppInstallStorage appInstallStorage, AnalyticsSender analyticsSender) {
        return (AuthScreenOpenedAnalytics) Preconditions.checkNotNullFromProvides(authAnalyticsModule.provideAuthScreenOpenedAnalytics(preferences, coroutineScope, coroutineDispatchers, appInstallStorage, analyticsSender));
    }
}
