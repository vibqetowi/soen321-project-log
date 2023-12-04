package com.ifriend.data.repository.calls;

import com.ifriend.core.remote.datasources.calls.ChatCallsRemoteDataSource;
import com.ifriend.data.common.CoreExecuteCatching;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatCallsRepositoryImpl_Factory implements Factory<ChatCallsRepositoryImpl> {
    private final Provider<ChatCallsRemoteDataSource> chatCallsRemoteDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;

    public ChatCallsRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<ChatCallsRemoteDataSource> provider2) {
        this.coreExecuteCatchingProvider = provider;
        this.chatCallsRemoteDataSourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatCallsRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.chatCallsRemoteDataSourceProvider.get());
    }

    public static ChatCallsRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<ChatCallsRemoteDataSource> provider2) {
        return new ChatCallsRepositoryImpl_Factory(provider, provider2);
    }

    public static ChatCallsRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, ChatCallsRemoteDataSource chatCallsRemoteDataSource) {
        return new ChatCallsRepositoryImpl(coreExecuteCatching, chatCallsRemoteDataSource);
    }
}
