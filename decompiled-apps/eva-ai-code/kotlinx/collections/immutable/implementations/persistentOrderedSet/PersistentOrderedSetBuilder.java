package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.PersistentSet;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.EndOfChain;
/* compiled from: PersistentOrderedSetBuilder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001aJ\u0013\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\"\u001a\u00020\u0014H\u0016J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u0015\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableSet;", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "set", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "(Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "firstElement", "", "getFirstElement$kotlinx_collections_immutable", "()Ljava/lang/Object;", "setFirstElement$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "hashMapBuilder", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "getHashMapBuilder$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "lastElement", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "build", "Lkotlinx/collections/immutable/PersistentSet;", "clear", "", "contains", "equals", "other", "hashCode", "iterator", "", "remove", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {
    private Object firstElement;
    private final PersistentHashMapBuilder<E, Links> hashMapBuilder;
    private Object lastElement;
    private PersistentOrderedSet<E> set;

    public PersistentOrderedSetBuilder(PersistentOrderedSet<E> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.set = set;
        this.firstElement = set.getFirstElement$kotlinx_collections_immutable();
        this.lastElement = this.set.getLastElement$kotlinx_collections_immutable();
        this.hashMapBuilder = this.set.getHashMap$kotlinx_collections_immutable().builder();
    }

    public final Object getFirstElement$kotlinx_collections_immutable() {
        return this.firstElement;
    }

    public final void setFirstElement$kotlinx_collections_immutable(Object obj) {
        this.firstElement = obj;
    }

    public final PersistentHashMapBuilder<E, Links> getHashMapBuilder$kotlinx_collections_immutable() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // kotlinx.collections.immutable.PersistentSet.Builder, kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentSet<E> build() {
        PersistentOrderedSet<E> persistentOrderedSet;
        PersistentHashMap<E, Links> build = this.hashMapBuilder.build();
        if (build == this.set.getHashMap$kotlinx_collections_immutable()) {
            CommonFunctionsKt.m8801assert(this.firstElement == this.set.getFirstElement$kotlinx_collections_immutable());
            CommonFunctionsKt.m8801assert(this.lastElement == this.set.getLastElement$kotlinx_collections_immutable());
            persistentOrderedSet = this.set;
        } else {
            persistentOrderedSet = new PersistentOrderedSet<>(this.firstElement, this.lastElement, build);
        }
        this.set = persistentOrderedSet;
        return persistentOrderedSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.hashMapBuilder.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.hashMapBuilder.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = e;
            this.lastElement = e;
            this.hashMapBuilder.put(e, new Links());
            return true;
        }
        Links links = this.hashMapBuilder.get(this.lastElement);
        Intrinsics.checkNotNull(links);
        ((PersistentHashMapBuilder<E, Links>) this.hashMapBuilder).put(this.lastElement, links.withNext(e));
        this.hashMapBuilder.put(e, new Links(this.lastElement));
        this.lastElement = e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Links remove = this.hashMapBuilder.remove(obj);
        if (remove == null) {
            return false;
        }
        if (remove.getHasPrevious()) {
            Links links = this.hashMapBuilder.get(remove.getPrevious());
            Intrinsics.checkNotNull(links);
            ((PersistentHashMapBuilder<E, Links>) this.hashMapBuilder).put(remove.getPrevious(), links.withNext(remove.getNext()));
        } else {
            this.firstElement = remove.getNext();
        }
        if (remove.getHasNext()) {
            Links links2 = this.hashMapBuilder.get(remove.getNext());
            Intrinsics.checkNotNull(links2);
            ((PersistentHashMapBuilder<E, Links>) this.hashMapBuilder).put(remove.getNext(), links2.withPrevious(remove.getPrevious()));
            return true;
        }
        this.lastElement = remove.getPrevious();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        this.firstElement = EndOfChain.INSTANCE;
        this.lastElement = EndOfChain.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            if (set instanceof PersistentOrderedSet) {
                return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable((TrieNode<E, Links>) ((PersistentOrderedSet) obj).getHashMap$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), PersistentOrderedSetBuilder$equals$1.INSTANCE);
            }
            if (set instanceof PersistentOrderedSetBuilder) {
                return this.hashMapBuilder.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable((TrieNode<E, Links>) ((PersistentOrderedSetBuilder) obj).hashMapBuilder.getNode$kotlinx_collections_immutable(), PersistentOrderedSetBuilder$equals$2.INSTANCE);
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return super.hashCode();
    }
}
