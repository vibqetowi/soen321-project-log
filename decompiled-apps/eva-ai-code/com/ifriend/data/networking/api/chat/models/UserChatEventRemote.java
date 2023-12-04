package com.ifriend.data.networking.api.chat.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserChatEventRemote.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/api/chat/models/UserChatEventRemote;", "", "userId", "", "(Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserChatEventRemote {
    @SerializedName("user-id")
    private final String userId;

    public static /* synthetic */ UserChatEventRemote copy$default(UserChatEventRemote userChatEventRemote, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userChatEventRemote.userId;
        }
        return userChatEventRemote.copy(str);
    }

    public final String component1() {
        return this.userId;
    }

    public final UserChatEventRemote copy(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new UserChatEventRemote(userId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserChatEventRemote) && Intrinsics.areEqual(this.userId, ((UserChatEventRemote) obj).userId);
    }

    public int hashCode() {
        return this.userId.hashCode();
    }

    public String toString() {
        String str = this.userId;
        return "UserChatEventRemote(userId=" + str + ")";
    }

    public UserChatEventRemote(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
    }

    public final String getUserId() {
        return this.userId;
    }
}
