package androidx.constraintlayout.compose;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class Measurer$drawDebugBounds$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ float $forcedScaleFactor;
    final /* synthetic */ Measurer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Measurer$drawDebugBounds$1(Measurer measurer, float f) {
        super(1);
        this.this$0 = measurer;
        this.$forcedScaleFactor = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float layoutCurrentWidth = this.this$0.getLayoutCurrentWidth() * this.$forcedScaleFactor;
        float layoutCurrentHeight = this.this$0.getLayoutCurrentHeight() * this.$forcedScaleFactor;
        float m3087getWidthimpl = (Size.m3087getWidthimpl(Canvas.mo3762getSizeNHjbRc()) - layoutCurrentWidth) / 2.0f;
        float m3084getHeightimpl = (Size.m3084getHeightimpl(Canvas.mo3762getSizeNHjbRc()) - layoutCurrentHeight) / 2.0f;
        long m3328getWhite0d7_KjU = Color.Companion.m3328getWhite0d7_KjU();
        float f = m3087getWidthimpl + layoutCurrentWidth;
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, m3328getWhite0d7_KjU, OffsetKt.Offset(m3087getWidthimpl, m3084getHeightimpl), OffsetKt.Offset(f, m3084getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        long Offset = OffsetKt.Offset(f, m3084getHeightimpl);
        float f2 = m3084getHeightimpl + layoutCurrentHeight;
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, m3328getWhite0d7_KjU, Offset, OffsetKt.Offset(f, f2), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, m3328getWhite0d7_KjU, OffsetKt.Offset(f, f2), OffsetKt.Offset(m3087getWidthimpl, f2), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, m3328getWhite0d7_KjU, OffsetKt.Offset(m3087getWidthimpl, f2), OffsetKt.Offset(m3087getWidthimpl, m3084getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        float f3 = 1;
        float f4 = m3087getWidthimpl + f3;
        float f5 = m3084getHeightimpl + f3;
        long m3317getBlack0d7_KjU = Color.Companion.m3317getBlack0d7_KjU();
        float f6 = layoutCurrentWidth + f4;
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, m3317getBlack0d7_KjU, OffsetKt.Offset(f4, f5), OffsetKt.Offset(f6, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        long Offset2 = OffsetKt.Offset(f6, f5);
        float f7 = f5 + layoutCurrentHeight;
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, m3317getBlack0d7_KjU, Offset2, OffsetKt.Offset(f6, f7), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, m3317getBlack0d7_KjU, OffsetKt.Offset(f6, f7), OffsetKt.Offset(f4, f7), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        DrawScope.CC.m3834drawLineNGM6Ib0$default(Canvas, m3317getBlack0d7_KjU, OffsetKt.Offset(f4, f7), OffsetKt.Offset(f4, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
    }
}
