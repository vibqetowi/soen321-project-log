package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\tJñ\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$Jñ\u0001\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuDefaults;", "", "()V", "TrailingIcon", "", "expanded", "", "onIconClick", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "cursorColor", "errorCursorColor", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "focusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-DlUQjxs", "(JJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-DlUQjxs", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    public final void TrailingIcon(boolean z, Function0<Unit> function0, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(876077373);
        ComposerKt.sourceInformation(startRestartGroup, "C(TrailingIcon)299@11590L394:ExposedDropdownMenu.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                function0 = ExposedDropdownMenuDefaults$TrailingIcon$1.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876077373, i3, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:291)");
            }
            IconButtonKt.IconButton(function0, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, ExposedDropdownMenuDefaults$TrailingIcon$2.INSTANCE), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, 726122713, true, new ExposedDropdownMenuDefaults$TrailingIcon$3(z)), startRestartGroup, ((i3 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Function0<Unit> function02 = function0;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ExposedDropdownMenuDefaults$TrailingIcon$4(this, z, function02, i, i2));
    }

    /* renamed from: textFieldColors-DlUQjxs  reason: not valid java name */
    public final TextFieldColors m1371textFieldColorsDlUQjxs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        long j23;
        composer.startReplaceableGroup(1208167904);
        ComposerKt.sourceInformation(composer, "C(textFieldColors)P(18:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,9:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,19:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)358@14663L7,358@14694L7,359@14767L8,361@14837L6,362@14948L6,363@15012L6,365@15091L6,365@15132L4,367@15206L6,370@15406L8,371@15468L6,373@15542L6,374@15689L8,377@15818L6,379@15948L6,379@15989L4,380@16083L8,381@16148L6,383@16223L6,383@16264L4,384@16322L6,384@16357L6,385@16440L8,386@16498L6,387@16560L6,387@16595L6,388@16681L8:ExposedDropdownMenu.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m3301unboximpl = ((Color) consume).m3301unboximpl();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(ContentAlphaKt.getLocalContentAlpha());
            ComposerKt.sourceInformationMarkerEnd(composer);
            j23 = Color.m3290copywmQWz5c$default(m3301unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = j;
        }
        long m3290copywmQWz5c$default = (i4 & 2) != 0 ? Color.m3290copywmQWz5c$default(j23, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3290copywmQWz5c$default2 = (i4 & 4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m1309getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU() : j4;
        long m1303getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j5;
        long m3290copywmQWz5c$default3 = (i4 & 32) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3290copywmQWz5c$default4 = (i4 & 64) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m3290copywmQWz5c$default5 = (i4 & 128) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1303getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j9;
        long m3290copywmQWz5c$default6 = (i4 & 512) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m3290copywmQWz5c$default7 = (i4 & 1024) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j24 = (i4 & 2048) != 0 ? m3290copywmQWz5c$default6 : j12;
        long m3290copywmQWz5c$default8 = (i4 & 4096) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m3290copywmQWz5c$default9 = (i4 & 8192) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m3290copywmQWz5c$default10 = (i4 & 16384) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m1303getError0d7_KjU3 = (32768 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j16;
        long m3290copywmQWz5c$default11 = (65536 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m3290copywmQWz5c$default12 = (131072 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m3290copywmQWz5c$default13 = (262144 & i4) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m1303getError0d7_KjU4 = (524288 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j20;
        long m3290copywmQWz5c$default14 = (1048576 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m3290copywmQWz5c$default15 = (i4 & 2097152) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1208167904, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:357)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(j23, m3290copywmQWz5c$default, m1309getPrimary0d7_KjU, m1303getError0d7_KjU, m3290copywmQWz5c$default3, m3290copywmQWz5c$default4, m1303getError0d7_KjU2, m3290copywmQWz5c$default5, m3290copywmQWz5c$default6, m3290copywmQWz5c$default7, j24, m3290copywmQWz5c$default8, m3290copywmQWz5c$default9, m3290copywmQWz5c$default10, m1303getError0d7_KjU3, m3290copywmQWz5c$default2, m3290copywmQWz5c$default11, m3290copywmQWz5c$default12, m3290copywmQWz5c$default13, m1303getError0d7_KjU4, m3290copywmQWz5c$default14, m3290copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    /* renamed from: outlinedTextFieldColors-DlUQjxs  reason: not valid java name */
    public final TextFieldColors m1370outlinedTextFieldColorsDlUQjxs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, Composer composer, int i, int i2, int i3, int i4) {
        long j23;
        composer.startReplaceableGroup(1162641182);
        ComposerKt.sourceInformation(composer, "C(outlinedTextFieldColors)P(18:c#ui.graphics.Color,6:c#ui.graphics.Color,0:c#ui.graphics.Color,1:c#ui.graphics.Color,9:c#ui.graphics.Color,13:c#ui.graphics.Color,20:c#ui.graphics.Color,2:c#ui.graphics.Color,8:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.graphics.Color,19:c#ui.graphics.Color,15:c#ui.graphics.Color,7:c#ui.graphics.Color,12:c#ui.graphics.Color,14:c#ui.graphics.Color,21:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.graphics.Color,17:c#ui.graphics.Color,5:c#ui.graphics.Color)461@20648L7,461@20679L7,462@20752L8,464@20858L6,465@20922L6,467@20998L6,467@21039L4,469@21110L6,469@21153L8,470@21248L8,471@21307L6,473@21381L6,474@21528L8,477@21657L6,479@21787L6,479@21828L4,480@21922L8,481@21987L6,483@22062L6,483@22103L4,484@22161L6,484@22196L6,485@22279L8,486@22337L6,487@22399L6,487@22434L6,488@22520L8:ExposedDropdownMenu.kt#jmzs0o");
        if ((i4 & 1) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(ContentColorKt.getLocalContentColor());
            ComposerKt.sourceInformationMarkerEnd(composer);
            long m3301unboximpl = ((Color) consume).m3301unboximpl();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(ContentAlphaKt.getLocalContentAlpha());
            ComposerKt.sourceInformationMarkerEnd(composer);
            j23 = Color.m3290copywmQWz5c$default(m3301unboximpl, ((Number) consume2).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j23 = j;
        }
        long m3290copywmQWz5c$default = (i4 & 2) != 0 ? Color.m3290copywmQWz5c$default(j23, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3326getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.Companion.m3326getTransparent0d7_KjU() : j3;
        long m1309getPrimary0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU() : j4;
        long m1303getError0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j5;
        long m3290copywmQWz5c$default2 = (i4 & 32) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3290copywmQWz5c$default3 = (i4 & 64) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m3290copywmQWz5c$default4 = (i4 & 128) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default3, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m1303getError0d7_KjU2 = (i4 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j9;
        long m3290copywmQWz5c$default5 = (i4 & 512) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m3290copywmQWz5c$default6 = (i4 & 1024) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j24 = (i4 & 2048) != 0 ? m3290copywmQWz5c$default5 : j12;
        long m3290copywmQWz5c$default7 = (i4 & 4096) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m3290copywmQWz5c$default8 = (i4 & 8192) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m3290copywmQWz5c$default9 = (i4 & 16384) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m1303getError0d7_KjU3 = (32768 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j16;
        long m3290copywmQWz5c$default10 = (65536 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1309getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m3290copywmQWz5c$default11 = (131072 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m3290copywmQWz5c$default12 = (262144 & i4) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        long m1303getError0d7_KjU4 = (524288 & i4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1303getError0d7_KjU() : j20;
        long m3290copywmQWz5c$default13 = (1048576 & i4) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m3290copywmQWz5c$default14 = (i4 & 2097152) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1162641182, i, i2, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:460)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(j23, m3290copywmQWz5c$default, m1309getPrimary0d7_KjU, m1303getError0d7_KjU, m3290copywmQWz5c$default2, m3290copywmQWz5c$default3, m1303getError0d7_KjU2, m3290copywmQWz5c$default4, m3290copywmQWz5c$default5, m3290copywmQWz5c$default6, j24, m3290copywmQWz5c$default7, m3290copywmQWz5c$default8, m3290copywmQWz5c$default9, m1303getError0d7_KjU3, m3326getTransparent0d7_KjU, m3290copywmQWz5c$default10, m3290copywmQWz5c$default11, m3290copywmQWz5c$default12, m1303getError0d7_KjU4, m3290copywmQWz5c$default13, m3290copywmQWz5c$default14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
