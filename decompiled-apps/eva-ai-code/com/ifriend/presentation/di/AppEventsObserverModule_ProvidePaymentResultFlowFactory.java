package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.common.observers.purchases.PaymentResultObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppEventsObserverModule_ProvidePaymentResultFlowFactory implements Factory<PaymentResultFlow> {
    private final AppEventsObserverModule module;
    private final Provider<PaymentResultObserver> observerProvider;

    public AppEventsObserverModule_ProvidePaymentResultFlowFactory(AppEventsObserverModule appEventsObserverModule, Provider<PaymentResultObserver> provider) {
        this.module = appEventsObserverModule;
        this.observerProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentResultFlow get() {
        return providePaymentResultFlow(this.module, this.observerProvider.get());
    }

    public static AppEventsObserverModule_ProvidePaymentResultFlowFactory create(AppEventsObserverModule appEventsObserverModule, Provider<PaymentResultObserver> provider) {
        return new AppEventsObserverModule_ProvidePaymentResultFlowFactory(appEventsObserverModule, provider);
    }

    public static PaymentResultFlow providePaymentResultFlow(AppEventsObserverModule appEventsObserverModule, PaymentResultObserver paymentResultObserver) {
        return (PaymentResultFlow) Preconditions.checkNotNullFromProvides(appEventsObserverModule.providePaymentResultFlow(paymentResultObserver));
    }
}
