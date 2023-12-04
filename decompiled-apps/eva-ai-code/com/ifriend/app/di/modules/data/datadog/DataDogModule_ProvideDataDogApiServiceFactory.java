package com.ifriend.app.di.modules.data.datadog;

import com.ifriend.core.remote.services.DataDogApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class DataDogModule_ProvideDataDogApiServiceFactory implements Factory<DataDogApiService> {
    private final DataDogModule module;
    private final Provider<Retrofit> retrofitProvider;

    public DataDogModule_ProvideDataDogApiServiceFactory(DataDogModule dataDogModule, Provider<Retrofit> provider) {
        this.module = dataDogModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public DataDogApiService get() {
        return provideDataDogApiService(this.module, this.retrofitProvider.get());
    }

    public static DataDogModule_ProvideDataDogApiServiceFactory create(DataDogModule dataDogModule, Provider<Retrofit> provider) {
        return new DataDogModule_ProvideDataDogApiServiceFactory(dataDogModule, provider);
    }

    public static DataDogApiService provideDataDogApiService(DataDogModule dataDogModule, Retrofit retrofit) {
        return (DataDogApiService) Preconditions.checkNotNullFromProvides(dataDogModule.provideDataDogApiService(retrofit));
    }
}
