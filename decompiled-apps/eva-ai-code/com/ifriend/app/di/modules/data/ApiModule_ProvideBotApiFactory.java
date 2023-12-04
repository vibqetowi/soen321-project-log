package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.BotApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideBotApiFactory implements Factory<BotApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideBotApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public BotApi get() {
        return provideBotApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideBotApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideBotApiFactory(apiModule, provider);
    }

    public static BotApi provideBotApi(ApiModule apiModule, Retrofit retrofit) {
        return (BotApi) Preconditions.checkNotNullFromProvides(apiModule.provideBotApi(retrofit));
    }
}
