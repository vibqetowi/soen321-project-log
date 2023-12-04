package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.exceptions.ExceptionsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class AppExceptionsObserverModule_ProvideExceptionsObserverFactory implements Factory<ExceptionsObserver> {
    private final AppExceptionsObserverModule module;

    public AppExceptionsObserverModule_ProvideExceptionsObserverFactory(AppExceptionsObserverModule appExceptionsObserverModule) {
        this.module = appExceptionsObserverModule;
    }

    @Override // javax.inject.Provider
    public ExceptionsObserver get() {
        return provideExceptionsObserver(this.module);
    }

    public static AppExceptionsObserverModule_ProvideExceptionsObserverFactory create(AppExceptionsObserverModule appExceptionsObserverModule) {
        return new AppExceptionsObserverModule_ProvideExceptionsObserverFactory(appExceptionsObserverModule);
    }

    public static ExceptionsObserver provideExceptionsObserver(AppExceptionsObserverModule appExceptionsObserverModule) {
        return (ExceptionsObserver) Preconditions.checkNotNullFromProvides(appExceptionsObserverModule.provideExceptionsObserver());
    }
}
