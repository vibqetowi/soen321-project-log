package com.ifriend.billing.api.models;

import com.android.billingclient.api.ProductDetails;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingProduct.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010$\u001a\u00020\u0019J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\u0006\u0010&\u001a\u00020\"J\u0006\u0010'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0019J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/ifriend/billing/api/models/BillingProduct;", "", "productId", "", "priceFormBackend", "Lcom/ifriend/billing/api/models/BillingPrice;", FirebaseAnalytics.Param.PRICE, "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "priceLabel", "subscriptionMonths", "", "(Ljava/lang/String;Lcom/ifriend/billing/api/models/BillingPrice;Lcom/ifriend/billing/api/models/BillingPrice;Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;I)V", "getPrice", "()Lcom/ifriend/billing/api/models/BillingPrice;", "getPriceFormBackend", "getPriceLabel", "()Ljava/lang/String;", "getProductDetails", "()Lcom/android/billingclient/api/ProductDetails;", "getProductId", "getSubscriptionMonths", "()I", "backendCurrency", "backendPrice", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "getPriceForOneMonth", "hashCode", "isSubscription", "localCurrency", "priceInLocalCurrency", "toString", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingProduct {
    private final BillingPrice price;
    private final BillingPrice priceFormBackend;
    private final String priceLabel;
    private final ProductDetails productDetails;
    private final String productId;
    private final int subscriptionMonths;

    public static /* synthetic */ BillingProduct copy$default(BillingProduct billingProduct, String str, BillingPrice billingPrice, BillingPrice billingPrice2, ProductDetails productDetails, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = billingProduct.productId;
        }
        if ((i2 & 2) != 0) {
            billingPrice = billingProduct.priceFormBackend;
        }
        BillingPrice billingPrice3 = billingPrice;
        if ((i2 & 4) != 0) {
            billingPrice2 = billingProduct.price;
        }
        BillingPrice billingPrice4 = billingPrice2;
        if ((i2 & 8) != 0) {
            productDetails = billingProduct.productDetails;
        }
        ProductDetails productDetails2 = productDetails;
        if ((i2 & 16) != 0) {
            str2 = billingProduct.priceLabel;
        }
        String str3 = str2;
        if ((i2 & 32) != 0) {
            i = billingProduct.subscriptionMonths;
        }
        return billingProduct.copy(str, billingPrice3, billingPrice4, productDetails2, str3, i);
    }

    public final String component1() {
        return this.productId;
    }

    public final BillingPrice component2() {
        return this.priceFormBackend;
    }

    public final BillingPrice component3() {
        return this.price;
    }

    public final ProductDetails component4() {
        return this.productDetails;
    }

    public final String component5() {
        return this.priceLabel;
    }

    public final int component6() {
        return this.subscriptionMonths;
    }

    public final BillingProduct copy(String productId, BillingPrice priceFormBackend, BillingPrice price, ProductDetails productDetails, String priceLabel, int i) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(priceFormBackend, "priceFormBackend");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        return new BillingProduct(productId, priceFormBackend, price, productDetails, priceLabel, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillingProduct) {
            BillingProduct billingProduct = (BillingProduct) obj;
            return Intrinsics.areEqual(this.productId, billingProduct.productId) && Intrinsics.areEqual(this.priceFormBackend, billingProduct.priceFormBackend) && Intrinsics.areEqual(this.price, billingProduct.price) && Intrinsics.areEqual(this.productDetails, billingProduct.productDetails) && Intrinsics.areEqual(this.priceLabel, billingProduct.priceLabel) && this.subscriptionMonths == billingProduct.subscriptionMonths;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.productId.hashCode() * 31) + this.priceFormBackend.hashCode()) * 31) + this.price.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.priceLabel.hashCode()) * 31) + this.subscriptionMonths;
    }

    public String toString() {
        String str = this.productId;
        BillingPrice billingPrice = this.priceFormBackend;
        BillingPrice billingPrice2 = this.price;
        ProductDetails productDetails = this.productDetails;
        String str2 = this.priceLabel;
        int i = this.subscriptionMonths;
        return "BillingProduct(productId=" + str + ", priceFormBackend=" + billingPrice + ", price=" + billingPrice2 + ", productDetails=" + productDetails + ", priceLabel=" + str2 + ", subscriptionMonths=" + i + ")";
    }

    public BillingProduct(String productId, BillingPrice priceFormBackend, BillingPrice price, ProductDetails productDetails, String priceLabel, int i) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(priceFormBackend, "priceFormBackend");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        Intrinsics.checkNotNullParameter(priceLabel, "priceLabel");
        this.productId = productId;
        this.priceFormBackend = priceFormBackend;
        this.price = price;
        this.productDetails = productDetails;
        this.priceLabel = priceLabel;
        this.subscriptionMonths = i;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final BillingPrice getPriceFormBackend() {
        return this.priceFormBackend;
    }

    public final BillingPrice getPrice() {
        return this.price;
    }

    public final ProductDetails getProductDetails() {
        return this.productDetails;
    }

    public final String getPriceLabel() {
        return this.priceLabel;
    }

    public final int getSubscriptionMonths() {
        return this.subscriptionMonths;
    }

    public final boolean isSubscription() {
        return Intrinsics.areEqual(this.productDetails.getProductType(), "subs");
    }

    public final double priceInLocalCurrency() {
        return this.price.getPrice().doubleValue();
    }

    public final double backendPrice() {
        return this.priceFormBackend.getPrice().doubleValue();
    }

    public final String backendCurrency() {
        return this.priceFormBackend.currencySymbol();
    }

    public final String localCurrency() {
        return this.price.currencySymbol();
    }

    public final double getPriceForOneMonth() {
        if (!isSubscription() || this.subscriptionMonths == 0) {
            return 0.0d;
        }
        return this.price.getPrice().doubleValue() / this.subscriptionMonths;
    }
}
