package com.ifriend.presentation.features.chat.notifications.model;

import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatNotificationsUiMapper_Factory implements Factory<ChatNotificationsUiMapper> {
    private final Provider<ChatMessageAccessInteractor> chatMessageAccessInteractorProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public ChatNotificationsUiMapper_Factory(Provider<ResourceProvider> provider, Provider<ChatMessageAccessInteractor> provider2) {
        this.resourceProvider = provider;
        this.chatMessageAccessInteractorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatNotificationsUiMapper get() {
        return newInstance(this.resourceProvider.get(), this.chatMessageAccessInteractorProvider.get());
    }

    public static ChatNotificationsUiMapper_Factory create(Provider<ResourceProvider> provider, Provider<ChatMessageAccessInteractor> provider2) {
        return new ChatNotificationsUiMapper_Factory(provider, provider2);
    }

    public static ChatNotificationsUiMapper newInstance(ResourceProvider resourceProvider, ChatMessageAccessInteractor chatMessageAccessInteractor) {
        return new ChatNotificationsUiMapper(resourceProvider, chatMessageAccessInteractor);
    }
}
