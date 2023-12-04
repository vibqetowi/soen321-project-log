package com.ifriend.presentation.di;

import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppEventsObserverModule_ProvideAppEventsFlowFactory implements Factory<FlowObserver<AppEvents>> {
    private final AppEventsObserverModule module;
    private final Provider<AppEventsObserver> observerProvider;

    public AppEventsObserverModule_ProvideAppEventsFlowFactory(AppEventsObserverModule appEventsObserverModule, Provider<AppEventsObserver> provider) {
        this.module = appEventsObserverModule;
        this.observerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FlowObserver<AppEvents> get() {
        return provideAppEventsFlow(this.module, this.observerProvider.get());
    }

    public static AppEventsObserverModule_ProvideAppEventsFlowFactory create(AppEventsObserverModule appEventsObserverModule, Provider<AppEventsObserver> provider) {
        return new AppEventsObserverModule_ProvideAppEventsFlowFactory(appEventsObserverModule, provider);
    }

    public static FlowObserver<AppEvents> provideAppEventsFlow(AppEventsObserverModule appEventsObserverModule, AppEventsObserver appEventsObserver) {
        return (FlowObserver) Preconditions.checkNotNullFromProvides(appEventsObserverModule.provideAppEventsFlow(appEventsObserver));
    }
}
