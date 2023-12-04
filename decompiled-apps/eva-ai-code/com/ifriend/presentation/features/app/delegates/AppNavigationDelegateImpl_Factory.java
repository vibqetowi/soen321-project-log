package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppNavigationDelegateImpl_Factory implements Factory<AppNavigationDelegateImpl> {
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;

    public AppNavigationDelegateImpl_Factory(Provider<FlowObserverEmitter<Throwable>> provider, Provider<ChatsInfoInteractor> provider2) {
        this.exceptionsEmitterProvider = provider;
        this.chatsInfoInteractorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AppNavigationDelegateImpl get() {
        return newInstance(this.exceptionsEmitterProvider.get(), this.chatsInfoInteractorProvider.get());
    }

    public static AppNavigationDelegateImpl_Factory create(Provider<FlowObserverEmitter<Throwable>> provider, Provider<ChatsInfoInteractor> provider2) {
        return new AppNavigationDelegateImpl_Factory(provider, provider2);
    }

    public static AppNavigationDelegateImpl newInstance(FlowObserverEmitter<Throwable> flowObserverEmitter, ChatsInfoInteractor chatsInfoInteractor) {
        return new AppNavigationDelegateImpl(flowObserverEmitter, chatsInfoInteractor);
    }
}
