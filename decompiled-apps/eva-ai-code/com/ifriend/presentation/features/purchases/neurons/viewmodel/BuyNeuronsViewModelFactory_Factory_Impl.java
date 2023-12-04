package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModelFactory;
import dagger.internal.InstanceFactory;
import java.util.UUID;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModelFactory_Factory_Impl implements BuyNeuronsViewModelFactory.Factory {
    private final C0216BuyNeuronsViewModelFactory_Factory delegateFactory;

    BuyNeuronsViewModelFactory_Factory_Impl(C0216BuyNeuronsViewModelFactory_Factory c0216BuyNeuronsViewModelFactory_Factory) {
        this.delegateFactory = c0216BuyNeuronsViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModelFactory.Factory
    public BuyNeuronsViewModelFactory create(UUID uuid, PurchaseSource purchaseSource, boolean z, PurchaseReason purchaseReason) {
        return this.delegateFactory.get(uuid, purchaseSource, z, purchaseReason);
    }

    public static Provider<BuyNeuronsViewModelFactory.Factory> create(C0216BuyNeuronsViewModelFactory_Factory c0216BuyNeuronsViewModelFactory_Factory) {
        return InstanceFactory.create(new BuyNeuronsViewModelFactory_Factory_Impl(c0216BuyNeuronsViewModelFactory_Factory));
    }
}
