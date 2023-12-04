package androidx.compose.material3;

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
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ long $color;
    final /* synthetic */ State<Float> $firstLineHead;
    final /* synthetic */ State<Float> $firstLineTail;
    final /* synthetic */ State<Float> $secondLineHead;
    final /* synthetic */ State<Float> $secondLineTail;
    final /* synthetic */ int $strokeCap;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j, int i, State<Float> state, State<Float> state2, long j2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$trackColor = j;
        this.$strokeCap = i;
        this.$firstLineHead = state;
        this.$firstLineTail = state2;
        this.$color = j2;
        this.$secondLineHead = state3;
        this.$secondLineTail = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3084getHeightimpl = Size.m3084getHeightimpl(Canvas.mo3762getSizeNHjbRc());
        ProgressIndicatorKt.m1943drawLinearIndicatorTrackAZGd3zU(Canvas, this.$trackColor, m3084getHeightimpl, this.$strokeCap);
        if (this.$firstLineHead.getValue().floatValue() - this.$firstLineTail.getValue().floatValue() > 0.0f) {
            ProgressIndicatorKt.m1942drawLinearIndicatorqYKTg0g(Canvas, this.$firstLineHead.getValue().floatValue(), this.$firstLineTail.getValue().floatValue(), this.$color, m3084getHeightimpl, this.$strokeCap);
        }
        if (this.$secondLineHead.getValue().floatValue() - this.$secondLineTail.getValue().floatValue() > 0.0f) {
            ProgressIndicatorKt.m1942drawLinearIndicatorqYKTg0g(Canvas, this.$secondLineHead.getValue().floatValue(), this.$secondLineTail.getValue().floatValue(), this.$color, m3084getHeightimpl, this.$strokeCap);
        }
    }
}
