package com.ifriend.registration.presentation.di;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.registration.domain.useCase.google.AuthWithGoogleUseCase;
import com.ifriend.registration.domain.useCase.password.PasswordGenerator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AuthorizationModule_Companion_ProvideAuthWithGoogleUseCaseFactory implements Factory<AuthWithGoogleUseCase> {
    private final Provider<Authorizer> authorizerProvider;
    private final Provider<InitialDataLoader> initialDataLoaderProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<PasswordGenerator> passwordGeneratorProvider;
    private final Provider<UpdateOnboardingUseCase> updateOnboardingUseCaseProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public AuthorizationModule_Companion_ProvideAuthWithGoogleUseCaseFactory(Provider<Authorizer> provider, Provider<UserRepository> provider2, Provider<InitialDataLoader> provider3, Provider<PasswordGenerator> provider4, Provider<Logger> provider5, Provider<UpdateOnboardingUseCase> provider6) {
        this.authorizerProvider = provider;
        this.userRepositoryProvider = provider2;
        this.initialDataLoaderProvider = provider3;
        this.passwordGeneratorProvider = provider4;
        this.loggerProvider = provider5;
        this.updateOnboardingUseCaseProvider = provider6;
    }

    @Override // javax.inject.Provider
    public AuthWithGoogleUseCase get() {
        return provideAuthWithGoogleUseCase(this.authorizerProvider.get(), this.userRepositoryProvider.get(), this.initialDataLoaderProvider.get(), this.passwordGeneratorProvider.get(), this.loggerProvider.get(), this.updateOnboardingUseCaseProvider.get());
    }

    public static AuthorizationModule_Companion_ProvideAuthWithGoogleUseCaseFactory create(Provider<Authorizer> provider, Provider<UserRepository> provider2, Provider<InitialDataLoader> provider3, Provider<PasswordGenerator> provider4, Provider<Logger> provider5, Provider<UpdateOnboardingUseCase> provider6) {
        return new AuthorizationModule_Companion_ProvideAuthWithGoogleUseCaseFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static AuthWithGoogleUseCase provideAuthWithGoogleUseCase(Authorizer authorizer, UserRepository userRepository, InitialDataLoader initialDataLoader, PasswordGenerator passwordGenerator, Logger logger, UpdateOnboardingUseCase updateOnboardingUseCase) {
        return (AuthWithGoogleUseCase) Preconditions.checkNotNullFromProvides(AuthorizationModule.Companion.provideAuthWithGoogleUseCase(authorizer, userRepository, initialDataLoader, passwordGenerator, logger, updateOnboardingUseCase));
    }
}
