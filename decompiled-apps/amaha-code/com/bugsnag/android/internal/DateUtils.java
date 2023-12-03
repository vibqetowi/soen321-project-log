package com.bugsnag.android.internal;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: DateUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/internal/DateUtils;", "", "()V", "iso8601Format", "Ljava/text/DateFormat;", "getIso8601Format", "()Ljava/text/DateFormat;", "iso8601Holder", "com/bugsnag/android/internal/DateUtils$iso8601Holder$1", "Lcom/bugsnag/android/internal/DateUtils$iso8601Holder$1;", "fromIso8601", "Ljava/util/Date;", "date", "", "toIso8601", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class DateUtils {
    public static final DateUtils INSTANCE = new DateUtils();
    private static final DateUtils$iso8601Holder$1 iso8601Holder = new ThreadLocal<DateFormat>() { // from class: com.bugsnag.android.internal.DateUtils$iso8601Holder$1
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };

    private DateUtils() {
    }

    public static final Date fromIso8601(String date) {
        i.h(date, "date");
        try {
            Date parse = INSTANCE.getIso8601Format().parse(date);
            if (parse != null) {
                return parse;
            }
            throw new ParseException("DateFormat.parse returned null", 0);
        } catch (ParseException e10) {
            throw new IllegalArgumentException("Failed to parse timestamp", e10);
        }
    }

    private final DateFormat getIso8601Format() {
        DateFormat dateFormat = iso8601Holder.get();
        if (dateFormat != null) {
            return dateFormat;
        }
        throw new IllegalArgumentException("Unable to find valid dateformatter".toString());
    }

    public static final String toIso8601(Date date) {
        i.h(date, "date");
        String format = INSTANCE.getIso8601Format().format(date);
        i.c(format, "iso8601Format.format(date)");
        return format;
    }
}
