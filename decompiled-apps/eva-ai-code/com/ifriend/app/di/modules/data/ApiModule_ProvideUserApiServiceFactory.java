package com.ifriend.app.di.modules.data;

import com.ifriend.core.remote.services.UserApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideUserApiServiceFactory implements Factory<UserApiService> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideUserApiServiceFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public UserApiService get() {
        return provideUserApiService(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideUserApiServiceFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideUserApiServiceFactory(apiModule, provider);
    }

    public static UserApiService provideUserApiService(ApiModule apiModule, Retrofit retrofit) {
        return (UserApiService) Preconditions.checkNotNullFromProvides(apiModule.provideUserApiService(retrofit));
    }
}
