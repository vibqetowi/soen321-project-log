package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.configuration.ChatConfigurationsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideChatConfigurationApiFactory implements Factory<ChatConfigurationsApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideChatConfigurationApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatConfigurationsApi get() {
        return provideChatConfigurationApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideChatConfigurationApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideChatConfigurationApiFactory(apiModule, provider);
    }

    public static ChatConfigurationsApi provideChatConfigurationApi(ApiModule apiModule, Retrofit retrofit) {
        return (ChatConfigurationsApi) Preconditions.checkNotNullFromProvides(apiModule.provideChatConfigurationApi(retrofit));
    }
}
