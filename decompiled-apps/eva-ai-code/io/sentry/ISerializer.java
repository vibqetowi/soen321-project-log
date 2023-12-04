package io.sentry;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
/* loaded from: classes4.dex */
public interface ISerializer {
    <T> T deserialize(Reader reader, Class<T> cls);

    SentryEnvelope deserializeEnvelope(InputStream inputStream);

    String serialize(Map<String, Object> map) throws Exception;

    void serialize(SentryEnvelope sentryEnvelope, OutputStream outputStream) throws Exception;

    <T> void serialize(T t, Writer writer) throws IOException;
}
