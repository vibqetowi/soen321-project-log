package kotlinx.collections.immutable.implementations.immutableSet;

import androidx.exifinterface.media.ExifInterface;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
/* compiled from: PersistentHashSetMutableIterator.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0014\u0010\u0010\u001a\u00020\f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u000e\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0016J1\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "builder", "Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "expectedModCount", "", "lastIteratedElement", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "isCollision", "node", "Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "next", "()Ljava/lang/Object;", "remove", "resetPath", "hashCode", "element", "pathIndex", "(ILkotlinx/collections/immutable/implementations/immutableSet/TrieNode;Ljava/lang/Object;I)V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E>, KMutableIterator {
    private final PersistentHashSetBuilder<E> builder;
    private int expectedModCount;
    private E lastIteratedElement;
    private boolean nextWasInvoked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentHashSetMutableIterator(PersistentHashSetBuilder<E> builder) {
        super(builder.getNode$kotlinx_collections_immutable());
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        this.expectedModCount = builder.getModCount$kotlinx_collections_immutable();
    }

    @Override // kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        checkForComodification();
        E e = (E) super.next();
        this.lastIteratedElement = e;
        this.nextWasInvoked = true;
        return e;
    }

    @Override // kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        checkNextWasInvoked();
        if (hasNext()) {
            E currentElement = currentElement();
            this.builder.remove(this.lastIteratedElement);
            resetPath(currentElement == null ? 0 : currentElement.hashCode(), this.builder.getNode$kotlinx_collections_immutable(), currentElement, 0);
        } else {
            this.builder.remove(this.lastIteratedElement);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$kotlinx_collections_immutable();
    }

    private final void resetPath(int i, TrieNode<?> trieNode, E e, int i2) {
        if (isCollision(trieNode)) {
            int indexOf = ArraysKt.indexOf((E[]) trieNode.getBuffer(), e);
            CommonFunctionsKt.m8801assert(indexOf != -1);
            getPath().get(i2).reset(trieNode.getBuffer(), indexOf);
            setPathLastIndex(i2);
            return;
        }
        int indexOfCellAt$kotlinx_collections_immutable = trieNode.indexOfCellAt$kotlinx_collections_immutable(1 << TrieNodeKt.indexSegment(i, i2 * 5));
        getPath().get(i2).reset(trieNode.getBuffer(), indexOfCellAt$kotlinx_collections_immutable);
        Object obj = trieNode.getBuffer()[indexOfCellAt$kotlinx_collections_immutable];
        if (obj instanceof TrieNode) {
            resetPath(i, (TrieNode) obj, e, i2 + 1);
        } else {
            setPathLastIndex(i2);
        }
    }

    private final boolean isCollision(TrieNode<?> trieNode) {
        return trieNode.getBitmap() == 0;
    }

    private final void checkNextWasInvoked() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void checkForComodification() {
        if (this.builder.getModCount$kotlinx_collections_immutable() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }
}
