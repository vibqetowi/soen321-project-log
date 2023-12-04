package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.useCases.user.change.ChangeUserAgeUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserAgeViewModel_Factory implements Factory<UserAgeViewModel> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<ChangeUserAgeUseCase> changeUserAgeUseCaseProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;

    public UserAgeViewModel_Factory(Provider<GetUserUseCase> provider, Provider<ChangeUserAgeUseCase> provider2, Provider<RouterProvider> provider3, Provider<AppConfigUseCase> provider4) {
        this.getUserUseCaseProvider = provider;
        this.changeUserAgeUseCaseProvider = provider2;
        this.routerProvider = provider3;
        this.appConfigUseCaseProvider = provider4;
    }

    @Override // javax.inject.Provider
    public UserAgeViewModel get() {
        return newInstance(this.getUserUseCaseProvider.get(), this.changeUserAgeUseCaseProvider.get(), this.routerProvider.get(), this.appConfigUseCaseProvider.get());
    }

    public static UserAgeViewModel_Factory create(Provider<GetUserUseCase> provider, Provider<ChangeUserAgeUseCase> provider2, Provider<RouterProvider> provider3, Provider<AppConfigUseCase> provider4) {
        return new UserAgeViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static UserAgeViewModel newInstance(GetUserUseCase getUserUseCase, ChangeUserAgeUseCase changeUserAgeUseCase, RouterProvider routerProvider, AppConfigUseCase appConfigUseCase) {
        return new UserAgeViewModel(getUserUseCase, changeUserAgeUseCase, routerProvider, appConfigUseCase);
    }
}
