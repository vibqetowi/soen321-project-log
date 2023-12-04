package androidx.compose.material3;

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
public final class SliderKt$RangeSlider$10 extends Lambda implements Function3<SliderPositions, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$RangeSlider$10(SliderColors sliderColors, boolean z, int i) {
        super(3);
        this.$colors = sliderColors;
        this.$enabled = z;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer, Integer num) {
        invoke(sliderPositions, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(SliderPositions sliderPositions, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(sliderPositions, "sliderPositions");
        ComposerKt.sourceInformation(composer, "C453@20896L138:Slider.kt#uh7d8r");
        if ((i & 14) == 0) {
            i |= composer.changed(sliderPositions) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2139066097, i, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:452)");
            }
            SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
            SliderColors sliderColors = this.$colors;
            boolean z = this.$enabled;
            int i2 = this.$$dirty;
            sliderDefaults.Track(sliderPositions, null, sliderColors, z, composer, (i & 14) | 24576 | ((i2 >> 12) & 896) | (i2 & 7168), 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
