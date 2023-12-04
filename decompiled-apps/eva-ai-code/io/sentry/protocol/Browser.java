package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.CollectionUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class Browser implements IUnknownPropertiesConsumer {
    public static final String TYPE = "browser";
    private String name;
    private Map<String, Object> unknown;
    private String version;

    public Browser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Browser(Browser browser) {
        this.name = browser.name;
        this.version = browser.version;
        this.unknown = CollectionUtils.newConcurrentHashMap(browser.unknown);
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

    Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }
}
