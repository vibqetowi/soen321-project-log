package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$RangeSliderImpl$onValueChangeState$1$1 extends Lambda implements Function1<ClosedFloatingPointRange<Float>, Unit> {
    final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSliderImpl$onValueChangeState$1$1(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1) {
        super(1);
        this.$value = closedFloatingPointRange;
        this.$onValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        invoke2(closedFloatingPointRange);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ClosedFloatingPointRange<Float> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, this.$value)) {
            return;
        }
        this.$onValueChange.invoke(it);
    }
}
