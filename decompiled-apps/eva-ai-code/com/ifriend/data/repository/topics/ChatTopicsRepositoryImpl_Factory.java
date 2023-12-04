package com.ifriend.data.repository.topics;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatTopicsRepositoryImpl_Factory implements Factory<ChatTopicsRepositoryImpl> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<ChatTopicsRemoteDataSource> remoteDataSourceProvider;

    public ChatTopicsRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<ChatTopicsRemoteDataSource> provider2, Provider<AuthDataProvider> provider3) {
        this.coreExecuteCatchingProvider = provider;
        this.remoteDataSourceProvider = provider2;
        this.authDataProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatTopicsRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.remoteDataSourceProvider.get(), this.authDataProvider.get());
    }

    public static ChatTopicsRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<ChatTopicsRemoteDataSource> provider2, Provider<AuthDataProvider> provider3) {
        return new ChatTopicsRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static ChatTopicsRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, ChatTopicsRemoteDataSource chatTopicsRemoteDataSource, AuthDataProvider authDataProvider) {
        return new ChatTopicsRepositoryImpl(coreExecuteCatching, chatTopicsRemoteDataSource, authDataProvider);
    }
}
