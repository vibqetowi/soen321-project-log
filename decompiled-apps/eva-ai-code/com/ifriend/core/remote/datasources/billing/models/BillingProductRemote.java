package com.ifriend.core.remote.datasources.billing.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingProductRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/models/BillingProductRemote;", "", "productId", "", FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.PRICE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getPrice", "getProductId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingProductRemote {
    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    private final String currency;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;
    @SerializedName("sku")
    private final String productId;

    public static /* synthetic */ BillingProductRemote copy$default(BillingProductRemote billingProductRemote, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingProductRemote.productId;
        }
        if ((i & 2) != 0) {
            str2 = billingProductRemote.currency;
        }
        if ((i & 4) != 0) {
            str3 = billingProductRemote.price;
        }
        return billingProductRemote.copy(str, str2, str3);
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.currency;
    }

    public final String component3() {
        return this.price;
    }

    public final BillingProductRemote copy(String productId, String currency, String price) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(price, "price");
        return new BillingProductRemote(productId, currency, price);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillingProductRemote) {
            BillingProductRemote billingProductRemote = (BillingProductRemote) obj;
            return Intrinsics.areEqual(this.productId, billingProductRemote.productId) && Intrinsics.areEqual(this.currency, billingProductRemote.currency) && Intrinsics.areEqual(this.price, billingProductRemote.price);
        }
        return false;
    }

    public int hashCode() {
        return (((this.productId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.price.hashCode();
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.currency;
        String str3 = this.price;
        return "BillingProductRemote(productId=" + str + ", currency=" + str2 + ", price=" + str3 + ")";
    }

    public BillingProductRemote(String productId, String currency, String price) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(price, "price");
        this.productId = productId;
        this.currency = currency;
        this.price = price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getPrice() {
        return this.price;
    }
}
