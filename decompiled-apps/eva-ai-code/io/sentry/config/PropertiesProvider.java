package io.sentry.config;

import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public interface PropertiesProvider {
    Boolean getBooleanProperty(String str);

    Double getDoubleProperty(String str);

    List<String> getList(String str);

    Map<String, String> getMap(String str);

    String getProperty(String str);

    String getProperty(String str, String str2);

    /* renamed from: io.sentry.config.PropertiesProvider$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static Boolean $default$getBooleanProperty(PropertiesProvider _this, String str) {
            String property = _this.getProperty(str);
            if (property != null) {
                return Boolean.valueOf(property);
            }
            return null;
        }

        public static Double $default$getDoubleProperty(PropertiesProvider _this, String str) {
            String property = _this.getProperty(str);
            if (property != null) {
                return Double.valueOf(property);
            }
            return null;
        }
    }
}
