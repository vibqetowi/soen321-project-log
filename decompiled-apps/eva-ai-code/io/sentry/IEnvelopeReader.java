package io.sentry;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public interface IEnvelopeReader {
    SentryEnvelope read(InputStream inputStream) throws IOException;
}
