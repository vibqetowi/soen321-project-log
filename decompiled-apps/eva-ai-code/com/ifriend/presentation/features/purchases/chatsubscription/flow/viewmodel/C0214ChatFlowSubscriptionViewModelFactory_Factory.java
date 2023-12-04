package com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel;

import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import javax.inject.Provider;
/* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModelFactory_Factory  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0214ChatFlowSubscriptionViewModelFactory_Factory {
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;

    public C0214ChatFlowSubscriptionViewModelFactory_Factory(Provider<ChatsInfoInteractor> provider, Provider<FlowObserverEmitter<Throwable>> provider2, Provider<ChatsConfigurationInteractor> provider3) {
        this.chatsInfoInteractorProvider = provider;
        this.exceptionsEmitterProvider = provider2;
        this.chatsConfigurationInteractorProvider = provider3;
    }

    public ChatFlowSubscriptionViewModelFactory get(String str) {
        return newInstance(str, this.chatsInfoInteractorProvider.get(), this.exceptionsEmitterProvider.get(), this.chatsConfigurationInteractorProvider.get());
    }

    public static C0214ChatFlowSubscriptionViewModelFactory_Factory create(Provider<ChatsInfoInteractor> provider, Provider<FlowObserverEmitter<Throwable>> provider2, Provider<ChatsConfigurationInteractor> provider3) {
        return new C0214ChatFlowSubscriptionViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static ChatFlowSubscriptionViewModelFactory newInstance(String str, ChatsInfoInteractor chatsInfoInteractor, FlowObserverEmitter<Throwable> flowObserverEmitter, ChatsConfigurationInteractor chatsConfigurationInteractor) {
        return new ChatFlowSubscriptionViewModelFactory(str, chatsInfoInteractor, flowObserverEmitter, chatsConfigurationInteractor);
    }
}
