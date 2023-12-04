package com.ifriend.billing.api.models;

import com.android.billingclient.api.ProductDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingProductsResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/billing/api/models/BillingProductsResult;", "", "isSuccessful", "", "products", "", "Lcom/android/billingclient/api/ProductDetails;", "(ZLjava/util/List;)V", "()Z", "getProducts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingProductsResult {
    private final boolean isSuccessful;
    private final List<ProductDetails> products;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillingProductsResult copy$default(BillingProductsResult billingProductsResult, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = billingProductsResult.isSuccessful;
        }
        if ((i & 2) != 0) {
            list = billingProductsResult.products;
        }
        return billingProductsResult.copy(z, list);
    }

    public final boolean component1() {
        return this.isSuccessful;
    }

    public final List<ProductDetails> component2() {
        return this.products;
    }

    public final BillingProductsResult copy(boolean z, List<ProductDetails> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new BillingProductsResult(z, products);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillingProductsResult) {
            BillingProductsResult billingProductsResult = (BillingProductsResult) obj;
            return this.isSuccessful == billingProductsResult.isSuccessful && Intrinsics.areEqual(this.products, billingProductsResult.products);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isSuccessful;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.products.hashCode();
    }

    public String toString() {
        boolean z = this.isSuccessful;
        List<ProductDetails> list = this.products;
        return "BillingProductsResult(isSuccessful=" + z + ", products=" + list + ")";
    }

    public BillingProductsResult(boolean z, List<ProductDetails> products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.isSuccessful = z;
        this.products = products;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final List<ProductDetails> getProducts() {
        return this.products;
    }
}
