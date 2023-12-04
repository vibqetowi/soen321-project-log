package com.ifriend.domain.logic.chat.events;

import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatEventsInteractor_Factory implements Factory<ChatEventsInteractor> {
    private final Provider<MessagesSource> messagesSourceProvider;

    public ChatEventsInteractor_Factory(Provider<MessagesSource> provider) {
        this.messagesSourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatEventsInteractor get() {
        return newInstance(this.messagesSourceProvider.get());
    }

    public static ChatEventsInteractor_Factory create(Provider<MessagesSource> provider) {
        return new ChatEventsInteractor_Factory(provider);
    }

    public static ChatEventsInteractor newInstance(MessagesSource messagesSource) {
        return new ChatEventsInteractor(messagesSource);
    }
}
