package com.ifiend.billing.impl.data;

import com.google.gson.Gson;
import com.ifiend.billing.impl.manager.BillingManager;
import com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource;
import com.ifriend.core.tools.api.DispatcherProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BillingRepositoryImpl_Factory implements Factory<BillingRepositoryImpl> {
    private final Provider<BillingManager> billingManagerProvider;
    private final Provider<BillingProductMapper> billingProductMapperProvider;
    private final Provider<BillingRemoteDataSource> billingRemoteDataSourceProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<Gson> gsonProvider;

    public BillingRepositoryImpl_Factory(Provider<BillingRemoteDataSource> provider, Provider<DispatcherProvider> provider2, Provider<BillingManager> provider3, Provider<BillingProductMapper> provider4, Provider<Gson> provider5) {
        this.billingRemoteDataSourceProvider = provider;
        this.dispatcherProvider = provider2;
        this.billingManagerProvider = provider3;
        this.billingProductMapperProvider = provider4;
        this.gsonProvider = provider5;
    }

    @Override // javax.inject.Provider
    public BillingRepositoryImpl get() {
        return newInstance(this.billingRemoteDataSourceProvider.get(), this.dispatcherProvider.get(), this.billingManagerProvider.get(), this.billingProductMapperProvider.get(), this.gsonProvider.get());
    }

    public static BillingRepositoryImpl_Factory create(Provider<BillingRemoteDataSource> provider, Provider<DispatcherProvider> provider2, Provider<BillingManager> provider3, Provider<BillingProductMapper> provider4, Provider<Gson> provider5) {
        return new BillingRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static BillingRepositoryImpl newInstance(BillingRemoteDataSource billingRemoteDataSource, DispatcherProvider dispatcherProvider, BillingManager billingManager, BillingProductMapper billingProductMapper, Gson gson) {
        return new BillingRepositoryImpl(billingRemoteDataSource, dispatcherProvider, billingManager, billingProductMapper, gson);
    }
}
