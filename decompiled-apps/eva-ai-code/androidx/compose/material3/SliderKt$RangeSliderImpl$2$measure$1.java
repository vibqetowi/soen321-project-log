package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$RangeSliderImpl$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ int $endThumbOffsetX;
    final /* synthetic */ int $endThumbOffsetY;
    final /* synthetic */ Placeable $endThumbPlaceable;
    final /* synthetic */ int $startThumbOffsetX;
    final /* synthetic */ int $startThumbOffsetY;
    final /* synthetic */ Placeable $startThumbPlaceable;
    final /* synthetic */ int $trackOffsetX;
    final /* synthetic */ int $trackOffsetY;
    final /* synthetic */ Placeable $trackPlaceable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSliderImpl$2$measure$1(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6) {
        super(1);
        this.$trackPlaceable = placeable;
        this.$trackOffsetX = i;
        this.$trackOffsetY = i2;
        this.$startThumbPlaceable = placeable2;
        this.$startThumbOffsetX = i3;
        this.$startThumbOffsetY = i4;
        this.$endThumbPlaceable = placeable3;
        this.$endThumbOffsetX = i5;
        this.$endThumbOffsetY = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$trackPlaceable, this.$trackOffsetX, this.$trackOffsetY, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$startThumbPlaceable, this.$startThumbOffsetX, this.$startThumbOffsetY, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$endThumbPlaceable, this.$endThumbOffsetX, this.$endThumbOffsetY, 0.0f, 4, null);
    }
}
