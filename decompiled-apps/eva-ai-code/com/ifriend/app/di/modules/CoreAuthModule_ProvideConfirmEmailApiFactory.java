package com.ifriend.app.di.modules;

import com.ifriend.data.authorization.confirmEmail.ConfirmEmailApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class CoreAuthModule_ProvideConfirmEmailApiFactory implements Factory<ConfirmEmailApi> {
    private final CoreAuthModule module;
    private final Provider<Retrofit> retrofitProvider;

    public CoreAuthModule_ProvideConfirmEmailApiFactory(CoreAuthModule coreAuthModule, Provider<Retrofit> provider) {
        this.module = coreAuthModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public ConfirmEmailApi get() {
        return provideConfirmEmailApi(this.module, this.retrofitProvider.get());
    }

    public static CoreAuthModule_ProvideConfirmEmailApiFactory create(CoreAuthModule coreAuthModule, Provider<Retrofit> provider) {
        return new CoreAuthModule_ProvideConfirmEmailApiFactory(coreAuthModule, provider);
    }

    public static ConfirmEmailApi provideConfirmEmailApi(CoreAuthModule coreAuthModule, Retrofit retrofit) {
        return (ConfirmEmailApi) Preconditions.checkNotNullFromProvides(coreAuthModule.provideConfirmEmailApi(retrofit));
    }
}
