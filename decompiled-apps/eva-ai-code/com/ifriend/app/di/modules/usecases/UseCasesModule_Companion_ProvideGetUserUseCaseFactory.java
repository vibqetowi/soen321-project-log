package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UseCasesModule_Companion_ProvideGetUserUseCaseFactory implements Factory<GetUserUseCase> {
    private final Provider<UserRepository> repositoryProvider;

    public UseCasesModule_Companion_ProvideGetUserUseCaseFactory(Provider<UserRepository> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public GetUserUseCase get() {
        return provideGetUserUseCase(this.repositoryProvider.get());
    }

    public static UseCasesModule_Companion_ProvideGetUserUseCaseFactory create(Provider<UserRepository> provider) {
        return new UseCasesModule_Companion_ProvideGetUserUseCaseFactory(provider);
    }

    public static GetUserUseCase provideGetUserUseCase(UserRepository userRepository) {
        return (GetUserUseCase) Preconditions.checkNotNullFromProvides(UseCasesModule.Companion.provideGetUserUseCase(userRepository));
    }
}
