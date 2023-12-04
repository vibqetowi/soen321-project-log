package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$CorrectValueSideEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<Float, Float> $scaleToOffset;
    final /* synthetic */ ClosedFloatingPointRange<Float> $trackRange;
    final /* synthetic */ float $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
    final /* synthetic */ MutableState<Float> $valueState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$CorrectValueSideEffect$2(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, MutableState<Float> mutableState, float f, int i) {
        super(2);
        this.$scaleToOffset = function1;
        this.$valueRange = closedFloatingPointRange;
        this.$trackRange = closedFloatingPointRange2;
        this.$valueState = mutableState;
        this.$value = f;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SliderKt.CorrectValueSideEffect(this.$scaleToOffset, this.$valueRange, this.$trackRange, this.$valueState, this.$value, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
