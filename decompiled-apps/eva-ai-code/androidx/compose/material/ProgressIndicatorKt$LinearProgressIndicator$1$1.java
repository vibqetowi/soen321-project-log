package androidx.compose.material;

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
public final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $coercedProgress;
    final /* synthetic */ long $color;
    final /* synthetic */ int $strokeCap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1$1(long j, int i, float f, long j2) {
        super(1);
        this.$backgroundColor = j;
        this.$strokeCap = i;
        this.$coercedProgress = f;
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
        float m3084getHeightimpl = Size.m3084getHeightimpl(Canvas.mo3762getSizeNHjbRc());
        ProgressIndicatorKt.m1440drawLinearIndicatorBackgroundAZGd3zU(Canvas, this.$backgroundColor, m3084getHeightimpl, this.$strokeCap);
        ProgressIndicatorKt.m1439drawLinearIndicatorqYKTg0g(Canvas, 0.0f, this.$coercedProgress, this.$color, m3084getHeightimpl, this.$strokeCap);
    }
}
