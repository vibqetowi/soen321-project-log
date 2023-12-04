package com.ifriend.domain.newChat.chat;

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
import com.ifriend.domain.newChat.chat.systems.resetAfterUpgrade.ResetAfterUpgradeSystem;
import com.ifriend.domain.newChat.chat.systems.sorting.SortingSystem;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatSystemsFactory.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010&\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010(\u001a\u00020)H&J\b\u0010*\u001a\u00020+H&¨\u0006,"}, d2 = {"Lcom/ifriend/domain/newChat/chat/ChatSystemsFactory;", "", "createBotProcessingSystem", "Lcom/ifriend/domain/newChat/chat/systems/events/processing/BotProcessingSystem;", "chatId", "", "createChatPaidMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/buy/ChatPaidMessageSystem;", "createChatUpdateMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/update/ChatUpdateMessageSystem;", "createConsumingComponentsSystem", "Lcom/ifriend/domain/newChat/chat/systems/consuming/ConsumingComponentsSystem;", "createDistinctSystem", "Lcom/ifriend/domain/newChat/chat/systems/distinct/DistinctSystem;", "createInitialMessagesLoadingSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/history/initialLoading/InitialMessagesLoadingSystem;", "createLiveMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveMessagesSystem;", "createLoadMoreSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/history/loadMore/LoadMoreSystem;", "createMessageRegenerationSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/regeneration/MessageRegenerationSystem;", "createRateAppChatSystem", "Lcom/ifriend/domain/newChat/chat/systems/appRate/RateAppChatSystem;", "createReadingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/reading/ReadingMessagesSystem;", "createRemoveMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/remove/ChatRemoveMessagesSystem;", "createRemoveUnsuccessfulSentMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/removeUnsuccessfulSent/RemoveUnsuccessfulSentMessagesSystem;", "createRequestBotSendFirstMessageSystem", "Lcom/ifriend/domain/newChat/chat/systems/firstChat/RequestBotSendFirstMessageSystem;", "createResetAfterUpgradeSystem", "Lcom/ifriend/domain/newChat/chat/systems/resetAfterUpgrade/ResetAfterUpgradeSystem;", "createSendingErrorsHandlingSystem", "Lcom/ifriend/domain/newChat/chat/systems/errorsHandling/SendingErrorsHandlingSystem;", "createSendingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesSystem;", "createShowSendingMessagesSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/showSending/ShowSendingMessagesSystem;", "createSortingSystem", "Lcom/ifriend/domain/newChat/chat/systems/sorting/SortingSystem;", "createTopicsSystem", "Lcom/ifriend/domain/newChat/chat/systems/messages/topics/TopicsSystem;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatSystemsFactory {
    BotProcessingSystem createBotProcessingSystem(String str);

    ChatPaidMessageSystem createChatPaidMessageSystem();

    ChatUpdateMessageSystem createChatUpdateMessageSystem();

    ConsumingComponentsSystem createConsumingComponentsSystem();

    DistinctSystem createDistinctSystem();

    InitialMessagesLoadingSystem createInitialMessagesLoadingSystem(String str);

    LiveMessagesSystem createLiveMessagesSystem(String str);

    LoadMoreSystem createLoadMoreSystem(String str);

    MessageRegenerationSystem createMessageRegenerationSystem();

    RateAppChatSystem createRateAppChatSystem();

    ReadingMessagesSystem createReadingMessagesSystem(String str);

    ChatRemoveMessagesSystem createRemoveMessagesSystem(String str);

    RemoveUnsuccessfulSentMessagesSystem createRemoveUnsuccessfulSentMessagesSystem();

    RequestBotSendFirstMessageSystem createRequestBotSendFirstMessageSystem(String str);

    ResetAfterUpgradeSystem createResetAfterUpgradeSystem();

    SendingErrorsHandlingSystem createSendingErrorsHandlingSystem();

    SendingMessagesSystem createSendingMessagesSystem(String str);

    ShowSendingMessagesSystem createShowSendingMessagesSystem(String str);

    SortingSystem createSortingSystem();

    TopicsSystem createTopicsSystem();
}
