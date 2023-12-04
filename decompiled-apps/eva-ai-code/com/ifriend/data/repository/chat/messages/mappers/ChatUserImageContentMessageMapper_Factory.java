package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.repository.chat.messages.mappers.images.ChatImageUrlMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatUserImageContentMessageMapper_Factory implements Factory<ChatUserImageContentMessageMapper> {
    private final Provider<ChatImageUrlMapper> chatImageUrlMapperProvider;

    public ChatUserImageContentMessageMapper_Factory(Provider<ChatImageUrlMapper> provider) {
        this.chatImageUrlMapperProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatUserImageContentMessageMapper get() {
        return newInstance(this.chatImageUrlMapperProvider.get());
    }

    public static ChatUserImageContentMessageMapper_Factory create(Provider<ChatImageUrlMapper> provider) {
        return new ChatUserImageContentMessageMapper_Factory(provider);
    }

    public static ChatUserImageContentMessageMapper newInstance(ChatImageUrlMapper chatImageUrlMapper) {
        return new ChatUserImageContentMessageMapper(chatImageUrlMapper);
    }
}
