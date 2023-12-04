package com.ifriend.chat.presentation.ui.purchase.premium;

import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModelFactory;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyPremiumFragment_MembersInjector implements MembersInjector<BuyPremiumFragment> {
    private final Provider<AppLaunchBillingFlow> appLaunchBillingFlowProvider;
    private final Provider<BuyPremiumViewModelFactory.Factory> factoryProvider;
    private final Provider<AppFlowCoordinator> flowCoordinatorProvider;

    public BuyPremiumFragment_MembersInjector(Provider<BuyPremiumViewModelFactory.Factory> provider, Provider<AppFlowCoordinator> provider2, Provider<AppLaunchBillingFlow> provider3) {
        this.factoryProvider = provider;
        this.flowCoordinatorProvider = provider2;
        this.appLaunchBillingFlowProvider = provider3;
    }

    public static MembersInjector<BuyPremiumFragment> create(Provider<BuyPremiumViewModelFactory.Factory> provider, Provider<AppFlowCoordinator> provider2, Provider<AppLaunchBillingFlow> provider3) {
        return new BuyPremiumFragment_MembersInjector(provider, provider2, provider3);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BuyPremiumFragment buyPremiumFragment) {
        injectFactory(buyPremiumFragment, this.factoryProvider.get());
        injectFlowCoordinator(buyPremiumFragment, this.flowCoordinatorProvider.get());
        injectAppLaunchBillingFlow(buyPremiumFragment, this.appLaunchBillingFlowProvider.get());
    }

    public static void injectFactory(BuyPremiumFragment buyPremiumFragment, BuyPremiumViewModelFactory.Factory factory) {
        buyPremiumFragment.factory = factory;
    }

    public static void injectFlowCoordinator(BuyPremiumFragment buyPremiumFragment, AppFlowCoordinator appFlowCoordinator) {
        buyPremiumFragment.flowCoordinator = appFlowCoordinator;
    }

    public static void injectAppLaunchBillingFlow(BuyPremiumFragment buyPremiumFragment, AppLaunchBillingFlow appLaunchBillingFlow) {
        buyPremiumFragment.appLaunchBillingFlow = appLaunchBillingFlow;
    }
}
