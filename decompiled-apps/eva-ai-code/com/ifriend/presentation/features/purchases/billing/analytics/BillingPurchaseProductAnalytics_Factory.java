package com.ifriend.presentation.features.purchases.billing.analytics;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BillingPurchaseProductAnalytics_Factory implements Factory<BillingPurchaseProductAnalytics> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;

    public BillingPurchaseProductAnalytics_Factory(Provider<AnalyticsInteractor> provider) {
        this.analyticsInteractorProvider = provider;
    }

    @Override // javax.inject.Provider
    public BillingPurchaseProductAnalytics get() {
        return newInstance(this.analyticsInteractorProvider.get());
    }

    public static BillingPurchaseProductAnalytics_Factory create(Provider<AnalyticsInteractor> provider) {
        return new BillingPurchaseProductAnalytics_Factory(provider);
    }

    public static BillingPurchaseProductAnalytics newInstance(AnalyticsInteractor analyticsInteractor) {
        return new BillingPurchaseProductAnalytics(analyticsInteractor);
    }
}
