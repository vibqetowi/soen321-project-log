package com.ifriend.domain.logic.chat.subscription;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatSubscriptionInteractor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "", "Empty", "SubscriptionActivated", "SubscriptionUnactivated", "TrialPeriod", "TrialPeriodFinished", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$Empty;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$SubscriptionActivated;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$SubscriptionUnactivated;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$TrialPeriod;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$TrialPeriodFinished;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatSubscriptionState {

    /* compiled from: ChatSubscriptionInteractor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$Empty;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Empty implements ChatSubscriptionState {
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Empty) {
                Empty empty = (Empty) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -432158470;
        }

        public String toString() {
            return "Empty";
        }

        private Empty() {
        }
    }

    /* compiled from: ChatSubscriptionInteractor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$SubscriptionActivated;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionActivated implements ChatSubscriptionState {
        public static final SubscriptionActivated INSTANCE = new SubscriptionActivated();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubscriptionActivated) {
                SubscriptionActivated subscriptionActivated = (SubscriptionActivated) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1492071711;
        }

        public String toString() {
            return "SubscriptionActivated";
        }

        private SubscriptionActivated() {
        }
    }

    /* compiled from: ChatSubscriptionInteractor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$SubscriptionUnactivated;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionUnactivated implements ChatSubscriptionState {
        public static final SubscriptionUnactivated INSTANCE = new SubscriptionUnactivated();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubscriptionUnactivated) {
                SubscriptionUnactivated subscriptionUnactivated = (SubscriptionUnactivated) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 2057901160;
        }

        public String toString() {
            return "SubscriptionUnactivated";
        }

        private SubscriptionUnactivated() {
        }
    }

    /* compiled from: ChatSubscriptionInteractor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$TrialPeriod;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TrialPeriod implements ChatSubscriptionState {
        public static final TrialPeriod INSTANCE = new TrialPeriod();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TrialPeriod) {
                TrialPeriod trialPeriod = (TrialPeriod) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1519036828;
        }

        public String toString() {
            return "TrialPeriod";
        }

        private TrialPeriod() {
        }
    }

    /* compiled from: ChatSubscriptionInteractor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState$TrialPeriodFinished;", "Lcom/ifriend/domain/logic/chat/subscription/ChatSubscriptionState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TrialPeriodFinished implements ChatSubscriptionState {
        public static final TrialPeriodFinished INSTANCE = new TrialPeriodFinished();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TrialPeriodFinished) {
                TrialPeriodFinished trialPeriodFinished = (TrialPeriodFinished) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 606983926;
        }

        public String toString() {
            return "TrialPeriodFinished";
        }

        private TrialPeriodFinished() {
        }
    }
}
