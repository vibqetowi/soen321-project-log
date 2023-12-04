package com.ifriend.registration.presentation.di;

import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.registration.domain.useCase.facebook.AuthWithFacebookUseCase;
import com.ifriend.registration.domain.useCase.password.PasswordGenerator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AuthorizationModule_Companion_ProvideSignUpFacebookUseCaseFactory implements Factory<AuthWithFacebookUseCase> {
    private final Provider<Authorizer> authorizerProvider;
    private final Provider<InitialDataLoader> initialDataLoaderProvider;
    private final Provider<PasswordGenerator> passwordGeneratorProvider;
    private final Provider<UpdateOnboardingUseCase> updateOnboardingUseCaseProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public AuthorizationModule_Companion_ProvideSignUpFacebookUseCaseFactory(Provider<Authorizer> provider, Provider<UserRepository> provider2, Provider<InitialDataLoader> provider3, Provider<PasswordGenerator> provider4, Provider<UpdateOnboardingUseCase> provider5) {
        this.authorizerProvider = provider;
        this.userRepositoryProvider = provider2;
        this.initialDataLoaderProvider = provider3;
        this.passwordGeneratorProvider = provider4;
        this.updateOnboardingUseCaseProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AuthWithFacebookUseCase get() {
        return provideSignUpFacebookUseCase(this.authorizerProvider.get(), this.userRepositoryProvider.get(), this.initialDataLoaderProvider.get(), this.passwordGeneratorProvider.get(), this.updateOnboardingUseCaseProvider.get());
    }

    public static AuthorizationModule_Companion_ProvideSignUpFacebookUseCaseFactory create(Provider<Authorizer> provider, Provider<UserRepository> provider2, Provider<InitialDataLoader> provider3, Provider<PasswordGenerator> provider4, Provider<UpdateOnboardingUseCase> provider5) {
        return new AuthorizationModule_Companion_ProvideSignUpFacebookUseCaseFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static AuthWithFacebookUseCase provideSignUpFacebookUseCase(Authorizer authorizer, UserRepository userRepository, InitialDataLoader initialDataLoader, PasswordGenerator passwordGenerator, UpdateOnboardingUseCase updateOnboardingUseCase) {
        return (AuthWithFacebookUseCase) Preconditions.checkNotNullFromProvides(AuthorizationModule.Companion.provideSignUpFacebookUseCase(authorizer, userRepository, initialDataLoader, passwordGenerator, updateOnboardingUseCase));
    }
}
