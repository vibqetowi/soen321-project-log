package com.ifriend.ui.components.shadow;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: shadow.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"innerShadow", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "borderRadius", "Landroidx/compose/ui/unit/Dp;", "borderHeight", "shadowHeight", "offsetY", "offsetX", "innerShadow-hy0AmR8", "(Landroidx/compose/ui/Modifier;JFFFFF)Landroidx/compose/ui/Modifier;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShadowKt {
    /* renamed from: innerShadow-hy0AmR8  reason: not valid java name */
    public static final Modifier m7069innerShadowhy0AmR8(Modifier innerShadow, long j, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(innerShadow, "$this$innerShadow");
        return DrawModifierKt.drawWithContent(innerShadow, new ShadowKt$innerShadow$1(f3, f5, f4, f2, f, j));
    }
}
