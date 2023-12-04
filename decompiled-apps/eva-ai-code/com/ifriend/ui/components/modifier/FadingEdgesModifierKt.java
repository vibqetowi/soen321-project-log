package com.ifriend.ui.components.modifier;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FadingEdgesModifier.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"fadingEdges", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "topEdgeHeight", "Landroidx/compose/ui/unit/Dp;", "bottomEdgeHeight", "fadingEdges-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;FF)Landroidx/compose/ui/Modifier;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FadingEdgesModifierKt {
    /* renamed from: fadingEdges-4j6BHR0  reason: not valid java name */
    public static final Modifier m7046fadingEdges4j6BHR0(Modifier fadingEdges, ScrollState scrollState, float f, float f2) {
        Intrinsics.checkNotNullParameter(fadingEdges, "$this$fadingEdges");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        return fadingEdges.then(DrawModifierKt.drawWithContent(GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, CompositingStrategy.Companion.m3377getOffscreenNrFUSI(), 65535, null), new FadingEdgesModifierKt$fadingEdges$1(scrollState, f, f2)));
    }

    /* renamed from: fadingEdges-4j6BHR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m7047fadingEdges4j6BHR0$default(Modifier modifier, ScrollState scrollState, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.m5607constructorimpl(16);
        }
        if ((i & 4) != 0) {
            f2 = Dp.m5607constructorimpl(16);
        }
        return m7046fadingEdges4j6BHR0(modifier, scrollState, f, f2);
    }
}
