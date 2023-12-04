package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.chatgifts.ChatGiftsApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideChatGiftsApiFactory implements Factory<ChatGiftsApi> {
    private final Provider<Retrofit> retrofitProvider;

    public DataModule_Companion_ProvideChatGiftsApiFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatGiftsApi get() {
        return provideChatGiftsApi(this.retrofitProvider.get());
    }

    public static DataModule_Companion_ProvideChatGiftsApiFactory create(Provider<Retrofit> provider) {
        return new DataModule_Companion_ProvideChatGiftsApiFactory(provider);
    }

    public static ChatGiftsApi provideChatGiftsApi(Retrofit retrofit) {
        return (ChatGiftsApi) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideChatGiftsApi(retrofit));
    }
}
