package com.ifriend.app.di.modules;

import com.ifriend.data.networking.api.RegistrationApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class CoreAuthModule_ProvideRegistrationApiFactory implements Factory<RegistrationApi> {
    private final CoreAuthModule module;
    private final Provider<Retrofit> retrofitProvider;

    public CoreAuthModule_ProvideRegistrationApiFactory(CoreAuthModule coreAuthModule, Provider<Retrofit> provider) {
        this.module = coreAuthModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public RegistrationApi get() {
        return provideRegistrationApi(this.module, this.retrofitProvider.get());
    }

    public static CoreAuthModule_ProvideRegistrationApiFactory create(CoreAuthModule coreAuthModule, Provider<Retrofit> provider) {
        return new CoreAuthModule_ProvideRegistrationApiFactory(coreAuthModule, provider);
    }

    public static RegistrationApi provideRegistrationApi(CoreAuthModule coreAuthModule, Retrofit retrofit) {
        return (RegistrationApi) Preconditions.checkNotNullFromProvides(coreAuthModule.provideRegistrationApi(retrofit));
    }
}
