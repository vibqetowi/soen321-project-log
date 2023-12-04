package kotlinx.collections.immutable.implementations.immutableMap;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue;
/* compiled from: PersistentHashMapBuilder.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "a", "b", "Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "invoke", "(Ljava/lang/Object;Lkotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class PersistentHashMapBuilder$equals$4 extends Lambda implements Function2<V, ?, Boolean> {
    public static final PersistentHashMapBuilder$equals$4 INSTANCE = new PersistentHashMapBuilder$equals$4();

    PersistentHashMapBuilder$equals$4() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj, Object obj2) {
        return invoke((PersistentHashMapBuilder$equals$4) obj, (LinkedValue) obj2);
    }

    public final Boolean invoke(V v, LinkedValue<? extends Object> b) {
        Intrinsics.checkNotNullParameter(b, "b");
        return Boolean.valueOf(Intrinsics.areEqual(v, b.getValue()));
    }
}
