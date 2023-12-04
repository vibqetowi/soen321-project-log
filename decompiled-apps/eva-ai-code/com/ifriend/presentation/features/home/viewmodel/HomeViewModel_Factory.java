package com.ifriend.presentation.features.home.viewmodel;

import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.home.analytics.HomeAnalyticsInteractor;
import com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl;
import com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegateImpl;
import com.ifriend.presentation.features.profile.menu.delegate.ProfileMenuDelegateImpl;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<FeatureToggleRepository> featureToggleRepositoryProvider;
    private final Provider<HomeAnalyticsInteractor> homeAnalyticsProvider;
    private final Provider<HomeChatsDelegateImpl> homeChatsDelegateProvider;
    private final Provider<HomeHandleDeepLinksDelegateImpl> homeHandleDeepLinksDelegateProvider;
    private final Provider<ProfileMenuDelegateImpl> profileMenuDelegateProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;

    public HomeViewModel_Factory(Provider<HomeChatsDelegateImpl> provider, Provider<UserBalanceRepository> provider2, Provider<HomeHandleDeepLinksDelegateImpl> provider3, Provider<ProfileMenuDelegateImpl> provider4, Provider<AppEventsEmitter> provider5, Provider<HomeAnalyticsInteractor> provider6, Provider<FeatureToggleRepository> provider7, Provider<AppConfigUseCase> provider8) {
        this.homeChatsDelegateProvider = provider;
        this.userBalanceRepositoryProvider = provider2;
        this.homeHandleDeepLinksDelegateProvider = provider3;
        this.profileMenuDelegateProvider = provider4;
        this.appEventsEmitterProvider = provider5;
        this.homeAnalyticsProvider = provider6;
        this.featureToggleRepositoryProvider = provider7;
        this.appConfigUseCaseProvider = provider8;
    }

    @Override // javax.inject.Provider
    public HomeViewModel get() {
        return newInstance(this.homeChatsDelegateProvider.get(), this.userBalanceRepositoryProvider.get(), this.homeHandleDeepLinksDelegateProvider.get(), this.profileMenuDelegateProvider.get(), this.appEventsEmitterProvider.get(), this.homeAnalyticsProvider.get(), this.featureToggleRepositoryProvider.get(), this.appConfigUseCaseProvider.get());
    }

    public static HomeViewModel_Factory create(Provider<HomeChatsDelegateImpl> provider, Provider<UserBalanceRepository> provider2, Provider<HomeHandleDeepLinksDelegateImpl> provider3, Provider<ProfileMenuDelegateImpl> provider4, Provider<AppEventsEmitter> provider5, Provider<HomeAnalyticsInteractor> provider6, Provider<FeatureToggleRepository> provider7, Provider<AppConfigUseCase> provider8) {
        return new HomeViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static HomeViewModel newInstance(HomeChatsDelegateImpl homeChatsDelegateImpl, UserBalanceRepository userBalanceRepository, HomeHandleDeepLinksDelegateImpl homeHandleDeepLinksDelegateImpl, ProfileMenuDelegateImpl profileMenuDelegateImpl, AppEventsEmitter appEventsEmitter, HomeAnalyticsInteractor homeAnalyticsInteractor, FeatureToggleRepository featureToggleRepository, AppConfigUseCase appConfigUseCase) {
        return new HomeViewModel(homeChatsDelegateImpl, userBalanceRepository, homeHandleDeepLinksDelegateImpl, profileMenuDelegateImpl, appEventsEmitter, homeAnalyticsInteractor, featureToggleRepository, appConfigUseCase);
    }
}
