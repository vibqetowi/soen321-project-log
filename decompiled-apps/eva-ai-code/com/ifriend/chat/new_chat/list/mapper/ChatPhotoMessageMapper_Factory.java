package com.ifriend.chat.new_chat.list.mapper;

import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPhotoMessageMapper_Factory implements Factory<ChatPhotoMessageMapper> {
    private final Provider<ChatMessageAccessInteractor> messageAccessInteractorProvider;

    public ChatPhotoMessageMapper_Factory(Provider<ChatMessageAccessInteractor> provider) {
        this.messageAccessInteractorProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatPhotoMessageMapper get() {
        return newInstance(this.messageAccessInteractorProvider.get());
    }

    public static ChatPhotoMessageMapper_Factory create(Provider<ChatMessageAccessInteractor> provider) {
        return new ChatPhotoMessageMapper_Factory(provider);
    }

    public static ChatPhotoMessageMapper newInstance(ChatMessageAccessInteractor chatMessageAccessInteractor) {
        return new ChatPhotoMessageMapper(chatMessageAccessInteractor);
    }
}
