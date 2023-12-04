package com.ifriend.ui.base.modalMessage;

import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.popup.api.PopupFragmentFactory;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class NoInternetPopupDelegate_Factory implements Factory<NoInternetPopupDelegate> {
    private final Provider<InternetConnection> internetConnectionProvider;
    private final Provider<PopupFragmentFactory> popupFragmentFactoryProvider;

    public NoInternetPopupDelegate_Factory(Provider<PopupFragmentFactory> provider, Provider<InternetConnection> provider2) {
        this.popupFragmentFactoryProvider = provider;
        this.internetConnectionProvider = provider2;
    }

    @Override // javax.inject.Provider
    public NoInternetPopupDelegate get() {
        return newInstance(this.popupFragmentFactoryProvider.get(), this.internetConnectionProvider.get());
    }

    public static NoInternetPopupDelegate_Factory create(Provider<PopupFragmentFactory> provider, Provider<InternetConnection> provider2) {
        return new NoInternetPopupDelegate_Factory(provider, provider2);
    }

    public static NoInternetPopupDelegate newInstance(PopupFragmentFactory popupFragmentFactory, InternetConnection internetConnection) {
        return new NoInternetPopupDelegate(popupFragmentFactory, internetConnection);
    }
}
