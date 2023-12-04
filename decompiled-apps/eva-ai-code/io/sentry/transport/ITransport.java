package io.sentry.transport;

import io.sentry.SentryEnvelope;
import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes4.dex */
public interface ITransport extends Closeable {
    void flush(long j);

    void send(SentryEnvelope sentryEnvelope) throws IOException;

    void send(SentryEnvelope sentryEnvelope, Object obj) throws IOException;

    /* renamed from: io.sentry.transport.ITransport$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
    }
}
