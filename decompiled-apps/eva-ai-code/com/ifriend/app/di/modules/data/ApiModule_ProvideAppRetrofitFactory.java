package com.ifriend.app.di.modules.data;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideAppRetrofitFactory implements Factory<Retrofit> {
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApiModule module;
    private final Provider<String> urlProvider;

    public ApiModule_ProvideAppRetrofitFactory(ApiModule apiModule, Provider<OkHttpClient> provider, Provider<String> provider2) {
        this.module = apiModule;
        this.httpClientProvider = provider;
        this.urlProvider = provider2;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return provideAppRetrofit(this.module, this.httpClientProvider.get(), this.urlProvider.get());
    }

    public static ApiModule_ProvideAppRetrofitFactory create(ApiModule apiModule, Provider<OkHttpClient> provider, Provider<String> provider2) {
        return new ApiModule_ProvideAppRetrofitFactory(apiModule, provider, provider2);
    }

    public static Retrofit provideAppRetrofit(ApiModule apiModule, OkHttpClient okHttpClient, String str) {
        return (Retrofit) Preconditions.checkNotNullFromProvides(apiModule.provideAppRetrofit(okHttpClient, str));
    }
}
