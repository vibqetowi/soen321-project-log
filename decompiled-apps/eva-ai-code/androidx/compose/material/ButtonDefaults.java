package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.JG\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J3\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J3\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00105R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    private ButtonDefaults() {
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m1280getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m1279getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getIconSize-D9Ej5fM  reason: not valid java name */
    public final float m1277getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM  reason: not valid java name */
    public final float m1278getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: buttonColors-ro_MJ88  reason: not valid java name */
    public final ButtonColors m1274buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1870371134);
        ComposerKt.sourceInformation(composer, "C(buttonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color)406@16865L6,407@16911L32,408@17000L6,409@17078L6,410@17147L6,411@17203L8:Button.kt#jmzs0o");
        long m1309getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU() : j;
        long m1327contentColorForek8zF_U = (i2 & 2) != 0 ? ColorsKt.m1327contentColorForek8zF_U(m1309getPrimary0d7_KjU, composer, i & 14) : j2;
        long m3336compositeOverOWjLjI = (i2 & 4) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU()) : j3;
        long m3290copywmQWz5c$default = (i2 & 8) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:405)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1309getPrimary0d7_KjU, m1327contentColorForek8zF_U, m3336compositeOverOWjLjI, m3290copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: outlinedButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m1282outlinedButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-2124406093);
        ComposerKt.sourceInformation(composer, "C(outlinedButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color)429@17950L6,430@18010L6,431@18078L6,432@18134L8:Button.kt#jmzs0o");
        long m1313getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU() : j;
        long m1309getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU() : j2;
        long m3290copywmQWz5c$default = (i2 & 4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:428)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1313getSurface0d7_KjU, m1309getPrimary0d7_KjU, m1313getSurface0d7_KjU, m3290copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: textButtonColors-RGew2ao  reason: not valid java name */
    public final ButtonColors m1283textButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(182742216);
        ComposerKt.sourceInformation(composer, "C(textButtonColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.graphics.Color)451@18901L6,452@18969L6,453@19025L8:Button.kt#jmzs0o");
        long m3326getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j;
        long m1309getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU() : j2;
        long m3290copywmQWz5c$default = (i2 & 4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:449)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m3326getTransparent0d7_KjU, m1309getPrimary0d7_KjU, m3326getTransparent0d7_KjU, m3290copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM  reason: not valid java name */
    public final float m1281getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    public final BorderStroke getOutlinedBorder(Composer composer, int i) {
        composer.startReplaceableGroup(-2091313033);
        ComposerKt.sourceInformation(composer, "C477@19729L6:Button.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke m448BorderStrokecXLIe8U = BorderStrokeKt.m448BorderStrokecXLIe8U(OutlinedBorderSize, Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m448BorderStrokecXLIe8U;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-yajeYGU  reason: not valid java name */
    public final /* synthetic */ ButtonElevation m1276elevationyajeYGU(float f, float f2, float f3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1428576874);
        ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,2:c#ui.unit.Dp,1:c#ui.unit.Dp)349@14667L161:Button.kt#jmzs0o");
        float m5607constructorimpl = (i2 & 1) != 0 ? Dp.m5607constructorimpl(2) : f;
        float m5607constructorimpl2 = (i2 & 2) != 0 ? Dp.m5607constructorimpl(8) : f2;
        float m5607constructorimpl3 = (i2 & 4) != 0 ? Dp.m5607constructorimpl(0) : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:345)");
        }
        float f4 = 4;
        ButtonElevation m1275elevationR_JCAzs = m1275elevationR_JCAzs(m5607constructorimpl, m5607constructorimpl2, m5607constructorimpl3, Dp.m5607constructorimpl(f4), Dp.m5607constructorimpl(f4), composer, (i & 14) | 27648 | (i & 112) | (i & 896) | ((i << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1275elevationR_JCAzs;
    }

    /* renamed from: elevation-R_JCAzs  reason: not valid java name */
    public final ButtonElevation m1275elevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-737170518);
        ComposerKt.sourceInformation(composer, "C(elevation)P(0:c#ui.unit.Dp,4:c#ui.unit.Dp,1:c#ui.unit.Dp,3:c#ui.unit.Dp,2:c#ui.unit.Dp)378@15799L497:Button.kt#jmzs0o");
        float m5607constructorimpl = (i2 & 1) != 0 ? Dp.m5607constructorimpl(2) : f;
        float m5607constructorimpl2 = (i2 & 2) != 0 ? Dp.m5607constructorimpl(8) : f2;
        float m5607constructorimpl3 = (i2 & 4) != 0 ? Dp.m5607constructorimpl(0) : f3;
        float m5607constructorimpl4 = (i2 & 8) != 0 ? Dp.m5607constructorimpl(4) : f4;
        float m5607constructorimpl5 = (i2 & 16) != 0 ? Dp.m5607constructorimpl(4) : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:371)");
        }
        Object[] objArr = {Dp.m5605boximpl(m5607constructorimpl), Dp.m5605boximpl(m5607constructorimpl2), Dp.m5605boximpl(m5607constructorimpl3), Dp.m5605boximpl(m5607constructorimpl4), Dp.m5605boximpl(m5607constructorimpl5)};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultButtonElevation(m5607constructorimpl, m5607constructorimpl2, m5607constructorimpl3, m5607constructorimpl4, m5607constructorimpl5, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    static {
        float m5607constructorimpl = Dp.m5607constructorimpl(16);
        ButtonHorizontalPadding = m5607constructorimpl;
        float f = 8;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(f);
        ButtonVerticalPadding = m5607constructorimpl2;
        PaddingValues m744PaddingValuesa9UjIt4 = PaddingKt.m744PaddingValuesa9UjIt4(m5607constructorimpl, m5607constructorimpl2, m5607constructorimpl, m5607constructorimpl2);
        ContentPadding = m744PaddingValuesa9UjIt4;
        MinWidth = Dp.m5607constructorimpl(64);
        MinHeight = Dp.m5607constructorimpl(36);
        IconSize = Dp.m5607constructorimpl(18);
        IconSpacing = Dp.m5607constructorimpl(f);
        OutlinedBorderSize = Dp.m5607constructorimpl(1);
        float m5607constructorimpl3 = Dp.m5607constructorimpl(f);
        TextButtonHorizontalPadding = m5607constructorimpl3;
        TextButtonContentPadding = PaddingKt.m744PaddingValuesa9UjIt4(m5607constructorimpl3, m744PaddingValuesa9UjIt4.mo700calculateTopPaddingD9Ej5fM(), m5607constructorimpl3, m744PaddingValuesa9UjIt4.mo697calculateBottomPaddingD9Ej5fM());
    }
}
