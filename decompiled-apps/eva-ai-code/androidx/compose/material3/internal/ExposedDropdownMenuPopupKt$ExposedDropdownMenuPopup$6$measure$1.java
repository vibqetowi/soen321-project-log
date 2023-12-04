package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public static final ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1 INSTANCE = new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1();

    ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }
}
