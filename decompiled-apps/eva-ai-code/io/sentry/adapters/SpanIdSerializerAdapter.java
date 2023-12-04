package io.sentry.adapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanId;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public final class SpanIdSerializerAdapter implements JsonSerializer<SpanId> {
    private final SentryOptions options;

    public SpanIdSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SpanId spanId, Type type, JsonSerializationContext jsonSerializationContext) {
        if (spanId == null) {
            return null;
        }
        try {
            return new JsonPrimitive(spanId.toString());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing SpanId", th);
            return null;
        }
    }
}
