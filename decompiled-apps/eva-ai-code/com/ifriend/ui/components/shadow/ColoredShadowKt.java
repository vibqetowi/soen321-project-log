package com.ifriend.ui.components.shadow;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ColoredShadow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aM\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"coloredShadow", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "alpha", "", "borderRadius", "Landroidx/compose/ui/unit/Dp;", "shadowRadius", "offsetY", "offsetX", "coloredShadow-PRYyx80", "(Landroidx/compose/ui/Modifier;JFFFFF)Landroidx/compose/ui/Modifier;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ColoredShadowKt {
    /* renamed from: coloredShadow-PRYyx80  reason: not valid java name */
    public static final Modifier m7067coloredShadowPRYyx80(Modifier coloredShadow, long j, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(coloredShadow, "$this$coloredShadow");
        return DrawModifierKt.drawBehind(coloredShadow, new ColoredShadowKt$coloredShadow$1(f2, ColorKt.m3345toArgb8_81llA(Color.m3290copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), f3, f5, f4, ColorKt.m3345toArgb8_81llA(Color.m3290copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null))));
    }
}
