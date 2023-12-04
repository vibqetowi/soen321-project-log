package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.RateUsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideRateUsApiFactory implements Factory<RateUsApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideRateUsApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public RateUsApi get() {
        return provideRateUsApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideRateUsApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideRateUsApiFactory(apiModule, provider);
    }

    public static RateUsApi provideRateUsApi(ApiModule apiModule, Retrofit retrofit) {
        return (RateUsApi) Preconditions.checkNotNullFromProvides(apiModule.provideRateUsApi(retrofit));
    }
}
