package io.sentry;

import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
/* loaded from: classes4.dex */
public interface ISentryClient {
    SentryId captureEnvelope(SentryEnvelope sentryEnvelope);

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Object obj);

    SentryId captureEvent(SentryEvent sentryEvent);

    SentryId captureEvent(SentryEvent sentryEvent, Scope scope);

    SentryId captureEvent(SentryEvent sentryEvent, Scope scope, Object obj);

    SentryId captureEvent(SentryEvent sentryEvent, Object obj);

    SentryId captureException(Throwable th);

    SentryId captureException(Throwable th, Scope scope);

    SentryId captureException(Throwable th, Scope scope, Object obj);

    SentryId captureException(Throwable th, Object obj);

    SentryId captureMessage(String str, SentryLevel sentryLevel);

    SentryId captureMessage(String str, SentryLevel sentryLevel, Scope scope);

    void captureSession(Session session);

    void captureSession(Session session, Object obj);

    SentryId captureTransaction(SentryTransaction sentryTransaction);

    SentryId captureTransaction(SentryTransaction sentryTransaction, Scope scope, Object obj);

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState);

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceState traceState, Scope scope, Object obj);

    void captureUserFeedback(UserFeedback userFeedback);

    void close();

    void flush(long j);

    boolean isEnabled();

    /* renamed from: io.sentry.ISentryClient$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static SentryId $default$captureMessage(ISentryClient _this, String str, SentryLevel sentryLevel, Scope scope) {
            SentryEvent sentryEvent = new SentryEvent();
            Message message = new Message();
            message.setFormatted(str);
            sentryEvent.setMessage(message);
            sentryEvent.setLevel(sentryLevel);
            return _this.captureEvent(sentryEvent, scope);
        }
    }
}
