package com.ifriend.data.networking.datasources.chat;

import com.ifriend.data.networking.api.chat.ChatsInfoApi;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserChatRemoteDataSource_Factory implements Factory<UserChatRemoteDataSource> {
    private final Provider<ChatsInfoApi> userChatApiProvider;

    public UserChatRemoteDataSource_Factory(Provider<ChatsInfoApi> provider) {
        this.userChatApiProvider = provider;
    }

    @Override // javax.inject.Provider
    public UserChatRemoteDataSource get() {
        return newInstance(this.userChatApiProvider.get());
    }

    public static UserChatRemoteDataSource_Factory create(Provider<ChatsInfoApi> provider) {
        return new UserChatRemoteDataSource_Factory(provider);
    }

    public static UserChatRemoteDataSource newInstance(ChatsInfoApi chatsInfoApi) {
        return new UserChatRemoteDataSource(chatsInfoApi);
    }
}
