package com.ifriend.common_utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
/* compiled from: Format.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006J\u0015\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004J\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/ifriend/common_utils/Format;", "", "()V", "accessToken", "", "ageToDate", "Ljava/util/Date;", "age", "", "buildLink", TtmlNode.RUBY_BASE, "destination", "dateToAge", "date", "(Ljava/lang/String;)Ljava/lang/Integer;", "dateToString", "stringToDate", TypedValues.Custom.S_STRING, "toOneDigitPrecision", "", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Format {
    public static final Format INSTANCE = new Format();

    private Format() {
    }

    public final String dateToString(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final Date stringToDate(String str) {
        if (str == null) {
            return null;
        }
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).parse(str);
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

    public final String accessToken(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return "Token token=\"" + accessToken + "\"";
    }

    public final String buildLink(String base, String destination) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(destination, "destination");
        String replace$default = StringsKt.replace$default(base, "\"", "", false, 4, (Object) null);
        String replace$default2 = StringsKt.replace$default(destination, "\"", "", false, 4, (Object) null);
        return replace$default + replace$default2;
    }

    public final float toOneDigitPrecision(float f) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return Float.parseFloat(format);
    }
}
