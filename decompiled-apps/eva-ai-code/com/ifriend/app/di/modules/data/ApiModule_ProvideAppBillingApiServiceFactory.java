package com.ifriend.app.di.modules.data;

import com.ifriend.core.remote.services.AppBillingApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideAppBillingApiServiceFactory implements Factory<AppBillingApiService> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideAppBillingApiServiceFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppBillingApiService get() {
        return provideAppBillingApiService(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideAppBillingApiServiceFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideAppBillingApiServiceFactory(apiModule, provider);
    }

    public static AppBillingApiService provideAppBillingApiService(ApiModule apiModule, Retrofit retrofit) {
        return (AppBillingApiService) Preconditions.checkNotNullFromProvides(apiModule.provideAppBillingApiService(retrofit));
    }
}
