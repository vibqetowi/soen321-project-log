package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0081\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016¢\u0006\u0002\b\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010\u001c\u001a9\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010 \u001a9\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\"\u001ad\u0010#\u001a\u00020\n2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010*\u001a.\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u000b\u001a\u00020)2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002\u001aM\u00103\u001a\u00020\f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0018\u0010=\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0013H\u0002\u001a)\u0010>\u001a\u00020\n*\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerHeadlinePadding", "DateRangePickerTitlePadding", "HeaderHeightOffset", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangePicker", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerContent", "stateData", "Landroidx/compose/material3/StateData;", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "SwitchableDateEntryContent", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalMonthsList", "onDateSelected", "Lkotlin/ParameterName;", "name", "dateInMillis", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/StateData;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "", "scrollDownLabel", "rememberDateRangePickerState", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "rememberDateRangePickerState-pMw4iz8", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "updateDateSelection", "drawRangeBackground", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "selectedRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "color", "Landroidx/compose/ui/graphics/Color;", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerKt {
    private static final PaddingValues DateRangePickerHeadlinePadding;
    private static final PaddingValues DateRangePickerTitlePadding;
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m745PaddingValuesa9UjIt4$default(Dp.m5607constructorimpl(24), Dp.m5607constructorimpl(20), 0.0f, Dp.m5607constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = Dp.m5607constructorimpl(60);

    /* JADX WARN: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateRangePicker(DateRangePickerState state, Modifier modifier, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, DatePickerColors datePickerColors, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        int i6;
        Object obj3;
        int i7;
        Object obj4;
        int i8;
        Modifier.Companion companion;
        DateRangePickerKt$DateRangePicker$2 dateRangePickerKt$DateRangePicker$2;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        boolean z2;
        int i9;
        DatePickerColors m1734colors1m2CgY;
        boolean z3;
        ComposableLambda composableLambda3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function24;
        DatePickerColors datePickerColors2;
        Modifier modifier2;
        int i10;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-1835392055);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePicker)P(6,4,1,2,7,3,5)87@4128L34,103@4743L8,124@5421L10,105@4760L1103:DateRangePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = datePickerFormatter;
                i3 |= startRestartGroup.changed(obj) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
                } else if ((i & 7168) == 0) {
                    obj2 = function1;
                    i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        obj3 = function2;
                        i3 |= startRestartGroup.changedInstance(obj3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((458752 & i) == 0) {
                            obj4 = function22;
                            i3 |= startRestartGroup.changedInstance(obj4) ? 131072 : 65536;
                            i8 = i2 & 64;
                            if (i8 == 0) {
                                i3 |= 1572864;
                            } else if ((i & 3670016) == 0) {
                                i3 |= startRestartGroup.changed(z) ? 1048576 : 524288;
                            }
                            if ((i & 29360128) == 0) {
                                if ((i2 & 128) == 0 && startRestartGroup.changed(datePickerColors)) {
                                    i10 = 8388608;
                                    i3 |= i10;
                                }
                                i10 = 4194304;
                                i3 |= i10;
                            }
                            if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i11 == 0 ? Modifier.Companion : modifier;
                                    if (i4 != 0) {
                                        startRestartGroup.startReplaceableGroup(-492369756);
                                        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        obj = (DatePickerFormatter) rememberedValue;
                                    }
                                    dateRangePickerKt$DateRangePicker$2 = i5 == 0 ? DateRangePickerKt$DateRangePicker$2.INSTANCE : obj2;
                                    composableLambda = i6 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, 492752701, true, new DateRangePickerKt$DateRangePicker$3(state, i3)) : obj3;
                                    composableLambda2 = i7 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -204181785, true, new DateRangePickerKt$DateRangePicker$4(state, obj, i3)) : function22;
                                    z2 = i8 == 0 ? true : z;
                                    if ((i2 & 128) == 0) {
                                        i9 = i3 & (-29360129);
                                        m1734colors1m2CgY = DatePickerDefaults.INSTANCE.m1734colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, C.ENCODING_PCM_32BIT, 524287);
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1835392055, i9, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                                        }
                                        if (z2) {
                                            z3 = true;
                                            composableLambda3 = null;
                                        } else {
                                            z3 = true;
                                            composableLambda3 = ComposableLambdaKt.composableLambda(startRestartGroup, -1062265737, true, new DateRangePickerKt$DateRangePicker$5(state, i9));
                                        }
                                        TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont());
                                        float m5607constructorimpl = Dp.m5607constructorimpl(DatePickerModalTokens.INSTANCE.m2386getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset);
                                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(startRestartGroup, -186850856, z3, new DateRangePickerKt$DateRangePicker$6(state, obj, dateRangePickerKt$DateRangePicker$2, m1734colors1m2CgY, i9));
                                        int i12 = i9 >> 9;
                                        DatePickerKt.m1737DateEntryContainerau3_HiA(companion, composableLambda, composableLambda2, composableLambda3, m1734colors1m2CgY, fromToken, m5607constructorimpl, composableLambda4, startRestartGroup, ((i9 >> 3) & 14) | 14155776 | (i12 & 112) | (i12 & 896) | (i12 & 57344));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function23 = composableLambda;
                                        function24 = composableLambda2;
                                        datePickerColors2 = m1734colors1m2CgY;
                                        modifier2 = companion;
                                    } else {
                                        i9 = i3;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    companion = modifier;
                                    composableLambda2 = function22;
                                    z2 = z;
                                    i9 = i3;
                                    dateRangePickerKt$DateRangePicker$2 = obj2;
                                    composableLambda = obj3;
                                }
                                m1734colors1m2CgY = datePickerColors;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (z2) {
                                }
                                TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont());
                                float m5607constructorimpl2 = Dp.m5607constructorimpl(DatePickerModalTokens.INSTANCE.m2386getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset);
                                ComposableLambda composableLambda42 = ComposableLambdaKt.composableLambda(startRestartGroup, -186850856, z3, new DateRangePickerKt$DateRangePicker$6(state, obj, dateRangePickerKt$DateRangePicker$2, m1734colors1m2CgY, i9));
                                int i122 = i9 >> 9;
                                DatePickerKt.m1737DateEntryContainerau3_HiA(companion, composableLambda, composableLambda2, composableLambda3, m1734colors1m2CgY, fromToken2, m5607constructorimpl2, composableLambda42, startRestartGroup, ((i9 >> 3) & 14) | 14155776 | (i122 & 112) | (i122 & 896) | (i122 & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function23 = composableLambda;
                                function24 = composableLambda2;
                                datePickerColors2 = m1734colors1m2CgY;
                                modifier2 = companion;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                z2 = z;
                                datePickerColors2 = datePickerColors;
                                dateRangePickerKt$DateRangePicker$2 = obj2;
                                function23 = obj3;
                                function24 = obj4;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new DateRangePickerKt$DateRangePicker$7(state, modifier2, obj, dateRangePickerKt$DateRangePicker$2, function23, function24, z2, datePickerColors2, i, i2));
                            return;
                        }
                        obj4 = function22;
                        i8 = i2 & 64;
                        if (i8 == 0) {
                        }
                        if ((i & 29360128) == 0) {
                        }
                        if ((i3 & 23967451) == 4793490) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                    }
                    obj3 = function2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    obj4 = function22;
                    i8 = i2 & 64;
                    if (i8 == 0) {
                    }
                    if ((i & 29360128) == 0) {
                    }
                    if ((i3 & 23967451) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                }
                obj2 = function1;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                obj3 = function2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                obj4 = function22;
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i3 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
            }
            obj = datePickerFormatter;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            obj2 = function1;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            obj3 = function2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            obj4 = function22;
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        obj = datePickerFormatter;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        obj2 = function1;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        obj3 = function2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        obj4 = function22;
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
    }

    /* renamed from: rememberDateRangePickerState-pMw4iz8  reason: not valid java name */
    public static final DateRangePickerState m1746rememberDateRangePickerStatepMw4iz8(Long l, Long l2, Long l3, IntRange intRange, int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(501019096);
        ComposerKt.sourceInformation(composer, "C(rememberDateRangePickerState)P(3,2,1,4,0:c#material3.DisplayMode)164@7390L384:DateRangePicker.kt#uh7d8r");
        Long l4 = (i3 & 1) != 0 ? null : l;
        Long l5 = (i3 & 2) != 0 ? null : l2;
        Long l6 = (i3 & 4) != 0 ? l4 : l3;
        IntRange yearRange = (i3 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        int m1767getPickerjFl4v0 = (i3 & 16) != 0 ? DisplayMode.Companion.m1767getPickerjFl4v0() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(501019096, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:157)");
        }
        DateRangePickerState dateRangePickerState = (DateRangePickerState) RememberSaveableKt.m2907rememberSaveable(new Object[0], DateRangePickerState.Companion.Saver(), (String) null, (Function0<? extends Object>) new DateRangePickerKt$rememberDateRangePickerState$1(l4, l5, l6, yearRange, m1767getPickerjFl4v0), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dateRangePickerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchableDateEntryContent(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(984055784);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchableDateEntryContent)P(3,1,2)455@19358L648:DateRangePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984055784, i3, -1, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:447)");
            }
            int m1749getDisplayModejFl4v0 = dateRangePickerState.m1749getDisplayModejFl4v0();
            CrossfadeKt.Crossfade(DisplayMode.m1759boximpl(m1749getDisplayModejFl4v0), SemanticsModifierKt.semantics$default(Modifier.Companion, false, DateRangePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1354418636, true, new DateRangePickerKt$SwitchableDateEntryContent$2(dateRangePickerState, datePickerFormatter, function1, datePickerColors, i3)), startRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DateRangePickerKt$SwitchableDateEntryContent$3(dateRangePickerState, datePickerFormatter, function1, datePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DateRangePickerContent(StateData stateData, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1003501610);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePickerContent)P(3,1,2)485@20269L105,489@20401L82,492@20488L412:DateRangePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(stateData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1003501610, i2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:478)");
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(stateData.getDisplayedMonthIndex(), 0, startRestartGroup, 0, 2);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(stateData);
            DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DateRangePickerKt$DateRangePickerContent$onDateSelected$1$1(stateData);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Function1 function12 = (Function1) rememberedValue;
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m750paddingVpY3zN4$default);
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
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1265369378, "C493@20576L41,494@20626L268:DateRangePicker.kt#uh7d8r");
            DatePickerKt.WeekDays(datePickerColors, stateData.getCalendarModel(), startRestartGroup, (i2 >> 9) & 14);
            int i3 = i2 << 6;
            VerticalMonthsList(function12, stateData, rememberLazyListState, datePickerFormatter, function1, datePickerColors, startRestartGroup, ((i2 << 3) & 112) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DateRangePickerKt$DateRangePickerContent$2(stateData, datePickerFormatter, function1, datePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalMonthsList(Function1<? super Long, Unit> function1, StateData stateData, LazyListState lazyListState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function12, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-837198453);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalMonthsList)P(4,5,3,1,2)520@21434L168,527@21647L10,526@21607L2599,584@24241L62,584@24211L92:DateRangePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(stateData) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(datePickerFormatter) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-837198453, i3, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:511)");
            }
            CalendarDate today = stateData.getCalendarModel().getToday();
            IntRange yearRange = stateData.getYearRange();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(yearRange);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = stateData.getCalendarModel().getMonth(stateData.getYearRange().getFirst(), 1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont()), ComposableLambdaKt.composableLambda(startRestartGroup, 56792252, true, new DateRangePickerKt$VerticalMonthsList$1(lazyListState, i3, stateData, (CalendarMonth) rememberedValue, datePickerFormatter, datePickerColors, function1, today, function12)), startRestartGroup, 48);
            int i4 = (i3 >> 6) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(lazyListState) | startRestartGroup.changed(stateData);
            DateRangePickerKt$VerticalMonthsList$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState, stateData, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (Function2) rememberedValue2, startRestartGroup, i4 | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DateRangePickerKt$VerticalMonthsList$3(function1, stateData, lazyListState, datePickerFormatter, function12, datePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(StateData stateData, long j) {
        CalendarDate canonicalDate = stateData.getCalendarModel().getCanonicalDate(j);
        CalendarDate value = stateData.getSelectedStartDate().getValue();
        CalendarDate value2 = stateData.getSelectedEndDate().getValue();
        if ((value == null && value2 == null) || ((value != null && value2 != null) || (value != null && canonicalDate.compareTo(value) < 0))) {
            stateData.getSelectedStartDate().setValue(canonicalDate);
            stateData.getSelectedEndDate().setValue(null);
        } else if (value == null || canonicalDate.compareTo(value) < 0) {
        } else {
            stateData.getSelectedEndDate().setValue(canonicalDate);
        }
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* renamed from: drawRangeBackground-mxwnekA  reason: not valid java name */
    public static final void m1745drawRangeBackgroundmxwnekA(ContentDrawScope drawRangeBackground, SelectedRangeInfo selectedRangeInfo, long j) {
        float m3087getWidthimpl;
        Intrinsics.checkNotNullParameter(drawRangeBackground, "$this$drawRangeBackground");
        Intrinsics.checkNotNullParameter(selectedRangeInfo, "selectedRangeInfo");
        float f = drawRangeBackground.mo588toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f2 = drawRangeBackground.mo588toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f3 = drawRangeBackground.mo588toPx0680j_4(DatePickerModalTokens.INSTANCE.m2379getDateStateLayerHeightD9Ej5fM());
        float f4 = 2;
        float f5 = (f2 - f3) / f4;
        float f6 = 7;
        float m3087getWidthimpl2 = (Size.m3087getWidthimpl(drawRangeBackground.mo3762getSizeNHjbRc()) - (f6 * f)) / f6;
        long m5734unboximpl = selectedRangeInfo.getGridCoordinates().getFirst().m5734unboximpl();
        int m5717component1impl = IntOffset.m5717component1impl(m5734unboximpl);
        int m5718component2impl = IntOffset.m5718component2impl(m5734unboximpl);
        long m5734unboximpl2 = selectedRangeInfo.getGridCoordinates().getSecond().m5734unboximpl();
        int m5717component1impl2 = IntOffset.m5717component1impl(m5734unboximpl2);
        int m5718component2impl2 = IntOffset.m5718component2impl(m5734unboximpl2);
        float f7 = f + m3087getWidthimpl2;
        float f8 = m3087getWidthimpl2 / f4;
        float f9 = (m5717component1impl * f7) + (selectedRangeInfo.getFirstIsSelectionStart() ? f / f4 : 0.0f) + f8;
        float f10 = (m5718component2impl * f2) + f5;
        float f11 = m5717component1impl2 * f7;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            f /= f4;
        }
        float f12 = f11 + f + f8;
        float f13 = (m5718component2impl2 * f2) + f5;
        boolean z = drawRangeBackground.getLayoutDirection() == LayoutDirection.Rtl;
        if (z) {
            f9 = Size.m3087getWidthimpl(drawRangeBackground.mo3762getSizeNHjbRc()) - f9;
            f12 = Size.m3087getWidthimpl(drawRangeBackground.mo3762getSizeNHjbRc()) - f12;
        }
        ContentDrawScope contentDrawScope = drawRangeBackground;
        long Offset = OffsetKt.Offset(f9, f10);
        if (m5718component2impl == m5718component2impl2) {
            m3087getWidthimpl = f12 - f9;
        } else {
            m3087getWidthimpl = z ? -f9 : Size.m3087getWidthimpl(drawRangeBackground.mo3762getSizeNHjbRc()) - f9;
        }
        DrawScope.CC.m3842drawRectnJ9OG0$default(contentDrawScope, j, Offset, SizeKt.Size(m3087getWidthimpl, f3), 0.0f, null, null, 0, 120, null);
        if (m5718component2impl != m5718component2impl2) {
            for (int i = (m5718component2impl2 - m5718component2impl) - 1; i > 0; i--) {
                DrawScope.CC.m3842drawRectnJ9OG0$default(contentDrawScope, j, OffsetKt.Offset(0.0f, (i * f2) + f10), SizeKt.Size(Size.m3087getWidthimpl(drawRangeBackground.mo3762getSizeNHjbRc()), f3), 0.0f, null, null, 0, 120, null);
            }
            long Offset2 = OffsetKt.Offset(drawRangeBackground.getLayoutDirection() != LayoutDirection.Ltr ? Size.m3087getWidthimpl(drawRangeBackground.mo3762getSizeNHjbRc()) : 0.0f, f13);
            if (z) {
                f12 -= Size.m3087getWidthimpl(drawRangeBackground.mo3762getSizeNHjbRc());
            }
            DrawScope.CC.m3842drawRectnJ9OG0$default(contentDrawScope, j, Offset2, SizeKt.Size(f12, f3), 0.0f, null, null, 0, 120, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new DateRangePickerKt$customScrollActions$scrollUpAction$1(lazyListState, coroutineScope)), new CustomAccessibilityAction(str2, new DateRangePickerKt$customScrollActions$scrollDownAction$1(lazyListState, coroutineScope))});
    }

    static {
        float f = 64;
        float f2 = 12;
        DateRangePickerTitlePadding = PaddingKt.m745PaddingValuesa9UjIt4$default(Dp.m5607constructorimpl(f), 0.0f, Dp.m5607constructorimpl(f2), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m745PaddingValuesa9UjIt4$default(Dp.m5607constructorimpl(f), 0.0f, Dp.m5607constructorimpl(f2), Dp.m5607constructorimpl(f2), 2, null);
    }
}
