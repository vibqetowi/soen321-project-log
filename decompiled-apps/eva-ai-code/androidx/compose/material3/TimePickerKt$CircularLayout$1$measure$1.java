package androidx.compose.material3;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TimePickerKt$CircularLayout$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ long $constraints;
    final /* synthetic */ Placeable $innerCirclePlaceable;
    final /* synthetic */ List<Placeable> $placeables;
    final /* synthetic */ float $radiusPx;
    final /* synthetic */ Placeable $selectorPlaceable;
    final /* synthetic */ float $theta;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TimePickerKt$CircularLayout$1$measure$1(Placeable placeable, List<? extends Placeable> list, Placeable placeable2, long j, float f, float f2) {
        super(1);
        this.$selectorPlaceable = placeable;
        this.$placeables = list;
        this.$innerCirclePlaceable = placeable2;
        this.$constraints = j;
        this.$radiusPx = f;
        this.$theta = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Placeable placeable;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable2 = this.$selectorPlaceable;
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(layout, placeable2, 0, 0, 0.0f, 4, null);
        }
        long j = this.$constraints;
        float f = this.$radiusPx;
        float f2 = this.$theta;
        Iterator it = this.$placeables.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            double d = f;
            Iterator it2 = it;
            double d2 = (i * f2) - 1.5707963267948966d;
            Placeable.PlacementScope.place$default(layout, (Placeable) next, MathKt.roundToInt((Math.cos(d2) * d) + ((Constraints.m5551getMaxWidthimpl(j) / 2) - (placeable.getWidth() / 2))), MathKt.roundToInt((d * Math.sin(d2)) + ((Constraints.m5550getMaxHeightimpl(j) / 2) - (placeable.getHeight() / 2))), 0.0f, 4, null);
            i = i2;
            it = it2;
        }
        Placeable placeable3 = this.$innerCirclePlaceable;
        if (placeable3 != null) {
            Placeable.PlacementScope.place$default(layout, placeable3, (Constraints.m5553getMinWidthimpl(this.$constraints) - this.$innerCirclePlaceable.getWidth()) / 2, (Constraints.m5552getMinHeightimpl(this.$constraints) - this.$innerCirclePlaceable.getHeight()) / 2, 0.0f, 4, null);
        }
    }
}
