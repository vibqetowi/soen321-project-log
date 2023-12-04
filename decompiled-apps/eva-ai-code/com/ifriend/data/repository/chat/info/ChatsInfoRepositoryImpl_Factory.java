package com.ifriend.data.repository.chat.info;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.datasources.chat.ChatsRemoteDataSource;
import com.ifriend.data.repository.chat.info.mapper.ChatInfoMapper;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsInfoRepositoryImpl_Factory implements Factory<ChatsInfoRepositoryImpl> {
    private final Provider<ChatConfigsMemoryCachedSource> chatConfigsMemoryCachedSourceProvider;
    private final Provider<ChatInfoMapper> chatInfoMapperProvider;
    private final Provider<ChatsRemoteDataSource> chatsRemoteDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<MainBotLocalDataSource> mainBotLocalDataSourceProvider;

    public ChatsInfoRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<MainBotLocalDataSource> provider2, Provider<ChatConfigsMemoryCachedSource> provider3, Provider<ChatInfoMapper> provider4, Provider<ChatsRemoteDataSource> provider5) {
        this.coreExecuteCatchingProvider = provider;
        this.mainBotLocalDataSourceProvider = provider2;
        this.chatConfigsMemoryCachedSourceProvider = provider3;
        this.chatInfoMapperProvider = provider4;
        this.chatsRemoteDataSourceProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ChatsInfoRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.mainBotLocalDataSourceProvider.get(), this.chatConfigsMemoryCachedSourceProvider.get(), this.chatInfoMapperProvider.get(), this.chatsRemoteDataSourceProvider.get());
    }

    public static ChatsInfoRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<MainBotLocalDataSource> provider2, Provider<ChatConfigsMemoryCachedSource> provider3, Provider<ChatInfoMapper> provider4, Provider<ChatsRemoteDataSource> provider5) {
        return new ChatsInfoRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChatsInfoRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, MainBotLocalDataSource mainBotLocalDataSource, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, ChatInfoMapper chatInfoMapper, ChatsRemoteDataSource chatsRemoteDataSource) {
        return new ChatsInfoRepositoryImpl(coreExecuteCatching, mainBotLocalDataSource, chatConfigsMemoryCachedSource, chatInfoMapper, chatsRemoteDataSource);
    }
}
