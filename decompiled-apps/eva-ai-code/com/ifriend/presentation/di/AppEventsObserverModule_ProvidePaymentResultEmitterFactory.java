package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppEventsObserverModule_ProvidePaymentResultEmitterFactory implements Factory<PaymentResultEmitter> {
    private final AppEventsObserverModule module;
    private final Provider<PaymentResultObserver> observerProvider;

    public AppEventsObserverModule_ProvidePaymentResultEmitterFactory(AppEventsObserverModule appEventsObserverModule, Provider<PaymentResultObserver> provider) {
        this.module = appEventsObserverModule;
        this.observerProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentResultEmitter get() {
        return providePaymentResultEmitter(this.module, this.observerProvider.get());
    }

    public static AppEventsObserverModule_ProvidePaymentResultEmitterFactory create(AppEventsObserverModule appEventsObserverModule, Provider<PaymentResultObserver> provider) {
        return new AppEventsObserverModule_ProvidePaymentResultEmitterFactory(appEventsObserverModule, provider);
    }

    public static PaymentResultEmitter providePaymentResultEmitter(AppEventsObserverModule appEventsObserverModule, PaymentResultObserver paymentResultObserver) {
        return (PaymentResultEmitter) Preconditions.checkNotNullFromProvides(appEventsObserverModule.providePaymentResultEmitter(paymentResultObserver));
    }
}
