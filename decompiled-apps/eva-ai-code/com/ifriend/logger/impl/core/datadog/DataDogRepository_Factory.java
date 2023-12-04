package com.ifriend.logger.impl.core.datadog;

import com.google.gson.Gson;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.DataDogApiService;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.platform.tools.api.AppInfoProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataDogRepository_Factory implements Factory<DataDogRepository> {
    private final Provider<AppInfoProvider> appInfoProvider;
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;
    private final Provider<DataDogApiService> dataDogApiServiceProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<Gson> gsonProvider;

    public DataDogRepository_Factory(Provider<DataDogApiService> provider, Provider<AuthLocalDataSource> provider2, Provider<AppInfoProvider> provider3, Provider<Gson> provider4, Provider<DispatcherProvider> provider5) {
        this.dataDogApiServiceProvider = provider;
        this.authLocalDataSourceProvider = provider2;
        this.appInfoProvider = provider3;
        this.gsonProvider = provider4;
        this.dispatcherProvider = provider5;
    }

    @Override // javax.inject.Provider
    public DataDogRepository get() {
        return newInstance(this.dataDogApiServiceProvider.get(), this.authLocalDataSourceProvider.get(), this.appInfoProvider.get(), this.gsonProvider.get(), this.dispatcherProvider.get());
    }

    public static DataDogRepository_Factory create(Provider<DataDogApiService> provider, Provider<AuthLocalDataSource> provider2, Provider<AppInfoProvider> provider3, Provider<Gson> provider4, Provider<DispatcherProvider> provider5) {
        return new DataDogRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static DataDogRepository newInstance(DataDogApiService dataDogApiService, AuthLocalDataSource authLocalDataSource, AppInfoProvider appInfoProvider, Gson gson, DispatcherProvider dispatcherProvider) {
        return new DataDogRepository(dataDogApiService, authLocalDataSource, appInfoProvider, gson, dispatcherProvider);
    }
}
