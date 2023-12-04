package com.ifriend.domain.logic.balance;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserBalance.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/balance/UserBalance;", "", "neurons", "", "(I)V", "getNeurons", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserBalance {
    private final int neurons;

    public static /* synthetic */ UserBalance copy$default(UserBalance userBalance, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userBalance.neurons;
        }
        return userBalance.copy(i);
    }

    public final int component1() {
        return this.neurons;
    }

    public final UserBalance copy(int i) {
        return new UserBalance(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserBalance) && this.neurons == ((UserBalance) obj).neurons;
    }

    public int hashCode() {
        return this.neurons;
    }

    public String toString() {
        int i = this.neurons;
        return "UserBalance(neurons=" + i + ")";
    }

    public UserBalance(int i) {
        this.neurons = i;
    }

    public final int getNeurons() {
        return this.neurons;
    }
}
