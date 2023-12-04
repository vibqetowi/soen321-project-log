package com.ifriend.data.repository.chat.intro;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.chat.ChatConfigurationsRemoteDataSource;
import com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatIntroRepositoryImpl_Factory implements Factory<ChatIntroRepositoryImpl> {
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<ChatIntroLocalDataSource> localDataSourceProvider;
    private final Provider<ChatConfigurationsRemoteDataSource> remoteDataSourceProvider;

    public ChatIntroRepositoryImpl_Factory(Provider<ChatIntroLocalDataSource> provider, Provider<ChatConfigurationsRemoteDataSource> provider2, Provider<CoreExecuteCatching> provider3) {
        this.localDataSourceProvider = provider;
        this.remoteDataSourceProvider = provider2;
        this.coreExecuteCatchingProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatIntroRepositoryImpl get() {
        return newInstance(this.localDataSourceProvider.get(), this.remoteDataSourceProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static ChatIntroRepositoryImpl_Factory create(Provider<ChatIntroLocalDataSource> provider, Provider<ChatConfigurationsRemoteDataSource> provider2, Provider<CoreExecuteCatching> provider3) {
        return new ChatIntroRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static ChatIntroRepositoryImpl newInstance(ChatIntroLocalDataSource chatIntroLocalDataSource, ChatConfigurationsRemoteDataSource chatConfigurationsRemoteDataSource, CoreExecuteCatching coreExecuteCatching) {
        return new ChatIntroRepositoryImpl(chatIntroLocalDataSource, chatConfigurationsRemoteDataSource, coreExecuteCatching);
    }
}
