package com.ifriend.presentation.extensions;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: formattedstring.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"AMOUNT_PATTERN_WITHOUT_DECIMALS", "", "toFormattedString", "Ljava/math/BigDecimal;", "pattern", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormattedstringKt {
    public static final String AMOUNT_PATTERN_WITHOUT_DECIMALS = "###,###.##";

    public static /* synthetic */ String toFormattedString$default(BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = AMOUNT_PATTERN_WITHOUT_DECIMALS;
        }
        return toFormattedString(bigDecimal, str);
    }

    public static final String toFormattedString(BigDecimal bigDecimal, String pattern) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        decimalFormatSymbols.setGroupingSeparator(' ');
        String format = new DecimalFormat(pattern, decimalFormatSymbols).format(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
