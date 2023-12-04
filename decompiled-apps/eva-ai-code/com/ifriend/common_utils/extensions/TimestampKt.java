package com.ifriend.common_utils.extensions;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: timestamp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"normalizeTimestamp", "", "toStartOfADay", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimestampKt {
    public static final long normalizeTimestamp(long j) {
        boolean z = false;
        if (-2147483648L <= j && j <= 2147483647L) {
            z = true;
        }
        return z ? j * 1000 : j;
    }

    public static final long toStartOfADay(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
