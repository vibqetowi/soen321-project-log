package com.ifriend.data.memorycached.chats;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.memorycached.chats.mappers.ChatConfigMapper;
import com.ifriend.data.networking.datasources.chat.ChatConfigurationsRemoteDataSource;
import com.ifriend.data.storages.config.AppConfigStorage;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatConfigsMemoryCachedSourceImpl_Factory implements Factory<ChatConfigsMemoryCachedSourceImpl> {
    private final Provider<AppConfigStorage> appConfigStorageProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<ChatConfigMapper> mapperProvider;
    private final Provider<ChatConfigurationsRemoteDataSource> remoteDataSourceProvider;

    public ChatConfigsMemoryCachedSourceImpl_Factory(Provider<ChatConfigurationsRemoteDataSource> provider, Provider<AppConfigStorage> provider2, Provider<ChatConfigMapper> provider3, Provider<DispatcherProvider> provider4, Provider<CoreExecuteCatching> provider5) {
        this.remoteDataSourceProvider = provider;
        this.appConfigStorageProvider = provider2;
        this.mapperProvider = provider3;
        this.dispatcherProvider = provider4;
        this.coreExecuteCatchingProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ChatConfigsMemoryCachedSourceImpl get() {
        return newInstance(this.remoteDataSourceProvider.get(), this.appConfigStorageProvider.get(), this.mapperProvider.get(), this.dispatcherProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static ChatConfigsMemoryCachedSourceImpl_Factory create(Provider<ChatConfigurationsRemoteDataSource> provider, Provider<AppConfigStorage> provider2, Provider<ChatConfigMapper> provider3, Provider<DispatcherProvider> provider4, Provider<CoreExecuteCatching> provider5) {
        return new ChatConfigsMemoryCachedSourceImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChatConfigsMemoryCachedSourceImpl newInstance(ChatConfigurationsRemoteDataSource chatConfigurationsRemoteDataSource, AppConfigStorage appConfigStorage, ChatConfigMapper chatConfigMapper, DispatcherProvider dispatcherProvider, CoreExecuteCatching coreExecuteCatching) {
        return new ChatConfigsMemoryCachedSourceImpl(chatConfigurationsRemoteDataSource, appConfigStorage, chatConfigMapper, dispatcherProvider, coreExecuteCatching);
    }
}
