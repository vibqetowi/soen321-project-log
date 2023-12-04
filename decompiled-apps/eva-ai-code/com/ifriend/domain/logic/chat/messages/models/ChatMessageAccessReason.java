package com.ifriend.domain.logic.chat.messages.models;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatMessageAccessReason.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;", "", "BuyPhoto", "TextMessage", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$BuyPhoto;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatMessageAccessReason {

    /* compiled from: ChatMessageAccessReason.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$BuyPhoto;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BuyPhoto implements ChatMessageAccessReason {
        public static final BuyPhoto INSTANCE = new BuyPhoto();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BuyPhoto) {
                BuyPhoto buyPhoto = (BuyPhoto) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1088031563;
        }

        public String toString() {
            return "BuyPhoto";
        }

        private BuyPhoto() {
        }
    }

    /* compiled from: ChatMessageAccessReason.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;", "BuyMessage", "BuyRegeneratingAnswer", "BuySextingMessage", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage$BuyMessage;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage$BuyRegeneratingAnswer;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage$BuySextingMessage;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface TextMessage extends ChatMessageAccessReason {

        /* compiled from: ChatMessageAccessReason.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage$BuySextingMessage;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BuySextingMessage implements TextMessage {
            public static final BuySextingMessage INSTANCE = new BuySextingMessage();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof BuySextingMessage) {
                    BuySextingMessage buySextingMessage = (BuySextingMessage) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1738417028;
            }

            public String toString() {
                return "BuySextingMessage";
            }

            private BuySextingMessage() {
            }
        }

        /* compiled from: ChatMessageAccessReason.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage$BuyRegeneratingAnswer;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BuyRegeneratingAnswer implements TextMessage {
            public static final BuyRegeneratingAnswer INSTANCE = new BuyRegeneratingAnswer();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof BuyRegeneratingAnswer) {
                    BuyRegeneratingAnswer buyRegeneratingAnswer = (BuyRegeneratingAnswer) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 411155052;
            }

            public String toString() {
                return "BuyRegeneratingAnswer";
            }

            private BuyRegeneratingAnswer() {
            }
        }

        /* compiled from: ChatMessageAccessReason.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage$BuyMessage;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason$TextMessage;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BuyMessage implements TextMessage {
            public static final BuyMessage INSTANCE = new BuyMessage();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof BuyMessage) {
                    BuyMessage buyMessage = (BuyMessage) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1585046338;
            }

            public String toString() {
                return "BuyMessage";
            }

            private BuyMessage() {
            }
        }
    }
}
