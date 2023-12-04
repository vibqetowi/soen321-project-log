package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isStart", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$onDrag$1$1 extends Lambda implements Function2<Boolean, Float, Unit> {
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableFloatState $rawOffsetEnd;
    final /* synthetic */ MutableFloatState $rawOffsetStart;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$onDrag$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        super(2);
        this.$rawOffsetStart = mutableFloatState;
        this.$rawOffsetEnd = mutableFloatState2;
        this.$value = closedFloatingPointRange;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$onValueChangeState = state;
        this.$valueRange = closedFloatingPointRange2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f) {
        invoke(bool.booleanValue(), f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, float f) {
        ClosedFloatingPointRange<Float> rangeTo;
        ClosedFloatingPointRange<Float> invoke$scaleToUserValue;
        if (z) {
            MutableFloatState mutableFloatState = this.$rawOffsetStart;
            mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f);
            this.$rawOffsetEnd.setFloatValue(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, this.$value.getEndInclusive().floatValue()));
            float floatValue = this.$rawOffsetEnd.getFloatValue();
            rangeTo = RangesKt.rangeTo(RangesKt.coerceIn(this.$rawOffsetStart.getFloatValue(), this.$minPx.element, floatValue), floatValue);
        } else {
            MutableFloatState mutableFloatState2 = this.$rawOffsetEnd;
            mutableFloatState2.setFloatValue(mutableFloatState2.getFloatValue() + f);
            this.$rawOffsetStart.setFloatValue(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, this.$value.getStart().floatValue()));
            float floatValue2 = this.$rawOffsetStart.getFloatValue();
            rangeTo = RangesKt.rangeTo(floatValue2, RangesKt.coerceIn(this.$rawOffsetEnd.getFloatValue(), floatValue2, this.$maxPx.element));
        }
        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, rangeTo);
        this.$onValueChangeState.getValue().invoke(invoke$scaleToUserValue);
    }
}
