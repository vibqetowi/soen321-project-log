package com.ifriend.domain.socket;

import androidx.autofill.HintConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.domain.models.TagOfUser;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessagesSourceMessage.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage;", "", "()V", "AccountUpgraded", "AddDiaryNotes", "AvatarAnimationGenerated", "AvatarsGenerated", "BotDataChanged", "Chat", "ChatCallMessage", "DailyNeuronsReceived", "LevelInfoUpdate", "LullabyAvailabilityChanged", "NeuronesChanged", "NeuronesPurchased", "TagAdded", "TagRemoved", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AccountUpgraded;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AddDiaryNotes;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarsGenerated;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$BotDataChanged;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatRegenerateMessageFailed;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatSubscription;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$ChatCallMessage;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$DailyNeuronsReceived;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$LullabyAvailabilityChanged;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesChanged;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesPurchased;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$TagAdded;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$TagRemoved;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MessagesSourceMessage {
    public /* synthetic */ MessagesSourceMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MessagesSourceMessage() {
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "()V", "ChatMessageEvent", "ChatRegenerateMessageFailed", "ChatSubscription", "Message", "MessageRemoved", "MessageUpdated", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatMessageEvent;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$MessageRemoved;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class Chat extends MessagesSourceMessage {
        public /* synthetic */ Chat(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Chat() {
            super(null);
        }

        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatMessageEvent;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat;", "chatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "(Lcom/ifriend/domain/newChat/chat/models/ChatMessage;)V", "getChatMessage", "()Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$Message;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$MessageUpdated;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static abstract class ChatMessageEvent extends Chat {
            private final ChatMessage chatMessage;

            public /* synthetic */ ChatMessageEvent(ChatMessage chatMessage, DefaultConstructorMarker defaultConstructorMarker) {
                this(chatMessage);
            }

            private ChatMessageEvent(ChatMessage chatMessage) {
                super(null);
                this.chatMessage = chatMessage;
            }

            public ChatMessage getChatMessage() {
                return this.chatMessage;
            }
        }

        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$Message;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatMessageEvent;", "chatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "(Lcom/ifriend/domain/newChat/chat/models/ChatMessage;)V", "getChatMessage", "()Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Message extends ChatMessageEvent {
            private final ChatMessage chatMessage;

            public static /* synthetic */ Message copy$default(Message message, ChatMessage chatMessage, int i, Object obj) {
                if ((i & 1) != 0) {
                    chatMessage = message.chatMessage;
                }
                return message.copy(chatMessage);
            }

            public final ChatMessage component1() {
                return this.chatMessage;
            }

            public final Message copy(ChatMessage chatMessage) {
                Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                return new Message(chatMessage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Message) && Intrinsics.areEqual(this.chatMessage, ((Message) obj).chatMessage);
            }

            public int hashCode() {
                return this.chatMessage.hashCode();
            }

            public String toString() {
                ChatMessage chatMessage = this.chatMessage;
                return "Message(chatMessage=" + chatMessage + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Message(ChatMessage chatMessage) {
                super(chatMessage, null);
                Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                this.chatMessage = chatMessage;
            }

            @Override // com.ifriend.domain.socket.MessagesSourceMessage.Chat.ChatMessageEvent
            public ChatMessage getChatMessage() {
                return this.chatMessage;
            }
        }

        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$MessageUpdated;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatMessageEvent;", "chatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "(Lcom/ifriend/domain/newChat/chat/models/ChatMessage;)V", "getChatMessage", "()Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class MessageUpdated extends ChatMessageEvent {
            private final ChatMessage chatMessage;

            public static /* synthetic */ MessageUpdated copy$default(MessageUpdated messageUpdated, ChatMessage chatMessage, int i, Object obj) {
                if ((i & 1) != 0) {
                    chatMessage = messageUpdated.chatMessage;
                }
                return messageUpdated.copy(chatMessage);
            }

            public final ChatMessage component1() {
                return this.chatMessage;
            }

            public final MessageUpdated copy(ChatMessage chatMessage) {
                Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                return new MessageUpdated(chatMessage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MessageUpdated) && Intrinsics.areEqual(this.chatMessage, ((MessageUpdated) obj).chatMessage);
            }

            public int hashCode() {
                return this.chatMessage.hashCode();
            }

            public String toString() {
                ChatMessage chatMessage = this.chatMessage;
                return "MessageUpdated(chatMessage=" + chatMessage + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MessageUpdated(ChatMessage chatMessage) {
                super(chatMessage, null);
                Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                this.chatMessage = chatMessage;
            }

            @Override // com.ifriend.domain.socket.MessagesSourceMessage.Chat.ChatMessageEvent
            public ChatMessage getChatMessage() {
                return this.chatMessage;
            }
        }

        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$MessageRemoved;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat;", "chatId", "", "messageId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getMessageId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class MessageRemoved extends Chat {
            private final String chatId;
            private final String messageId;

            public static /* synthetic */ MessageRemoved copy$default(MessageRemoved messageRemoved, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = messageRemoved.chatId;
                }
                if ((i & 2) != 0) {
                    str2 = messageRemoved.messageId;
                }
                return messageRemoved.copy(str, str2);
            }

            public final String component1() {
                return this.chatId;
            }

            public final String component2() {
                return this.messageId;
            }

            public final MessageRemoved copy(String chatId, String messageId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                return new MessageRemoved(chatId, messageId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof MessageRemoved) {
                    MessageRemoved messageRemoved = (MessageRemoved) obj;
                    return Intrinsics.areEqual(this.chatId, messageRemoved.chatId) && Intrinsics.areEqual(this.messageId, messageRemoved.messageId);
                }
                return false;
            }

            public int hashCode() {
                return (this.chatId.hashCode() * 31) + this.messageId.hashCode();
            }

            public String toString() {
                String str = this.chatId;
                String str2 = this.messageId;
                return "MessageRemoved(chatId=" + str + ", messageId=" + str2 + ")";
            }

            public final String getChatId() {
                return this.chatId;
            }

            public final String getMessageId() {
                return this.messageId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MessageRemoved(String chatId, String messageId) {
                super(null);
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                this.chatId = chatId;
                this.messageId = messageId;
            }
        }

        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatRegenerateMessageFailed;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "chatId", "", "messageId", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getMessageId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ChatRegenerateMessageFailed extends MessagesSourceMessage {
            private final String chatId;
            private final String messageId;

            public static /* synthetic */ ChatRegenerateMessageFailed copy$default(ChatRegenerateMessageFailed chatRegenerateMessageFailed, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = chatRegenerateMessageFailed.chatId;
                }
                if ((i & 2) != 0) {
                    str2 = chatRegenerateMessageFailed.messageId;
                }
                return chatRegenerateMessageFailed.copy(str, str2);
            }

            public final String component1() {
                return this.chatId;
            }

            public final String component2() {
                return this.messageId;
            }

            public final ChatRegenerateMessageFailed copy(String chatId, String messageId) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                return new ChatRegenerateMessageFailed(chatId, messageId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ChatRegenerateMessageFailed) {
                    ChatRegenerateMessageFailed chatRegenerateMessageFailed = (ChatRegenerateMessageFailed) obj;
                    return Intrinsics.areEqual(this.chatId, chatRegenerateMessageFailed.chatId) && Intrinsics.areEqual(this.messageId, chatRegenerateMessageFailed.messageId);
                }
                return false;
            }

            public int hashCode() {
                return (this.chatId.hashCode() * 31) + this.messageId.hashCode();
            }

            public String toString() {
                String str = this.chatId;
                String str2 = this.messageId;
                return "ChatRegenerateMessageFailed(chatId=" + str + ", messageId=" + str2 + ")";
            }

            public final String getChatId() {
                return this.chatId;
            }

            public final String getMessageId() {
                return this.messageId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChatRegenerateMessageFailed(String chatId, String messageId) {
                super(null);
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                this.chatId = chatId;
                this.messageId = messageId;
            }
        }

        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatSubscription;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "chatId", "", "isAvailable", "", "(Ljava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ChatSubscription extends MessagesSourceMessage {
            private final String chatId;
            private final boolean isAvailable;

            public static /* synthetic */ ChatSubscription copy$default(ChatSubscription chatSubscription, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = chatSubscription.chatId;
                }
                if ((i & 2) != 0) {
                    z = chatSubscription.isAvailable;
                }
                return chatSubscription.copy(str, z);
            }

            public final String component1() {
                return this.chatId;
            }

            public final boolean component2() {
                return this.isAvailable;
            }

            public final ChatSubscription copy(String chatId, boolean z) {
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                return new ChatSubscription(chatId, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ChatSubscription) {
                    ChatSubscription chatSubscription = (ChatSubscription) obj;
                    return Intrinsics.areEqual(this.chatId, chatSubscription.chatId) && this.isAvailable == chatSubscription.isAvailable;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.chatId.hashCode() * 31;
                boolean z = this.isAvailable;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public String toString() {
                String str = this.chatId;
                boolean z = this.isAvailable;
                return "ChatSubscription(chatId=" + str + ", isAvailable=" + z + ")";
            }

            public final String getChatId() {
                return this.chatId;
            }

            public final boolean isAvailable() {
                return this.isAvailable;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChatSubscription(String chatId, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(chatId, "chatId");
                this.chatId = chatId;
                this.isAvailable = z;
            }
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$ChatCallMessage;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "callId", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "(Ljava/lang/String;Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ChatCallMessage extends MessagesSourceMessage {
        private final String callId;
        private final String message;

        public static /* synthetic */ ChatCallMessage copy$default(ChatCallMessage chatCallMessage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatCallMessage.callId;
            }
            if ((i & 2) != 0) {
                str2 = chatCallMessage.message;
            }
            return chatCallMessage.copy(str, str2);
        }

        public final String component1() {
            return this.callId;
        }

        public final String component2() {
            return this.message;
        }

        public final ChatCallMessage copy(String callId, String message) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ChatCallMessage(callId, message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChatCallMessage) {
                ChatCallMessage chatCallMessage = (ChatCallMessage) obj;
                return Intrinsics.areEqual(this.callId, chatCallMessage.callId) && Intrinsics.areEqual(this.message, chatCallMessage.message);
            }
            return false;
        }

        public int hashCode() {
            return (this.callId.hashCode() * 31) + this.message.hashCode();
        }

        public String toString() {
            String str = this.callId;
            String str2 = this.message;
            return "ChatCallMessage(callId=" + str + ", message=" + str2 + ")";
        }

        public final String getCallId() {
            return this.callId;
        }

        public final String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChatCallMessage(String callId, String message) {
            super(null);
            Intrinsics.checkNotNullParameter(callId, "callId");
            Intrinsics.checkNotNullParameter(message, "message");
            this.callId = callId;
            this.message = message;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$TagAdded;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "tagOfUser", "Lcom/ifriend/domain/models/TagOfUser;", "(Lcom/ifriend/domain/models/TagOfUser;)V", "getTagOfUser", "()Lcom/ifriend/domain/models/TagOfUser;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TagAdded extends MessagesSourceMessage {
        private final TagOfUser tagOfUser;

        public static /* synthetic */ TagAdded copy$default(TagAdded tagAdded, TagOfUser tagOfUser, int i, Object obj) {
            if ((i & 1) != 0) {
                tagOfUser = tagAdded.tagOfUser;
            }
            return tagAdded.copy(tagOfUser);
        }

        public final TagOfUser component1() {
            return this.tagOfUser;
        }

        public final TagAdded copy(TagOfUser tagOfUser) {
            return new TagAdded(tagOfUser);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TagAdded) && Intrinsics.areEqual(this.tagOfUser, ((TagAdded) obj).tagOfUser);
        }

        public int hashCode() {
            TagOfUser tagOfUser = this.tagOfUser;
            if (tagOfUser == null) {
                return 0;
            }
            return tagOfUser.hashCode();
        }

        public String toString() {
            TagOfUser tagOfUser = this.tagOfUser;
            return "TagAdded(tagOfUser=" + tagOfUser + ")";
        }

        public TagAdded(TagOfUser tagOfUser) {
            super(null);
            this.tagOfUser = tagOfUser;
        }

        public final TagOfUser getTagOfUser() {
            return this.tagOfUser;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$TagRemoved;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "tagOfUser", "Lcom/ifriend/domain/models/TagOfUser;", "(Lcom/ifriend/domain/models/TagOfUser;)V", "getTagOfUser", "()Lcom/ifriend/domain/models/TagOfUser;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TagRemoved extends MessagesSourceMessage {
        private final TagOfUser tagOfUser;

        public static /* synthetic */ TagRemoved copy$default(TagRemoved tagRemoved, TagOfUser tagOfUser, int i, Object obj) {
            if ((i & 1) != 0) {
                tagOfUser = tagRemoved.tagOfUser;
            }
            return tagRemoved.copy(tagOfUser);
        }

        public final TagOfUser component1() {
            return this.tagOfUser;
        }

        public final TagRemoved copy(TagOfUser tagOfUser) {
            return new TagRemoved(tagOfUser);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TagRemoved) && Intrinsics.areEqual(this.tagOfUser, ((TagRemoved) obj).tagOfUser);
        }

        public int hashCode() {
            TagOfUser tagOfUser = this.tagOfUser;
            if (tagOfUser == null) {
                return 0;
            }
            return tagOfUser.hashCode();
        }

        public String toString() {
            TagOfUser tagOfUser = this.tagOfUser;
            return "TagRemoved(tagOfUser=" + tagOfUser + ")";
        }

        public TagRemoved(TagOfUser tagOfUser) {
            super(null);
            this.tagOfUser = tagOfUser;
        }

        public final TagOfUser getTagOfUser() {
            return this.tagOfUser;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesChanged;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "change", "", "balance", "(II)V", "getBalance", "()I", "getChange", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NeuronesChanged extends MessagesSourceMessage {
        private final int balance;
        private final int change;

        public static /* synthetic */ NeuronesChanged copy$default(NeuronesChanged neuronesChanged, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = neuronesChanged.change;
            }
            if ((i3 & 2) != 0) {
                i2 = neuronesChanged.balance;
            }
            return neuronesChanged.copy(i, i2);
        }

        public final int component1() {
            return this.change;
        }

        public final int component2() {
            return this.balance;
        }

        public final NeuronesChanged copy(int i, int i2) {
            return new NeuronesChanged(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NeuronesChanged) {
                NeuronesChanged neuronesChanged = (NeuronesChanged) obj;
                return this.change == neuronesChanged.change && this.balance == neuronesChanged.balance;
            }
            return false;
        }

        public int hashCode() {
            return (this.change * 31) + this.balance;
        }

        public String toString() {
            int i = this.change;
            int i2 = this.balance;
            return "NeuronesChanged(change=" + i + ", balance=" + i2 + ")";
        }

        public NeuronesChanged(int i, int i2) {
            super(null);
            this.change = i;
            this.balance = i2;
        }

        public final int getBalance() {
            return this.balance;
        }

        public final int getChange() {
            return this.change;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "userId", "", "current", "Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$CurrentLevelInfo;", "changes", "Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$Changes;", "(Ljava/lang/String;Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$CurrentLevelInfo;Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$Changes;)V", "getChanges", "()Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$Changes;", "getCurrent", "()Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$CurrentLevelInfo;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Changes", "CurrentLevelInfo", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class LevelInfoUpdate extends MessagesSourceMessage {
        private final Changes changes;
        private final CurrentLevelInfo current;
        private final String userId;

        public static /* synthetic */ LevelInfoUpdate copy$default(LevelInfoUpdate levelInfoUpdate, String str, CurrentLevelInfo currentLevelInfo, Changes changes, int i, Object obj) {
            if ((i & 1) != 0) {
                str = levelInfoUpdate.userId;
            }
            if ((i & 2) != 0) {
                currentLevelInfo = levelInfoUpdate.current;
            }
            if ((i & 4) != 0) {
                changes = levelInfoUpdate.changes;
            }
            return levelInfoUpdate.copy(str, currentLevelInfo, changes);
        }

        public final String component1() {
            return this.userId;
        }

        public final CurrentLevelInfo component2() {
            return this.current;
        }

        public final Changes component3() {
            return this.changes;
        }

        public final LevelInfoUpdate copy(String userId, CurrentLevelInfo current, Changes changes) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(changes, "changes");
            return new LevelInfoUpdate(userId, current, changes);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LevelInfoUpdate) {
                LevelInfoUpdate levelInfoUpdate = (LevelInfoUpdate) obj;
                return Intrinsics.areEqual(this.userId, levelInfoUpdate.userId) && Intrinsics.areEqual(this.current, levelInfoUpdate.current) && Intrinsics.areEqual(this.changes, levelInfoUpdate.changes);
            }
            return false;
        }

        public int hashCode() {
            return (((this.userId.hashCode() * 31) + this.current.hashCode()) * 31) + this.changes.hashCode();
        }

        public String toString() {
            String str = this.userId;
            CurrentLevelInfo currentLevelInfo = this.current;
            Changes changes = this.changes;
            return "LevelInfoUpdate(userId=" + str + ", current=" + currentLevelInfo + ", changes=" + changes + ")";
        }

        public final String getUserId() {
            return this.userId;
        }

        public final CurrentLevelInfo getCurrent() {
            return this.current;
        }

        public final Changes getChanges() {
            return this.changes;
        }

        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$CurrentLevelInfo;", "", FirebaseAnalytics.Param.LEVEL, "", "currentPoints", "nextLevelPoints", "(III)V", "getCurrentPoints", "()I", "getLevel", "getNextLevelPoints", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class CurrentLevelInfo {
            private final int currentPoints;
            private final int level;
            private final int nextLevelPoints;

            public static /* synthetic */ CurrentLevelInfo copy$default(CurrentLevelInfo currentLevelInfo, int i, int i2, int i3, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = currentLevelInfo.level;
                }
                if ((i4 & 2) != 0) {
                    i2 = currentLevelInfo.currentPoints;
                }
                if ((i4 & 4) != 0) {
                    i3 = currentLevelInfo.nextLevelPoints;
                }
                return currentLevelInfo.copy(i, i2, i3);
            }

            public final int component1() {
                return this.level;
            }

            public final int component2() {
                return this.currentPoints;
            }

            public final int component3() {
                return this.nextLevelPoints;
            }

            public final CurrentLevelInfo copy(int i, int i2, int i3) {
                return new CurrentLevelInfo(i, i2, i3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof CurrentLevelInfo) {
                    CurrentLevelInfo currentLevelInfo = (CurrentLevelInfo) obj;
                    return this.level == currentLevelInfo.level && this.currentPoints == currentLevelInfo.currentPoints && this.nextLevelPoints == currentLevelInfo.nextLevelPoints;
                }
                return false;
            }

            public int hashCode() {
                return (((this.level * 31) + this.currentPoints) * 31) + this.nextLevelPoints;
            }

            public String toString() {
                int i = this.level;
                int i2 = this.currentPoints;
                int i3 = this.nextLevelPoints;
                return "CurrentLevelInfo(level=" + i + ", currentPoints=" + i2 + ", nextLevelPoints=" + i3 + ")";
            }

            public CurrentLevelInfo(int i, int i2, int i3) {
                this.level = i;
                this.currentPoints = i2;
                this.nextLevelPoints = i3;
            }

            public final int getLevel() {
                return this.level;
            }

            public final int getCurrentPoints() {
                return this.currentPoints;
            }

            public final int getNextLevelPoints() {
                return this.nextLevelPoints;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LevelInfoUpdate(String userId, CurrentLevelInfo current, Changes changes) {
            super(null);
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(changes, "changes");
            this.userId = userId;
            this.current = current;
            this.changes = changes;
        }

        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$Changes;", "", "experienceChanged", "", "levelChanged", "levelChangedMessage", "", "reason", "Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$Changes$Reason;", "(IILjava/lang/String;Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$Changes$Reason;)V", "getExperienceChanged", "()I", "getLevelChanged", "getLevelChangedMessage", "()Ljava/lang/String;", "getReason", "()Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$Changes$Reason;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Reason", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Changes {
            private final int experienceChanged;
            private final int levelChanged;
            private final String levelChangedMessage;
            private final Reason reason;

            public static /* synthetic */ Changes copy$default(Changes changes, int i, int i2, String str, Reason reason, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    i = changes.experienceChanged;
                }
                if ((i3 & 2) != 0) {
                    i2 = changes.levelChanged;
                }
                if ((i3 & 4) != 0) {
                    str = changes.levelChangedMessage;
                }
                if ((i3 & 8) != 0) {
                    reason = changes.reason;
                }
                return changes.copy(i, i2, str, reason);
            }

            public final int component1() {
                return this.experienceChanged;
            }

            public final int component2() {
                return this.levelChanged;
            }

            public final String component3() {
                return this.levelChangedMessage;
            }

            public final Reason component4() {
                return this.reason;
            }

            public final Changes copy(int i, int i2, String str, Reason reason) {
                return new Changes(i, i2, str, reason);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Changes) {
                    Changes changes = (Changes) obj;
                    return this.experienceChanged == changes.experienceChanged && this.levelChanged == changes.levelChanged && Intrinsics.areEqual(this.levelChangedMessage, changes.levelChangedMessage) && Intrinsics.areEqual(this.reason, changes.reason);
                }
                return false;
            }

            public int hashCode() {
                int i = ((this.experienceChanged * 31) + this.levelChanged) * 31;
                String str = this.levelChangedMessage;
                int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
                Reason reason = this.reason;
                return hashCode + (reason != null ? reason.hashCode() : 0);
            }

            public String toString() {
                int i = this.experienceChanged;
                int i2 = this.levelChanged;
                String str = this.levelChangedMessage;
                Reason reason = this.reason;
                return "Changes(experienceChanged=" + i + ", levelChanged=" + i2 + ", levelChangedMessage=" + str + ", reason=" + reason + ")";
            }

            public Changes(int i, int i2, String str, Reason reason) {
                this.experienceChanged = i;
                this.levelChanged = i2;
                this.levelChangedMessage = str;
                this.reason = reason;
            }

            public final int getExperienceChanged() {
                return this.experienceChanged;
            }

            public final int getLevelChanged() {
                return this.levelChanged;
            }

            public final String getLevelChangedMessage() {
                return this.levelChangedMessage;
            }

            public final Reason getReason() {
                return this.reason;
            }

            /* compiled from: MessagesSourceMessage.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate$Changes$Reason;", "", "messageTag", "", "(Ljava/lang/String;)V", "getMessageTag", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes6.dex */
            public static final class Reason {
                private final String messageTag;

                public static /* synthetic */ Reason copy$default(Reason reason, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = reason.messageTag;
                    }
                    return reason.copy(str);
                }

                public final String component1() {
                    return this.messageTag;
                }

                public final Reason copy(String str) {
                    return new Reason(str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Reason) && Intrinsics.areEqual(this.messageTag, ((Reason) obj).messageTag);
                }

                public int hashCode() {
                    String str = this.messageTag;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    String str = this.messageTag;
                    return "Reason(messageTag=" + str + ")";
                }

                public Reason(String str) {
                    this.messageTag = str;
                }

                public final String getMessageTag() {
                    return this.messageTag;
                }
            }
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$NeuronesPurchased;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "change", "", "balance", "(II)V", "getBalance", "()I", "getChange", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NeuronesPurchased extends MessagesSourceMessage {
        private final int balance;
        private final int change;

        public static /* synthetic */ NeuronesPurchased copy$default(NeuronesPurchased neuronesPurchased, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = neuronesPurchased.change;
            }
            if ((i3 & 2) != 0) {
                i2 = neuronesPurchased.balance;
            }
            return neuronesPurchased.copy(i, i2);
        }

        public final int component1() {
            return this.change;
        }

        public final int component2() {
            return this.balance;
        }

        public final NeuronesPurchased copy(int i, int i2) {
            return new NeuronesPurchased(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NeuronesPurchased) {
                NeuronesPurchased neuronesPurchased = (NeuronesPurchased) obj;
                return this.change == neuronesPurchased.change && this.balance == neuronesPurchased.balance;
            }
            return false;
        }

        public int hashCode() {
            return (this.change * 31) + this.balance;
        }

        public String toString() {
            int i = this.change;
            int i2 = this.balance;
            return "NeuronesPurchased(change=" + i + ", balance=" + i2 + ")";
        }

        public NeuronesPurchased(int i, int i2) {
            super(null);
            this.change = i;
            this.balance = i2;
        }

        public final int getBalance() {
            return this.balance;
        }

        public final int getChange() {
            return this.change;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$DailyNeuronsReceived;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "amount", "", "(I)V", "getAmount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DailyNeuronsReceived extends MessagesSourceMessage {
        private final int amount;

        public static /* synthetic */ DailyNeuronsReceived copy$default(DailyNeuronsReceived dailyNeuronsReceived, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dailyNeuronsReceived.amount;
            }
            return dailyNeuronsReceived.copy(i);
        }

        public final int component1() {
            return this.amount;
        }

        public final DailyNeuronsReceived copy(int i) {
            return new DailyNeuronsReceived(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DailyNeuronsReceived) && this.amount == ((DailyNeuronsReceived) obj).amount;
        }

        public int hashCode() {
            return this.amount;
        }

        public String toString() {
            int i = this.amount;
            return "DailyNeuronsReceived(amount=" + i + ")";
        }

        public DailyNeuronsReceived(int i) {
            super(null);
            this.amount = i;
        }

        public final int getAmount() {
            return this.amount;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$AccountUpgraded;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AccountUpgraded extends MessagesSourceMessage {
        public static final AccountUpgraded INSTANCE = new AccountUpgraded();

        private AccountUpgraded() {
            super(null);
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$BotDataChanged;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "name", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", "ethnicity", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "personality", "Lcom/ifriend/domain/models/profile/bot/Personality;", "(Ljava/lang/String;Lcom/ifriend/domain/models/profile/Gender;Lcom/ifriend/domain/models/profile/Birthday;Lcom/ifriend/domain/models/profile/bot/Ethnicity;Lcom/ifriend/domain/models/profile/bot/Personality;)V", "getBirthday", "()Lcom/ifriend/domain/models/profile/Birthday;", "getEthnicity", "()Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "getGender", "()Lcom/ifriend/domain/models/profile/Gender;", "getName", "()Ljava/lang/String;", "getPersonality", "()Lcom/ifriend/domain/models/profile/bot/Personality;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotDataChanged extends MessagesSourceMessage {
        private final Birthday birthday;
        private final Ethnicity ethnicity;
        private final Gender gender;
        private final String name;
        private final Personality personality;

        public static /* synthetic */ BotDataChanged copy$default(BotDataChanged botDataChanged, String str, Gender gender, Birthday birthday, Ethnicity ethnicity, Personality personality, int i, Object obj) {
            if ((i & 1) != 0) {
                str = botDataChanged.name;
            }
            if ((i & 2) != 0) {
                gender = botDataChanged.gender;
            }
            Gender gender2 = gender;
            if ((i & 4) != 0) {
                birthday = botDataChanged.birthday;
            }
            Birthday birthday2 = birthday;
            if ((i & 8) != 0) {
                ethnicity = botDataChanged.ethnicity;
            }
            Ethnicity ethnicity2 = ethnicity;
            if ((i & 16) != 0) {
                personality = botDataChanged.personality;
            }
            return botDataChanged.copy(str, gender2, birthday2, ethnicity2, personality);
        }

        public final String component1() {
            return this.name;
        }

        public final Gender component2() {
            return this.gender;
        }

        public final Birthday component3() {
            return this.birthday;
        }

        public final Ethnicity component4() {
            return this.ethnicity;
        }

        public final Personality component5() {
            return this.personality;
        }

        public final BotDataChanged copy(String str, Gender gender, Birthday birthday, Ethnicity ethnicity, Personality personality) {
            return new BotDataChanged(str, gender, birthday, ethnicity, personality);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotDataChanged) {
                BotDataChanged botDataChanged = (BotDataChanged) obj;
                return Intrinsics.areEqual(this.name, botDataChanged.name) && this.gender == botDataChanged.gender && Intrinsics.areEqual(this.birthday, botDataChanged.birthday) && this.ethnicity == botDataChanged.ethnicity && this.personality == botDataChanged.personality;
            }
            return false;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Gender gender = this.gender;
            int hashCode2 = (hashCode + (gender == null ? 0 : gender.hashCode())) * 31;
            Birthday birthday = this.birthday;
            int hashCode3 = (hashCode2 + (birthday == null ? 0 : birthday.hashCode())) * 31;
            Ethnicity ethnicity = this.ethnicity;
            int hashCode4 = (hashCode3 + (ethnicity == null ? 0 : ethnicity.hashCode())) * 31;
            Personality personality = this.personality;
            return hashCode4 + (personality != null ? personality.hashCode() : 0);
        }

        public String toString() {
            String str = this.name;
            Gender gender = this.gender;
            Birthday birthday = this.birthday;
            Ethnicity ethnicity = this.ethnicity;
            Personality personality = this.personality;
            return "BotDataChanged(name=" + str + ", gender=" + gender + ", birthday=" + birthday + ", ethnicity=" + ethnicity + ", personality=" + personality + ")";
        }

        public final String getName() {
            return this.name;
        }

        public final Gender getGender() {
            return this.gender;
        }

        public final Birthday getBirthday() {
            return this.birthday;
        }

        public final Ethnicity getEthnicity() {
            return this.ethnicity;
        }

        public final Personality getPersonality() {
            return this.personality;
        }

        public BotDataChanged(String str, Gender gender, Birthday birthday, Ethnicity ethnicity, Personality personality) {
            super(null);
            this.name = str;
            this.gender = gender;
            this.birthday = birthday;
            this.ethnicity = ethnicity;
            this.personality = personality;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$AddDiaryNotes;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "notes", "", "Lcom/ifriend/domain/models/diary/DiaryNote;", "(Ljava/util/List;)V", "getNotes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AddDiaryNotes extends MessagesSourceMessage {
        private final List<DiaryNote> notes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AddDiaryNotes copy$default(AddDiaryNotes addDiaryNotes, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = addDiaryNotes.notes;
            }
            return addDiaryNotes.copy(list);
        }

        public final List<DiaryNote> component1() {
            return this.notes;
        }

        public final AddDiaryNotes copy(List<DiaryNote> notes) {
            Intrinsics.checkNotNullParameter(notes, "notes");
            return new AddDiaryNotes(notes);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddDiaryNotes) && Intrinsics.areEqual(this.notes, ((AddDiaryNotes) obj).notes);
        }

        public int hashCode() {
            return this.notes.hashCode();
        }

        public String toString() {
            List<DiaryNote> list = this.notes;
            return "AddDiaryNotes(notes=" + list + ")";
        }

        public final List<DiaryNote> getNotes() {
            return this.notes;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddDiaryNotes(List<DiaryNote> notes) {
            super(null);
            Intrinsics.checkNotNullParameter(notes, "notes");
            this.notes = notes;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarsGenerated;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "generatedAvatars", "Lcom/ifriend/domain/models/avatar/GeneratedAvatars;", "(Lcom/ifriend/domain/models/avatar/GeneratedAvatars;)V", "getGeneratedAvatars", "()Lcom/ifriend/domain/models/avatar/GeneratedAvatars;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AvatarsGenerated extends MessagesSourceMessage {
        private final GeneratedAvatars generatedAvatars;

        public static /* synthetic */ AvatarsGenerated copy$default(AvatarsGenerated avatarsGenerated, GeneratedAvatars generatedAvatars, int i, Object obj) {
            if ((i & 1) != 0) {
                generatedAvatars = avatarsGenerated.generatedAvatars;
            }
            return avatarsGenerated.copy(generatedAvatars);
        }

        public final GeneratedAvatars component1() {
            return this.generatedAvatars;
        }

        public final AvatarsGenerated copy(GeneratedAvatars generatedAvatars) {
            Intrinsics.checkNotNullParameter(generatedAvatars, "generatedAvatars");
            return new AvatarsGenerated(generatedAvatars);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvatarsGenerated) && Intrinsics.areEqual(this.generatedAvatars, ((AvatarsGenerated) obj).generatedAvatars);
        }

        public int hashCode() {
            return this.generatedAvatars.hashCode();
        }

        public String toString() {
            GeneratedAvatars generatedAvatars = this.generatedAvatars;
            return "AvatarsGenerated(generatedAvatars=" + generatedAvatars + ")";
        }

        public final GeneratedAvatars getGeneratedAvatars() {
            return this.generatedAvatars;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarsGenerated(GeneratedAvatars generatedAvatars) {
            super(null);
            Intrinsics.checkNotNullParameter(generatedAvatars, "generatedAvatars");
            this.generatedAvatars = generatedAvatars;
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "id", "", "animationPath", "animationStatus", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated$AvatarAnimationGeneratedStatus;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated$AvatarAnimationGeneratedStatus;)V", "getAnimationPath", "()Ljava/lang/String;", "getAnimationStatus", "()Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated$AvatarAnimationGeneratedStatus;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "AvatarAnimationGeneratedStatus", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AvatarAnimationGenerated extends MessagesSourceMessage {
        private final String animationPath;
        private final AvatarAnimationGeneratedStatus animationStatus;
        private final String id;

        public static /* synthetic */ AvatarAnimationGenerated copy$default(AvatarAnimationGenerated avatarAnimationGenerated, String str, String str2, AvatarAnimationGeneratedStatus avatarAnimationGeneratedStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                str = avatarAnimationGenerated.id;
            }
            if ((i & 2) != 0) {
                str2 = avatarAnimationGenerated.animationPath;
            }
            if ((i & 4) != 0) {
                avatarAnimationGeneratedStatus = avatarAnimationGenerated.animationStatus;
            }
            return avatarAnimationGenerated.copy(str, str2, avatarAnimationGeneratedStatus);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.animationPath;
        }

        public final AvatarAnimationGeneratedStatus component3() {
            return this.animationStatus;
        }

        public final AvatarAnimationGenerated copy(String id, String str, AvatarAnimationGeneratedStatus animationStatus) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(animationStatus, "animationStatus");
            return new AvatarAnimationGenerated(id, str, animationStatus);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AvatarAnimationGenerated) {
                AvatarAnimationGenerated avatarAnimationGenerated = (AvatarAnimationGenerated) obj;
                return Intrinsics.areEqual(this.id, avatarAnimationGenerated.id) && Intrinsics.areEqual(this.animationPath, avatarAnimationGenerated.animationPath) && this.animationStatus == avatarAnimationGenerated.animationStatus;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.animationPath;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.animationStatus.hashCode();
        }

        public String toString() {
            String str = this.id;
            String str2 = this.animationPath;
            AvatarAnimationGeneratedStatus avatarAnimationGeneratedStatus = this.animationStatus;
            return "AvatarAnimationGenerated(id=" + str + ", animationPath=" + str2 + ", animationStatus=" + avatarAnimationGeneratedStatus + ")";
        }

        public final String getId() {
            return this.id;
        }

        public final String getAnimationPath() {
            return this.animationPath;
        }

        public final AvatarAnimationGeneratedStatus getAnimationStatus() {
            return this.animationStatus;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvatarAnimationGenerated(String id, String str, AvatarAnimationGeneratedStatus animationStatus) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(animationStatus, "animationStatus");
            this.id = id;
            this.animationPath = str;
            this.animationStatus = animationStatus;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessagesSourceMessage.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated$AvatarAnimationGeneratedStatus;", "", "(Ljava/lang/String;I)V", "SUCCESS", "NO_FACE_DETECTED", "UNKNOWN", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class AvatarAnimationGeneratedStatus {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ AvatarAnimationGeneratedStatus[] $VALUES;
            public static final AvatarAnimationGeneratedStatus SUCCESS = new AvatarAnimationGeneratedStatus("SUCCESS", 0);
            public static final AvatarAnimationGeneratedStatus NO_FACE_DETECTED = new AvatarAnimationGeneratedStatus("NO_FACE_DETECTED", 1);
            public static final AvatarAnimationGeneratedStatus UNKNOWN = new AvatarAnimationGeneratedStatus("UNKNOWN", 2);

            private static final /* synthetic */ AvatarAnimationGeneratedStatus[] $values() {
                return new AvatarAnimationGeneratedStatus[]{SUCCESS, NO_FACE_DETECTED, UNKNOWN};
            }

            public static EnumEntries<AvatarAnimationGeneratedStatus> getEntries() {
                return $ENTRIES;
            }

            public static AvatarAnimationGeneratedStatus valueOf(String str) {
                return (AvatarAnimationGeneratedStatus) Enum.valueOf(AvatarAnimationGeneratedStatus.class, str);
            }

            public static AvatarAnimationGeneratedStatus[] values() {
                return (AvatarAnimationGeneratedStatus[]) $VALUES.clone();
            }

            private AvatarAnimationGeneratedStatus(String str, int i) {
            }

            static {
                AvatarAnimationGeneratedStatus[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }
        }
    }

    /* compiled from: MessagesSourceMessage.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/socket/MessagesSourceMessage$LullabyAvailabilityChanged;", "Lcom/ifriend/domain/socket/MessagesSourceMessage;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class LullabyAvailabilityChanged extends MessagesSourceMessage {
        public static final LullabyAvailabilityChanged INSTANCE = new LullabyAvailabilityChanged();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LullabyAvailabilityChanged) {
                LullabyAvailabilityChanged lullabyAvailabilityChanged = (LullabyAvailabilityChanged) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1267954749;
        }

        public String toString() {
            return "LullabyAvailabilityChanged";
        }

        private LullabyAvailabilityChanged() {
            super(null);
        }
    }
}
