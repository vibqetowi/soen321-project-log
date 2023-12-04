package com.ifriend.common_utils.extensions;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: bigdecimal.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u001a\f\u0010\b\u001a\u00020\u0002*\u0004\u0018\u00010\t\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0002¨\u0006\u000b"}, d2 = {"equalsZero", "", "Ljava/math/BigDecimal;", "greaterThan", "compare", "greaterThanOrEquals", "lessThan", "lessThanOrEquals", "toBigDecimalOrZero", "", "toPlainStringValue", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigdecimalKt {
    public static final boolean equalsZero(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.compareTo(BigDecimal.ZERO) == 0;
    }

    public static final boolean lessThan(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return -1 == bigDecimal.compareTo(bigDecimal2);
    }

    public static final boolean lessThanOrEquals(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.compareTo(bigDecimal2) <= 0;
    }

    public static final boolean greaterThan(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return 1 == bigDecimal.compareTo(bigDecimal2);
    }

    public static final boolean greaterThanOrEquals(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.compareTo(bigDecimal2) >= 0;
    }

    public static final BigDecimal toBigDecimalOrZero(String str) {
        BigDecimal bigDecimalOrNull;
        if (str == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str)) == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        return bigDecimalOrNull;
    }

    public static final String toPlainStringValue(BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        if (equalsZero(bigDecimal)) {
            return "0";
        }
        String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNull(plainString);
        return plainString;
    }
}
