package com.ifriend.domain.logic.chat.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatInfo.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "", "Free", "Paid", "Purchase", "Subscription", "TrialPeriod", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$Free;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$Paid;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$Purchase;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$Subscription;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$TrialPeriod;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatPaymentStatus {

    /* compiled from: ChatInfo.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$Free;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Free implements ChatPaymentStatus {
        public static final Free INSTANCE = new Free();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Free) {
                Free free = (Free) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1545604110;
        }

        public String toString() {
            return "Free";
        }

        private Free() {
        }
    }

    /* compiled from: ChatInfo.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$Paid;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Paid implements ChatPaymentStatus {
        public static final Paid INSTANCE = new Paid();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Paid) {
                Paid paid = (Paid) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1545885806;
        }

        public String toString() {
            return "Paid";
        }

        private Paid() {
        }
    }

    /* compiled from: ChatInfo.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$Subscription;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "hasSubscription", "", "(Z)V", "getHasSubscription", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Subscription implements ChatPaymentStatus {
        private final boolean hasSubscription;

        public static /* synthetic */ Subscription copy$default(Subscription subscription, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = subscription.hasSubscription;
            }
            return subscription.copy(z);
        }

        public final boolean component1() {
            return this.hasSubscription;
        }

        public final Subscription copy(boolean z) {
            return new Subscription(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Subscription) && this.hasSubscription == ((Subscription) obj).hasSubscription;
        }

        public int hashCode() {
            boolean z = this.hasSubscription;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.hasSubscription;
            return "Subscription(hasSubscription=" + z + ")";
        }

        public Subscription(boolean z) {
            this.hasSubscription = z;
        }

        public final boolean getHasSubscription() {
            return this.hasSubscription;
        }
    }

    /* compiled from: ChatInfo.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$Purchase;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Purchase implements ChatPaymentStatus {
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
            return -1178510941;
        }

        public String toString() {
            return "Purchase";
        }

        private Purchase() {
        }
    }

    /* compiled from: ChatInfo.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus$TrialPeriod;", "Lcom/ifriend/domain/logic/chat/models/ChatPaymentStatus;", "optionals", "", "Lcom/ifriend/domain/logic/chat/models/ChatInfoTrialOptions;", "(Ljava/util/List;)V", "getOptionals", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TrialPeriod implements ChatPaymentStatus {
        private final List<ChatInfoTrialOptions> optionals;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TrialPeriod copy$default(TrialPeriod trialPeriod, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = trialPeriod.optionals;
            }
            return trialPeriod.copy(list);
        }

        public final List<ChatInfoTrialOptions> component1() {
            return this.optionals;
        }

        public final TrialPeriod copy(List<ChatInfoTrialOptions> optionals) {
            Intrinsics.checkNotNullParameter(optionals, "optionals");
            return new TrialPeriod(optionals);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrialPeriod) && Intrinsics.areEqual(this.optionals, ((TrialPeriod) obj).optionals);
        }

        public int hashCode() {
            return this.optionals.hashCode();
        }

        public String toString() {
            List<ChatInfoTrialOptions> list = this.optionals;
            return "TrialPeriod(optionals=" + list + ")";
        }

        public TrialPeriod(List<ChatInfoTrialOptions> optionals) {
            Intrinsics.checkNotNullParameter(optionals, "optionals");
            this.optionals = optionals;
        }

        public final List<ChatInfoTrialOptions> getOptionals() {
            return this.optionals;
        }
    }
}
