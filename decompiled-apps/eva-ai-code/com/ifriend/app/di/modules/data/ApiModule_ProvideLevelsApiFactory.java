package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.levels.LevelsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideLevelsApiFactory implements Factory<LevelsApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideLevelsApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public LevelsApi get() {
        return provideLevelsApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideLevelsApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideLevelsApiFactory(apiModule, provider);
    }

    public static LevelsApi provideLevelsApi(ApiModule apiModule, Retrofit retrofit) {
        return (LevelsApi) Preconditions.checkNotNullFromProvides(apiModule.provideLevelsApi(retrofit));
    }
}
