package com.ifriend.data.networking.datasources.chat.models.response.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GetReceiptResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/datasources/chat/models/response/client/GetReceiptResponse;", "", "receipt", "", "(Ljava/lang/String;)V", "getReceipt", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetReceiptResponse {
    private final String receipt;

    public static /* synthetic */ GetReceiptResponse copy$default(GetReceiptResponse getReceiptResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getReceiptResponse.receipt;
        }
        return getReceiptResponse.copy(str);
    }

    public final String component1() {
        return this.receipt;
    }

    public final GetReceiptResponse copy(String receipt) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        return new GetReceiptResponse(receipt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetReceiptResponse) && Intrinsics.areEqual(this.receipt, ((GetReceiptResponse) obj).receipt);
    }

    public int hashCode() {
        return this.receipt.hashCode();
    }

    public String toString() {
        String str = this.receipt;
        return "GetReceiptResponse(receipt=" + str + ")";
    }

    public GetReceiptResponse(String receipt) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        this.receipt = receipt;
    }

    public final String getReceipt() {
        return this.receipt;
    }
}
