package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.user.change.ChangeUserNameUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.domain.validation.ValidateNameUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserNameViewModel_Factory implements Factory<UserNameViewModel> {
    private final Provider<ChangeUserNameUseCase> changeUserNameUseCaseProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;
    private final Provider<ValidateNameUseCase> validateNameUseCaseProvider;

    public UserNameViewModel_Factory(Provider<GetUserUseCase> provider, Provider<ChangeUserNameUseCase> provider2, Provider<ValidateNameUseCase> provider3, Provider<RouterProvider> provider4) {
        this.getUserUseCaseProvider = provider;
        this.changeUserNameUseCaseProvider = provider2;
        this.validateNameUseCaseProvider = provider3;
        this.routerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public UserNameViewModel get() {
        return newInstance(this.getUserUseCaseProvider.get(), this.changeUserNameUseCaseProvider.get(), this.validateNameUseCaseProvider.get(), this.routerProvider.get());
    }

    public static UserNameViewModel_Factory create(Provider<GetUserUseCase> provider, Provider<ChangeUserNameUseCase> provider2, Provider<ValidateNameUseCase> provider3, Provider<RouterProvider> provider4) {
        return new UserNameViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static UserNameViewModel newInstance(GetUserUseCase getUserUseCase, ChangeUserNameUseCase changeUserNameUseCase, ValidateNameUseCase validateNameUseCase, RouterProvider routerProvider) {
        return new UserNameViewModel(getUserUseCase, changeUserNameUseCase, validateNameUseCase, routerProvider);
    }
}
