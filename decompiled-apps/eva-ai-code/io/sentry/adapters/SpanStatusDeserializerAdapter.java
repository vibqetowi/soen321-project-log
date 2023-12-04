package io.sentry.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import java.lang.reflect.Type;
import java.util.Locale;
/* loaded from: classes4.dex */
public final class SpanStatusDeserializerAdapter implements JsonDeserializer<SpanStatus> {
    private final SentryOptions options;

    public SpanStatusDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public SpanStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            return null;
        }
        try {
            return SpanStatus.valueOf(jsonElement.getAsString().toUpperCase(Locale.ROOT));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing SpanStatus", th);
            return null;
        }
    }
}
