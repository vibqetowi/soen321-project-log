package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiMapper;
import java.util.UUID;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0216BuyNeuronsViewModelFactory_Factory {
    private final Provider<AnalyticsOpenSubscriptionScreenUseCase> analyticsOpenSubscriptionScreenUseCaseProvider;
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BillingPurchaseDelegate.Factory> billingPurchaseDelegateProvider;
    private final Provider<BuyNeuronsProductUiMapper> buyNeuronsProductUiMapperProvider;
    private final Provider<ChatsInfoConfigurationRepository> chatsInfoConfigurationRepositoryProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<PaymentResultEmitter> paymentResultEmitterProvider;
    private final Provider<ResourceProvider> resourceProvider;

    public C0216BuyNeuronsViewModelFactory_Factory(Provider<PaymentResultEmitter> provider, Provider<ChatsInfoConfigurationRepository> provider2, Provider<AnalyticsOpenSubscriptionScreenUseCase> provider3, Provider<BuyNeuronsProductUiMapper> provider4, Provider<AppEventsEmitter> provider5, Provider<FlowObserverEmitter<Throwable>> provider6, Provider<BillingPurchaseDelegate.Factory> provider7, Provider<ResourceProvider> provider8) {
        this.paymentResultEmitterProvider = provider;
        this.chatsInfoConfigurationRepositoryProvider = provider2;
        this.analyticsOpenSubscriptionScreenUseCaseProvider = provider3;
        this.buyNeuronsProductUiMapperProvider = provider4;
        this.appEventsEmitterProvider = provider5;
        this.exceptionsEmitterProvider = provider6;
        this.billingPurchaseDelegateProvider = provider7;
        this.resourceProvider = provider8;
    }

    public BuyNeuronsViewModelFactory get(UUID uuid, PurchaseSource purchaseSource, boolean z, PurchaseReason purchaseReason) {
        return newInstance(uuid, purchaseSource, z, purchaseReason, this.paymentResultEmitterProvider.get(), this.chatsInfoConfigurationRepositoryProvider.get(), this.analyticsOpenSubscriptionScreenUseCaseProvider.get(), this.buyNeuronsProductUiMapperProvider.get(), this.appEventsEmitterProvider.get(), this.exceptionsEmitterProvider.get(), this.billingPurchaseDelegateProvider.get(), this.resourceProvider.get());
    }

    public static C0216BuyNeuronsViewModelFactory_Factory create(Provider<PaymentResultEmitter> provider, Provider<ChatsInfoConfigurationRepository> provider2, Provider<AnalyticsOpenSubscriptionScreenUseCase> provider3, Provider<BuyNeuronsProductUiMapper> provider4, Provider<AppEventsEmitter> provider5, Provider<FlowObserverEmitter<Throwable>> provider6, Provider<BillingPurchaseDelegate.Factory> provider7, Provider<ResourceProvider> provider8) {
        return new C0216BuyNeuronsViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static BuyNeuronsViewModelFactory newInstance(UUID uuid, PurchaseSource purchaseSource, boolean z, PurchaseReason purchaseReason, PaymentResultEmitter paymentResultEmitter, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase, BuyNeuronsProductUiMapper buyNeuronsProductUiMapper, AppEventsEmitter appEventsEmitter, FlowObserverEmitter<Throwable> flowObserverEmitter, BillingPurchaseDelegate.Factory factory, ResourceProvider resourceProvider) {
        return new BuyNeuronsViewModelFactory(uuid, purchaseSource, z, purchaseReason, paymentResultEmitter, chatsInfoConfigurationRepository, analyticsOpenSubscriptionScreenUseCase, buyNeuronsProductUiMapper, appEventsEmitter, flowObserverEmitter, factory, resourceProvider);
    }
}
