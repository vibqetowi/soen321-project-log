package com.ifriend.domain.data;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.apache.http.cookie.ClientCookie;
/* compiled from: LimitedSizeHashMap.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00028\u0001H\u0096\u0001¢\u0006\u0002\u0010\u001dJ\u0018\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u001bH\u0096\u0001J\u001f\u0010#\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010$J\u001f\u0010%\u001a\u00020\u00192\u0014\u0010&\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0096\u0001J\u0018\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010!R$\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR*\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/ifriend/domain/data/LimitedSizeHashMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "", "internalMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(ILjava/util/HashMap;)V", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "getKeys", "size", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LimitedSizeHashMap<K, V> implements Map<K, V>, KMutableMap {
    private final HashMap<K, V> internalMap;
    private final int maxSize;

    @Override // java.util.Map
    public void clear() {
        this.internalMap.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.internalMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.internalMap.containsValue(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.internalMap.get(obj);
    }

    public Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> entrySet = this.internalMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        return entrySet;
    }

    public Set<K> getKeys() {
        Set<K> keySet = this.internalMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        return keySet;
    }

    public int getSize() {
        return this.internalMap.size();
    }

    public Collection<V> getValues() {
        Collection<V> values = this.internalMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.internalMap.isEmpty();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.internalMap.putAll(from);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.internalMap.remove(obj);
    }

    public LimitedSizeHashMap(int i, HashMap<K, V> internalMap) {
        Intrinsics.checkNotNullParameter(internalMap, "internalMap");
        this.maxSize = i;
        this.internalMap = internalMap;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize must be more that 0");
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public /* synthetic */ LimitedSizeHashMap(int i, HashMap hashMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new HashMap() : hashMap);
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        if (this.internalMap.size() >= this.maxSize && !this.internalMap.containsKey(k)) {
            Set<K> keySet = this.internalMap.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
            Object firstOrNull = CollectionsKt.firstOrNull(keySet);
            if (firstOrNull == null) {
                throw new IllegalStateException("Map has no values to remove to free space");
            }
            this.internalMap.remove(firstOrNull);
        }
        return this.internalMap.put(k, v);
    }
}
