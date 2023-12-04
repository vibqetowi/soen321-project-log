package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.AppConfigUseCase;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserProfileViewModel_Factory implements Factory<UserProfileViewModel> {
    private final Provider<AppConfigUseCase> appConfigUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BillingPurchaseDelegate.Factory> billingPurchaseDelegateProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<RouterProvider> routerProvider;

    public UserProfileViewModel_Factory(Provider<GetUserUseCase> provider, Provider<AppConfigUseCase> provider2, Provider<RouterProvider> provider3, Provider<AppEventsEmitter> provider4, Provider<BillingPurchaseDelegate.Factory> provider5) {
        this.getUserUseCaseProvider = provider;
        this.appConfigUseCaseProvider = provider2;
        this.routerProvider = provider3;
        this.appEventsEmitterProvider = provider4;
        this.billingPurchaseDelegateProvider = provider5;
    }

    @Override // javax.inject.Provider
    public UserProfileViewModel get() {
        return newInstance(this.getUserUseCaseProvider.get(), this.appConfigUseCaseProvider.get(), this.routerProvider.get(), this.appEventsEmitterProvider.get(), this.billingPurchaseDelegateProvider.get());
    }

    public static UserProfileViewModel_Factory create(Provider<GetUserUseCase> provider, Provider<AppConfigUseCase> provider2, Provider<RouterProvider> provider3, Provider<AppEventsEmitter> provider4, Provider<BillingPurchaseDelegate.Factory> provider5) {
        return new UserProfileViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static UserProfileViewModel newInstance(GetUserUseCase getUserUseCase, AppConfigUseCase appConfigUseCase, RouterProvider routerProvider, AppEventsEmitter appEventsEmitter, BillingPurchaseDelegate.Factory factory) {
        return new UserProfileViewModel(getUserUseCase, appConfigUseCase, routerProvider, appEventsEmitter, factory);
    }
}
