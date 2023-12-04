package io.sentry.util;
/* loaded from: classes4.dex */
public final class ExceptionUtils {
    public static Throwable findRootCause(Throwable th) {
        Objects.requireNonNull(th, "throwable cannot be null");
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }
}
