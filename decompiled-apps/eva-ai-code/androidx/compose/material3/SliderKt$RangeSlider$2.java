package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2 extends Lambda implements Function3<SliderPositions, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$2(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, int i) {
        super(3);
        this.$startInteractionSource = mutableInteractionSource;
        this.$colors = sliderColors;
        this.$enabled = z;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer, Integer num) {
        invoke(sliderPositions, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(SliderPositions it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "C346@15726L147:Slider.kt#uh7d8r");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1361279243, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:345)");
            }
            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
            MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
            SliderColors sliderColors = this.$colors;
            boolean z = this.$enabled;
            int i2 = this.$$dirty;
            sliderDefaults.m1974Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ((i2 >> 15) & 896) | 196614 | (i2 & 7168), 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
