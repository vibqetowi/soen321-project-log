package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Tooltip.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TooltipKt$RichTooltipBox$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<Composer, Integer, Unit> $action;
    final /* synthetic */ RichTooltipColors $colors;
    final /* synthetic */ Function3<TooltipBoxScope, Composer, Integer, Unit> $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;
    final /* synthetic */ Function2<Composer, Integer, Unit> $title;
    final /* synthetic */ RichTooltipState $tooltipState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TooltipKt$RichTooltipBox$4(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, RichTooltipState richTooltipState, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, RichTooltipColors richTooltipColors, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function3, int i, int i2) {
        super(2);
        this.$text = function2;
        this.$modifier = modifier;
        this.$tooltipState = richTooltipState;
        this.$title = function22;
        this.$action = function23;
        this.$shape = shape;
        this.$colors = richTooltipColors;
        this.$content = function3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TooltipKt.RichTooltipBox(this.$text, this.$modifier, this.$tooltipState, this.$title, this.$action, this.$shape, this.$colors, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
