package com.ifriend.presentation.features.purchases.chatsubscription.subscription.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSubscriptionOfferUi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006#"}, d2 = {"Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferUi;", "", "productId", "", "subscriptionMonths", "monthLabel", "monthPriceLabel", "priceLabel", "isSelected", "", "badge", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferBadgesUi;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferBadgesUi;)V", "getBadge", "()Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/models/ChatSubscriptionOfferBadgesUi;", "()Z", "getMonthLabel", "()Ljava/lang/String;", "getMonthPriceLabel", "getPriceLabel", "getProductId", "getSubscriptionMonths", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionOfferUi {
    public static final int $stable = 0;
    private final ChatSubscriptionOfferBadgesUi badge;
    private final boolean isSelected;
    private final String monthLabel;
    private final String monthPriceLabel;
    private final String priceLabel;
    private final String productId;
    private final String subscriptionMonths;

    public static /* synthetic */ ChatSubscriptionOfferUi copy$default(ChatSubscriptionOfferUi chatSubscriptionOfferUi, String str, String str2, String str3, String str4, String str5, boolean z, ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSubscriptionOfferUi.productId;
        }
        if ((i & 2) != 0) {
            str2 = chatSubscriptionOfferUi.subscriptionMonths;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = chatSubscriptionOfferUi.monthLabel;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = chatSubscriptionOfferUi.monthPriceLabel;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = chatSubscriptionOfferUi.priceLabel;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = chatSubscriptionOfferUi.isSelected;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            chatSubscriptionOfferBadgesUi = chatSubscriptionOfferUi.badge;
        }
        return chatSubscriptionOfferUi.copy(str, str6, str7, str8, str9, z2, chatSubscriptionOfferBadgesUi);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.subscriptionMonths;
    }

    public final String component3() {
        return this.monthLabel;
    }

    public final String component4() {
        return this.monthPriceLabel;
    }

    public final String component5() {
        return this.priceLabel;
    }

    public final boolean component6() {
        return this.isSelected;
    }

    public final ChatSubscriptionOfferBadgesUi component7() {
        return this.badge;
    }

    public final ChatSubscriptionOfferUi copy(String productId, String subscriptionMonths, String monthLabel, String monthPriceLabel, String priceLabel, boolean z, ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(subscriptionMonths, "subscriptionMonths");
        Intrinsics.checkNotNullParameter(monthLabel, "monthLabel");
        Intrinsics.checkNotNullParameter(monthPriceLabel, "monthPriceLabel");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        return new ChatSubscriptionOfferUi(productId, subscriptionMonths, monthLabel, monthPriceLabel, priceLabel, z, chatSubscriptionOfferBadgesUi);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatSubscriptionOfferUi) {
            ChatSubscriptionOfferUi chatSubscriptionOfferUi = (ChatSubscriptionOfferUi) obj;
            return Intrinsics.areEqual(this.productId, chatSubscriptionOfferUi.productId) && Intrinsics.areEqual(this.subscriptionMonths, chatSubscriptionOfferUi.subscriptionMonths) && Intrinsics.areEqual(this.monthLabel, chatSubscriptionOfferUi.monthLabel) && Intrinsics.areEqual(this.monthPriceLabel, chatSubscriptionOfferUi.monthPriceLabel) && Intrinsics.areEqual(this.priceLabel, chatSubscriptionOfferUi.priceLabel) && this.isSelected == chatSubscriptionOfferUi.isSelected && Intrinsics.areEqual(this.badge, chatSubscriptionOfferUi.badge);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.productId.hashCode() * 31) + this.subscriptionMonths.hashCode()) * 31) + this.monthLabel.hashCode()) * 31) + this.monthPriceLabel.hashCode()) * 31) + this.priceLabel.hashCode()) * 31;
        boolean z = this.isSelected;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi = this.badge;
        return i2 + (chatSubscriptionOfferBadgesUi == null ? 0 : chatSubscriptionOfferBadgesUi.hashCode());
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.subscriptionMonths;
        String str3 = this.monthLabel;
        String str4 = this.monthPriceLabel;
        String str5 = this.priceLabel;
        boolean z = this.isSelected;
        ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi = this.badge;
        return "ChatSubscriptionOfferUi(productId=" + str + ", subscriptionMonths=" + str2 + ", monthLabel=" + str3 + ", monthPriceLabel=" + str4 + ", priceLabel=" + str5 + ", isSelected=" + z + ", badge=" + chatSubscriptionOfferBadgesUi + ")";
    }

    public ChatSubscriptionOfferUi(String productId, String subscriptionMonths, String monthLabel, String monthPriceLabel, String priceLabel, boolean z, ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(subscriptionMonths, "subscriptionMonths");
        Intrinsics.checkNotNullParameter(monthLabel, "monthLabel");
        Intrinsics.checkNotNullParameter(monthPriceLabel, "monthPriceLabel");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        this.productId = productId;
        this.subscriptionMonths = subscriptionMonths;
        this.monthLabel = monthLabel;
        this.monthPriceLabel = monthPriceLabel;
        this.priceLabel = priceLabel;
        this.isSelected = z;
        this.badge = chatSubscriptionOfferBadgesUi;
    }

    public /* synthetic */ ChatSubscriptionOfferUi(String str, String str2, String str3, String str4, String str5, boolean z, ChatSubscriptionOfferBadgesUi chatSubscriptionOfferBadgesUi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : chatSubscriptionOfferBadgesUi);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getSubscriptionMonths() {
        return this.subscriptionMonths;
    }

    public final String getMonthLabel() {
        return this.monthLabel;
    }

    public final String getMonthPriceLabel() {
        return this.monthPriceLabel;
    }

    public final String getPriceLabel() {
        return this.priceLabel;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final ChatSubscriptionOfferBadgesUi getBadge() {
        return this.badge;
    }
}
