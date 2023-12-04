package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$3 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ State<Float> $baseRotation$delegate;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Integer> $currentRotation$delegate;
    final /* synthetic */ State<Float> $endAngle$delegate;
    final /* synthetic */ State<Float> $startAngle$delegate;
    final /* synthetic */ Stroke $stroke;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(long j, Stroke stroke, float f, long j2, State<Integer> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j;
        this.$stroke = stroke;
        this.$strokeWidth = f;
        this.$color = j2;
        this.$currentRotation$delegate = state;
        this.$endAngle$delegate = state2;
        this.$startAngle$delegate = state3;
        this.$baseRotation$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        int CircularProgressIndicator_LxG7B9w$lambda$8;
        float CircularProgressIndicator_LxG7B9w$lambda$10;
        float CircularProgressIndicator_LxG7B9w$lambda$11;
        float CircularProgressIndicator_LxG7B9w$lambda$9;
        float CircularProgressIndicator_LxG7B9w$lambda$112;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        ProgressIndicatorKt.m1436drawCircularIndicatorBackgroundbw27NRU(Canvas, this.$backgroundColor, this.$stroke);
        CircularProgressIndicator_LxG7B9w$lambda$8 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$8(this.$currentRotation$delegate);
        CircularProgressIndicator_LxG7B9w$lambda$10 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$10(this.$endAngle$delegate);
        CircularProgressIndicator_LxG7B9w$lambda$11 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(this.$startAngle$delegate);
        float abs = Math.abs(CircularProgressIndicator_LxG7B9w$lambda$10 - CircularProgressIndicator_LxG7B9w$lambda$11);
        CircularProgressIndicator_LxG7B9w$lambda$9 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$9(this.$baseRotation$delegate);
        float f = (((CircularProgressIndicator_LxG7B9w$lambda$8 * 216.0f) % 360.0f) - 90.0f) + CircularProgressIndicator_LxG7B9w$lambda$9;
        CircularProgressIndicator_LxG7B9w$lambda$112 = ProgressIndicatorKt.CircularProgressIndicator_LxG7B9w$lambda$11(this.$startAngle$delegate);
        ProgressIndicatorKt.m1438drawIndeterminateCircularIndicatorhrjfTZI(Canvas, CircularProgressIndicator_LxG7B9w$lambda$112 + f, this.$strokeWidth, abs, this.$color, this.$stroke);
    }
}
