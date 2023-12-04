package com.ifriend.core.remote.datasources.billing.models;

import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingVerifyPurchaseRemote.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemoteParams;", "", "shop", "", "receipt", FirebaseAnalytics.Param.METHOD, "meta", "Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemoteParams$Meta;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemoteParams$Meta;)V", "getMeta", "()Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemoteParams$Meta;", "getMethod", "()Ljava/lang/String;", "getReceipt", "getShop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Meta", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingVerifyPurchaseRemoteParams {
    @SerializedName("meta")
    private final Meta meta;
    @SerializedName(FirebaseAnalytics.Param.METHOD)
    private final String method;
    @SerializedName("receipt")
    private final String receipt;
    @SerializedName("shop")
    private final String shop;

    public static /* synthetic */ BillingVerifyPurchaseRemoteParams copy$default(BillingVerifyPurchaseRemoteParams billingVerifyPurchaseRemoteParams, String str, String str2, String str3, Meta meta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingVerifyPurchaseRemoteParams.shop;
        }
        if ((i & 2) != 0) {
            str2 = billingVerifyPurchaseRemoteParams.receipt;
        }
        if ((i & 4) != 0) {
            str3 = billingVerifyPurchaseRemoteParams.method;
        }
        if ((i & 8) != 0) {
            meta = billingVerifyPurchaseRemoteParams.meta;
        }
        return billingVerifyPurchaseRemoteParams.copy(str, str2, str3, meta);
    }

    public final String component1() {
        return this.shop;
    }

    public final String component2() {
        return this.receipt;
    }

    public final String component3() {
        return this.method;
    }

    public final Meta component4() {
        return this.meta;
    }

    public final BillingVerifyPurchaseRemoteParams copy(String shop, String receipt, String method, Meta meta) {
        Intrinsics.checkNotNullParameter(shop, "shop");
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(method, "method");
        return new BillingVerifyPurchaseRemoteParams(shop, receipt, method, meta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillingVerifyPurchaseRemoteParams) {
            BillingVerifyPurchaseRemoteParams billingVerifyPurchaseRemoteParams = (BillingVerifyPurchaseRemoteParams) obj;
            return Intrinsics.areEqual(this.shop, billingVerifyPurchaseRemoteParams.shop) && Intrinsics.areEqual(this.receipt, billingVerifyPurchaseRemoteParams.receipt) && Intrinsics.areEqual(this.method, billingVerifyPurchaseRemoteParams.method) && Intrinsics.areEqual(this.meta, billingVerifyPurchaseRemoteParams.meta);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.shop.hashCode() * 31) + this.receipt.hashCode()) * 31) + this.method.hashCode()) * 31;
        Meta meta = this.meta;
        return hashCode + (meta == null ? 0 : meta.hashCode());
    }

    public String toString() {
        String str = this.shop;
        String str2 = this.receipt;
        String str3 = this.method;
        Meta meta = this.meta;
        return "BillingVerifyPurchaseRemoteParams(shop=" + str + ", receipt=" + str2 + ", method=" + str3 + ", meta=" + meta + ")";
    }

    public BillingVerifyPurchaseRemoteParams(String shop, String receipt, String method, Meta meta) {
        Intrinsics.checkNotNullParameter(shop, "shop");
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(method, "method");
        this.shop = shop;
        this.receipt = receipt;
        this.method = method;
        this.meta = meta;
    }

    public /* synthetic */ BillingVerifyPurchaseRemoteParams(String str, String str2, String str3, Meta meta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : meta);
    }

    public final String getShop() {
        return this.shop;
    }

    public final String getReceipt() {
        return this.receipt;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Meta getMeta() {
        return this.meta;
    }

    /* compiled from: BillingVerifyPurchaseRemote.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemoteParams$Meta;", "", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.CURRENCY, "", "(DLjava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getPrice", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Meta {
        @SerializedName(AppsFlyerProperties.CURRENCY_CODE)
        private final String currency;
        @SerializedName(FirebaseAnalytics.Param.PRICE)
        private final double price;

        public static /* synthetic */ Meta copy$default(Meta meta, double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                d = meta.price;
            }
            if ((i & 2) != 0) {
                str = meta.currency;
            }
            return meta.copy(d, str);
        }

        public final double component1() {
            return this.price;
        }

        public final String component2() {
            return this.currency;
        }

        public final Meta copy(double d, String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new Meta(d, currency);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Meta) {
                Meta meta = (Meta) obj;
                return Double.compare(this.price, meta.price) == 0 && Intrinsics.areEqual(this.currency, meta.currency);
            }
            return false;
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.price) * 31) + this.currency.hashCode();
        }

        public String toString() {
            double d = this.price;
            String str = this.currency;
            return "Meta(price=" + d + ", currency=" + str + ")";
        }

        public Meta(double d, String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.price = d;
            this.currency = currency;
        }

        public final double getPrice() {
            return this.price;
        }

        public final String getCurrency() {
            return this.currency;
        }
    }
}
