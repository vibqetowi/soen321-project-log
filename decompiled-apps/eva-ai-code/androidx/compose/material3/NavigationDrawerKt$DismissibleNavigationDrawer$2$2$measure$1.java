package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* compiled from: NavigationDrawer.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $contentPlaceable;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ Placeable $sheetPlaceable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DismissibleNavigationDrawer$2$2$measure$1(Placeable placeable, Placeable placeable2, DrawerState drawerState) {
        super(1);
        this.$contentPlaceable = placeable;
        this.$sheetPlaceable = placeable2;
        this.$drawerState = drawerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$contentPlaceable, this.$sheetPlaceable.getWidth() + MathKt.roundToInt(this.$drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$sheetPlaceable, MathKt.roundToInt(this.$drawerState.getOffset().getValue().floatValue()), 0, 0.0f, 4, null);
    }
}
