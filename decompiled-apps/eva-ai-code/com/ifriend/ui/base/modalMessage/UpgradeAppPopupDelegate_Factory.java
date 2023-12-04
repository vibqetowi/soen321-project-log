package com.ifriend.ui.base.modalMessage;

import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.ui.base.BaseActivity;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class UpgradeAppPopupDelegate_Factory implements Factory<UpgradeAppPopupDelegate> {
    private final Provider<BaseActivity> activityProvider;
    private final Provider<PopupFragmentFactory> popupFragmentFactoryProvider;
    private final Provider<PopupModelFactory> popupModelFactoryProvider;

    public UpgradeAppPopupDelegate_Factory(Provider<BaseActivity> provider, Provider<PopupFragmentFactory> provider2, Provider<PopupModelFactory> provider3) {
        this.activityProvider = provider;
        this.popupFragmentFactoryProvider = provider2;
        this.popupModelFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public UpgradeAppPopupDelegate get() {
        return newInstance(this.activityProvider.get(), this.popupFragmentFactoryProvider.get(), this.popupModelFactoryProvider.get());
    }

    public static UpgradeAppPopupDelegate_Factory create(Provider<BaseActivity> provider, Provider<PopupFragmentFactory> provider2, Provider<PopupModelFactory> provider3) {
        return new UpgradeAppPopupDelegate_Factory(provider, provider2, provider3);
    }

    public static UpgradeAppPopupDelegate newInstance(BaseActivity baseActivity, PopupFragmentFactory popupFragmentFactory, PopupModelFactory popupModelFactory) {
        return new UpgradeAppPopupDelegate(baseActivity, popupFragmentFactory, popupModelFactory);
    }
}
