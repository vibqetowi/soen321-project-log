package com.ifiend.billing.impl.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BillingClientEvents.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents;", "", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "BillingError", "BillingRetryConnectionError", "ConfirmPurchases", "EndBillingConnection", "GetProducts", "LaunchBillingFlow", "PurchasesFlow", "RestorePurchases", "StartBillingConnection", "Lcom/ifiend/billing/impl/events/BillingClientEvents$BillingError;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$BillingRetryConnectionError;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$EndBillingConnection;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$GetProducts;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$RestorePurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$StartBillingConnection;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$StartBillingConnection$Connected;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$StartBillingConnection$ServiceDisconnected;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$StartBillingConnection$StartConnection;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BillingClientEvents {
    private final String eventName;

    public /* synthetic */ BillingClientEvents(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private BillingClientEvents(String str) {
        this.eventName = str;
    }

    public String getEventName() {
        return this.eventName;
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$StartBillingConnection;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "Connected", "ServiceDisconnected", "StartConnection", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class StartBillingConnection extends BillingClientEvents {
        private final String eventName;

        public /* synthetic */ StartBillingConnection(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ifiend.billing.impl.events.BillingClientEvents
        public String getEventName() {
            return this.eventName;
        }

        private StartBillingConnection(String str) {
            super(str, null);
            this.eventName = str;
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$StartBillingConnection$StartConnection;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartConnection extends BillingClientEvents {
            public static final StartConnection INSTANCE = new StartConnection();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StartConnection) {
                    StartConnection startConnection = (StartConnection) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1786080164;
            }

            public String toString() {
                return "StartConnection";
            }

            private StartConnection() {
                super("start-billing-connection", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$StartBillingConnection$Connected;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Connected extends BillingClientEvents {
            public static final Connected INSTANCE = new Connected();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Connected) {
                    Connected connected = (Connected) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -728353587;
            }

            public String toString() {
                return "Connected";
            }

            private Connected() {
                super("billing-connected", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$StartBillingConnection$ServiceDisconnected;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ServiceDisconnected extends BillingClientEvents {
            public static final ServiceDisconnected INSTANCE = new ServiceDisconnected();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ServiceDisconnected) {
                    ServiceDisconnected serviceDisconnected = (ServiceDisconnected) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1350877612;
            }

            public String toString() {
                return "ServiceDisconnected";
            }

            private ServiceDisconnected() {
                super("billing-service-disconnected", null);
            }
        }
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "BillingNotReady", "Launch", "Launched", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow$BillingNotReady;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow$Launch;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow$Launched;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$AcknowledgePurchase;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$AcknowledgePurchaseSuccessful;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$AcknowledgePurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$AcknowledgePurchasesError;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$PurchasesUpdated;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class LaunchBillingFlow extends BillingClientEvents {
        private final String eventName;

        public /* synthetic */ LaunchBillingFlow(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @Override // com.ifiend.billing.impl.events.BillingClientEvents
        public String getEventName() {
            return this.eventName;
        }

        private LaunchBillingFlow(String str) {
            super(str, null);
            this.eventName = str;
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow$Launch;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Launch extends LaunchBillingFlow {
            public static final Launch INSTANCE = new Launch();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Launch) {
                    Launch launch = (Launch) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -540037434;
            }

            public String toString() {
                return "Launch";
            }

            private Launch() {
                super("launch-billing-flow", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow$BillingNotReady;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BillingNotReady extends LaunchBillingFlow {
            public static final BillingNotReady INSTANCE = new BillingNotReady();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof BillingNotReady) {
                    BillingNotReady billingNotReady = (BillingNotReady) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1362026376;
            }

            public String toString() {
                return "BillingNotReady";
            }

            private BillingNotReady() {
                super("launch-billing-flow-is-not-ready", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow$Launched;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Launched extends LaunchBillingFlow {
            public static final Launched INSTANCE = new Launched();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Launched) {
                    Launched launched = (Launched) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 715071973;
            }

            public String toString() {
                return "Launched";
            }

            private Launched() {
                super("launched-billing-flow", null);
            }
        }
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "AcknowledgePurchase", "AcknowledgePurchaseSuccessful", "AcknowledgePurchases", "AcknowledgePurchasesError", "PurchasesUpdated", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class PurchasesFlow extends BillingClientEvents {
        private final String eventName;

        public /* synthetic */ PurchasesFlow(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private PurchasesFlow(String str) {
            super(str, null);
            this.eventName = str;
        }

        @Override // com.ifiend.billing.impl.events.BillingClientEvents
        public String getEventName() {
            return this.eventName;
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$PurchasesUpdated;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class PurchasesUpdated extends LaunchBillingFlow {
            public static final PurchasesUpdated INSTANCE = new PurchasesUpdated();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof PurchasesUpdated) {
                    PurchasesUpdated purchasesUpdated = (PurchasesUpdated) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -464963694;
            }

            public String toString() {
                return "PurchasesUpdated";
            }

            private PurchasesUpdated() {
                super("purchases-updated", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$AcknowledgePurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class AcknowledgePurchases extends LaunchBillingFlow {
            public static final AcknowledgePurchases INSTANCE = new AcknowledgePurchases();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AcknowledgePurchases) {
                    AcknowledgePurchases acknowledgePurchases = (AcknowledgePurchases) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 225615519;
            }

            public String toString() {
                return "AcknowledgePurchases";
            }

            private AcknowledgePurchases() {
                super("start-acknowledge-purchases-flow", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$AcknowledgePurchase;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class AcknowledgePurchase extends LaunchBillingFlow {
            public static final AcknowledgePurchase INSTANCE = new AcknowledgePurchase();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AcknowledgePurchase) {
                    AcknowledgePurchase acknowledgePurchase = (AcknowledgePurchase) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -269816748;
            }

            public String toString() {
                return "AcknowledgePurchase";
            }

            private AcknowledgePurchase() {
                super("start-acknowledge-purchase", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$AcknowledgePurchaseSuccessful;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class AcknowledgePurchaseSuccessful extends LaunchBillingFlow {
            public static final AcknowledgePurchaseSuccessful INSTANCE = new AcknowledgePurchaseSuccessful();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AcknowledgePurchaseSuccessful) {
                    AcknowledgePurchaseSuccessful acknowledgePurchaseSuccessful = (AcknowledgePurchaseSuccessful) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1906959858;
            }

            public String toString() {
                return "AcknowledgePurchaseSuccessful";
            }

            private AcknowledgePurchaseSuccessful() {
                super("success-acknowledge-purchase", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$PurchasesFlow$AcknowledgePurchasesError;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$LaunchBillingFlow;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class AcknowledgePurchasesError extends LaunchBillingFlow {
            public static final AcknowledgePurchasesError INSTANCE = new AcknowledgePurchasesError();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AcknowledgePurchasesError) {
                    AcknowledgePurchasesError acknowledgePurchasesError = (AcknowledgePurchasesError) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 987008681;
            }

            public String toString() {
                return "AcknowledgePurchasesError";
            }

            private AcknowledgePurchasesError() {
                super("error-acknowledge-purchase", null);
            }
        }
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$GetProducts;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "QueryProductDetails", "Lcom/ifiend/billing/impl/events/BillingClientEvents$GetProducts$QueryProductDetails;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class GetProducts extends BillingClientEvents {
        private final String eventName;

        public /* synthetic */ GetProducts(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private GetProducts(String str) {
            super(str, null);
            this.eventName = str;
        }

        @Override // com.ifiend.billing.impl.events.BillingClientEvents
        public String getEventName() {
            return this.eventName;
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$GetProducts$QueryProductDetails;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$GetProducts;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class QueryProductDetails extends GetProducts {
            public static final QueryProductDetails INSTANCE = new QueryProductDetails();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof QueryProductDetails) {
                    QueryProductDetails queryProductDetails = (QueryProductDetails) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -445708020;
            }

            public String toString() {
                return "QueryProductDetails";
            }

            private QueryProductDetails() {
                super("success-query-product-details", null);
            }
        }
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "ConfirmPurchaseError", "ConfirmPurchaseSuccess", "EndConfirmPurchases", "StartConfirmPurchase", "StartConfirmPurchases", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$ConfirmPurchaseError;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$ConfirmPurchaseSuccess;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$EndConfirmPurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$StartConfirmPurchase;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$StartConfirmPurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$RestorePurchases$EndRestorePurchase;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$RestorePurchases$StartRestorePurchase;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class ConfirmPurchases extends BillingClientEvents {
        private final String eventName;

        public /* synthetic */ ConfirmPurchases(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private ConfirmPurchases(String str) {
            super(str, null);
            this.eventName = str;
        }

        @Override // com.ifiend.billing.impl.events.BillingClientEvents
        public String getEventName() {
            return this.eventName;
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$StartConfirmPurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartConfirmPurchases extends ConfirmPurchases {
            public static final StartConfirmPurchases INSTANCE = new StartConfirmPurchases();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StartConfirmPurchases) {
                    StartConfirmPurchases startConfirmPurchases = (StartConfirmPurchases) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 797110323;
            }

            public String toString() {
                return "StartConfirmPurchases";
            }

            private StartConfirmPurchases() {
                super("start-confirm-purchases-flow", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$StartConfirmPurchase;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartConfirmPurchase extends ConfirmPurchases {
            public static final StartConfirmPurchase INSTANCE = new StartConfirmPurchase();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StartConfirmPurchase) {
                    StartConfirmPurchase startConfirmPurchase = (StartConfirmPurchase) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -528476096;
            }

            public String toString() {
                return "StartConfirmPurchase";
            }

            private StartConfirmPurchase() {
                super("start-confirm-purchase", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$ConfirmPurchaseSuccess;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ConfirmPurchaseSuccess extends ConfirmPurchases {
            public static final ConfirmPurchaseSuccess INSTANCE = new ConfirmPurchaseSuccess();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ConfirmPurchaseSuccess) {
                    ConfirmPurchaseSuccess confirmPurchaseSuccess = (ConfirmPurchaseSuccess) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 525416899;
            }

            public String toString() {
                return "ConfirmPurchaseSuccess";
            }

            private ConfirmPurchaseSuccess() {
                super("success-confirm-purchase", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$ConfirmPurchaseError;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ConfirmPurchaseError extends ConfirmPurchases {
            public static final ConfirmPurchaseError INSTANCE = new ConfirmPurchaseError();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ConfirmPurchaseError) {
                    ConfirmPurchaseError confirmPurchaseError = (ConfirmPurchaseError) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1969996856;
            }

            public String toString() {
                return "ConfirmPurchaseError";
            }

            private ConfirmPurchaseError() {
                super("error-confirm-purchases", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases$EndConfirmPurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class EndConfirmPurchases extends ConfirmPurchases {
            public static final EndConfirmPurchases INSTANCE = new EndConfirmPurchases();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof EndConfirmPurchases) {
                    EndConfirmPurchases endConfirmPurchases = (EndConfirmPurchases) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1543678356;
            }

            public String toString() {
                return "EndConfirmPurchases";
            }

            private EndConfirmPurchases() {
                super("end-confirm-purchase-flow", null);
            }
        }
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$RestorePurchases;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "eventName", "", "(Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "EndRestorePurchase", "StartRestorePurchase", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class RestorePurchases extends BillingClientEvents {
        private final String eventName;

        public /* synthetic */ RestorePurchases(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private RestorePurchases(String str) {
            super(str, null);
            this.eventName = str;
        }

        @Override // com.ifiend.billing.impl.events.BillingClientEvents
        public String getEventName() {
            return this.eventName;
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$RestorePurchases$StartRestorePurchase;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class StartRestorePurchase extends ConfirmPurchases {
            public static final StartRestorePurchase INSTANCE = new StartRestorePurchase();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof StartRestorePurchase) {
                    StartRestorePurchase startRestorePurchase = (StartRestorePurchase) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -2092030628;
            }

            public String toString() {
                return "StartRestorePurchase";
            }

            private StartRestorePurchase() {
                super("start-restore-purchase-flow", null);
            }
        }

        /* compiled from: BillingClientEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$RestorePurchases$EndRestorePurchase;", "Lcom/ifiend/billing/impl/events/BillingClientEvents$ConfirmPurchases;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class EndRestorePurchase extends ConfirmPurchases {
            public static final EndRestorePurchase INSTANCE = new EndRestorePurchase();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof EndRestorePurchase) {
                    EndRestorePurchase endRestorePurchase = (EndRestorePurchase) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -915861629;
            }

            public String toString() {
                return "EndRestorePurchase";
            }

            private EndRestorePurchase() {
                super("end-restore-purchase-flow", null);
            }
        }
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$BillingRetryConnectionError;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingRetryConnectionError extends BillingClientEvents {
        public static final BillingRetryConnectionError INSTANCE = new BillingRetryConnectionError();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingRetryConnectionError) {
                BillingRetryConnectionError billingRetryConnectionError = (BillingRetryConnectionError) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -184411998;
        }

        public String toString() {
            return "BillingRetryConnectionError";
        }

        private BillingRetryConnectionError() {
            super("error-retry-billing-connection", null);
        }
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$BillingError;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BillingError extends BillingClientEvents {
        public static final BillingError INSTANCE = new BillingError();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingError) {
                BillingError billingError = (BillingError) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -247153816;
        }

        public String toString() {
            return "BillingError";
        }

        private BillingError() {
            super("billing-error", null);
        }
    }

    /* compiled from: BillingClientEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifiend/billing/impl/events/BillingClientEvents$EndBillingConnection;", "Lcom/ifiend/billing/impl/events/BillingClientEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class EndBillingConnection extends BillingClientEvents {
        public static final EndBillingConnection INSTANCE = new EndBillingConnection();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EndBillingConnection) {
                EndBillingConnection endBillingConnection = (EndBillingConnection) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 313025593;
        }

        public String toString() {
            return "EndBillingConnection";
        }

        private EndBillingConnection() {
            super("end-billing-connection", null);
        }
    }
}
