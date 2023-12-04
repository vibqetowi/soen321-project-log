package com.ifriend.app.di.modules.data;

import com.ifriend.core.remote.services.CallsApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideCallApiServiceFactory implements Factory<CallsApiService> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideCallApiServiceFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public CallsApiService get() {
        return provideCallApiService(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideCallApiServiceFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideCallApiServiceFactory(apiModule, provider);
    }

    public static CallsApiService provideCallApiService(ApiModule apiModule, Retrofit retrofit) {
        return (CallsApiService) Preconditions.checkNotNullFromProvides(apiModule.provideCallApiService(retrofit));
    }
}
