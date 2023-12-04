package io.sentry.adapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.sentry.DateUtils;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.Date;
/* loaded from: classes4.dex */
public final class DateSerializerAdapter implements JsonSerializer<Date> {
    private final SentryOptions options;

    public DateSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext) {
        if (date == null) {
            return null;
        }
        try {
            return new JsonPrimitive(DateUtils.getTimestamp(date));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing Date", th);
            return null;
        }
    }
}
