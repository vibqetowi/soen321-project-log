package com.ifriend.ui.components.shadow;

import android.graphics.BlurMaskFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: shadow.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ShadowKt$innerShadow$1 extends Lambda implements Function1<ContentDrawScope, Unit> {
    final /* synthetic */ float $borderHeight;
    final /* synthetic */ float $borderRadius;
    final /* synthetic */ long $color;
    final /* synthetic */ float $offsetX;
    final /* synthetic */ float $offsetY;
    final /* synthetic */ float $shadowHeight;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowKt$innerShadow$1(float f, float f2, float f3, float f4, float f5, long j) {
        super(1);
        this.$shadowHeight = f;
        this.$offsetX = f2;
        this.$offsetY = f3;
        this.$borderHeight = f4;
        this.$borderRadius = f5;
        this.$color = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
        invoke2(contentDrawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        Rect m3058Recttz77jQw = RectKt.m3058Recttz77jQw(Offset.Companion.m3034getZeroF1C5BW0(), drawWithContent.mo3762getSizeNHjbRc());
        Paint Paint = AndroidPaint_androidKt.Paint();
        float f = this.$shadowHeight;
        float f2 = this.$offsetX;
        float f3 = this.$offsetY;
        float f4 = this.$borderHeight;
        float f5 = this.$borderRadius;
        long j = this.$color;
        Canvas canvas = drawWithContent.getDrawContext().getCanvas();
        Paint.mo3139setColor8_81llA(j);
        Paint.setAntiAlias(true);
        canvas.saveLayer(m3058Recttz77jQw, Paint);
        canvas.drawRoundRect(m3058Recttz77jQw.getLeft(), m3058Recttz77jQw.getTop(), m3058Recttz77jQw.getRight(), m3058Recttz77jQw.getBottom(), drawWithContent.mo588toPx0680j_4(f5), drawWithContent.mo588toPx0680j_4(f5), Paint);
        android.graphics.Paint asFrameworkPaint = Paint.asFrameworkPaint();
        asFrameworkPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (drawWithContent.mo588toPx0680j_4(f) > 0.0f) {
            asFrameworkPaint.setMaskFilter(new BlurMaskFilter(drawWithContent.mo588toPx0680j_4(f), BlurMaskFilter.Blur.NORMAL));
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(drawWithContent.mo588toPx0680j_4(f2), 0.0f);
        float coerceAtLeast2 = RangesKt.coerceAtLeast(drawWithContent.mo588toPx0680j_4(f3), 0.0f);
        float left = m3058Recttz77jQw.getLeft() + coerceAtLeast;
        float top = m3058Recttz77jQw.getTop() + coerceAtLeast2;
        float right = m3058Recttz77jQw.getRight() + coerceAtLeast;
        float bottom = m3058Recttz77jQw.getBottom() + coerceAtLeast2;
        Paint.mo3139setColor8_81llA(Color.Companion.m3317getBlack0d7_KjU());
        float f6 = 2;
        canvas.drawRoundRect(left + (drawWithContent.mo588toPx0680j_4(f4) / f6), top + (drawWithContent.mo588toPx0680j_4(f4) / f6), right - (drawWithContent.mo588toPx0680j_4(f4) / f6), bottom - (drawWithContent.mo588toPx0680j_4(f4) / f6), drawWithContent.mo588toPx0680j_4(f5), drawWithContent.mo588toPx0680j_4(f5), Paint);
        asFrameworkPaint.setXfermode(null);
        asFrameworkPaint.setMaskFilter(null);
    }
}
