package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.EndOfChain;
import kotlinx.collections.immutable.internal.MapImplementation;
/* compiled from: PersistentOrderedMapBuilder.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u0015\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\u0018\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010(\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u001bH\u0016J\u001f\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010(\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00101J\u0017\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010(\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010-J\u001b\u00102\u001a\u00020'2\u0006\u0010(\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u0001¢\u0006\u0002\u00103R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/AbstractMutableMap;", "Lkotlinx/collections/immutable/PersistentMap$Builder;", "map", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "(Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", "<set-?>", "", "firstKey", "getFirstKey$kotlinx_collections_immutable", "()Ljava/lang/Object;", "hashMapBuilder", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "getHashMapBuilder$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", UserMetadata.KEYDATA_FILENAME, "getKeys", "lastKey", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "build", "Lkotlinx/collections/immutable/PersistentMap;", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    private Object firstKey;
    private final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder;
    private Object lastKey;
    private PersistentOrderedMap<K, V> map;

    public PersistentOrderedMapBuilder(PersistentOrderedMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        this.firstKey = map.getFirstKey$kotlinx_collections_immutable();
        this.lastKey = this.map.getLastKey$kotlinx_collections_immutable();
        this.hashMapBuilder = this.map.getHashMap$kotlinx_collections_immutable().builder();
    }

    public final Object getFirstKey$kotlinx_collections_immutable() {
        return this.firstKey;
    }

    public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$kotlinx_collections_immutable() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // kotlinx.collections.immutable.PersistentMap.Builder
    public PersistentMap<K, V> build() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        PersistentHashMap<K, LinkedValue<V>> build = this.hashMapBuilder.build();
        if (build == this.map.getHashMap$kotlinx_collections_immutable()) {
            CommonFunctionsKt.m8801assert(this.firstKey == this.map.getFirstKey$kotlinx_collections_immutable());
            CommonFunctionsKt.m8801assert(this.lastKey == this.map.getLastKey$kotlinx_collections_immutable());
            persistentOrderedMap = this.map;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.lastKey, build);
        }
        this.map = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue == null) {
            return null;
        }
        return linkedValue.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(k);
        if (linkedValue != null) {
            if (linkedValue.getValue() == v) {
                return v;
            }
            this.hashMapBuilder.put(k, linkedValue.withValue(v));
            return linkedValue.getValue();
        } else if (isEmpty()) {
            this.firstKey = k;
            this.lastKey = k;
            this.hashMapBuilder.put(k, new LinkedValue<>(v));
            return null;
        } else {
            Object obj = this.lastKey;
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(obj);
            Intrinsics.checkNotNull(linkedValue2);
            LinkedValue<V> linkedValue3 = linkedValue2;
            CommonFunctionsKt.m8801assert(!linkedValue3.getHasNext());
            this.hashMapBuilder.put(obj, linkedValue3.withNext(k));
            this.hashMapBuilder.put(k, new LinkedValue<>(v, obj));
            this.lastKey = k;
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        LinkedValue<V> remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return null;
        }
        if (remove.getHasPrevious()) {
            LinkedValue<V> linkedValue = this.hashMapBuilder.get(remove.getPrevious());
            Intrinsics.checkNotNull(linkedValue);
            this.hashMapBuilder.put(remove.getPrevious(), linkedValue.withNext(remove.getNext()));
        } else {
            this.firstKey = remove.getNext();
        }
        if (remove.getHasNext()) {
            LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(remove.getNext());
            Intrinsics.checkNotNull(linkedValue2);
            this.hashMapBuilder.put(remove.getNext(), linkedValue2.withPrevious(remove.getPrevious()));
        } else {
            this.lastKey = remove.getPrevious();
        }
        return remove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(obj);
        if (linkedValue != null && Intrinsics.areEqual(linkedValue.getValue(), obj2)) {
            remove(obj);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        this.firstKey = EndOfChain.INSTANCE;
        this.lastKey = EndOfChain.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            Map<?, ?> map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            if (map instanceof PersistentOrderedMap) {
                return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable((TrieNode<K, LinkedValue<V>>) ((PersistentOrderedMap) obj).getHashMap$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), PersistentOrderedMapBuilder$equals$1.INSTANCE);
            }
            if (map instanceof PersistentOrderedMapBuilder) {
                return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable((TrieNode<K, LinkedValue<V>>) ((PersistentOrderedMapBuilder) obj).hashMapBuilder.getNode$kotlinx_collections_immutable(), PersistentOrderedMapBuilder$equals$2.INSTANCE);
            }
            if (map instanceof PersistentHashMap) {
                return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentHashMap) obj).getNode$kotlinx_collections_immutable(), PersistentOrderedMapBuilder$equals$3.INSTANCE);
            }
            if (map instanceof PersistentHashMapBuilder) {
                return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable(((PersistentHashMapBuilder) obj).getNode$kotlinx_collections_immutable(), PersistentOrderedMapBuilder$equals$4.INSTANCE);
            }
            return MapImplementation.INSTANCE.equals$kotlinx_collections_immutable(this, map);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return MapImplementation.INSTANCE.hashCode$kotlinx_collections_immutable(this);
    }
}
