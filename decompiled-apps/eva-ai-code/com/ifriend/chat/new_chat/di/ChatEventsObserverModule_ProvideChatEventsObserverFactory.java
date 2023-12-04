package com.ifriend.chat.new_chat.di;

import com.ifriend.presentation.features.chat.common.ChatEventsObserver;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class ChatEventsObserverModule_ProvideChatEventsObserverFactory implements Factory<ChatEventsObserver> {
    private final ChatEventsObserverModule module;

    public ChatEventsObserverModule_ProvideChatEventsObserverFactory(ChatEventsObserverModule chatEventsObserverModule) {
        this.module = chatEventsObserverModule;
    }

    @Override // javax.inject.Provider
    public ChatEventsObserver get() {
        return provideChatEventsObserver(this.module);
    }

    public static ChatEventsObserverModule_ProvideChatEventsObserverFactory create(ChatEventsObserverModule chatEventsObserverModule) {
        return new ChatEventsObserverModule_ProvideChatEventsObserverFactory(chatEventsObserverModule);
    }

    public static ChatEventsObserver provideChatEventsObserver(ChatEventsObserverModule chatEventsObserverModule) {
        return (ChatEventsObserver) Preconditions.checkNotNullFromProvides(chatEventsObserverModule.provideChatEventsObserver());
    }
}
