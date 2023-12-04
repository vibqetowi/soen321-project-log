package com.ifriend.chat.presentation.ui.purchase.neurons;

import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetDialogFragment_MembersInjector implements MembersInjector<BuyNeuronsBottomSheetDialogFragment> {
    private final Provider<AppLaunchBillingFlow> appLaunchBillingFlowProvider;
    private final Provider<BuyNeuronsViewModelFactory.Factory> viewModelFactoryProvider;

    public BuyNeuronsBottomSheetDialogFragment_MembersInjector(Provider<BuyNeuronsViewModelFactory.Factory> provider, Provider<AppLaunchBillingFlow> provider2) {
        this.viewModelFactoryProvider = provider;
        this.appLaunchBillingFlowProvider = provider2;
    }

    public static MembersInjector<BuyNeuronsBottomSheetDialogFragment> create(Provider<BuyNeuronsViewModelFactory.Factory> provider, Provider<AppLaunchBillingFlow> provider2) {
        return new BuyNeuronsBottomSheetDialogFragment_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
        injectViewModelFactory(buyNeuronsBottomSheetDialogFragment, this.viewModelFactoryProvider.get());
        injectAppLaunchBillingFlow(buyNeuronsBottomSheetDialogFragment, this.appLaunchBillingFlowProvider.get());
    }

    public static void injectViewModelFactory(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment, BuyNeuronsViewModelFactory.Factory factory) {
        buyNeuronsBottomSheetDialogFragment.viewModelFactory = factory;
    }

    public static void injectAppLaunchBillingFlow(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment, AppLaunchBillingFlow appLaunchBillingFlow) {
        buyNeuronsBottomSheetDialogFragment.appLaunchBillingFlow = appLaunchBillingFlow;
    }
}
