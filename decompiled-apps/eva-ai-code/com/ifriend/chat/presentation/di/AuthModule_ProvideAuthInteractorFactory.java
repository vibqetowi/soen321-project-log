package com.ifriend.chat.presentation.di;

import com.ifriend.chat.domain.AuthInteractor;
import com.ifriend.domain.authorization.SignInWithTokenUseCase;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AuthModule_ProvideAuthInteractorFactory implements Factory<AuthInteractor> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final AuthModule module;
    private final Provider<SignInWithTokenUseCase> signInWithTokenUseCaseProvider;

    public AuthModule_ProvideAuthInteractorFactory(AuthModule authModule, Provider<SignInWithTokenUseCase> provider, Provider<AuthDataProvider> provider2) {
        this.module = authModule;
        this.signInWithTokenUseCaseProvider = provider;
        this.authDataProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AuthInteractor get() {
        return provideAuthInteractor(this.module, this.signInWithTokenUseCaseProvider.get(), this.authDataProvider.get());
    }

    public static AuthModule_ProvideAuthInteractorFactory create(AuthModule authModule, Provider<SignInWithTokenUseCase> provider, Provider<AuthDataProvider> provider2) {
        return new AuthModule_ProvideAuthInteractorFactory(authModule, provider, provider2);
    }

    public static AuthInteractor provideAuthInteractor(AuthModule authModule, SignInWithTokenUseCase signInWithTokenUseCase, AuthDataProvider authDataProvider) {
        return (AuthInteractor) Preconditions.checkNotNullFromProvides(authModule.provideAuthInteractor(signInWithTokenUseCase, authDataProvider));
    }
}
