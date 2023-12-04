package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegate_Factory_Impl implements BillingPurchaseDelegate.Factory {
    private final BillingPurchaseDelegateImpl_Factory delegateFactory;

    BillingPurchaseDelegate_Factory_Impl(BillingPurchaseDelegateImpl_Factory billingPurchaseDelegateImpl_Factory) {
        this.delegateFactory = billingPurchaseDelegateImpl_Factory;
    }

    @Override // com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate.Factory
    public BillingPurchaseDelegateImpl create(BillingPurchaseProductType billingPurchaseProductType, PurchaseReason purchaseReason, PurchaseSource purchaseSource, String str) {
        return this.delegateFactory.get(billingPurchaseProductType, purchaseReason, purchaseSource, str);
    }

    public static Provider<BillingPurchaseDelegate.Factory> create(BillingPurchaseDelegateImpl_Factory billingPurchaseDelegateImpl_Factory) {
        return InstanceFactory.create(new BillingPurchaseDelegate_Factory_Impl(billingPurchaseDelegateImpl_Factory));
    }
}
