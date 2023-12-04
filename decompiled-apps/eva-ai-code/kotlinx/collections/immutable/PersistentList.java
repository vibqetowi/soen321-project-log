package kotlinx.collections.immutable;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentCollection;
/* compiled from: ImmutableList.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0019J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ$\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H&J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\u001a"}, d2 = {"Lkotlinx/collections/immutable/PersistentList;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlinx/collections/immutable/PersistentCollection;", "add", "element", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;", FirebaseAnalytics.Param.INDEX, "", "(ILjava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;", "addAll", "c", "", "elements", "builder", "Lkotlinx/collections/immutable/PersistentList$Builder;", "clear", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "retainAll", "set", "Builder", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    /* compiled from: ImmutableList.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lkotlinx/collections/immutable/PersistentList$Builder;", ExifInterface.LONGITUDE_EAST, "", "Lkotlinx/collections/immutable/PersistentCollection$Builder;", "build", "Lkotlinx/collections/immutable/PersistentList;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, KMutableList {
        @Override // kotlinx.collections.immutable.PersistentCollection.Builder
        PersistentList<E> build();
    }

    @Override // java.util.List
    PersistentList<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> add(E e);

    @Override // java.util.List
    PersistentList<E> addAll(int i, Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> addAll(Collection<? extends E> collection);

    @Override // kotlinx.collections.immutable.PersistentCollection
    Builder<E> builder();

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> clear();

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> remove(E e);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> removeAll(Collection<? extends E> collection);

    @Override // kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> removeAll(Function1<? super E, Boolean> function1);

    PersistentList<E> removeAt(int i);

    @Override // java.util.List, java.util.Collection, kotlinx.collections.immutable.PersistentCollection
    PersistentList<E> retainAll(Collection<? extends E> collection);

    @Override // java.util.List
    PersistentList<E> set(int i, E e);

    /* compiled from: ImmutableList.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static <E> ImmutableList<E> subList(PersistentList<? extends E> persistentList, int i, int i2) {
            Intrinsics.checkNotNullParameter(persistentList, "this");
            return ImmutableList.DefaultImpls.subList(persistentList, i, i2);
        }
    }
}
