package com.ifriend.common_utils.extensions;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
/* compiled from: duration.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"formatUpToMinutes", "", "Lkotlin/time/Duration;", "formatUpToMinutes-LRDsOJo", "(J)Ljava/lang/String;", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DurationKt {
    /* renamed from: formatUpToMinutes-LRDsOJo  reason: not valid java name */
    public static final String m6850formatUpToMinutesLRDsOJo(long j) {
        long m8659getInWholeMinutesimpl = Duration.m8659getInWholeMinutesimpl(j);
        String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(m8659getInWholeMinutesimpl), Long.valueOf(Duration.m8661getInWholeSecondsimpl(j) - TimeUnit.MINUTES.toSeconds(m8659getInWholeMinutesimpl))}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }
}
