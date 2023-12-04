package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.NeuronsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideNeuronsApiFactory implements Factory<NeuronsApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideNeuronsApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public NeuronsApi get() {
        return provideNeuronsApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideNeuronsApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideNeuronsApiFactory(apiModule, provider);
    }

    public static NeuronsApi provideNeuronsApi(ApiModule apiModule, Retrofit retrofit) {
        return (NeuronsApi) Preconditions.checkNotNullFromProvides(apiModule.provideNeuronsApi(retrofit));
    }
}
