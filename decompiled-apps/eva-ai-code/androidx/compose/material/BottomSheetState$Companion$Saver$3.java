package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material/BottomSheetValue;", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/material/BottomSheetState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BottomSheetState$Companion$Saver$3 extends Lambda implements Function2<SaverScope, BottomSheetState, BottomSheetValue> {
    public static final BottomSheetState$Companion$Saver$3 INSTANCE = new BottomSheetState$Companion$Saver$3();

    BottomSheetState$Companion$Saver$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final BottomSheetValue invoke(SaverScope Saver, BottomSheetState it) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAnchoredDraggableState$material_release().getCurrentValue();
    }
}
