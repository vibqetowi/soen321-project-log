package com.ifriend.data.repository.chat.messages.mappers;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageMapper_Factory implements Factory<ChatMessageMapper> {
    private final Provider<ChatMessageContentMapper> contentMapperProvider;
    private final Provider<ChatMessageInfoMapper> infoMapperProvider;

    public ChatMessageMapper_Factory(Provider<ChatMessageInfoMapper> provider, Provider<ChatMessageContentMapper> provider2) {
        this.infoMapperProvider = provider;
        this.contentMapperProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatMessageMapper get() {
        return newInstance(this.infoMapperProvider.get(), this.contentMapperProvider.get());
    }

    public static ChatMessageMapper_Factory create(Provider<ChatMessageInfoMapper> provider, Provider<ChatMessageContentMapper> provider2) {
        return new ChatMessageMapper_Factory(provider, provider2);
    }

    public static ChatMessageMapper newInstance(ChatMessageInfoMapper chatMessageInfoMapper, ChatMessageContentMapper chatMessageContentMapper) {
        return new ChatMessageMapper(chatMessageInfoMapper, chatMessageContentMapper);
    }
}
