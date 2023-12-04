package io.sentry.protocol;

import io.sentry.SpanContext;
import io.sentry.util.Objects;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class Contexts extends ConcurrentHashMap<String, Object> {
    private static final long serialVersionUID = 252445813254943011L;

    public Contexts() {
    }

    public Contexts(Contexts contexts) {
        for (Map.Entry<String, Object> entry : contexts.entrySet()) {
            if (entry != null) {
                Object value = entry.getValue();
                if (App.TYPE.equals(entry.getKey()) && (value instanceof App)) {
                    setApp(new App((App) value));
                } else if (Browser.TYPE.equals(entry.getKey()) && (value instanceof Browser)) {
                    setBrowser(new Browser((Browser) value));
                } else if ("device".equals(entry.getKey()) && (value instanceof Device)) {
                    setDevice(new Device((Device) value));
                } else if (OperatingSystem.TYPE.equals(entry.getKey()) && (value instanceof OperatingSystem)) {
                    setOperatingSystem(new OperatingSystem((OperatingSystem) value));
                } else if (SentryRuntime.TYPE.equals(entry.getKey()) && (value instanceof SentryRuntime)) {
                    setRuntime(new SentryRuntime((SentryRuntime) value));
                } else if (Gpu.TYPE.equals(entry.getKey()) && (value instanceof Gpu)) {
                    setGpu(new Gpu((Gpu) value));
                } else if (SpanContext.TYPE.equals(entry.getKey()) && (value instanceof SpanContext)) {
                    setTrace(new SpanContext((SpanContext) value));
                } else {
                    put(entry.getKey(), value);
                }
            }
        }
    }

    private <T> T toContextType(String str, Class<T> cls) {
        Object obj = get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public SpanContext getTrace() {
        return (SpanContext) toContextType(SpanContext.TYPE, SpanContext.class);
    }

    public void setTrace(SpanContext spanContext) {
        Objects.requireNonNull(spanContext, "traceContext is required");
        put(SpanContext.TYPE, spanContext);
    }

    public App getApp() {
        return (App) toContextType(App.TYPE, App.class);
    }

    public void setApp(App app) {
        put(App.TYPE, app);
    }

    public Browser getBrowser() {
        return (Browser) toContextType(Browser.TYPE, Browser.class);
    }

    public void setBrowser(Browser browser) {
        put(Browser.TYPE, browser);
    }

    public Device getDevice() {
        return (Device) toContextType("device", Device.class);
    }

    public void setDevice(Device device) {
        put("device", device);
    }

    public OperatingSystem getOperatingSystem() {
        return (OperatingSystem) toContextType(OperatingSystem.TYPE, OperatingSystem.class);
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        put(OperatingSystem.TYPE, operatingSystem);
    }

    public SentryRuntime getRuntime() {
        return (SentryRuntime) toContextType(SentryRuntime.TYPE, SentryRuntime.class);
    }

    public void setRuntime(SentryRuntime sentryRuntime) {
        put(SentryRuntime.TYPE, sentryRuntime);
    }

    public Gpu getGpu() {
        return (Gpu) toContextType(Gpu.TYPE, Gpu.class);
    }

    public void setGpu(Gpu gpu) {
        put(Gpu.TYPE, gpu);
    }
}
