package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.repository.chat.messages.mappers.images.ChatImageUrlMapper;
import com.ifriend.data.storages.config.AppConfigStorage;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatImageContentMessageMapper_Factory implements Factory<ChatImageContentMessageMapper> {
    private final Provider<AppConfigStorage> appConfigStorageProvider;
    private final Provider<ChatImageUrlMapper> chatImageUrlMapperProvider;

    public ChatImageContentMessageMapper_Factory(Provider<ChatImageUrlMapper> provider, Provider<AppConfigStorage> provider2) {
        this.chatImageUrlMapperProvider = provider;
        this.appConfigStorageProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatImageContentMessageMapper get() {
        return newInstance(this.chatImageUrlMapperProvider.get(), this.appConfigStorageProvider.get());
    }

    public static ChatImageContentMessageMapper_Factory create(Provider<ChatImageUrlMapper> provider, Provider<AppConfigStorage> provider2) {
        return new ChatImageContentMessageMapper_Factory(provider, provider2);
    }

    public static ChatImageContentMessageMapper newInstance(ChatImageUrlMapper chatImageUrlMapper, AppConfigStorage appConfigStorage) {
        return new ChatImageContentMessageMapper(chatImageUrlMapper, appConfigStorage);
    }
}
