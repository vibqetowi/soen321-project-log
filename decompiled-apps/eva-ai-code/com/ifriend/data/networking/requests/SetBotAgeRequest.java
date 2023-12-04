package com.ifriend.data.networking.requests;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SetBotAgeRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/requests/SetBotAgeRequest;", "", "birthday", "", "(Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetBotAgeRequest {
    private final String birthday;

    public static /* synthetic */ SetBotAgeRequest copy$default(SetBotAgeRequest setBotAgeRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setBotAgeRequest.birthday;
        }
        return setBotAgeRequest.copy(str);
    }

    public final String component1() {
        return this.birthday;
    }

    public final SetBotAgeRequest copy(String birthday) {
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        return new SetBotAgeRequest(birthday);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetBotAgeRequest) && Intrinsics.areEqual(this.birthday, ((SetBotAgeRequest) obj).birthday);
    }

    public int hashCode() {
        return this.birthday.hashCode();
    }

    public String toString() {
        String str = this.birthday;
        return "SetBotAgeRequest(birthday=" + str + ")";
    }

    public SetBotAgeRequest(String birthday) {
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        this.birthday = birthday;
    }

    public final String getBirthday() {
        return this.birthday;
    }
}
