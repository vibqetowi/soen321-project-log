package androidx.compose.material3;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.material3.tokens.RadioButtonTokens;
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
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f = RadioButtonKt.RadioStrokeWidth;
        float f2 = Canvas.mo588toPx0680j_4(f);
        float f3 = 2;
        float f4 = f2 / f3;
        DrawScope.CC.m3829drawCircleVaOC9Bg$default(Canvas, this.$radioColor.getValue().m3301unboximpl(), Canvas.mo588toPx0680j_4(Dp.m5607constructorimpl(RadioButtonTokens.INSTANCE.m2691getIconSizeD9Ej5fM() / f3)) - f4, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        if (Dp.m5606compareTo0680j_4(this.$dotRadius.getValue().m5621unboximpl(), Dp.m5607constructorimpl(0)) > 0) {
            DrawScope.CC.m3829drawCircleVaOC9Bg$default(Canvas, this.$radioColor.getValue().m3301unboximpl(), Canvas.mo588toPx0680j_4(this.$dotRadius.getValue().m5621unboximpl()) - f4, 0L, 0.0f, Fill.INSTANCE, null, 0, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, null);
        }
    }
}
