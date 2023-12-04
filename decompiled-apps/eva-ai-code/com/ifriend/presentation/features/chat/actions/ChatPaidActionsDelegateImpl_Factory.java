package com.ifriend.presentation.features.chat.actions;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.subscription.ChatSubscriptionInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatPaidActionsDelegateImpl_Factory implements Factory<ChatPaidActionsDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatSubscriptionInteractor> chatSubscriptionInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;

    public ChatPaidActionsDelegateImpl_Factory(Provider<ChatsInfoInteractor> provider, Provider<DispatcherProvider> provider2, Provider<FlowObserverEmitter<Throwable>> provider3, Provider<ChatSubscriptionInteractor> provider4, Provider<AppEventsEmitter> provider5) {
        this.chatsInfoInteractorProvider = provider;
        this.dispatcherProvider = provider2;
        this.exceptionsEmitterProvider = provider3;
        this.chatSubscriptionInteractorProvider = provider4;
        this.appEventsEmitterProvider = provider5;
    }

    @Override // javax.inject.Provider
    public ChatPaidActionsDelegateImpl get() {
        return newInstance(this.chatsInfoInteractorProvider.get(), this.dispatcherProvider.get(), this.exceptionsEmitterProvider.get(), this.chatSubscriptionInteractorProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static ChatPaidActionsDelegateImpl_Factory create(Provider<ChatsInfoInteractor> provider, Provider<DispatcherProvider> provider2, Provider<FlowObserverEmitter<Throwable>> provider3, Provider<ChatSubscriptionInteractor> provider4, Provider<AppEventsEmitter> provider5) {
        return new ChatPaidActionsDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChatPaidActionsDelegateImpl newInstance(ChatsInfoInteractor chatsInfoInteractor, DispatcherProvider dispatcherProvider, FlowObserverEmitter<Throwable> flowObserverEmitter, ChatSubscriptionInteractor chatSubscriptionInteractor, AppEventsEmitter appEventsEmitter) {
        return new ChatPaidActionsDelegateImpl(chatsInfoInteractor, dispatcherProvider, flowObserverEmitter, chatSubscriptionInteractor, appEventsEmitter);
    }
}
