package com.ifriend.domain.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ConfirmEmailData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/models/ConfirmEmailData;", "", "auth", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuth", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmEmailData {
    private final String auth;
    private final String token;

    public static /* synthetic */ ConfirmEmailData copy$default(ConfirmEmailData confirmEmailData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmEmailData.auth;
        }
        if ((i & 2) != 0) {
            str2 = confirmEmailData.token;
        }
        return confirmEmailData.copy(str, str2);
    }

    public final String component1() {
        return this.auth;
    }

    public final String component2() {
        return this.token;
    }

    public final ConfirmEmailData copy(String auth, String token) {
        Intrinsics.checkNotNullParameter(auth, "auth");
        Intrinsics.checkNotNullParameter(token, "token");
        return new ConfirmEmailData(auth, token);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmEmailData) {
            ConfirmEmailData confirmEmailData = (ConfirmEmailData) obj;
            return Intrinsics.areEqual(this.auth, confirmEmailData.auth) && Intrinsics.areEqual(this.token, confirmEmailData.token);
        }
        return false;
    }

    public int hashCode() {
        return (this.auth.hashCode() * 31) + this.token.hashCode();
    }

    public String toString() {
        String str = this.auth;
        String str2 = this.token;
        return "ConfirmEmailData(auth=" + str + ", token=" + str2 + ")";
    }

    public ConfirmEmailData(String auth, String token) {
        Intrinsics.checkNotNullParameter(auth, "auth");
        Intrinsics.checkNotNullParameter(token, "token");
        this.auth = auth;
        this.token = token;
    }

    public final String getAuth() {
        return this.auth;
    }

    public final String getToken() {
        return this.token;
    }
}
