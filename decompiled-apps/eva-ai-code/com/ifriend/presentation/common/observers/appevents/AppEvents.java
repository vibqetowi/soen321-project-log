package com.ifriend.presentation.common.observers.appevents;

import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.logic.purchase.PurchaseType;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatMessageBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppEvents.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "", "Billing", "Chat", "LogOut", "Navigation", "OnboardingSubmitted", "OpenLink", "PurchaseInfo", "RestartApp", "ShowInAppNotification", "StartChatFlow", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$LogOut;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$OnboardingSubmitted;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$OpenLink;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$RestartApp;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$ShowInAppNotification;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppEvents {

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$OnboardingSubmitted;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OnboardingSubmitted implements AppEvents {
        public static final int $stable = 0;
        public static final OnboardingSubmitted INSTANCE = new OnboardingSubmitted();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OnboardingSubmitted) {
                OnboardingSubmitted onboardingSubmitted = (OnboardingSubmitted) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1553739900;
        }

        public String toString() {
            return "OnboardingSubmitted";
        }

        private OnboardingSubmitted() {
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", RtspHeaders.Values.MODE, "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow$NavigationMode;", "(Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow$NavigationMode;)V", "getMode", "()Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow$NavigationMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "NavigationMode", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class StartChatFlow implements AppEvents {
        public static final int $stable = 0;
        private final NavigationMode mode;

        public static /* synthetic */ StartChatFlow copy$default(StartChatFlow startChatFlow, NavigationMode navigationMode, int i, Object obj) {
            if ((i & 1) != 0) {
                navigationMode = startChatFlow.mode;
            }
            return startChatFlow.copy(navigationMode);
        }

        public final NavigationMode component1() {
            return this.mode;
        }

        public final StartChatFlow copy(NavigationMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            return new StartChatFlow(mode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartChatFlow) && this.mode == ((StartChatFlow) obj).mode;
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        public String toString() {
            NavigationMode navigationMode = this.mode;
            return "StartChatFlow(mode=" + navigationMode + ")";
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$StartChatFlow$NavigationMode;", "", "(Ljava/lang/String;I)V", "START_APP", "FINISHED_ONBOARDING", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NavigationMode {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ NavigationMode[] $VALUES;
            public static final NavigationMode START_APP = new NavigationMode("START_APP", 0);
            public static final NavigationMode FINISHED_ONBOARDING = new NavigationMode("FINISHED_ONBOARDING", 1);

            private static final /* synthetic */ NavigationMode[] $values() {
                return new NavigationMode[]{START_APP, FINISHED_ONBOARDING};
            }

            public static EnumEntries<NavigationMode> getEntries() {
                return $ENTRIES;
            }

            public static NavigationMode valueOf(String str) {
                return (NavigationMode) Enum.valueOf(NavigationMode.class, str);
            }

            public static NavigationMode[] values() {
                return (NavigationMode[]) $VALUES.clone();
            }

            private NavigationMode(String str, int i) {
            }

            static {
                NavigationMode[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }
        }

        public StartChatFlow(NavigationMode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.mode = mode;
        }

        public final NavigationMode getMode() {
            return this.mode;
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "BuyChatMessage", "BuyChatSubscription", "BuyNeurons", "BuySubscription", "PurchaseCompleted", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$BuyChatMessage;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$BuyChatSubscription;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$BuyNeurons;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$BuySubscription;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$PurchaseCompleted;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Billing extends AppEvents {

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$BuyNeurons;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;)V", "getParams", "()Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BuyNeurons implements Billing {
            public static final int $stable = 8;
            private final BuyNeuronsBillingUiParams params;

            public static /* synthetic */ BuyNeurons copy$default(BuyNeurons buyNeurons, BuyNeuronsBillingUiParams buyNeuronsBillingUiParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    buyNeuronsBillingUiParams = buyNeurons.params;
                }
                return buyNeurons.copy(buyNeuronsBillingUiParams);
            }

            public final BuyNeuronsBillingUiParams component1() {
                return this.params;
            }

            public final BuyNeurons copy(BuyNeuronsBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new BuyNeurons(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BuyNeurons) && Intrinsics.areEqual(this.params, ((BuyNeurons) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                BuyNeuronsBillingUiParams buyNeuronsBillingUiParams = this.params;
                return "BuyNeurons(params=" + buyNeuronsBillingUiParams + ")";
            }

            public BuyNeurons(BuyNeuronsBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final BuyNeuronsBillingUiParams getParams() {
                return this.params;
            }
        }

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$BuySubscription;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;)V", "getParams", "()Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BuySubscription implements Billing {
            public static final int $stable = 8;
            private final BuySubscriptionBillingUiParams params;

            public static /* synthetic */ BuySubscription copy$default(BuySubscription buySubscription, BuySubscriptionBillingUiParams buySubscriptionBillingUiParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    buySubscriptionBillingUiParams = buySubscription.params;
                }
                return buySubscription.copy(buySubscriptionBillingUiParams);
            }

            public final BuySubscriptionBillingUiParams component1() {
                return this.params;
            }

            public final BuySubscription copy(BuySubscriptionBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new BuySubscription(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BuySubscription) && Intrinsics.areEqual(this.params, ((BuySubscription) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                BuySubscriptionBillingUiParams buySubscriptionBillingUiParams = this.params;
                return "BuySubscription(params=" + buySubscriptionBillingUiParams + ")";
            }

            public BuySubscription(BuySubscriptionBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final BuySubscriptionBillingUiParams getParams() {
                return this.params;
            }
        }

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$BuyChatSubscription;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;)V", "getParams", "()Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BuyChatSubscription implements Billing {
            public static final int $stable = 8;
            private final BuyChatSubscriptionBillingUiParams params;

            public static /* synthetic */ BuyChatSubscription copy$default(BuyChatSubscription buyChatSubscription, BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    buyChatSubscriptionBillingUiParams = buyChatSubscription.params;
                }
                return buyChatSubscription.copy(buyChatSubscriptionBillingUiParams);
            }

            public final BuyChatSubscriptionBillingUiParams component1() {
                return this.params;
            }

            public final BuyChatSubscription copy(BuyChatSubscriptionBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new BuyChatSubscription(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BuyChatSubscription) && Intrinsics.areEqual(this.params, ((BuyChatSubscription) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams = this.params;
                return "BuyChatSubscription(params=" + buyChatSubscriptionBillingUiParams + ")";
            }

            public BuyChatSubscription(BuyChatSubscriptionBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final BuyChatSubscriptionBillingUiParams getParams() {
                return this.params;
            }
        }

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$BuyChatMessage;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatMessageBillingUiParams;", "(Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatMessageBillingUiParams;)V", "getParams", "()Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatMessageBillingUiParams;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BuyChatMessage implements Billing {
            public static final int $stable = 8;
            private final BuyChatMessageBillingUiParams params;

            public static /* synthetic */ BuyChatMessage copy$default(BuyChatMessage buyChatMessage, BuyChatMessageBillingUiParams buyChatMessageBillingUiParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    buyChatMessageBillingUiParams = buyChatMessage.params;
                }
                return buyChatMessage.copy(buyChatMessageBillingUiParams);
            }

            public final BuyChatMessageBillingUiParams component1() {
                return this.params;
            }

            public final BuyChatMessage copy(BuyChatMessageBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new BuyChatMessage(params);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BuyChatMessage) && Intrinsics.areEqual(this.params, ((BuyChatMessage) obj).params);
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            public String toString() {
                BuyChatMessageBillingUiParams buyChatMessageBillingUiParams = this.params;
                return "BuyChatMessage(params=" + buyChatMessageBillingUiParams + ")";
            }

            public BuyChatMessage(BuyChatMessageBillingUiParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public final BuyChatMessageBillingUiParams getParams() {
                return this.params;
            }
        }

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing$PurchaseCompleted;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Billing;", "type", "Lcom/ifriend/domain/logic/purchase/PurchaseType;", "(Lcom/ifriend/domain/logic/purchase/PurchaseType;)V", "getType", "()Lcom/ifriend/domain/logic/purchase/PurchaseType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class PurchaseCompleted implements Billing {
            public static final int $stable = 0;
            private final PurchaseType type;

            public static /* synthetic */ PurchaseCompleted copy$default(PurchaseCompleted purchaseCompleted, PurchaseType purchaseType, int i, Object obj) {
                if ((i & 1) != 0) {
                    purchaseType = purchaseCompleted.type;
                }
                return purchaseCompleted.copy(purchaseType);
            }

            public final PurchaseType component1() {
                return this.type;
            }

            public final PurchaseCompleted copy(PurchaseType type) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new PurchaseCompleted(type);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PurchaseCompleted) && this.type == ((PurchaseCompleted) obj).type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                PurchaseType purchaseType = this.type;
                return "PurchaseCompleted(type=" + purchaseType + ")";
            }

            public PurchaseCompleted(PurchaseType type) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
            }

            public final PurchaseType getType() {
                return this.type;
            }
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "ShowPrivacyPolicy", "ShowTermsOfConditions", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo$ShowPrivacyPolicy;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo$ShowTermsOfConditions;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface PurchaseInfo extends AppEvents {

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo$ShowPrivacyPolicy;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ShowPrivacyPolicy implements PurchaseInfo {
            public static final int $stable = 0;
            public static final ShowPrivacyPolicy INSTANCE = new ShowPrivacyPolicy();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ShowPrivacyPolicy) {
                    ShowPrivacyPolicy showPrivacyPolicy = (ShowPrivacyPolicy) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 121377530;
            }

            public String toString() {
                return "ShowPrivacyPolicy";
            }

            private ShowPrivacyPolicy() {
            }
        }

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo$ShowTermsOfConditions;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$PurchaseInfo;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class ShowTermsOfConditions implements PurchaseInfo {
            public static final int $stable = 0;
            public static final ShowTermsOfConditions INSTANCE = new ShowTermsOfConditions();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ShowTermsOfConditions) {
                    ShowTermsOfConditions showTermsOfConditions = (ShowTermsOfConditions) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1562599626;
            }

            public String toString() {
                return "ShowTermsOfConditions";
            }

            private ShowTermsOfConditions() {
            }
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$RestartApp;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RestartApp implements AppEvents {
        public static final int $stable = 0;
        public static final RestartApp INSTANCE = new RestartApp();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RestartApp) {
                RestartApp restartApp = (RestartApp) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 432023214;
        }

        public String toString() {
            return "RestartApp";
        }

        private RestartApp() {
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "RefreshConfiguration", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat$RefreshConfiguration;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Chat extends AppEvents {

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat$RefreshConfiguration;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Chat;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class RefreshConfiguration implements Chat {
            public static final int $stable = 0;
            public static final RefreshConfiguration INSTANCE = new RefreshConfiguration();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RefreshConfiguration) {
                    RefreshConfiguration refreshConfiguration = (RefreshConfiguration) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1141242315;
            }

            public String toString() {
                return "RefreshConfiguration";
            }

            private RefreshConfiguration() {
            }
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$ShowInAppNotification;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ShowInAppNotification implements AppEvents {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ ShowInAppNotification copy$default(ShowInAppNotification showInAppNotification, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showInAppNotification.message;
            }
            return showInAppNotification.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final ShowInAppNotification copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ShowInAppNotification(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowInAppNotification) && Intrinsics.areEqual(this.message, ((ShowInAppNotification) obj).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            String str = this.message;
            return "ShowInAppNotification(message=" + str + ")";
        }

        public ShowInAppNotification(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "BackToChatFlow", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation$BackToChatFlow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Navigation extends AppEvents {

        /* compiled from: AppEvents.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation$BackToChatFlow;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents$Navigation;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class BackToChatFlow implements Navigation {
            public static final int $stable = 0;
            public static final BackToChatFlow INSTANCE = new BackToChatFlow();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof BackToChatFlow) {
                    BackToChatFlow backToChatFlow = (BackToChatFlow) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1979256026;
            }

            public String toString() {
                return "BackToChatFlow";
            }

            private BackToChatFlow() {
            }
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$OpenLink;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "link", "", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OpenLink implements AppEvents {
        public static final int $stable = 0;
        private final String link;

        public static /* synthetic */ OpenLink copy$default(OpenLink openLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openLink.link;
            }
            return openLink.copy(str);
        }

        public final String component1() {
            return this.link;
        }

        public final OpenLink copy(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new OpenLink(link);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenLink) && Intrinsics.areEqual(this.link, ((OpenLink) obj).link);
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        public String toString() {
            String str = this.link;
            return "OpenLink(link=" + str + ")";
        }

        public OpenLink(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }

        public final String getLink() {
            return this.link;
        }
    }

    /* compiled from: AppEvents.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/AppEvents$LogOut;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "hard", "", "(Z)V", "getHard", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class LogOut implements AppEvents {
        public static final int $stable = 0;
        private final boolean hard;

        public LogOut() {
            this(false, 1, null);
        }

        public static /* synthetic */ LogOut copy$default(LogOut logOut, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = logOut.hard;
            }
            return logOut.copy(z);
        }

        public final boolean component1() {
            return this.hard;
        }

        public final LogOut copy(boolean z) {
            return new LogOut(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LogOut) && this.hard == ((LogOut) obj).hard;
        }

        public int hashCode() {
            boolean z = this.hard;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.hard;
            return "LogOut(hard=" + z + ")";
        }

        public LogOut(boolean z) {
            this.hard = z;
        }

        public /* synthetic */ LogOut(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getHard() {
            return this.hard;
        }
    }
}
