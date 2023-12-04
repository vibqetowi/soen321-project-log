package com.ifriend.chat.presentation.ui.rateApp;

import com.ifriend.analytics.usecase.rateUs.AnalyticsRateUsModalUseCase;
import com.ifriend.analytics.usecase.rateUs.AnalyticsReviewUsModalUseCase;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.RateUsRepository;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class RateAppViewModel_Factory implements Factory<RateAppViewModel> {
    private final Provider<AnalyticsRateUsModalUseCase> analyticsRateUsModalUseCaseProvider;
    private final Provider<AnalyticsReviewUsModalUseCase> analyticsReviewUsModalUseCaseProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatcherProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<OnUserRatedAppUseCase> onUserRatedAppUseCaseProvider;
    private final Provider<RateUsRepository> rateUsRepositoryProvider;
    private final Provider<ShowRateUsUseCase> rateUsUseCaseProvider;

    public RateAppViewModel_Factory(Provider<BotRepository> provider, Provider<RateUsRepository> provider2, Provider<AnalyticsRateUsModalUseCase> provider3, Provider<AnalyticsReviewUsModalUseCase> provider4, Provider<InternalNotificationHandler> provider5, Provider<CoroutineScope> provider6, Provider<ShowRateUsUseCase> provider7, Provider<OnUserRatedAppUseCase> provider8, Provider<CoroutineDispatchers> provider9) {
        this.botRepositoryProvider = provider;
        this.rateUsRepositoryProvider = provider2;
        this.analyticsRateUsModalUseCaseProvider = provider3;
        this.analyticsReviewUsModalUseCaseProvider = provider4;
        this.internalNotificationHandlerProvider = provider5;
        this.coroutineScopeProvider = provider6;
        this.rateUsUseCaseProvider = provider7;
        this.onUserRatedAppUseCaseProvider = provider8;
        this.dispatcherProvider = provider9;
    }

    @Override // javax.inject.Provider
    public RateAppViewModel get() {
        return newInstance(this.botRepositoryProvider.get(), this.rateUsRepositoryProvider.get(), this.analyticsRateUsModalUseCaseProvider.get(), this.analyticsReviewUsModalUseCaseProvider.get(), this.internalNotificationHandlerProvider.get(), this.coroutineScopeProvider.get(), this.rateUsUseCaseProvider.get(), this.onUserRatedAppUseCaseProvider.get(), this.dispatcherProvider.get());
    }

    public static RateAppViewModel_Factory create(Provider<BotRepository> provider, Provider<RateUsRepository> provider2, Provider<AnalyticsRateUsModalUseCase> provider3, Provider<AnalyticsReviewUsModalUseCase> provider4, Provider<InternalNotificationHandler> provider5, Provider<CoroutineScope> provider6, Provider<ShowRateUsUseCase> provider7, Provider<OnUserRatedAppUseCase> provider8, Provider<CoroutineDispatchers> provider9) {
        return new RateAppViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static RateAppViewModel newInstance(BotRepository botRepository, RateUsRepository rateUsRepository, AnalyticsRateUsModalUseCase analyticsRateUsModalUseCase, AnalyticsReviewUsModalUseCase analyticsReviewUsModalUseCase, InternalNotificationHandler internalNotificationHandler, CoroutineScope coroutineScope, ShowRateUsUseCase showRateUsUseCase, OnUserRatedAppUseCase onUserRatedAppUseCase, CoroutineDispatchers coroutineDispatchers) {
        return new RateAppViewModel(botRepository, rateUsRepository, analyticsRateUsModalUseCase, analyticsReviewUsModalUseCase, internalNotificationHandler, coroutineScope, showRateUsUseCase, onUserRatedAppUseCase, coroutineDispatchers);
    }
}
