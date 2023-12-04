package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$RangeSliderImpl$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Function3<SliderPositions, Composer, Integer, Unit> $endThumb;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ Function3<SliderPositions, Composer, Integer, Unit> $startThumb;
    final /* synthetic */ int $steps;
    final /* synthetic */ Function3<SliderPositions, Composer, Integer, Unit> $track;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSliderImpl$3(Modifier modifier, ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function32, Function3<? super SliderPositions, ? super Composer, ? super Integer, Unit> function33, int i2, int i3, int i4) {
        super(2);
        this.$modifier = modifier;
        this.$value = closedFloatingPointRange;
        this.$onValueChange = function1;
        this.$enabled = z;
        this.$valueRange = closedFloatingPointRange2;
        this.$steps = i;
        this.$onValueChangeFinished = function0;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$startThumb = function3;
        this.$endThumb = function32;
        this.$track = function33;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SliderKt.RangeSliderImpl(this.$modifier, this.$value, this.$onValueChange, this.$enabled, this.$valueRange, this.$steps, this.$onValueChangeFinished, this.$startInteractionSource, this.$endInteractionSource, this.$startThumb, this.$endThumb, this.$track, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
