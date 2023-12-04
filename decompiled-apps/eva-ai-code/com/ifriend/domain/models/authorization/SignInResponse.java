package com.ifriend.domain.models.authorization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SignInResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ifriend/domain/models/authorization/SignInResponse;", "", "id", "", "email", "roles", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEmail", "()Ljava/lang/String;", "getId", "getRoles", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SignInResponse {
    private final String email;
    private final String id;
    private final List<String> roles;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignInResponse copy$default(SignInResponse signInResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signInResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = signInResponse.email;
        }
        if ((i & 4) != 0) {
            list = signInResponse.roles;
        }
        return signInResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.email;
    }

    public final List<String> component3() {
        return this.roles;
    }

    public final SignInResponse copy(String id, String email, List<String> roles) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(roles, "roles");
        return new SignInResponse(id, email, roles);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignInResponse) {
            SignInResponse signInResponse = (SignInResponse) obj;
            return Intrinsics.areEqual(this.id, signInResponse.id) && Intrinsics.areEqual(this.email, signInResponse.email) && Intrinsics.areEqual(this.roles, signInResponse.roles);
        }
        return false;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.email.hashCode()) * 31) + this.roles.hashCode();
    }

    public String toString() {
        String str = this.id;
        String str2 = this.email;
        List<String> list = this.roles;
        return "SignInResponse(id=" + str + ", email=" + str2 + ", roles=" + list + ")";
    }

    public SignInResponse(String id, String email, List<String> roles) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(roles, "roles");
        this.id = id;
        this.email = email;
        this.roles = roles;
    }

    public final String getId() {
        return this.id;
    }

    public final String getEmail() {
        return this.email;
    }

    public final List<String> getRoles() {
        return this.roles;
    }
}
