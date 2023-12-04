package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Placeable> $items;
    final /* synthetic */ Placeable $spacerPlaceable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$measure$1(List<? extends Placeable> list, Placeable placeable) {
        super(1);
        this.$items = list;
        this.$spacerPlaceable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, this.$items.get(0), 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(layout, this.$items.get(1), this.$items.get(0).getWidth(), 0, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(layout, this.$spacerPlaceable, this.$items.get(0).getWidth() - (this.$spacerPlaceable.getWidth() / 2), 0, 0.0f, 4, null);
    }
}
