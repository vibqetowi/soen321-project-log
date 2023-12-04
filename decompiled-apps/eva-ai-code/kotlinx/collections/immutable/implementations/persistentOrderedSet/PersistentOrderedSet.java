package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentSet;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import kotlinx.collections.immutable.internal.EndOfChain;
/* compiled from: PersistentOrderedSet.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 **\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001*B-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\"\u001a\u00020\u0011H\u0016J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\"\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0(H\u0016J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006+"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractSet;", "Lkotlinx/collections/immutable/PersistentSet;", "firstElement", "", "lastElement", "hashMap", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "getFirstElement$kotlinx_collections_immutable", "()Ljava/lang/Object;", "getHashMap$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getLastElement$kotlinx_collections_immutable", "size", "", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentSet;", "addAll", "elements", "", "builder", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "clear", "contains", "", "(Ljava/lang/Object;)Z", "equals", "other", "hashCode", "iterator", "", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "retainAll", "Companion", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentOrderedSet<E> extends AbstractSet<E> implements PersistentSet<E> {
    public static final Companion Companion = new Companion(null);
    private static final PersistentOrderedSet EMPTY = new PersistentOrderedSet(EndOfChain.INSTANCE, EndOfChain.INSTANCE, PersistentHashMap.Companion.emptyOf$kotlinx_collections_immutable());
    private final Object firstElement;
    private final PersistentHashMap<E, Links> hashMap;
    private final Object lastElement;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentOrderedSet<E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((PersistentOrderedSet<E>) obj);
    }

    public final Object getFirstElement$kotlinx_collections_immutable() {
        return this.firstElement;
    }

    public final Object getLastElement$kotlinx_collections_immutable() {
        return this.lastElement;
    }

    public final PersistentHashMap<E, Links> getHashMap$kotlinx_collections_immutable() {
        return this.hashMap;
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap<E, Links> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = hashMap;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> add(E e) {
        if (this.hashMap.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(e, e, this.hashMap.put((PersistentHashMap<E, Links>) e, (E) new Links()));
        }
        Object obj = this.lastElement;
        Links links = this.hashMap.get(obj);
        Intrinsics.checkNotNull(links);
        return new PersistentOrderedSet(this.firstElement, e, ((PersistentHashMap<E, Links>) this.hashMap).put((ImmutableMap) obj, (Object) links.withNext(e)).put((PersistentHashMap) e, (E) new Links(obj)));
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> remove(E e) {
        Links links = this.hashMap.get(e);
        if (links == null) {
            return this;
        }
        PersistentHashMap<E, Links> remove = this.hashMap.remove((PersistentHashMap<E, Links>) e);
        if (links.getHasPrevious()) {
            Links links2 = remove.get(links.getPrevious());
            Intrinsics.checkNotNull(links2);
            remove = remove.put((PersistentHashMap<E, Links>) links.getPrevious(), (Object) links2.withNext(links.getNext()));
        }
        if (links.getHasNext()) {
            Links links3 = remove.get(links.getNext());
            Intrinsics.checkNotNull(links3);
            remove = remove.put((PersistentHashMap<E, Links>) links.getNext(), (Object) links3.withPrevious(links.getPrevious()));
        }
        return new PersistentOrderedSet(!links.getHasPrevious() ? links.getNext() : this.firstElement, !links.getHasNext() ? links.getPrevious() : this.lastElement, remove);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet.Builder<E> builder = builder();
        builder.removeAll(elements);
        return builder.build();
    }

    @Override // kotlinx.collections.immutable.PersistentSet, kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> removeAll(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        PersistentSet.Builder<E> builder = builder();
        CollectionsKt.removeAll(builder, predicate);
        return builder.build();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> retainAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentSet.Builder<E> builder = builder();
        builder.retainAll(elements);
        return builder.build();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentSet<E> clear() {
        return Companion.emptyOf$kotlinx_collections_immutable();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    @Override // kotlinx.collections.immutable.PersistentSet, kotlinx.collections.immutable.PersistentCollection
    public PersistentSet.Builder<E> builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.util.Set
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
                return this.hashMap.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable((TrieNode<E, Links>) ((PersistentOrderedSet) obj).hashMap.getNode$kotlinx_collections_immutable(), PersistentOrderedSet$equals$1.INSTANCE);
            }
            if (set instanceof PersistentOrderedSetBuilder) {
                return this.hashMap.getNode$kotlinx_collections_immutable().equalsWith$kotlinx_collections_immutable((TrieNode<E, Links>) ((PersistentOrderedSetBuilder) obj).getHashMapBuilder$kotlinx_collections_immutable().getNode$kotlinx_collections_immutable(), PersistentOrderedSet$equals$2.INSTANCE);
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return super.hashCode();
    }

    /* compiled from: PersistentOrderedSet.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bH\u0000¢\u0006\u0002\b\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "()V", "EMPTY", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "emptyOf", "Lkotlinx/collections/immutable/PersistentSet;", ExifInterface.LONGITUDE_EAST, "emptyOf$kotlinx_collections_immutable", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <E> PersistentSet<E> emptyOf$kotlinx_collections_immutable() {
            return PersistentOrderedSet.EMPTY;
        }
    }
}
