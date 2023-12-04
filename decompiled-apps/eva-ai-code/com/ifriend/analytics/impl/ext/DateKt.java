package com.ifriend.analytics.impl.ext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: date.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"ERROR_DATE_PATTERN", "", "TIME_ZONE_UTC", "toFormatErrorDate", "Ljava/util/Date;", "impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateKt {
    private static final String ERROR_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    private static final String TIME_ZONE_UTC = "UTC";

    public static final String toFormatErrorDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ERROR_DATE_PATTERN, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(TIME_ZONE_UTC));
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
