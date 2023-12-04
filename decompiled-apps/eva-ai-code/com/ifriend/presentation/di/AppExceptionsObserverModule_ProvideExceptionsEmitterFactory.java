package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.exceptions.ExceptionsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppExceptionsObserverModule_ProvideExceptionsEmitterFactory implements Factory<FlowObserverEmitter<Throwable>> {
    private final AppExceptionsObserverModule module;
    private final Provider<ExceptionsObserver> observerProvider;

    public AppExceptionsObserverModule_ProvideExceptionsEmitterFactory(AppExceptionsObserverModule appExceptionsObserverModule, Provider<ExceptionsObserver> provider) {
        this.module = appExceptionsObserverModule;
        this.observerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FlowObserverEmitter<Throwable> get() {
        return provideExceptionsEmitter(this.module, this.observerProvider.get());
    }

    public static AppExceptionsObserverModule_ProvideExceptionsEmitterFactory create(AppExceptionsObserverModule appExceptionsObserverModule, Provider<ExceptionsObserver> provider) {
        return new AppExceptionsObserverModule_ProvideExceptionsEmitterFactory(appExceptionsObserverModule, provider);
    }

    public static FlowObserverEmitter<Throwable> provideExceptionsEmitter(AppExceptionsObserverModule appExceptionsObserverModule, ExceptionsObserver exceptionsObserver) {
        return (FlowObserverEmitter) Preconditions.checkNotNullFromProvides(appExceptionsObserverModule.provideExceptionsEmitter(exceptionsObserver));
    }
}
