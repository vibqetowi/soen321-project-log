package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class NavigationRailKt$placeIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ int $iconX;
    final /* synthetic */ int $iconY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeIcon$1(Placeable placeable, int i, int i2) {
        super(1);
        this.$iconPlaceable = placeable;
        this.$iconX = i;
        this.$iconY = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$iconPlaceable, this.$iconX, this.$iconY, 0.0f, 4, null);
    }
}
