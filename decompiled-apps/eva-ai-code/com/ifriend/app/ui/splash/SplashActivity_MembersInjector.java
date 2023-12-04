package com.ifriend.app.ui.splash;

import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.ui.base.BaseActivity_MembersInjector;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
    private final Provider<InternetConnectionDialogsManager> internetConnectionDialogsManagerProvider;
    private final Provider<NoInternetPopupDelegate> noInternetPopupDelegateProvider;
    private final Provider<PremiumAppIconManager> premiumAppIconManagerProvider;
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public SplashActivity_MembersInjector(Provider<NoInternetPopupDelegate> provider, Provider<InternetConnectionDialogsManager> provider2, Provider<ViewModelFactory> provider3, Provider<PremiumAppIconManager> provider4) {
        this.noInternetPopupDelegateProvider = provider;
        this.internetConnectionDialogsManagerProvider = provider2;
        this.viewModelFactoryProvider = provider3;
        this.premiumAppIconManagerProvider = provider4;
    }

    public static MembersInjector<SplashActivity> create(Provider<NoInternetPopupDelegate> provider, Provider<InternetConnectionDialogsManager> provider2, Provider<ViewModelFactory> provider3, Provider<PremiumAppIconManager> provider4) {
        return new SplashActivity_MembersInjector(provider, provider2, provider3, provider4);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SplashActivity splashActivity) {
        BaseActivity_MembersInjector.injectNoInternetPopupDelegate(splashActivity, this.noInternetPopupDelegateProvider.get());
        BaseActivity_MembersInjector.injectInternetConnectionDialogsManager(splashActivity, this.internetConnectionDialogsManagerProvider.get());
        injectViewModelFactory(splashActivity, this.viewModelFactoryProvider.get());
        injectPremiumAppIconManager(splashActivity, this.premiumAppIconManagerProvider.get());
    }

    public static void injectViewModelFactory(SplashActivity splashActivity, ViewModelFactory viewModelFactory) {
        splashActivity.viewModelFactory = viewModelFactory;
    }

    public static void injectPremiumAppIconManager(SplashActivity splashActivity, PremiumAppIconManager premiumAppIconManager) {
        splashActivity.premiumAppIconManager = premiumAppIconManager;
    }
}
