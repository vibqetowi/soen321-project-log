package com.ifriend.chat.presentation.ui.infoOnboarding;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.ui.infoOnboarding.analytics.InfoOnboardingAnalytics;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InfoOnboardingViewModel_Factory implements Factory<InfoOnboardingViewModel> {
    private final Provider<InfoOnboardingAnalytics> analyticsProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<InfoOnboardingSlideUseCase> infoOnboardingSlideUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;

    public InfoOnboardingViewModel_Factory(Provider<CoroutineDispatchers> provider, Provider<InfoOnboardingSlideUseCase> provider2, Provider<RouterProvider> provider3, Provider<InfoOnboardingAnalytics> provider4) {
        this.dispatchersProvider = provider;
        this.infoOnboardingSlideUseCaseProvider = provider2;
        this.routerProvider = provider3;
        this.analyticsProvider = provider4;
    }

    @Override // javax.inject.Provider
    public InfoOnboardingViewModel get() {
        return newInstance(this.dispatchersProvider.get(), this.infoOnboardingSlideUseCaseProvider.get(), this.routerProvider.get(), this.analyticsProvider.get());
    }

    public static InfoOnboardingViewModel_Factory create(Provider<CoroutineDispatchers> provider, Provider<InfoOnboardingSlideUseCase> provider2, Provider<RouterProvider> provider3, Provider<InfoOnboardingAnalytics> provider4) {
        return new InfoOnboardingViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static InfoOnboardingViewModel newInstance(CoroutineDispatchers coroutineDispatchers, InfoOnboardingSlideUseCase infoOnboardingSlideUseCase, RouterProvider routerProvider, InfoOnboardingAnalytics infoOnboardingAnalytics) {
        return new InfoOnboardingViewModel(coroutineDispatchers, infoOnboardingSlideUseCase, routerProvider, infoOnboardingAnalytics);
    }
}
