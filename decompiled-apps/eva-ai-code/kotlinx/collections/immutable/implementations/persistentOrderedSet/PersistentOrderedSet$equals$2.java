package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PersistentOrderedSet.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "<anonymous parameter 0>", "Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "<anonymous parameter 1>", "invoke", "(Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;Lkotlinx/collections/immutable/implementations/persistentOrderedSet/Links;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class PersistentOrderedSet$equals$2 extends Lambda implements Function2<Links, Links, Boolean> {
    public static final PersistentOrderedSet$equals$2 INSTANCE = new PersistentOrderedSet$equals$2();

    PersistentOrderedSet$equals$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Links noName_0, Links noName_1) {
        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return true;
    }
}
