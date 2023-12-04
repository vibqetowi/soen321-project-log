package com.ifriend.domain.logic.chat.models;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatsState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatsState;", "", "ChatListChats", "SingleChat", "Lcom/ifriend/domain/logic/chat/models/ChatsState$ChatListChats;", "Lcom/ifriend/domain/logic/chat/models/ChatsState$SingleChat;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatsState {

    /* compiled from: ChatsState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatsState$SingleChat;", "Lcom/ifriend/domain/logic/chat/models/ChatsState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SingleChat implements ChatsState {
        public static final SingleChat INSTANCE = new SingleChat();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SingleChat) {
                SingleChat singleChat = (SingleChat) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -864526428;
        }

        public String toString() {
            return "SingleChat";
        }

        private SingleChat() {
        }
    }

    /* compiled from: ChatsState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatsState$ChatListChats;", "Lcom/ifriend/domain/logic/chat/models/ChatsState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ChatListChats implements ChatsState {
        public static final ChatListChats INSTANCE = new ChatListChats();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChatListChats) {
                ChatListChats chatListChats = (ChatListChats) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1764673345;
        }

        public String toString() {
            return "ChatListChats";
        }

        private ChatListChats() {
        }
    }
}
