package kotlinx.collections.immutable;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;
/* compiled from: ImmutableMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001\u0010J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H&J)\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH&J!\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H&¢\u0006\u0002\u0010\n¨\u0006\u0011"}, d2 = {"Lkotlinx/collections/immutable/PersistentMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/collections/immutable/ImmutableMap;", "builder", "Lkotlinx/collections/immutable/PersistentMap$Builder;", "clear", "put", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentMap;", "putAll", "m", "", "remove", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentMap;", "Builder", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* compiled from: ImmutableMap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H&¨\u0006\u0006"}, d2 = {"Lkotlinx/collections/immutable/PersistentMap$Builder;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "build", "Lkotlinx/collections/immutable/PersistentMap;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Builder<K, V> extends Map<K, V>, KMutableMap {
        PersistentMap<K, V> build();
    }

    Builder<K, V> builder();

    @Override // java.util.Map
    PersistentMap<K, V> clear();

    @Override // java.util.Map
    PersistentMap<K, V> put(K k, V v);

    @Override // java.util.Map
    PersistentMap<K, V> putAll(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k);

    @Override // java.util.Map
    PersistentMap<K, V> remove(K k, V v);
}
