package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$RangeSliderImpl$onDrag$1 extends Lambda implements Function2<Boolean, Float, Unit> {
    final /* synthetic */ MutableState<Float> $endThumbWidth$delegate;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    final /* synthetic */ MutableState<Float> $rawOffsetStart;
    final /* synthetic */ MutableState<Float> $startThumbWidth$delegate;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ MutableState<Integer> $totalWidth$delegate;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSliderImpl$onDrag$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float[] fArr, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableState<Integer> mutableState3, MutableState<Float> mutableState4, MutableState<Float> mutableState5, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        super(2);
        this.$rawOffsetStart = mutableState;
        this.$rawOffsetEnd = mutableState2;
        this.$value = closedFloatingPointRange;
        this.$tickFractions = fArr;
        this.$onValueChangeState = state;
        this.$totalWidth$delegate = mutableState3;
        this.$endThumbWidth$delegate = mutableState4;
        this.$startThumbWidth$delegate = mutableState5;
        this.$valueRange = closedFloatingPointRange2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f) {
        invoke(bool.booleanValue(), f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, float f) {
        int RangeSliderImpl$lambda$31;
        float RangeSliderImpl$lambda$28;
        float RangeSliderImpl$lambda$25;
        float RangeSliderImpl$scaleToOffset$34;
        float snapValueToTick;
        ClosedFloatingPointRange<Float> rangeTo;
        ClosedFloatingPointRange<Float> RangeSliderImpl$scaleToUserValue$33;
        float RangeSliderImpl$scaleToOffset$342;
        float snapValueToTick2;
        RangeSliderImpl$lambda$31 = SliderKt.RangeSliderImpl$lambda$31(this.$totalWidth$delegate);
        RangeSliderImpl$lambda$28 = SliderKt.RangeSliderImpl$lambda$28(this.$endThumbWidth$delegate);
        float f2 = 2;
        float max = Math.max(RangeSliderImpl$lambda$31 - (RangeSliderImpl$lambda$28 / f2), 0.0f);
        RangeSliderImpl$lambda$25 = SliderKt.RangeSliderImpl$lambda$25(this.$startThumbWidth$delegate);
        float min = Math.min(RangeSliderImpl$lambda$25 / f2, max);
        if (z) {
            MutableState<Float> mutableState = this.$rawOffsetStart;
            mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f));
            MutableState<Float> mutableState2 = this.$rawOffsetEnd;
            RangeSliderImpl$scaleToOffset$342 = SliderKt.RangeSliderImpl$scaleToOffset$34(this.$valueRange, min, max, this.$value.getEndInclusive().floatValue());
            mutableState2.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$342));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            snapValueToTick2 = SliderKt.snapValueToTick(RangesKt.coerceIn(this.$rawOffsetStart.getValue().floatValue(), min, floatValue), this.$tickFractions, min, max);
            rangeTo = RangesKt.rangeTo(snapValueToTick2, floatValue);
        } else {
            MutableState<Float> mutableState3 = this.$rawOffsetEnd;
            mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f));
            MutableState<Float> mutableState4 = this.$rawOffsetStart;
            RangeSliderImpl$scaleToOffset$34 = SliderKt.RangeSliderImpl$scaleToOffset$34(this.$valueRange, min, max, this.$value.getStart().floatValue());
            mutableState4.setValue(Float.valueOf(RangeSliderImpl$scaleToOffset$34));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            snapValueToTick = SliderKt.snapValueToTick(RangesKt.coerceIn(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, max), this.$tickFractions, min, max);
            rangeTo = RangesKt.rangeTo(floatValue2, snapValueToTick);
        }
        RangeSliderImpl$scaleToUserValue$33 = SliderKt.RangeSliderImpl$scaleToUserValue$33(this.$valueRange, min, max, rangeTo);
        this.$onValueChangeState.getValue().invoke(RangeSliderImpl$scaleToUserValue$33);
    }
}
