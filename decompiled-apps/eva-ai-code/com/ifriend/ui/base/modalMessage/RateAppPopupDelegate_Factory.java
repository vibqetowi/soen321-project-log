package com.ifriend.ui.base.modalMessage;

import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.ui.base.BaseActivity;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class RateAppPopupDelegate_Factory implements Factory<RateAppPopupDelegate> {
    private final Provider<BaseActivity> activityProvider;
    private final Provider<PopupFragmentFactory> popupFragmentFactoryProvider;
    private final Provider<PopupModelFactory> popupModelFactoryProvider;
    private final Provider<ShowRateUsUseCase> rateUsUseCaseProvider;

    public RateAppPopupDelegate_Factory(Provider<BaseActivity> provider, Provider<PopupFragmentFactory> provider2, Provider<PopupModelFactory> provider3, Provider<ShowRateUsUseCase> provider4) {
        this.activityProvider = provider;
        this.popupFragmentFactoryProvider = provider2;
        this.popupModelFactoryProvider = provider3;
        this.rateUsUseCaseProvider = provider4;
    }

    @Override // javax.inject.Provider
    public RateAppPopupDelegate get() {
        return newInstance(this.activityProvider.get(), this.popupFragmentFactoryProvider.get(), this.popupModelFactoryProvider.get(), this.rateUsUseCaseProvider.get());
    }

    public static RateAppPopupDelegate_Factory create(Provider<BaseActivity> provider, Provider<PopupFragmentFactory> provider2, Provider<PopupModelFactory> provider3, Provider<ShowRateUsUseCase> provider4) {
        return new RateAppPopupDelegate_Factory(provider, provider2, provider3, provider4);
    }

    public static RateAppPopupDelegate newInstance(BaseActivity baseActivity, PopupFragmentFactory popupFragmentFactory, PopupModelFactory popupModelFactory, ShowRateUsUseCase showRateUsUseCase) {
        return new RateAppPopupDelegate(baseActivity, popupFragmentFactory, popupModelFactory, showRateUsUseCase);
    }
}
