package com.ifriend.presentation.common.observers.appevents.params;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppUiParams.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatMessageBillingUiParams;", "", "requestId", "Ljava/util/UUID;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "upgradeType", "Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "chatId", "", "(Ljava/util/UUID;Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getPurchaseReason", "()Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "getPurchaseSource", "()Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "getRequestId", "()Ljava/util/UUID;", "getUpgradeType", "()Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyChatMessageBillingUiParams {
    public static final int $stable = 8;
    private final String chatId;
    private final PurchaseReason purchaseReason;
    private final PurchaseSource purchaseSource;
    private final UUID requestId;
    private final UpgradeType upgradeType;

    public static /* synthetic */ BuyChatMessageBillingUiParams copy$default(BuyChatMessageBillingUiParams buyChatMessageBillingUiParams, UUID uuid, PurchaseReason purchaseReason, PurchaseSource purchaseSource, UpgradeType upgradeType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = buyChatMessageBillingUiParams.requestId;
        }
        if ((i & 2) != 0) {
            purchaseReason = buyChatMessageBillingUiParams.purchaseReason;
        }
        PurchaseReason purchaseReason2 = purchaseReason;
        if ((i & 4) != 0) {
            purchaseSource = buyChatMessageBillingUiParams.purchaseSource;
        }
        PurchaseSource purchaseSource2 = purchaseSource;
        if ((i & 8) != 0) {
            upgradeType = buyChatMessageBillingUiParams.upgradeType;
        }
        UpgradeType upgradeType2 = upgradeType;
        if ((i & 16) != 0) {
            str = buyChatMessageBillingUiParams.chatId;
        }
        return buyChatMessageBillingUiParams.copy(uuid, purchaseReason2, purchaseSource2, upgradeType2, str);
    }

    public final UUID component1() {
        return this.requestId;
    }

    public final PurchaseReason component2() {
        return this.purchaseReason;
    }

    public final PurchaseSource component3() {
        return this.purchaseSource;
    }

    public final UpgradeType component4() {
        return this.upgradeType;
    }

    public final String component5() {
        return this.chatId;
    }

    public final BuyChatMessageBillingUiParams copy(UUID requestId, PurchaseReason purchaseReason, PurchaseSource purchaseSource, UpgradeType upgradeType, String chatId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(upgradeType, "upgradeType");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new BuyChatMessageBillingUiParams(requestId, purchaseReason, purchaseSource, upgradeType, chatId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyChatMessageBillingUiParams) {
            BuyChatMessageBillingUiParams buyChatMessageBillingUiParams = (BuyChatMessageBillingUiParams) obj;
            return Intrinsics.areEqual(this.requestId, buyChatMessageBillingUiParams.requestId) && Intrinsics.areEqual(this.purchaseReason, buyChatMessageBillingUiParams.purchaseReason) && this.purchaseSource == buyChatMessageBillingUiParams.purchaseSource && this.upgradeType == buyChatMessageBillingUiParams.upgradeType && Intrinsics.areEqual(this.chatId, buyChatMessageBillingUiParams.chatId);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.requestId.hashCode() * 31) + this.purchaseReason.hashCode()) * 31) + this.purchaseSource.hashCode()) * 31) + this.upgradeType.hashCode()) * 31) + this.chatId.hashCode();
    }

    public String toString() {
        UUID uuid = this.requestId;
        PurchaseReason purchaseReason = this.purchaseReason;
        PurchaseSource purchaseSource = this.purchaseSource;
        UpgradeType upgradeType = this.upgradeType;
        String str = this.chatId;
        return "BuyChatMessageBillingUiParams(requestId=" + uuid + ", purchaseReason=" + purchaseReason + ", purchaseSource=" + purchaseSource + ", upgradeType=" + upgradeType + ", chatId=" + str + ")";
    }

    public BuyChatMessageBillingUiParams(UUID requestId, PurchaseReason purchaseReason, PurchaseSource purchaseSource, UpgradeType upgradeType, String chatId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(upgradeType, "upgradeType");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.requestId = requestId;
        this.purchaseReason = purchaseReason;
        this.purchaseSource = purchaseSource;
        this.upgradeType = upgradeType;
        this.chatId = chatId;
    }

    public final UUID getRequestId() {
        return this.requestId;
    }

    public final PurchaseReason getPurchaseReason() {
        return this.purchaseReason;
    }

    public final PurchaseSource getPurchaseSource() {
        return this.purchaseSource;
    }

    public final UpgradeType getUpgradeType() {
        return this.upgradeType;
    }

    public final String getChatId() {
        return this.chatId;
    }
}
