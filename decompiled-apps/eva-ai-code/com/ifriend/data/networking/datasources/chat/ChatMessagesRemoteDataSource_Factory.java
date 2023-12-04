package com.ifriend.data.networking.datasources.chat;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.data.networking.api.chat.ChatMessagesApi;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessagesRemoteDataSource_Factory implements Factory<ChatMessagesRemoteDataSource> {
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;
    private final Provider<ChatMessagesApi> chatMessagesApiProvider;

    public ChatMessagesRemoteDataSource_Factory(Provider<ChatMessagesApi> provider, Provider<AuthLocalDataSource> provider2) {
        this.chatMessagesApiProvider = provider;
        this.authLocalDataSourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatMessagesRemoteDataSource get() {
        return newInstance(this.chatMessagesApiProvider.get(), this.authLocalDataSourceProvider.get());
    }

    public static ChatMessagesRemoteDataSource_Factory create(Provider<ChatMessagesApi> provider, Provider<AuthLocalDataSource> provider2) {
        return new ChatMessagesRemoteDataSource_Factory(provider, provider2);
    }

    public static ChatMessagesRemoteDataSource newInstance(ChatMessagesApi chatMessagesApi, AuthLocalDataSource authLocalDataSource) {
        return new ChatMessagesRemoteDataSource(chatMessagesApi, authLocalDataSource);
    }
}
