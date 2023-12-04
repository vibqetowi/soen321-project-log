package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.topics.TopicsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideTopicsApiFactory implements Factory<TopicsApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DataModule_Companion_ProvideTopicsApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public TopicsApi get() {
        return provideTopicsApi(this.retrofitProvider.get());
    }

    public static DataModule_Companion_ProvideTopicsApiFactory create(Provider<Retrofit> provider) {
        return new DataModule_Companion_ProvideTopicsApiFactory(provider);
    }

    public static TopicsApi provideTopicsApi(Retrofit retrofit) {
        return (TopicsApi) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideTopicsApi(retrofit));
    }
}
