package com.ifriend.domain.models.profile.user;

import com.ifriend.domain.config.ConfigKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: AuthData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u0010\u0010\"\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u0000J\t\u0010$\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/ifriend/domain/models/profile/user/AuthData;", "", "userId", "Lcom/ifriend/domain/models/profile/user/UserId;", ConfigKeys.CLIENT_ID, "Lcom/ifriend/domain/models/profile/user/ClientId;", "token", "Lcom/ifriend/domain/models/profile/user/UserToken;", "dbId", "Lcom/ifriend/domain/models/profile/user/DbId;", "email", "", "(Lcom/ifriend/domain/models/profile/user/UserId;Lcom/ifriend/domain/models/profile/user/ClientId;Lcom/ifriend/domain/models/profile/user/UserToken;Lcom/ifriend/domain/models/profile/user/DbId;Ljava/lang/String;)V", "getClientId", "()Lcom/ifriend/domain/models/profile/user/ClientId;", "getDbId", "()Lcom/ifriend/domain/models/profile/user/DbId;", "getEmail", "()Ljava/lang/String;", "getToken", "()Lcom/ifriend/domain/models/profile/user/UserToken;", "getUserId", "()Lcom/ifriend/domain/models/profile/user/UserId;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "isEqualWithoutEmail", "another", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthData {
    private final ClientId clientId;
    private final DbId dbId;
    private final String email;
    private final UserToken token;
    private final UserId userId;

    public static /* synthetic */ AuthData copy$default(AuthData authData, UserId userId, ClientId clientId, UserToken userToken, DbId dbId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userId = authData.userId;
        }
        if ((i & 2) != 0) {
            clientId = authData.clientId;
        }
        ClientId clientId2 = clientId;
        if ((i & 4) != 0) {
            userToken = authData.token;
        }
        UserToken userToken2 = userToken;
        if ((i & 8) != 0) {
            dbId = authData.dbId;
        }
        DbId dbId2 = dbId;
        if ((i & 16) != 0) {
            str = authData.email;
        }
        return authData.copy(userId, clientId2, userToken2, dbId2, str);
    }

    public final UserId component1() {
        return this.userId;
    }

    public final ClientId component2() {
        return this.clientId;
    }

    public final UserToken component3() {
        return this.token;
    }

    public final DbId component4() {
        return this.dbId;
    }

    public final String component5() {
        return this.email;
    }

    public final AuthData copy(UserId userId, ClientId clientId, UserToken token, DbId dbId, String email) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(dbId, "dbId");
        Intrinsics.checkNotNullParameter(email, "email");
        return new AuthData(userId, clientId, token, dbId, email);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AuthData) {
            AuthData authData = (AuthData) obj;
            return Intrinsics.areEqual(this.userId, authData.userId) && Intrinsics.areEqual(this.clientId, authData.clientId) && Intrinsics.areEqual(this.token, authData.token) && Intrinsics.areEqual(this.dbId, authData.dbId) && Intrinsics.areEqual(this.email, authData.email);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.clientId.hashCode()) * 31) + this.token.hashCode()) * 31) + this.dbId.hashCode()) * 31) + this.email.hashCode();
    }

    public String toString() {
        UserId userId = this.userId;
        ClientId clientId = this.clientId;
        UserToken userToken = this.token;
        DbId dbId = this.dbId;
        String str = this.email;
        return "AuthData(userId=" + userId + ", clientId=" + clientId + ", token=" + userToken + ", dbId=" + dbId + ", email=" + str + ")";
    }

    public AuthData(UserId userId, ClientId clientId, UserToken token, DbId dbId, String email) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(dbId, "dbId");
        Intrinsics.checkNotNullParameter(email, "email");
        this.userId = userId;
        this.clientId = clientId;
        this.token = token;
        this.dbId = dbId;
        this.email = email;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final ClientId getClientId() {
        return this.clientId;
    }

    public final UserToken getToken() {
        return this.token;
    }

    public final DbId getDbId() {
        return this.dbId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean isEqualWithoutEmail(AuthData authData) {
        return authData != null && Intrinsics.areEqual(this.userId, authData.userId) && Intrinsics.areEqual(this.clientId, authData.clientId) && Intrinsics.areEqual(this.token, authData.token) && Intrinsics.areEqual(this.dbId, authData.dbId);
    }
}
