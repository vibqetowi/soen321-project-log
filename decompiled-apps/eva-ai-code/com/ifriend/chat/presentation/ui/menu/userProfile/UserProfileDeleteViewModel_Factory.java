package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.profile.user.DeleteUserUseCase;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserProfileDeleteViewModel_Factory implements Factory<UserProfileDeleteViewModel> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<DeleteUserUseCase> deleteUserUseCaseProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<GetBotUseCase> getBotUseCaseProvider;
    private final Provider<PremiumAppIconManager> premiumAppIconManagerProvider;
    private final Provider<RouterProvider> routerProvider;

    public UserProfileDeleteViewModel_Factory(Provider<DeleteUserUseCase> provider, Provider<PremiumAppIconManager> provider2, Provider<GetBotUseCase> provider3, Provider<RouterProvider> provider4, Provider<AppEventsEmitter> provider5, Provider<CoroutineDispatchers> provider6) {
        this.deleteUserUseCaseProvider = provider;
        this.premiumAppIconManagerProvider = provider2;
        this.getBotUseCaseProvider = provider3;
        this.routerProvider = provider4;
        this.appEventsEmitterProvider = provider5;
        this.dispatchersProvider = provider6;
    }

    @Override // javax.inject.Provider
    public UserProfileDeleteViewModel get() {
        return newInstance(this.deleteUserUseCaseProvider.get(), this.premiumAppIconManagerProvider.get(), this.getBotUseCaseProvider.get(), this.routerProvider.get(), this.appEventsEmitterProvider.get(), this.dispatchersProvider.get());
    }

    public static UserProfileDeleteViewModel_Factory create(Provider<DeleteUserUseCase> provider, Provider<PremiumAppIconManager> provider2, Provider<GetBotUseCase> provider3, Provider<RouterProvider> provider4, Provider<AppEventsEmitter> provider5, Provider<CoroutineDispatchers> provider6) {
        return new UserProfileDeleteViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static UserProfileDeleteViewModel newInstance(DeleteUserUseCase deleteUserUseCase, PremiumAppIconManager premiumAppIconManager, GetBotUseCase getBotUseCase, RouterProvider routerProvider, AppEventsEmitter appEventsEmitter, CoroutineDispatchers coroutineDispatchers) {
        return new UserProfileDeleteViewModel(deleteUserUseCase, premiumAppIconManager, getBotUseCase, routerProvider, appEventsEmitter, coroutineDispatchers);
    }
}
