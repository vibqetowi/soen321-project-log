package com.ifriend.presentation.common.observers.appevents.params;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppUiParams.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ifriend/presentation/common/observers/appevents/params/BuyNeuronsBillingUiParams;", "", "goToUpgradeAfterDismiss", "", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "requestId", "Ljava/util/UUID;", "(ZLcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;Ljava/util/UUID;)V", "getGoToUpgradeAfterDismiss", "()Z", "getPurchaseReason", "()Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "getPurchaseSource", "()Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "getRequestId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBillingUiParams {
    public static final int $stable = 8;
    private final boolean goToUpgradeAfterDismiss;
    private final PurchaseReason purchaseReason;
    private final PurchaseSource purchaseSource;
    private final UUID requestId;

    public static /* synthetic */ BuyNeuronsBillingUiParams copy$default(BuyNeuronsBillingUiParams buyNeuronsBillingUiParams, boolean z, PurchaseReason purchaseReason, PurchaseSource purchaseSource, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            z = buyNeuronsBillingUiParams.goToUpgradeAfterDismiss;
        }
        if ((i & 2) != 0) {
            purchaseReason = buyNeuronsBillingUiParams.purchaseReason;
        }
        if ((i & 4) != 0) {
            purchaseSource = buyNeuronsBillingUiParams.purchaseSource;
        }
        if ((i & 8) != 0) {
            uuid = buyNeuronsBillingUiParams.requestId;
        }
        return buyNeuronsBillingUiParams.copy(z, purchaseReason, purchaseSource, uuid);
    }

    public final boolean component1() {
        return this.goToUpgradeAfterDismiss;
    }

    public final PurchaseReason component2() {
        return this.purchaseReason;
    }

    public final PurchaseSource component3() {
        return this.purchaseSource;
    }

    public final UUID component4() {
        return this.requestId;
    }

    public final BuyNeuronsBillingUiParams copy(boolean z, PurchaseReason purchaseReason, PurchaseSource purchaseSource, UUID requestId) {
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new BuyNeuronsBillingUiParams(z, purchaseReason, purchaseSource, requestId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BuyNeuronsBillingUiParams) {
            BuyNeuronsBillingUiParams buyNeuronsBillingUiParams = (BuyNeuronsBillingUiParams) obj;
            return this.goToUpgradeAfterDismiss == buyNeuronsBillingUiParams.goToUpgradeAfterDismiss && Intrinsics.areEqual(this.purchaseReason, buyNeuronsBillingUiParams.purchaseReason) && this.purchaseSource == buyNeuronsBillingUiParams.purchaseSource && Intrinsics.areEqual(this.requestId, buyNeuronsBillingUiParams.requestId);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.goToUpgradeAfterDismiss;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        PurchaseReason purchaseReason = this.purchaseReason;
        return ((((i + (purchaseReason == null ? 0 : purchaseReason.hashCode())) * 31) + this.purchaseSource.hashCode()) * 31) + this.requestId.hashCode();
    }

    public String toString() {
        boolean z = this.goToUpgradeAfterDismiss;
        PurchaseReason purchaseReason = this.purchaseReason;
        PurchaseSource purchaseSource = this.purchaseSource;
        UUID uuid = this.requestId;
        return "BuyNeuronsBillingUiParams(goToUpgradeAfterDismiss=" + z + ", purchaseReason=" + purchaseReason + ", purchaseSource=" + purchaseSource + ", requestId=" + uuid + ")";
    }

    public BuyNeuronsBillingUiParams(boolean z, PurchaseReason purchaseReason, PurchaseSource purchaseSource, UUID requestId) {
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.goToUpgradeAfterDismiss = z;
        this.purchaseReason = purchaseReason;
        this.purchaseSource = purchaseSource;
        this.requestId = requestId;
    }

    public final boolean getGoToUpgradeAfterDismiss() {
        return this.goToUpgradeAfterDismiss;
    }

    public final PurchaseReason getPurchaseReason() {
        return this.purchaseReason;
    }

    public final PurchaseSource getPurchaseSource() {
        return this.purchaseSource;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BuyNeuronsBillingUiParams(boolean z, PurchaseReason purchaseReason, PurchaseSource purchaseSource, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, purchaseReason, purchaseSource, uuid);
        z = (i & 1) != 0 ? false : z;
        purchaseReason = (i & 2) != 0 ? null : purchaseReason;
        if ((i & 8) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
    }

    public final UUID getRequestId() {
        return this.requestId;
    }
}
