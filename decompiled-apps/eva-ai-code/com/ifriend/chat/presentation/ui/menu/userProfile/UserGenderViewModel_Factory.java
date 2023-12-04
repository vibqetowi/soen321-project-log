package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.user.change.ChangeUserGenderUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class UserGenderViewModel_Factory implements Factory<UserGenderViewModel> {
    private final Provider<ChangeUserGenderUseCase> changeUserGenderUseCaseProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;

    public UserGenderViewModel_Factory(Provider<GetUserUseCase> provider, Provider<ChangeUserGenderUseCase> provider2, Provider<RouterProvider> provider3, Provider<CoroutineScope> provider4) {
        this.getUserUseCaseProvider = provider;
        this.changeUserGenderUseCaseProvider = provider2;
        this.routerProvider = provider3;
        this.coroutineScopeProvider = provider4;
    }

    @Override // javax.inject.Provider
    public UserGenderViewModel get() {
        return newInstance(this.getUserUseCaseProvider.get(), this.changeUserGenderUseCaseProvider.get(), this.routerProvider.get(), this.coroutineScopeProvider.get());
    }

    public static UserGenderViewModel_Factory create(Provider<GetUserUseCase> provider, Provider<ChangeUserGenderUseCase> provider2, Provider<RouterProvider> provider3, Provider<CoroutineScope> provider4) {
        return new UserGenderViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static UserGenderViewModel newInstance(GetUserUseCase getUserUseCase, ChangeUserGenderUseCase changeUserGenderUseCase, RouterProvider routerProvider, CoroutineScope coroutineScope) {
        return new UserGenderViewModel(getUserUseCase, changeUserGenderUseCase, routerProvider, coroutineScope);
    }
}
