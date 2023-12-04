package com.ifriend.data.repository.chat.messages.mappers;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageContentMapper_Factory implements Factory<ChatMessageContentMapper> {
    private final Provider<ChatAudioContentMessageMapper> audioMapperProvider;
    private final Provider<ChatGiftContentMessageMapper> giftMapperProvider;
    private final Provider<ChatImageContentMessageMapper> imageMapperProvider;
    private final Provider<ChatTextContentMessageMapper> textMapperProvider;
    private final Provider<ChatUserImageContentMessageMapper> userImageMapperProvider;

    public ChatMessageContentMapper_Factory(Provider<ChatAudioContentMessageMapper> provider, Provider<ChatImageContentMessageMapper> provider2, Provider<ChatUserImageContentMessageMapper> provider3, Provider<ChatTextContentMessageMapper> provider4, Provider<ChatGiftContentMessageMapper> provider5) {
        this.audioMapperProvider = provider;
        this.imageMapperProvider = provider2;
        this.userImageMapperProvider = provider3;
        this.textMapperProvider = provider4;
        this.giftMapperProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ChatMessageContentMapper get() {
        return newInstance(this.audioMapperProvider.get(), this.imageMapperProvider.get(), this.userImageMapperProvider.get(), this.textMapperProvider.get(), this.giftMapperProvider.get());
    }

    public static ChatMessageContentMapper_Factory create(Provider<ChatAudioContentMessageMapper> provider, Provider<ChatImageContentMessageMapper> provider2, Provider<ChatUserImageContentMessageMapper> provider3, Provider<ChatTextContentMessageMapper> provider4, Provider<ChatGiftContentMessageMapper> provider5) {
        return new ChatMessageContentMapper_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChatMessageContentMapper newInstance(ChatAudioContentMessageMapper chatAudioContentMessageMapper, ChatImageContentMessageMapper chatImageContentMessageMapper, ChatUserImageContentMessageMapper chatUserImageContentMessageMapper, ChatTextContentMessageMapper chatTextContentMessageMapper, ChatGiftContentMessageMapper chatGiftContentMessageMapper) {
        return new ChatMessageContentMapper(chatAudioContentMessageMapper, chatImageContentMessageMapper, chatUserImageContentMessageMapper, chatTextContentMessageMapper, chatGiftContentMessageMapper);
    }
}
