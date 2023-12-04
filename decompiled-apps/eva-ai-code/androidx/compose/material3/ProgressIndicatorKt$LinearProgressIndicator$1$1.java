package androidx.compose.material3;

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
public final class ProgressIndicatorKt$LinearProgressIndicator$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ float $coercedProgress;
    final /* synthetic */ long $color;
    final /* synthetic */ int $strokeCap;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$1$1(long j, int i, float f, long j2) {
        super(1);
        this.$trackColor = j;
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
        ProgressIndicatorKt.m1943drawLinearIndicatorTrackAZGd3zU(Canvas, this.$trackColor, m3084getHeightimpl, this.$strokeCap);
        ProgressIndicatorKt.m1942drawLinearIndicatorqYKTg0g(Canvas, 0.0f, this.$coercedProgress, this.$color, m3084getHeightimpl, this.$strokeCap);
    }
}
