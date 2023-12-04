package com.ifriend.presentation.features.chat.message;

import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.message.ChatMessageAccessDelegate;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageDelegateImpl_Factory {
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatMessageAccessDelegate.Factory> chatMessageAccessDelegateProvider;
    private final Provider<FlowObserverEmitter<Throwable>> exceptionsEmitterProvider;

    public ChatMessageDelegateImpl_Factory(Provider<ChatMessageAccessDelegate.Factory> provider, Provider<ChatClientInteractor> provider2, Provider<FlowObserverEmitter<Throwable>> provider3) {
        this.chatMessageAccessDelegateProvider = provider;
        this.chatClientInteractorProvider = provider2;
        this.exceptionsEmitterProvider = provider3;
    }

    public ChatMessageDelegateImpl get(String str) {
        return newInstance(str, this.chatMessageAccessDelegateProvider.get(), this.chatClientInteractorProvider.get(), this.exceptionsEmitterProvider.get());
    }

    public static ChatMessageDelegateImpl_Factory create(Provider<ChatMessageAccessDelegate.Factory> provider, Provider<ChatClientInteractor> provider2, Provider<FlowObserverEmitter<Throwable>> provider3) {
        return new ChatMessageDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static ChatMessageDelegateImpl newInstance(String str, ChatMessageAccessDelegate.Factory factory, ChatClientInteractor chatClientInteractor, FlowObserverEmitter<Throwable> flowObserverEmitter) {
        return new ChatMessageDelegateImpl(str, factory, chatClientInteractor, flowObserverEmitter);
    }
}
