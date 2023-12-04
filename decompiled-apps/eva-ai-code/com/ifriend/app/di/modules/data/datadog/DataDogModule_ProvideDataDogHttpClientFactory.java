package com.ifriend.app.di.modules.data.datadog;

import com.ifriend.core.remote.interceptors.DataDogAuthInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
/* loaded from: classes6.dex */
public final class DataDogModule_ProvideDataDogHttpClientFactory implements Factory<OkHttpClient> {
    private final Provider<DataDogAuthInterceptor> dataDogAuthInterceptorProvider;
    private final Provider<HttpLoggingInterceptor> httpLoggingInterceptorProvider;
    private final DataDogModule module;

    public DataDogModule_ProvideDataDogHttpClientFactory(DataDogModule dataDogModule, Provider<DataDogAuthInterceptor> provider, Provider<HttpLoggingInterceptor> provider2) {
        this.module = dataDogModule;
        this.dataDogAuthInterceptorProvider = provider;
        this.httpLoggingInterceptorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return provideDataDogHttpClient(this.module, this.dataDogAuthInterceptorProvider.get(), this.httpLoggingInterceptorProvider.get());
    }

    public static DataDogModule_ProvideDataDogHttpClientFactory create(DataDogModule dataDogModule, Provider<DataDogAuthInterceptor> provider, Provider<HttpLoggingInterceptor> provider2) {
        return new DataDogModule_ProvideDataDogHttpClientFactory(dataDogModule, provider, provider2);
    }

    public static OkHttpClient provideDataDogHttpClient(DataDogModule dataDogModule, DataDogAuthInterceptor dataDogAuthInterceptor, HttpLoggingInterceptor httpLoggingInterceptor) {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(dataDogModule.provideDataDogHttpClient(dataDogAuthInterceptor, httpLoggingInterceptor));
    }
}
