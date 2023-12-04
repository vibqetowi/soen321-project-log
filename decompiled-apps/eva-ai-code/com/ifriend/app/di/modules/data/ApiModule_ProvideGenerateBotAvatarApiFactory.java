package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.GenerateBotAvatarApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideGenerateBotAvatarApiFactory implements Factory<GenerateBotAvatarApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideGenerateBotAvatarApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public GenerateBotAvatarApi get() {
        return provideGenerateBotAvatarApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideGenerateBotAvatarApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideGenerateBotAvatarApiFactory(apiModule, provider);
    }

    public static GenerateBotAvatarApi provideGenerateBotAvatarApi(ApiModule apiModule, Retrofit retrofit) {
        return (GenerateBotAvatarApi) Preconditions.checkNotNullFromProvides(apiModule.provideGenerateBotAvatarApi(retrofit));
    }
}
