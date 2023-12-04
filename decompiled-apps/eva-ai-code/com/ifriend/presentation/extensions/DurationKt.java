package com.ifriend.presentation.extensions;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
/* compiled from: duration.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0001*\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"TIME_FORMAT", "", "TIME_SEPARATOR", "toCallDurationFormat", "Lkotlin/time/Duration;", "toCallDurationFormat-LRDsOJo", "(J)Ljava/lang/String;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DurationKt {
    private static final String TIME_FORMAT = "%02d";
    private static final String TIME_SEPARATOR = ":";

    /* renamed from: toCallDurationFormat-LRDsOJo  reason: not valid java name */
    public static final String m6897toCallDurationFormatLRDsOJo(long j) {
        StringBuilder sb = new StringBuilder();
        long m8646getAbsoluteValueUwyO8pc = Duration.m8646getAbsoluteValueUwyO8pc(j);
        Duration.m8655getInWholeDaysimpl(m8646getAbsoluteValueUwyO8pc);
        int m8647getHoursComponentimpl = Duration.m8647getHoursComponentimpl(m8646getAbsoluteValueUwyO8pc);
        int m8662getMinutesComponentimpl = Duration.m8662getMinutesComponentimpl(m8646getAbsoluteValueUwyO8pc);
        int m8664getSecondsComponentimpl = Duration.m8664getSecondsComponentimpl(m8646getAbsoluteValueUwyO8pc);
        Duration.m8663getNanosecondsComponentimpl(m8646getAbsoluteValueUwyO8pc);
        if (m8647getHoursComponentimpl != 0) {
            String format = String.format(TIME_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(m8647getHoursComponentimpl)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
            sb.append(format);
            sb.append(TIME_SEPARATOR);
        }
        String str = TIME_FORMAT;
        String format2 = String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(m8662getMinutesComponentimpl)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)");
        sb.append(format2);
        sb.append(TIME_SEPARATOR);
        String format3 = String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(m8664getSecondsComponentimpl)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(this, *args)");
        sb.append(format3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
