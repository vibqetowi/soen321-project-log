package com.ifriend.data.authorization.confirmEmail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SendConfirmEmailRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/authorization/confirmEmail/SendConfirmEmailRequest;", "", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SendConfirmEmailRequest {
    private final String email;

    public static /* synthetic */ SendConfirmEmailRequest copy$default(SendConfirmEmailRequest sendConfirmEmailRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendConfirmEmailRequest.email;
        }
        return sendConfirmEmailRequest.copy(str);
    }

    public final String component1() {
        return this.email;
    }

    public final SendConfirmEmailRequest copy(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new SendConfirmEmailRequest(email);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SendConfirmEmailRequest) && Intrinsics.areEqual(this.email, ((SendConfirmEmailRequest) obj).email);
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public String toString() {
        String str = this.email;
        return "SendConfirmEmailRequest(email=" + str + ")";
    }

    public SendConfirmEmailRequest(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
    }

    public final String getEmail() {
        return this.email;
    }
}
