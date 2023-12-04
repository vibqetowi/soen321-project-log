package com.ifriend.data.networking.api.chat.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatsRootRemote.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/ChatsRootRemote;", "", "chatList", "", "Lcom/ifriend/data/networking/api/chat/models/ChatsRootRemote$ChatRemote;", "(Ljava/util/List;)V", "getChatList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ChatRemote", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsRootRemote {
    @SerializedName("chatList")
    private final List<ChatRemote> chatList;

    public ChatsRootRemote() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatsRootRemote copy$default(ChatsRootRemote chatsRootRemote, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chatsRootRemote.chatList;
        }
        return chatsRootRemote.copy(list);
    }

    public final List<ChatRemote> component1() {
        return this.chatList;
    }

    public final ChatsRootRemote copy(List<ChatRemote> list) {
        return new ChatsRootRemote(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatsRootRemote) && Intrinsics.areEqual(this.chatList, ((ChatsRootRemote) obj).chatList);
    }

    public int hashCode() {
        List<ChatRemote> list = this.chatList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<ChatRemote> list = this.chatList;
        return "ChatsRootRemote(chatList=" + list + ")";
    }

    public ChatsRootRemote(List<ChatRemote> list) {
        this.chatList = list;
    }

    public /* synthetic */ ChatsRootRemote(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<ChatRemote> getChatList() {
        return this.chatList;
    }

    /* compiled from: ChatsRootRemote.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/ChatsRootRemote$ChatRemote;", "", "uid", "", "chatId", "paymentConditions", "Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote;)V", "getChatId", "()Ljava/lang/String;", "getPaymentConditions", "()Lcom/ifriend/data/networking/api/chat/models/ChatPaymentConditionsRemote;", "getUid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ChatRemote {
        @SerializedName("botId")
        private final String chatId;
        @SerializedName("conditions")
        private final ChatPaymentConditionsRemote paymentConditions;
        @SerializedName("uid")
        private final String uid;

        public static /* synthetic */ ChatRemote copy$default(ChatRemote chatRemote, String str, String str2, ChatPaymentConditionsRemote chatPaymentConditionsRemote, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatRemote.uid;
            }
            if ((i & 2) != 0) {
                str2 = chatRemote.chatId;
            }
            if ((i & 4) != 0) {
                chatPaymentConditionsRemote = chatRemote.paymentConditions;
            }
            return chatRemote.copy(str, str2, chatPaymentConditionsRemote);
        }

        public final String component1() {
            return this.uid;
        }

        public final String component2() {
            return this.chatId;
        }

        public final ChatPaymentConditionsRemote component3() {
            return this.paymentConditions;
        }

        public final ChatRemote copy(String str, String str2, ChatPaymentConditionsRemote chatPaymentConditionsRemote) {
            return new ChatRemote(str, str2, chatPaymentConditionsRemote);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChatRemote) {
                ChatRemote chatRemote = (ChatRemote) obj;
                return Intrinsics.areEqual(this.uid, chatRemote.uid) && Intrinsics.areEqual(this.chatId, chatRemote.chatId) && Intrinsics.areEqual(this.paymentConditions, chatRemote.paymentConditions);
            }
            return false;
        }

        public int hashCode() {
            String str = this.uid;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.chatId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ChatPaymentConditionsRemote chatPaymentConditionsRemote = this.paymentConditions;
            return hashCode2 + (chatPaymentConditionsRemote != null ? chatPaymentConditionsRemote.hashCode() : 0);
        }

        public String toString() {
            String str = this.uid;
            String str2 = this.chatId;
            ChatPaymentConditionsRemote chatPaymentConditionsRemote = this.paymentConditions;
            return "ChatRemote(uid=" + str + ", chatId=" + str2 + ", paymentConditions=" + chatPaymentConditionsRemote + ")";
        }

        public ChatRemote(String str, String str2, ChatPaymentConditionsRemote chatPaymentConditionsRemote) {
            this.uid = str;
            this.chatId = str2;
            this.paymentConditions = chatPaymentConditionsRemote;
        }

        public final String getUid() {
            return this.uid;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final ChatPaymentConditionsRemote getPaymentConditions() {
            return this.paymentConditions;
        }
    }
}
