package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public final class SdkVersion implements IUnknownPropertiesConsumer {
    private List<String> integrations;
    private String name;
    private List<SentryPackage> packages;
    private Map<String, Object> unknown;
    private String version;

    public SdkVersion(String str, String str2) {
        this.name = (String) Objects.requireNonNull(str, "name is required.");
        this.version = (String) Objects.requireNonNull(str2, "version is required.");
    }

    @Deprecated
    public SdkVersion() {
        this("", "");
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = (String) Objects.requireNonNull(str, "version is required.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = (String) Objects.requireNonNull(str, "name is required.");
    }

    public void addPackage(String str, String str2) {
        Objects.requireNonNull(str, "name is required.");
        Objects.requireNonNull(str2, "version is required.");
        SentryPackage sentryPackage = new SentryPackage(str, str2);
        if (this.packages == null) {
            this.packages = new ArrayList();
        }
        this.packages.add(sentryPackage);
    }

    public void addIntegration(String str) {
        Objects.requireNonNull(str, "integration is required.");
        if (this.integrations == null) {
            this.integrations = new ArrayList();
        }
        this.integrations.add(str);
    }

    @Override // io.sentry.IUnknownPropertiesConsumer
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public List<SentryPackage> getPackages() {
        return this.packages;
    }

    public List<String> getIntegrations() {
        return this.integrations;
    }

    public static SdkVersion updateSdkVersion(SdkVersion sdkVersion, String str, String str2) {
        Objects.requireNonNull(str, "name is required.");
        Objects.requireNonNull(str2, "version is required.");
        if (sdkVersion == null) {
            return new SdkVersion(str, str2);
        }
        sdkVersion.setName(str);
        sdkVersion.setVersion(str2);
        return sdkVersion;
    }
}
