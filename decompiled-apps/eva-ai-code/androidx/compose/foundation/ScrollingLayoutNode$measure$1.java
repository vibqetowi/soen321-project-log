package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollingLayoutNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ int $side;
    final /* synthetic */ ScrollingLayoutNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLayoutNode$measure$1(ScrollingLayoutNode scrollingLayoutNode, int i, Placeable placeable) {
        super(1);
        this.this$0 = scrollingLayoutNode;
        this.$side = i;
        this.$placeable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int coerceIn = RangesKt.coerceIn(this.this$0.getScrollerState().getValue(), 0, this.$side);
        int i = this.this$0.isReversed() ? coerceIn - this.$side : -coerceIn;
        Placeable.PlacementScope.placeRelativeWithLayer$default(layout, this.$placeable, this.this$0.isVertical() ? 0 : i, this.this$0.isVertical() ? i : 0, 0.0f, null, 12, null);
    }
}
