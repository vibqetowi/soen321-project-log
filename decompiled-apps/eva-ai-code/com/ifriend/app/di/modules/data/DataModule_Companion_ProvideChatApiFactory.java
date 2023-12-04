package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.chat.ChatMessagesApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideChatApiFactory implements Factory<ChatMessagesApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DataModule_Companion_ProvideChatApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatMessagesApi get() {
        return provideChatApi(this.retrofitProvider.get());
    }

    public static DataModule_Companion_ProvideChatApiFactory create(Provider<Retrofit> provider) {
        return new DataModule_Companion_ProvideChatApiFactory(provider);
    }

    public static ChatMessagesApi provideChatApi(Retrofit retrofit) {
        return (ChatMessagesApi) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideChatApi(retrofit));
    }
}
