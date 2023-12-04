package com.ifriend.ui.components.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.components.shadow.ShadowKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Neomorphic.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"neomorphicIndicator", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "elevation", "Landroidx/compose/ui/unit/Dp;", "borderRadius", "borderHeight", "shadowHeight", "dropShadowColor", "Landroidx/compose/ui/graphics/Color;", "innerShadowColor", "neomorphicIndicator-Zs3qXj0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FFFFJJ)Landroidx/compose/ui/Modifier;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NeomorphicKt {
    /* renamed from: neomorphicIndicator-Zs3qXj0  reason: not valid java name */
    public static final Modifier m7048neomorphicIndicatorZs3qXj0(Modifier neomorphicIndicator, Shape shape, float f, float f2, float f3, float f4, long j, long j2) {
        Intrinsics.checkNotNullParameter(neomorphicIndicator, "$this$neomorphicIndicator");
        Intrinsics.checkNotNullParameter(shape, "shape");
        float f5 = -1;
        return ShadowKt.m7069innerShadowhy0AmR8(androidx.compose.ui.draw.ShadowKt.m2930shadows4CzXII$default(neomorphicIndicator, f, shape, false, j, j, 4, null), j2, f2, f3, f4, Dp.m5607constructorimpl(f5), Dp.m5607constructorimpl(f5));
    }
}
