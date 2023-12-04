package io.sentry.cache;

import io.sentry.SentryEnvelope;
/* loaded from: classes4.dex */
public interface IEnvelopeCache extends Iterable<SentryEnvelope> {
    void discard(SentryEnvelope sentryEnvelope);

    void store(SentryEnvelope sentryEnvelope);

    void store(SentryEnvelope sentryEnvelope, Object obj);

    /* renamed from: io.sentry.cache.IEnvelopeCache$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
    }
}
