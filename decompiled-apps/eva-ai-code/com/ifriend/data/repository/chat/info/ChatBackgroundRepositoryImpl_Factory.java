package com.ifriend.data.repository.chat.info;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.files.FileProvider;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatBackgroundRepositoryImpl_Factory implements Factory<ChatBackgroundRepositoryImpl> {
    private final Provider<ChatConfigsMemoryCachedSource> configurationBotsSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<FileProvider> fileProvider;

    public ChatBackgroundRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<FileProvider> provider2, Provider<ChatConfigsMemoryCachedSource> provider3) {
        this.coreExecuteCatchingProvider = provider;
        this.fileProvider = provider2;
        this.configurationBotsSourceProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatBackgroundRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.fileProvider.get(), this.configurationBotsSourceProvider.get());
    }

    public static ChatBackgroundRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<FileProvider> provider2, Provider<ChatConfigsMemoryCachedSource> provider3) {
        return new ChatBackgroundRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static ChatBackgroundRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, FileProvider fileProvider, ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource) {
        return new ChatBackgroundRepositoryImpl(coreExecuteCatching, fileProvider, chatConfigsMemoryCachedSource);
    }
}
