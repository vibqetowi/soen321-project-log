package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.appevents.AppEventsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AppEventsObserverModule_ProvideAppEventsObserverFactory implements Factory<AppEventsObserver> {
    private final AppEventsObserverModule module;
    private final Provider<CoroutineScope> scopeProvider;

    public AppEventsObserverModule_ProvideAppEventsObserverFactory(AppEventsObserverModule appEventsObserverModule, Provider<CoroutineScope> provider) {
        this.module = appEventsObserverModule;
        this.scopeProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppEventsObserver get() {
        return provideAppEventsObserver(this.module, this.scopeProvider.get());
    }

    public static AppEventsObserverModule_ProvideAppEventsObserverFactory create(AppEventsObserverModule appEventsObserverModule, Provider<CoroutineScope> provider) {
        return new AppEventsObserverModule_ProvideAppEventsObserverFactory(appEventsObserverModule, provider);
    }

    public static AppEventsObserver provideAppEventsObserver(AppEventsObserverModule appEventsObserverModule, CoroutineScope coroutineScope) {
        return (AppEventsObserver) Preconditions.checkNotNullFromProvides(appEventsObserverModule.provideAppEventsObserver(coroutineScope));
    }
}
