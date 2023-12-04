package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.exceptions.ExceptionsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppExceptionsObserverModule_ProvideExceptionsFlowFactory implements Factory<FlowObserver<Throwable>> {
    private final AppExceptionsObserverModule module;
    private final Provider<ExceptionsObserver> observerProvider;

    public AppExceptionsObserverModule_ProvideExceptionsFlowFactory(AppExceptionsObserverModule appExceptionsObserverModule, Provider<ExceptionsObserver> provider) {
        this.module = appExceptionsObserverModule;
        this.observerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FlowObserver<Throwable> get() {
        return provideExceptionsFlow(this.module, this.observerProvider.get());
    }

    public static AppExceptionsObserverModule_ProvideExceptionsFlowFactory create(AppExceptionsObserverModule appExceptionsObserverModule, Provider<ExceptionsObserver> provider) {
        return new AppExceptionsObserverModule_ProvideExceptionsFlowFactory(appExceptionsObserverModule, provider);
    }

    public static FlowObserver<Throwable> provideExceptionsFlow(AppExceptionsObserverModule appExceptionsObserverModule, ExceptionsObserver exceptionsObserver) {
        return (FlowObserver) Preconditions.checkNotNullFromProvides(appExceptionsObserverModule.provideExceptionsFlow(exceptionsObserver));
    }
}
