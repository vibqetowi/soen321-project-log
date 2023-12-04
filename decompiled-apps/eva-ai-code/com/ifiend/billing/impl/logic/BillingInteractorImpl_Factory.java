package com.ifiend.billing.impl.logic;

import com.ifiend.billing.impl.logic.repository.BillingRepository;
import com.ifiend.billing.impl.manager.BillingManager;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BillingInteractorImpl_Factory implements Factory<BillingInteractorImpl> {
    private final Provider<AppLoggerInteractor> appLoggerInteractorProvider;
    private final Provider<BillingManager> billingManagerProvider;
    private final Provider<BillingRepository> billingRepositoryProvider;

    public BillingInteractorImpl_Factory(Provider<BillingManager> provider, Provider<BillingRepository> provider2, Provider<AppLoggerInteractor> provider3) {
        this.billingManagerProvider = provider;
        this.billingRepositoryProvider = provider2;
        this.appLoggerInteractorProvider = provider3;
    }

    @Override // javax.inject.Provider
    public BillingInteractorImpl get() {
        return newInstance(this.billingManagerProvider.get(), this.billingRepositoryProvider.get(), this.appLoggerInteractorProvider.get());
    }

    public static BillingInteractorImpl_Factory create(Provider<BillingManager> provider, Provider<BillingRepository> provider2, Provider<AppLoggerInteractor> provider3) {
        return new BillingInteractorImpl_Factory(provider, provider2, provider3);
    }

    public static BillingInteractorImpl newInstance(BillingManager billingManager, BillingRepository billingRepository, AppLoggerInteractor appLoggerInteractor) {
        return new BillingInteractorImpl(billingManager, billingRepository, appLoggerInteractor);
    }
}
