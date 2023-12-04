package io.sentry;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public final class NoOpEnvelopeReader implements IEnvelopeReader {
    private static final NoOpEnvelopeReader instance = new NoOpEnvelopeReader();

    @Override // io.sentry.IEnvelopeReader
    public SentryEnvelope read(InputStream inputStream) throws IOException {
        return null;
    }

    private NoOpEnvelopeReader() {
    }

    public static NoOpEnvelopeReader getInstance() {
        return instance;
    }
}
