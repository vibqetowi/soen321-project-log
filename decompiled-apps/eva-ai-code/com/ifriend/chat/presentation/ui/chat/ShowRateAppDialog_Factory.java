package com.ifriend.chat.presentation.ui.chat;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.data.toggle.IsRateAppDialogEnabledToggle;
import com.ifriend.data.toggle.RateAndReviewUsToggle;
import com.ifriend.ui.base.modalMessage.RateAppPopupDelegate;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ShowRateAppDialog_Factory implements Factory<ShowRateAppDialog> {
    private final Provider<IsRateAppDialogEnabledToggle> isRateAppDialogEnabledToggleProvider;
    private final Provider<RateAndReviewUsToggle> rateAndReviewUsToggleProvider;
    private final Provider<RateAppPopupDelegate> rateAppPopupDelegateProvider;
    private final Provider<RouterProvider> routerProvider;

    public ShowRateAppDialog_Factory(Provider<RateAndReviewUsToggle> provider, Provider<IsRateAppDialogEnabledToggle> provider2, Provider<RouterProvider> provider3, Provider<RateAppPopupDelegate> provider4) {
        this.rateAndReviewUsToggleProvider = provider;
        this.isRateAppDialogEnabledToggleProvider = provider2;
        this.routerProvider = provider3;
        this.rateAppPopupDelegateProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ShowRateAppDialog get() {
        return newInstance(this.rateAndReviewUsToggleProvider.get(), this.isRateAppDialogEnabledToggleProvider.get(), this.routerProvider.get(), this.rateAppPopupDelegateProvider.get());
    }

    public static ShowRateAppDialog_Factory create(Provider<RateAndReviewUsToggle> provider, Provider<IsRateAppDialogEnabledToggle> provider2, Provider<RouterProvider> provider3, Provider<RateAppPopupDelegate> provider4) {
        return new ShowRateAppDialog_Factory(provider, provider2, provider3, provider4);
    }

    public static ShowRateAppDialog newInstance(RateAndReviewUsToggle rateAndReviewUsToggle, IsRateAppDialogEnabledToggle isRateAppDialogEnabledToggle, RouterProvider routerProvider, RateAppPopupDelegate rateAppPopupDelegate) {
        return new ShowRateAppDialog(rateAndReviewUsToggle, isRateAppDialogEnabledToggle, routerProvider, rateAppPopupDelegate);
    }
}
