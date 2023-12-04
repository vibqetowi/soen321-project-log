package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.chat.ChatsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ApiModule_ProvideChatsApiFactory implements Factory<ChatsApi> {
    private final ApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApiModule_ProvideChatsApiFactory(ApiModule apiModule, Provider<Retrofit> provider) {
        this.module = apiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatsApi get() {
        return provideChatsApi(this.module, this.retrofitProvider.get());
    }

    public static ApiModule_ProvideChatsApiFactory create(ApiModule apiModule, Provider<Retrofit> provider) {
        return new ApiModule_ProvideChatsApiFactory(apiModule, provider);
    }

    public static ChatsApi provideChatsApi(ApiModule apiModule, Retrofit retrofit) {
        return (ChatsApi) Preconditions.checkNotNullFromProvides(apiModule.provideChatsApi(retrofit));
    }
}
