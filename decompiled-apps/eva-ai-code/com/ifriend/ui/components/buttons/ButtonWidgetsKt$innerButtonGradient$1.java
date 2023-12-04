package com.ifriend.ui.components.buttons;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ButtonWidgets.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ButtonWidgetsKt$innerButtonGradient$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ float $offsetX;
    final /* synthetic */ float $offsetY;
    final /* synthetic */ int $shadowColor;
    final /* synthetic */ float $shadowRadius;
    final /* synthetic */ int $transparent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWidgetsKt$innerButtonGradient$1(float f, int i, float f2, float f3, int i2) {
        super(1);
        this.$offsetY = f;
        this.$transparent = i;
        this.$shadowRadius = f2;
        this.$offsetX = f3;
        this.$shadowColor = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float m3084getHeightimpl = (Size.m3084getHeightimpl(drawBehind.mo3762getSizeNHjbRc()) / 4) + drawBehind.mo588toPx0680j_4(this.$offsetY);
        int i = this.$transparent;
        float f = this.$shadowRadius;
        float f2 = this.$offsetX;
        int i2 = this.$shadowColor;
        Canvas canvas = drawBehind.getDrawContext().getCanvas();
        Paint Paint = AndroidPaint_androidKt.Paint();
        android.graphics.Paint asFrameworkPaint = Paint.asFrameworkPaint();
        asFrameworkPaint.setColor(i);
        asFrameworkPaint.setShadowLayer(drawBehind.mo588toPx0680j_4(f), drawBehind.mo588toPx0680j_4(f2), m3084getHeightimpl, i2);
        canvas.drawRect(Size.m3087getWidthimpl(drawBehind.mo3762getSizeNHjbRc()) / 2.5f, Size.m3084getHeightimpl(drawBehind.mo3762getSizeNHjbRc()) / 3, Size.m3087getWidthimpl(drawBehind.mo3762getSizeNHjbRc()), Size.m3084getHeightimpl(drawBehind.mo3762getSizeNHjbRc()), Paint);
    }
}
