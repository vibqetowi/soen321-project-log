package com.ifriend.core.remote.datasources.user;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserNeuronesBalanceRemote.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/core/remote/datasources/user/UserNeuronesBalanceRemote;", "", "balance", "", "(Ljava/lang/Integer;)V", "getBalance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/ifriend/core/remote/datasources/user/UserNeuronesBalanceRemote;", "equals", "", "other", "hashCode", "toString", "", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserNeuronesBalanceRemote {
    @SerializedName("balance")
    private final Integer balance;

    public static /* synthetic */ UserNeuronesBalanceRemote copy$default(UserNeuronesBalanceRemote userNeuronesBalanceRemote, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = userNeuronesBalanceRemote.balance;
        }
        return userNeuronesBalanceRemote.copy(num);
    }

    public final Integer component1() {
        return this.balance;
    }

    public final UserNeuronesBalanceRemote copy(Integer num) {
        return new UserNeuronesBalanceRemote(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserNeuronesBalanceRemote) && Intrinsics.areEqual(this.balance, ((UserNeuronesBalanceRemote) obj).balance);
    }

    public int hashCode() {
        Integer num = this.balance;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.balance;
        return "UserNeuronesBalanceRemote(balance=" + num + ")";
    }

    public UserNeuronesBalanceRemote(Integer num) {
        this.balance = num;
    }

    public final Integer getBalance() {
        return this.balance;
    }
}
