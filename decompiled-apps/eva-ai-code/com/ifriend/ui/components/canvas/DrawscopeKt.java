package com.ifriend.ui.components.canvas;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: drawscope.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"drawRoundRectStrokeInside", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "size", "Landroidx/compose/ui/geometry/Size;", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawRoundRectStrokeInside-r8hcZFg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJJJFLandroidx/compose/ui/graphics/ColorFilter;I)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DrawscopeKt {
    /* renamed from: drawRoundRectStrokeInside-r8hcZFg  reason: not valid java name */
    public static final void m7032drawRoundRectStrokeInsider8hcZFg(DrawScope drawRoundRectStrokeInside, long j, float f, long j2, long j3, long j4, float f2, ColorFilter colorFilter, int i) {
        Intrinsics.checkNotNullParameter(drawRoundRectStrokeInside, "$this$drawRoundRectStrokeInside");
        float f3 = drawRoundRectStrokeInside.mo588toPx0680j_4(f);
        float f4 = f3 / 2;
        drawRoundRectStrokeInside.mo3760drawRoundRectuAw5IA(j, OffsetKt.Offset(Offset.m3018getXimpl(j2) + f4, Offset.m3019getYimpl(j2) + f4), SizeKt.Size(Size.m3087getWidthimpl(j3) - f3, Size.m3084getHeightimpl(j3) - f3), j4, new Stroke(f3, 0.0f, 0, 0, null, 30, null), f2, colorFilter, i);
    }

    /* renamed from: drawRoundRectStrokeInside-r8hcZFg$default  reason: not valid java name */
    public static /* synthetic */ void m7033drawRoundRectStrokeInsider8hcZFg$default(DrawScope drawScope, long j, float f, long j2, long j3, long j4, float f2, ColorFilter colorFilter, int i, int i2, Object obj) {
        float m5607constructorimpl = (i2 & 2) != 0 ? Dp.m5607constructorimpl(0) : f;
        long m3034getZeroF1C5BW0 = (i2 & 4) != 0 ? Offset.Companion.m3034getZeroF1C5BW0() : j2;
        m7032drawRoundRectStrokeInsider8hcZFg(drawScope, j, m5607constructorimpl, m3034getZeroF1C5BW0, (i2 & 8) != 0 ? SizeKt.Size(Size.m3087getWidthimpl(drawScope.mo3762getSizeNHjbRc()) - Offset.m3018getXimpl(m3034getZeroF1C5BW0), Size.m3084getHeightimpl(drawScope.mo3762getSizeNHjbRc()) - Offset.m3019getYimpl(m3034getZeroF1C5BW0)) : j3, (i2 & 16) != 0 ? CornerRadius.Companion.m3003getZerokKHJgLs() : j4, (i2 & 32) != 0 ? 1.0f : f2, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? DrawScope.Companion.m3845getDefaultBlendMode0nO6VwU() : i);
    }
}
