package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$SliderImpl$draggableState$1$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $pressOffset;
    final /* synthetic */ MutableState<Float> $rawOffset;
    final /* synthetic */ MutableState<Float> $thumbWidth;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ MutableState<Integer> $totalWidth;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$SliderImpl$draggableState$1$1(MutableState<Integer> mutableState, MutableState<Float> mutableState2, MutableState<Float> mutableState3, MutableState<Float> mutableState4, float[] fArr, State<? extends Function1<? super Float, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.$totalWidth = mutableState;
        this.$thumbWidth = mutableState2;
        this.$rawOffset = mutableState3;
        this.$pressOffset = mutableState4;
        this.$tickFractions = fArr;
        this.$onValueChangeState = state;
        this.$valueRange = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        float snapValueToTick;
        float SliderImpl$scaleToUserValue;
        float f2 = 2;
        float max = Math.max(this.$totalWidth.getValue().floatValue() - (this.$thumbWidth.getValue().floatValue() / f2), 0.0f);
        float min = Math.min(this.$thumbWidth.getValue().floatValue() / f2, max);
        MutableState<Float> mutableState = this.$rawOffset;
        mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f + this.$pressOffset.getValue().floatValue()));
        this.$pressOffset.setValue(Float.valueOf(0.0f));
        snapValueToTick = SliderKt.snapValueToTick(this.$rawOffset.getValue().floatValue(), this.$tickFractions, min, max);
        SliderImpl$scaleToUserValue = SliderKt.SliderImpl$scaleToUserValue(this.$valueRange, min, max, snapValueToTick);
        this.$onValueChangeState.getValue().invoke(Float.valueOf(SliderImpl$scaleToUserValue));
    }
}
