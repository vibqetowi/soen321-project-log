package com.ifriend.core.remote.datasources.billing;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.AppBillingApiService;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BillingRemoteDataSource_Factory implements Factory<BillingRemoteDataSource> {
    private final Provider<AppBillingApiService> apiServiceProvider;
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;

    public BillingRemoteDataSource_Factory(Provider<AppBillingApiService> provider, Provider<AuthLocalDataSource> provider2) {
        this.apiServiceProvider = provider;
        this.authLocalDataSourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public BillingRemoteDataSource get() {
        return newInstance(this.apiServiceProvider.get(), this.authLocalDataSourceProvider.get());
    }

    public static BillingRemoteDataSource_Factory create(Provider<AppBillingApiService> provider, Provider<AuthLocalDataSource> provider2) {
        return new BillingRemoteDataSource_Factory(provider, provider2);
    }

    public static BillingRemoteDataSource newInstance(AppBillingApiService appBillingApiService, AuthLocalDataSource authLocalDataSource) {
        return new BillingRemoteDataSource(appBillingApiService, authLocalDataSource);
    }
}
