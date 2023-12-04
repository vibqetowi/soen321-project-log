package com.ifriend.presentation.features.chat.regeneration;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.events.ChatEventsInteractor;
import com.ifriend.domain.logic.chat.regenerate.RegenerateChatMessageUseCase;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessageRegenerationDelegateImpl_Factory implements Factory<MessageRegenerationDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<ChatEventsInteractor> chatEventsInteractorProvider;
    private final Provider<DispatcherProvider> dispatchersProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;
    private final Provider<PaymentResultFlow> paymentResultFlowProvider;
    private final Provider<RegenerateChatMessageUseCase> regenerateChatMessageUseCaseProvider;

    public MessageRegenerationDelegateImpl_Factory(Provider<RegenerateChatMessageUseCase> provider, Provider<FlowObserverEmitter<Throwable>> provider2, Provider<AppEventsEmitter> provider3, Provider<PaymentResultFlow> provider4, Provider<DispatcherProvider> provider5, Provider<ChatEventsInteractor> provider6) {
        this.regenerateChatMessageUseCaseProvider = provider;
        this.exceptionsEmitterProvider = provider2;
        this.appEventsEmitterProvider = provider3;
        this.paymentResultFlowProvider = provider4;
        this.dispatchersProvider = provider5;
        this.chatEventsInteractorProvider = provider6;
    }

    @Override // javax.inject.Provider
    public MessageRegenerationDelegateImpl get() {
        return newInstance(this.regenerateChatMessageUseCaseProvider.get(), this.exceptionsEmitterProvider.get(), this.appEventsEmitterProvider.get(), this.paymentResultFlowProvider.get(), this.dispatchersProvider.get(), this.chatEventsInteractorProvider.get());
    }

    public static MessageRegenerationDelegateImpl_Factory create(Provider<RegenerateChatMessageUseCase> provider, Provider<FlowObserverEmitter<Throwable>> provider2, Provider<AppEventsEmitter> provider3, Provider<PaymentResultFlow> provider4, Provider<DispatcherProvider> provider5, Provider<ChatEventsInteractor> provider6) {
        return new MessageRegenerationDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static MessageRegenerationDelegateImpl newInstance(RegenerateChatMessageUseCase regenerateChatMessageUseCase, FlowObserverEmitter<Throwable> flowObserverEmitter, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow, DispatcherProvider dispatcherProvider, ChatEventsInteractor chatEventsInteractor) {
        return new MessageRegenerationDelegateImpl(regenerateChatMessageUseCase, flowObserverEmitter, appEventsEmitter, paymentResultFlow, dispatcherProvider, chatEventsInteractor);
    }
}
