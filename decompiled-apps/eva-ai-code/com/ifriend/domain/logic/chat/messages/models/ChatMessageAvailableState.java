package com.ifriend.domain.logic.chat.messages.models;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatMessageAvailableState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\b\tR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState;", "", "isAvailable", "", "()Z", "isNeedPayForMessage", "isNeedSubscription", "Available", "Purchase", "Subscription", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState$Available;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState$Purchase;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState$Subscription;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatMessageAvailableState {
    boolean isAvailable();

    boolean isNeedPayForMessage();

    boolean isNeedSubscription();

    /* compiled from: ChatMessageAvailableState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static boolean isAvailable(ChatMessageAvailableState chatMessageAvailableState) {
            return chatMessageAvailableState instanceof Available;
        }

        public static boolean isNeedSubscription(ChatMessageAvailableState chatMessageAvailableState) {
            return chatMessageAvailableState instanceof Subscription;
        }

        public static boolean isNeedPayForMessage(ChatMessageAvailableState chatMessageAvailableState) {
            return chatMessageAvailableState instanceof Purchase;
        }
    }

    /* compiled from: ChatMessageAvailableState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState$Available;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Available implements ChatMessageAvailableState {
        public static final Available INSTANCE = new Available();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Available) {
                Available available = (Available) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1204892096;
        }

        public String toString() {
            return "Available";
        }

        private Available() {
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isAvailable() {
            return DefaultImpls.isAvailable(this);
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isNeedPayForMessage() {
            return DefaultImpls.isNeedPayForMessage(this);
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isNeedSubscription() {
            return DefaultImpls.isNeedSubscription(this);
        }
    }

    /* compiled from: ChatMessageAvailableState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState$Subscription;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState;", "isNeedPay", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Subscription implements ChatMessageAvailableState {
        private final boolean isNeedPay;

        public static /* synthetic */ Subscription copy$default(Subscription subscription, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = subscription.isNeedPay;
            }
            return subscription.copy(z);
        }

        public final boolean component1() {
            return this.isNeedPay;
        }

        public final Subscription copy(boolean z) {
            return new Subscription(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Subscription) && this.isNeedPay == ((Subscription) obj).isNeedPay;
        }

        public int hashCode() {
            boolean z = this.isNeedPay;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.isNeedPay;
            return "Subscription(isNeedPay=" + z + ")";
        }

        public Subscription(boolean z) {
            this.isNeedPay = z;
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isAvailable() {
            return DefaultImpls.isAvailable(this);
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isNeedPayForMessage() {
            return DefaultImpls.isNeedPayForMessage(this);
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isNeedSubscription() {
            return DefaultImpls.isNeedSubscription(this);
        }

        public final boolean isNeedPay() {
            return this.isNeedPay;
        }
    }

    /* compiled from: ChatMessageAvailableState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState$Purchase;", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Purchase implements ChatMessageAvailableState {
        public static final Purchase INSTANCE = new Purchase();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1390224170;
        }

        public String toString() {
            return "Purchase";
        }

        private Purchase() {
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isAvailable() {
            return DefaultImpls.isAvailable(this);
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isNeedPayForMessage() {
            return DefaultImpls.isNeedPayForMessage(this);
        }

        @Override // com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState
        public boolean isNeedSubscription() {
            return DefaultImpls.isNeedSubscription(this);
        }
    }
}
