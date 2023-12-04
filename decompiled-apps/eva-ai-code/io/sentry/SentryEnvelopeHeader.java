package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
/* loaded from: classes4.dex */
public final class SentryEnvelopeHeader {
    private final SentryId eventId;
    private final SdkVersion sdkVersion;
    private final TraceState trace;

    public SentryEnvelopeHeader(SentryId sentryId, SdkVersion sdkVersion) {
        this(sentryId, sdkVersion, null);
    }

    public SentryEnvelopeHeader(SentryId sentryId, SdkVersion sdkVersion, TraceState traceState) {
        this.eventId = sentryId;
        this.sdkVersion = sdkVersion;
        this.trace = traceState;
    }

    public SentryEnvelopeHeader(SentryId sentryId) {
        this(sentryId, null);
    }

    public SentryEnvelopeHeader() {
        this(new SentryId());
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public TraceState getTrace() {
        return this.trace;
    }
}
