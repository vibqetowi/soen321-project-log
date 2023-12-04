package com.ifriend.data.networking.responses;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EmailRegistrationResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/networking/responses/EmailRegistrationResponse;", "", "id", "", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getId", "getPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmailRegistrationResponse {
    private final String email;
    private final String id;
    private final String password;

    public static /* synthetic */ EmailRegistrationResponse copy$default(EmailRegistrationResponse emailRegistrationResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailRegistrationResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = emailRegistrationResponse.email;
        }
        if ((i & 4) != 0) {
            str3 = emailRegistrationResponse.password;
        }
        return emailRegistrationResponse.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.password;
    }

    public final EmailRegistrationResponse copy(String id, String email, String password) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        return new EmailRegistrationResponse(id, email, password);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmailRegistrationResponse) {
            EmailRegistrationResponse emailRegistrationResponse = (EmailRegistrationResponse) obj;
            return Intrinsics.areEqual(this.id, emailRegistrationResponse.id) && Intrinsics.areEqual(this.email, emailRegistrationResponse.email) && Intrinsics.areEqual(this.password, emailRegistrationResponse.password);
        }
        return false;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.email.hashCode()) * 31) + this.password.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.email;
        String str3 = this.password;
        return "EmailRegistrationResponse(id=" + str + ", email=" + str2 + ", password=" + str3 + ")";
    }

    public EmailRegistrationResponse(String id, String email, String password) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassword() {
        return this.password;
    }
}
