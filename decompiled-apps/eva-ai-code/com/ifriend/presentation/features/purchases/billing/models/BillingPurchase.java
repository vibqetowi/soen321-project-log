package com.ifriend.presentation.features.purchases.billing.models;

import com.android.billingclient.api.Purchase;
import com.ifriend.billing.api.models.BillingProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingPurchase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/purchases/billing/models/BillingPurchase;", "", "purchase", "Lcom/android/billingclient/api/Purchase;", "product", "Lcom/ifriend/billing/api/models/BillingProduct;", "(Lcom/android/billingclient/api/Purchase;Lcom/ifriend/billing/api/models/BillingProduct;)V", "getProduct", "()Lcom/ifriend/billing/api/models/BillingProduct;", "getPurchase", "()Lcom/android/billingclient/api/Purchase;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingPurchase {
    public static final int $stable = 8;
    private final BillingProduct product;
    private final Purchase purchase;

    public static /* synthetic */ BillingPurchase copy$default(BillingPurchase billingPurchase, Purchase purchase, BillingProduct billingProduct, int i, Object obj) {
        if ((i & 1) != 0) {
            purchase = billingPurchase.purchase;
        }
        if ((i & 2) != 0) {
            billingProduct = billingPurchase.product;
        }
        return billingPurchase.copy(purchase, billingProduct);
    }

    public final Purchase component1() {
        return this.purchase;
    }

    public final BillingProduct component2() {
        return this.product;
    }

    public final BillingPurchase copy(Purchase purchase, BillingProduct product) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(product, "product");
        return new BillingPurchase(purchase, product);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillingPurchase) {
            BillingPurchase billingPurchase = (BillingPurchase) obj;
            return Intrinsics.areEqual(this.purchase, billingPurchase.purchase) && Intrinsics.areEqual(this.product, billingPurchase.product);
        }
        return false;
    }

    public int hashCode() {
        return (this.purchase.hashCode() * 31) + this.product.hashCode();
    }

    public String toString() {
        Purchase purchase = this.purchase;
        BillingProduct billingProduct = this.product;
        return "BillingPurchase(purchase=" + purchase + ", product=" + billingProduct + ")";
    }

    public BillingPurchase(Purchase purchase, BillingProduct product) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(product, "product");
        this.purchase = purchase;
        this.product = product;
    }

    public final Purchase getPurchase() {
        return this.purchase;
    }

    public final BillingProduct getProduct() {
        return this.product;
    }
}
