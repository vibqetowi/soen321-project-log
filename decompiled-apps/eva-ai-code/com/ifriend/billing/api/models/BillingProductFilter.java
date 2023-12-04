package com.ifriend.billing.api.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingProductFilter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/billing/api/models/BillingProductFilter;", "", "productType", "Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "productIdFilter", "", "(Lcom/ifriend/billing/api/models/BillingPurchaseProductType;Ljava/lang/String;)V", "getProductIdFilter", "()Ljava/lang/String;", "getProductType", "()Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingProductFilter {
    private final String productIdFilter;
    private final BillingPurchaseProductType productType;

    public static /* synthetic */ BillingProductFilter copy$default(BillingProductFilter billingProductFilter, BillingPurchaseProductType billingPurchaseProductType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            billingPurchaseProductType = billingProductFilter.productType;
        }
        if ((i & 2) != 0) {
            str = billingProductFilter.productIdFilter;
        }
        return billingProductFilter.copy(billingPurchaseProductType, str);
    }

    public final BillingPurchaseProductType component1() {
        return this.productType;
    }

    public final String component2() {
        return this.productIdFilter;
    }

    public final BillingProductFilter copy(BillingPurchaseProductType productType, String productIdFilter) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productIdFilter, "productIdFilter");
        return new BillingProductFilter(productType, productIdFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillingProductFilter) {
            BillingProductFilter billingProductFilter = (BillingProductFilter) obj;
            return this.productType == billingProductFilter.productType && Intrinsics.areEqual(this.productIdFilter, billingProductFilter.productIdFilter);
        }
        return false;
    }

    public int hashCode() {
        return (this.productType.hashCode() * 31) + this.productIdFilter.hashCode();
    }

    public String toString() {
        BillingPurchaseProductType billingPurchaseProductType = this.productType;
        String str = this.productIdFilter;
        return "BillingProductFilter(productType=" + billingPurchaseProductType + ", productIdFilter=" + str + ")";
    }

    public BillingProductFilter(BillingPurchaseProductType productType, String productIdFilter) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productIdFilter, "productIdFilter");
        this.productType = productType;
        this.productIdFilter = productIdFilter;
    }

    public final BillingPurchaseProductType getProductType() {
        return this.productType;
    }

    public final String getProductIdFilter() {
        return this.productIdFilter;
    }
}
