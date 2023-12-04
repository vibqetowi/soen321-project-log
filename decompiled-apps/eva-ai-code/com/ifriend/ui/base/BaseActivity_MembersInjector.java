package com.ifriend.ui.base;

import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
    private final Provider<InternetConnectionDialogsManager> internetConnectionDialogsManagerProvider;
    private final Provider<NoInternetPopupDelegate> noInternetPopupDelegateProvider;

    public BaseActivity_MembersInjector(Provider<NoInternetPopupDelegate> provider, Provider<InternetConnectionDialogsManager> provider2) {
        this.noInternetPopupDelegateProvider = provider;
        this.internetConnectionDialogsManagerProvider = provider2;
    }

    public static MembersInjector<BaseActivity> create(Provider<NoInternetPopupDelegate> provider, Provider<InternetConnectionDialogsManager> provider2) {
        return new BaseActivity_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseActivity baseActivity) {
        injectNoInternetPopupDelegate(baseActivity, this.noInternetPopupDelegateProvider.get());
        injectInternetConnectionDialogsManager(baseActivity, this.internetConnectionDialogsManagerProvider.get());
    }

    public static void injectNoInternetPopupDelegate(BaseActivity baseActivity, NoInternetPopupDelegate noInternetPopupDelegate) {
        baseActivity.noInternetPopupDelegate = noInternetPopupDelegate;
    }

    public static void injectInternetConnectionDialogsManager(BaseActivity baseActivity, InternetConnectionDialogsManager internetConnectionDialogsManager) {
        baseActivity.internetConnectionDialogsManager = internetConnectionDialogsManager;
    }
}
