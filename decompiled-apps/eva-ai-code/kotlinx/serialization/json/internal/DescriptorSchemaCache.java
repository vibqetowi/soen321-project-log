package kotlinx.serialization.json.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* compiled from: SchemaCache.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\b\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0006H\u0086\u0002¢\u0006\u0002\u0010\fJ9\u0010\r\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\t0\u000f¢\u0006\u0002\u0010\u0010J6\u0010\u0011\u001a\u00020\u0012\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u00062\u0006\u0010\u0013\u001a\u0002H\tH\u0086\u0002¢\u0006\u0002\u0010\u0014R6\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u0004j\b\u0012\u0004\u0012\u00020\u0001`\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "()V", "map", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "Lkotlinx/serialization/json/internal/DescriptorData;", "get", ExifInterface.GPS_DIRECTION_TRUE, "descriptor", "key", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;)Ljava/lang/Object;", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "set", "", "value", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Ljava/lang/Object;)V", "Key", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DescriptorSchemaCache {
    private final Map<SerialDescriptor, Map<Key<Object>, Object>> map = CreateMapForCacheKt.createMapForCache(1);

    /* compiled from: SchemaCache.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Key<T> {
    }

    public final <T> void set(SerialDescriptor descriptor, Key<T> key, T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<SerialDescriptor, Map<Key<Object>, Object>> map = this.map;
        Map<Key<Object>, Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = CreateMapForCacheKt.createMapForCache(1);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }

    public final <T> T getOrPut(SerialDescriptor descriptor, Key<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) get(descriptor, key);
        if (t != null) {
            return t;
        }
        T invoke = defaultValue.invoke();
        set(descriptor, key, invoke);
        return invoke;
    }

    public final <T> T get(SerialDescriptor descriptor, Key<T> key) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Map<Key<Object>, Object> map = this.map.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }
}
