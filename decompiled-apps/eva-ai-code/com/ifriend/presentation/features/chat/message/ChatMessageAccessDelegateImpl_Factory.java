package com.ifriend.presentation.features.chat.message;

import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.messages.ChatMessageAccessInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageAccessDelegateImpl_Factory {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatMessageAccessInteractor> chatMessageAccessInteractorProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<PaymentResultFlow> paymentResultFlowProvider;

    public ChatMessageAccessDelegateImpl_Factory(Provider<FlowObserverEmitter<Throwable>> provider, Provider<ChatClientInteractor> provider2, Provider<ChatMessageAccessInteractor> provider3, Provider<PaymentResultFlow> provider4, Provider<AppEventsEmitter> provider5) {
        this.exceptionsEmitterProvider = provider;
        this.chatClientInteractorProvider = provider2;
        this.chatMessageAccessInteractorProvider = provider3;
        this.paymentResultFlowProvider = provider4;
        this.appEventsEmitterProvider = provider5;
    }

    public ChatMessageAccessDelegateImpl get(String str) {
        return newInstance(str, this.exceptionsEmitterProvider.get(), this.chatClientInteractorProvider.get(), this.chatMessageAccessInteractorProvider.get(), this.paymentResultFlowProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static ChatMessageAccessDelegateImpl_Factory create(Provider<FlowObserverEmitter<Throwable>> provider, Provider<ChatClientInteractor> provider2, Provider<ChatMessageAccessInteractor> provider3, Provider<PaymentResultFlow> provider4, Provider<AppEventsEmitter> provider5) {
        return new ChatMessageAccessDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static ChatMessageAccessDelegateImpl newInstance(String str, FlowObserverEmitter<Throwable> flowObserverEmitter, ChatClientInteractor chatClientInteractor, ChatMessageAccessInteractor chatMessageAccessInteractor, PaymentResultFlow paymentResultFlow, AppEventsEmitter appEventsEmitter) {
        return new ChatMessageAccessDelegateImpl(str, flowObserverEmitter, chatClientInteractor, chatMessageAccessInteractor, paymentResultFlow, appEventsEmitter);
    }
}
