package com.ifriend.presentation.features.purchases.premium.viewmodel;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.chat.domain.profile.user.benefits.GetAllPremiumBenefitsUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.mapper.SubscriptionBenefitsUiMapper;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiMapper;
import java.util.UUID;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0217BuyPremiumViewModelFactory_Factory {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<AnalyticsOpenSubscriptionScreenUseCase> analyticsOpenSubscriptionScreenUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<SubscriptionBenefitsUiMapper> benefitsMapperProvider;
    private final Provider<BillingPurchaseDelegate.Factory> billingPurchaseDelegateProvider;
    private final Provider<ChatsInfoConfigurationRepository> chatsInfoConfigurationRepositoryProvider;
    private final Provider<DispatcherProvider> dispatchersProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<GetAllPremiumBenefitsUseCase> getBenefitsUseCaseProvider;
    private final Provider<GetUserUseCase> getUserUseCaseProvider;
    private final Provider<BuyPremiumPlanUiMapper> mapperProvider;
    private final Provider<PaymentResultEmitter> paymentResultEmitterProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public C0217BuyPremiumViewModelFactory_Factory(Provider<GetAllPremiumBenefitsUseCase> provider, Provider<ChatsInfoConfigurationRepository> provider2, Provider<AnalyticsOpenSubscriptionScreenUseCase> provider3, Provider<BuyPremiumPlanUiMapper> provider4, Provider<PaymentResultEmitter> provider5, Provider<AppEventsEmitter> provider6, Provider<AnalyticsInteractor> provider7, Provider<FlowObserverEmitter<Throwable>> provider8, Provider<BillingPurchaseDelegate.Factory> provider9, Provider<GetUserUseCase> provider10, Provider<DispatcherProvider> provider11, Provider<SubscriptionBenefitsUiMapper> provider12, Provider<ResourceProvider> provider13) {
        this.getBenefitsUseCaseProvider = provider;
        this.chatsInfoConfigurationRepositoryProvider = provider2;
        this.analyticsOpenSubscriptionScreenUseCaseProvider = provider3;
        this.mapperProvider = provider4;
        this.paymentResultEmitterProvider = provider5;
        this.appEventsEmitterProvider = provider6;
        this.analyticsInteractorProvider = provider7;
        this.exceptionsEmitterProvider = provider8;
        this.billingPurchaseDelegateProvider = provider9;
        this.getUserUseCaseProvider = provider10;
        this.dispatchersProvider = provider11;
        this.benefitsMapperProvider = provider12;
        this.resourceProvider = provider13;
    }

    public BuyPremiumViewModelFactory get(UUID uuid, PurchaseSource purchaseSource, boolean z, PurchaseReason purchaseReason) {
        return newInstance(uuid, purchaseSource, z, purchaseReason, this.getBenefitsUseCaseProvider.get(), this.chatsInfoConfigurationRepositoryProvider.get(), this.analyticsOpenSubscriptionScreenUseCaseProvider.get(), this.mapperProvider.get(), this.paymentResultEmitterProvider.get(), this.appEventsEmitterProvider.get(), this.analyticsInteractorProvider.get(), this.exceptionsEmitterProvider.get(), this.billingPurchaseDelegateProvider.get(), this.getUserUseCaseProvider.get(), this.dispatchersProvider.get(), this.benefitsMapperProvider.get(), this.resourceProvider.get());
    }

    public static C0217BuyPremiumViewModelFactory_Factory create(Provider<GetAllPremiumBenefitsUseCase> provider, Provider<ChatsInfoConfigurationRepository> provider2, Provider<AnalyticsOpenSubscriptionScreenUseCase> provider3, Provider<BuyPremiumPlanUiMapper> provider4, Provider<PaymentResultEmitter> provider5, Provider<AppEventsEmitter> provider6, Provider<AnalyticsInteractor> provider7, Provider<FlowObserverEmitter<Throwable>> provider8, Provider<BillingPurchaseDelegate.Factory> provider9, Provider<GetUserUseCase> provider10, Provider<DispatcherProvider> provider11, Provider<SubscriptionBenefitsUiMapper> provider12, Provider<ResourceProvider> provider13) {
        return new C0217BuyPremiumViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static BuyPremiumViewModelFactory newInstance(UUID uuid, PurchaseSource purchaseSource, boolean z, PurchaseReason purchaseReason, GetAllPremiumBenefitsUseCase getAllPremiumBenefitsUseCase, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase, BuyPremiumPlanUiMapper buyPremiumPlanUiMapper, PaymentResultEmitter paymentResultEmitter, AppEventsEmitter appEventsEmitter, AnalyticsInteractor analyticsInteractor, FlowObserverEmitter<Throwable> flowObserverEmitter, BillingPurchaseDelegate.Factory factory, GetUserUseCase getUserUseCase, DispatcherProvider dispatcherProvider, SubscriptionBenefitsUiMapper subscriptionBenefitsUiMapper, ResourceProvider resourceProvider) {
        return new BuyPremiumViewModelFactory(uuid, purchaseSource, z, purchaseReason, getAllPremiumBenefitsUseCase, chatsInfoConfigurationRepository, analyticsOpenSubscriptionScreenUseCase, buyPremiumPlanUiMapper, paymentResultEmitter, appEventsEmitter, analyticsInteractor, flowObserverEmitter, factory, getUserUseCase, dispatcherProvider, subscriptionBenefitsUiMapper, resourceProvider);
    }
}
