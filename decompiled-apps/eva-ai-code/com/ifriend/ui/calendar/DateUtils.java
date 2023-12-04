package com.ifriend.ui.calendar;

import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DateUtils.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¨\u0006\f"}, d2 = {"Lcom/ifriend/ui/calendar/DateUtils;", "", "()V", "copyCalendar", "Ljava/util/Calendar;", "calendar", "getCurrentTime", "getTime", "year", "", "month", "day", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();

    private DateUtils() {
    }

    public final Calendar getTime(int i, int i2, int i3) {
        Calendar currentTime = getCurrentTime();
        currentTime.set(1, i);
        currentTime.set(2, i2 - 1);
        currentTime.set(5, 0);
        currentTime.set(5, Math.min(i3, currentTime.getActualMaximum(5)));
        return currentTime;
    }

    public final Calendar getCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Intrinsics.checkNotNull(calendar);
        return calendar;
    }

    public final Calendar copyCalendar(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        return getTime(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }
}
