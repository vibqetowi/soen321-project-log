package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 Jo\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)JQ\u0010*\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010 Jo\u0010,\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010#\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020\u00192\b\b\u0002\u0010%\u001a\u00020\u00192\b\b\u0002\u0010&\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/material/ChipDefaults;", "", "()V", "ContentOpacity", "", "LeadingIconOpacity", "LeadingIconSize", "Landroidx/compose/ui/unit/Dp;", "getLeadingIconSize-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "OutlinedBorderOpacity", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "SelectedIconSize", "getSelectedIconSize-D9Ej5fM", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "chipColors", "Landroidx/compose/material/ChipColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "disabledBackgroundColor", "disabledContentColor", "disabledLeadingIconContentColor", "chipColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ChipColors;", "filterChipColors", "Landroidx/compose/material/SelectableChipColors;", "leadingIconColor", "disabledLeadingIconColor", "selectedBackgroundColor", "selectedContentColor", "selectedLeadingIconColor", "filterChipColors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/SelectableChipColors;", "outlinedChipColors", "outlinedChipColors-5tl4gsc", "outlinedFilterChipColors", "outlinedFilterChipColors-J08w3-E", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = Dp.m5607constructorimpl(32);
    private static final float OutlinedBorderSize = Dp.m5607constructorimpl(1);
    private static final float LeadingIconSize = Dp.m5607constructorimpl(20);
    private static final float SelectedIconSize = Dp.m5607constructorimpl(18);

    private ChipDefaults() {
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m1295getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: chipColors-5tl4gsc  reason: not valid java name */
    public final ChipColors m1292chipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1838505436);
        ComposerKt.sourceInformation(composer, "C(chipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)385@16874L6,386@16968L6,387@17029L6,390@17231L6,391@17291L8,392@17366L6,394@17473L8,397@17621L8:Chip.kt#jmzs0o");
        long m3336compositeOverOWjLjI = (i2 & 1) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU()) : j;
        long m3290copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3290copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m3336compositeOverOWjLjI2 = (i2 & 8) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU()) : j4;
        long m3290copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3290copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:384)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(m3336compositeOverOWjLjI, m3290copywmQWz5c$default, m3290copywmQWz5c$default2, m3336compositeOverOWjLjI2, m3290copywmQWz5c$default3, m3290copywmQWz5c$default4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultChipColors;
    }

    /* renamed from: outlinedChipColors-5tl4gsc  reason: not valid java name */
    public final ChipColors m1298outlinedChipColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1763922662);
        ComposerKt.sourceInformation(composer, "C(outlinedChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color)421@18817L6,422@18877L6,426@19160L8,429@19308L8,430@19360L342:Chip.kt#jmzs0o");
        long m1313getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU() : j;
        long m3290copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3290copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j7 = (i2 & 8) != 0 ? m1313getSurface0d7_KjU : j4;
        long m3290copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3290copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:420)");
        }
        ChipColors m1292chipColors5tl4gsc = m1292chipColors5tl4gsc(m1313getSurface0d7_KjU, m3290copywmQWz5c$default, m3290copywmQWz5c$default2, j7, m3290copywmQWz5c$default3, m3290copywmQWz5c$default4, composer, (i & 14) | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (i & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m1292chipColors5tl4gsc;
    }

    /* renamed from: filterChipColors-J08w3-E  reason: not valid java name */
    public final SelectableChipColors m1293filterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(830140629);
        ComposerKt.sourceInformation(composer, "C(filterChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color)455@20699L6,456@20793L6,457@20854L6,460@21041L6,461@21101L8,462@21176L6,464@21283L8,467@21418L8,469@21514L6,472@21673L6,475@21834L6:Chip.kt#jmzs0o");
        long m3336compositeOverOWjLjI = (i2 & 1) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU()) : j;
        long m3290copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3290copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long m3336compositeOverOWjLjI2 = (i2 & 8) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU()) : j4;
        long m3290copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3290copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3336compositeOverOWjLjI3 = (i2 & 64) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), m3336compositeOverOWjLjI) : j7;
        long m3336compositeOverOWjLjI4 = (i2 & 128) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m3290copywmQWz5c$default) : j8;
        long m3336compositeOverOWjLjI5 = (i2 & 256) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m3290copywmQWz5c$default2) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830140629, i, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:454)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(m3336compositeOverOWjLjI, m3290copywmQWz5c$default, m3290copywmQWz5c$default2, m3336compositeOverOWjLjI2, m3290copywmQWz5c$default3, m3290copywmQWz5c$default4, m3336compositeOverOWjLjI3, m3336compositeOverOWjLjI4, m3336compositeOverOWjLjI5, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    /* renamed from: outlinedFilterChipColors-J08w3-E  reason: not valid java name */
    public final SelectableChipColors m1299outlinedFilterChipColorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(346878099);
        ComposerKt.sourceInformation(composer, "C(outlinedFilterChipColors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,3:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,7:c#ui.graphics.Color,8:c#ui.graphics.Color)506@23484L6,507@23544L6,511@23804L8,514@23939L8,516@24035L6,519@24195L6,522@24356L6:Chip.kt#jmzs0o");
        long m1313getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1313getSurface0d7_KjU() : j;
        long m3290copywmQWz5c$default = (i2 & 2) != 0 ? Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m3290copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j10 = (i2 & 8) != 0 ? m1313getSurface0d7_KjU : j4;
        long m3290copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3290copywmQWz5c$default4 = (i2 & 32) != 0 ? Color.m3290copywmQWz5c$default(m3290copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3336compositeOverOWjLjI = (i2 & 64) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m1313getSurface0d7_KjU) : j7;
        long m3336compositeOverOWjLjI2 = (i2 & 128) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m3290copywmQWz5c$default) : j8;
        long m3336compositeOverOWjLjI3 = (i2 & 256) != 0 ? ColorKt.m3336compositeOverOWjLjI(Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m3290copywmQWz5c$default2) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(346878099, i, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:505)");
        }
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(m1313getSurface0d7_KjU, m3290copywmQWz5c$default, m3290copywmQWz5c$default2, j10, m3290copywmQWz5c$default3, m3290copywmQWz5c$default4, m3336compositeOverOWjLjI, m3336compositeOverOWjLjI2, m3336compositeOverOWjLjI3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSelectableChipColors;
    }

    public final BorderStroke getOutlinedBorder(Composer composer, int i) {
        composer.startReplaceableGroup(-1650225597);
        ComposerKt.sourceInformation(composer, "C543@25203L6:Chip.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:542)");
        }
        BorderStroke m448BorderStrokecXLIe8U = BorderStrokeKt.m448BorderStrokecXLIe8U(OutlinedBorderSize, Color.m3290copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1308getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m448BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM  reason: not valid java name */
    public final float m1296getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM  reason: not valid java name */
    public final float m1294getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM  reason: not valid java name */
    public final float m1297getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }
}
