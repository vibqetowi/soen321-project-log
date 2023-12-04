package io.sentry.android.core.internal.util;

import android.os.Looper;
import io.sentry.protocol.SentryThread;
/* loaded from: classes4.dex */
public final class MainThreadChecker {
    private MainThreadChecker() {
    }

    public static boolean isMainThread(Thread thread) {
        return isMainThread(thread.getId());
    }

    public static boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }

    public static boolean isMainThread(SentryThread sentryThread) {
        Long id = sentryThread.getId();
        return id != null && isMainThread(id.longValue());
    }

    private static boolean isMainThread(long j) {
        return Looper.getMainLooper().getThread().getId() == j;
    }
}
