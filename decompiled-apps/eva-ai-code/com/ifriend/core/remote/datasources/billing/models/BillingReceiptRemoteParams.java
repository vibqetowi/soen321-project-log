package com.ifriend.core.remote.datasources.billing.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingReceiptRemote.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemoteParams;", "", "amount", "", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.METHOD, "", "shop", "productId", "requisites", "Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemoteParams$GetReceiptRequisitesRequest;", "(IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemoteParams$GetReceiptRequisitesRequest;)V", "getAmount", "()I", "getMethod", "()Ljava/lang/String;", "getPrice", "()D", "getProductId", "getRequisites", "()Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemoteParams$GetReceiptRequisitesRequest;", "getShop", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "GetReceiptRequisitesRequest", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingReceiptRemoteParams {
    @SerializedName("amount")
    private final int amount;
    @SerializedName(FirebaseAnalytics.Param.METHOD)
    private final String method;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final double price;
    @SerializedName("sku")
    private final String productId;
    @SerializedName("requisites")
    private final GetReceiptRequisitesRequest requisites;
    @SerializedName("shop")
    private final String shop;

    public static /* synthetic */ BillingReceiptRemoteParams copy$default(BillingReceiptRemoteParams billingReceiptRemoteParams, int i, double d, String str, String str2, String str3, GetReceiptRequisitesRequest getReceiptRequisitesRequest, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = billingReceiptRemoteParams.amount;
        }
        if ((i2 & 2) != 0) {
            d = billingReceiptRemoteParams.price;
        }
        double d2 = d;
        if ((i2 & 4) != 0) {
            str = billingReceiptRemoteParams.method;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = billingReceiptRemoteParams.shop;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = billingReceiptRemoteParams.productId;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            getReceiptRequisitesRequest = billingReceiptRemoteParams.requisites;
        }
        return billingReceiptRemoteParams.copy(i, d2, str4, str5, str6, getReceiptRequisitesRequest);
    }

    public final int component1() {
        return this.amount;
    }

    public final double component2() {
        return this.price;
    }

    public final String component3() {
        return this.method;
    }

    public final String component4() {
        return this.shop;
    }

    public final String component5() {
        return this.productId;
    }

    public final GetReceiptRequisitesRequest component6() {
        return this.requisites;
    }

    public final BillingReceiptRemoteParams copy(int i, double d, String method, String shop, String productId, GetReceiptRequisitesRequest requisites) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(shop, "shop");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(requisites, "requisites");
        return new BillingReceiptRemoteParams(i, d, method, shop, productId, requisites);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BillingReceiptRemoteParams) {
            BillingReceiptRemoteParams billingReceiptRemoteParams = (BillingReceiptRemoteParams) obj;
            return this.amount == billingReceiptRemoteParams.amount && Double.compare(this.price, billingReceiptRemoteParams.price) == 0 && Intrinsics.areEqual(this.method, billingReceiptRemoteParams.method) && Intrinsics.areEqual(this.shop, billingReceiptRemoteParams.shop) && Intrinsics.areEqual(this.productId, billingReceiptRemoteParams.productId) && Intrinsics.areEqual(this.requisites, billingReceiptRemoteParams.requisites);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.amount * 31) + Double.doubleToLongBits(this.price)) * 31) + this.method.hashCode()) * 31) + this.shop.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.requisites.hashCode();
    }

    public String toString() {
        int i = this.amount;
        double d = this.price;
        String str = this.method;
        String str2 = this.shop;
        String str3 = this.productId;
        GetReceiptRequisitesRequest getReceiptRequisitesRequest = this.requisites;
        return "BillingReceiptRemoteParams(amount=" + i + ", price=" + d + ", method=" + str + ", shop=" + str2 + ", productId=" + str3 + ", requisites=" + getReceiptRequisitesRequest + ")";
    }

    public BillingReceiptRemoteParams(int i, double d, String method, String shop, String productId, GetReceiptRequisitesRequest requisites) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(shop, "shop");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(requisites, "requisites");
        this.amount = i;
        this.price = d;
        this.method = method;
        this.shop = shop;
        this.productId = productId;
        this.requisites = requisites;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getShop() {
        return this.shop;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final GetReceiptRequisitesRequest getRequisites() {
        return this.requisites;
    }

    /* compiled from: BillingReceiptRemote.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemoteParams$GetReceiptRequisitesRequest;", "", "signature", "", "receipt", "(Ljava/lang/String;Ljava/lang/String;)V", "getReceipt", "()Ljava/lang/String;", "getSignature", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class GetReceiptRequisitesRequest {
        @SerializedName("receipt")
        private final String receipt;
        @SerializedName("signature")
        private final String signature;

        public static /* synthetic */ GetReceiptRequisitesRequest copy$default(GetReceiptRequisitesRequest getReceiptRequisitesRequest, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getReceiptRequisitesRequest.signature;
            }
            if ((i & 2) != 0) {
                str2 = getReceiptRequisitesRequest.receipt;
            }
            return getReceiptRequisitesRequest.copy(str, str2);
        }

        public final String component1() {
            return this.signature;
        }

        public final String component2() {
            return this.receipt;
        }

        public final GetReceiptRequisitesRequest copy(String signature, String receipt) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(receipt, "receipt");
            return new GetReceiptRequisitesRequest(signature, receipt);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GetReceiptRequisitesRequest) {
                GetReceiptRequisitesRequest getReceiptRequisitesRequest = (GetReceiptRequisitesRequest) obj;
                return Intrinsics.areEqual(this.signature, getReceiptRequisitesRequest.signature) && Intrinsics.areEqual(this.receipt, getReceiptRequisitesRequest.receipt);
            }
            return false;
        }

        public int hashCode() {
            return (this.signature.hashCode() * 31) + this.receipt.hashCode();
        }

        public String toString() {
            String str = this.signature;
            String str2 = this.receipt;
            return "GetReceiptRequisitesRequest(signature=" + str + ", receipt=" + str2 + ")";
        }

        public GetReceiptRequisitesRequest(String signature, String receipt) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(receipt, "receipt");
            this.signature = signature;
            this.receipt = receipt;
        }

        public final String getSignature() {
            return this.signature;
        }

        public final String getReceipt() {
            return this.receipt;
        }
    }
}
