package com.ifriend.chat.presentation.di.chat;

import com.ifriend.base.di.Feature;
import com.ifriend.chat.data.chat.sending.ChatMessagesRepositoryImpl;
import com.ifriend.chat.data.chat.sending.queue.MessageToSendToQueuedMessageMapper;
import com.ifriend.chat.data.chat.sending.queue.SendingMessagesQueueImpl;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.DoubleSuspendMapper;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.QueuedMessageToEntityMapper;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisherImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SendingMessagesModule.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/di/chat/SendingMessagesModule;", "", "bindsMessageSender", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "sender", "Lcom/ifriend/chat/data/chat/sending/ChatMessagesRepositoryImpl;", "bindsMessageToSendToQueuedMessageMapper", "Lcom/ifriend/domain/data/DoubleSuspendMapper;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "mapper", "Lcom/ifriend/chat/data/chat/sending/queue/MessageToSendToQueuedMessageMapper;", "bindsSendingMessagesQueue", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;", "queue", "Lcom/ifriend/chat/data/chat/sending/queue/SendingMessagesQueueImpl;", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface SendingMessagesModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Feature
    @Binds
    ChatMessagesRepository bindsMessageSender(ChatMessagesRepositoryImpl chatMessagesRepositoryImpl);

    @Feature
    @Binds
    DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage> bindsMessageToSendToQueuedMessageMapper(MessageToSendToQueuedMessageMapper messageToSendToQueuedMessageMapper);

    @Feature
    @Binds
    SendingMessagesQueue bindsSendingMessagesQueue(SendingMessagesQueueImpl sendingMessagesQueueImpl);

    /* compiled from: SendingMessagesModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/di/chat/SendingMessagesModule$Companion;", "", "()V", "provideGlobalSendingMessageResultPublisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "provideQueuedMessageToEntityMapper", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/QueuedMessageToEntityMapper;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Feature
        public final GlobalSendingMessageResultPublisher provideGlobalSendingMessageResultPublisher() {
            return new GlobalSendingMessageResultPublisherImpl();
        }

        @Provides
        @Feature
        public final QueuedMessageToEntityMapper provideQueuedMessageToEntityMapper(AuthDataProvider authDataProvider) {
            Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
            return new QueuedMessageToEntityMapper(authDataProvider);
        }
    }
}
