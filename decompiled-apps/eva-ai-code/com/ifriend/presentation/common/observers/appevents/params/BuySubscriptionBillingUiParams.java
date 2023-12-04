package com.ifriend.presentation.common.observers.appevents.params;

import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppUiParams.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/params/BuySubscriptionBillingUiParams;", "", "requestId", "Ljava/util/UUID;", "goToBuyNeuronsAfterUpgrade", "", "type", "Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "(Ljava/util/UUID;ZLcom/ifriend/presentation/features/purchases/common/model/UpgradeType;Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;)V", "getGoToBuyNeuronsAfterUpgrade", "()Z", "getPurchaseReason", "()Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "getRequestId", "()Ljava/util/UUID;", "getType", "()Lcom/ifriend/presentation/features/purchases/common/model/UpgradeType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuySubscriptionBillingUiParams {
    public static final int $stable = 8;
    private final boolean goToBuyNeuronsAfterUpgrade;
    private final PurchaseReason purchaseReason;
    private final UUID requestId;
    private final UpgradeType type;

    public static /* synthetic */ BuySubscriptionBillingUiParams copy$default(BuySubscriptionBillingUiParams buySubscriptionBillingUiParams, UUID uuid, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = buySubscriptionBillingUiParams.requestId;
        }
        if ((i & 2) != 0) {
            z = buySubscriptionBillingUiParams.goToBuyNeuronsAfterUpgrade;
        }
        if ((i & 4) != 0) {
            upgradeType = buySubscriptionBillingUiParams.type;
        }
        if ((i & 8) != 0) {
            purchaseReason = buySubscriptionBillingUiParams.purchaseReason;
        }
        return buySubscriptionBillingUiParams.copy(uuid, z, upgradeType, purchaseReason);
    }

    public final UUID component1() {
        return this.requestId;
    }

    public final boolean component2() {
        return this.goToBuyNeuronsAfterUpgrade;
    }

    public final UpgradeType component3() {
        return this.type;
    }

    public final PurchaseReason component4() {
        return this.purchaseReason;
    }

    public final BuySubscriptionBillingUiParams copy(UUID requestId, boolean z, UpgradeType type, PurchaseReason purchaseReason) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new BuySubscriptionBillingUiParams(requestId, z, type, purchaseReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuySubscriptionBillingUiParams) {
            BuySubscriptionBillingUiParams buySubscriptionBillingUiParams = (BuySubscriptionBillingUiParams) obj;
            return Intrinsics.areEqual(this.requestId, buySubscriptionBillingUiParams.requestId) && this.goToBuyNeuronsAfterUpgrade == buySubscriptionBillingUiParams.goToBuyNeuronsAfterUpgrade && this.type == buySubscriptionBillingUiParams.type && Intrinsics.areEqual(this.purchaseReason, buySubscriptionBillingUiParams.purchaseReason);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        boolean z = this.goToBuyNeuronsAfterUpgrade;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.type.hashCode()) * 31;
        PurchaseReason purchaseReason = this.purchaseReason;
        return hashCode2 + (purchaseReason == null ? 0 : purchaseReason.hashCode());
    }

    public String toString() {
        UUID uuid = this.requestId;
        boolean z = this.goToBuyNeuronsAfterUpgrade;
        UpgradeType upgradeType = this.type;
        PurchaseReason purchaseReason = this.purchaseReason;
        return "BuySubscriptionBillingUiParams(requestId=" + uuid + ", goToBuyNeuronsAfterUpgrade=" + z + ", type=" + upgradeType + ", purchaseReason=" + purchaseReason + ")";
    }

    public BuySubscriptionBillingUiParams(UUID requestId, boolean z, UpgradeType type, PurchaseReason purchaseReason) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.requestId = requestId;
        this.goToBuyNeuronsAfterUpgrade = z;
        this.type = type;
        this.purchaseReason = purchaseReason;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BuySubscriptionBillingUiParams(UUID uuid, boolean z, UpgradeType upgradeType, PurchaseReason purchaseReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? false : z, upgradeType, (i & 8) != 0 ? null : purchaseReason);
        if ((i & 1) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
    }

    public final UUID getRequestId() {
        return this.requestId;
    }

    public final boolean getGoToBuyNeuronsAfterUpgrade() {
        return this.goToBuyNeuronsAfterUpgrade;
    }

    public final UpgradeType getType() {
        return this.type;
    }

    public final PurchaseReason getPurchaseReason() {
        return this.purchaseReason;
    }
}
