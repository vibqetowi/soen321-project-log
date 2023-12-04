package com.ifriend.domain.models.profile;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Birthday.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\t¨\u0006\u000e"}, d2 = {"Lcom/ifriend/domain/models/profile/Format;", "", "()V", "ageToDate", "Ljava/util/Date;", "age", "", "dateToAge", "date", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "dateToString", "stringToDate", TypedValues.Custom.S_STRING, ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Format {
    public static final Format INSTANCE = new Format();

    private Format() {
    }

    public final String dateToString(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        String format = new SimpleDateFormat(Birthday.Companion.getFORMAT(), Locale.US).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final Date stringToDate(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return new SimpleDateFormat(Birthday.Companion.getFORMAT(), Locale.US).parse(str);
    }

    public final Integer dateToAge(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Date stringToDate = stringToDate(date);
        if (stringToDate != null) {
            return Integer.valueOf(INSTANCE.dateToAge(stringToDate));
        }
        return null;
    }

    public final int dateToAge(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance(Locale.US);
        int i = calendar2.get(1) - calendar.get(1);
        return (calendar2.get(2) >= calendar.get(2) || calendar2.get(5) >= calendar.get(5)) ? i : i - 1;
    }

    public final Date ageToDate(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1) - i);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }
}
