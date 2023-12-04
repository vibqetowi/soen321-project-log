package kotlinx.collections.immutable.implementations.immutableSet;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlinx.collections.immutable.internal.DeltaCounter;
import kotlinx.collections.immutable.internal.MutabilityOwnership;
/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 ^*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001^B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0004H\u0002J.\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010#\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010&J\u0015\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010)J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010&J \u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010,\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002J#\u0010-\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010.J\u001c\u0010/\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u0015\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0002\u00103J\u0016\u00104\u001a\u00020(2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0010\u00105\u001a\u00020(2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0015\u00106\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b7JE\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010=J=\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010BJ=\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010?\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010BJ5\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010E\u001a\u0006\u0012\u0002\b\u00030F¢\u0006\u0002\u0010GJ6\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010I\u001a\u00020J2\n\u0010E\u001a\u0006\u0012\u0002\b\u00030FJ'\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010E\u001a\u0006\u0012\u0002\b\u00030FH\u0002¢\u0006\u0002\u0010LJ,\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010I\u001a\u00020J2\u0006\u0010\u001f\u001a\u00020\tH\u0002J'\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010E\u001a\u0006\u0012\u0002\b\u00030FH\u0002¢\u0006\u0002\u0010LJ(\u0010O\u001a\u0004\u0018\u00010\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010I\u001a\u00020J2\u0006\u0010\u001f\u001a\u00020\tH\u0002J(\u0010P\u001a\u0004\u0018\u00010\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010I\u001a\u00020J2\u0006\u0010\u001f\u001a\u00020\tH\u0002J5\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010E\u001a\u0006\u0012\u0002\b\u00030F¢\u0006\u0002\u0010GJ2\u0010R\u001a\u0004\u0018\u00010\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010I\u001a\u00020J2\n\u0010E\u001a\u0006\u0012\u0002\b\u00030FJ2\u0010S\u001a\u0004\u0018\u00010\u00022\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010I\u001a\u00020J2\n\u0010E\u001a\u0006\u0012\u0002\b\u00030FJ\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00102\u001a\u00020\u0004H\u0002J)\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ(\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010W\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002J*\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010W\u001a\u00020\u00042\b\u0010Y\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002J5\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010[\u001a\u00020\u00042\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010]R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006_"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", ExifInterface.LONGITUDE_EAST, "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Lkotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Lkotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Lkotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "owner", "(ILjava/lang/Object;Lkotlinx/collections/immutable/internal/MutabilityOwnership;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "canonicalizeNodeAtIndex", "nodeIndex", "newNode", "collisionAdd", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", "i", "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$kotlinx_collections_immutable", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "(ILjava/lang/Object;ILjava/lang/Object;ILkotlinx/collections/immutable/internal/MutabilityOwnership;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILkotlinx/collections/immutable/internal/MutabilityOwnership;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "mutableAdd", "mutator", "Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Lkotlinx/collections/immutable/internal/DeltaCounter;", "mutableCollisionAdd", "(Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRetainAll", "mutableRemove", "mutableRemoveAll", "mutableRetainAll", "nodeAtIndex", "remove", "removeCellAtIndex", "cellIndex", "setCellAtIndex", "newCell", "setProperties", "newBitmap", "newBuffer", "(I[Ljava/lang/Object;Lkotlinx/collections/immutable/internal/MutabilityOwnership;)Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Companion", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TrieNode<E> {
    public static final Companion Companion = new Companion(null);
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;

    public TrieNode(int i, Object[] buffer, MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.bitmap = i;
        this.buffer = buffer;
        this.ownedBy = mutabilityOwnership;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final void setBitmap(int i) {
        this.bitmap = i;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final void setBuffer(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.buffer = objArr;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i, Object[] buffer) {
        this(i, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    private final boolean hasNoCellAt(int i) {
        return (i & this.bitmap) == 0;
    }

    public final int indexOfCellAt$kotlinx_collections_immutable(int i) {
        return Integer.bitCount((i - 1) & this.bitmap);
    }

    private final E elementAtIndex(int i) {
        return (E) this.buffer[i];
    }

    private final TrieNode<E> nodeAtIndex(int i) {
        Object obj = this.buffer[i];
        if (obj != null) {
            return (TrieNode) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
    }

    private final TrieNode<E> addElementAt(int i, E e, MutabilityOwnership mutabilityOwnership) {
        Object[] addElementAtIndex;
        int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(i);
        int i2 = i | this.bitmap;
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$kotlinx_collections_immutable, e);
        return setProperties(i2, addElementAtIndex, mutabilityOwnership);
    }

    private final TrieNode<E> setProperties(int i, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        if (mutabilityOwnership2 != null && mutabilityOwnership2 == mutabilityOwnership) {
            this.bitmap = i;
            this.buffer = objArr;
            return this;
        }
        return new TrieNode<>(i, objArr, mutabilityOwnership);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v1 */
    private final TrieNode<E> canonicalizeNodeAtIndex(int i, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r0 = trieNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        return setCellAtIndex(i, trieNode, mutabilityOwnership);
    }

    private final TrieNode<E> setCellAtIndex(int i, Object obj, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        if (mutabilityOwnership2 != null && mutabilityOwnership2 == mutabilityOwnership) {
            this.buffer[i] = obj;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = obj;
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        E elementAtIndex = elementAtIndex(i);
        return makeNode(elementAtIndex == null ? 0 : elementAtIndex.hashCode(), elementAtIndex, i2, e, i3 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        return setCellAtIndex(i, makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership), mutabilityOwnership);
    }

    private final TrieNode<E> makeNode(int i, E e, int i2, E e2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (i3 > 30) {
            return new TrieNode<>(0, new Object[]{e, e2}, mutabilityOwnership);
        }
        int indexSegment = TrieNodeKt.indexSegment(i, i3);
        int indexSegment2 = TrieNodeKt.indexSegment(i2, i3);
        if (indexSegment != indexSegment2) {
            return new TrieNode<>((1 << indexSegment) | (1 << indexSegment2), indexSegment < indexSegment2 ? new Object[]{e, e2} : new Object[]{e2, e}, mutabilityOwnership);
        }
        return new TrieNode<>(1 << indexSegment, new Object[]{makeNode(i, e, i2, e2, i3 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> removeCellAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        int i3 = i2 ^ this.bitmap;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return setProperties(i3, removeCellAtIndex, mutabilityOwnership);
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return setProperties(0, removeCellAtIndex, mutabilityOwnership);
    }

    private final boolean collisionContainsElement(E e) {
        return ArraysKt.contains((E[]) this.buffer, e);
    }

    private final TrieNode<E> collisionAdd(E e) {
        Object[] addElementAtIndex;
        if (collisionContainsElement(e)) {
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, e);
        return setProperties(0, addElementAtIndex, null);
    }

    private final TrieNode<E> mutableCollisionAdd(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object[] addElementAtIndex;
        if (collisionContainsElement(e)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, e);
        return setProperties(0, addElementAtIndex, persistentHashSetBuilder.getOwnership$kotlinx_collections_immutable());
    }

    private final TrieNode<E> collisionRemove(E e) {
        int indexOf = ArraysKt.indexOf((E[]) this.buffer, e);
        return indexOf != -1 ? collisionRemoveElementAtIndex(indexOf, null) : this;
    }

    private final TrieNode<E> mutableCollisionRemove(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int indexOf = ArraysKt.indexOf((E[]) this.buffer, e);
        if (indexOf != -1) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return collisionRemoveElementAtIndex(indexOf, persistentHashSetBuilder.getOwnership$kotlinx_collections_immutable());
        }
        return this;
    }

    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i = 0;
        int i2 = 0;
        while (i < objArr2.length) {
            CommonFunctionsKt.m8801assert(i2 <= i);
            if (!collisionContainsElement((E) objArr2[i])) {
                copyOf[length + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m8801assert(length + i2 <= copyOf.length);
            }
            i++;
        }
        int length2 = i2 + this.buffer.length;
        deltaCounter.plusAssign(copyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != copyOf.length) {
            copyOf = Arrays.copyOf(copyOf, length2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        }
        return setProperties(0, copyOf, mutabilityOwnership);
    }

    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = mutabilityOwnership == this.ownedBy ? this.buffer : new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m8801assert(i2 <= i);
            if (trieNode.collisionContainsElement((E) objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m8801assert(0 + i2 <= objArr.length);
            }
            i++;
        }
        deltaCounter.plusAssign(i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (i2 == objArr.length) {
            return setProperties(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return setProperties(0, copyOf, mutabilityOwnership);
    }

    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        Object[] objArr = mutabilityOwnership == this.ownedBy ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m8801assert(i2 <= i);
            if (!trieNode.collisionContainsElement((E) objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m8801assert(0 + i2 <= objArr.length);
            }
            i++;
        }
        deltaCounter.plusAssign(this.buffer.length - i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return setProperties(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return setProperties(0, copyOf, mutabilityOwnership);
    }

    private final int calculateSize() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        Object[] objArr = this.buffer;
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            i2 += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return i2;
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (this.buffer[i] != trieNode.buffer[i]) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public final boolean contains(int i, E e, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(indexSegment);
        Object obj = this.buffer[indexOfCellAt$kotlinx_collections_immutable];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$kotlinx_collections_immutable);
            if (i2 == 30) {
                return nodeAtIndex.collisionContainsElement(e);
            }
            return nodeAtIndex.contains(i, e, i2 + 5);
        }
        return Intrinsics.areEqual(e, obj);
    }

    public final TrieNode<E> mutableAddAll(TrieNode<E> otherNode, int i, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder<?> mutator) {
        int i2;
        Object makeNode;
        Object mutableAdd;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + calculateSize());
            return this;
        } else if (i > 30) {
            return mutableCollisionAddAll(otherNode, intersectionSizeRef, mutator.getOwnership$kotlinx_collections_immutable());
        } else {
            int i3 = this.bitmap;
            int i4 = otherNode.bitmap | i3;
            TrieNode<E> trieNode = (i4 == i3 && Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$kotlinx_collections_immutable())) ? this : new TrieNode<>(i4, new Object[Integer.bitCount(i4)], mutator.getOwnership$kotlinx_collections_immutable());
            int i5 = i4;
            int i6 = 0;
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(lowestOneBit);
                int indexOfCellAt$kotlinx_collections_immutable2 = otherNode.indexOfCellAt$kotlinx_collections_immutable(lowestOneBit);
                Object[] buffer = trieNode.getBuffer();
                if (hasNoCellAt(lowestOneBit)) {
                    makeNode = (TrieNode<E>) otherNode.getBuffer()[indexOfCellAt$kotlinx_collections_immutable2];
                } else if (otherNode.hasNoCellAt(lowestOneBit)) {
                    makeNode = getBuffer()[indexOfCellAt$kotlinx_collections_immutable];
                } else {
                    E e = (E) getBuffer()[indexOfCellAt$kotlinx_collections_immutable];
                    E e2 = (E) otherNode.getBuffer()[indexOfCellAt$kotlinx_collections_immutable2];
                    boolean z = e instanceof TrieNode;
                    boolean z2 = e2 instanceof TrieNode;
                    if (!z || !z2) {
                        if (z) {
                            if (e != null) {
                                TrieNode trieNode2 = (TrieNode) e;
                                int size = mutator.size();
                                mutableAdd = trieNode2.mutableAdd(e2 == null ? 0 : e2.hashCode(), e2, i + 5, mutator);
                                if (mutator.size() == size) {
                                    intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                                }
                                Unit unit = Unit.INSTANCE;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                            }
                        } else if (z2) {
                            if (e2 != null) {
                                TrieNode trieNode3 = (TrieNode) e2;
                                int size2 = mutator.size();
                                mutableAdd = trieNode3.mutableAdd(e == null ? 0 : e.hashCode(), e, i + 5, mutator);
                                if (mutator.size() == size2) {
                                    intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                                }
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                            }
                        } else if (Intrinsics.areEqual(e, e2)) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            Unit unit3 = Unit.INSTANCE;
                            makeNode = e;
                        } else {
                            i2 = lowestOneBit;
                            makeNode = makeNode(e == null ? 0 : e.hashCode(), e, e2 == null ? 0 : e2.hashCode(), e2, i + 5, mutator.getOwnership$kotlinx_collections_immutable());
                            buffer[i6] = makeNode;
                            i6++;
                            i5 ^= i2;
                        }
                        makeNode = mutableAdd;
                    } else if (e != null) {
                        TrieNode trieNode4 = (TrieNode) e;
                        if (e2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                        }
                        makeNode = trieNode4.mutableAddAll((TrieNode) e2, i + 5, intersectionSizeRef, mutator);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                    }
                }
                i2 = lowestOneBit;
                buffer[i6] = makeNode;
                i6++;
                i5 ^= i2;
            }
            return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRetainAll(TrieNode<E> otherNode, int i, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder<?> mutator) {
        TrieNode trieNode;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return this;
        } else if (i > 30) {
            return mutableCollisionRetainAll(otherNode, intersectionSizeRef, mutator.getOwnership$kotlinx_collections_immutable());
        } else {
            int i2 = this.bitmap & otherNode.bitmap;
            if (i2 == 0) {
                return EMPTY;
            }
            TrieNode<E> trieNode2 = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$kotlinx_collections_immutable()) && i2 == this.bitmap) ? this : new TrieNode<>(i2, new Object[Integer.bitCount(i2)], mutator.getOwnership$kotlinx_collections_immutable());
            int i3 = i2;
            int i4 = 0;
            int i5 = 0;
            while (i3 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i3);
                int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(lowestOneBit);
                int indexOfCellAt$kotlinx_collections_immutable2 = otherNode.indexOfCellAt$kotlinx_collections_immutable(lowestOneBit);
                Object obj = getBuffer()[indexOfCellAt$kotlinx_collections_immutable];
                Object obj2 = otherNode.getBuffer()[indexOfCellAt$kotlinx_collections_immutable2];
                boolean z = obj instanceof TrieNode;
                boolean z2 = obj2 instanceof TrieNode;
                if (z && z2) {
                    if (obj != null) {
                        TrieNode trieNode3 = (TrieNode) obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                        }
                        obj = trieNode3.mutableRetainAll((TrieNode) obj2, i + 5, intersectionSizeRef, mutator);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                    }
                } else if (z) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                    }
                    if (((TrieNode) obj).contains(obj2 == null ? 0 : obj2.hashCode(), obj2, i + 5)) {
                        intersectionSizeRef.plusAssign(1);
                        obj = obj2;
                    } else {
                        obj = EMPTY;
                    }
                } else if (z2) {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                    }
                    if (((TrieNode) obj2).contains(obj == null ? 0 : obj.hashCode(), obj, i + 5)) {
                        intersectionSizeRef.plusAssign(1);
                    } else {
                        obj = EMPTY;
                    }
                } else if (Intrinsics.areEqual(obj, obj2)) {
                    intersectionSizeRef.plusAssign(1);
                } else {
                    obj = EMPTY;
                }
                if (obj != EMPTY) {
                    i4 |= lowestOneBit;
                }
                trieNode2.getBuffer()[i5] = obj;
                i5++;
                i3 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i4);
            if (i4 == 0) {
                return EMPTY;
            }
            if (i4 == i2) {
                return trieNode2.elementsIdentityEquals(this) ? this : trieNode2.elementsIdentityEquals(otherNode) ? otherNode : trieNode2;
            }
            if (bitCount == 1 && i != 0) {
                Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$kotlinx_collections_immutable(i4)];
                if (!(obj3 instanceof TrieNode)) {
                    return obj3;
                }
                trieNode = new TrieNode(i4, new Object[]{obj3}, mutator.getOwnership$kotlinx_collections_immutable());
            } else {
                Object[] objArr = new Object[bitCount];
                Object[] objArr2 = trieNode2.buffer;
                int i6 = 0;
                int i7 = 0;
                while (i6 < objArr2.length) {
                    CommonFunctionsKt.m8801assert(i7 <= i6);
                    if (objArr2[i6] != Companion.getEMPTY$kotlinx_collections_immutable()) {
                        objArr[0 + i7] = objArr2[i6];
                        i7++;
                        CommonFunctionsKt.m8801assert(0 + i7 <= bitCount);
                    }
                    i6++;
                }
                trieNode = new TrieNode(i4, objArr, mutator.getOwnership$kotlinx_collections_immutable());
            }
            return trieNode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRemoveAll(TrieNode<E> otherNode, int i, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNode;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return EMPTY;
        } else if (i > 30) {
            return mutableCollisionRemoveAll(otherNode, intersectionSizeRef, mutator.getOwnership$kotlinx_collections_immutable());
        } else {
            int i2 = this.bitmap & otherNode.bitmap;
            if (i2 == 0) {
                return this;
            }
            if (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$kotlinx_collections_immutable())) {
                trieNode = this;
            } else {
                int i3 = this.bitmap;
                Object[] objArr = this.buffer;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                trieNode = new TrieNode<>(i3, copyOf, mutator.getOwnership$kotlinx_collections_immutable());
            }
            int i4 = this.bitmap;
            while (i2 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i2);
                int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(lowestOneBit);
                int indexOfCellAt$kotlinx_collections_immutable2 = otherNode.indexOfCellAt$kotlinx_collections_immutable(lowestOneBit);
                Object obj = getBuffer()[indexOfCellAt$kotlinx_collections_immutable];
                Object obj2 = otherNode.getBuffer()[indexOfCellAt$kotlinx_collections_immutable2];
                boolean z = obj instanceof TrieNode;
                boolean z2 = obj2 instanceof TrieNode;
                if (z && z2) {
                    if (obj != null) {
                        TrieNode trieNode2 = (TrieNode) obj;
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                        }
                        obj = trieNode2.mutableRemoveAll((TrieNode) obj2, i + 5, intersectionSizeRef, mutator);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                    }
                } else if (z) {
                    if (obj != null) {
                        TrieNode trieNode3 = (TrieNode) obj;
                        int size = mutator.size();
                        TrieNode mutableRemove = trieNode3.mutableRemove(obj2 == null ? 0 : obj2.hashCode(), obj2, i + 5, mutator);
                        if (size != mutator.size()) {
                            intersectionSizeRef.plusAssign(1);
                            obj = (mutableRemove.getBuffer().length != 1 || (mutableRemove.getBuffer()[0] instanceof TrieNode)) ? mutableRemove : mutableRemove.getBuffer()[0];
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                    }
                } else if (z2) {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                    }
                    if (((TrieNode) obj2).contains(obj == null ? 0 : obj.hashCode(), obj, i + 5)) {
                        intersectionSizeRef.plusAssign(1);
                        obj = EMPTY;
                    }
                } else if (Intrinsics.areEqual(obj, obj2)) {
                    intersectionSizeRef.plusAssign(1);
                    obj = EMPTY;
                }
                if (obj == EMPTY) {
                    i4 ^= lowestOneBit;
                }
                trieNode.getBuffer()[indexOfCellAt$kotlinx_collections_immutable] = obj;
                i2 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i4);
            if (i4 == 0) {
                return EMPTY;
            }
            if (i4 == this.bitmap) {
                return trieNode.elementsIdentityEquals(this) ? this : trieNode;
            } else if (bitCount == 1 && i != 0) {
                Object obj3 = trieNode.buffer[trieNode.indexOfCellAt$kotlinx_collections_immutable(i4)];
                return obj3 instanceof TrieNode ? new TrieNode(i4, new Object[]{obj3}, mutator.getOwnership$kotlinx_collections_immutable()) : obj3;
            } else {
                Object[] objArr2 = new Object[bitCount];
                Object[] objArr3 = trieNode.buffer;
                int i5 = 0;
                int i6 = 0;
                while (i6 < objArr3.length) {
                    CommonFunctionsKt.m8801assert(i5 <= i6);
                    if (objArr3[i6] != Companion.getEMPTY$kotlinx_collections_immutable()) {
                        objArr2[0 + i5] = objArr3[i6];
                        i5++;
                        CommonFunctionsKt.m8801assert(0 + i5 <= bitCount);
                    }
                    i6++;
                }
                return new TrieNode(i4, objArr2, mutator.getOwnership$kotlinx_collections_immutable());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(TrieNode<E> otherNode, int i) {
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        if (this == otherNode) {
            return true;
        }
        if (i > 30) {
            Object[] objArr = otherNode.buffer;
            int length = objArr.length;
            int i2 = 0;
            while (i2 < length) {
                Object obj = objArr[i2];
                i2++;
                if (!ArraysKt.contains(getBuffer(), obj)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.bitmap;
        int i4 = otherNode.bitmap;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(lowestOneBit);
            int indexOfCellAt$kotlinx_collections_immutable2 = otherNode.indexOfCellAt$kotlinx_collections_immutable(lowestOneBit);
            Object obj2 = getBuffer()[indexOfCellAt$kotlinx_collections_immutable];
            Object obj3 = otherNode.getBuffer()[indexOfCellAt$kotlinx_collections_immutable2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                if (obj2 != null) {
                    TrieNode trieNode = (TrieNode) obj2;
                    if (obj3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                    }
                    if (!trieNode.containsAll((TrieNode) obj3, i + 5)) {
                        return false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
            } else if (z) {
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
                if (!((TrieNode) obj2).contains(obj3 == null ? 0 : obj3.hashCode(), obj3, i + 5)) {
                    return false;
                }
            } else if (z2 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i5 ^= lowestOneBit;
        }
        return true;
    }

    public final TrieNode<E> add(int i, E e, int i2) {
        TrieNode<E> add;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e, null);
        }
        int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(indexSegment);
        Object obj = this.buffer[indexOfCellAt$kotlinx_collections_immutable];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(e, obj) ? this : moveElementToNode(indexOfCellAt$kotlinx_collections_immutable, i, e, i2, null);
        }
        TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$kotlinx_collections_immutable);
        if (i2 == 30) {
            add = nodeAtIndex.collisionAdd(e);
        } else {
            add = nodeAtIndex.add(i, e, i2 + 5);
        }
        return nodeAtIndex == add ? this : setCellAtIndex(indexOfCellAt$kotlinx_collections_immutable, add, null);
    }

    public final TrieNode<E> mutableAdd(int i, E e, int i2, PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> mutableAdd;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return addElementAt(indexSegment, e, mutator.getOwnership$kotlinx_collections_immutable());
        }
        int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(indexSegment);
        Object obj = this.buffer[indexOfCellAt$kotlinx_collections_immutable];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$kotlinx_collections_immutable);
            if (i2 == 30) {
                mutableAdd = nodeAtIndex.mutableCollisionAdd(e, mutator);
            } else {
                mutableAdd = nodeAtIndex.mutableAdd(i, e, i2 + 5, mutator);
            }
            return nodeAtIndex == mutableAdd ? this : setCellAtIndex(indexOfCellAt$kotlinx_collections_immutable, mutableAdd, mutator.getOwnership$kotlinx_collections_immutable());
        } else if (Intrinsics.areEqual(e, obj)) {
            return this;
        } else {
            mutator.setSize(mutator.size() + 1);
            return moveElementToNode(indexOfCellAt$kotlinx_collections_immutable, i, e, i2, mutator.getOwnership$kotlinx_collections_immutable());
        }
    }

    public final TrieNode<E> remove(int i, E e, int i2) {
        TrieNode<E> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(indexSegment);
        Object obj = this.buffer[indexOfCellAt$kotlinx_collections_immutable];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(e, obj) ? removeCellAtIndex(indexOfCellAt$kotlinx_collections_immutable, indexSegment, null) : this;
        }
        TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$kotlinx_collections_immutable);
        if (i2 == 30) {
            remove = nodeAtIndex.collisionRemove(e);
        } else {
            remove = nodeAtIndex.remove(i, e, i2 + 5);
        }
        return nodeAtIndex == remove ? this : canonicalizeNodeAtIndex(indexOfCellAt$kotlinx_collections_immutable, remove, null);
    }

    public final TrieNode<E> mutableRemove(int i, E e, int i2, PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$kotlinx_collections_immutable = indexOfCellAt$kotlinx_collections_immutable(indexSegment);
        Object obj = this.buffer[indexOfCellAt$kotlinx_collections_immutable];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$kotlinx_collections_immutable);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex.mutableCollisionRemove(e, mutator);
            } else {
                mutableRemove = nodeAtIndex.mutableRemove(i, e, i2 + 5, mutator);
            }
            return (nodeAtIndex.ownedBy == mutator.getOwnership$kotlinx_collections_immutable() || nodeAtIndex != mutableRemove) ? canonicalizeNodeAtIndex(indexOfCellAt$kotlinx_collections_immutable, mutableRemove, mutator.getOwnership$kotlinx_collections_immutable()) : this;
        } else if (Intrinsics.areEqual(e, obj)) {
            mutator.setSize(mutator.size() - 1);
            return removeCellAtIndex(indexOfCellAt$kotlinx_collections_immutable, indexSegment, mutator.getOwnership$kotlinx_collections_immutable());
        } else {
            return this;
        }
    }

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$kotlinx_collections_immutable", "()Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$kotlinx_collections_immutable() {
            return TrieNode.EMPTY;
        }
    }
}
