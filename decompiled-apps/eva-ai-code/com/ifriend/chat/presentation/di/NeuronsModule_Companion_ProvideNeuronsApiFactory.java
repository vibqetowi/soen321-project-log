package com.ifriend.chat.presentation.di;

import com.ifriend.data.networking.api.NeuronsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class NeuronsModule_Companion_ProvideNeuronsApiFactory implements Factory<NeuronsApi> {
    private final Provider<Retrofit> retrofitProvider;

    public NeuronsModule_Companion_ProvideNeuronsApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public NeuronsApi get() {
        return provideNeuronsApi(this.retrofitProvider.get());
    }

    public static NeuronsModule_Companion_ProvideNeuronsApiFactory create(Provider<Retrofit> provider) {
        return new NeuronsModule_Companion_ProvideNeuronsApiFactory(provider);
    }

    public static NeuronsApi provideNeuronsApi(Retrofit retrofit) {
        return (NeuronsApi) Preconditions.checkNotNullFromProvides(NeuronsModule.Companion.provideNeuronsApi(retrofit));
    }
}
