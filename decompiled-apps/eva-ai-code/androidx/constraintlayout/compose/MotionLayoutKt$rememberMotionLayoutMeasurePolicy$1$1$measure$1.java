package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: MotionLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Measurable> $measurables;
    final /* synthetic */ MotionMeasurer $measurer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MotionLayoutKt$rememberMotionLayoutMeasurePolicy$1$1$measure$1(MotionMeasurer motionMeasurer, List<? extends Measurable> list) {
        super(1);
        this.$measurer = motionMeasurer;
        this.$measurables = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        this.$measurer.performLayout(layout, this.$measurables);
    }
}
