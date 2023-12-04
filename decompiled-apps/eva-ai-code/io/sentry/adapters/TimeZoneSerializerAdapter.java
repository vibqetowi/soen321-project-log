package io.sentry.adapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.TimeZone;
/* loaded from: classes4.dex */
public final class TimeZoneSerializerAdapter implements JsonSerializer<TimeZone> {
    private final SentryOptions options;

    public TimeZoneSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(TimeZone timeZone, Type type, JsonSerializationContext jsonSerializationContext) {
        if (timeZone == null) {
            return null;
        }
        try {
            return new JsonPrimitive(timeZone.getID());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing TimeZone", th);
            return null;
        }
    }
}
