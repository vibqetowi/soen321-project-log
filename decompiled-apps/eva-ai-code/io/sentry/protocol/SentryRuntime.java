package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class SentryRuntime implements IUnknownPropertiesConsumer {
    public static final String TYPE = "runtime";
    private String name;
    private String rawDescription;
    private Map<String, Object> unknown;
    private String version;

    public SentryRuntime() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SentryRuntime(SentryRuntime sentryRuntime) {
        this.name = sentryRuntime.name;
        this.version = sentryRuntime.version;
        this.rawDescription = sentryRuntime.rawDescription;
        this.unknown = CollectionUtils.newConcurrentHashMap(sentryRuntime.unknown);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getRawDescription() {
        return this.rawDescription;
    }

    public void setRawDescription(String str) {
        this.rawDescription = str;
    }

    Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }
}
