package com.ifriend.presentation.navigation.destination;

import com.ifriend.presentation.navigation.navflow.NavcontrollerKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FeaturesDestination.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination;", "Lcom/ifriend/presentation/navigation/destination/NavigationDestination;", "destination", "", "(Ljava/lang/String;)V", "getDestination", "()Ljava/lang/String;", "ActiveSubscription", "RouteFlow", "Subscription", "SubscriptionBenefits", "Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination$ActiveSubscription;", "Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination$Subscription;", "Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination$SubscriptionBenefits;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ChatSubscriptionDestination implements NavigationDestination {
    public static final int $stable = 0;
    private final String destination;

    public /* synthetic */ ChatSubscriptionDestination(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ChatSubscriptionDestination(String str) {
        this.destination = str;
    }

    @Override // com.ifriend.presentation.navigation.destination.NavigationDestination
    public String getDestination() {
        return this.destination;
    }

    /* compiled from: FeaturesDestination.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination$RouteFlow;", "Lcom/ifriend/presentation/navigation/destination/ChatCallDestination;", "()V", RouteFlow.ChatArgs, "", "route", "getRoute", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RouteFlow extends ChatCallDestination {
        public static final int $stable = 0;
        public static final String ChatArgs = "ChatArgs";
        public static final RouteFlow INSTANCE = new RouteFlow();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RouteFlow) {
                RouteFlow routeFlow = (RouteFlow) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -106720664;
        }

        public String toString() {
            return "RouteFlow";
        }

        private RouteFlow() {
            super("chat_subscription_flow", null);
        }

        public final String getRoute() {
            return NavcontrollerKt.withArguments(getDestination(), TuplesKt.to(ChatArgs, "{ChatArgs}"));
        }
    }

    /* compiled from: FeaturesDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination$Subscription;", "Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Subscription extends ChatSubscriptionDestination {
        public static final int $stable = 0;
        public static final Subscription INSTANCE = new Subscription();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Subscription) {
                Subscription subscription = (Subscription) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -736095188;
        }

        public String toString() {
            return "Subscription";
        }

        private Subscription() {
            super("chat_subscription", null);
        }
    }

    /* compiled from: FeaturesDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination$SubscriptionBenefits;", "Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SubscriptionBenefits extends ChatSubscriptionDestination {
        public static final int $stable = 0;
        public static final SubscriptionBenefits INSTANCE = new SubscriptionBenefits();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SubscriptionBenefits) {
                SubscriptionBenefits subscriptionBenefits = (SubscriptionBenefits) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -253334776;
        }

        public String toString() {
            return "SubscriptionBenefits";
        }

        private SubscriptionBenefits() {
            super("chat_subscription_benefits", null);
        }
    }

    /* compiled from: FeaturesDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination$ActiveSubscription;", "Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ActiveSubscription extends ChatSubscriptionDestination {
        public static final int $stable = 0;
        public static final ActiveSubscription INSTANCE = new ActiveSubscription();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActiveSubscription) {
                ActiveSubscription activeSubscription = (ActiveSubscription) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1575733010;
        }

        public String toString() {
            return "ActiveSubscription";
        }

        private ActiveSubscription() {
            super("chat_active_subscription", null);
        }
    }
}
