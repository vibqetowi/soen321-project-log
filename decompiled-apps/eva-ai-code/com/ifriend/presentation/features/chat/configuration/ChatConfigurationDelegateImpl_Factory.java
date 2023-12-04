package com.ifriend.presentation.features.chat.configuration;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatConfigurationDelegateImpl_Factory {
    private final Provider<ChatSubscriptionInteractor> chatSubscriptionInteractorProvider;
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public ChatConfigurationDelegateImpl_Factory(Provider<ChatsConfigurationInteractor> provider, Provider<ChatSubscriptionInteractor> provider2, Provider<FlowObserverEmitter<Throwable>> provider3, Provider<ResourceProvider> provider4, Provider<DispatcherProvider> provider5) {
        this.chatsConfigurationInteractorProvider = provider;
        this.chatSubscriptionInteractorProvider = provider2;
        this.exceptionsEmitterProvider = provider3;
        this.resourceProvider = provider4;
        this.dispatcherProvider = provider5;
    }

    public ChatConfigurationDelegateImpl get(String str) {
        return newInstance(str, this.chatsConfigurationInteractorProvider.get(), this.chatSubscriptionInteractorProvider.get(), this.exceptionsEmitterProvider.get(), this.resourceProvider.get(), this.dispatcherProvider.get());
    }

    public static ChatConfigurationDelegateImpl_Factory create(Provider<ChatsConfigurationInteractor> provider, Provider<ChatSubscriptionInteractor> provider2, Provider<FlowObserverEmitter<Throwable>> provider3, Provider<ResourceProvider> provider4, Provider<DispatcherProvider> provider5) {
        return new ChatConfigurationDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChatConfigurationDelegateImpl newInstance(String str, ChatsConfigurationInteractor chatsConfigurationInteractor, ChatSubscriptionInteractor chatSubscriptionInteractor, FlowObserverEmitter<Throwable> flowObserverEmitter, ResourceProvider resourceProvider, DispatcherProvider dispatcherProvider) {
        return new ChatConfigurationDelegateImpl(str, chatsConfigurationInteractor, chatSubscriptionInteractor, flowObserverEmitter, resourceProvider, dispatcherProvider);
    }
}
