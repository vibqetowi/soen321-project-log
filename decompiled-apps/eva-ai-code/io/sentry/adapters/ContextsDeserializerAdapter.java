package io.sentry.adapters;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.protocol.App;
import io.sentry.protocol.Browser;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Device;
import io.sentry.protocol.Gpu;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryRuntime;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public final class ContextsDeserializerAdapter implements JsonDeserializer<Contexts> {
    private final SentryOptions options;

    public ContextsDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public Contexts deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        char c;
        if (jsonElement != null) {
            try {
                if (jsonElement.isJsonNull()) {
                    return null;
                }
                Contexts contexts = new Contexts();
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject != null && !asJsonObject.isJsonNull()) {
                    for (String str : asJsonObject.keySet()) {
                        switch (str.hashCode()) {
                            case -1335157162:
                                if (str.equals("device")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3556:
                                if (str.equals(OperatingSystem.TYPE)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 96801:
                                if (str.equals(App.TYPE)) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 102572:
                                if (str.equals(Gpu.TYPE)) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 110620997:
                                if (str.equals(SpanContext.TYPE)) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 150940456:
                                if (str.equals(Browser.TYPE)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1550962648:
                                if (str.equals(SentryRuntime.TYPE)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                App app = (App) parseObject(jsonDeserializationContext, asJsonObject, str, App.class);
                                if (app != null) {
                                    contexts.setApp(app);
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                Browser browser = (Browser) parseObject(jsonDeserializationContext, asJsonObject, str, Browser.class);
                                if (browser != null) {
                                    contexts.setBrowser(browser);
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                Device device = (Device) parseObject(jsonDeserializationContext, asJsonObject, str, Device.class);
                                if (device != null) {
                                    contexts.setDevice(device);
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                OperatingSystem operatingSystem = (OperatingSystem) parseObject(jsonDeserializationContext, asJsonObject, str, OperatingSystem.class);
                                if (operatingSystem != null) {
                                    contexts.setOperatingSystem(operatingSystem);
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                SentryRuntime sentryRuntime = (SentryRuntime) parseObject(jsonDeserializationContext, asJsonObject, str, SentryRuntime.class);
                                if (sentryRuntime != null) {
                                    contexts.setRuntime(sentryRuntime);
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                Gpu gpu = (Gpu) parseObject(jsonDeserializationContext, asJsonObject, str, Gpu.class);
                                if (gpu != null) {
                                    contexts.setGpu(gpu);
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                SpanContext spanContext = (SpanContext) parseObject(jsonDeserializationContext, asJsonObject, str, SpanContext.class);
                                if (spanContext != null) {
                                    contexts.setTrace(spanContext);
                                    break;
                                } else {
                                    break;
                                }
                            default:
                                JsonElement jsonElement2 = asJsonObject.get(str);
                                if (jsonElement2 != null && !jsonElement2.isJsonNull()) {
                                    try {
                                        contexts.put(str, jsonDeserializationContext.deserialize(jsonElement2, Object.class));
                                        break;
                                    } catch (JsonParseException e) {
                                        this.options.getLogger().log(SentryLevel.ERROR, e, "Error when deserializing the %s key.", str);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }
                return contexts;
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing Contexts", th);
                return null;
            }
        }
        return null;
    }

    private <T> T parseObject(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String str, Class<T> cls) throws JsonParseException {
        JsonObject asJsonObject = jsonObject.getAsJsonObject(str);
        if (asJsonObject == null || asJsonObject.isJsonNull()) {
            return null;
        }
        return (T) jsonDeserializationContext.deserialize(asJsonObject, cls);
    }
}
