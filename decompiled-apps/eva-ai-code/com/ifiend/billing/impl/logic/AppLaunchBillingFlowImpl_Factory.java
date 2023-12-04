package com.ifiend.billing.impl.logic;

import com.ifiend.billing.impl.manager.BillingManager;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppLaunchBillingFlowImpl_Factory implements Factory<AppLaunchBillingFlowImpl> {
    private final Provider<BillingManager> billingManagerProvider;

    public AppLaunchBillingFlowImpl_Factory(Provider<BillingManager> provider) {
        this.billingManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppLaunchBillingFlowImpl get() {
        return newInstance(this.billingManagerProvider.get());
    }

    public static AppLaunchBillingFlowImpl_Factory create(Provider<BillingManager> provider) {
        return new AppLaunchBillingFlowImpl_Factory(provider);
    }

    public static AppLaunchBillingFlowImpl newInstance(BillingManager billingManager) {
        return new AppLaunchBillingFlowImpl(billingManager);
    }
}
