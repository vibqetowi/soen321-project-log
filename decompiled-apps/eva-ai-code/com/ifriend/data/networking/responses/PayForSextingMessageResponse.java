package com.ifriend.data.networking.responses;

import kotlin.Metadata;
/* compiled from: PayForSextingMessageResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/responses/PayForSextingMessageResponse;", "", "Success", "", "(Z)V", "getSuccess", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PayForSextingMessageResponse {
    private final boolean Success;

    public static /* synthetic */ PayForSextingMessageResponse copy$default(PayForSextingMessageResponse payForSextingMessageResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = payForSextingMessageResponse.Success;
        }
        return payForSextingMessageResponse.copy(z);
    }

    public final boolean component1() {
        return this.Success;
    }

    public final PayForSextingMessageResponse copy(boolean z) {
        return new PayForSextingMessageResponse(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PayForSextingMessageResponse) && this.Success == ((PayForSextingMessageResponse) obj).Success;
    }

    public int hashCode() {
        boolean z = this.Success;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.Success;
        return "PayForSextingMessageResponse(Success=" + z + ")";
    }

    public PayForSextingMessageResponse(boolean z) {
        this.Success = z;
    }

    public final boolean getSuccess() {
        return this.Success;
    }
}
