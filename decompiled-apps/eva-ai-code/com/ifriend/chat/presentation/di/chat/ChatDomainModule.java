package com.ifriend.chat.presentation.di.chat;

import com.ifriend.base.di.Feature;
import com.ifriend.chat.new_chat.ChatCoroutineScopeQualifier;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import com.ifriend.domain.newChat.chat.ChatSystemsFactory;
import com.ifriend.domain.newChat.chat.ChatSystemsFactoryImpl;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.QueuedMessageToEntityMapper;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatDomainModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/presentation/di/chat/ChatDomainModule;", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {ChatDataModule.class, ChatSystemsModule.class})
/* loaded from: classes6.dex */
public interface ChatDomainModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ChatDomainModule.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007Jb\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006\u001e"}, d2 = {"Lcom/ifriend/chat/presentation/di/chat/ChatDomainModule$Companion;", "", "()V", "provideChatCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lcom/ifriend/common_utils/Logger;", "provideChatSystemsFactory", "Lcom/ifriend/domain/newChat/chat/ChatSystemsFactory;", "coroutineScope", "subscriptionsBroadcast", "Lcom/ifriend/domain/data/UserSubscriptionsBroadcast;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "queue", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;", "queuedMessageToEntityMapper", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/QueuedMessageToEntityMapper;", "liveMessagesFlow", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;", "publisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "showRateUsUseCase", "Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Feature
        @ChatCoroutineScopeQualifier
        public final CoroutineScope provideChatCoroutineScope(Logger logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new ChatCoroutineScope(logger);
        }

        @Provides
        @Feature
        public final ChatSystemsFactory provideChatSystemsFactory(@ChatCoroutineScopeQualifier CoroutineScope coroutineScope, UserSubscriptionsBroadcast subscriptionsBroadcast, MessagesSource messagesSource, SendingMessagesQueue queue, QueuedMessageToEntityMapper queuedMessageToEntityMapper, LiveChatMessagesFlow liveMessagesFlow, GlobalSendingMessageResultPublisher publisher, ShowRateUsUseCase showRateUsUseCase, InternalNotificationHandler internalNotificationHandler, CoroutineDispatchers dispatchers, ChatMessagesRepository chatMessagesRepository) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(subscriptionsBroadcast, "subscriptionsBroadcast");
            Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intrinsics.checkNotNullParameter(queuedMessageToEntityMapper, "queuedMessageToEntityMapper");
            Intrinsics.checkNotNullParameter(liveMessagesFlow, "liveMessagesFlow");
            Intrinsics.checkNotNullParameter(publisher, "publisher");
            Intrinsics.checkNotNullParameter(showRateUsUseCase, "showRateUsUseCase");
            Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
            Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
            Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
            return new ChatSystemsFactoryImpl(subscriptionsBroadcast, messagesSource, queue, queuedMessageToEntityMapper, liveMessagesFlow, publisher, showRateUsUseCase, internalNotificationHandler, coroutineScope, dispatchers, chatMessagesRepository);
        }
    }
}
