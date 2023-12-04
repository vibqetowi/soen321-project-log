package com.ifriend.domain.newChat.chat;

import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import com.ifriend.domain.newChat.chat.systems.appRate.RateAppChatSystem;
import com.ifriend.domain.newChat.chat.systems.consuming.ConsumingComponentsSystem;
import com.ifriend.domain.newChat.chat.systems.distinct.DistinctSystem;
import com.ifriend.domain.newChat.chat.systems.errorsHandling.SendingErrorsHandlingSystem;
import com.ifriend.domain.newChat.chat.systems.events.processing.BotProcessingSystem;
import com.ifriend.domain.newChat.chat.systems.firstChat.RequestBotSendFirstMessageSystem;
import com.ifriend.domain.newChat.chat.systems.messages.buy.ChatPaidMessageSystem;
import com.ifriend.domain.newChat.chat.systems.messages.history.initialLoading.InitialMessagesLoadingSystem;
import com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreSystem;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.reading.ReadingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.regeneration.MessageRegenerationSystem;
import com.ifriend.domain.newChat.chat.systems.messages.remove.ChatRemoveMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.removeUnsuccessfulSent.RemoveUnsuccessfulSentMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.QueuedMessageToEntityMapper;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.newChat.chat.systems.messages.sending.showSending.ShowSendingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.topics.TopicsSystem;
import com.ifriend.domain.newChat.chat.systems.messages.update.ChatUpdateMessageSystem;
import com.ifriend.domain.newChat.chat.systems.resetAfterUpgrade.ResetAfterUpgradeSystem;
import com.ifriend.domain.newChat.chat.systems.sorting.SortingSystem;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.domain.socket.MessagesSource;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatSystemsFactoryImpl.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010'\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010)\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u0002002\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u00101\u001a\u0002022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010=\u001a\u00020>2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020BH\u0016R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/ifriend/domain/newChat/chat/ChatSystemsFactoryImpl;", "Lcom/ifriend/domain/newChat/chat/ChatSystemsFactory;", "subscriptionsBroadcast", "Lcom/ifriend/domain/data/UserSubscriptionsBroadcast;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "queue", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;", "queuedMessageToEntityMapper", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/QueuedMessageToEntityMapper;", "liveMessagesFlow", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;", "publisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "showRateUsUseCase", "Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;", "internalNotificationHandler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "(Lcom/ifriend/domain/data/UserSubscriptionsBroadcast;Lcom/ifriend/domain/socket/MessagesSource;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/QueuedMessageToEntityMapper;Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;)V", "createBotProcessingSystem", "Lcom/ifriend/domain/newChat/chat/systems/events/processing/BotProcessingSystem;", "chatId", "", "createChatPaidMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/buy/ChatPaidMessageSystem;", "createChatUpdateMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/update/ChatUpdateMessageSystem;", "createConsumingComponentsSystem", "Lcom/ifriend/domain/newChat/chat/systems/consuming/ConsumingComponentsSystem;", "createDistinctSystem", "Lcom/ifriend/domain/newChat/chat/systems/distinct/DistinctSystem;", "createInitialMessagesLoadingSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/history/initialLoading/InitialMessagesLoadingSystem;", "createLiveMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveMessagesSystem;", "createLoadMoreSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/history/loadMore/LoadMoreSystem;", "createMessageRegenerationSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/regeneration/MessageRegenerationSystem;", "createRateAppChatSystem", "Lcom/ifriend/domain/newChat/chat/systems/appRate/RateAppChatSystem;", "createReadingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/reading/ReadingMessagesSystem;", "createRemoveMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/remove/ChatRemoveMessagesSystem;", "createRemoveUnsuccessfulSentMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/removeUnsuccessfulSent/RemoveUnsuccessfulSentMessagesSystem;", "createRequestBotSendFirstMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/firstChat/RequestBotSendFirstMessageSystem;", "createResetAfterUpgradeSystem", "Lcom/ifriend/domain/newChat/chat/systems/resetAfterUpgrade/ResetAfterUpgradeSystem;", "createSendingErrorsHandlingSystem", "Lcom/ifriend/domain/newChat/chat/systems/errorsHandling/SendingErrorsHandlingSystem;", "createSendingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesSystem;", "createShowSendingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/showSending/ShowSendingMessagesSystem;", "createSortingSystem", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortingSystem;", "createTopicsSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/topics/TopicsSystem;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSystemsFactoryImpl implements ChatSystemsFactory {
    private final ChatMessagesRepository chatMessagesRepository;
    private final CoroutineDispatchers dispatchers;
    private final InternalNotificationHandler internalNotificationHandler;
    private final LiveChatMessagesFlow liveMessagesFlow;
    private final MessagesSource messagesSource;
    private final GlobalSendingMessageResultPublisher publisher;
    private final SendingMessagesQueue queue;
    private final QueuedMessageToEntityMapper queuedMessageToEntityMapper;
    private final CoroutineScope scope;
    private final ShowRateUsUseCase showRateUsUseCase;
    private final UserSubscriptionsBroadcast subscriptionsBroadcast;

    public ChatSystemsFactoryImpl(UserSubscriptionsBroadcast subscriptionsBroadcast, MessagesSource messagesSource, SendingMessagesQueue queue, QueuedMessageToEntityMapper queuedMessageToEntityMapper, LiveChatMessagesFlow liveMessagesFlow, GlobalSendingMessageResultPublisher publisher, ShowRateUsUseCase showRateUsUseCase, InternalNotificationHandler internalNotificationHandler, CoroutineScope scope, CoroutineDispatchers dispatchers, ChatMessagesRepository chatMessagesRepository) {
        Intrinsics.checkNotNullParameter(subscriptionsBroadcast, "subscriptionsBroadcast");
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(queuedMessageToEntityMapper, "queuedMessageToEntityMapper");
        Intrinsics.checkNotNullParameter(liveMessagesFlow, "liveMessagesFlow");
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        Intrinsics.checkNotNullParameter(showRateUsUseCase, "showRateUsUseCase");
        Intrinsics.checkNotNullParameter(internalNotificationHandler, "internalNotificationHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
        this.subscriptionsBroadcast = subscriptionsBroadcast;
        this.messagesSource = messagesSource;
        this.queue = queue;
        this.queuedMessageToEntityMapper = queuedMessageToEntityMapper;
        this.liveMessagesFlow = liveMessagesFlow;
        this.publisher = publisher;
        this.showRateUsUseCase = showRateUsUseCase;
        this.internalNotificationHandler = internalNotificationHandler;
        this.scope = scope;
        this.dispatchers = dispatchers;
        this.chatMessagesRepository = chatMessagesRepository;
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public ResetAfterUpgradeSystem createResetAfterUpgradeSystem() {
        return new ResetAfterUpgradeSystem(this.subscriptionsBroadcast, this.scope);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public InitialMessagesLoadingSystem createInitialMessagesLoadingSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new InitialMessagesLoadingSystem(this.chatMessagesRepository, chatId, 0, 4, null);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public RequestBotSendFirstMessageSystem createRequestBotSendFirstMessageSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new RequestBotSendFirstMessageSystem(this.chatMessagesRepository, this.messagesSource, chatId, this.scope);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public ShowSendingMessagesSystem createShowSendingMessagesSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new ShowSendingMessagesSystem(this.queue, this.queuedMessageToEntityMapper, chatId);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public LiveMessagesSystem createLiveMessagesSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new LiveMessagesSystem(this.liveMessagesFlow, this.scope, chatId);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public LoadMoreSystem createLoadMoreSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new LoadMoreSystem(this.chatMessagesRepository, 0, chatId, 2, null);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public SendingMessagesSystem createSendingMessagesSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new SendingMessagesSystem(chatId, this.chatMessagesRepository, this.scope, this.dispatchers);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public RemoveUnsuccessfulSentMessagesSystem createRemoveUnsuccessfulSentMessagesSystem() {
        return new RemoveUnsuccessfulSentMessagesSystem(this.publisher);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public BotProcessingSystem createBotProcessingSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new BotProcessingSystem(this.scope, this.publisher, chatId);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public ReadingMessagesSystem createReadingMessagesSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new ReadingMessagesSystem(this.chatMessagesRepository, chatId);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public SortingSystem createSortingSystem() {
        return new SortingSystem();
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public TopicsSystem createTopicsSystem() {
        return new TopicsSystem();
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public DistinctSystem createDistinctSystem() {
        return new DistinctSystem();
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public RateAppChatSystem createRateAppChatSystem() {
        return new RateAppChatSystem(this.publisher, this.showRateUsUseCase);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public ConsumingComponentsSystem createConsumingComponentsSystem() {
        return new ConsumingComponentsSystem();
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public SendingErrorsHandlingSystem createSendingErrorsHandlingSystem() {
        return new SendingErrorsHandlingSystem(this.publisher, this.internalNotificationHandler);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public ChatRemoveMessagesSystem createRemoveMessagesSystem(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new ChatRemoveMessagesSystem(this.scope, chatId, this.dispatchers, this.chatMessagesRepository);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public ChatPaidMessageSystem createChatPaidMessageSystem() {
        return new ChatPaidMessageSystem(this.scope, this.dispatchers);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public ChatUpdateMessageSystem createChatUpdateMessageSystem() {
        return new ChatUpdateMessageSystem(this.scope);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatSystemsFactory
    public MessageRegenerationSystem createMessageRegenerationSystem() {
        return new MessageRegenerationSystem();
    }
}
