package io.sentry.transport;

import io.sentry.SentryEnvelope;
import java.io.IOException;
/* loaded from: classes4.dex */
public final class NoOpTransport implements ITransport {
    private static final NoOpTransport instance = new NoOpTransport();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // io.sentry.transport.ITransport
    public void flush(long j) {
    }

    @Override // io.sentry.transport.ITransport
    public /* synthetic */ void send(SentryEnvelope sentryEnvelope) {
        send(sentryEnvelope, null);
    }

    @Override // io.sentry.transport.ITransport
    public void send(SentryEnvelope sentryEnvelope, Object obj) throws IOException {
    }

    public static NoOpTransport getInstance() {
        return instance;
    }

    private NoOpTransport() {
    }
}
