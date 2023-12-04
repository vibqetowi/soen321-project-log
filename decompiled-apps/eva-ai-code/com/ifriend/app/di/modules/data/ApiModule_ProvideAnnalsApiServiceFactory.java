package com.ifriend.app.di.modules.data;

import com.ifriend.core.remote.services.AnnalsApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideAnnalsApiServiceFactory implements Factory<AnnalsApiService> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideAnnalsApiServiceFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnnalsApiService get() {
        return provideAnnalsApiService(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideAnnalsApiServiceFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideAnnalsApiServiceFactory(apiModule, provider);
    }

    public static AnnalsApiService provideAnnalsApiService(ApiModule apiModule, Retrofit retrofit) {
        return (AnnalsApiService) Preconditions.checkNotNullFromProvides(apiModule.provideAnnalsApiService(retrofit));
    }
}
