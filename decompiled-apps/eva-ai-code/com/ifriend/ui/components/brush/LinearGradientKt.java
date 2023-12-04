package com.ifriend.ui.components.brush;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.TileMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LinearGradient.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aW\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"linearGradient", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Brush$Companion;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "angleInDegrees", "useAsCssAngle", "", "linearGradient-eBVf0pg", "(Landroidx/compose/ui/graphics/Brush$Companion;Ljava/util/List;Ljava/util/List;IFZ)Landroidx/compose/ui/graphics/Brush;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LinearGradientKt {
    /* renamed from: linearGradient-eBVf0pg$default  reason: not valid java name */
    public static /* synthetic */ Brush m7018linearGradienteBVf0pg$default(Brush.Companion companion, List list, List list2, int i, float f, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i2 & 4) != 0) {
            i = TileMode.Companion.m3664getClamp3opZhB0();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            f = 0.0f;
        }
        float f2 = f;
        if ((i2 & 16) != 0) {
            z = false;
        }
        return m7017linearGradienteBVf0pg(companion, list, list3, i3, f2, z);
    }

    /* renamed from: linearGradient-eBVf0pg  reason: not valid java name */
    public static final Brush m7017linearGradienteBVf0pg(Brush.Companion linearGradient, List<Color> colors, List<Float> list, int i, float f, boolean z) {
        Intrinsics.checkNotNullParameter(linearGradient, "$this$linearGradient");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return new LinearGradient(colors, list, i, f, z, null);
    }
}
