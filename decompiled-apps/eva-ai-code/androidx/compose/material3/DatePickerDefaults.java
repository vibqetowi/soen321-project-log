package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001eJÓ\u0001\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020\"2\b\b\u0002\u0010)\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020\"2\b\b\u0002\u0010+\u001a\u00020\"2\b\b\u0002\u0010,\u001a\u00020\"2\b\b\u0002\u0010-\u001a\u00020\"2\b\b\u0002\u0010.\u001a\u00020\"2\b\b\u0002\u0010/\u001a\u00020\"2\b\b\u0002\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\"2\b\b\u0002\u00102\u001a\u00020\"2\b\b\u0002\u00103\u001a\u00020\"2\b\b\u0002\u00104\u001a\u00020\"H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J'\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0001¢\u0006\u0004\b>\u0010?R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "()V", "TonalElevation", "Landroidx/compose/ui/unit/Dp;", "getTonalElevation-D9Ej5fM", "()F", "F", "YearAbbrMonthDaySkeleton", "", "YearMonthSkeleton", "YearMonthWeekdayDaySkeleton", "YearRange", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "DatePickerHeadline", "", "state", "Landroidx/compose/material3/DatePickerState;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DatePickerTitle", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "colors", "Landroidx/compose/material3/DatePickerColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "yearContentColor", "currentYearContentColor", "selectedYearContentColor", "selectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "colors-1m2Cg-Y", "(JJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/DatePickerColors;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "rememberSnapFlingBehavior$material3_release", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerDefaults {
    public static final int $stable = 0;
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";
    public static final String YearMonthSkeleton = "yMMMM";
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();
    private static final IntRange YearRange = new IntRange(1900, 2100);
    private static final float TonalElevation = DatePickerModalTokens.INSTANCE.m2374getContainerElevationD9Ej5fM();

    private DatePickerDefaults() {
    }

    /* renamed from: colors-1m2Cg-Y  reason: not valid java name */
    public final DatePickerColors m1734colors1m2CgY(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(543433842);
        ComposerKt.sourceInformation(composer, "C(colors)P(0:c#ui.graphics.Color,14:c#ui.graphics.Color,8:c#ui.graphics.Color,17:c#ui.graphics.Color,13:c#ui.graphics.Color,18:c#ui.graphics.Color,1:c#ui.graphics.Color,12:c#ui.graphics.Color,11:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,10:c#ui.graphics.Color,7:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.graphics.Color,15:c#ui.graphics.Color,16:c#ui.graphics.Color,4:c#ui.graphics.Color,3:c#ui.graphics.Color)359@16109L9,360@16203L9,361@16294L9,362@16387L9,364@16501L9,366@16618L9,367@16716L9,369@16839L9,371@16964L9,372@17059L9,375@17301L9,379@17573L9,382@17826L9,384@17940L9,386@18069L9,388@18209L9:DatePicker.kt#uh7d8r");
        long color = (i3 & 1) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long color2 = (i3 & 2) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextColor(), composer, 6) : j2;
        long color3 = (i3 & 4) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getHeaderHeadlineColor(), composer, 6) : j3;
        long color4 = (i3 & 8) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextColor(), composer, 6) : j4;
        long color5 = (i3 & 16) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadColor(), composer, 6) : j5;
        long color6 = (i3 & 32) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor(), composer, 6) : j6;
        long color7 = (i3 & 64) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor(), composer, 6) : j7;
        long color8 = (i3 & 128) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor(), composer, 6) : j8;
        long color9 = (i3 & 256) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor(), composer, 6) : j9;
        long color10 = (i3 & 512) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor(), composer, 6) : j10;
        long m3290copywmQWz5c$default = (i3 & 1024) != 0 ? Color.m3290copywmQWz5c$default(color10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long color11 = (i3 & 2048) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor(), composer, 6) : j12;
        long m3290copywmQWz5c$default2 = (i3 & 4096) != 0 ? Color.m3290copywmQWz5c$default(color11, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long color12 = (i3 & 8192) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor(), composer, 6) : j14;
        long m3290copywmQWz5c$default3 = (i3 & 16384) != 0 ? Color.m3290copywmQWz5c$default(color12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long color13 = (32768 & i3) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor(), composer, 6) : j16;
        long color14 = (65536 & i3) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayContainerOutlineColor(), composer, 6) : j17;
        long color15 = (131072 & i3) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionDateInRangeLabelTextColor(), composer, 6) : j18;
        long color16 = (i3 & 262144) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getRangeSelectionActiveIndicatorContainerColor(), composer, 6) : j19;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(543433842, i, i2, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:358)");
        }
        DatePickerColors datePickerColors = new DatePickerColors(color, color2, color3, color4, color5, color6, color7, color8, color9, color10, m3290copywmQWz5c$default, color11, m3290copywmQWz5c$default2, color12, m3290copywmQWz5c$default3, color13, color14, color16, color15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DatePickerTitle(DatePickerState state, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int m1743getDisplayModejFl4v0;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-1157401173);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerTitle)P(1):DatePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
            i4 = i3;
            if ((i4 & 91) == 18 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1157401173, i4, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:419)");
                }
                m1743getDisplayModejFl4v0 = state.m1743getDisplayModejFl4v0();
                if (!DisplayMode.m1762equalsimpl0(m1743getDisplayModejFl4v0, DisplayMode.Companion.m1767getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(-2065111000);
                    ComposerKt.sourceInformation(startRestartGroup, "422@19876L43,421@19847L123");
                    TextKt.m2145Text4IGK_g(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2022getDatePickerTitleadMyvUU(), startRestartGroup, 6), companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, i4 & 112, 0, 131068);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1762equalsimpl0(m1743getDisplayModejFl4v0, DisplayMode.Companion.m1766getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(-2065110842);
                    ComposerKt.sourceInformation(startRestartGroup, "427@20034L42,426@20005L122");
                    TextKt.m2145Text4IGK_g(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2009getDateInputTitleadMyvUU(), startRestartGroup, 6), companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, i4 & 112, 0, 131068);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-2065110710);
                    startRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new DatePickerDefaults$DatePickerTitle$1(this, state, modifier2, i, i2));
            return;
        }
        obj = modifier;
        i4 = i3;
        if ((i4 & 91) == 18) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        m1743getDisplayModejFl4v0 = state.m1743getDisplayModejFl4v0();
        if (!DisplayMode.m1762equalsimpl0(m1743getDisplayModejFl4v0, DisplayMode.Companion.m1767getPickerjFl4v0())) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DatePickerHeadline(DatePickerState state, DatePickerFormatter dateFormatter, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        String formatDate$material3_release$default;
        String formatDate$material3_release;
        int m1765unboximpl;
        boolean changed;
        DatePickerDefaults$DatePickerHeadline$1$1$1 rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Composer startRestartGroup = composer.startRestartGroup(-1893194407);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerHeadline)P(2)*448@20771L15,479@22178L135,477@22089L268:DatePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(dateFormatter) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1893194407, i, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:442)");
                }
                StateData stateData$material3_release = state.getStateData$material3_release();
                Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
                formatDate$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(dateFormatter, stateData$material3_release.getSelectedStartDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, false, 8, null);
                formatDate$material3_release = dateFormatter.formatDate$material3_release(stateData$material3_release.getSelectedStartDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, true);
                startRestartGroup.startReplaceableGroup(729783869);
                String str = "";
                ComposerKt.sourceInformation(startRestartGroup, "");
                if (formatDate$material3_release == null) {
                    int m1765unboximpl2 = stateData$material3_release.getDisplayMode().getValue().m1765unboximpl();
                    if (DisplayMode.m1762equalsimpl0(m1765unboximpl2, DisplayMode.Companion.m1767getPickerjFl4v0())) {
                        startRestartGroup.startReplaceableGroup(933108990);
                        ComposerKt.sourceInformation(startRestartGroup, "460@21322L51");
                        formatDate$material3_release = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2013getDatePickerNoSelectionDescriptionadMyvUU(), startRestartGroup, 6);
                        startRestartGroup.endReplaceableGroup();
                    } else if (DisplayMode.m1762equalsimpl0(m1765unboximpl2, DisplayMode.Companion.m1766getInputjFl4v0())) {
                        startRestartGroup.startReplaceableGroup(933109079);
                        ComposerKt.sourceInformation(startRestartGroup, "461@21411L46");
                        formatDate$material3_release = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2008getDateInputNoInputDescriptionadMyvUU(), startRestartGroup, 6);
                        startRestartGroup.endReplaceableGroup();
                    } else {
                        startRestartGroup.startReplaceableGroup(-1138387422);
                        startRestartGroup.endReplaceableGroup();
                        formatDate$material3_release = "";
                    }
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(729784366);
                ComposerKt.sourceInformation(startRestartGroup, "");
                if (formatDate$material3_release$default == null) {
                    int m1765unboximpl3 = stateData$material3_release.getDisplayMode().getValue().m1765unboximpl();
                    if (DisplayMode.m1762equalsimpl0(m1765unboximpl3, DisplayMode.Companion.m1767getPickerjFl4v0())) {
                        startRestartGroup.startReplaceableGroup(933109281);
                        ComposerKt.sourceInformation(startRestartGroup, "466@21613L37");
                        formatDate$material3_release$default = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2010getDatePickerHeadlineadMyvUU(), startRestartGroup, 6);
                        startRestartGroup.endReplaceableGroup();
                    } else if (DisplayMode.m1762equalsimpl0(m1765unboximpl3, DisplayMode.Companion.m1766getInputjFl4v0())) {
                        startRestartGroup.startReplaceableGroup(933109356);
                        ComposerKt.sourceInformation(startRestartGroup, "467@21688L36");
                        formatDate$material3_release$default = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2002getDateInputHeadlineadMyvUU(), startRestartGroup, 6);
                        startRestartGroup.endReplaceableGroup();
                    } else {
                        startRestartGroup.startReplaceableGroup(-1138379145);
                        startRestartGroup.endReplaceableGroup();
                        formatDate$material3_release$default = "";
                    }
                }
                startRestartGroup.endReplaceableGroup();
                m1765unboximpl = stateData$material3_release.getDisplayMode().getValue().m1765unboximpl();
                if (!DisplayMode.m1762equalsimpl0(m1765unboximpl, DisplayMode.Companion.m1767getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(933109538);
                    ComposerKt.sourceInformation(startRestartGroup, "472@21870L48");
                    str = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2011getDatePickerHeadlineDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1762equalsimpl0(m1765unboximpl, DisplayMode.Companion.m1766getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(933109624);
                    ComposerKt.sourceInformation(startRestartGroup, "473@21956L47");
                    str = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2003getDateInputHeadlineDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-1138370496);
                    startRestartGroup.endReplaceableGroup();
                }
                String format = String.format(str, Arrays.copyOf(new Object[]{formatDate$material3_release}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(format);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DatePickerDefaults$DatePickerHeadline$1$1$1(format);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
                obj = companion;
                TextKt.m2145Text4IGK_g(formatDate$material3_release$default, semantics$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, (int) CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 122876);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            Modifier modifier2 = obj;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new DatePickerDefaults$DatePickerHeadline$2(this, state, dateFormatter, modifier2, i, i2));
            return;
        }
        obj = modifier;
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        StateData stateData$material3_release2 = state.getStateData$material3_release();
        Locale defaultLocale2 = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
        formatDate$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(dateFormatter, stateData$material3_release2.getSelectedStartDate().getValue(), stateData$material3_release2.getCalendarModel(), defaultLocale2, false, 8, null);
        formatDate$material3_release = dateFormatter.formatDate$material3_release(stateData$material3_release2.getSelectedStartDate().getValue(), stateData$material3_release2.getCalendarModel(), defaultLocale2, true);
        startRestartGroup.startReplaceableGroup(729783869);
        String str2 = "";
        ComposerKt.sourceInformation(startRestartGroup, "");
        if (formatDate$material3_release == null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(729784366);
        ComposerKt.sourceInformation(startRestartGroup, "");
        if (formatDate$material3_release$default == null) {
        }
        startRestartGroup.endReplaceableGroup();
        m1765unboximpl = stateData$material3_release2.getDisplayMode().getValue().m1765unboximpl();
        if (!DisplayMode.m1762equalsimpl0(m1765unboximpl, DisplayMode.Companion.m1767getPickerjFl4v0())) {
        }
        String format2 = String.format(str2, Arrays.copyOf(new Object[]{formatDate$material3_release}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(this, *args)");
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(format2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new DatePickerDefaults$DatePickerHeadline$1$1$1(format2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default2 = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
        obj = companion;
        TextKt.m2145Text4IGK_g(formatDate$material3_release$default, semantics$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, (int) CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 122876);
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier22 = obj;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public final FlingBehavior rememberSnapFlingBehavior$material3_release(LazyListState lazyListState, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-2036003494);
        ComposerKt.sourceInformation(composer, "C(rememberSnapFlingBehavior)P(1)500@22875L7,501@22898L295:DatePicker.kt#uh7d8r");
        if ((i2 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:496)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapFlingBehavior(lazyListState, decayAnimationSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior;
    }

    public final IntRange getYearRange() {
        return YearRange;
    }

    /* renamed from: getTonalElevation-D9Ej5fM  reason: not valid java name */
    public final float m1735getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(700927667);
        ComposerKt.sourceInformation(composer, "C518@23583L9:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:518)");
        }
        Shape shape = ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }
}
