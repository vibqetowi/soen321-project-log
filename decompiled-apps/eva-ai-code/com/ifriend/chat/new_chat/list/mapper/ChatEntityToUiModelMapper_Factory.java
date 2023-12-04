package com.ifriend.chat.new_chat.list.mapper;

import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatEntityToUiModelMapper_Factory implements Factory<ChatEntityToUiModelMapper> {
    private final Provider<ChatEntityToAudioUiModelMapper> audioMapperProvider;
    private final Provider<ChatEntityToDateUiModelMapper> dateMapperProvider;
    private final Provider<ChatEntityToGiftUiModelMapper> giftMapperProvider;
    private final Provider<ChatMessageAccessInteractor> messageAccessInteractorProvider;
    private final Provider<ChatPhotoMessageMapper> photoMessageMapperProvider;
    private final Provider<ChatEntityToProcessingUiModelMapper> processingMapperProvider;
    private final Provider<ChatEntityToTextUiModelMapper> textMapperProvider;
    private final Provider<ChatEntityToTopicSeparatorUiModelMapper> topicSeparatorMapperProvider;

    public ChatEntityToUiModelMapper_Factory(Provider<ChatEntityToAudioUiModelMapper> provider, Provider<ChatEntityToGiftUiModelMapper> provider2, Provider<ChatEntityToTextUiModelMapper> provider3, Provider<ChatEntityToDateUiModelMapper> provider4, Provider<ChatEntityToProcessingUiModelMapper> provider5, Provider<ChatEntityToTopicSeparatorUiModelMapper> provider6, Provider<ChatPhotoMessageMapper> provider7, Provider<ChatMessageAccessInteractor> provider8) {
        this.audioMapperProvider = provider;
        this.giftMapperProvider = provider2;
        this.textMapperProvider = provider3;
        this.dateMapperProvider = provider4;
        this.processingMapperProvider = provider5;
        this.topicSeparatorMapperProvider = provider6;
        this.photoMessageMapperProvider = provider7;
        this.messageAccessInteractorProvider = provider8;
    }

    @Override // javax.inject.Provider
    public ChatEntityToUiModelMapper get() {
        return newInstance(this.audioMapperProvider.get(), this.giftMapperProvider.get(), this.textMapperProvider.get(), this.dateMapperProvider.get(), this.processingMapperProvider.get(), this.topicSeparatorMapperProvider.get(), this.photoMessageMapperProvider.get(), this.messageAccessInteractorProvider.get());
    }

    public static ChatEntityToUiModelMapper_Factory create(Provider<ChatEntityToAudioUiModelMapper> provider, Provider<ChatEntityToGiftUiModelMapper> provider2, Provider<ChatEntityToTextUiModelMapper> provider3, Provider<ChatEntityToDateUiModelMapper> provider4, Provider<ChatEntityToProcessingUiModelMapper> provider5, Provider<ChatEntityToTopicSeparatorUiModelMapper> provider6, Provider<ChatPhotoMessageMapper> provider7, Provider<ChatMessageAccessInteractor> provider8) {
        return new ChatEntityToUiModelMapper_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static ChatEntityToUiModelMapper newInstance(ChatEntityToAudioUiModelMapper chatEntityToAudioUiModelMapper, ChatEntityToGiftUiModelMapper chatEntityToGiftUiModelMapper, ChatEntityToTextUiModelMapper chatEntityToTextUiModelMapper, ChatEntityToDateUiModelMapper chatEntityToDateUiModelMapper, ChatEntityToProcessingUiModelMapper chatEntityToProcessingUiModelMapper, ChatEntityToTopicSeparatorUiModelMapper chatEntityToTopicSeparatorUiModelMapper, ChatPhotoMessageMapper chatPhotoMessageMapper, ChatMessageAccessInteractor chatMessageAccessInteractor) {
        return new ChatEntityToUiModelMapper(chatEntityToAudioUiModelMapper, chatEntityToGiftUiModelMapper, chatEntityToTextUiModelMapper, chatEntityToDateUiModelMapper, chatEntityToProcessingUiModelMapper, chatEntityToTopicSeparatorUiModelMapper, chatPhotoMessageMapper, chatMessageAccessInteractor);
    }
}
