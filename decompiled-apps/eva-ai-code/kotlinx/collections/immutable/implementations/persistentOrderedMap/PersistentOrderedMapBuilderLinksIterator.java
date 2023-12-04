package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlinx.collections.immutable.internal.EndOfChain;
/* compiled from: PersistentOrderedMapBuilderContentIterators.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B#\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\t\u0010\u001e\u001a\u00020\u0019H\u0096\u0002J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010 \u001a\u00020\u001bH\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "nextKey", "", "builder", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "(Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "getBuilder$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "expectedModCount", "", FirebaseAnalytics.Param.INDEX, "getIndex$kotlinx_collections_immutable", "()I", "setIndex$kotlinx_collections_immutable", "(I)V", "lastIteratedKey", "getLastIteratedKey$kotlinx_collections_immutable", "()Ljava/lang/Object;", "setLastIteratedKey$kotlinx_collections_immutable", "(Ljava/lang/Object;)V", "nextWasInvoked", "", "checkForComodification", "", "checkHasNext", "checkNextWasInvoked", "hasNext", "next", "remove", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, KMutableIterator {
    private final PersistentOrderedMapBuilder<K, V> builder;
    private int expectedModCount;
    private int index;
    private Object lastIteratedKey;
    private Object nextKey;
    private boolean nextWasInvoked;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.nextKey = obj;
        this.builder = builder;
        this.lastIteratedKey = EndOfChain.INSTANCE;
        this.expectedModCount = builder.getHashMapBuilder$kotlinx_collections_immutable().getModCount$kotlinx_collections_immutable();
    }

    public final PersistentOrderedMapBuilder<K, V> getBuilder$kotlinx_collections_immutable() {
        return this.builder;
    }

    public final Object getLastIteratedKey$kotlinx_collections_immutable() {
        return this.lastIteratedKey;
    }

    public final void setLastIteratedKey$kotlinx_collections_immutable(Object obj) {
        this.lastIteratedKey = obj;
    }

    public final int getIndex$kotlinx_collections_immutable() {
        return this.index;
    }

    public final void setIndex$kotlinx_collections_immutable(int i) {
        this.index = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.builder.size();
    }

    @Override // java.util.Iterator
    public LinkedValue<V> next() {
        checkForComodification();
        checkHasNext();
        this.lastIteratedKey = this.nextKey;
        this.nextWasInvoked = true;
        this.index++;
        LinkedValue<V> linkedValue = this.builder.getHashMapBuilder$kotlinx_collections_immutable().get(this.nextKey);
        if (linkedValue == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
        }
        LinkedValue<V> linkedValue2 = linkedValue;
        this.nextKey = linkedValue2.getNext();
        return linkedValue2;
    }

    @Override // java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        this.builder.remove(this.lastIteratedKey);
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$kotlinx_collections_immutable().getModCount$kotlinx_collections_immutable();
        this.index--;
    }

    private final void checkHasNext() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void checkForComodification() {
        if (this.builder.getHashMapBuilder$kotlinx_collections_immutable().getModCount$kotlinx_collections_immutable() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }
}
