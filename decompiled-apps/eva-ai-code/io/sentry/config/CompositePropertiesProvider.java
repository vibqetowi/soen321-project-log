package io.sentry.config;

import io.sentry.config.PropertiesProvider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
final class CompositePropertiesProvider implements PropertiesProvider {
    private final List<PropertiesProvider> providers;

    @Override // io.sentry.config.PropertiesProvider
    public /* synthetic */ Boolean getBooleanProperty(String str) {
        return PropertiesProvider.CC.$default$getBooleanProperty(this, str);
    }

    @Override // io.sentry.config.PropertiesProvider
    public /* synthetic */ Double getDoubleProperty(String str) {
        return PropertiesProvider.CC.$default$getDoubleProperty(this, str);
    }

    @Override // io.sentry.config.PropertiesProvider
    public /* synthetic */ List getList(String str) {
        return getProperty(str);
    }

    @Override // io.sentry.config.PropertiesProvider
    public /* synthetic */ String getProperty(String str, String str2) {
        return getProperty(str);
    }

    public CompositePropertiesProvider(List<PropertiesProvider> list) {
        this.providers = list;
    }

    @Override // io.sentry.config.PropertiesProvider
    public String getProperty(String str) {
        for (PropertiesProvider propertiesProvider : this.providers) {
            String property = propertiesProvider.getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }

    @Override // io.sentry.config.PropertiesProvider
    public Map<String, String> getMap(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (PropertiesProvider propertiesProvider : this.providers) {
            concurrentHashMap.putAll(propertiesProvider.getMap(str));
        }
        return concurrentHashMap;
    }
}
