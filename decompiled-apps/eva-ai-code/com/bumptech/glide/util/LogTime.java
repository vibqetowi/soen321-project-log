package com.bumptech.glide.util;

import android.os.SystemClock;
/* loaded from: classes2.dex */
public final class LogTime {
    private static final double MILLIS_MULTIPLIER = 1.0d / Math.pow(10.0d, 6.0d);

    private LogTime() {
    }

    public static long getLogTime() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static double getElapsedMillis(long j) {
        return (getLogTime() - j) * MILLIS_MULTIPLIER;
    }
}
