package com.ifriend.domain.config;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: appconfig.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a)\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0014\u001a\u00020\u0001H\u0002\u001a\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u001a\u001a\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0018\u0010\u001c\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"DIVIDER", "", "ROOT", "appEndpointKey", "key", "appFeatureKey", "appKey", "scope", "appLinkKey", "appVersionKey", "get", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/domain/config/PrimitiveValue;", "", "Lcom/ifriend/domain/config/ConfigEntity;", "(Ljava/util/List;Ljava/lang/String;)Lcom/ifriend/domain/config/PrimitiveValue;", "getDoubleFeature", "", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Double;", "getEntity", "fullKey", "getFeature", "", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Boolean;", "getLongFeature", "", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Long;", "getStringFeature", "has", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppconfigKt {
    private static final String DIVIDER = "__";
    private static final String ROOT = "singular";

    public static final String appKey(String scope, String key) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(key, "key");
        return "singular__" + scope + DIVIDER + key;
    }

    public static final String appFeatureKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return appKey(ConfigKeys.FEATURE, key);
    }

    public static final String appLinkKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return appKey(ConfigKeys.LINKS, key);
    }

    public static final String appEndpointKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return appKey(ConfigKeys.ENDPOINTS, key);
    }

    public static final String appVersionKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return appKey("version", key);
    }

    public static final boolean has(List<ConfigEntity> list, String key) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        List<ConfigEntity> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (ConfigEntity configEntity : list2) {
            if (Intrinsics.areEqual(configEntity.getKey(), key)) {
                return true;
            }
        }
        return false;
    }

    public static final Boolean getFeature(List<ConfigEntity> list, String key) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        BooleanPrimitiveValue booleanPrimitiveValue = (BooleanPrimitiveValue) get(list, appFeatureKey(key));
        if (booleanPrimitiveValue != null) {
            return Boolean.valueOf(booleanPrimitiveValue.getValue());
        }
        return null;
    }

    public static final Long getLongFeature(List<ConfigEntity> list, String key) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        LongPrimitiveValue longPrimitiveValue = (LongPrimitiveValue) get(list, appFeatureKey(key));
        if (longPrimitiveValue != null) {
            return Long.valueOf(longPrimitiveValue.getValue());
        }
        return null;
    }

    public static final String getStringFeature(List<ConfigEntity> list, String key) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        StringPrimitiveValue stringPrimitiveValue = (StringPrimitiveValue) get(list, appFeatureKey(key));
        if (stringPrimitiveValue != null) {
            return stringPrimitiveValue.getValue();
        }
        return null;
    }

    public static final Double getDoubleFeature(List<ConfigEntity> list, String key) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        DoublePrimitiveValue doublePrimitiveValue = (DoublePrimitiveValue) get(list, appFeatureKey(key));
        if (doublePrimitiveValue != null) {
            return Double.valueOf(doublePrimitiveValue.getValue());
        }
        return null;
    }

    public static final <T extends PrimitiveValue> T get(List<ConfigEntity> list, String key) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ConfigEntity entity = getEntity(list, key);
        PrimitiveValue value = entity != null ? entity.getValue() : null;
        if (value instanceof PrimitiveValue) {
            return (T) value;
        }
        return null;
    }

    private static final ConfigEntity getEntity(List<ConfigEntity> list, String str) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ConfigEntity) obj).getKey(), str)) {
                break;
            }
        }
        return (ConfigEntity) obj;
    }
}
