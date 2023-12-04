package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.chat.ChatsInfoApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideChatsInfoApiFactory implements Factory<ChatsInfoApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideChatsInfoApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatsInfoApi get() {
        return provideChatsInfoApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideChatsInfoApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideChatsInfoApiFactory(apiModule, provider);
    }

    public static ChatsInfoApi provideChatsInfoApi(ApiModule apiModule, Retrofit retrofit) {
        return (ChatsInfoApi) Preconditions.checkNotNullFromProvides(apiModule.provideChatsInfoApi(retrofit));
    }
}
