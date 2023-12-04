package com.ifriend.presentation.features.chatsettings.delegates;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.mappers.ChatInterestsTypeMapperUi;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chatsettings.mappers.ChatSettingsActionTagsMapperUi;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSettingsConfigurationDelegateImpl_Factory implements Factory<ChatSettingsConfigurationDelegateImpl> {
    private final Provider<ChatSettingsActionTagsMapperUi> chatSettingsActionTagsMapperUiProvider;
    private final Provider<ChatSubscriptionInteractor> chatSubscriptionInteractorProvider;
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<ChatInterestsTypeMapperUi> interestsMapperUiProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public ChatSettingsConfigurationDelegateImpl_Factory(Provider<ChatsConfigurationInteractor> provider, Provider<ChatSettingsActionTagsMapperUi> provider2, Provider<ChatInterestsTypeMapperUi> provider3, Provider<FlowObserverEmitter<Throwable>> provider4, Provider<ResourceProvider> provider5, Provider<ChatSubscriptionInteractor> provider6, Provider<DispatcherProvider> provider7) {
        this.chatsConfigurationInteractorProvider = provider;
        this.chatSettingsActionTagsMapperUiProvider = provider2;
        this.interestsMapperUiProvider = provider3;
        this.exceptionsEmitterProvider = provider4;
        this.resourceProvider = provider5;
        this.chatSubscriptionInteractorProvider = provider6;
        this.dispatcherProvider = provider7;
    }

    @Override // javax.inject.Provider
    public ChatSettingsConfigurationDelegateImpl get() {
        return newInstance(this.chatsConfigurationInteractorProvider.get(), this.chatSettingsActionTagsMapperUiProvider.get(), this.interestsMapperUiProvider.get(), this.exceptionsEmitterProvider.get(), this.resourceProvider.get(), this.chatSubscriptionInteractorProvider.get(), this.dispatcherProvider.get());
    }

    public static ChatSettingsConfigurationDelegateImpl_Factory create(Provider<ChatsConfigurationInteractor> provider, Provider<ChatSettingsActionTagsMapperUi> provider2, Provider<ChatInterestsTypeMapperUi> provider3, Provider<FlowObserverEmitter<Throwable>> provider4, Provider<ResourceProvider> provider5, Provider<ChatSubscriptionInteractor> provider6, Provider<DispatcherProvider> provider7) {
        return new ChatSettingsConfigurationDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static ChatSettingsConfigurationDelegateImpl newInstance(ChatsConfigurationInteractor chatsConfigurationInteractor, ChatSettingsActionTagsMapperUi chatSettingsActionTagsMapperUi, ChatInterestsTypeMapperUi chatInterestsTypeMapperUi, FlowObserverEmitter<Throwable> flowObserverEmitter, ResourceProvider resourceProvider, ChatSubscriptionInteractor chatSubscriptionInteractor, DispatcherProvider dispatcherProvider) {
        return new ChatSettingsConfigurationDelegateImpl(chatsConfigurationInteractor, chatSettingsActionTagsMapperUi, chatInterestsTypeMapperUi, flowObserverEmitter, resourceProvider, chatSubscriptionInteractor, dispatcherProvider);
    }
}
