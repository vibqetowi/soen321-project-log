package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.useCases.user.change.ChangeUserAgeUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeUserModule_ProvideSetUserAgeUseCaseFactory implements Factory<ChangeUserAgeUseCase> {
    private final ChangeUserModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChangeUserModule_ProvideSetUserAgeUseCaseFactory(ChangeUserModule changeUserModule, Provider<UserRepository> provider) {
        this.module = changeUserModule;
        this.userRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChangeUserAgeUseCase get() {
        return provideSetUserAgeUseCase(this.module, this.userRepositoryProvider.get());
    }

    public static ChangeUserModule_ProvideSetUserAgeUseCaseFactory create(ChangeUserModule changeUserModule, Provider<UserRepository> provider) {
        return new ChangeUserModule_ProvideSetUserAgeUseCaseFactory(changeUserModule, provider);
    }

    public static ChangeUserAgeUseCase provideSetUserAgeUseCase(ChangeUserModule changeUserModule, UserRepository userRepository) {
        return (ChangeUserAgeUseCase) Preconditions.checkNotNullFromProvides(changeUserModule.provideSetUserAgeUseCase(userRepository));
    }
}
