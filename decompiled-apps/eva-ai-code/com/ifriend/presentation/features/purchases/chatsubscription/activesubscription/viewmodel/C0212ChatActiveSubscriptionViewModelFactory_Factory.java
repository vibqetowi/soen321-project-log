package com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel;

import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.chatsubscription.common.mappers.SubscriptionBenefitsMapper;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0212ChatActiveSubscriptionViewModelFactory_Factory {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<AppInfoProvider> appInfoProvider;
    private final Provider<ChatSubscriptionInteractor> chatSubscriptionInteractorProvider;
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<ResourceProvider> resourceProvider;
    private final Provider<SubscriptionBenefitsMapper> subscriptionBenefitsMapperProvider;

    public C0212ChatActiveSubscriptionViewModelFactory_Factory(Provider<ResourceProvider> provider, Provider<ChatsConfigurationInteractor> provider2, Provider<SubscriptionBenefitsMapper> provider3, Provider<AppEventsEmitter> provider4, Provider<GetUserUseCase> provider5, Provider<AppInfoProvider> provider6, Provider<FlowObserverEmitter<Throwable>> provider7, Provider<ChatsInfoInteractor> provider8, Provider<ChatSubscriptionInteractor> provider9) {
        this.resourceProvider = provider;
        this.chatsConfigurationInteractorProvider = provider2;
        this.subscriptionBenefitsMapperProvider = provider3;
        this.appEventsEmitterProvider = provider4;
        this.getUserUseCaseProvider = provider5;
        this.appInfoProvider = provider6;
        this.exceptionsEmitterProvider = provider7;
        this.chatsInfoInteractorProvider = provider8;
        this.chatSubscriptionInteractorProvider = provider9;
    }

    public ChatActiveSubscriptionViewModelFactory get(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams) {
        return newInstance(buyChatSubscriptionBillingUiParams, this.resourceProvider.get(), this.chatsConfigurationInteractorProvider.get(), this.subscriptionBenefitsMapperProvider.get(), this.appEventsEmitterProvider.get(), this.getUserUseCaseProvider.get(), this.appInfoProvider.get(), this.exceptionsEmitterProvider.get(), this.chatsInfoInteractorProvider.get(), this.chatSubscriptionInteractorProvider.get());
    }

    public static C0212ChatActiveSubscriptionViewModelFactory_Factory create(Provider<ResourceProvider> provider, Provider<ChatsConfigurationInteractor> provider2, Provider<SubscriptionBenefitsMapper> provider3, Provider<AppEventsEmitter> provider4, Provider<GetUserUseCase> provider5, Provider<AppInfoProvider> provider6, Provider<FlowObserverEmitter<Throwable>> provider7, Provider<ChatsInfoInteractor> provider8, Provider<ChatSubscriptionInteractor> provider9) {
        return new C0212ChatActiveSubscriptionViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static ChatActiveSubscriptionViewModelFactory newInstance(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, ResourceProvider resourceProvider, ChatsConfigurationInteractor chatsConfigurationInteractor, SubscriptionBenefitsMapper subscriptionBenefitsMapper, AppEventsEmitter appEventsEmitter, GetUserUseCase getUserUseCase, AppInfoProvider appInfoProvider, FlowObserverEmitter<Throwable> flowObserverEmitter, ChatsInfoInteractor chatsInfoInteractor, ChatSubscriptionInteractor chatSubscriptionInteractor) {
        return new ChatActiveSubscriptionViewModelFactory(buyChatSubscriptionBillingUiParams, resourceProvider, chatsConfigurationInteractor, subscriptionBenefitsMapper, appEventsEmitter, getUserUseCase, appInfoProvider, flowObserverEmitter, chatsInfoInteractor, chatSubscriptionInteractor);
    }
}
