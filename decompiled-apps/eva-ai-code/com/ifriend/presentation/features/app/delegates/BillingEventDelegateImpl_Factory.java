package com.ifriend.presentation.features.app.delegates;

import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.chat.domain.billing.ShowRateAppAfterPurchaseUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BillingEventDelegateImpl_Factory implements Factory<BillingEventDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<BillingInteractor> billingInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<ShowRateAppAfterPurchaseUseCase> showRateAppAfterPurchaseUseCaseProvider;
    private final Provider<BillingPurchasesHistory> userProfileRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public BillingEventDelegateImpl_Factory(Provider<UserRepository> provider, Provider<FlowObserverEmitter<Throwable>> provider2, Provider<AppEventsEmitter> provider3, Provider<BillingInteractor> provider4, Provider<ShowRateAppAfterPurchaseUseCase> provider5, Provider<DispatcherProvider> provider6, Provider<BillingPurchasesHistory> provider7, Provider<ChatsInfoInteractor> provider8) {
        this.userRepositoryProvider = provider;
        this.exceptionsEmitterProvider = provider2;
        this.appEventsEmitterProvider = provider3;
        this.billingInteractorProvider = provider4;
        this.showRateAppAfterPurchaseUseCaseProvider = provider5;
        this.dispatcherProvider = provider6;
        this.userProfileRepositoryProvider = provider7;
        this.chatsInfoInteractorProvider = provider8;
    }

    @Override // javax.inject.Provider
    public BillingEventDelegateImpl get() {
        return newInstance(this.userRepositoryProvider.get(), this.exceptionsEmitterProvider.get(), this.appEventsEmitterProvider.get(), this.billingInteractorProvider.get(), this.showRateAppAfterPurchaseUseCaseProvider.get(), this.dispatcherProvider.get(), this.userProfileRepositoryProvider.get(), this.chatsInfoInteractorProvider.get());
    }

    public static BillingEventDelegateImpl_Factory create(Provider<UserRepository> provider, Provider<FlowObserverEmitter<Throwable>> provider2, Provider<AppEventsEmitter> provider3, Provider<BillingInteractor> provider4, Provider<ShowRateAppAfterPurchaseUseCase> provider5, Provider<DispatcherProvider> provider6, Provider<BillingPurchasesHistory> provider7, Provider<ChatsInfoInteractor> provider8) {
        return new BillingEventDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static BillingEventDelegateImpl newInstance(UserRepository userRepository, FlowObserverEmitter<Throwable> flowObserverEmitter, AppEventsEmitter appEventsEmitter, BillingInteractor billingInteractor, ShowRateAppAfterPurchaseUseCase showRateAppAfterPurchaseUseCase, DispatcherProvider dispatcherProvider, BillingPurchasesHistory billingPurchasesHistory, ChatsInfoInteractor chatsInfoInteractor) {
        return new BillingEventDelegateImpl(userRepository, flowObserverEmitter, appEventsEmitter, billingInteractor, showRateAppAfterPurchaseUseCase, dispatcherProvider, billingPurchasesHistory, chatsInfoInteractor);
    }
}
