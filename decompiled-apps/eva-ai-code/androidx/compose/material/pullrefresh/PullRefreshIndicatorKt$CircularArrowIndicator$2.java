package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PullRefreshIndicator.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshIndicatorKt$CircularArrowIndicator$2 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Float> $alphaState;
    final /* synthetic */ long $color;
    final /* synthetic */ Path $path;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorKt$CircularArrowIndicator$2(PullRefreshState pullRefreshState, State<Float> state, long j, Path path) {
        super(1);
        this.$state = pullRefreshState;
        this.$alphaState = state;
        this.$color = j;
        this.$path = path;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        ArrowValues ArrowValues;
        float f;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        ArrowValues = PullRefreshIndicatorKt.ArrowValues(this.$state.getProgress());
        float floatValue = this.$alphaState.getValue().floatValue();
        float rotation = ArrowValues.getRotation();
        long j = this.$color;
        Path path = this.$path;
        long mo3761getCenterF1C5BW0 = Canvas.mo3761getCenterF1C5BW0();
        DrawContext drawContext = Canvas.getDrawContext();
        long mo3768getSizeNHjbRc = drawContext.mo3768getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3774rotateUv8p0NA(rotation, mo3761getCenterF1C5BW0);
        f = PullRefreshIndicatorKt.ArcRadius;
        float f4 = Canvas.mo588toPx0680j_4(f);
        f2 = PullRefreshIndicatorKt.StrokeWidth;
        float f5 = f4 + (Canvas.mo588toPx0680j_4(f2) / 2.0f);
        Rect rect = new Rect(Offset.m3018getXimpl(SizeKt.m3097getCenteruvyYCjk(Canvas.mo3762getSizeNHjbRc())) - f5, Offset.m3019getYimpl(SizeKt.m3097getCenteruvyYCjk(Canvas.mo3762getSizeNHjbRc())) - f5, Offset.m3018getXimpl(SizeKt.m3097getCenteruvyYCjk(Canvas.mo3762getSizeNHjbRc())) + f5, Offset.m3019getYimpl(SizeKt.m3097getCenteruvyYCjk(Canvas.mo3762getSizeNHjbRc())) + f5);
        float startAngle = ArrowValues.getStartAngle();
        float endAngle = ArrowValues.getEndAngle() - ArrowValues.getStartAngle();
        long m3053getTopLeftF1C5BW0 = rect.m3053getTopLeftF1C5BW0();
        long m3051getSizeNHjbRc = rect.m3051getSizeNHjbRc();
        f3 = PullRefreshIndicatorKt.StrokeWidth;
        DrawScope.CC.m3827drawArcyD3GUKo$default(Canvas, j, startAngle, endAngle, false, m3053getTopLeftF1C5BW0, m3051getSizeNHjbRc, floatValue, new Stroke(Canvas.mo588toPx0680j_4(f3), 0.0f, StrokeCap.Companion.m3646getSquareKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        PullRefreshIndicatorKt.m1548drawArrowBx497Mc(Canvas, path, rect, j, floatValue, ArrowValues);
        drawContext.getCanvas().restore();
        drawContext.mo3769setSizeuvyYCjk(mo3768getSizeNHjbRc);
    }
}
