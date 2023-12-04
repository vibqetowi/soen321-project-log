package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MaterialTextSelectionColors.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", "textColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", DownloadService.KEY_FOREGROUND, "background", "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    public static final TextSelectionColors rememberTextSelectionColors(Colors colors, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        composer.startReplaceableGroup(-721696685);
        ComposerKt.sourceInformation(composer, "C(rememberTextSelectionColors)45@1902L6,47@1930L384:MaterialTextSelectionColors.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m1309getPrimary0d7_KjU = colors.m1309getPrimary0d7_KjU();
        long m1302getBackground0d7_KjU = colors.m1302getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        ComposerKt.sourceInformation(composer, "*43@1845L7");
        long m1326contentColorFor4WTKRHQ = ColorsKt.m1326contentColorFor4WTKRHQ(colors, m1302getBackground0d7_KjU);
        if (!(m1326contentColorFor4WTKRHQ != Color.Companion.m3327getUnspecified0d7_KjU())) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(composer);
            m1326contentColorFor4WTKRHQ = ((Color) consume).m3301unboximpl();
        }
        composer.endReplaceableGroup();
        long m3290copywmQWz5c$default = Color.m3290copywmQWz5c$default(m1326contentColorFor4WTKRHQ, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m3281boximpl = Color.m3281boximpl(m1309getPrimary0d7_KjU);
        Color m3281boximpl2 = Color.m3281boximpl(m1302getBackground0d7_KjU);
        Color m3281boximpl3 = Color.m3281boximpl(m3290copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(m3281boximpl) | composer.changed(m3281boximpl2) | composer.changed(m3281boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(colors.m1309getPrimary0d7_KjU(), m1398calculateSelectionBackgroundColorysEtTa8(m1309getPrimary0d7_KjU, m3290copywmQWz5c$default, m1302getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextSelectionColors textSelectionColors = (TextSelectionColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textSelectionColors;
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8  reason: not valid java name */
    public static final long m1398calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float m1395binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float m1397calculateContrastRationb2GgbA = m1397calculateContrastRationb2GgbA(j, 0.4f, j2, j3);
        float m1397calculateContrastRationb2GgbA2 = m1397calculateContrastRationb2GgbA(j, 0.2f, j2, j3);
        if (m1397calculateContrastRationb2GgbA >= DesiredContrastRatio) {
            m1395binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else {
            m1395binarySearchForAccessibleSelectionColorAlphaysEtTa8 = m1397calculateContrastRationb2GgbA2 < DesiredContrastRatio ? 0.2f : m1395binarySearchForAccessibleSelectionColorAlphaysEtTa8(j, j2, j3);
        }
        return Color.m3290copywmQWz5c$default(j, m1395binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8  reason: not valid java name */
    private static final float m1395binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float m1397calculateContrastRationb2GgbA = (m1397calculateContrastRationb2GgbA(j, f2, j2, j3) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m1397calculateContrastRationb2GgbA && m1397calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m1397calculateContrastRationb2GgbA < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    /* renamed from: calculateContrastRatio-nb2GgbA  reason: not valid java name */
    private static final float m1397calculateContrastRationb2GgbA(long j, float f, long j2, long j3) {
        long m3336compositeOverOWjLjI = ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m1396calculateContrastRatioOWjLjI(ColorKt.m3336compositeOverOWjLjI(j2, m3336compositeOverOWjLjI), m3336compositeOverOWjLjI);
    }

    /* renamed from: calculateContrastRatio--OWjLjI  reason: not valid java name */
    public static final float m1396calculateContrastRatioOWjLjI(long j, long j2) {
        float m3343luminance8_81llA = ColorKt.m3343luminance8_81llA(j) + 0.05f;
        float m3343luminance8_81llA2 = ColorKt.m3343luminance8_81llA(j2) + 0.05f;
        return Math.max(m3343luminance8_81llA, m3343luminance8_81llA2) / Math.min(m3343luminance8_81llA, m3343luminance8_81llA2);
    }
}
