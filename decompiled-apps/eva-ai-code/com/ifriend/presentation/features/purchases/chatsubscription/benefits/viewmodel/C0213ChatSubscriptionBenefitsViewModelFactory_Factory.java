package com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel;

import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.chatsubscription.common.mappers.SubscriptionBenefitsMapper;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0213ChatSubscriptionBenefitsViewModelFactory_Factory {
    private final Provider<ChatSubscriptionInteractor> chatSubscriptionInteractorProvider;
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<ResourceProvider> resourceProvider;
    private final Provider<SubscriptionBenefitsMapper> subscriptionBenefitsMapperProvider;

    public C0213ChatSubscriptionBenefitsViewModelFactory_Factory(Provider<ResourceProvider> provider, Provider<ChatsConfigurationInteractor> provider2, Provider<SubscriptionBenefitsMapper> provider3, Provider<ChatSubscriptionInteractor> provider4, Provider<FlowObserverEmitter<Throwable>> provider5, Provider<ChatsInfoInteractor> provider6) {
        this.resourceProvider = provider;
        this.chatsConfigurationInteractorProvider = provider2;
        this.subscriptionBenefitsMapperProvider = provider3;
        this.chatSubscriptionInteractorProvider = provider4;
        this.exceptionsEmitterProvider = provider5;
        this.chatsInfoInteractorProvider = provider6;
    }

    public ChatSubscriptionBenefitsViewModelFactory get(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams) {
        return newInstance(buyChatSubscriptionBillingUiParams, this.resourceProvider.get(), this.chatsConfigurationInteractorProvider.get(), this.subscriptionBenefitsMapperProvider.get(), this.chatSubscriptionInteractorProvider.get(), this.exceptionsEmitterProvider.get(), this.chatsInfoInteractorProvider.get());
    }

    public static C0213ChatSubscriptionBenefitsViewModelFactory_Factory create(Provider<ResourceProvider> provider, Provider<ChatsConfigurationInteractor> provider2, Provider<SubscriptionBenefitsMapper> provider3, Provider<ChatSubscriptionInteractor> provider4, Provider<FlowObserverEmitter<Throwable>> provider5, Provider<ChatsInfoInteractor> provider6) {
        return new C0213ChatSubscriptionBenefitsViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ChatSubscriptionBenefitsViewModelFactory newInstance(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, ResourceProvider resourceProvider, ChatsConfigurationInteractor chatsConfigurationInteractor, SubscriptionBenefitsMapper subscriptionBenefitsMapper, ChatSubscriptionInteractor chatSubscriptionInteractor, FlowObserverEmitter<Throwable> flowObserverEmitter, ChatsInfoInteractor chatsInfoInteractor) {
        return new ChatSubscriptionBenefitsViewModelFactory(buyChatSubscriptionBillingUiParams, resourceProvider, chatsConfigurationInteractor, subscriptionBenefitsMapper, chatSubscriptionInteractor, flowObserverEmitter, chatsInfoInteractor);
    }
}
