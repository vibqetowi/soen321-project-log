package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppEventsObserverModule_ProvideAppEventsEmitterFactory implements Factory<AppEventsEmitter> {
    private final AppEventsObserverModule module;
    private final Provider<AppEventsObserver> observerProvider;

    public AppEventsObserverModule_ProvideAppEventsEmitterFactory(AppEventsObserverModule appEventsObserverModule, Provider<AppEventsObserver> provider) {
        this.module = appEventsObserverModule;
        this.observerProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppEventsEmitter get() {
        return provideAppEventsEmitter(this.module, this.observerProvider.get());
    }

    public static AppEventsObserverModule_ProvideAppEventsEmitterFactory create(AppEventsObserverModule appEventsObserverModule, Provider<AppEventsObserver> provider) {
        return new AppEventsObserverModule_ProvideAppEventsEmitterFactory(appEventsObserverModule, provider);
    }

    public static AppEventsEmitter provideAppEventsEmitter(AppEventsObserverModule appEventsObserverModule, AppEventsObserver appEventsObserver) {
        return (AppEventsEmitter) Preconditions.checkNotNullFromProvides(appEventsObserverModule.provideAppEventsEmitter(appEventsObserver));
    }
}
