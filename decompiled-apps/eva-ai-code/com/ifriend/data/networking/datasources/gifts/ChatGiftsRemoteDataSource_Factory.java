package com.ifriend.data.networking.datasources.gifts;

import com.ifriend.data.networking.api.chatgifts.ChatGiftsApi;
import com.ifriend.domain.data.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatGiftsRemoteDataSource_Factory implements Factory<ChatGiftsRemoteDataSource> {
    private final Provider<ChatGiftsApi> chatGiftsApiProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatGiftsRemoteDataSource_Factory(Provider<ChatGiftsApi> provider, Provider<UserRepository> provider2) {
        this.chatGiftsApiProvider = provider;
        this.userRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatGiftsRemoteDataSource get() {
        return newInstance(this.chatGiftsApiProvider.get(), this.userRepositoryProvider.get());
    }

    public static ChatGiftsRemoteDataSource_Factory create(Provider<ChatGiftsApi> provider, Provider<UserRepository> provider2) {
        return new ChatGiftsRemoteDataSource_Factory(provider, provider2);
    }

    public static ChatGiftsRemoteDataSource newInstance(ChatGiftsApi chatGiftsApi, UserRepository userRepository) {
        return new ChatGiftsRemoteDataSource(chatGiftsApi, userRepository);
    }
}
