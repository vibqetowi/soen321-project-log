package com.ifriend.domain.models.profile.user;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserToken.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0006\u0010\u000f\u001a\u00020\nJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/models/profile/user/UserToken;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "formatted", "hashCode", "", "isNotValid", "toString", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserToken {
    public static final Companion Companion = new Companion(null);
    private static final UserToken EMPTY = new UserToken("");
    private final String value;

    public static /* synthetic */ UserToken copy$default(UserToken userToken, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userToken.value;
        }
        return userToken.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final UserToken copy(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new UserToken(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserToken) && Intrinsics.areEqual(this.value, ((UserToken) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String str = this.value;
        return "UserToken(value=" + str + ")";
    }

    public UserToken(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final String getValue() {
        return this.value;
    }

    /* compiled from: UserToken.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/models/profile/user/UserToken$Companion;", "", "()V", "EMPTY", "Lcom/ifriend/domain/models/profile/user/UserToken;", "getEMPTY", "()Lcom/ifriend/domain/models/profile/user/UserToken;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UserToken getEMPTY() {
            return UserToken.EMPTY;
        }
    }

    public final boolean isNotValid() {
        return this.value.length() == 0;
    }

    public final String formatted() {
        String str = this.value;
        return "Token token=\"" + str + "\"";
    }
}
