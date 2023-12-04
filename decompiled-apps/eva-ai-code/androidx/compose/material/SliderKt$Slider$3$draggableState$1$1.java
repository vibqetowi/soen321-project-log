package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$Slider$3$draggableState$1$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
    final /* synthetic */ MutableFloatState $pressOffset;
    final /* synthetic */ MutableFloatState $rawOffset;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$draggableState$1$1(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State<? extends Function1<? super Float, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.$rawOffset = mutableFloatState;
        this.$pressOffset = mutableFloatState2;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$onValueChangeState = state;
        this.$valueRange = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        float invoke$scaleToUserValue;
        MutableFloatState mutableFloatState = this.$rawOffset;
        mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f + this.$pressOffset.getFloatValue());
        this.$pressOffset.setFloatValue(0.0f);
        invoke$scaleToUserValue = SliderKt$Slider$3.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, RangesKt.coerceIn(this.$rawOffset.getFloatValue(), this.$minPx.element, this.$maxPx.element));
        this.$onValueChangeState.getValue().invoke(Float.valueOf(invoke$scaleToUserValue));
    }
}
