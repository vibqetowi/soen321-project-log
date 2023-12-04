package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJn\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\u00112\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\u00112\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "()V", "DateRangePickerHeadline", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "startDateText", "", "endDateText", "startDatePlaceholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "endDatePlaceholder", "datesDelimiter", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DateRangePickerTitle", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerDefaults {
    public static final int $stable = 0;
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    private DateRangePickerDefaults() {
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
    public final void DateRangePickerTitle(DateRangePickerState state, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int m1749getDisplayModejFl4v0;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(499073135);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePickerTitle)P(1):DateRangePicker.kt#uh7d8r");
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
                    ComposerKt.traceEventStart(499073135, i4, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:302)");
                }
                m1749getDisplayModejFl4v0 = state.m1749getDisplayModejFl4v0();
                if (!DisplayMode.m1762equalsimpl0(m1749getDisplayModejFl4v0, DisplayMode.Companion.m1767getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(585814427);
                    ComposerKt.sourceInformation(startRestartGroup, "308@13262L48,307@13240L121");
                    TextKt.m2145Text4IGK_g(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2032getDateRangePickerTitleadMyvUU(), startRestartGroup, 6), companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, i4 & 112, 0, 131068);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1762equalsimpl0(m1749getDisplayModejFl4v0, DisplayMode.Companion.m1766getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(585814583);
                    ComposerKt.sourceInformation(startRestartGroup, "313@13418L47,312@13396L120");
                    TextKt.m2145Text4IGK_g(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2026getDateRangeInputTitleadMyvUU(), startRestartGroup, 6), companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, i4 & 112, 0, 131068);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(585814713);
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
            endRestartGroup.updateScope(new DateRangePickerDefaults$DateRangePickerTitle$1(this, state, modifier2, i, i2));
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
        m1749getDisplayModejFl4v0 = state.m1749getDisplayModejFl4v0();
        if (!DisplayMode.m1762equalsimpl0(m1749getDisplayModejFl4v0, DisplayMode.Companion.m1767getPickerjFl4v0())) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DateRangePickerHeadline(DateRangePickerState state, DatePickerFormatter dateFormatter, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Composer startRestartGroup = composer.startRestartGroup(-332090137);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePickerHeadline)P(2)333@14138L47,334@14212L45,335@14266L400:DateRangePicker.kt#uh7d8r");
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
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(this) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-332090137, i3, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:328)");
                }
                String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2031getDateRangePickerStartHeadlineadMyvUU(), startRestartGroup, 6);
                String m2058getStringNWtq282 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2028getDateRangePickerEndHeadlineadMyvUU(), startRestartGroup, 6);
                DateRangePickerHeadline(state, dateFormatter, companion, m2058getStringNWtq28, m2058getStringNWtq282, ComposableLambdaKt.composableLambda(startRestartGroup, -1382084760, true, new DateRangePickerDefaults$DateRangePickerHeadline$1(m2058getStringNWtq28)), ComposableLambdaKt.composableLambda(startRestartGroup, -199852025, true, new DateRangePickerDefaults$DateRangePickerHeadline$2(m2058getStringNWtq282)), ComposableSingletons$DateRangePickerKt.INSTANCE.m1709getLambda1$material3_release(), startRestartGroup, 14352384 | (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 << 15) & 234881024));
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
            endRestartGroup.updateScope(new DateRangePickerDefaults$DateRangePickerHeadline$3(this, state, dateFormatter, modifier2, i, i2));
            return;
        }
        obj = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        String m2058getStringNWtq283 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2031getDateRangePickerStartHeadlineadMyvUU(), startRestartGroup, 6);
        String m2058getStringNWtq2822 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2028getDateRangePickerEndHeadlineadMyvUU(), startRestartGroup, 6);
        DateRangePickerHeadline(state, dateFormatter, companion, m2058getStringNWtq283, m2058getStringNWtq2822, ComposableLambdaKt.composableLambda(startRestartGroup, -1382084760, true, new DateRangePickerDefaults$DateRangePickerHeadline$1(m2058getStringNWtq283)), ComposableLambdaKt.composableLambda(startRestartGroup, -199852025, true, new DateRangePickerDefaults$DateRangePickerHeadline$2(m2058getStringNWtq2822)), ComposableSingletons$DateRangePickerKt.INSTANCE.m1709getLambda1$material3_release(), startRestartGroup, 14352384 | (i3 & 14) | (i3 & 112) | (i3 & 896) | ((i3 << 15) & 234881024));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DateRangePickerHeadline(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-861159957);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePickerHeadline)P(7!1,4,6,3,5,2)*379@16359L15,418@18064L168,417@18002L796:DateRangePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861159957, i3, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:368)");
            }
            StateData stateData$material3_release = dateRangePickerState.getStateData$material3_release();
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
            String formatDate$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData$material3_release.getSelectedStartDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, false, 8, null);
            String formatDate$material3_release$default2 = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData$material3_release.getSelectedEndDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, false, 8, null);
            String formatDate$material3_release = datePickerFormatter.formatDate$material3_release(stateData$material3_release.getSelectedStartDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, true);
            startRestartGroup.startReplaceableGroup(-1212634278);
            String str3 = "";
            ComposerKt.sourceInformation(startRestartGroup, "");
            if (formatDate$material3_release == null) {
                int m1765unboximpl = stateData$material3_release.getDisplayMode().getValue().m1765unboximpl();
                if (DisplayMode.m1762equalsimpl0(m1765unboximpl, DisplayMode.Companion.m1767getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096411);
                    ComposerKt.sourceInformation(startRestartGroup, "398@17129L51");
                    formatDate$material3_release = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2013getDatePickerNoSelectionDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1762equalsimpl0(m1765unboximpl, DisplayMode.Companion.m1766getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096500);
                    ComposerKt.sourceInformation(startRestartGroup, "399@17218L46");
                    formatDate$material3_release = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2008getDateInputNoInputDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-544548443);
                    startRestartGroup.endReplaceableGroup();
                    formatDate$material3_release = "";
                }
            }
            startRestartGroup.endReplaceableGroup();
            String formatDate$material3_release2 = datePickerFormatter.formatDate$material3_release(stateData$material3_release.getSelectedEndDate().getValue(), stateData$material3_release.getCalendarModel(), defaultLocale, true);
            startRestartGroup.startReplaceableGroup(-1212633768);
            ComposerKt.sourceInformation(startRestartGroup, "");
            if (formatDate$material3_release2 == null) {
                int m1765unboximpl2 = stateData$material3_release.getDisplayMode().getValue().m1765unboximpl();
                if (DisplayMode.m1762equalsimpl0(m1765unboximpl2, DisplayMode.Companion.m1767getPickerjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922096919);
                    ComposerKt.sourceInformation(startRestartGroup, "409@17637L51");
                    str3 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2013getDatePickerNoSelectionDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1762equalsimpl0(m1765unboximpl2, DisplayMode.Companion.m1766getInputjFl4v0())) {
                    startRestartGroup.startReplaceableGroup(1922097008);
                    ComposerKt.sourceInformation(startRestartGroup, "410@17726L46");
                    str3 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2008getDateInputNoInputDescriptionadMyvUU(), startRestartGroup, 6);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    startRestartGroup.startReplaceableGroup(-544532695);
                    startRestartGroup.endReplaceableGroup();
                }
            } else {
                str3 = formatDate$material3_release2;
            }
            startRestartGroup.endReplaceableGroup();
            String str4 = str + ": " + formatDate$material3_release;
            String str5 = str2 + ": " + str3;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(str4) | startRestartGroup.changed(str5);
            DateRangePickerDefaults$DateRangePickerHeadline$4$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DateRangePickerDefaults$DateRangePickerHeadline$4$1$1(str4, str5);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical m655spacedBy0680j_4 = Arrangement.INSTANCE.m655spacedBy0680j_4(Dp.m5607constructorimpl(4));
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m655spacedBy0680j_4, centerVertically, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(clearAndSetSemantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 990390577, "C430@18586L16:DateRangePicker.kt#uh7d8r");
            if (formatDate$material3_release$default != null) {
                startRestartGroup.startReplaceableGroup(990390609);
                ComposerKt.sourceInformation(startRestartGroup, "426@18452L31");
                composer2 = startRestartGroup;
                TextKt.m2145Text4IGK_g(formatDate$material3_release$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceableGroup(990390686);
                ComposerKt.sourceInformation(composer2, "428@18529L22");
                function2.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                composer2.endReplaceableGroup();
            }
            function23.invoke(composer2, Integer.valueOf((i3 >> 21) & 14));
            if (formatDate$material3_release$default2 != null) {
                composer2.startReplaceableGroup(990390828);
                ComposerKt.sourceInformation(composer2, "432@18671L29");
                TextKt.m2145Text4IGK_g(formatDate$material3_release$default2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(990390903);
                ComposerKt.sourceInformation(composer2, "434@18746L20");
                function22.invoke(composer2, Integer.valueOf((i3 >> 18) & 14));
                composer2.endReplaceableGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DateRangePickerDefaults$DateRangePickerHeadline$5(this, dateRangePickerState, datePickerFormatter, modifier, str, str2, function2, function22, function23, i));
    }
}
