package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SnackbarKt$OneRowSnackbar$2$measure$4 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ int $actionButtonPlaceX;
    final /* synthetic */ int $actionButtonPlaceY;
    final /* synthetic */ Placeable $actionButtonPlaceable;
    final /* synthetic */ int $dismissButtonPlaceX;
    final /* synthetic */ int $dismissButtonPlaceY;
    final /* synthetic */ Placeable $dismissButtonPlaceable;
    final /* synthetic */ int $textPlaceY;
    final /* synthetic */ Placeable $textPlaceable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$2$measure$4(Placeable placeable, int i, Placeable placeable2, int i2, int i3, Placeable placeable3, int i4, int i5) {
        super(1);
        this.$textPlaceable = placeable;
        this.$textPlaceY = i;
        this.$dismissButtonPlaceable = placeable2;
        this.$dismissButtonPlaceX = i2;
        this.$dismissButtonPlaceY = i3;
        this.$actionButtonPlaceable = placeable3;
        this.$actionButtonPlaceX = i4;
        this.$actionButtonPlaceY = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$textPlaceable, 0, this.$textPlaceY, 0.0f, 4, null);
        Placeable placeable = this.$dismissButtonPlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable, this.$dismissButtonPlaceX, this.$dismissButtonPlaceY, 0.0f, 4, null);
        }
        Placeable placeable2 = this.$actionButtonPlaceable;
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(layout, placeable2, this.$actionButtonPlaceX, this.$actionButtonPlaceY, 0.0f, 4, null);
        }
    }
}
