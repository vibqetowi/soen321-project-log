package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.Objects;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SentryPackage implements IUnknownPropertiesConsumer {
    private String name;
    private Map<String, Object> unknown;
    private String version;

    public SentryPackage(String str, String str2) {
        this.name = (String) Objects.requireNonNull(str, "name is required.");
        this.version = (String) Objects.requireNonNull(str2, "version is required.");
    }

    @Deprecated
    public SentryPackage() {
        this("", "");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = (String) Objects.requireNonNull(str, "name is required.");
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = (String) Objects.requireNonNull(str, "version is required.");
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }
}
