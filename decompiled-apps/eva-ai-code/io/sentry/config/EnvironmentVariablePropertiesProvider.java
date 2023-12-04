package io.sentry.config;

import io.sentry.config.PropertiesProvider;
import io.sentry.util.StringUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
final class EnvironmentVariablePropertiesProvider implements PropertiesProvider {
    private static final String PREFIX = "SENTRY";

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

    @Override // io.sentry.config.PropertiesProvider
    public String getProperty(String str) {
        return StringUtils.removeSurrounding(System.getenv(propertyToEnvironmentVariableName(str)), "\"");
    }

    @Override // io.sentry.config.PropertiesProvider
    public Map<String, String> getMap(String str) {
        String removeSurrounding;
        String str2 = propertyToEnvironmentVariableName(str) + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (removeSurrounding = StringUtils.removeSurrounding(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), removeSurrounding);
            }
        }
        return concurrentHashMap;
    }

    private String propertyToEnvironmentVariableName(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }
}
