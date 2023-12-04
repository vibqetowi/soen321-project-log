package com.ifriend.app.di.modules.data.datadog;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class DataDogModule_ProvideDataDogRetrofitFactory implements Factory<Retrofit> {
    private final Provider<OkHttpClient> httpClientProvider;
    private final DataDogModule module;

    public DataDogModule_ProvideDataDogRetrofitFactory(DataDogModule dataDogModule, Provider<OkHttpClient> provider) {
        this.module = dataDogModule;
        this.httpClientProvider = provider;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return provideDataDogRetrofit(this.module, this.httpClientProvider.get());
    }

    public static DataDogModule_ProvideDataDogRetrofitFactory create(DataDogModule dataDogModule, Provider<OkHttpClient> provider) {
        return new DataDogModule_ProvideDataDogRetrofitFactory(dataDogModule, provider);
    }

    public static Retrofit provideDataDogRetrofit(DataDogModule dataDogModule, OkHttpClient okHttpClient) {
        return (Retrofit) Preconditions.checkNotNullFromProvides(dataDogModule.provideDataDogRetrofit(okHttpClient));
    }
}
