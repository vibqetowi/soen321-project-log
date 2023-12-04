package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AppBarKt$TopAppBarLayout$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $actionIconsPlaceable;
    final /* synthetic */ long $constraints;
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ Placeable $navigationIconPlaceable;
    final /* synthetic */ MeasureScope $this_Layout;
    final /* synthetic */ int $titleBaseline;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ Arrangement.Horizontal $titleHorizontalArrangement;
    final /* synthetic */ Placeable $titlePlaceable;
    final /* synthetic */ Arrangement.Vertical $titleVerticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBarLayout$2$measure$1(Placeable placeable, int i, Placeable placeable2, Arrangement.Horizontal horizontal, long j, Placeable placeable3, MeasureScope measureScope, Arrangement.Vertical vertical, int i2, int i3) {
        super(1);
        this.$navigationIconPlaceable = placeable;
        this.$layoutHeight = i;
        this.$titlePlaceable = placeable2;
        this.$titleHorizontalArrangement = horizontal;
        this.$constraints = j;
        this.$actionIconsPlaceable = placeable3;
        this.$this_Layout = measureScope;
        this.$titleVerticalArrangement = vertical;
        this.$titleBottomPadding = i2;
        this.$titleBaseline = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        float f;
        int max;
        int i;
        int height;
        int max2;
        int i2;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable = this.$navigationIconPlaceable;
        Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, (this.$layoutHeight - placeable.getHeight()) / 2, 0.0f, 4, null);
        Placeable placeable2 = this.$titlePlaceable;
        Arrangement.Horizontal horizontal = this.$titleHorizontalArrangement;
        if (Intrinsics.areEqual(horizontal, Arrangement.INSTANCE.getCenter())) {
            max = (Constraints.m5551getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) / 2;
        } else if (Intrinsics.areEqual(horizontal, Arrangement.INSTANCE.getEnd())) {
            max = (Constraints.m5551getMaxWidthimpl(this.$constraints) - this.$titlePlaceable.getWidth()) - this.$actionIconsPlaceable.getWidth();
        } else {
            MeasureScope measureScope = this.$this_Layout;
            f = AppBarKt.TopAppBarTitleInset;
            max = Math.max(measureScope.mo582roundToPx0680j_4(f), this.$navigationIconPlaceable.getWidth());
        }
        int i3 = max;
        Arrangement.Vertical vertical = this.$titleVerticalArrangement;
        if (Intrinsics.areEqual(vertical, Arrangement.INSTANCE.getCenter())) {
            i2 = (this.$layoutHeight - this.$titlePlaceable.getHeight()) / 2;
        } else if (!Intrinsics.areEqual(vertical, Arrangement.INSTANCE.getBottom())) {
            i = 0;
            Placeable.PlacementScope.placeRelative$default(layout, placeable2, i3, i, 0.0f, 4, null);
            Placeable.PlacementScope.placeRelative$default(layout, this.$actionIconsPlaceable, Constraints.m5551getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, null);
        } else {
            if (this.$titleBottomPadding == 0) {
                height = this.$layoutHeight;
                max2 = this.$titlePlaceable.getHeight();
            } else {
                height = this.$layoutHeight - this.$titlePlaceable.getHeight();
                max2 = Math.max(0, (this.$titleBottomPadding - this.$titlePlaceable.getHeight()) + this.$titleBaseline);
            }
            i2 = height - max2;
        }
        i = i2;
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, i3, i, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$actionIconsPlaceable, Constraints.m5551getMaxWidthimpl(this.$constraints) - this.$actionIconsPlaceable.getWidth(), (this.$layoutHeight - this.$actionIconsPlaceable.getHeight()) / 2, 0.0f, 4, null);
    }
}
