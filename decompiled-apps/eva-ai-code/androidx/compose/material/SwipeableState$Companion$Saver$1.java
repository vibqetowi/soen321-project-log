package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material/SwipeableState;", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/material/SwipeableState;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, SwipeableState<T>, T> {
    public static final SwipeableState$Companion$Saver$1 INSTANCE = new SwipeableState$Companion$Saver$1();

    SwipeableState$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Object obj) {
        return invoke(saverScope, (SwipeableState<Object>) obj);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    public final T invoke(SaverScope Saver, SwipeableState<T> it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCurrentValue();
    }
}
