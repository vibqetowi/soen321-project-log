package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.FirebaseApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideFirebaseApiFactory implements Factory<FirebaseApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideFirebaseApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public FirebaseApi get() {
        return provideFirebaseApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideFirebaseApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideFirebaseApiFactory(apiModule, provider);
    }

    public static FirebaseApi provideFirebaseApi(ApiModule apiModule, Retrofit retrofit) {
        return (FirebaseApi) Preconditions.checkNotNullFromProvides(apiModule.provideFirebaseApi(retrofit));
    }
}
