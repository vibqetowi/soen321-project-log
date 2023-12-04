package io.sentry.adapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryId;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public final class SentryIdSerializerAdapter implements JsonSerializer<SentryId> {
    private final SentryOptions options;

    public SentryIdSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SentryId sentryId, Type type, JsonSerializationContext jsonSerializationContext) {
        if (sentryId == null) {
            return null;
        }
        try {
            return new JsonPrimitive(sentryId.toString());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing SentryId", th);
            return null;
        }
    }
}
