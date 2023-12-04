package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.platform.tools.api.AppInfoProvider;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.analytics.ChatAnalyticsInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.features.profile.header.delegate.ChatHeaderDelegateImpl;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.mappers.ChatBuySubscriptionOfferUiMapper;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0215ChatBuySubscriptionViewModelFactory_Factory {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<AppInfoProvider> appInfoProvider;
    private final Provider<BillingPurchaseDelegate.Factory> billingPurchaseDelegateProvider;
    private final Provider<ChatAnalyticsInteractor> chatAnalyticsInteractorProvider;
    private final Provider<ChatHeaderDelegateImpl> chatHeaderDelegateProvider;
    private final Provider<ChatPanelActionsInteractor> chatPanelActionsInteractorProvider;
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<PaymentResultEmitter> paymentResultEmitterProvider;
    private final Provider<ChatsRefreshConfigurationUseCase> refreshConfigurationUseCaseProvider;
    private final Provider<ResourceProvider> resourceProvider;
    private final Provider<ChatBuySubscriptionOfferUiMapper> subscriptionOfferUiMapperProvider;

    public C0215ChatBuySubscriptionViewModelFactory_Factory(Provider<ChatHeaderDelegateImpl> provider, Provider<ChatsConfigurationInteractor> provider2, Provider<ChatPanelActionsInteractor> provider3, Provider<BillingPurchaseDelegate.Factory> provider4, Provider<FlowObserverEmitter<Throwable>> provider5, Provider<AppEventsEmitter> provider6, Provider<ResourceProvider> provider7, Provider<AnalyticsInteractor> provider8, Provider<ChatBuySubscriptionOfferUiMapper> provider9, Provider<AppInfoProvider> provider10, Provider<ChatsRefreshConfigurationUseCase> provider11, Provider<ChatsInfoInteractor> provider12, Provider<PaymentResultEmitter> provider13, Provider<ChatAnalyticsInteractor> provider14) {
        this.chatHeaderDelegateProvider = provider;
        this.chatsConfigurationInteractorProvider = provider2;
        this.chatPanelActionsInteractorProvider = provider3;
        this.billingPurchaseDelegateProvider = provider4;
        this.exceptionsEmitterProvider = provider5;
        this.appEventsEmitterProvider = provider6;
        this.resourceProvider = provider7;
        this.analyticsInteractorProvider = provider8;
        this.subscriptionOfferUiMapperProvider = provider9;
        this.appInfoProvider = provider10;
        this.refreshConfigurationUseCaseProvider = provider11;
        this.chatsInfoInteractorProvider = provider12;
        this.paymentResultEmitterProvider = provider13;
        this.chatAnalyticsInteractorProvider = provider14;
    }

    public ChatBuySubscriptionViewModelFactory get(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams) {
        return newInstance(buyChatSubscriptionBillingUiParams, this.chatHeaderDelegateProvider.get(), this.chatsConfigurationInteractorProvider.get(), this.chatPanelActionsInteractorProvider.get(), this.billingPurchaseDelegateProvider.get(), this.exceptionsEmitterProvider.get(), this.appEventsEmitterProvider.get(), this.resourceProvider.get(), this.analyticsInteractorProvider.get(), this.subscriptionOfferUiMapperProvider.get(), this.appInfoProvider.get(), this.refreshConfigurationUseCaseProvider.get(), this.chatsInfoInteractorProvider.get(), this.paymentResultEmitterProvider.get(), this.chatAnalyticsInteractorProvider.get());
    }

    public static C0215ChatBuySubscriptionViewModelFactory_Factory create(Provider<ChatHeaderDelegateImpl> provider, Provider<ChatsConfigurationInteractor> provider2, Provider<ChatPanelActionsInteractor> provider3, Provider<BillingPurchaseDelegate.Factory> provider4, Provider<FlowObserverEmitter<Throwable>> provider5, Provider<AppEventsEmitter> provider6, Provider<ResourceProvider> provider7, Provider<AnalyticsInteractor> provider8, Provider<ChatBuySubscriptionOfferUiMapper> provider9, Provider<AppInfoProvider> provider10, Provider<ChatsRefreshConfigurationUseCase> provider11, Provider<ChatsInfoInteractor> provider12, Provider<PaymentResultEmitter> provider13, Provider<ChatAnalyticsInteractor> provider14) {
        return new C0215ChatBuySubscriptionViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public static ChatBuySubscriptionViewModelFactory newInstance(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, ChatHeaderDelegateImpl chatHeaderDelegateImpl, ChatsConfigurationInteractor chatsConfigurationInteractor, ChatPanelActionsInteractor chatPanelActionsInteractor, BillingPurchaseDelegate.Factory factory, FlowObserverEmitter<Throwable> flowObserverEmitter, AppEventsEmitter appEventsEmitter, ResourceProvider resourceProvider, AnalyticsInteractor analyticsInteractor, ChatBuySubscriptionOfferUiMapper chatBuySubscriptionOfferUiMapper, AppInfoProvider appInfoProvider, ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase, ChatsInfoInteractor chatsInfoInteractor, PaymentResultEmitter paymentResultEmitter, ChatAnalyticsInteractor chatAnalyticsInteractor) {
        return new ChatBuySubscriptionViewModelFactory(buyChatSubscriptionBillingUiParams, chatHeaderDelegateImpl, chatsConfigurationInteractor, chatPanelActionsInteractor, factory, flowObserverEmitter, appEventsEmitter, resourceProvider, analyticsInteractor, chatBuySubscriptionOfferUiMapper, appInfoProvider, chatsRefreshConfigurationUseCase, chatsInfoInteractor, paymentResultEmitter, chatAnalyticsInteractor);
    }
}
