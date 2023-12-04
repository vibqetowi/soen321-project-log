package com.ifriend.presentation.navigation.destination;

import com.ifriend.presentation.navigation.navflow.NavcontrollerKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FeaturesDestination.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/ChatCallDestination;", "Lcom/ifriend/presentation/navigation/destination/NavigationDestination;", "destination", "", "(Ljava/lang/String;)V", "getDestination", "()Ljava/lang/String;", "ChatCall", "RouteFlow", "Lcom/ifriend/presentation/navigation/destination/ChatCallDestination$ChatCall;", "Lcom/ifriend/presentation/navigation/destination/ChatCallDestination$RouteFlow;", "Lcom/ifriend/presentation/navigation/destination/ChatSubscriptionDestination$RouteFlow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ChatCallDestination implements NavigationDestination {
    public static final int $stable = 0;
    private final String destination;

    public /* synthetic */ ChatCallDestination(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ChatCallDestination(String str) {
        this.destination = str;
    }

    @Override // com.ifriend.presentation.navigation.destination.NavigationDestination
    public String getDestination() {
        return this.destination;
    }

    /* compiled from: FeaturesDestination.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/ChatCallDestination$RouteFlow;", "Lcom/ifriend/presentation/navigation/destination/ChatCallDestination;", "()V", RouteFlow.ChatId, "", "route", "getRoute", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RouteFlow extends ChatCallDestination {
        public static final int $stable = 0;
        public static final String ChatId = "ChatId";
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
            return -252526137;
        }

        public String toString() {
            return "RouteFlow";
        }

        private RouteFlow() {
            super("chat_call_flow", null);
        }

        public final String getRoute() {
            return NavcontrollerKt.withArguments(getDestination(), TuplesKt.to(ChatId, "{ChatId}"));
        }
    }

    /* compiled from: FeaturesDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/ChatCallDestination$ChatCall;", "Lcom/ifriend/presentation/navigation/destination/ChatCallDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ChatCall extends ChatCallDestination {
        public static final int $stable = 0;
        public static final ChatCall INSTANCE = new ChatCall();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChatCall) {
                ChatCall chatCall = (ChatCall) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1700436262;
        }

        public String toString() {
            return "ChatCall";
        }

        private ChatCall() {
            super("chat_call", null);
        }
    }
}
