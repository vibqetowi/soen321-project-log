package com.ifriend.core.remote.datasources.billing.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingReceiptRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemote;", "", "receipt", "", "(Ljava/lang/String;)V", "getReceipt", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingReceiptRemote {
    @SerializedName("receipt")
    private final String receipt;

    public BillingReceiptRemote() {
        this(null, 1, null);
    }

    public static /* synthetic */ BillingReceiptRemote copy$default(BillingReceiptRemote billingReceiptRemote, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billingReceiptRemote.receipt;
        }
        return billingReceiptRemote.copy(str);
    }

    public final String component1() {
        return this.receipt;
    }

    public final BillingReceiptRemote copy(String str) {
        return new BillingReceiptRemote(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillingReceiptRemote) && Intrinsics.areEqual(this.receipt, ((BillingReceiptRemote) obj).receipt);
    }

    public int hashCode() {
        String str = this.receipt;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.receipt;
        return "BillingReceiptRemote(receipt=" + str + ")";
    }

    public BillingReceiptRemote(String str) {
        this.receipt = str;
    }

    public /* synthetic */ BillingReceiptRemote(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final String getReceipt() {
        return this.receipt;
    }
}
