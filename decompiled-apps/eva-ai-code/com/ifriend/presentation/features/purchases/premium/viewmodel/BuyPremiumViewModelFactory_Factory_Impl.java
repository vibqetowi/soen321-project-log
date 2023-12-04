package com.ifriend.presentation.features.purchases.premium.viewmodel;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModelFactory;
import dagger.internal.InstanceFactory;
import java.util.UUID;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyPremiumViewModelFactory_Factory_Impl implements BuyPremiumViewModelFactory.Factory {
    private final C0217BuyPremiumViewModelFactory_Factory delegateFactory;

    BuyPremiumViewModelFactory_Factory_Impl(C0217BuyPremiumViewModelFactory_Factory c0217BuyPremiumViewModelFactory_Factory) {
        this.delegateFactory = c0217BuyPremiumViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModelFactory.Factory
    public BuyPremiumViewModelFactory create(UUID uuid, PurchaseSource purchaseSource, boolean z, PurchaseReason purchaseReason) {
        return this.delegateFactory.get(uuid, purchaseSource, z, purchaseReason);
    }

    public static Provider<BuyPremiumViewModelFactory.Factory> create(C0217BuyPremiumViewModelFactory_Factory c0217BuyPremiumViewModelFactory_Factory) {
        return InstanceFactory.create(new BuyPremiumViewModelFactory_Factory_Impl(c0217BuyPremiumViewModelFactory_Factory));
    }
}
