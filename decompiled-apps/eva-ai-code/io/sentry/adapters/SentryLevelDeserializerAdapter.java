package io.sentry.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.Locale;
/* loaded from: classes4.dex */
public final class SentryLevelDeserializerAdapter implements JsonDeserializer<SentryLevel> {
    private final SentryOptions options;

    public SentryLevelDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public SentryLevel deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            return null;
        }
        try {
            return SentryLevel.valueOf(jsonElement.getAsString().toUpperCase(Locale.ROOT));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing SentryLevel", th);
            return null;
        }
    }
}
