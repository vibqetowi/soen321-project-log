package com.ifriend.chat.new_chat.di;

import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.common.ChatEventsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatEventsObserverModule_ProvideChatEventsEmitterFactory implements Factory<FlowObserverEmitter<ChatEvents>> {
    private final ChatEventsObserverModule module;
    private final Provider<ChatEventsObserver> observerProvider;

    public ChatEventsObserverModule_ProvideChatEventsEmitterFactory(ChatEventsObserverModule chatEventsObserverModule, Provider<ChatEventsObserver> provider) {
        this.module = chatEventsObserverModule;
        this.observerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FlowObserverEmitter<ChatEvents> get() {
        return provideChatEventsEmitter(this.module, this.observerProvider.get());
    }

    public static ChatEventsObserverModule_ProvideChatEventsEmitterFactory create(ChatEventsObserverModule chatEventsObserverModule, Provider<ChatEventsObserver> provider) {
        return new ChatEventsObserverModule_ProvideChatEventsEmitterFactory(chatEventsObserverModule, provider);
    }

    public static FlowObserverEmitter<ChatEvents> provideChatEventsEmitter(ChatEventsObserverModule chatEventsObserverModule, ChatEventsObserver chatEventsObserver) {
        return (FlowObserverEmitter) Preconditions.checkNotNullFromProvides(chatEventsObserverModule.provideChatEventsEmitter(chatEventsObserver));
    }
}
