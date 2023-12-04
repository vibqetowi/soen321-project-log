package com.ifriend.domain.newChat.chat.systems.messages.sending.send;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SendingMessagesQueue.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0018\u0019J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0019\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue;", "", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$Listener;", "delete", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "(Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessageWithTag", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "(Lcom/ifriend/domain/newChat/chat/models/MessageTag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "put", "messageToSend", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeListener", "Listener", "QueuedMessage", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SendingMessagesQueue {

    /* compiled from: SendingMessagesQueue.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$Listener;", "", "onMessageRemoved", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "onNewMessageAdded", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Listener {

        /* compiled from: SendingMessagesQueue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
            public static void onMessageRemoved(Listener listener, QueuedMessage message) {
                Intrinsics.checkNotNullParameter(message, "message");
            }

            public static void onNewMessageAdded(Listener listener, QueuedMessage message) {
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        void onMessageRemoved(QueuedMessage queuedMessage);

        void onNewMessageAdded(QueuedMessage queuedMessage);
    }

    void addListener(Listener listener);

    Object delete(QueuedMessage queuedMessage, Continuation<? super Unit> continuation);

    Object deleteMessageWithTag(MessageTag messageTag, Continuation<? super Unit> continuation);

    Object getAll(Continuation<? super List<QueuedMessage>> continuation);

    Object put(MessageToSend messageToSend, String str, Continuation<? super Unit> continuation);

    void removeListener(Listener listener);

    /* compiled from: SendingMessagesQueue.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "", "id", "", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", AnalyticsConstants.TIMESTAMP, "", "messageToSend", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "chatId", "(Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/MessageTag;JLcom/ifriend/domain/newChat/chat/models/MessageToSend;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getId", "getMessageToSend", "()Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "getTag", "()Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class QueuedMessage {
        private final String chatId;
        private final String id;
        private final MessageToSend messageToSend;
        private final MessageTag tag;
        private final long timestamp;

        public static /* synthetic */ QueuedMessage copy$default(QueuedMessage queuedMessage, String str, MessageTag messageTag, long j, MessageToSend messageToSend, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = queuedMessage.id;
            }
            if ((i & 2) != 0) {
                messageTag = queuedMessage.tag;
            }
            MessageTag messageTag2 = messageTag;
            if ((i & 4) != 0) {
                j = queuedMessage.timestamp;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                messageToSend = queuedMessage.messageToSend;
            }
            MessageToSend messageToSend2 = messageToSend;
            if ((i & 16) != 0) {
                str2 = queuedMessage.chatId;
            }
            return queuedMessage.copy(str, messageTag2, j2, messageToSend2, str2);
        }

        public final String component1() {
            return this.id;
        }

        public final MessageTag component2() {
            return this.tag;
        }

        public final long component3() {
            return this.timestamp;
        }

        public final MessageToSend component4() {
            return this.messageToSend;
        }

        public final String component5() {
            return this.chatId;
        }

        public final QueuedMessage copy(String id, MessageTag tag, long j, MessageToSend messageToSend, String chatId) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(messageToSend, "messageToSend");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            return new QueuedMessage(id, tag, j, messageToSend, chatId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof QueuedMessage) {
                QueuedMessage queuedMessage = (QueuedMessage) obj;
                return Intrinsics.areEqual(this.id, queuedMessage.id) && Intrinsics.areEqual(this.tag, queuedMessage.tag) && this.timestamp == queuedMessage.timestamp && Intrinsics.areEqual(this.messageToSend, queuedMessage.messageToSend) && Intrinsics.areEqual(this.chatId, queuedMessage.chatId);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.tag.hashCode()) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp)) * 31) + this.messageToSend.hashCode()) * 31) + this.chatId.hashCode();
        }

        public String toString() {
            String str = this.id;
            MessageTag messageTag = this.tag;
            long j = this.timestamp;
            MessageToSend messageToSend = this.messageToSend;
            String str2 = this.chatId;
            return "QueuedMessage(id=" + str + ", tag=" + messageTag + ", timestamp=" + j + ", messageToSend=" + messageToSend + ", chatId=" + str2 + ")";
        }

        public QueuedMessage(String id, MessageTag tag, long j, MessageToSend messageToSend, String chatId) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(messageToSend, "messageToSend");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            this.id = id;
            this.tag = tag;
            this.timestamp = j;
            this.messageToSend = messageToSend;
            this.chatId = chatId;
        }

        public final String getId() {
            return this.id;
        }

        public final MessageTag getTag() {
            return this.tag;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final MessageToSend getMessageToSend() {
            return this.messageToSend;
        }

        public final String getChatId() {
            return this.chatId;
        }
    }
}
