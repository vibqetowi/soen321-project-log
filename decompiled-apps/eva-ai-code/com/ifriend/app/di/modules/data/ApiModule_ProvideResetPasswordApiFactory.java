package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.ResetPasswordApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideResetPasswordApiFactory implements Factory<ResetPasswordApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideResetPasswordApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public ResetPasswordApi get() {
        return provideResetPasswordApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideResetPasswordApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideResetPasswordApiFactory(apiModule, provider);
    }

    public static ResetPasswordApi provideResetPasswordApi(ApiModule apiModule, Retrofit retrofit) {
        return (ResetPasswordApi) Preconditions.checkNotNullFromProvides(apiModule.provideResetPasswordApi(retrofit));
    }
}
