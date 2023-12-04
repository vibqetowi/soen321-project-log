package io.sentry;
/* loaded from: classes4.dex */
public final class NoOpLogger implements ILogger {
    private static final NoOpLogger instance = new NoOpLogger();

    @Override // io.sentry.ILogger
    public boolean isEnabled(SentryLevel sentryLevel) {
        return false;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
    }

    public static NoOpLogger getInstance() {
        return instance;
    }

    private NoOpLogger() {
    }
}
