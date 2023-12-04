package androidx.compose.material3;

import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015Je\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!JQ\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+Je\u0010,\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010!JQ\u0010.\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010+R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/material3/AssistChipDefaults;", "", "()V", "Height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM", "()F", "F", "IconSize", "getIconSize-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "assistChipBorder", "Landroidx/compose/material3/ChipBorder;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "disabledBorderColor", "borderWidth", "assistChipBorder-d_3_b6Q", "(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;", "assistChipColors", "Landroidx/compose/material3/ChipColors;", "containerColor", "labelColor", "leadingIconContentColor", "trailingIconContentColor", "disabledContainerColor", "disabledLabelColor", "disabledLeadingIconContentColor", "disabledTrailingIconContentColor", "assistChipColors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;", "assistChipElevation", "Landroidx/compose/material3/ChipElevation;", "elevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "assistChipElevation-aqJV_2Y", "(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;", "elevatedAssistChipColors", "elevatedAssistChipColors-oq7We08", "elevatedAssistChipElevation", "elevatedAssistChipElevation-aqJV_2Y", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float Height = AssistChipTokens.INSTANCE.m2275getContainerHeightD9Ej5fM();
    private static final float IconSize = AssistChipTokens.INSTANCE.m2284getIconSizeD9Ej5fM();

    private AssistChipDefaults() {
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public final float m1581getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m1582getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: assistChipColors-oq7We08  reason: not valid java name */
    public final ChipColors m1577assistChipColorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-391745725);
        ComposerKt.sourceInformation(composer, "C(assistChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)645@32113L9,646@32192L9,649@32405L9,652@32581L9:Chip.kt#uh7d8r");
        long m3326getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j;
        long color = (i2 & 2) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j2;
        long color2 = (i2 & 4) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6) : j3;
        long j9 = (i2 & 8) != 0 ? color2 : j4;
        long m3326getTransparent0d7_KjU2 = (i2 & 16) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j5;
        long m3290copywmQWz5c$default = (i2 & 32) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3290copywmQWz5c$default2 = (i2 & 64) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long j10 = (i2 & 128) != 0 ? m3290copywmQWz5c$default2 : j8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-391745725, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:643)");
        }
        ChipColors chipColors = new ChipColors(m3326getTransparent0d7_KjU, color, color2, j9, m3326getTransparent0d7_KjU2, m3290copywmQWz5c$default, m3290copywmQWz5c$default2, j10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    /* renamed from: assistChipElevation-aqJV_2Y  reason: not valid java name */
    public final ChipElevation m1578assistChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(245366099);
        ComposerKt.sourceInformation(composer, "C(assistChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        float m2282getFlatContainerElevationD9Ej5fM = (i2 & 1) != 0 ? AssistChipTokens.INSTANCE.m2282getFlatContainerElevationD9Ej5fM() : f;
        float f7 = (i2 & 2) != 0 ? m2282getFlatContainerElevationD9Ej5fM : f2;
        float f8 = (i2 & 4) != 0 ? m2282getFlatContainerElevationD9Ej5fM : f3;
        float f9 = (i2 & 8) != 0 ? m2282getFlatContainerElevationD9Ej5fM : f4;
        float m2276getDraggedContainerElevationD9Ej5fM = (i2 & 16) != 0 ? AssistChipTokens.INSTANCE.m2276getDraggedContainerElevationD9Ej5fM() : f5;
        float f10 = (i2 & 32) != 0 ? m2282getFlatContainerElevationD9Ej5fM : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:679)");
        }
        ChipElevation chipElevation = new ChipElevation(m2282getFlatContainerElevationD9Ej5fM, f7, f8, f9, m2276getDraggedContainerElevationD9Ej5fM, f10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    /* renamed from: assistChipBorder-d_3_b6Q  reason: not valid java name */
    public final ChipBorder m1576assistChipBorderd_3_b6Q(long j, long j2, float f, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(382372847);
        ComposerKt.sourceInformation(composer, "C(assistChipBorder)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,1:c#ui.unit.Dp)704@34981L9,705@35071L9:Chip.kt#uh7d8r");
        long color = (i2 & 1) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j;
        long m3290copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        float m2283getFlatOutlineWidthD9Ej5fM = (i2 & 4) != 0 ? AssistChipTokens.INSTANCE.m2283getFlatOutlineWidthD9Ej5fM() : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:703)");
        }
        ChipBorder chipBorder = new ChipBorder(color, m3290copywmQWz5c$default, m2283getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipBorder;
    }

    /* renamed from: elevatedAssistChipColors-oq7We08  reason: not valid java name */
    public final ChipColors m1579elevatedAssistChipColorsoq7We08(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-535762675);
        ComposerKt.sourceInformation(composer, "C(elevatedAssistChipColors)P(0:c#ui.graphics.Color,5:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)729@36329L9,730@36400L9,731@36479L9,733@36645L9,735@36809L9,738@36985L9:Chip.kt#uh7d8r");
        long color = (i2 & 1) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedContainerColor(), composer, 6) : j;
        long color2 = (i2 & 2) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getLabelTextColor(), composer, 6) : j2;
        long color3 = (i2 & 4) != 0 ? ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getIconColor(), composer, 6) : j3;
        long j9 = (i2 & 8) != 0 ? color3 : j4;
        long m3290copywmQWz5c$default = (i2 & 16) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3290copywmQWz5c$default2 = (i2 & 32) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledLabelTextColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3290copywmQWz5c$default3 = (i2 & 64) != 0 ? Color.m3290copywmQWz5c$default(ColorSchemeKt.toColor(AssistChipTokens.INSTANCE.getDisabledIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long j10 = (i2 & 128) != 0 ? m3290copywmQWz5c$default3 : j8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-535762675, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:728)");
        }
        ChipColors chipColors = new ChipColors(color, color2, color3, j9, m3290copywmQWz5c$default, m3290copywmQWz5c$default2, m3290copywmQWz5c$default3, j10, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipColors;
    }

    /* renamed from: elevatedAssistChipElevation-aqJV_2Y  reason: not valid java name */
    public final ChipElevation m1580elevatedAssistChipElevationaqJV_2Y(float f, float f2, float f3, float f4, float f5, float f6, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1457698077);
        ComposerKt.sourceInformation(composer, "C(elevatedAssistChipElevation)P(2:c#ui.unit.Dp,5:c#ui.unit.Dp,3:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.unit.Dp):Chip.kt#uh7d8r");
        float m2277getElevatedContainerElevationD9Ej5fM = (i2 & 1) != 0 ? AssistChipTokens.INSTANCE.m2277getElevatedContainerElevationD9Ej5fM() : f;
        float m2281getElevatedPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? AssistChipTokens.INSTANCE.m2281getElevatedPressedContainerElevationD9Ej5fM() : f2;
        float m2279getElevatedFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? AssistChipTokens.INSTANCE.m2279getElevatedFocusContainerElevationD9Ej5fM() : f3;
        float m2280getElevatedHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? AssistChipTokens.INSTANCE.m2280getElevatedHoverContainerElevationD9Ej5fM() : f4;
        float m2276getDraggedContainerElevationD9Ej5fM = (i2 & 16) != 0 ? AssistChipTokens.INSTANCE.m2276getDraggedContainerElevationD9Ej5fM() : f5;
        float m2278getElevatedDisabledContainerElevationD9Ej5fM = (i2 & 32) != 0 ? AssistChipTokens.INSTANCE.m2278getElevatedDisabledContainerElevationD9Ej5fM() : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:765)");
        }
        ChipElevation chipElevation = new ChipElevation(m2277getElevatedContainerElevationD9Ej5fM, m2281getElevatedPressedContainerElevationD9Ej5fM, m2279getElevatedFocusContainerElevationD9Ej5fM, m2280getElevatedHoverContainerElevationD9Ej5fM, m2276getDraggedContainerElevationD9Ej5fM, m2278getElevatedDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return chipElevation;
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(1988153916);
        ComposerKt.sourceInformation(composer, "C782@39245L9:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:782)");
        }
        Shape shape = ShapesKt.toShape(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
