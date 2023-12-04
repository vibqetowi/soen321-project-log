package com.ifriend.app.ui.splash;

import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.notifications.AnalyticsNotificationAppOpenedUseCase;
import com.ifriend.chat.api.AppActivityScreenFactory;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.authorization.confirmEmail.ConfirmEmailRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.registration.StartRegistrationUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
    private final Provider<AnalyticsAppOpenUseCase> analyticsAppOpenUseCaseProvider;
    private final Provider<AnalyticsFirstAppOpenUseCase> analyticsFirstAppOpenUseCaseProvider;
    private final Provider<AnalyticsNotificationAppOpenedUseCase> analyticsNotificationAppOpenedUseCaseProvider;
    private final Provider<AnalyticsSetUserIdUseCase> analyticsSetUserIdUseCaseProvider;
    private final Provider<AppActivityScreenFactory> appActivityScreenFactoryProvider;
    private final Provider<ConfirmEmailRepository> confirmEmailRepositoryProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<SignInWithTokenUseCase> signInWithTokenUseCaseProvider;
    private final Provider<StartRegistrationUseCase> startRegistrationUseCaseProvider;

    /* renamed from: сhatsInfoConfigurationRepositoryProvider  reason: contains not printable characters */
    private final Provider<ChatsInfoConfigurationRepository> f64hatsInfoConfigurationRepositoryProvider;

    public SplashViewModel_Factory(Provider<SignInWithTokenUseCase> provider, Provider<StartRegistrationUseCase> provider2, Provider<AppActivityScreenFactory> provider3, Provider<ConfirmEmailRepository> provider4, Provider<CoroutineScope> provider5, Provider<AnalyticsAppOpenUseCase> provider6, Provider<AnalyticsSetUserIdUseCase> provider7, Provider<AnalyticsFirstAppOpenUseCase> provider8, Provider<AnalyticsNotificationAppOpenedUseCase> provider9, Provider<CoroutineDispatchers> provider10, Provider<ChatsInfoConfigurationRepository> provider11) {
        this.signInWithTokenUseCaseProvider = provider;
        this.startRegistrationUseCaseProvider = provider2;
        this.appActivityScreenFactoryProvider = provider3;
        this.confirmEmailRepositoryProvider = provider4;
        this.coroutineScopeProvider = provider5;
        this.analyticsAppOpenUseCaseProvider = provider6;
        this.analyticsSetUserIdUseCaseProvider = provider7;
        this.analyticsFirstAppOpenUseCaseProvider = provider8;
        this.analyticsNotificationAppOpenedUseCaseProvider = provider9;
        this.dispatchersProvider = provider10;
        this.f64hatsInfoConfigurationRepositoryProvider = provider11;
    }

    @Override // javax.inject.Provider
    public SplashViewModel get() {
        return newInstance(this.signInWithTokenUseCaseProvider.get(), this.startRegistrationUseCaseProvider.get(), this.appActivityScreenFactoryProvider.get(), this.confirmEmailRepositoryProvider.get(), this.coroutineScopeProvider.get(), this.analyticsAppOpenUseCaseProvider.get(), this.analyticsSetUserIdUseCaseProvider.get(), this.analyticsFirstAppOpenUseCaseProvider.get(), this.analyticsNotificationAppOpenedUseCaseProvider.get(), this.dispatchersProvider.get(), this.f64hatsInfoConfigurationRepositoryProvider.get());
    }

    public static SplashViewModel_Factory create(Provider<SignInWithTokenUseCase> provider, Provider<StartRegistrationUseCase> provider2, Provider<AppActivityScreenFactory> provider3, Provider<ConfirmEmailRepository> provider4, Provider<CoroutineScope> provider5, Provider<AnalyticsAppOpenUseCase> provider6, Provider<AnalyticsSetUserIdUseCase> provider7, Provider<AnalyticsFirstAppOpenUseCase> provider8, Provider<AnalyticsNotificationAppOpenedUseCase> provider9, Provider<CoroutineDispatchers> provider10, Provider<ChatsInfoConfigurationRepository> provider11) {
        return new SplashViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static SplashViewModel newInstance(SignInWithTokenUseCase signInWithTokenUseCase, StartRegistrationUseCase startRegistrationUseCase, AppActivityScreenFactory appActivityScreenFactory, ConfirmEmailRepository confirmEmailRepository, CoroutineScope coroutineScope, AnalyticsAppOpenUseCase analyticsAppOpenUseCase, AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase, AnalyticsFirstAppOpenUseCase analyticsFirstAppOpenUseCase, AnalyticsNotificationAppOpenedUseCase analyticsNotificationAppOpenedUseCase, CoroutineDispatchers coroutineDispatchers, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository) {
        return new SplashViewModel(signInWithTokenUseCase, startRegistrationUseCase, appActivityScreenFactory, confirmEmailRepository, coroutineScope, analyticsAppOpenUseCase, analyticsSetUserIdUseCase, analyticsFirstAppOpenUseCase, analyticsNotificationAppOpenedUseCase, coroutineDispatchers, chatsInfoConfigurationRepository);
    }
}
