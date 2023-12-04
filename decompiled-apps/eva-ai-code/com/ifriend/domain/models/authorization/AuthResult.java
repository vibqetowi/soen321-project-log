package com.ifriend.domain.models.authorization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AuthResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ifriend/domain/models/authorization/AuthResult;", "", "token", "", "userId", "userCreated", "", "isSignedUp", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "()Z", "getToken", "()Ljava/lang/String;", "getUserCreated", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthResult {
    private final boolean isSignedUp;
    private final String token;
    private final boolean userCreated;
    private final String userId;

    public static /* synthetic */ AuthResult copy$default(AuthResult authResult, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authResult.token;
        }
        if ((i & 2) != 0) {
            str2 = authResult.userId;
        }
        if ((i & 4) != 0) {
            z = authResult.userCreated;
        }
        if ((i & 8) != 0) {
            z2 = authResult.isSignedUp;
        }
        return authResult.copy(str, str2, z, z2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.userId;
    }

    public final boolean component3() {
        return this.userCreated;
    }

    public final boolean component4() {
        return this.isSignedUp;
    }

    public final AuthResult copy(String token, String userId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new AuthResult(token, userId, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthResult) {
            AuthResult authResult = (AuthResult) obj;
            return Intrinsics.areEqual(this.token, authResult.token) && Intrinsics.areEqual(this.userId, authResult.userId) && this.userCreated == authResult.userCreated && this.isSignedUp == authResult.isSignedUp;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.token.hashCode() * 31) + this.userId.hashCode()) * 31;
        boolean z = this.userCreated;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isSignedUp;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.userId;
        boolean z = this.userCreated;
        boolean z2 = this.isSignedUp;
        return "AuthResult(token=" + str + ", userId=" + str2 + ", userCreated=" + z + ", isSignedUp=" + z2 + ")";
    }

    public AuthResult(String token, String userId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.token = token;
        this.userId = userId;
        this.userCreated = z;
        this.isSignedUp = z2;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean getUserCreated() {
        return this.userCreated;
    }

    public final boolean isSignedUp() {
        return this.isSignedUp;
    }
}
