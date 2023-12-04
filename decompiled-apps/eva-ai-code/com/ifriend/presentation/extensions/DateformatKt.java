package com.ifriend.presentation.extensions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: dateformat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0006"}, d2 = {"getHoursMinutesWithTimeOfDayDateFormat", "", "Ljava/util/Date;", "getUiStringTimeStamp", "pattern", "hourPeriodsLowercase", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateformatKt {
    public static final String getUiStringTimeStamp(Date date, String pattern) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String getHoursMinutesWithTimeOfDayDateFormat(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        return hourPeriodsLowercase(getUiStringTimeStamp(date, "h:mm a"));
    }

    private static final String hourPeriodsLowercase(String str) {
        return StringsKt.replace$default(StringsKt.replace$default(str, "AM", "am", false, 4, (Object) null), "PM", "pm", false, 4, (Object) null);
    }
}
