package com.ifriend.chat.new_chat.list.mapper;

import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatEntityToTextUiModelMapper_Factory implements Factory<ChatEntityToTextUiModelMapper> {
    private final Provider<ChatMessageAccessInteractor> messageAccessInteractorProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public ChatEntityToTextUiModelMapper_Factory(Provider<ResourceProvider> provider, Provider<ChatMessageAccessInteractor> provider2) {
        this.resourceProvider = provider;
        this.messageAccessInteractorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatEntityToTextUiModelMapper get() {
        return newInstance(this.resourceProvider.get(), this.messageAccessInteractorProvider.get());
    }

    public static ChatEntityToTextUiModelMapper_Factory create(Provider<ResourceProvider> provider, Provider<ChatMessageAccessInteractor> provider2) {
        return new ChatEntityToTextUiModelMapper_Factory(provider, provider2);
    }

    public static ChatEntityToTextUiModelMapper newInstance(ResourceProvider resourceProvider, ChatMessageAccessInteractor chatMessageAccessInteractor) {
        return new ChatEntityToTextUiModelMapper(resourceProvider, chatMessageAccessInteractor);
    }
}
