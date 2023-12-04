package com.ifriend.data.repository.chat;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsRepositoryImpl_Factory implements Factory<ChatsRepositoryImpl> {
    private final Provider<ChatsRemoteDataSource> chatsRemoteDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;

    public ChatsRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<ChatsRemoteDataSource> provider2) {
        this.coreExecuteCatchingProvider = provider;
        this.chatsRemoteDataSourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatsRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.chatsRemoteDataSourceProvider.get());
    }

    public static ChatsRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<ChatsRemoteDataSource> provider2) {
        return new ChatsRepositoryImpl_Factory(provider, provider2);
    }

    public static ChatsRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, ChatsRemoteDataSource chatsRemoteDataSource) {
        return new ChatsRepositoryImpl(coreExecuteCatching, chatsRemoteDataSource);
    }
}
