package com.ifriend.app.di.modules;

import com.ifriend.domain.authorization.Authorizer;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.logic.onboarding.UpdateOnboardingUseCase;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import com.ifriend.domain.storage.token.UserTokenStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class CoreAuthModule_ProvideSignInUseCaseFactory implements Factory<SignInWithTokenUseCase> {
    private final Provider<Authorizer> authorizerProvider;
    private final Provider<InitialDataLoader> initialDataLoaderProvider;
    private final CoreAuthModule module;
    private final Provider<UpdateOnboardingUseCase> updateOnboardingUseCaseProvider;
    private final Provider<UserTokenStorage> userTokenStorageProvider;

    public CoreAuthModule_ProvideSignInUseCaseFactory(CoreAuthModule coreAuthModule, Provider<UserTokenStorage> provider, Provider<Authorizer> provider2, Provider<InitialDataLoader> provider3, Provider<UpdateOnboardingUseCase> provider4) {
        this.module = coreAuthModule;
        this.userTokenStorageProvider = provider;
        this.authorizerProvider = provider2;
        this.initialDataLoaderProvider = provider3;
        this.updateOnboardingUseCaseProvider = provider4;
    }

    @Override // javax.inject.Provider
    public SignInWithTokenUseCase get() {
        return provideSignInUseCase(this.module, this.userTokenStorageProvider.get(), this.authorizerProvider.get(), this.initialDataLoaderProvider.get(), this.updateOnboardingUseCaseProvider.get());
    }

    public static CoreAuthModule_ProvideSignInUseCaseFactory create(CoreAuthModule coreAuthModule, Provider<UserTokenStorage> provider, Provider<Authorizer> provider2, Provider<InitialDataLoader> provider3, Provider<UpdateOnboardingUseCase> provider4) {
        return new CoreAuthModule_ProvideSignInUseCaseFactory(coreAuthModule, provider, provider2, provider3, provider4);
    }

    public static SignInWithTokenUseCase provideSignInUseCase(CoreAuthModule coreAuthModule, UserTokenStorage userTokenStorage, Authorizer authorizer, InitialDataLoader initialDataLoader, UpdateOnboardingUseCase updateOnboardingUseCase) {
        return (SignInWithTokenUseCase) Preconditions.checkNotNullFromProvides(coreAuthModule.provideSignInUseCase(userTokenStorage, authorizer, initialDataLoader, updateOnboardingUseCase));
    }
}
