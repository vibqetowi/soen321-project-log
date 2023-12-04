package com.ifriend.data.networking.responses;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EmailRegistrationRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/networking/responses/EmailRegistrationRequest;", "", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmailRegistrationRequest {
    private final String email;
    private final String password;

    public static /* synthetic */ EmailRegistrationRequest copy$default(EmailRegistrationRequest emailRegistrationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailRegistrationRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = emailRegistrationRequest.password;
        }
        return emailRegistrationRequest.copy(str, str2);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.password;
    }

    public final EmailRegistrationRequest copy(String email, String password) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        return new EmailRegistrationRequest(email, password);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmailRegistrationRequest) {
            EmailRegistrationRequest emailRegistrationRequest = (EmailRegistrationRequest) obj;
            return Intrinsics.areEqual(this.email, emailRegistrationRequest.email) && Intrinsics.areEqual(this.password, emailRegistrationRequest.password);
        }
        return false;
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + this.password.hashCode();
    }

    public String toString() {
        String str = this.email;
        String str2 = this.password;
        return "EmailRegistrationRequest(email=" + str + ", password=" + str2 + ")";
    }

    public EmailRegistrationRequest(String email, String password) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        this.email = email;
        this.password = password;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }
}
