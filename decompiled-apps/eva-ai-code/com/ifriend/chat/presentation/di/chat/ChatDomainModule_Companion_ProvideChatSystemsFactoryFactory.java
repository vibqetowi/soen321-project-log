package com.ifriend.chat.presentation.di.chat;

import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import com.ifriend.domain.newChat.chat.ChatSystemsFactory;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.QueuedMessageToEntityMapper;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ChatDomainModule_Companion_ProvideChatSystemsFactoryFactory implements Factory<ChatSystemsFactory> {
    private final Provider<ChatMessagesRepository> chatMessagesRepositoryProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<LiveChatMessagesFlow> liveMessagesFlowProvider;
    private final Provider<MessagesSource> messagesSourceProvider;
    private final Provider<GlobalSendingMessageResultPublisher> publisherProvider;
    private final Provider<SendingMessagesQueue> queueProvider;
    private final Provider<QueuedMessageToEntityMapper> queuedMessageToEntityMapperProvider;
    private final Provider<ShowRateUsUseCase> showRateUsUseCaseProvider;
    private final Provider<UserSubscriptionsBroadcast> subscriptionsBroadcastProvider;

    public ChatDomainModule_Companion_ProvideChatSystemsFactoryFactory(Provider<CoroutineScope> provider, Provider<UserSubscriptionsBroadcast> provider2, Provider<MessagesSource> provider3, Provider<SendingMessagesQueue> provider4, Provider<QueuedMessageToEntityMapper> provider5, Provider<LiveChatMessagesFlow> provider6, Provider<GlobalSendingMessageResultPublisher> provider7, Provider<ShowRateUsUseCase> provider8, Provider<InternalNotificationHandler> provider9, Provider<CoroutineDispatchers> provider10, Provider<ChatMessagesRepository> provider11) {
        this.coroutineScopeProvider = provider;
        this.subscriptionsBroadcastProvider = provider2;
        this.messagesSourceProvider = provider3;
        this.queueProvider = provider4;
        this.queuedMessageToEntityMapperProvider = provider5;
        this.liveMessagesFlowProvider = provider6;
        this.publisherProvider = provider7;
        this.showRateUsUseCaseProvider = provider8;
        this.internalNotificationHandlerProvider = provider9;
        this.dispatchersProvider = provider10;
        this.chatMessagesRepositoryProvider = provider11;
    }

    @Override // javax.inject.Provider
    public ChatSystemsFactory get() {
        return provideChatSystemsFactory(this.coroutineScopeProvider.get(), this.subscriptionsBroadcastProvider.get(), this.messagesSourceProvider.get(), this.queueProvider.get(), this.queuedMessageToEntityMapperProvider.get(), this.liveMessagesFlowProvider.get(), this.publisherProvider.get(), this.showRateUsUseCaseProvider.get(), this.internalNotificationHandlerProvider.get(), this.dispatchersProvider.get(), this.chatMessagesRepositoryProvider.get());
    }

    public static ChatDomainModule_Companion_ProvideChatSystemsFactoryFactory create(Provider<CoroutineScope> provider, Provider<UserSubscriptionsBroadcast> provider2, Provider<MessagesSource> provider3, Provider<SendingMessagesQueue> provider4, Provider<QueuedMessageToEntityMapper> provider5, Provider<LiveChatMessagesFlow> provider6, Provider<GlobalSendingMessageResultPublisher> provider7, Provider<ShowRateUsUseCase> provider8, Provider<InternalNotificationHandler> provider9, Provider<CoroutineDispatchers> provider10, Provider<ChatMessagesRepository> provider11) {
        return new ChatDomainModule_Companion_ProvideChatSystemsFactoryFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static ChatSystemsFactory provideChatSystemsFactory(CoroutineScope coroutineScope, UserSubscriptionsBroadcast userSubscriptionsBroadcast, MessagesSource messagesSource, SendingMessagesQueue sendingMessagesQueue, QueuedMessageToEntityMapper queuedMessageToEntityMapper, LiveChatMessagesFlow liveChatMessagesFlow, GlobalSendingMessageResultPublisher globalSendingMessageResultPublisher, ShowRateUsUseCase showRateUsUseCase, InternalNotificationHandler internalNotificationHandler, CoroutineDispatchers coroutineDispatchers, ChatMessagesRepository chatMessagesRepository) {
        return (ChatSystemsFactory) Preconditions.checkNotNullFromProvides(ChatDomainModule.Companion.provideChatSystemsFactory(coroutineScope, userSubscriptionsBroadcast, messagesSource, sendingMessagesQueue, queuedMessageToEntityMapper, liveChatMessagesFlow, globalSendingMessageResultPublisher, showRateUsUseCase, internalNotificationHandler, coroutineDispatchers, chatMessagesRepository));
    }
}
