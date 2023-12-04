package com.ifriend.domain.logic.chat.configuration;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsConfigurationInteractor_Factory implements Factory<ChatsConfigurationInteractor> {
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;

    public ChatsConfigurationInteractor_Factory(Provider<ChatsInfoRepository> provider, Provider<ChatConfigsMemoryCachedSource> provider2) {
        this.chatsInfoRepositoryProvider = provider;
        this.chatConfigsMemoryCachedSourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatsConfigurationInteractor get() {
        return newInstance(this.chatsInfoRepositoryProvider.get(), this.chatConfigsMemoryCachedSourceProvider.get());
    }

    public static ChatsConfigurationInteractor_Factory create(Provider<ChatsInfoRepository> provider, Provider<ChatConfigsMemoryCachedSource> provider2) {
        return new ChatsConfigurationInteractor_Factory(provider, provider2);
    }

    public static ChatsConfigurationInteractor newInstance(ChatsInfoRepository chatsInfoRepository, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource) {
        return new ChatsConfigurationInteractor(chatsInfoRepository, chatConfigsMemoryCachedSource);
    }
}
