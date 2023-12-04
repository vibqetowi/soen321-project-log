package kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PersistentOrderedMap.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "a", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "b", "", "invoke", "(Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class PersistentOrderedMap$equals$3 extends Lambda implements Function2<LinkedValue<V>, ?, Boolean> {
    public static final PersistentOrderedMap$equals$3 INSTANCE = new PersistentOrderedMap$equals$3();

    PersistentOrderedMap$equals$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2) {
        return invoke((LinkedValue) obj, (Object) obj2);
    }

    public final Boolean invoke(LinkedValue<V> a, Object obj) {
        Intrinsics.checkNotNullParameter(a, "a");
        return Boolean.valueOf(Intrinsics.areEqual(a.getValue(), obj));
    }
}
