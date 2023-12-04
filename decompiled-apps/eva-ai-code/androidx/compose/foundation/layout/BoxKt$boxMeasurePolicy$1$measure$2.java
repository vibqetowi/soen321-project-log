package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BoxKt$boxMeasurePolicy$1$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ int $boxHeight;
    final /* synthetic */ int $boxWidth;
    final /* synthetic */ Measurable $measurable;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_MeasurePolicy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxKt$boxMeasurePolicy$1$measure$2(Placeable placeable, Measurable measurable, MeasureScope measureScope, int i, int i2, Alignment alignment) {
        super(1);
        this.$placeable = placeable;
        this.$measurable = measurable;
        this.$this_MeasurePolicy = measureScope;
        this.$boxWidth = i;
        this.$boxHeight = i2;
        this.$alignment = alignment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        BoxKt.placeInBox(layout, this.$placeable, this.$measurable, this.$this_MeasurePolicy.getLayoutDirection(), this.$boxWidth, this.$boxHeight, this.$alignment);
    }
}
