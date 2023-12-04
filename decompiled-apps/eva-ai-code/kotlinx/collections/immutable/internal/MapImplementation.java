package kotlinx.collections.immutable.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MapImplementation.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010&\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JA\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\nH\u0000¢\u0006\u0002\b\u000bJ=\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\b2\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\bH\u0000¢\u0006\u0002\b\u000fJ-\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\bH\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/collections/immutable/internal/MapImplementation;", "", "()V", "containsEntry", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "map", "", "element", "", "containsEntry$kotlinx_collections_immutable", "equals", "thisMap", "otherMap", "equals$kotlinx_collections_immutable", "hashCode", "", "hashCode$kotlinx_collections_immutable", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapImplementation {
    public static final MapImplementation INSTANCE = new MapImplementation();

    private MapImplementation() {
    }

    public final <K, V> boolean containsEntry$kotlinx_collections_immutable(Map<K, ? extends V> map, Map.Entry<? extends K, ? extends V> element) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(element, "element");
        V v = map.get(element.getKey());
        Boolean valueOf = v == null ? null : Boolean.valueOf(Intrinsics.areEqual(v, element.getValue()));
        if (valueOf == null) {
            return element.getValue() == null && map.containsKey(element.getKey());
        }
        return valueOf.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> boolean equals$kotlinx_collections_immutable(Map<K, ? extends V> thisMap, Map<?, ?> otherMap) {
        Intrinsics.checkNotNullParameter(thisMap, "thisMap");
        Intrinsics.checkNotNullParameter(otherMap, "otherMap");
        if (!(thisMap.size() == otherMap.size())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!otherMap.isEmpty()) {
            for (Map.Entry<?, ?> entry : otherMap.entrySet()) {
                if (!INSTANCE.containsEntry$kotlinx_collections_immutable(thisMap, entry)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final <K, V> int hashCode$kotlinx_collections_immutable(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return map.entrySet().hashCode();
    }
}
