package io.sentry.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryId;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public final class SentryIdDeserializerAdapter implements JsonDeserializer<SentryId> {
    private final SentryOptions options;

    public SentryIdDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public SentryId deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            return null;
        }
        try {
            return new SentryId(jsonElement.getAsString());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing SentryId", th);
            return null;
        }
    }
}
