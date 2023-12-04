package androidx.compose.material;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonKt$RadioButton$2$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Dp> $dotRadius;
    final /* synthetic */ State<Color> $radioColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$2$1(State<Color> state, State<Dp> state2) {
        super(1);
        this.$radioColor = state;
        this.$dotRadius = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f = RadioButtonKt.RadioStrokeWidth;
        float f3 = Canvas.mo588toPx0680j_4(f);
        long m3301unboximpl = this.$radioColor.getValue().m3301unboximpl();
        f2 = RadioButtonKt.RadioRadius;
        float f4 = f3 / 2;
        DrawScope.CC.m3829drawCircleVaOC9Bg$default(Canvas, m3301unboximpl, Canvas.mo588toPx0680j_4(f2) - f4, 0L, 0.0f, new Stroke(f3, 0.0f, 0, 0, null, 30, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        if (Dp.m5606compareTo0680j_4(this.$dotRadius.getValue().m5621unboximpl(), Dp.m5607constructorimpl(0)) > 0) {
            DrawScope.CC.m3829drawCircleVaOC9Bg$default(Canvas, this.$radioColor.getValue().m3301unboximpl(), Canvas.mo588toPx0680j_4(this.$dotRadius.getValue().m5621unboximpl()) - f4, 0L, 0.0f, Fill.INSTANCE, null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        }
    }
}
