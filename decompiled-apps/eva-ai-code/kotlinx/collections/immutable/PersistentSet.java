package kotlinx.collections.immutable;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlinx.collections.immutable.PersistentCollection;
/* compiled from: ImmutableSet.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0013J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0010H&J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¨\u0006\u0014"}, d2 = {"Lkotlinx/collections/immutable/PersistentSet;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlinx/collections/immutable/PersistentCollection;", "add", "element", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentSet;", "addAll", "elements", "", "builder", "Lkotlinx/collections/immutable/PersistentSet$Builder;", "clear", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "", "retainAll", "Builder", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    /* compiled from: ImmutableSet.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lkotlinx/collections/immutable/PersistentSet$Builder;", ExifInterface.LONGITUDE_EAST, "", "Lkotlinx/collections/immutable/PersistentCollection$Builder;", "build", "Lkotlinx/collections/immutable/PersistentSet;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, KMutableSet {
        @Override // kotlinx.collections.immutable.PersistentCollection.Builder
        PersistentSet<E> build();
    }

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> add(E e);

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> addAll(Collection<? extends E> collection);

    @Override // kotlinx.collections.immutable.PersistentCollection
    Builder<E> builder();

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> clear();

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> remove(E e);

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> removeAll(Collection<? extends E> collection);

    @Override // kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> removeAll(Function1<? super E, Boolean> function1);

    @Override // java.util.Set, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentSet<E> retainAll(Collection<? extends E> collection);
}
