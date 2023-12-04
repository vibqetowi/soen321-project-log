package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PersistentOrderedMap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "a", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "b", "", "invoke", "(Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class PersistentOrderedMap$equals$2 extends Lambda implements Function2<LinkedValue<V>, ?, Boolean> {
    public static final PersistentOrderedMap$equals$2 INSTANCE = new PersistentOrderedMap$equals$2();

    PersistentOrderedMap$equals$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(LinkedValue<V> a, LinkedValue<? extends Object> b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return Boolean.valueOf(Intrinsics.areEqual(a.getValue(), b.getValue()));
    }
}
