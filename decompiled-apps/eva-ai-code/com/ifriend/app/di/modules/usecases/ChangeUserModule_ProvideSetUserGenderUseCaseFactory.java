package com.ifriend.app.di.modules.usecases;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeUserModule_ProvideSetUserGenderUseCaseFactory implements Factory<ChangeUserGenderUseCase> {
    private final ChangeUserModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChangeUserModule_ProvideSetUserGenderUseCaseFactory(ChangeUserModule changeUserModule, Provider<UserRepository> provider) {
        this.module = changeUserModule;
        this.userRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChangeUserGenderUseCase get() {
        return provideSetUserGenderUseCase(this.module, this.userRepositoryProvider.get());
    }

    public static ChangeUserModule_ProvideSetUserGenderUseCaseFactory create(ChangeUserModule changeUserModule, Provider<UserRepository> provider) {
        return new ChangeUserModule_ProvideSetUserGenderUseCaseFactory(changeUserModule, provider);
    }

    public static ChangeUserGenderUseCase provideSetUserGenderUseCase(ChangeUserModule changeUserModule, UserRepository userRepository) {
        return (ChangeUserGenderUseCase) Preconditions.checkNotNullFromProvides(changeUserModule.provideSetUserGenderUseCase(userRepository));
    }
}
