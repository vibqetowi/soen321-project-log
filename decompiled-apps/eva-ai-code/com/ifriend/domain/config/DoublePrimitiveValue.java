package com.ifriend.domain.config;

import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PrimitiveValue.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/config/DoublePrimitiveValue;", "Lcom/ifriend/domain/config/PrimitiveValue;", "value", "", "(D)V", "getValue", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DoublePrimitiveValue implements PrimitiveValue {
    private final double value;

    public static /* synthetic */ DoublePrimitiveValue copy$default(DoublePrimitiveValue doublePrimitiveValue, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = doublePrimitiveValue.value;
        }
        return doublePrimitiveValue.copy(d);
    }

    public final double component1() {
        return this.value;
    }

    public final DoublePrimitiveValue copy(double d) {
        return new DoublePrimitiveValue(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DoublePrimitiveValue) && Double.compare(this.value, ((DoublePrimitiveValue) obj).value) == 0;
    }

    public int hashCode() {
        return Double.doubleToLongBits(this.value);
    }

    public String toString() {
        double d = this.value;
        return "DoublePrimitiveValue(value=" + d + ")";
    }

    public DoublePrimitiveValue(double d) {
        this.value = d;
    }

    public final double getValue() {
        return this.value;
    }
}
