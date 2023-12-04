package com.ifriend.data.repository.chat.buy;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.chat.ChatMessagesRemoteDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BuyChatMessagesRepositoryImpl_Factory implements Factory<BuyChatMessagesRepositoryImpl> {
    private final Provider<ChatMessagesRemoteDataSource> chatMessagesRemoteDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;

    public BuyChatMessagesRepositoryImpl_Factory(Provider<ChatMessagesRemoteDataSource> provider, Provider<CoreExecuteCatching> provider2) {
        this.chatMessagesRemoteDataSourceProvider = provider;
        this.coreExecuteCatchingProvider = provider2;
    }

    @Override // javax.inject.Provider
    public BuyChatMessagesRepositoryImpl get() {
        return newInstance(this.chatMessagesRemoteDataSourceProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static BuyChatMessagesRepositoryImpl_Factory create(Provider<ChatMessagesRemoteDataSource> provider, Provider<CoreExecuteCatching> provider2) {
        return new BuyChatMessagesRepositoryImpl_Factory(provider, provider2);
    }

    public static BuyChatMessagesRepositoryImpl newInstance(ChatMessagesRemoteDataSource chatMessagesRemoteDataSource, CoreExecuteCatching coreExecuteCatching) {
        return new BuyChatMessagesRepositoryImpl(chatMessagesRemoteDataSource, coreExecuteCatching);
    }
}
