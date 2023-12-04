package com.ifriend.core.remote.datasources.billing.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingVerifyPurchaseRemote.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemote;", "", "ok", "", "(Ljava/lang/Boolean;)V", "getOk", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemote;", "equals", "other", "hashCode", "", "toString", "", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingVerifyPurchaseRemote {
    @SerializedName("shop")
    private final Boolean ok;

    public BillingVerifyPurchaseRemote() {
        this(null, 1, null);
    }

    public static /* synthetic */ BillingVerifyPurchaseRemote copy$default(BillingVerifyPurchaseRemote billingVerifyPurchaseRemote, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = billingVerifyPurchaseRemote.ok;
        }
        return billingVerifyPurchaseRemote.copy(bool);
    }

    public final Boolean component1() {
        return this.ok;
    }

    public final BillingVerifyPurchaseRemote copy(Boolean bool) {
        return new BillingVerifyPurchaseRemote(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillingVerifyPurchaseRemote) && Intrinsics.areEqual(this.ok, ((BillingVerifyPurchaseRemote) obj).ok);
    }

    public int hashCode() {
        Boolean bool = this.ok;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        Boolean bool = this.ok;
        return "BillingVerifyPurchaseRemote(ok=" + bool + ")";
    }

    public BillingVerifyPurchaseRemote(Boolean bool) {
        this.ok = bool;
    }

    public /* synthetic */ BillingVerifyPurchaseRemote(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }

    public final Boolean getOk() {
        return this.ok;
    }
}
