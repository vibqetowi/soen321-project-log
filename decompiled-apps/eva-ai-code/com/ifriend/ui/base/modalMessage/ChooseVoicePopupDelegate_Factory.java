package com.ifriend.ui.base.modalMessage;

import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.ui.base.BaseActivity;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class ChooseVoicePopupDelegate_Factory implements Factory<ChooseVoicePopupDelegate> {
    private final Provider<BaseActivity> activityProvider;
    private final Provider<PopupFragmentFactory> popupFragmentFactoryProvider;
    private final Provider<PopupModelFactory> popupModelFactoryProvider;

    public ChooseVoicePopupDelegate_Factory(Provider<BaseActivity> provider, Provider<PopupFragmentFactory> provider2, Provider<PopupModelFactory> provider3) {
        this.activityProvider = provider;
        this.popupFragmentFactoryProvider = provider2;
        this.popupModelFactoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChooseVoicePopupDelegate get() {
        return newInstance(this.activityProvider.get(), this.popupFragmentFactoryProvider.get(), this.popupModelFactoryProvider.get());
    }

    public static ChooseVoicePopupDelegate_Factory create(Provider<BaseActivity> provider, Provider<PopupFragmentFactory> provider2, Provider<PopupModelFactory> provider3) {
        return new ChooseVoicePopupDelegate_Factory(provider, provider2, provider3);
    }

    public static ChooseVoicePopupDelegate newInstance(BaseActivity baseActivity, PopupFragmentFactory popupFragmentFactory, PopupModelFactory popupModelFactory) {
        return new ChooseVoicePopupDelegate(baseActivity, popupFragmentFactory, popupModelFactory);
    }
}
