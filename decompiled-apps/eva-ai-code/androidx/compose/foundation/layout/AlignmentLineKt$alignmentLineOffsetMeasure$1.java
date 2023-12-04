package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ AlignmentLine $alignmentLine;
    final /* synthetic */ float $before;
    final /* synthetic */ int $height;
    final /* synthetic */ int $paddingAfter;
    final /* synthetic */ int $paddingBefore;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $width;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine alignmentLine, float f, int i, int i2, int i3, Placeable placeable, int i4) {
        super(1);
        this.$alignmentLine = alignmentLine;
        this.$before = f;
        this.$paddingBefore = i;
        this.$width = i2;
        this.$paddingAfter = i3;
        this.$placeable = placeable;
        this.$height = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        boolean horizontal;
        int width;
        boolean horizontal2;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        horizontal = AlignmentLineKt.getHorizontal(this.$alignmentLine);
        int i = 0;
        if (horizontal) {
            width = 0;
        } else {
            width = !Dp.m5612equalsimpl0(this.$before, Dp.Companion.m5627getUnspecifiedD9Ej5fM()) ? this.$paddingBefore : (this.$width - this.$paddingAfter) - this.$placeable.getWidth();
        }
        horizontal2 = AlignmentLineKt.getHorizontal(this.$alignmentLine);
        if (horizontal2) {
            i = !Dp.m5612equalsimpl0(this.$before, Dp.Companion.m5627getUnspecifiedD9Ej5fM()) ? this.$paddingBefore : (this.$height - this.$paddingAfter) - this.$placeable.getHeight();
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, width, i, 0.0f, 4, null);
    }
}
