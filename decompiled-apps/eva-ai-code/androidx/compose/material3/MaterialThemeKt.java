package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MaterialTheme.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"DefaultRippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "TextSelectionBackgroundOpacity", "", "MaterialTheme", "", "colorScheme", "Landroidx/compose/material3/ColorScheme;", "shapes", "Landroidx/compose/material3/Shapes;", "typography", "Landroidx/compose/material3/Typography;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialThemeKt {
    private static final RippleAlpha DefaultRippleAlpha = new RippleAlpha(0.16f, 0.12f, 0.08f, 0.12f);
    public static final float TextSelectionBackgroundOpacity = 0.4f;

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
        if ((r84 & 4) != 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(ColorScheme colorScheme, Shapes shapes, Typography typography, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        ColorScheme colorScheme2;
        int i3;
        Shapes shapes2;
        Typography typography2;
        Shapes shapes3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2127166334);
        ComposerKt.sourceInformation(startRestartGroup, "C(MaterialTheme)P(!1,2,3)58@2824L11,59@2872L6,60@2923L10,*63@3007L194,70@3286L16,71@3329L50,72@3384L417:MaterialTheme.kt#uh7d8r");
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                colorScheme2 = colorScheme;
                if (startRestartGroup.changed(colorScheme2)) {
                    i6 = 4;
                    i3 = i6 | i;
                }
            } else {
                colorScheme2 = colorScheme;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            colorScheme2 = colorScheme;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                shapes2 = shapes;
                if (startRestartGroup.changed(shapes2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                shapes2 = shapes;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            shapes2 = shapes;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                typography2 = typography;
                if (startRestartGroup.changed(typography2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                typography2 = typography;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            typography2 = typography;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else {
                if ((i2 & 1) != 0) {
                    colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    i3 &= -897;
                }
                int i7 = i3;
                Object obj = shapes2;
                Typography typography3 = typography2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2127166334, i7, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:57)");
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = r15.m1626copyG1PFcw((r104 & 1) != 0 ? r15.m1646getPrimary0d7_KjU() : 0L, (r104 & 2) != 0 ? r15.m1636getOnPrimary0d7_KjU() : 0L, (r104 & 4) != 0 ? r15.m1647getPrimaryContainer0d7_KjU() : 0L, (r104 & 8) != 0 ? r15.m1637getOnPrimaryContainer0d7_KjU() : 0L, (r104 & 16) != 0 ? r15.m1631getInversePrimary0d7_KjU() : 0L, (r104 & 32) != 0 ? r15.m1649getSecondary0d7_KjU() : 0L, (r104 & 64) != 0 ? r15.m1638getOnSecondary0d7_KjU() : 0L, (r104 & 128) != 0 ? r15.m1650getSecondaryContainer0d7_KjU() : 0L, (r104 & 256) != 0 ? r15.m1639getOnSecondaryContainer0d7_KjU() : 0L, (r104 & 512) != 0 ? r15.m1654getTertiary0d7_KjU() : 0L, (r104 & 1024) != 0 ? r15.m1642getOnTertiary0d7_KjU() : 0L, (r104 & 2048) != 0 ? r15.m1655getTertiaryContainer0d7_KjU() : 0L, (r104 & 4096) != 0 ? r15.m1643getOnTertiaryContainer0d7_KjU() : 0L, (r104 & 8192) != 0 ? r15.m1627getBackground0d7_KjU() : 0L, (r104 & 16384) != 0 ? r15.m1633getOnBackground0d7_KjU() : 0L, (r104 & 32768) != 0 ? r15.m1651getSurface0d7_KjU() : 0L, (r104 & 65536) != 0 ? r15.m1640getOnSurface0d7_KjU() : 0L, (r104 & 131072) != 0 ? r15.m1653getSurfaceVariant0d7_KjU() : 0L, (r104 & 262144) != 0 ? r15.m1641getOnSurfaceVariant0d7_KjU() : 0L, (r104 & 524288) != 0 ? r15.m1652getSurfaceTint0d7_KjU() : 0L, (r104 & 1048576) != 0 ? r15.m1632getInverseSurface0d7_KjU() : 0L, (r104 & 2097152) != 0 ? r15.m1630getInverseOnSurface0d7_KjU() : 0L, (r104 & 4194304) != 0 ? r15.m1628getError0d7_KjU() : 0L, (r104 & 8388608) != 0 ? r15.m1634getOnError0d7_KjU() : 0L, (r104 & 16777216) != 0 ? r15.m1629getErrorContainer0d7_KjU() : 0L, (r104 & 33554432) != 0 ? r15.m1635getOnErrorContainer0d7_KjU() : 0L, (r104 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? r15.m1644getOutline0d7_KjU() : 0L, (r104 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r15.m1645getOutlineVariant0d7_KjU() : 0L, (r104 & 268435456) != 0 ? colorScheme2.m1648getScrim0d7_KjU() : 0L);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                ColorScheme colorScheme3 = (ColorScheme) rememberedValue;
                ColorSchemeKt.updateColorSchemeFrom(colorScheme3, colorScheme2);
                shapes3 = obj;
                typography2 = typography3;
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ColorSchemeKt.getLocalColorScheme().provides(colorScheme3), IndicationKt.getLocalIndication().provides(RippleKt.m1559rememberRipple9IZ8Weo(false, 0.0f, 0L, startRestartGroup, 0, 7)), RippleThemeKt.getLocalRippleTheme().provides(MaterialRippleTheme.INSTANCE), ShapesKt.getLocalShapes().provides(shapes3), TextSelectionColorsKt.getLocalTextSelectionColors().provides(rememberTextSelectionColors(colorScheme3, startRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography2)}, ComposableLambdaKt.composableLambda(startRestartGroup, -1066563262, true, new MaterialThemeKt$MaterialTheme$1(typography2, content, i7)), startRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            shapes3 = shapes2;
        }
        Typography typography4 = typography2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new MaterialThemeKt$MaterialTheme$2(colorScheme2, shapes3, typography4, content, i, i2));
    }

    public static final TextSelectionColors rememberTextSelectionColors(ColorScheme colorScheme, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        composer.startReplaceableGroup(1866455512);
        ComposerKt.sourceInformation(composer, "C(rememberTextSelectionColors)134@5274L198:MaterialTheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1866455512, i, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:132)");
        }
        long m1646getPrimary0d7_KjU = colorScheme.m1646getPrimary0d7_KjU();
        Color m3281boximpl = Color.m3281boximpl(m1646getPrimary0d7_KjU);
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(m3281boximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(m1646getPrimary0d7_KjU, Color.m3290copywmQWz5c$default(m1646getPrimary0d7_KjU, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
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
}
