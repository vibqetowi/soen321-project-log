package com.ifriend.domain.config;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PrimitiveValue.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/config/BooleanPrimitiveValue;", "Lcom/ifriend/domain/config/PrimitiveValue;", "value", "", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BooleanPrimitiveValue implements PrimitiveValue {
    private final boolean value;

    public static /* synthetic */ BooleanPrimitiveValue copy$default(BooleanPrimitiveValue booleanPrimitiveValue, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = booleanPrimitiveValue.value;
        }
        return booleanPrimitiveValue.copy(z);
    }

    public final boolean component1() {
        return this.value;
    }

    public final BooleanPrimitiveValue copy(boolean z) {
        return new BooleanPrimitiveValue(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BooleanPrimitiveValue) && this.value == ((BooleanPrimitiveValue) obj).value;
    }

    public int hashCode() {
        boolean z = this.value;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.value;
        return "BooleanPrimitiveValue(value=" + z + ")";
    }

    public BooleanPrimitiveValue(boolean z) {
        this.value = z;
    }

    public final boolean getValue() {
        return this.value;
    }
}
