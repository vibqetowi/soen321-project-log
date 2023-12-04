package com.ifriend.data.networking.datasources.chat;

import com.ifriend.data.networking.api.chat.ChatsApi;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsRemoteDataSource_Factory implements Factory<ChatsRemoteDataSource> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<ChatsApi> chatsApiProvider;

    public ChatsRemoteDataSource_Factory(Provider<ChatsApi> provider, Provider<AuthDataProvider> provider2) {
        this.chatsApiProvider = provider;
        this.authDataProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatsRemoteDataSource get() {
        return newInstance(this.chatsApiProvider.get(), this.authDataProvider.get());
    }

    public static ChatsRemoteDataSource_Factory create(Provider<ChatsApi> provider, Provider<AuthDataProvider> provider2) {
        return new ChatsRemoteDataSource_Factory(provider, provider2);
    }

    public static ChatsRemoteDataSource newInstance(ChatsApi chatsApi, AuthDataProvider authDataProvider) {
        return new ChatsRemoteDataSource(chatsApi, authDataProvider);
    }
}
