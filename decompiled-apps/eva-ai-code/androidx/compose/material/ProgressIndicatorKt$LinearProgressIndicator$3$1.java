package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ State<Float> $firstLineHead$delegate;
    final /* synthetic */ State<Float> $firstLineTail$delegate;
    final /* synthetic */ State<Float> $secondLineHead$delegate;
    final /* synthetic */ State<Float> $secondLineTail$delegate;
    final /* synthetic */ int $strokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j, int i, long j2, State<Float> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j;
        this.$strokeCap = i;
        this.$color = j2;
        this.$firstLineHead$delegate = state;
        this.$firstLineTail$delegate = state2;
        this.$secondLineHead$delegate = state3;
        this.$secondLineTail$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        float LinearProgressIndicator_2cYBFYY$lambda$1;
        float LinearProgressIndicator_2cYBFYY$lambda$2;
        float LinearProgressIndicator_2cYBFYY$lambda$3;
        float LinearProgressIndicator_2cYBFYY$lambda$4;
        float LinearProgressIndicator_2cYBFYY$lambda$32;
        float LinearProgressIndicator_2cYBFYY$lambda$42;
        float LinearProgressIndicator_2cYBFYY$lambda$12;
        float LinearProgressIndicator_2cYBFYY$lambda$22;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3084getHeightimpl = Size.m3084getHeightimpl(Canvas.mo3762getSizeNHjbRc());
        ProgressIndicatorKt.m1440drawLinearIndicatorBackgroundAZGd3zU(Canvas, this.$backgroundColor, m3084getHeightimpl, this.$strokeCap);
        LinearProgressIndicator_2cYBFYY$lambda$1 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(this.$firstLineHead$delegate);
        LinearProgressIndicator_2cYBFYY$lambda$2 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(this.$firstLineTail$delegate);
        if (LinearProgressIndicator_2cYBFYY$lambda$1 - LinearProgressIndicator_2cYBFYY$lambda$2 > 0.0f) {
            LinearProgressIndicator_2cYBFYY$lambda$12 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$1(this.$firstLineHead$delegate);
            LinearProgressIndicator_2cYBFYY$lambda$22 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$2(this.$firstLineTail$delegate);
            ProgressIndicatorKt.m1439drawLinearIndicatorqYKTg0g(Canvas, LinearProgressIndicator_2cYBFYY$lambda$12, LinearProgressIndicator_2cYBFYY$lambda$22, this.$color, m3084getHeightimpl, this.$strokeCap);
        }
        LinearProgressIndicator_2cYBFYY$lambda$3 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(this.$secondLineHead$delegate);
        LinearProgressIndicator_2cYBFYY$lambda$4 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(this.$secondLineTail$delegate);
        if (LinearProgressIndicator_2cYBFYY$lambda$3 - LinearProgressIndicator_2cYBFYY$lambda$4 > 0.0f) {
            LinearProgressIndicator_2cYBFYY$lambda$32 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$3(this.$secondLineHead$delegate);
            LinearProgressIndicator_2cYBFYY$lambda$42 = ProgressIndicatorKt.LinearProgressIndicator_2cYBFYY$lambda$4(this.$secondLineTail$delegate);
            ProgressIndicatorKt.m1439drawLinearIndicatorqYKTg0g(Canvas, LinearProgressIndicator_2cYBFYY$lambda$32, LinearProgressIndicator_2cYBFYY$lambda$42, this.$color, m3084getHeightimpl, this.$strokeCap);
        }
    }
}
