package com.ifriend.domain.newChat.chat;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.BaseEngine;
import com.ifriend.common_entities_engine.Engine;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.ExceptionListenerRegistry;
import com.ifriend.common_entities_engine.System;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.newChat.chat.systems.appRate.RateAppChatSystem;
import com.ifriend.domain.newChat.chat.systems.consuming.ConsumingComponentsSystem;
import com.ifriend.domain.newChat.chat.systems.distinct.DistinctSystem;
import com.ifriend.domain.newChat.chat.systems.errorsHandling.SendingErrorsHandlingSystem;
import com.ifriend.domain.newChat.chat.systems.events.processing.BotProcessingSystem;
import com.ifriend.domain.newChat.chat.systems.firstChat.RequestBotSendFirstMessageSystem;
import com.ifriend.domain.newChat.chat.systems.messages.buy.ChatPaidMessageSystem;
import com.ifriend.domain.newChat.chat.systems.messages.history.initialLoading.InitialMessagesLoadingSystem;
import com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreSystem;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.reading.ReadingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.regeneration.MessageRegenerationSystem;
import com.ifriend.domain.newChat.chat.systems.messages.remove.ChatRemoveMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.removeUnsuccessfulSent.RemoveUnsuccessfulSentMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.showSending.ShowSendingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.topics.TopicsSystem;
import com.ifriend.domain.newChat.chat.systems.messages.update.ChatUpdateMessageSystem;
import com.ifriend.domain.newChat.chat.systems.reset.ResetStateSystem;
import com.ifriend.domain.newChat.chat.systems.resetAfterUpgrade.ResetAfterUpgradeSystem;
import com.ifriend.domain.newChat.chat.systems.sorting.SortingSystem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatClientImpl.kt */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002Bµ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/¢\u0006\u0002\u00100J\u001c\u0010:\u001a\u00020;2\u0012\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030504H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030>H\u0016J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010CJ\b\u0010D\u001a\u00020;H\u0016J\u001e\u0010E\u001a\u00020;2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u0003052\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020;H\u0016J\b\u0010J\u001a\u00020;H\u0016J\b\u0010K\u001a\u00020;H\u0016J\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000302*\b\u0012\u0004\u0012\u00020\u000302H\u0002J\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000302*\b\u0012\u0004\u0012\u00020\u000302H\u0002J\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000302*\b\u0012\u0004\u0012\u00020\u000302H\u0002J\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000302*\b\u0012\u0004\u0012\u00020\u000302H\u0002R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u000302X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030504X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Lcom/ifriend/domain/newChat/chat/ChatClientImpl;", "Lcom/ifriend/domain/newChat/chat/ChatClient;", "Lcom/ifriend/common_entities_engine/ExceptionListenerRegistry$ExceptionListener;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "resetAfterUpgradeSystem", "Lcom/ifriend/domain/newChat/chat/systems/resetAfterUpgrade/ResetAfterUpgradeSystem;", "initialMessagesLoadingSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/history/initialLoading/InitialMessagesLoadingSystem;", "requestBotSendFirstMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/firstChat/RequestBotSendFirstMessageSystem;", "showSendingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/showSending/ShowSendingMessagesSystem;", "liveMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveMessagesSystem;", "loadMoreSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/history/loadMore/LoadMoreSystem;", "sendingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesSystem;", "removeUnsuccessfulSentMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/removeUnsuccessfulSent/RemoveUnsuccessfulSentMessagesSystem;", "botProcessingSystem", "Lcom/ifriend/domain/newChat/chat/systems/events/processing/BotProcessingSystem;", "readingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/reading/ReadingMessagesSystem;", "sortingSystem", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortingSystem;", "topicsSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/topics/TopicsSystem;", "distinctSystem", "Lcom/ifriend/domain/newChat/chat/systems/distinct/DistinctSystem;", "rateAppChatSystem", "Lcom/ifriend/domain/newChat/chat/systems/appRate/RateAppChatSystem;", "consumingComponentsSystem", "Lcom/ifriend/domain/newChat/chat/systems/consuming/ConsumingComponentsSystem;", "sendingErrorsHandlingSystem", "Lcom/ifriend/domain/newChat/chat/systems/errorsHandling/SendingErrorsHandlingSystem;", "chatRemoveMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/remove/ChatRemoveMessagesSystem;", "chatPaidMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/buy/ChatPaidMessageSystem;", "chatUpdateMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/update/ChatUpdateMessageSystem;", "messageRegenerationSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/regeneration/MessageRegenerationSystem;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/newChat/chat/systems/resetAfterUpgrade/ResetAfterUpgradeSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/history/initialLoading/InitialMessagesLoadingSystem;Lcom/ifriend/domain/newChat/chat/systems/firstChat/RequestBotSendFirstMessageSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/showSending/ShowSendingMessagesSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveMessagesSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/history/loadMore/LoadMoreSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/removeUnsuccessfulSent/RemoveUnsuccessfulSentMessagesSystem;Lcom/ifriend/domain/newChat/chat/systems/events/processing/BotProcessingSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/reading/ReadingMessagesSystem;Lcom/ifriend/domain/newChat/chat/systems/sorting/SortingSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/topics/TopicsSystem;Lcom/ifriend/domain/newChat/chat/systems/distinct/DistinctSystem;Lcom/ifriend/domain/newChat/chat/systems/appRate/RateAppChatSystem;Lcom/ifriend/domain/newChat/chat/systems/consuming/ConsumingComponentsSystem;Lcom/ifriend/domain/newChat/chat/systems/errorsHandling/SendingErrorsHandlingSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/remove/ChatRemoveMessagesSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/buy/ChatPaidMessageSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/update/ChatUpdateMessageSystem;Lcom/ifriend/domain/newChat/chat/systems/messages/regeneration/MessageRegenerationSystem;Lcom/ifriend/common_utils/Logger;)V", "engine", "Lcom/ifriend/common_entities_engine/Engine;", "expandingSystemsChain", "", "Lcom/ifriend/common_entities_engine/System;", "resetStateSystem", "Lcom/ifriend/domain/newChat/chat/systems/reset/ResetStateSystem;", "triggerStateUpdateSystem", "Lcom/ifriend/domain/newChat/chat/TriggerStateUpdateSystem;", "expandWithSystemsChain", "", "chain", "getState", "Lkotlinx/coroutines/flow/StateFlow;", "handle", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "onException", "system", "exception", "", "pause", "refresh", "resume", "attachChatCoreSystems", "attachExpandingSystems", "attachPostProcessingSystems", "attachServiceSystems", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatClientImpl implements ChatClient, ExceptionListenerRegistry.ExceptionListener<EntitiesState> {
    private final BotProcessingSystem botProcessingSystem;
    private final ChatPaidMessageSystem chatPaidMessageSystem;
    private final ChatRemoveMessagesSystem chatRemoveMessagesSystem;
    private final ChatUpdateMessageSystem chatUpdateMessageSystem;
    private final ConsumingComponentsSystem consumingComponentsSystem;
    private final CoroutineScope coroutineScope;
    private final DistinctSystem distinctSystem;
    private final Engine<EntitiesState> engine;
    private List<? extends System<EntitiesState>> expandingSystemsChain;
    private final InitialMessagesLoadingSystem initialMessagesLoadingSystem;
    private final LiveMessagesSystem liveMessagesSystem;
    private final LoadMoreSystem loadMoreSystem;
    private final MessageRegenerationSystem messageRegenerationSystem;
    private final RateAppChatSystem rateAppChatSystem;
    private final ReadingMessagesSystem readingMessagesSystem;
    private final RemoveUnsuccessfulSentMessagesSystem removeUnsuccessfulSentMessagesSystem;
    private final RequestBotSendFirstMessageSystem requestBotSendFirstMessageSystem;
    private final ResetAfterUpgradeSystem resetAfterUpgradeSystem;
    private final ResetStateSystem resetStateSystem;
    private final SendingErrorsHandlingSystem sendingErrorsHandlingSystem;
    private final SendingMessagesSystem sendingMessagesSystem;
    private final ShowSendingMessagesSystem showSendingMessagesSystem;
    private final SortingSystem sortingSystem;
    private final TopicsSystem topicsSystem;
    private final TriggerStateUpdateSystem triggerStateUpdateSystem;

    public ChatClientImpl(CoroutineScope coroutineScope, ResetAfterUpgradeSystem resetAfterUpgradeSystem, InitialMessagesLoadingSystem initialMessagesLoadingSystem, RequestBotSendFirstMessageSystem requestBotSendFirstMessageSystem, ShowSendingMessagesSystem showSendingMessagesSystem, LiveMessagesSystem liveMessagesSystem, LoadMoreSystem loadMoreSystem, SendingMessagesSystem sendingMessagesSystem, RemoveUnsuccessfulSentMessagesSystem removeUnsuccessfulSentMessagesSystem, BotProcessingSystem botProcessingSystem, ReadingMessagesSystem readingMessagesSystem, SortingSystem sortingSystem, TopicsSystem topicsSystem, DistinctSystem distinctSystem, RateAppChatSystem rateAppChatSystem, ConsumingComponentsSystem consumingComponentsSystem, SendingErrorsHandlingSystem sendingErrorsHandlingSystem, ChatRemoveMessagesSystem chatRemoveMessagesSystem, ChatPaidMessageSystem chatPaidMessageSystem, ChatUpdateMessageSystem chatUpdateMessageSystem, MessageRegenerationSystem messageRegenerationSystem, Logger logger) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(resetAfterUpgradeSystem, "resetAfterUpgradeSystem");
        Intrinsics.checkNotNullParameter(initialMessagesLoadingSystem, "initialMessagesLoadingSystem");
        Intrinsics.checkNotNullParameter(requestBotSendFirstMessageSystem, "requestBotSendFirstMessageSystem");
        Intrinsics.checkNotNullParameter(showSendingMessagesSystem, "showSendingMessagesSystem");
        Intrinsics.checkNotNullParameter(liveMessagesSystem, "liveMessagesSystem");
        Intrinsics.checkNotNullParameter(loadMoreSystem, "loadMoreSystem");
        Intrinsics.checkNotNullParameter(sendingMessagesSystem, "sendingMessagesSystem");
        Intrinsics.checkNotNullParameter(removeUnsuccessfulSentMessagesSystem, "removeUnsuccessfulSentMessagesSystem");
        Intrinsics.checkNotNullParameter(botProcessingSystem, "botProcessingSystem");
        Intrinsics.checkNotNullParameter(readingMessagesSystem, "readingMessagesSystem");
        Intrinsics.checkNotNullParameter(sortingSystem, "sortingSystem");
        Intrinsics.checkNotNullParameter(topicsSystem, "topicsSystem");
        Intrinsics.checkNotNullParameter(distinctSystem, "distinctSystem");
        Intrinsics.checkNotNullParameter(rateAppChatSystem, "rateAppChatSystem");
        Intrinsics.checkNotNullParameter(consumingComponentsSystem, "consumingComponentsSystem");
        Intrinsics.checkNotNullParameter(sendingErrorsHandlingSystem, "sendingErrorsHandlingSystem");
        Intrinsics.checkNotNullParameter(chatRemoveMessagesSystem, "chatRemoveMessagesSystem");
        Intrinsics.checkNotNullParameter(chatPaidMessageSystem, "chatPaidMessageSystem");
        Intrinsics.checkNotNullParameter(chatUpdateMessageSystem, "chatUpdateMessageSystem");
        Intrinsics.checkNotNullParameter(messageRegenerationSystem, "messageRegenerationSystem");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.resetAfterUpgradeSystem = resetAfterUpgradeSystem;
        this.initialMessagesLoadingSystem = initialMessagesLoadingSystem;
        this.requestBotSendFirstMessageSystem = requestBotSendFirstMessageSystem;
        this.showSendingMessagesSystem = showSendingMessagesSystem;
        this.liveMessagesSystem = liveMessagesSystem;
        this.loadMoreSystem = loadMoreSystem;
        this.sendingMessagesSystem = sendingMessagesSystem;
        this.removeUnsuccessfulSentMessagesSystem = removeUnsuccessfulSentMessagesSystem;
        this.botProcessingSystem = botProcessingSystem;
        this.readingMessagesSystem = readingMessagesSystem;
        this.sortingSystem = sortingSystem;
        this.topicsSystem = topicsSystem;
        this.distinctSystem = distinctSystem;
        this.rateAppChatSystem = rateAppChatSystem;
        this.consumingComponentsSystem = consumingComponentsSystem;
        this.sendingErrorsHandlingSystem = sendingErrorsHandlingSystem;
        this.chatRemoveMessagesSystem = chatRemoveMessagesSystem;
        this.chatPaidMessageSystem = chatPaidMessageSystem;
        this.chatUpdateMessageSystem = chatUpdateMessageSystem;
        this.messageRegenerationSystem = messageRegenerationSystem;
        this.triggerStateUpdateSystem = new TriggerStateUpdateSystem();
        this.resetStateSystem = new ResetStateSystem();
        this.expandingSystemsChain = CollectionsKt.emptyList();
        Engine<EntitiesState> attachPostProcessingSystems = attachPostProcessingSystems(attachExpandingSystems(attachChatCoreSystems(attachServiceSystems(new BaseEngine(new EntitiesState(null, null, 3, null), coroutineScope, logger)))));
        attachPostProcessingSystems.addExceptionListener(this);
        this.engine = attachPostProcessingSystems;
    }

    @Override // com.ifriend.domain.newChat.chat.ChatClient
    public StateFlow<EntitiesState> getState() {
        return this.engine.getState();
    }

    @Override // com.ifriend.common_entities_engine.EventHandler
    public Object handle(Event event, Continuation<? super Boolean> continuation) {
        return this.engine.handle(event, continuation);
    }

    @Override // com.ifriend.domain.newChat.chat.ChatClient
    public void launch() {
        this.engine.startAll();
        this.triggerStateUpdateSystem.triggerStateUpdate();
    }

    @Override // com.ifriend.domain.newChat.chat.ChatClient
    public void refresh() {
        this.triggerStateUpdateSystem.triggerStateUpdate();
    }

    @Override // com.ifriend.domain.newChat.chat.ChatClient
    public void resume() {
        this.engine.startAll();
    }

    @Override // com.ifriend.domain.newChat.chat.ChatClient
    public void pause() {
        this.engine.stopAll();
    }

    @Override // com.ifriend.domain.newChat.chat.ChatClient
    public void expandWithSystemsChain(List<? extends System<EntitiesState>> chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.engine.detachAll();
        this.expandingSystemsChain = chain;
        attachPostProcessingSystems(attachExpandingSystems(attachChatCoreSystems(attachServiceSystems(this.engine))));
        this.engine.startAll();
    }

    private final Engine<EntitiesState> attachServiceSystems(Engine<EntitiesState> engine) {
        engine.attach(this.triggerStateUpdateSystem);
        return engine.attach(this.resetStateSystem);
    }

    private final Engine<EntitiesState> attachChatCoreSystems(Engine<EntitiesState> engine) {
        engine.attach(this.chatRemoveMessagesSystem);
        engine.attach(this.resetAfterUpgradeSystem);
        engine.attach(this.consumingComponentsSystem);
        engine.attach(this.initialMessagesLoadingSystem);
        engine.attach(this.requestBotSendFirstMessageSystem);
        engine.attach(this.loadMoreSystem);
        engine.attach(this.liveMessagesSystem);
        engine.attach(this.showSendingMessagesSystem);
        engine.attach(this.sendingMessagesSystem);
        engine.attach(this.removeUnsuccessfulSentMessagesSystem);
        engine.attach(this.topicsSystem);
        engine.attach(this.readingMessagesSystem);
        engine.attach(this.sortingSystem);
        engine.attach(this.distinctSystem);
        engine.attach(this.chatPaidMessageSystem);
        engine.attach(this.chatUpdateMessageSystem);
        engine.attach(this.botProcessingSystem);
        engine.attach(this.rateAppChatSystem);
        engine.attach(this.sendingErrorsHandlingSystem);
        engine.attach(this.sortingSystem);
        engine.attach(this.distinctSystem);
        engine.attach(this.messageRegenerationSystem);
        return engine;
    }

    private final Engine<EntitiesState> attachExpandingSystems(Engine<EntitiesState> engine) {
        for (System<EntitiesState> system : this.expandingSystemsChain) {
            engine.attach(system);
        }
        return engine;
    }

    private final Engine<EntitiesState> attachPostProcessingSystems(Engine<EntitiesState> engine) {
        engine.attach(this.sortingSystem);
        engine.attach(this.distinctSystem);
        return engine;
    }

    @Override // com.ifriend.common_entities_engine.ExceptionListenerRegistry.ExceptionListener
    public void onException(System<EntitiesState> system, Throwable exception) {
        Intrinsics.checkNotNullParameter(system, "system");
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.engine.restart(system);
    }
}
