package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.repository.chat.messages.mappers.images.ChatImageUrlMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatGiftContentMessageMapper_Factory implements Factory<ChatGiftContentMessageMapper> {
    private final Provider<ChatImageUrlMapper> chatImageUrlMapperProvider;

    public ChatGiftContentMessageMapper_Factory(Provider<ChatImageUrlMapper> provider) {
        this.chatImageUrlMapperProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatGiftContentMessageMapper get() {
        return newInstance(this.chatImageUrlMapperProvider.get());
    }

    public static ChatGiftContentMessageMapper_Factory create(Provider<ChatImageUrlMapper> provider) {
        return new ChatGiftContentMessageMapper_Factory(provider);
    }

    public static ChatGiftContentMessageMapper newInstance(ChatImageUrlMapper chatImageUrlMapper) {
        return new ChatGiftContentMessageMapper(chatImageUrlMapper);
    }
}
