package kotlinx.collections.immutable.implementations.immutableList;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;
/* compiled from: PersistentVectorMutableIterator.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u000e\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0019\u001a\u00020\u000eH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "builder", "Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", FirebaseAnalytics.Param.INDEX, "", "(Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "expectedModCount", "lastIteratedIndex", "trieIterator", "Lkotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "add", "", "element", "(Ljava/lang/Object;)V", "checkForComodification", "checkHasIterated", "next", "()Ljava/lang/Object;", "previous", "remove", "reset", "set", "setupTrieIterator", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements ListIterator<T>, KMutableListIterator {
    private final PersistentVectorBuilder<T> builder;
    private int expectedModCount;
    private int lastIteratedIndex;
    private TrieIterator<? extends T> trieIterator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentVectorMutableIterator(PersistentVectorBuilder<T> builder, int i) {
        super(i, builder.size());
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        this.expectedModCount = builder.getModCount$kotlinx_collections_immutable();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkForComodification();
        checkHasPrevious$kotlinx_collections_immutable();
        this.lastIteratedIndex = getIndex() - 1;
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] tail$kotlinx_collections_immutable = this.builder.getTail$kotlinx_collections_immutable();
            setIndex(getIndex() - 1);
            return (T) tail$kotlinx_collections_immutable[getIndex()];
        } else if (getIndex() > trieIterator.getSize()) {
            Object[] tail$kotlinx_collections_immutable2 = this.builder.getTail$kotlinx_collections_immutable();
            setIndex(getIndex() - 1);
            return (T) tail$kotlinx_collections_immutable2[getIndex() - trieIterator.getSize()];
        } else {
            setIndex(getIndex() - 1);
            return trieIterator.previous();
        }
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkForComodification();
        checkHasNext$kotlinx_collections_immutable();
        this.lastIteratedIndex = getIndex();
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            Object[] tail$kotlinx_collections_immutable = this.builder.getTail$kotlinx_collections_immutable();
            int index = getIndex();
            setIndex(index + 1);
            return (T) tail$kotlinx_collections_immutable[index];
        } else if (trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return trieIterator.next();
        } else {
            Object[] tail$kotlinx_collections_immutable2 = this.builder.getTail$kotlinx_collections_immutable();
            int index2 = getIndex();
            setIndex(index2 + 1);
            return (T) tail$kotlinx_collections_immutable2[index2 - trieIterator.getSize()];
        }
    }

    private final void reset() {
        setSize(this.builder.size());
        this.expectedModCount = this.builder.getModCount$kotlinx_collections_immutable();
        this.lastIteratedIndex = -1;
        setupTrieIterator();
    }

    private final void setupTrieIterator() {
        Object[] root$kotlinx_collections_immutable = this.builder.getRoot$kotlinx_collections_immutable();
        if (root$kotlinx_collections_immutable == null) {
            this.trieIterator = null;
            return;
        }
        int rootSize = UtilsKt.rootSize(this.builder.size());
        int coerceAtMost = RangesKt.coerceAtMost(getIndex(), rootSize);
        int rootShift$kotlinx_collections_immutable = (this.builder.getRootShift$kotlinx_collections_immutable() / 5) + 1;
        TrieIterator<? extends T> trieIterator = this.trieIterator;
        if (trieIterator == null) {
            this.trieIterator = new TrieIterator<>(root$kotlinx_collections_immutable, coerceAtMost, rootSize, rootShift$kotlinx_collections_immutable);
            return;
        }
        Intrinsics.checkNotNull(trieIterator);
        trieIterator.reset$kotlinx_collections_immutable(root$kotlinx_collections_immutable, coerceAtMost, rootSize, rootShift$kotlinx_collections_immutable);
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void add(T t) {
        checkForComodification();
        this.builder.add(getIndex(), t);
        setIndex(getIndex() + 1);
        reset();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public void remove() {
        checkForComodification();
        checkHasIterated();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            setIndex(this.lastIteratedIndex);
        }
        reset();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void set(T t) {
        checkForComodification();
        checkHasIterated();
        this.builder.set(this.lastIteratedIndex, t);
        this.expectedModCount = this.builder.getModCount$kotlinx_collections_immutable();
        setupTrieIterator();
    }

    private final void checkForComodification() {
        if (this.expectedModCount != this.builder.getModCount$kotlinx_collections_immutable()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasIterated() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }
}
