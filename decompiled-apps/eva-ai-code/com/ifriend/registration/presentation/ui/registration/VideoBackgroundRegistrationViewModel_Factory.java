package com.ifriend.registration.presentation.ui.registration;

import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.registration.domain.useCase.facebook.AuthWithFacebookUseCase;
import com.ifriend.registration.domain.useCase.google.AuthWithGoogleUseCase;
import com.ifriend.registration.presentation.bridges.facebook.FacebookAuthorizationBridge;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class VideoBackgroundRegistrationViewModel_Factory implements Factory<VideoBackgroundRegistrationViewModel> {
    private final Provider<AnalyticsSetUserIdUseCase> analyticsSetUserIdUseCaseProvider;
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<AuthWithGoogleUseCase> authWithGoogleUseCaseProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<FacebookAuthorizationBridge> facebookLoginBridgeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<SignInWithTokenUseCase> signInUseCaseProvider;
    private final Provider<AuthWithFacebookUseCase> signUpFacebookUseCaseProvider;
    private final Provider<UserAuthorizedAnalyticsSender> userAuthorizedAnalyticsSenderProvider;

    public VideoBackgroundRegistrationViewModel_Factory(Provider<UserAuthorizedAnalyticsSender> provider, Provider<AnalyticsSetUserIdUseCase> provider2, Provider<AuthWithFacebookUseCase> provider3, Provider<AuthWithGoogleUseCase> provider4, Provider<FacebookAuthorizationBridge> provider5, Provider<SignInWithTokenUseCase> provider6, Provider<AppConfigUseCase> provider7, Provider<Logger> provider8, Provider<CoroutineDispatchers> provider9) {
        this.userAuthorizedAnalyticsSenderProvider = provider;
        this.analyticsSetUserIdUseCaseProvider = provider2;
        this.signUpFacebookUseCaseProvider = provider3;
        this.authWithGoogleUseCaseProvider = provider4;
        this.facebookLoginBridgeProvider = provider5;
        this.signInUseCaseProvider = provider6;
        this.appConfigUseCaseProvider = provider7;
        this.loggerProvider = provider8;
        this.dispatchersProvider = provider9;
    }

    @Override // javax.inject.Provider
    public VideoBackgroundRegistrationViewModel get() {
        return newInstance(this.userAuthorizedAnalyticsSenderProvider.get(), this.analyticsSetUserIdUseCaseProvider.get(), this.signUpFacebookUseCaseProvider.get(), this.authWithGoogleUseCaseProvider.get(), this.facebookLoginBridgeProvider.get(), this.signInUseCaseProvider.get(), this.appConfigUseCaseProvider.get(), this.loggerProvider.get(), this.dispatchersProvider.get());
    }

    public static VideoBackgroundRegistrationViewModel_Factory create(Provider<UserAuthorizedAnalyticsSender> provider, Provider<AnalyticsSetUserIdUseCase> provider2, Provider<AuthWithFacebookUseCase> provider3, Provider<AuthWithGoogleUseCase> provider4, Provider<FacebookAuthorizationBridge> provider5, Provider<SignInWithTokenUseCase> provider6, Provider<AppConfigUseCase> provider7, Provider<Logger> provider8, Provider<CoroutineDispatchers> provider9) {
        return new VideoBackgroundRegistrationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static VideoBackgroundRegistrationViewModel newInstance(UserAuthorizedAnalyticsSender userAuthorizedAnalyticsSender, AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase, AuthWithFacebookUseCase authWithFacebookUseCase, AuthWithGoogleUseCase authWithGoogleUseCase, FacebookAuthorizationBridge facebookAuthorizationBridge, SignInWithTokenUseCase signInWithTokenUseCase, AppConfigUseCase appConfigUseCase, Logger logger, CoroutineDispatchers coroutineDispatchers) {
        return new VideoBackgroundRegistrationViewModel(userAuthorizedAnalyticsSender, analyticsSetUserIdUseCase, authWithFacebookUseCase, authWithGoogleUseCase, facebookAuthorizationBridge, signInWithTokenUseCase, appConfigUseCase, logger, coroutineDispatchers);
    }
}
