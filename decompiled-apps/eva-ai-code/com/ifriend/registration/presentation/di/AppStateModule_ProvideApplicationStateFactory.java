package com.ifriend.registration.presentation.di;

import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import com.ifriend.domain.data.Preferences;
import com.ifriend.registration.domain.applicationState.ApplicationState;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppStateModule_ProvideApplicationStateFactory implements Factory<ApplicationState> {
    private final Provider<AnalyticsAppOpenUseCase> analyticsAppOpenUseCaseProvider;
    private final Provider<AnalyticsFirstAppOpenUseCase> analyticsFirstAppOpenUseCaseProvider;
    private final AppStateModule module;
    private final Provider<Preferences> preferencesProvider;

    public AppStateModule_ProvideApplicationStateFactory(AppStateModule appStateModule, Provider<AnalyticsAppOpenUseCase> provider, Provider<AnalyticsFirstAppOpenUseCase> provider2, Provider<Preferences> provider3) {
        this.module = appStateModule;
        this.analyticsAppOpenUseCaseProvider = provider;
        this.analyticsFirstAppOpenUseCaseProvider = provider2;
        this.preferencesProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ApplicationState get() {
        return provideApplicationState(this.module, this.analyticsAppOpenUseCaseProvider.get(), this.analyticsFirstAppOpenUseCaseProvider.get(), this.preferencesProvider.get());
    }

    public static AppStateModule_ProvideApplicationStateFactory create(AppStateModule appStateModule, Provider<AnalyticsAppOpenUseCase> provider, Provider<AnalyticsFirstAppOpenUseCase> provider2, Provider<Preferences> provider3) {
        return new AppStateModule_ProvideApplicationStateFactory(appStateModule, provider, provider2, provider3);
    }

    public static ApplicationState provideApplicationState(AppStateModule appStateModule, AnalyticsAppOpenUseCase analyticsAppOpenUseCase, AnalyticsFirstAppOpenUseCase analyticsFirstAppOpenUseCase, Preferences preferences) {
        return (ApplicationState) Preconditions.checkNotNullFromProvides(appStateModule.provideApplicationState(analyticsAppOpenUseCase, analyticsFirstAppOpenUseCase, preferences));
    }
}
