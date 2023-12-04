package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeUserModule_ProvideSetUserNameUseCaseFactory implements Factory<ChangeUserNameUseCase> {
    private final ChangeUserModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChangeUserModule_ProvideSetUserNameUseCaseFactory(ChangeUserModule changeUserModule, Provider<UserRepository> provider) {
        this.module = changeUserModule;
        this.userRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChangeUserNameUseCase get() {
        return provideSetUserNameUseCase(this.module, this.userRepositoryProvider.get());
    }

    public static ChangeUserModule_ProvideSetUserNameUseCaseFactory create(ChangeUserModule changeUserModule, Provider<UserRepository> provider) {
        return new ChangeUserModule_ProvideSetUserNameUseCaseFactory(changeUserModule, provider);
    }

    public static ChangeUserNameUseCase provideSetUserNameUseCase(ChangeUserModule changeUserModule, UserRepository userRepository) {
        return (ChangeUserNameUseCase) Preconditions.checkNotNullFromProvides(changeUserModule.provideSetUserNameUseCase(userRepository));
    }
}
