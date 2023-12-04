package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TrieNode.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001_B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006¢\u0006\u0002\u0010\u0007B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0004H\u0002J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u0004H\u0002J#\u0010)\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010*J\u001c\u0010+\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u0004J\u0015\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010/J\u0016\u00100\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0010\u00101\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b3JE\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010:J=\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010?J3\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010AJ5\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ6\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ+\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010JJ'\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ,\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J'\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001a\u001a\u00028\u00002\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DH\u0002¢\u0006\u0002\u0010LJ(\u0010O\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J(\u0010Q\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001a\u00020H2\u0006\u00109\u001a\u00020\tH\u0002J;\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0002\u0010?J5\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00042\n\u0010C\u001a\u0006\u0012\u0002\b\u00030D¢\u0006\u0002\u0010EJ2\u0010T\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ&\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u00109\u001a\u00020\tH\u0002J2\u0010W\u001a\u0004\u0018\u00010\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030DJ,\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001a\u00020\tH\u0002J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010.\u001a\u00020\u0004H\u0002J)\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0002\u0010\u001cJ\u001e\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J$\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001a\u00020\u00042\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", ExifInterface.LONGITUDE_EAST, "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", "i", "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$runtime_release", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "owner", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRemoveElementAtIndex", "mutableCollisionRetainAll", "mutableMoveElementToNode", "mutableRemove", "mutableRemoveAll", "mutableRemoveCellAtIndex", "cellIndex", "mutableRetainAll", "mutableUpdateNodeAtIndex", "nodeIndex", "newNode", "nodeAtIndex", "remove", "removeCellAtIndex", "updateNodeAtIndex", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
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

    public final int indexOfCellAt$runtime_release(int i) {
        return Integer.bitCount((i - 1) & this.bitmap);
    }

    private final E elementAtIndex(int i) {
        return (E) this.buffer[i];
    }

    private final TrieNode<E> nodeAtIndex(int i) {
        Object obj = this.buffer[i];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> addElementAt(int i, E e) {
        Object[] addElementAtIndex;
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i), e);
        return new TrieNode<>(i | this.bitmap, addElementAtIndex);
    }

    private final TrieNode<E> mutableAddElementAt(int i, E e, MutabilityOwnership mutabilityOwnership) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i);
        if (this.ownedBy == mutabilityOwnership) {
            addElementAtIndex2 = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e);
            this.buffer = addElementAtIndex2;
            this.bitmap = i | this.bitmap;
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release, e);
        return new TrieNode<>(i | this.bitmap, addElementAtIndex, mutabilityOwnership);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode<E> updateNodeAtIndex(int i, TrieNode<E> trieNode) {
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
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
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
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i] = trieNode;
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = trieNode;
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        E elementAtIndex = elementAtIndex(i);
        return makeNode(elementAtIndex != null ? elementAtIndex.hashCode() : 0, elementAtIndex, i2, e, i3 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i, int i2, E e, int i3) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = makeNodeAtIndex(i, i2, e, i3, null);
        return new TrieNode<>(this.bitmap, copyOf);
    }

    private final TrieNode<E> mutableMoveElementToNode(int i, int i2, E e, int i3, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i] = makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i] = makeNodeAtIndex(i, i2, e, i3, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, copyOf, mutabilityOwnership);
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

    private final TrieNode<E> removeCellAtIndex(int i, int i2) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new TrieNode<>(i2 ^ this.bitmap, removeCellAtIndex);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i, int i2, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        if (this.ownedBy == mutabilityOwnership) {
            removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(this.buffer, i);
            this.buffer = removeCellAtIndex2;
            this.bitmap ^= i2;
            return this;
        }
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new TrieNode<>(i2 ^ this.bitmap, removeCellAtIndex, mutabilityOwnership);
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i) {
        Object[] removeCellAtIndex;
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new TrieNode<>(0, removeCellAtIndex);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i, MutabilityOwnership mutabilityOwnership) {
        Object[] removeCellAtIndex;
        Object[] removeCellAtIndex2;
        if (this.ownedBy == mutabilityOwnership) {
            removeCellAtIndex2 = TrieNodeKt.removeCellAtIndex(this.buffer, i);
            this.buffer = removeCellAtIndex2;
            return this;
        }
        removeCellAtIndex = TrieNodeKt.removeCellAtIndex(this.buffer, i);
        return new TrieNode<>(0, removeCellAtIndex, mutabilityOwnership);
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
        return new TrieNode<>(0, addElementAtIndex);
    }

    private final TrieNode<E> mutableCollisionAdd(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object[] addElementAtIndex;
        Object[] addElementAtIndex2;
        if (collisionContainsElement(e)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime_release()) {
            addElementAtIndex2 = TrieNodeKt.addElementAtIndex(this.buffer, 0, e);
            this.buffer = addElementAtIndex2;
            return this;
        }
        addElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, 0, e);
        return new TrieNode<>(0, addElementAtIndex, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<E> collisionRemove(E e) {
        int indexOf = ArraysKt.indexOf((E[]) this.buffer, e);
        return indexOf != -1 ? collisionRemoveElementAtIndex(indexOf) : this;
    }

    private final TrieNode<E> mutableCollisionRemove(E e, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int indexOf = ArraysKt.indexOf((E[]) this.buffer, e);
        if (indexOf != -1) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
            return mutableCollisionRemoveElementAtIndex(indexOf, persistentHashSetBuilder.getOwnership$runtime_release());
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
            CommonFunctionsKt.m2906assert(i2 <= i);
            if (!collisionContainsElement((E) objArr2[i])) {
                copyOf[length + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m2906assert(length + i2 <= copyOf.length);
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
        if (Intrinsics.areEqual(this.ownedBy, mutabilityOwnership)) {
            this.buffer = copyOf;
            return this;
        }
        return new TrieNode<>(0, copyOf, mutabilityOwnership);
    }

    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = Intrinsics.areEqual(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m2906assert(i2 <= i);
            if (trieNode.collisionContainsElement((E) objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m2906assert(0 + i2 <= objArr.length);
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
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        Object[] objArr = Intrinsics.areEqual(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m2906assert(i2 <= i);
            if (!trieNode.collisionContainsElement((E) objArr2[i])) {
                objArr[0 + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m2906assert(0 + i2 <= objArr.length);
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
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] copyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return new TrieNode(0, copyOf, mutabilityOwnership);
    }

    private final int calculateSize() {
        Object[] objArr;
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int i = 0;
        for (Object obj : this.buffer) {
            i += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return i;
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != trieNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean contains(int i, E e, int i2) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return false;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                return nodeAtIndex.collisionContainsElement(e);
            }
            return nodeAtIndex.contains(i, e, i2 + 5);
        }
        return Intrinsics.areEqual(e, obj);
    }

    public final TrieNode<E> mutableAddAll(TrieNode<E> otherNode, int i, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder<?> mutator) {
        Object[] objArr;
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
            return mutableCollisionAddAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime_release());
        } else {
            int i3 = this.bitmap;
            int i4 = otherNode.bitmap | i3;
            TrieNode<E> trieNode = (i4 == i3 && Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$runtime_release())) ? this : new TrieNode<>(i4, new Object[Integer.bitCount(i4)], mutator.getOwnership$runtime_release());
            int i5 = i4;
            int i6 = 0;
            while (i5 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i5);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
                Object[] objArr2 = trieNode.buffer;
                if (hasNoCellAt(lowestOneBit)) {
                    makeNode = (TrieNode<E>) otherNode.buffer[indexOfCellAt$runtime_release2];
                } else if (otherNode.hasNoCellAt(lowestOneBit)) {
                    makeNode = this.buffer[indexOfCellAt$runtime_release];
                } else {
                    E e = (E) this.buffer[indexOfCellAt$runtime_release];
                    E e2 = (E) otherNode.buffer[indexOfCellAt$runtime_release2];
                    boolean z = e instanceof TrieNode;
                    boolean z2 = e2 instanceof TrieNode;
                    if (z && z2) {
                        Intrinsics.checkNotNull(e, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        Intrinsics.checkNotNull(e2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                        makeNode = ((TrieNode) e).mutableAddAll((TrieNode) e2, i + 5, intersectionSizeRef, mutator);
                    } else {
                        if (z) {
                            Intrinsics.checkNotNull(e, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                            TrieNode trieNode2 = (TrieNode) e;
                            int size = mutator.size();
                            mutableAdd = trieNode2.mutableAdd(e2 != null ? e2.hashCode() : 0, e2, i + 5, mutator);
                            if (mutator.size() == size) {
                                intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            }
                            Unit unit = Unit.INSTANCE;
                        } else if (z2) {
                            Intrinsics.checkNotNull(e2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                            TrieNode trieNode3 = (TrieNode) e2;
                            int size2 = mutator.size();
                            mutableAdd = trieNode3.mutableAdd(e != null ? e.hashCode() : 0, e, i + 5, mutator);
                            if (mutator.size() == size2) {
                                intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } else if (Intrinsics.areEqual(e, e2)) {
                            intersectionSizeRef.setCount(intersectionSizeRef.getCount() + 1);
                            Unit unit3 = Unit.INSTANCE;
                            makeNode = e;
                        } else {
                            objArr = objArr2;
                            i2 = lowestOneBit;
                            makeNode = makeNode(e != null ? e.hashCode() : 0, e, e2 != null ? e2.hashCode() : 0, e2, i + 5, mutator.getOwnership$runtime_release());
                            objArr[i6] = makeNode;
                            i6++;
                            i5 ^= i2;
                        }
                        makeNode = mutableAdd;
                    }
                }
                objArr = objArr2;
                i2 = lowestOneBit;
                objArr[i6] = makeNode;
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
            return mutableCollisionRetainAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime_release());
        } else {
            int i2 = this.bitmap & otherNode.bitmap;
            if (i2 == 0) {
                return EMPTY;
            }
            TrieNode<E> trieNode2 = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$runtime_release()) && i2 == this.bitmap) ? this : new TrieNode<>(i2, new Object[Integer.bitCount(i2)], mutator.getOwnership$runtime_release());
            int i3 = i2;
            int i4 = 0;
            int i5 = 0;
            while (i3 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i3);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
                Object obj = this.buffer[indexOfCellAt$runtime_release];
                Object obj2 = otherNode.buffer[indexOfCellAt$runtime_release2];
                boolean z = obj instanceof TrieNode;
                boolean z2 = obj2 instanceof TrieNode;
                if (z && z2) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    obj = ((TrieNode) obj).mutableRetainAll((TrieNode) obj2, i + 5, intersectionSizeRef, mutator);
                } else if (z) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    if (((TrieNode) obj).contains(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5)) {
                        intersectionSizeRef.plusAssign(1);
                        obj = obj2;
                    } else {
                        obj = EMPTY;
                    }
                } else if (z2) {
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                    if (((TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, i + 5)) {
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
                trieNode2.buffer[i5] = obj;
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
                Object obj3 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime_release(i4)];
                if (!(obj3 instanceof TrieNode)) {
                    return obj3;
                }
                trieNode = new TrieNode(i4, new Object[]{obj3}, mutator.getOwnership$runtime_release());
            } else {
                Object[] objArr = new Object[bitCount];
                Object[] objArr2 = trieNode2.buffer;
                int i6 = 0;
                int i7 = 0;
                while (i6 < objArr2.length) {
                    CommonFunctionsKt.m2906assert(i7 <= i6);
                    if (objArr2[i6] != Companion.getEMPTY$runtime_release()) {
                        objArr[0 + i7] = objArr2[i6];
                        i7++;
                        CommonFunctionsKt.m2906assert(0 + i7 <= bitCount);
                    }
                    i6++;
                }
                trieNode = new TrieNode(i4, objArr, mutator.getOwnership$runtime_release());
            }
            return trieNode;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
        if ((r13 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mutableRemoveAll(TrieNode<E> otherNode, int i, DeltaCounter intersectionSizeRef, PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> trieNode;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionSizeRef, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.plusAssign(calculateSize());
            return EMPTY;
        } else if (i > 30) {
            return mutableCollisionRemoveAll(otherNode, intersectionSizeRef, mutator.getOwnership$runtime_release());
        } else {
            int i2 = this.bitmap & otherNode.bitmap;
            if (i2 == 0) {
                return this;
            }
            if (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership$runtime_release())) {
                trieNode = this;
            } else {
                int i3 = this.bitmap;
                Object[] objArr = this.buffer;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                trieNode = new TrieNode<>(i3, copyOf, mutator.getOwnership$runtime_release());
            }
            int i4 = this.bitmap;
            while (i2 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i2);
                int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
                int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
                Object obj = this.buffer[indexOfCellAt$runtime_release];
                Object obj2 = otherNode.buffer[indexOfCellAt$runtime_release2];
                boolean z = obj instanceof TrieNode;
                boolean z2 = obj2 instanceof TrieNode;
                if (z && z2) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                    obj = ((TrieNode) obj).mutableRemoveAll((TrieNode) obj2, i + 5, intersectionSizeRef, mutator);
                } else if (z) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                    TrieNode trieNode2 = (TrieNode) obj;
                    int size = mutator.size();
                    TrieNode mutableRemove = trieNode2.mutableRemove(obj2 != null ? obj2.hashCode() : 0, obj2, i + 5, mutator);
                    if (size != mutator.size()) {
                        intersectionSizeRef.plusAssign(1);
                        Object[] objArr2 = mutableRemove.buffer;
                        if (objArr2.length == 1) {
                            obj = objArr2[0];
                        }
                        obj = mutableRemove;
                    }
                } else if (z2) {
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda$11$lambda$10>");
                    if (((TrieNode) obj2).contains(obj != null ? obj.hashCode() : 0, obj, i + 5)) {
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
                trieNode.buffer[indexOfCellAt$runtime_release] = obj;
                i2 ^= lowestOneBit;
            }
            int bitCount = Integer.bitCount(i4);
            if (i4 == 0) {
                return EMPTY;
            }
            if (i4 == this.bitmap) {
                return trieNode.elementsIdentityEquals(this) ? this : trieNode;
            } else if (bitCount == 1 && i != 0) {
                Object obj3 = trieNode.buffer[trieNode.indexOfCellAt$runtime_release(i4)];
                return obj3 instanceof TrieNode ? new TrieNode(i4, new Object[]{obj3}, mutator.getOwnership$runtime_release()) : obj3;
            } else {
                Object[] objArr3 = new Object[bitCount];
                Object[] objArr4 = trieNode.buffer;
                int i5 = 0;
                int i6 = 0;
                while (i5 < objArr4.length) {
                    CommonFunctionsKt.m2906assert(i6 <= i5);
                    if (objArr4[i5] != Companion.getEMPTY$runtime_release()) {
                        objArr3[0 + i6] = objArr4[i5];
                        i6++;
                        CommonFunctionsKt.m2906assert(0 + i6 <= bitCount);
                    }
                    i5++;
                }
                return new TrieNode(i4, objArr3, mutator.getOwnership$runtime_release());
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
            for (Object obj : otherNode.buffer) {
                if (!ArraysKt.contains(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i2 = this.bitmap;
        int i3 = otherNode.bitmap;
        int i4 = i2 & i3;
        if (i4 != i3) {
            return false;
        }
        while (i4 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i4);
            int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(lowestOneBit);
            int indexOfCellAt$runtime_release2 = otherNode.indexOfCellAt$runtime_release(lowestOneBit);
            Object obj2 = this.buffer[indexOfCellAt$runtime_release];
            Object obj3 = otherNode.buffer[indexOfCellAt$runtime_release2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, i + 5)) {
                    return false;
                }
            } else if (z) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, i + 5)) {
                    return false;
                }
            } else if (z2 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i4 ^= lowestOneBit;
        }
        return true;
    }

    public final TrieNode<E> add(int i, E e, int i2) {
        TrieNode<E> add;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return addElementAt(indexSegment, e);
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(e, obj) ? this : moveElementToNode(indexOfCellAt$runtime_release, i, e, i2);
        }
        TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
        if (i2 == 30) {
            add = nodeAtIndex.collisionAdd(e);
        } else {
            add = nodeAtIndex.add(i, e, i2 + 5);
        }
        return nodeAtIndex == add ? this : updateNodeAtIndex(indexOfCellAt$runtime_release, add);
    }

    public final TrieNode<E> mutableAdd(int i, E e, int i2, PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> mutableAdd;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableAddElementAt(indexSegment, e, mutator.getOwnership$runtime_release());
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                mutableAdd = nodeAtIndex.mutableCollisionAdd(e, mutator);
            } else {
                mutableAdd = nodeAtIndex.mutableAdd(i, e, i2 + 5, mutator);
            }
            return nodeAtIndex == mutableAdd ? this : mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableAdd, mutator.getOwnership$runtime_release());
        } else if (Intrinsics.areEqual(e, obj)) {
            return this;
        } else {
            mutator.setSize(mutator.size() + 1);
            return mutableMoveElementToNode(indexOfCellAt$runtime_release, i, e, i2, mutator.getOwnership$runtime_release());
        }
    }

    public final TrieNode<E> remove(int i, E e, int i2) {
        TrieNode<E> remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(e, obj) ? removeCellAtIndex(indexOfCellAt$runtime_release, indexSegment) : this;
        }
        TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
        if (i2 == 30) {
            remove = nodeAtIndex.collisionRemove(e);
        } else {
            remove = nodeAtIndex.remove(i, e, i2 + 5);
        }
        return nodeAtIndex == remove ? this : updateNodeAtIndex(indexOfCellAt$runtime_release, remove);
    }

    public final TrieNode<E> mutableRemove(int i, E e, int i2, PersistentHashSetBuilder<?> mutator) {
        TrieNode<E> mutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int indexSegment = 1 << TrieNodeKt.indexSegment(i, i2);
        if (hasNoCellAt(indexSegment)) {
            return this;
        }
        int indexOfCellAt$runtime_release = indexOfCellAt$runtime_release(indexSegment);
        Object obj = this.buffer[indexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> nodeAtIndex = nodeAtIndex(indexOfCellAt$runtime_release);
            if (i2 == 30) {
                mutableRemove = nodeAtIndex.mutableCollisionRemove(e, mutator);
            } else {
                mutableRemove = nodeAtIndex.mutableRemove(i, e, i2 + 5, mutator);
            }
            return (this.ownedBy == mutator.getOwnership$runtime_release() || nodeAtIndex != mutableRemove) ? mutableUpdateNodeAtIndex(indexOfCellAt$runtime_release, mutableRemove, mutator.getOwnership$runtime_release()) : this;
        } else if (Intrinsics.areEqual(e, obj)) {
            mutator.setSize(mutator.size() - 1);
            return mutableRemoveCellAtIndex(indexOfCellAt$runtime_release, indexSegment, mutator.getOwnership$runtime_release());
        } else {
            return this;
        }
    }

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }
}
