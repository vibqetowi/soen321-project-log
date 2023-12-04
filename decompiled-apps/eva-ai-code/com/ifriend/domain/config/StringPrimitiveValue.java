package com.ifriend.domain.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: PrimitiveValue.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/domain/config/StringPrimitiveValue;", "Lcom/ifriend/domain/config/PrimitiveValue;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringPrimitiveValue implements PrimitiveValue {
    private final String value;

    public static /* synthetic */ StringPrimitiveValue copy$default(StringPrimitiveValue stringPrimitiveValue, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringPrimitiveValue.value;
        }
        return stringPrimitiveValue.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final StringPrimitiveValue copy(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new StringPrimitiveValue(value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StringPrimitiveValue) && Intrinsics.areEqual(this.value, ((StringPrimitiveValue) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String str = this.value;
        return "StringPrimitiveValue(value=" + str + ")";
    }

    public StringPrimitiveValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final String getValue() {
        return this.value;
    }
}
