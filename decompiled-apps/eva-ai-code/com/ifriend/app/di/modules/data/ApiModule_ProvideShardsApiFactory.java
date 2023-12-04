package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.SocketShardsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideShardsApiFactory implements Factory<SocketShardsApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideShardsApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public SocketShardsApi get() {
        return provideShardsApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideShardsApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideShardsApiFactory(apiModule, provider);
    }

    public static SocketShardsApi provideShardsApi(ApiModule apiModule, Retrofit retrofit) {
        return (SocketShardsApi) Preconditions.checkNotNullFromProvides(apiModule.provideShardsApi(retrofit));
    }
}
