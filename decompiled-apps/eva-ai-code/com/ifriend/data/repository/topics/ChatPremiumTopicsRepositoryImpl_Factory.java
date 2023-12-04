package com.ifriend.data.repository.topics;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.topics.ChatTopicsRemoteDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPremiumTopicsRepositoryImpl_Factory implements Factory<ChatPremiumTopicsRepositoryImpl> {
    private final Provider<AuthLocalDataSource> authDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<ChatTopicsRemoteDataSource> remoteDataSourceProvider;

    public ChatPremiumTopicsRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<ChatTopicsRemoteDataSource> provider2, Provider<AuthLocalDataSource> provider3) {
        this.coreExecuteCatchingProvider = provider;
        this.remoteDataSourceProvider = provider2;
        this.authDataSourceProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatPremiumTopicsRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.remoteDataSourceProvider.get(), this.authDataSourceProvider.get());
    }

    public static ChatPremiumTopicsRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<ChatTopicsRemoteDataSource> provider2, Provider<AuthLocalDataSource> provider3) {
        return new ChatPremiumTopicsRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static ChatPremiumTopicsRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, ChatTopicsRemoteDataSource chatTopicsRemoteDataSource, AuthLocalDataSource authLocalDataSource) {
        return new ChatPremiumTopicsRepositoryImpl(coreExecuteCatching, chatTopicsRemoteDataSource, authLocalDataSource);
    }
}
