package com.ifriend.data.repository.chat.providers;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.newChat.chat.ChatClient;
import com.ifriend.domain.newChat.chat.ChatClientImpl;
import com.ifriend.domain.newChat.chat.ChatSystemsFactory;
import com.ifriend.domain.newChat.chat.systems.appRate.RateAppChatSystem;
import com.ifriend.domain.newChat.chat.systems.distinct.DistinctSystem;
import com.ifriend.domain.newChat.chat.systems.events.processing.BotProcessingSystem;
import com.ifriend.domain.newChat.chat.systems.firstChat.RequestBotSendFirstMessageSystem;
import com.ifriend.domain.newChat.chat.systems.messages.history.initialLoading.InitialMessagesLoadingSystem;
import com.ifriend.domain.newChat.chat.systems.messages.history.loadMore.LoadMoreSystem;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.reading.ReadingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.removeUnsuccessfulSent.RemoveUnsuccessfulSentMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.sending.showSending.ShowSendingMessagesSystem;
import com.ifriend.domain.newChat.chat.systems.messages.topics.TopicsSystem;
import com.ifriend.domain.newChat.chat.systems.resetAfterUpgrade.ResetAfterUpgradeSystem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatClientProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/data/repository/chat/providers/ChatClientProvider;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "chatSystemsFactory", "Lcom/ifriend/domain/newChat/chat/ChatSystemsFactory;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/newChat/chat/ChatSystemsFactory;Lcom/ifriend/common_utils/Logger;)V", "getChatClient", "Lcom/ifriend/domain/newChat/chat/ChatClient;", "chatId", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatClientProvider {
    private final ChatSystemsFactory chatSystemsFactory;
    private final CoroutineScope coroutineScope;
    private final Logger logger;

    @Inject
    public ChatClientProvider(CoroutineScope coroutineScope, ChatSystemsFactory chatSystemsFactory, Logger logger) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(chatSystemsFactory, "chatSystemsFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.coroutineScope = coroutineScope;
        this.chatSystemsFactory = chatSystemsFactory;
        this.logger = logger;
    }

    public final ChatClient getChatClient(String chatId) {
        ChatClientImpl chatClientImpl;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        synchronized (this) {
            CoroutineScope coroutineScope = this.coroutineScope;
            ResetAfterUpgradeSystem createResetAfterUpgradeSystem = this.chatSystemsFactory.createResetAfterUpgradeSystem();
            InitialMessagesLoadingSystem createInitialMessagesLoadingSystem = this.chatSystemsFactory.createInitialMessagesLoadingSystem(chatId);
            RequestBotSendFirstMessageSystem createRequestBotSendFirstMessageSystem = this.chatSystemsFactory.createRequestBotSendFirstMessageSystem(chatId);
            ShowSendingMessagesSystem createShowSendingMessagesSystem = this.chatSystemsFactory.createShowSendingMessagesSystem(chatId);
            LiveMessagesSystem createLiveMessagesSystem = this.chatSystemsFactory.createLiveMessagesSystem(chatId);
            SendingMessagesSystem createSendingMessagesSystem = this.chatSystemsFactory.createSendingMessagesSystem(chatId);
            LoadMoreSystem createLoadMoreSystem = this.chatSystemsFactory.createLoadMoreSystem(chatId);
            RemoveUnsuccessfulSentMessagesSystem createRemoveUnsuccessfulSentMessagesSystem = this.chatSystemsFactory.createRemoveUnsuccessfulSentMessagesSystem();
            BotProcessingSystem createBotProcessingSystem = this.chatSystemsFactory.createBotProcessingSystem(chatId);
            ReadingMessagesSystem createReadingMessagesSystem = this.chatSystemsFactory.createReadingMessagesSystem(chatId);
            TopicsSystem createTopicsSystem = this.chatSystemsFactory.createTopicsSystem();
            DistinctSystem createDistinctSystem = this.chatSystemsFactory.createDistinctSystem();
            RateAppChatSystem createRateAppChatSystem = this.chatSystemsFactory.createRateAppChatSystem();
            chatClientImpl = new ChatClientImpl(coroutineScope, createResetAfterUpgradeSystem, createInitialMessagesLoadingSystem, createRequestBotSendFirstMessageSystem, createShowSendingMessagesSystem, createLiveMessagesSystem, createLoadMoreSystem, createSendingMessagesSystem, createRemoveUnsuccessfulSentMessagesSystem, createBotProcessingSystem, createReadingMessagesSystem, this.chatSystemsFactory.createSortingSystem(), createTopicsSystem, createDistinctSystem, createRateAppChatSystem, this.chatSystemsFactory.createConsumingComponentsSystem(), this.chatSystemsFactory.createSendingErrorsHandlingSystem(), this.chatSystemsFactory.createRemoveMessagesSystem(chatId), this.chatSystemsFactory.createChatPaidMessageSystem(), this.chatSystemsFactory.createChatUpdateMessageSystem(), this.chatSystemsFactory.createMessageRegenerationSystem(), this.logger);
        }
        return chatClientImpl;
    }
}
