package kotlinx.collections.immutable.implementations.immutableMap;

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
import kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MapImplementation;
import kotlinx.collections.immutable.internal.MutabilityOwnership;
/* compiled from: PersistentHashMapBuilder.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0016J\b\u0010/\u001a\u000200H\u0016J\u0015\u00101\u001a\u0002022\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00104J\u0013\u00105\u001a\u0002022\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\u0018\u00108\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u0010H\u0016J\u001f\u0010;\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010<J\u001e\u0010=\u001a\u0002002\u0014\u0010>\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010?H\u0016J\u0017\u0010@\u001a\u0004\u0018\u00018\u00012\u0006\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00109J\u001b\u0010@\u001a\u0002022\u0006\u00103\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u0001¢\u0006\u0002\u0010AR&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00018\u0001X\u0080\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R$\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006B"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/AbstractMutableMap;", "map", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "(Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "getKeys", "modCount", "", "getModCount$kotlinx_collections_immutable", "()I", "setModCount$kotlinx_collections_immutable", "(I)V", "node", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode$kotlinx_collections_immutable", "(Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "operationResult", "getOperationResult$kotlinx_collections_immutable", "()Ljava/lang/Object;", "setOperationResult$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "getOwnership$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "value", "size", "getSize", "setSize", "values", "", "getValues", "()Ljava/util/Collection;", "build", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentHashMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    private PersistentHashMap<K, V> map;
    private int modCount;
    private TrieNode<K, V> node;
    private V operationResult;
    private MutabilityOwnership ownership;
    private int size;

    public PersistentHashMapBuilder(PersistentHashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        this.ownership = new MutabilityOwnership();
        this.node = this.map.getNode$kotlinx_collections_immutable();
        this.size = this.map.size();
    }

    public final MutabilityOwnership getOwnership$kotlinx_collections_immutable() {
        return this.ownership;
    }

    public final TrieNode<K, V> getNode$kotlinx_collections_immutable() {
        return this.node;
    }

    public final void setNode$kotlinx_collections_immutable(TrieNode<K, V> trieNode) {
        Intrinsics.checkNotNullParameter(trieNode, "<set-?>");
        this.node = trieNode;
    }

    public final V getOperationResult$kotlinx_collections_immutable() {
        return this.operationResult;
    }

    public final void setOperationResult$kotlinx_collections_immutable(V v) {
        this.operationResult = v;
    }

    public final int getModCount$kotlinx_collections_immutable() {
        return this.modCount;
    }

    public final void setModCount$kotlinx_collections_immutable(int i) {
        this.modCount = i;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
        this.modCount++;
    }

    @Override // kotlinx.collections.immutable.PersistentMap.Builder
    public PersistentHashMap<K, V> build() {
        PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.map.getNode$kotlinx_collections_immutable()) {
            persistentHashMap = this.map;
        } else {
            this.ownership = new MutabilityOwnership();
            persistentHashMap = new PersistentHashMap<>(this.node, size());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Collection<V> getValues() {
        return new PersistentHashMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.node.containsKey(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return this.node.get(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        this.operationResult = null;
        this.node = this.node.mutablePut(k == null ? 0 : k.hashCode(), k, v, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        PersistentHashMap<K, V> persistentHashMap = from instanceof PersistentHashMap ? (PersistentHashMap) from : null;
        if (persistentHashMap == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = from instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) from : null;
            persistentHashMap = persistentHashMapBuilder == null ? null : persistentHashMapBuilder.build();
        }
        if (persistentHashMap != null) {
            DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
            int size = size();
            this.node = this.node.mutablePutAll(persistentHashMap.getNode$kotlinx_collections_immutable(), 0, deltaCounter, this);
            int size2 = (persistentHashMap.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                setSize(size2);
                return;
            }
            return;
        }
        super.putAll(from);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.operationResult = null;
        TrieNode mutableRemove = this.node.mutableRemove(obj == null ? 0 : obj.hashCode(), obj, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$kotlinx_collections_immutable();
        }
        this.node = mutableRemove;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode mutableRemove = this.node.mutableRemove(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.Companion.getEMPTY$kotlinx_collections_immutable();
        }
        this.node = mutableRemove;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.node = TrieNode.Companion.getEMPTY$kotlinx_collections_immutable();
        setSize(0);
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
            if (map instanceof PersistentHashMap) {
                return this.node.equalsWith$kotlinx_collections_immutable(((PersistentHashMap) obj).getNode$kotlinx_collections_immutable(), PersistentHashMapBuilder$equals$1.INSTANCE);
            }
            if (map instanceof PersistentHashMapBuilder) {
                return this.node.equalsWith$kotlinx_collections_immutable((TrieNode<K, V>) ((PersistentHashMapBuilder) obj).node, PersistentHashMapBuilder$equals$2.INSTANCE);
            }
            if (map instanceof PersistentOrderedMap) {
                return this.node.equalsWith$kotlinx_collections_immutable((TrieNode<K, LinkedValue<V>>) ((PersistentOrderedMap) obj).getHashMap$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), PersistentHashMapBuilder$equals$3.INSTANCE);
            }
            if (map instanceof PersistentOrderedMapBuilder) {
                return this.node.equalsWith$kotlinx_collections_immutable((TrieNode<K, LinkedValue<V>>) ((PersistentOrderedMapBuilder) obj).getHashMapBuilder$kotlinx_collections_immutable().node, PersistentHashMapBuilder$equals$4.INSTANCE);
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
