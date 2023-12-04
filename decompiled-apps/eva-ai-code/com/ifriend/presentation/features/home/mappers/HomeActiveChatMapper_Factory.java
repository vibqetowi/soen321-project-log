package com.ifriend.presentation.features.home.mappers;

import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class HomeActiveChatMapper_Factory implements Factory<HomeActiveChatMapper> {
    private final Provider<ChatMessageAccessInteractor> chatMessageAccessInteractorProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public HomeActiveChatMapper_Factory(Provider<ResourceProvider> provider, Provider<ChatMessageAccessInteractor> provider2) {
        this.resourceProvider = provider;
        this.chatMessageAccessInteractorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public HomeActiveChatMapper get() {
        return newInstance(this.resourceProvider.get(), this.chatMessageAccessInteractorProvider.get());
    }

    public static HomeActiveChatMapper_Factory create(Provider<ResourceProvider> provider, Provider<ChatMessageAccessInteractor> provider2) {
        return new HomeActiveChatMapper_Factory(provider, provider2);
    }

    public static HomeActiveChatMapper newInstance(ResourceProvider resourceProvider, ChatMessageAccessInteractor chatMessageAccessInteractor) {
        return new HomeActiveChatMapper(resourceProvider, chatMessageAccessInteractor);
    }
}
