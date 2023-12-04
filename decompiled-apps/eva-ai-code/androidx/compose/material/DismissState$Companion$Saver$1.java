package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeToDismiss.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material/DismissValue;", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material/DismissState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DismissState$Companion$Saver$1 extends Lambda implements Function2<SaverScope, DismissState, DismissValue> {
    public static final DismissState$Companion$Saver$1 INSTANCE = new DismissState$Companion$Saver$1();

    DismissState$Companion$Saver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final DismissValue invoke(SaverScope Saver, DismissState it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCurrentValue();
    }
}
