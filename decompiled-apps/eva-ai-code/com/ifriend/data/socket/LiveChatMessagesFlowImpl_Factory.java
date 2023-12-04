package com.ifriend.data.socket;

import com.ifriend.domain.socket.MessagesSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LiveChatMessagesFlowImpl_Factory implements Factory<LiveChatMessagesFlowImpl> {
    private final Provider<MessagesSource> messagesSourceProvider;

    public LiveChatMessagesFlowImpl_Factory(Provider<MessagesSource> provider) {
        this.messagesSourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public LiveChatMessagesFlowImpl get() {
        return newInstance(this.messagesSourceProvider.get());
    }

    public static LiveChatMessagesFlowImpl_Factory create(Provider<MessagesSource> provider) {
        return new LiveChatMessagesFlowImpl_Factory(provider);
    }

    public static LiveChatMessagesFlowImpl newInstance(MessagesSource messagesSource) {
        return new LiveChatMessagesFlowImpl(messagesSource);
    }
}
