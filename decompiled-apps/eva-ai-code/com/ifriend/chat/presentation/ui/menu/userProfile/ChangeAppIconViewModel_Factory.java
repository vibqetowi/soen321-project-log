package com.ifriend.chat.presentation.ui.menu.userProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChangeAppIconViewModel_Factory implements Factory<ChangeAppIconViewModel> {
    private final Provider<PremiumAppIconManager> iconManagerProvider;
    private final Provider<RouterProvider> routerProvider;

    public ChangeAppIconViewModel_Factory(Provider<PremiumAppIconManager> provider, Provider<RouterProvider> provider2) {
        this.iconManagerProvider = provider;
        this.routerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChangeAppIconViewModel get() {
        return newInstance(this.iconManagerProvider.get(), this.routerProvider.get());
    }

    public static ChangeAppIconViewModel_Factory create(Provider<PremiumAppIconManager> provider, Provider<RouterProvider> provider2) {
        return new ChangeAppIconViewModel_Factory(provider, provider2);
    }

    public static ChangeAppIconViewModel newInstance(PremiumAppIconManager premiumAppIconManager, RouterProvider routerProvider) {
        return new ChangeAppIconViewModel(premiumAppIconManager, routerProvider);
    }
}
