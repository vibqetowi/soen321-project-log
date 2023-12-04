package io.sentry.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import io.sentry.DateUtils;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.Date;
/* loaded from: classes4.dex */
public final class DateDeserializerAdapter implements JsonDeserializer<Date> {
    private final SentryOptions options;

    public DateDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonDeserializer
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            return null;
        }
        try {
            return DateUtils.getDateTime(jsonElement.getAsString());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Error when deserializing UTC timestamp format, it might be millis timestamp format.", th);
            try {
                return DateUtils.getDateTimeWithMillisPrecision(jsonElement.getAsString());
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", th2);
                return null;
            }
        }
    }
}
