package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
/* compiled from: CollectionSerializers.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0005B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\u00028\u0001H\u0014¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\r*\u00028\u0001H\u0014¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/internal/CollectionSerializer;", ExifInterface.LONGITUDE_EAST, "C", "", "B", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "element", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "collectionIterator", "", "(Ljava/util/Collection;)Ljava/util/Iterator;", "collectionSize", "", "(Ljava/util/Collection;)I", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B> extends CollectionLikeSerializer<E, C, B> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Iterator collectionIterator(Object obj) {
        return collectionIterator((CollectionSerializer<E, C, B>) ((Collection) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return collectionSize((CollectionSerializer<E, C, B>) ((Collection) obj));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSerializer(KSerializer<E> element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    protected int collectionSize(C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return c.size();
    }

    protected Iterator<E> collectionIterator(C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return c.iterator();
    }
}
