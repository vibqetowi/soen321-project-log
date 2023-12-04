package com.ifriend.chat.presentation.di.chat;

import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class SendingMessagesModule_Companion_ProvideGlobalSendingMessageResultPublisherFactory implements Factory<GlobalSendingMessageResultPublisher> {
    @Override // javax.inject.Provider
    public GlobalSendingMessageResultPublisher get() {
        return provideGlobalSendingMessageResultPublisher();
    }

    public static SendingMessagesModule_Companion_ProvideGlobalSendingMessageResultPublisherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GlobalSendingMessageResultPublisher provideGlobalSendingMessageResultPublisher() {
        return (GlobalSendingMessageResultPublisher) Preconditions.checkNotNullFromProvides(SendingMessagesModule.Companion.provideGlobalSendingMessageResultPublisher());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final SendingMessagesModule_Companion_ProvideGlobalSendingMessageResultPublisherFactory INSTANCE = new SendingMessagesModule_Companion_ProvideGlobalSendingMessageResultPublisherFactory();

        private InstanceHolder() {
        }
    }
}
