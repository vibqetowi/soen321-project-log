package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.core.local.api.AuthLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageInfoMapper_Factory implements Factory<ChatMessageInfoMapper> {
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;

    public ChatMessageInfoMapper_Factory(Provider<AuthLocalDataSource> provider) {
        this.authLocalDataSourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatMessageInfoMapper get() {
        return newInstance(this.authLocalDataSourceProvider.get());
    }

    public static ChatMessageInfoMapper_Factory create(Provider<AuthLocalDataSource> provider) {
        return new ChatMessageInfoMapper_Factory(provider);
    }

    public static ChatMessageInfoMapper newInstance(AuthLocalDataSource authLocalDataSource) {
        return new ChatMessageInfoMapper(authLocalDataSource);
    }
}
