package io.sentry.adapters;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Device;
import java.lang.reflect.Type;
import java.util.Locale;
/* loaded from: classes4.dex */
public final class OrientationSerializerAdapter implements JsonSerializer<Device.DeviceOrientation> {
    private final SentryOptions options;

    public OrientationSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(Device.DeviceOrientation deviceOrientation, Type type, JsonSerializationContext jsonSerializationContext) {
        if (deviceOrientation == null) {
            return null;
        }
        try {
            return new JsonPrimitive(deviceOrientation.name().toLowerCase(Locale.ROOT));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing DeviceOrientation", th);
            return null;
        }
    }
}
