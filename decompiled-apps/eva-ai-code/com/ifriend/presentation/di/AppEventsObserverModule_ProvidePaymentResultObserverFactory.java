package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.purchases.PaymentResultObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AppEventsObserverModule_ProvidePaymentResultObserverFactory implements Factory<PaymentResultObserver> {
    private final AppEventsObserverModule module;
    private final Provider<CoroutineScope> scopeProvider;

    public AppEventsObserverModule_ProvidePaymentResultObserverFactory(AppEventsObserverModule appEventsObserverModule, Provider<CoroutineScope> provider) {
        this.module = appEventsObserverModule;
        this.scopeProvider = provider;
    }

    @Override // javax.inject.Provider
    public PaymentResultObserver get() {
        return providePaymentResultObserver(this.module, this.scopeProvider.get());
    }

    public static AppEventsObserverModule_ProvidePaymentResultObserverFactory create(AppEventsObserverModule appEventsObserverModule, Provider<CoroutineScope> provider) {
        return new AppEventsObserverModule_ProvidePaymentResultObserverFactory(appEventsObserverModule, provider);
    }

    public static PaymentResultObserver providePaymentResultObserver(AppEventsObserverModule appEventsObserverModule, CoroutineScope coroutineScope) {
        return (PaymentResultObserver) Preconditions.checkNotNullFromProvides(appEventsObserverModule.providePaymentResultObserver(coroutineScope));
    }
}
