package io.sentry.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.TimeZone;
/* loaded from: classes4.dex */
public final class TimeZoneDeserializerAdapter implements JsonDeserializer<TimeZone> {
    private final SentryOptions options;

    public TimeZoneDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonDeserializer
    public TimeZone deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            return null;
        }
        try {
            return TimeZone.getTimeZone(jsonElement.getAsString());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing TimeZone", th);
            return null;
        }
    }
}
