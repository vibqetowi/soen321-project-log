package io.sentry.exception;
/* loaded from: classes4.dex */
public final class InvalidSentryTraceHeaderException extends Exception {
    private static final long serialVersionUID = 1;
    private final String sentryTraceHeader;

    public InvalidSentryTraceHeaderException(String str) {
        this(str, null);
    }

    public InvalidSentryTraceHeaderException(String str, Throwable th) {
        super("sentry-trace header does not conform to expected format: " + str, th);
        this.sentryTraceHeader = str;
    }

    public String getSentryTraceHeader() {
        return this.sentryTraceHeader;
    }
}
