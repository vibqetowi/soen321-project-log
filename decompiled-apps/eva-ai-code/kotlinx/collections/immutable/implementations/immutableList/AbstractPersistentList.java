package kotlinx.collections.immutable.implementations.immutableList;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentCollection;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: AbstractPersistentList.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¨\u0006\u001d"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", ExifInterface.LONGITUDE_EAST, "Lkotlinx/collections/immutable/PersistentList;", "Lkotlin/collections/AbstractList;", "()V", "addAll", FirebaseAnalytics.Param.INDEX, "", "c", "", "elements", "clear", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "", "listIterator", "", "remove", "(Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;", "removeAll", "retainAll", "subList", "Lkotlinx/collections/immutable/ImmutableList;", "fromIndex", "toIndex", "kotlinx-collections-immutable"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractPersistentList<E> extends AbstractList<E> implements PersistentList<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection remove(Object obj) {
        return remove((AbstractPersistentList<E>) obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public ImmutableList<E> subList(int i, int i2) {
        return PersistentList.DefaultImpls.subList(this, i, i2);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PersistentList.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int i, Collection<? extends E> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i, c);
        return builder.build();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> remove(E e) {
        int indexOf = indexOf(e);
        if (indexOf != -1) {
            return removeAt(indexOf);
        }
        return this;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return removeAll((Function1) new AbstractPersistentList$removeAll$1(elements));
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> retainAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return removeAll((Function1) new AbstractPersistentList$retainAll$1(elements));
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> clear() {
        return UtilsKt.persistentVectorOf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }
}
