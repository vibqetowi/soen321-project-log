package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt$SliderThumb$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $offset;
    final /* synthetic */ BoxScope $this_SliderThumb;
    final /* synthetic */ float $thumbSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderThumb$2(BoxScope boxScope, Modifier modifier, float f, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, float f2, int i) {
        super(2);
        this.$this_SliderThumb = boxScope;
        this.$modifier = modifier;
        this.$offset = f;
        this.$interactionSource = mutableInteractionSource;
        this.$colors = sliderColors;
        this.$enabled = z;
        this.$thumbSize = f2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SliderKt.m1447SliderThumbPcYyNuk(this.$this_SliderThumb, this.$modifier, this.$offset, this.$interactionSource, this.$colors, this.$enabled, this.$thumbSize, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
