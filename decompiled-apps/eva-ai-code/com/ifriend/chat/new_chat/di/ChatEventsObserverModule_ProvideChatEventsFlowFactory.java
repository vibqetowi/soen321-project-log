package com.ifriend.chat.new_chat.di;

import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.features.chat.common.ChatEvents;
import com.ifriend.presentation.features.chat.common.ChatEventsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatEventsObserverModule_ProvideChatEventsFlowFactory implements Factory<FlowObserver<ChatEvents>> {
    private final ChatEventsObserverModule module;
    private final Provider<ChatEventsObserver> observerProvider;

    public ChatEventsObserverModule_ProvideChatEventsFlowFactory(ChatEventsObserverModule chatEventsObserverModule, Provider<ChatEventsObserver> provider) {
        this.module = chatEventsObserverModule;
        this.observerProvider = provider;
    }

    @Override // javax.inject.Provider
    public FlowObserver<ChatEvents> get() {
        return provideChatEventsFlow(this.module, this.observerProvider.get());
    }

    public static ChatEventsObserverModule_ProvideChatEventsFlowFactory create(ChatEventsObserverModule chatEventsObserverModule, Provider<ChatEventsObserver> provider) {
        return new ChatEventsObserverModule_ProvideChatEventsFlowFactory(chatEventsObserverModule, provider);
    }

    public static FlowObserver<ChatEvents> provideChatEventsFlow(ChatEventsObserverModule chatEventsObserverModule, ChatEventsObserver chatEventsObserver) {
        return (FlowObserver) Preconditions.checkNotNullFromProvides(chatEventsObserverModule.provideChatEventsFlow(chatEventsObserver));
    }
}
