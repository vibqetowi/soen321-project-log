package io.sentry.adapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.Locale;
/* loaded from: classes4.dex */
public final class SentryLevelSerializerAdapter implements JsonSerializer<SentryLevel> {
    private final SentryOptions options;

    public SentryLevelSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SentryLevel sentryLevel, Type type, JsonSerializationContext jsonSerializationContext) {
        if (sentryLevel == null) {
            return null;
        }
        try {
            return new JsonPrimitive(sentryLevel.name().toLowerCase(Locale.ROOT));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing SentryLevel", th);
            return null;
        }
    }
}
