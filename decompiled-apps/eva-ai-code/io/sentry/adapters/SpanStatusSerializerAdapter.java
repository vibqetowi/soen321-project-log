package io.sentry.adapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import java.lang.reflect.Type;
import java.util.Locale;
/* loaded from: classes4.dex */
public final class SpanStatusSerializerAdapter implements JsonSerializer<SpanStatus> {
    private final SentryOptions options;

    public SpanStatusSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SpanStatus spanStatus, Type type, JsonSerializationContext jsonSerializationContext) {
        if (spanStatus == null) {
            return null;
        }
        try {
            return new JsonPrimitive(spanStatus.name().toLowerCase(Locale.ROOT));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing SpanStatus", th);
            return null;
        }
    }
}
