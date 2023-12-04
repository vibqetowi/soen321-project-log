package com.ifriend.chat.data.chat.sending.queue;

import com.ifriend.domain.data.DoubleSuspendMapper;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class SendingMessagesQueueImpl_Factory implements Factory<SendingMessagesQueueImpl> {
    private final Provider<DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage>> toQueuedMessageMapperProvider;

    public SendingMessagesQueueImpl_Factory(Provider<DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage>> provider) {
        this.toQueuedMessageMapperProvider = provider;
    }

    @Override // javax.inject.Provider
    public SendingMessagesQueueImpl get() {
        return newInstance(this.toQueuedMessageMapperProvider.get());
    }

    public static SendingMessagesQueueImpl_Factory create(Provider<DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage>> provider) {
        return new SendingMessagesQueueImpl_Factory(provider);
    }

    public static SendingMessagesQueueImpl newInstance(DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage> doubleSuspendMapper) {
        return new SendingMessagesQueueImpl(doubleSuspendMapper);
    }
}
