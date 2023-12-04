package androidx.compose.material3;

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
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$3 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Float> $baseRotation;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Integer> $currentRotation;
    final /* synthetic */ State<Float> $endAngle;
    final /* synthetic */ State<Float> $startAngle;
    final /* synthetic */ Stroke $stroke;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(long j, Stroke stroke, State<Integer> state, State<Float> state2, State<Float> state3, State<Float> state4, float f, long j2) {
        super(1);
        this.$trackColor = j;
        this.$stroke = stroke;
        this.$currentRotation = state;
        this.$endAngle = state2;
        this.$startAngle = state3;
        this.$baseRotation = state4;
        this.$strokeWidth = f;
        this.$color = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        ProgressIndicatorKt.m1939drawCircularIndicatorTrackbw27NRU(Canvas, this.$trackColor, this.$stroke);
        ProgressIndicatorKt.m1941drawIndeterminateCircularIndicatorhrjfTZI(Canvas, this.$startAngle.getValue().floatValue() + (((this.$currentRotation.getValue().floatValue() * 216.0f) % 360.0f) - 90.0f) + this.$baseRotation.getValue().floatValue(), this.$strokeWidth, Math.abs(this.$endAngle.getValue().floatValue() - this.$startAngle.getValue().floatValue()), this.$color, this.$stroke);
    }
}
