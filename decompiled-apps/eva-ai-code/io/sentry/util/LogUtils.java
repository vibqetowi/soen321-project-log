package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
/* loaded from: classes4.dex */
public final class LogUtils {
    public static void logIfNotFlushable(ILogger iLogger, Object obj) {
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        Object[] objArr = new Object[1];
        objArr[0] = obj != null ? obj.getClass().getCanonicalName() : "Hint";
        iLogger.log(sentryLevel, "%s is not Flushable", objArr);
    }

    public static void logIfNotRetryable(ILogger iLogger, Object obj) {
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        Object[] objArr = new Object[1];
        objArr[0] = obj != null ? obj.getClass().getCanonicalName() : "Hint";
        iLogger.log(sentryLevel, "%s is not Retryable", objArr);
    }
}
