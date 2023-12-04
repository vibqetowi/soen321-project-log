package com.ifriend.ui.base.modalMessage;

import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.ui.base.BaseActivity;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class RequestSextingPopupDelegate_Factory implements Factory<RequestSextingPopupDelegate> {
    private final Provider<BaseActivity> activityProvider;
    private final Provider<PopupFragmentFactory> popupFragmentFactoryProvider;

    public RequestSextingPopupDelegate_Factory(Provider<BaseActivity> provider, Provider<PopupFragmentFactory> provider2) {
        this.activityProvider = provider;
        this.popupFragmentFactoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RequestSextingPopupDelegate get() {
        return newInstance(this.activityProvider.get(), this.popupFragmentFactoryProvider.get());
    }

    public static RequestSextingPopupDelegate_Factory create(Provider<BaseActivity> provider, Provider<PopupFragmentFactory> provider2) {
        return new RequestSextingPopupDelegate_Factory(provider, provider2);
    }

    public static RequestSextingPopupDelegate newInstance(BaseActivity baseActivity, PopupFragmentFactory popupFragmentFactory) {
        return new RequestSextingPopupDelegate(baseActivity, popupFragmentFactory);
    }
}
