package com.ifriend.registration.presentation.di;

import com.ifriend.analytics.usecase.auth.AnalyticsSetUserIdUseCase;
import com.ifriend.analytics.usecase.auth.UserAuthorizedAnalyticsSender;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.validation.EmailValidator;
import com.ifriend.registration.domain.useCase.email.SignUpEmailUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AuthorizationModule_Companion_ProvideSignUpEmailUseCaseFactory implements Factory<SignUpEmailUseCase> {
    private final Provider<AnalyticsSetUserIdUseCase> analyticsSetUserIdUseCaseProvider;
    private final Provider<Authorizer> authorizerProvider;
    private final Provider<EmailValidator> emailValidatorProvider;
    private final Provider<InitialDataLoader> initialDataLoaderProvider;
    private final Provider<UpdateOnboardingUseCase> updateOnboardingUseCaseProvider;
    private final Provider<UserAuthorizedAnalyticsSender> userAuthorizedAnalyticsSenderProvider;

    public AuthorizationModule_Companion_ProvideSignUpEmailUseCaseFactory(Provider<Authorizer> provider, Provider<UserAuthorizedAnalyticsSender> provider2, Provider<AnalyticsSetUserIdUseCase> provider3, Provider<UpdateOnboardingUseCase> provider4, Provider<InitialDataLoader> provider5, Provider<EmailValidator> provider6) {
        this.authorizerProvider = provider;
        this.userAuthorizedAnalyticsSenderProvider = provider2;
        this.analyticsSetUserIdUseCaseProvider = provider3;
        this.updateOnboardingUseCaseProvider = provider4;
        this.initialDataLoaderProvider = provider5;
        this.emailValidatorProvider = provider6;
    }

    @Override // javax.inject.Provider
    public SignUpEmailUseCase get() {
        return provideSignUpEmailUseCase(this.authorizerProvider.get(), this.userAuthorizedAnalyticsSenderProvider.get(), this.analyticsSetUserIdUseCaseProvider.get(), this.updateOnboardingUseCaseProvider.get(), this.initialDataLoaderProvider.get(), this.emailValidatorProvider.get());
    }

    public static AuthorizationModule_Companion_ProvideSignUpEmailUseCaseFactory create(Provider<Authorizer> provider, Provider<UserAuthorizedAnalyticsSender> provider2, Provider<AnalyticsSetUserIdUseCase> provider3, Provider<UpdateOnboardingUseCase> provider4, Provider<InitialDataLoader> provider5, Provider<EmailValidator> provider6) {
        return new AuthorizationModule_Companion_ProvideSignUpEmailUseCaseFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static SignUpEmailUseCase provideSignUpEmailUseCase(Authorizer authorizer, UserAuthorizedAnalyticsSender userAuthorizedAnalyticsSender, AnalyticsSetUserIdUseCase analyticsSetUserIdUseCase, UpdateOnboardingUseCase updateOnboardingUseCase, InitialDataLoader initialDataLoader, EmailValidator emailValidator) {
        return (SignUpEmailUseCase) Preconditions.checkNotNullFromProvides(AuthorizationModule.Companion.provideSignUpEmailUseCase(authorizer, userAuthorizedAnalyticsSender, analyticsSetUserIdUseCase, updateOnboardingUseCase, initialDataLoader, emailValidator));
    }
}
