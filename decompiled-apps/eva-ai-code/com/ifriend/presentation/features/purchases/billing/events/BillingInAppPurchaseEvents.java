package com.ifriend.presentation.features.purchases.billing.events;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BillingInAppPurchaseEvents.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents;", "", NotificationCompat.CATEGORY_EVENT, "", "(Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "AwaitUpdateBalanceFailure", "BuyChatMessage", "InAppPurchaseProductFailure", "InAppPurchaseProductSuccessful", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$AwaitUpdateBalanceFailure;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$InAppPurchaseProductFailure;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$InAppPurchaseProductSuccessful;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BillingInAppPurchaseEvents {
    public static final int $stable = 0;
    private final String event;

    public /* synthetic */ BillingInAppPurchaseEvents(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private BillingInAppPurchaseEvents(String str) {
        this.event = str;
    }

    public String getEvent() {
        return this.event;
    }

    /* compiled from: BillingInAppPurchaseEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$InAppPurchaseProductSuccessful;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InAppPurchaseProductSuccessful extends BillingInAppPurchaseEvents {
        public static final int $stable = 0;
        public static final InAppPurchaseProductSuccessful INSTANCE = new InAppPurchaseProductSuccessful();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InAppPurchaseProductSuccessful) {
                InAppPurchaseProductSuccessful inAppPurchaseProductSuccessful = (InAppPurchaseProductSuccessful) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1781329002;
        }

        public String toString() {
            return "InAppPurchaseProductSuccessful";
        }

        private InAppPurchaseProductSuccessful() {
            super("in-app-purchase-product-successful", null);
        }
    }

    /* compiled from: BillingInAppPurchaseEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$InAppPurchaseProductFailure;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InAppPurchaseProductFailure extends BillingInAppPurchaseEvents {
        public static final int $stable = 0;
        public static final InAppPurchaseProductFailure INSTANCE = new InAppPurchaseProductFailure();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InAppPurchaseProductFailure) {
                InAppPurchaseProductFailure inAppPurchaseProductFailure = (InAppPurchaseProductFailure) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 677429690;
        }

        public String toString() {
            return "InAppPurchaseProductFailure";
        }

        private InAppPurchaseProductFailure() {
            super("in-app-purchase-product-failure", null);
        }
    }

    /* compiled from: BillingInAppPurchaseEvents.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents;", NotificationCompat.CATEGORY_EVENT, "", "(Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "ErrorBuyChatMessage", "StartBuyChatMessage", "SuccessfulBuyChatMessage", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage$ErrorBuyChatMessage;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage$StartBuyChatMessage;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage$SuccessfulBuyChatMessage;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class BuyChatMessage extends BillingInAppPurchaseEvents {
        public static final int $stable = 0;
        private final String event;

        public /* synthetic */ BuyChatMessage(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private BuyChatMessage(String str) {
            super(str, null);
            this.event = str;
        }

        @Override // com.ifriend.presentation.features.purchases.billing.events.BillingInAppPurchaseEvents
        public String getEvent() {
            return this.event;
        }

        /* compiled from: BillingInAppPurchaseEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage$StartBuyChatMessage;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartBuyChatMessage extends BuyChatMessage {
            public static final int $stable = 0;
            public static final StartBuyChatMessage INSTANCE = new StartBuyChatMessage();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StartBuyChatMessage) {
                    StartBuyChatMessage startBuyChatMessage = (StartBuyChatMessage) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -282474332;
            }

            public String toString() {
                return "StartBuyChatMessage";
            }

            private StartBuyChatMessage() {
                super("start-in-app-buy-chat-message", null);
            }
        }

        /* compiled from: BillingInAppPurchaseEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage$SuccessfulBuyChatMessage;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class SuccessfulBuyChatMessage extends BuyChatMessage {
            public static final int $stable = 0;
            public static final SuccessfulBuyChatMessage INSTANCE = new SuccessfulBuyChatMessage();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SuccessfulBuyChatMessage) {
                    SuccessfulBuyChatMessage successfulBuyChatMessage = (SuccessfulBuyChatMessage) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1792593802;
            }

            public String toString() {
                return "SuccessfulBuyChatMessage";
            }

            private SuccessfulBuyChatMessage() {
                super("successful-in-app-buy-chat-message", null);
            }
        }

        /* compiled from: BillingInAppPurchaseEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage$ErrorBuyChatMessage;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$BuyChatMessage;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ErrorBuyChatMessage extends BuyChatMessage {
            public static final int $stable = 0;
            public static final ErrorBuyChatMessage INSTANCE = new ErrorBuyChatMessage();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ErrorBuyChatMessage) {
                    ErrorBuyChatMessage errorBuyChatMessage = (ErrorBuyChatMessage) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 697301962;
            }

            public String toString() {
                return "ErrorBuyChatMessage";
            }

            private ErrorBuyChatMessage() {
                super("error-in-app-buy-chat-message", null);
            }
        }
    }

    /* compiled from: BillingInAppPurchaseEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents$AwaitUpdateBalanceFailure;", "Lcom/ifriend/presentation/features/purchases/billing/events/BillingInAppPurchaseEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AwaitUpdateBalanceFailure extends BillingInAppPurchaseEvents {
        public static final int $stable = 0;
        public static final AwaitUpdateBalanceFailure INSTANCE = new AwaitUpdateBalanceFailure();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AwaitUpdateBalanceFailure) {
                AwaitUpdateBalanceFailure awaitUpdateBalanceFailure = (AwaitUpdateBalanceFailure) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1510677007;
        }

        public String toString() {
            return "AwaitUpdateBalanceFailure";
        }

        private AwaitUpdateBalanceFailure() {
            super("error-in-app-wait-update-balance", null);
        }
    }
}
