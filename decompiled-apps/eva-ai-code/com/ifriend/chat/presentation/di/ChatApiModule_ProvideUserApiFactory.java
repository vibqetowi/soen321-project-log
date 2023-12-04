package com.ifriend.chat.presentation.di;

import com.ifriend.chat.data.UserApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class ChatApiModule_ProvideUserApiFactory implements Factory<UserApi> {
    private final ChatApiModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ChatApiModule_ProvideUserApiFactory(ChatApiModule chatApiModule, Provider<Retrofit> provider) {
        this.module = chatApiModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public UserApi get() {
        return provideUserApi(this.module, this.retrofitProvider.get());
    }

    public static ChatApiModule_ProvideUserApiFactory create(ChatApiModule chatApiModule, Provider<Retrofit> provider) {
        return new ChatApiModule_ProvideUserApiFactory(chatApiModule, provider);
    }

    public static UserApi provideUserApi(ChatApiModule chatApiModule, Retrofit retrofit) {
        return (UserApi) Preconditions.checkNotNullFromProvides(chatApiModule.provideUserApi(retrofit));
    }
}
