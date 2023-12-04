package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.UserApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideUserApiFactory implements Factory<UserApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideUserApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public UserApi get() {
        return provideUserApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideUserApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideUserApiFactory(apiModule, provider);
    }

    public static UserApi provideUserApi(ApiModule apiModule, Retrofit retrofit) {
        return (UserApi) Preconditions.checkNotNullFromProvides(apiModule.provideUserApi(retrofit));
    }
}
