package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$RangeSliderImpl$startThumbSemantics$1$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ float $coercedEnd;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSliderImpl$startThumbSemantics$1$1(State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, float f) {
        super(1);
        this.$onValueChangeState = state;
        this.$coercedEnd = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        this.$onValueChangeState.getValue().invoke(RangesKt.rangeTo(f, this.$coercedEnd));
    }
}
