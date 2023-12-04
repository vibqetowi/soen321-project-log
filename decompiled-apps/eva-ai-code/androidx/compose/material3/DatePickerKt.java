package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
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
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: DatePicker.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0087\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0081\u0001\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020(2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010.\u001a9\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u0002012\u0006\u0010'\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u00102\u001a]\u00103\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u00032\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001an\u0010:\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010;\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020\u001d2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0002\u0010C\u001a9\u0010D\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010E\u001a\u00020F2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00140*H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010I\u001ad\u0010J\u001a\u00020\u00142!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u00140*2\u0006\u00100\u001a\u0002012\u0006\u0010O\u001a\u00020P2\u0006\u0010'\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010Q\u001at\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020T2!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0004\u0012\u00020\u00140*2\u0006\u0010?\u001a\u00020U2\u0006\u00100\u001a\u0002012\u0006\u0010V\u001a\u00020,2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010W\u001a_\u0010X\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020,2\u0006\u0010Z\u001a\u00020,2\u0006\u0010[\u001a\u00020,2\u0006\u0010\\\u001a\u00020B2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018H\u0003¢\u0006\u0002\u0010`\u001a9\u0010a\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*2\u0006\u0010\u001c\u001a\u00020\u001dH\u0003¢\u0006\u0002\u0010b\u001a\u001d\u0010c\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010d\u001a\u00020eH\u0001¢\u0006\u0002\u0010f\u001aV\u0010g\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010;\u001a\u00020,2\u0006\u0010h\u001a\u00020,2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010A\u001a\u00020B2\u0006\u0010\u001c\u001a\u00020\u001d2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0002\u0010i\u001aH\u0010j\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162!\u0010k\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(l\u0012\u0004\u0012\u00020\u00140*2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u000201H\u0003¢\u0006\u0002\u0010m\u001a@\u0010n\u001a\u00020\u00142\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010o\u001a\u00020,2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u0019H\u0003¢\u0006\u0002\u0010p\u001a.\u0010q\u001a\b\u0012\u0004\u0012\u00020s0r2\u0006\u0010%\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020B2\u0006\u0010x\u001a\u00020BH\u0002\u001a7\u0010y\u001a\u0004\u0018\u00010B2\u0006\u0010V\u001a\u00020,2\u0006\u0010z\u001a\u00020,2\u0006\u0010{\u001a\u00020,2\u0006\u0010|\u001a\u00020,2\u0006\u0010}\u001a\u00020,H\u0003¢\u0006\u0002\u0010~\u001aH\u0010\u007f\u001a\u00020&2\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010+2\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010\u0082\u0001\u001a\u00030\u0083\u00012\t\b\u0002\u0010\u0084\u0001\u001a\u00020FH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a#\u0010\u0087\u0001\u001a\u00020\u00142\u0006\u0010O\u001a\u00020P2\u0006\u00100\u001a\u000201H\u0080@ø\u0001\u0000¢\u0006\u0003\u0010\u0088\u0001\u001a\r\u0010\u0089\u0001\u001a\u00020B*\u00020\fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\r\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u0005\"\u0019\u0010\u000f\u001a\u00020\u0003X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u0005\"\u000e\u0010\u0011\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u008a\u0001"}, d2 = {"DatePickerHeadlinePadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "getDatePickerHorizontalPadding", "()F", "F", "DatePickerModeTogglePadding", "getDatePickerModeTogglePadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DatePickerTitlePadding", "MaxCalendarRows", "", "MonthYearHeight", "getMonthYearHeight", "RecommendedSizeForAccessibility", "getRecommendedSizeForAccessibility", "YearsInRow", "YearsVerticalPadding", "DateEntryContainer", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "modeToggleButton", "colors", "Landroidx/compose/material3/DatePickerColors;", "headlineTextStyle", "Landroidx/compose/ui/text/TextStyle;", "headerMinHeight", FirebaseAnalytics.Param.CONTENT, "DateEntryContainer-au3_HiA", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DatePicker", "state", "Landroidx/compose/material3/DatePickerState;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "showModeToggle", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DatePickerContent", "stateData", "Landroidx/compose/material3/StateData;", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DatePickerHeader", "titleContentColor", "Landroidx/compose/ui/graphics/Color;", "headlineContentColor", "minHeight", "DatePickerHeader-pc5RIQQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Day", "selected", "onClick", "animateChecked", "enabled", "today", "inRange", "description", "", "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ZZZZLjava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "DisplayModeToggleButton", "displayMode", "Landroidx/compose/material3/DisplayMode;", "onDisplayModeChange", "DisplayModeToggleButton-tER2X8s", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "HorizontalMonthsList", "onDateSelected", "Lkotlin/ParameterName;", "name", "dateInMillis", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/StateData;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "Month", "month", "Landroidx/compose/material3/CalendarMonth;", "Landroidx/compose/material3/CalendarDate;", "rangeSelectionEnabled", "(Landroidx/compose/material3/CalendarMonth;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/StateData;ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "MonthsNavigation", "nextAvailable", "previousAvailable", "yearPickerVisible", "yearPickerText", "onNextClicked", "onPreviousClicked", "onYearPickerButtonClicked", "(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SwitchableDateEntryContent", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "WeekDays", "calendarModel", "Landroidx/compose/material3/CalendarModel;", "(Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/CalendarModel;Landroidx/compose/runtime/Composer;I)V", "Year", "currentYear", "(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "YearPicker", "onYearSelected", "year", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/material3/StateData;Landroidx/compose/runtime/Composer;I)V", "YearPickerMenuButton", "expanded", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "scrollDownLabel", "dayContentDescription", "isToday", "isStartDate", "isEndDate", "isInRange", "(ZZZZZLandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "rememberDatePickerState", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "rememberDatePickerState-NVmSL94", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DatePickerState;", "updateDisplayedMonth", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/material3/StateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toLocalString", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt {
    private static final PaddingValues DatePickerHeadlinePadding;
    private static final float DatePickerHorizontalPadding;
    private static final PaddingValues DatePickerModeTogglePadding;
    private static final PaddingValues DatePickerTitlePadding;
    private static final int MaxCalendarRows = 6;
    private static final int YearsInRow = 3;
    private static final float YearsVerticalPadding;
    private static final float RecommendedSizeForAccessibility = Dp.m5607constructorimpl(48);
    private static final float MonthYearHeight = Dp.m5607constructorimpl(56);

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
    /* JADX WARN: Removed duplicated region for block: B:137:0x0274  */
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
    public static final void DatePicker(DatePickerState state, Modifier modifier, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, DatePickerColors datePickerColors, Composer composer, int i, int i2) {
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
        DatePickerKt$DatePicker$2 datePickerKt$DatePicker$2;
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
        Composer startRestartGroup = composer.startRestartGroup(-1765097918);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePicker)P(6,4,1,2,7,3,5)152@7324L34,168@7901L8,189@8580L10,170@7918L1043:DatePicker.kt#uh7d8r");
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
                                    datePickerKt$DatePicker$2 = i5 == 0 ? DatePickerKt$DatePicker$2.INSTANCE : obj2;
                                    composableLambda = i6 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, 448469326, true, new DatePickerKt$DatePicker$3(state, i3)) : obj3;
                                    composableLambda2 = i7 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, 1578326756, true, new DatePickerKt$DatePicker$4(state, obj, i3)) : function22;
                                    z2 = i8 == 0 ? true : z;
                                    if ((i2 & 128) == 0) {
                                        i9 = i3 & (-29360129);
                                        m1734colors1m2CgY = DatePickerDefaults.INSTANCE.m1734colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, C.ENCODING_PCM_32BIT, 524287);
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1765097918, i9, -1, "androidx.compose.material3.DatePicker (DatePicker.kt:149)");
                                        }
                                        if (z2) {
                                            z3 = true;
                                            composableLambda3 = null;
                                        } else {
                                            z3 = true;
                                            composableLambda3 = ComposableLambdaKt.composableLambda(startRestartGroup, -1702543532, true, new DatePickerKt$DatePicker$5(state, i9));
                                        }
                                        TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getHeaderHeadlineFont());
                                        float m2382getHeaderContainerHeightD9Ej5fM = DatePickerModalTokens.INSTANCE.m2382getHeaderContainerHeightD9Ej5fM();
                                        ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(startRestartGroup, 173769747, z3, new DatePickerKt$DatePicker$6(state, obj, datePickerKt$DatePicker$2, m1734colors1m2CgY, i9));
                                        int i12 = i9 >> 9;
                                        m1737DateEntryContainerau3_HiA(companion, composableLambda, composableLambda2, composableLambda3, m1734colors1m2CgY, fromToken, m2382getHeaderContainerHeightD9Ej5fM, composableLambda4, startRestartGroup, ((i9 >> 3) & 14) | 14155776 | (i12 & 112) | (i12 & 896) | (i12 & 57344));
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
                                    datePickerKt$DatePicker$2 = obj2;
                                    composableLambda = obj3;
                                }
                                m1734colors1m2CgY = datePickerColors;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (z2) {
                                }
                                TextStyle fromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getHeaderHeadlineFont());
                                float m2382getHeaderContainerHeightD9Ej5fM2 = DatePickerModalTokens.INSTANCE.m2382getHeaderContainerHeightD9Ej5fM();
                                ComposableLambda composableLambda42 = ComposableLambdaKt.composableLambda(startRestartGroup, 173769747, z3, new DatePickerKt$DatePicker$6(state, obj, datePickerKt$DatePicker$2, m1734colors1m2CgY, i9));
                                int i122 = i9 >> 9;
                                m1737DateEntryContainerau3_HiA(companion, composableLambda, composableLambda2, composableLambda3, m1734colors1m2CgY, fromToken2, m2382getHeaderContainerHeightD9Ej5fM2, composableLambda42, startRestartGroup, ((i9 >> 3) & 14) | 14155776 | (i122 & 112) | (i122 & 896) | (i122 & 57344));
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
                                datePickerKt$DatePicker$2 = obj2;
                                function23 = obj3;
                                function24 = obj4;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            endRestartGroup.updateScope(new DatePickerKt$DatePicker$7(state, modifier2, obj, datePickerKt$DatePicker$2, function23, function24, z2, datePickerColors2, i, i2));
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

    /* renamed from: rememberDatePickerState-NVmSL94  reason: not valid java name */
    public static final DatePickerState m1740rememberDatePickerStateNVmSL94(Long l, Long l2, IntRange intRange, int i, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1574672255);
        ComposerKt.sourceInformation(composer, "C(rememberDatePickerState)P(2,1,3,0:c#material3.DisplayMode)224@10177L295:DatePicker.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            l = null;
        }
        if ((i3 & 2) != 0) {
            l2 = l;
        }
        if ((i3 & 4) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i3 & 8) != 0) {
            i = DisplayMode.Companion.m1767getPickerjFl4v0();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1574672255, i2, -1, "androidx.compose.material3.rememberDatePickerState (DatePicker.kt:219)");
        }
        DatePickerState datePickerState = (DatePickerState) RememberSaveableKt.m2907rememberSaveable(new Object[0], DatePickerState.Companion.Saver(), (String) null, (Function0<? extends Object>) new DatePickerKt$rememberDatePickerState$1(l, l2, intRange, i), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerState;
    }

    /* renamed from: DateEntryContainer-au3_HiA  reason: not valid java name */
    public static final void m1737DateEntryContainerau3_HiA(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, DatePickerColors colors, TextStyle headlineTextStyle, float f, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(headlineTextStyle, "headlineTextStyle");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1507356255);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateEntryContainer)P(6,7,3,5!1,4,2:c#ui.unit.Dp)1021@43152L1610:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(colors) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(headlineTextStyle) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507356255, i3, -1, "androidx.compose.material3.DateEntryContainer (DatePicker.kt:1011)");
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(SizeKt.m799sizeInqDBjuR0$default(modifier, DatePickerModalTokens.INSTANCE.m2376getContainerWidthD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, DatePickerKt$DateEntryContainer$1.INSTANCE, 1, null);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(semantics$default);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -916081480, "C1026@43319L1419,1059@44747L9:DatePicker.kt#uh7d8r");
            composer2 = startRestartGroup;
            m1738DatePickerHeaderpc5RIQQ(Modifier.Companion, function2, colors.m1731getTitleContentColor0d7_KjU$material3_release(), colors.m1729getHeadlineContentColor0d7_KjU$material3_release(), f, ComposableLambdaKt.composableLambda(startRestartGroup, -229007058, true, new DatePickerKt$DateEntryContainer$2$1(function22, function23, function2, headlineTextStyle, i3)), composer2, 196614 | (i3 & 112) | ((i3 >> 6) & 57344));
            content.invoke(composer2, Integer.valueOf((i3 >> 21) & 14));
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
        endRestartGroup.updateScope(new DatePickerKt$DateEntryContainer$3(modifier, function2, function22, function23, colors, headlineTextStyle, f, content, i));
    }

    /* renamed from: DisplayModeToggleButton-tER2X8s  reason: not valid java name */
    public static final void m1739DisplayModeToggleButtontER2X8s(Modifier modifier, int i, Function1<? super DisplayMode, Unit> onDisplayModeChange, Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onDisplayModeChange, "onDisplayModeChange");
        Composer startRestartGroup = composer.startRestartGroup(1393846115);
        ComposerKt.sourceInformation(startRestartGroup, "C(DisplayModeToggleButton)P(1,0:c#material3.DisplayMode):DatePicker.kt#uh7d8r");
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onDisplayModeChange) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1393846115, i3, -1, "androidx.compose.material3.DisplayModeToggleButton (DatePicker.kt:1065)");
            }
            if (DisplayMode.m1762equalsimpl0(i, DisplayMode.Companion.m1767getPickerjFl4v0())) {
                startRestartGroup.startReplaceableGroup(-1814971324);
                ComposerKt.sourceInformation(startRestartGroup, "1071@45035L42,1071@45014L262");
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed = startRestartGroup.changed(onDisplayModeChange);
                DatePickerKt$DisplayModeToggleButton$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new DatePickerKt$DisplayModeToggleButton$1$1(onDisplayModeChange);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((Function0) rememberedValue, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1707getLambda1$material3_release(), startRestartGroup, ((i3 << 3) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(-1814971040);
                ComposerKt.sourceInformation(startRestartGroup, "1078@45319L43,1078@45298L271");
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(onDisplayModeChange);
                DatePickerKt$DisplayModeToggleButton$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DatePickerKt$DisplayModeToggleButton$2$1(onDisplayModeChange);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                IconButtonKt.IconButton((Function0) rememberedValue2, modifier, false, null, null, ComposableSingletons$DatePickerKt.INSTANCE.m1708getLambda2$material3_release(), startRestartGroup, ((i3 << 3) & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                startRestartGroup.endReplaceableGroup();
            }
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
        endRestartGroup.updateScope(new DatePickerKt$DisplayModeToggleButton$3(modifier, i, onDisplayModeChange, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwitchableDateEntryContent(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1613036224);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchableDateEntryContent)P(3,1,2)1101@46104L638:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(datePickerState) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(1613036224, i3, -1, "androidx.compose.material3.SwitchableDateEntryContent (DatePicker.kt:1093)");
            }
            int m1743getDisplayModejFl4v0 = datePickerState.m1743getDisplayModejFl4v0();
            CrossfadeKt.Crossfade(DisplayMode.m1759boximpl(m1743getDisplayModejFl4v0), SemanticsModifierKt.semantics$default(Modifier.Companion, false, DatePickerKt$SwitchableDateEntryContent$1.INSTANCE, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1854706084, true, new DatePickerKt$SwitchableDateEntryContent$2(datePickerState, datePickerFormatter, function1, datePickerColors, i3)), startRestartGroup, 24960, 8);
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
        endRestartGroup.updateScope(new DatePickerKt$SwitchableDateEntryContent$3(datePickerState, datePickerFormatter, function1, datePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent(StateData stateData, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1512850300);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerContent)P(3,1,2)1131@47000L83,1132@47109L24,1134@47160L140,1139@47331L42,1140@47398L15,1141@47418L4106:DatePicker.kt#uh7d8r");
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
        int i3 = i2;
        if ((i3 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1512850300, i3, -1, "androidx.compose.material3.DatePickerContent (DatePicker.kt:1124)");
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(stateData.getDisplayedMonthIndex(), 0, startRestartGroup, 0, 2);
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(stateData);
            DatePickerKt$DatePickerContent$onDateSelected$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DatePickerKt$DatePickerContent$onDateSelected$1$1(stateData);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Function1 function12 = (Function1) rememberedValue2;
            MutableState mutableState = (MutableState) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) DatePickerKt$DatePickerContent$yearPickerVisible$2.INSTANCE, startRestartGroup, 3080, 6);
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(Modifier.Companion);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -269675982, "C1166@48484L42,1142@47435L1101,1169@48546L2972:DatePicker.kt#uh7d8r");
            float f = DatePickerHorizontalPadding;
            Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, f, 0.0f, 2, null);
            boolean canScrollForward = rememberLazyListState.getCanScrollForward();
            boolean canScrollBackward = rememberLazyListState.getCanScrollBackward();
            boolean DatePickerContent$lambda$5 = DatePickerContent$lambda$5(mutableState);
            String formatMonthYear$material3_release = datePickerFormatter.formatMonthYear$material3_release(stateData.getDisplayedMonth(), stateData.getCalendarModel(), defaultLocale);
            if (formatMonthYear$material3_release == null) {
                formatMonthYear$material3_release = "-";
            }
            DatePickerKt$DatePickerContent$1$1 datePickerKt$DatePickerContent$1$1 = new DatePickerKt$DatePickerContent$1$1(coroutineScope, rememberLazyListState);
            DatePickerKt$DatePickerContent$1$2 datePickerKt$DatePickerContent$1$2 = new DatePickerKt$DatePickerContent$1$2(coroutineScope, rememberLazyListState);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(mutableState);
            DatePickerKt$DatePickerContent$1$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DatePickerKt$DatePickerContent$1$3$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            MonthsNavigation(m750paddingVpY3zN4$default, canScrollForward, canScrollBackward, DatePickerContent$lambda$5, formatMonthYear$material3_release, datePickerKt$DatePickerContent$1$1, datePickerKt$DatePickerContent$1$2, (Function0) rememberedValue3, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629305, "C72@3384L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1767568956, "C1170@48564L494,1181@49098L2410:DatePicker.kt#uh7d8r");
            Modifier m750paddingVpY3zN4$default2 = PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, f, 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density3 = (Density) consume7;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume8 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume9 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m750paddingVpY3zN4$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl3 = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl3, columnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl3, density3, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl3, layoutDirection3, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl3, viewConfiguration3, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1247374525, "C1171@48660L41,1172@48718L326:DatePicker.kt#uh7d8r");
            WeekDays(datePickerColors, stateData.getCalendarModel(), startRestartGroup, (i3 >> 9) & 14);
            int i4 = i3 << 6;
            HorizontalMonthsList(function12, stateData, rememberLazyListState, datePickerFormatter, function1, datePickerColors, startRestartGroup, ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(DatePickerContent$lambda$5(mutableState), ClipKt.clipToBounds(Modifier.Companion), EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.6f, 1, null)), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 760161496, true, new DatePickerKt$DatePickerContent$1$4$2(datePickerColors, stateData, i3, coroutineScope, mutableState, rememberLazyListState)), composer2, 200112, 16);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DatePickerKt$DatePickerContent$2(stateData, datePickerFormatter, function1, datePickerColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DatePickerContent$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DatePickerContent$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* renamed from: DatePickerHeader-pc5RIQQ  reason: not valid java name */
    public static final void m1738DatePickerHeaderpc5RIQQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-996037719);
        ComposerKt.sourceInformation(startRestartGroup, "C(DatePickerHeader)P(3,4,5:c#ui.graphics.Color,1:c#ui.graphics.Color,2:c#ui.unit.Dp)1243@51983L784:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-996037719, i2, -1, "androidx.compose.material3.DatePickerHeader (DatePicker.kt:1228)");
            }
            if (function2 != null) {
                companion = SizeKt.m780defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, f, 1, null);
            } else {
                companion = Modifier.Companion;
            }
            Modifier then = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null).then(companion);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getStart(), startRestartGroup, 6);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1127524835, "C1262@52647L114:DatePicker.kt#uh7d8r");
            startRestartGroup.startReplaceableGroup(1127524835);
            ComposerKt.sourceInformation(startRestartGroup, "1250@52175L453");
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j))}, ComposableLambdaKt.composableLambda(startRestartGroup, 1005061498, true, new DatePickerKt$DatePickerHeader$1$1(function2, i2)), startRestartGroup, 56);
            }
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(j2))}, content, startRestartGroup, ((i2 >> 12) & 112) | 8);
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
        endRestartGroup.updateScope(new DatePickerKt$DatePickerHeader$2(modifier, function2, j, j2, f, content, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HorizontalMonthsList(Function1<? super Long, Unit> function1, StateData stateData, LazyListState lazyListState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function12, DatePickerColors datePickerColors, Composer composer, int i) {
        Composer composer2;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(1933363608);
        ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalMonthsList)P(4,5,3,1,2)1282@53204L168,1298@53968L40,1299@54015L738,1288@53377L1376,1323@54789L62,1323@54759L92:DatePicker.kt#uh7d8r");
        int i2 = (i & 14) == 0 ? (startRestartGroup.changedInstance(function1) ? 4 : 2) | i : i;
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
                ComposerKt.traceEventStart(1933363608, i3, -1, "androidx.compose.material3.HorizontalMonthsList (DatePicker.kt:1273)");
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
            CalendarMonth calendarMonth = (CalendarMonth) rememberedValue;
            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.Companion, false, DatePickerKt$HorizontalMonthsList$1.INSTANCE, 1, null);
            int i4 = (i3 >> 6) & 14;
            boolean z = false;
            FlingBehavior rememberSnapFlingBehavior$material3_release = DatePickerDefaults.INSTANCE.rememberSnapFlingBehavior$material3_release(lazyListState, null, startRestartGroup, i4 | 384, 2);
            Object[] objArr = {stateData, calendarMonth, function1, today, function12, datePickerFormatter, datePickerColors};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            for (int i5 = 0; i5 < 7; i5++) {
                z |= startRestartGroup.changed(objArr[i5]);
            }
            DatePickerKt$HorizontalMonthsList$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
                rememberedValue2 = new DatePickerKt$HorizontalMonthsList$2$1(stateData, calendarMonth, function1, today, function12, datePickerFormatter, datePickerColors, i3);
                composer2.updateRememberedValue(rememberedValue2);
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            composer3 = composer2;
            LazyDslKt.LazyRow(semantics$default, lazyListState, null, false, null, null, rememberSnapFlingBehavior$material3_release, false, (Function1) rememberedValue2, composer3, (i3 >> 3) & 112, TsExtractor.TS_PACKET_SIZE);
            composer3.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer3, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = composer3.changed(lazyListState) | composer3.changed(stateData);
            DatePickerKt$HorizontalMonthsList$3$1 rememberedValue3 = composer3.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DatePickerKt$HorizontalMonthsList$3$1(lazyListState, stateData, null);
                composer3.updateRememberedValue(rememberedValue3);
            }
            composer3.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (Function2) rememberedValue3, composer3, i4 | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DatePickerKt$HorizontalMonthsList$4(function1, stateData, lazyListState, datePickerFormatter, function12, datePickerColors, i));
    }

    public static final Object updateDisplayedMonth(final LazyListState lazyListState, final StateData stateData, Continuation<? super Unit> continuation) {
        Object collect = SnapshotStateKt.snapshotFlow(new DatePickerKt$updateDisplayedMonth$2(lazyListState)).collect(new FlowCollector<Integer>() { // from class: androidx.compose.material3.DatePickerKt$updateDisplayedMonth$3
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Integer num, Continuation continuation2) {
                return emit(num.intValue(), continuation2);
            }

            public final Object emit(int i, Continuation<? super Unit> continuation2) {
                int firstVisibleItemIndex = LazyListState.this.getFirstVisibleItemIndex() / 12;
                int firstVisibleItemIndex2 = (LazyListState.this.getFirstVisibleItemIndex() % 12) + 1;
                StateData stateData2 = stateData;
                if (stateData2.getDisplayedMonth().getMonth() != firstVisibleItemIndex2 || stateData2.getDisplayedMonth().getYear() != stateData2.getYearRange().getFirst() + firstVisibleItemIndex) {
                    stateData2.setDisplayedMonth(stateData2.getCalendarModel().getMonth(stateData2.getYearRange().getFirst() + firstVisibleItemIndex, firstVisibleItemIndex2));
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public static final void WeekDays(DatePickerColors colors, CalendarModel calendarModel, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Composer startRestartGroup = composer.startRestartGroup(-1849465391);
        ComposerKt.sourceInformation(startRestartGroup, "C(WeekDays)P(1)1365@56132L1363:DatePicker.kt#uh7d8r");
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(colors) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(calendarModel) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1849465391, i, -1, "androidx.compose.material3.WeekDays (DatePicker.kt:1354)");
            }
            int firstDayOfWeek = calendarModel.getFirstDayOfWeek();
            List<Pair<String, String>> weekdayNames = calendarModel.getWeekdayNames();
            ArrayList arrayList = new ArrayList();
            int i3 = firstDayOfWeek - 1;
            int size = weekdayNames.size();
            for (int i4 = i3; i4 < size; i4++) {
                arrayList.add(weekdayNames.get(i4));
            }
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList.add(weekdayNames.get(i5));
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(colors.m1733getWeekdayContentColor0d7_KjU$material3_release()))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1445541615, true, new DatePickerKt$WeekDays$1(arrayList)), startRestartGroup, 56);
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
        endRestartGroup.updateScope(new DatePickerKt$WeekDays$2(colors, calendarModel, i));
    }

    public static final void Month(CalendarMonth month, Function1<? super Long, Unit> onDateSelected, CalendarDate today, StateData stateData, boolean z, Function1<? super Long, Boolean> dateValidator, DatePickerFormatter dateFormatter, DatePickerColors colors, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Composer composer2;
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(onDateSelected, "onDateSelected");
        Intrinsics.checkNotNullParameter(today, "today");
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1561090804);
        ComposerKt.sourceInformation(startRestartGroup, "C(Month)P(3,4,7,6,5,2,1)1414@57986L377,1439@58703L15,1443@58865L10,1442@58825L5037:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(month) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onDateSelected) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(today) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(stateData) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(dateValidator) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(dateFormatter) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(colors) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1561090804, i3, -1, "androidx.compose.material3.Month (DatePicker.kt:1404)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new DatePickerKt$Month$rangeSelectionInfo$1$1(z, month, stateData));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            State state = (State) rememberedValue;
            startRestartGroup.startReplaceableGroup(-2019479227);
            ComposerKt.sourceInformation(startRestartGroup, "1429@58464L177");
            if (z) {
                Modifier.Companion companion2 = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(state) | startRestartGroup.changed(colors);
                DatePickerKt$Month$rangeSelectionDrawModifier$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new DatePickerKt$Month$rangeSelectionDrawModifier$1$1(state, colors);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                companion = DrawModifierKt.drawWithContent(companion2, (Function1) rememberedValue2);
            } else {
                companion = Modifier.Companion;
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getDateLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, -1776200645, true, new DatePickerKt$Month$1(companion, month, today, stateData.getSelectedStartDate(), stateData.getSelectedEndDate(), z, i3, dateFormatter, CalendarModel_androidKt.defaultLocale(startRestartGroup, 0), onDateSelected, colors, stateData, dateValidator)), composer2, 48);
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
        endRestartGroup.updateScope(new DatePickerKt$Month$2(month, onDateSelected, today, stateData, z, dateValidator, dateFormatter, colors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dayContentDescription(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Composer composer, int i) {
        composer.startReplaceableGroup(502032503);
        ComposerKt.sourceInformation(composer, "C(dayContentDescription)P(4,3,2)1563@64712L54:DatePicker.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(502032503, i, -1, "androidx.compose.material3.dayContentDescription (DatePicker.kt:1538)");
        }
        StringBuilder sb = new StringBuilder();
        composer.startReplaceableGroup(-852204210);
        ComposerKt.sourceInformation(composer, "");
        if (z) {
            if (z3) {
                composer.startReplaceableGroup(-852204120);
                ComposerKt.sourceInformation(composer, "1549@64220L56");
                sb.append(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2031getDateRangePickerStartHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z4) {
                composer.startReplaceableGroup(-852203980);
                ComposerKt.sourceInformation(composer, "1553@64360L54");
                sb.append(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2028getDateRangePickerEndHeadlineadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else if (z5) {
                composer.startReplaceableGroup(-852203842);
                ComposerKt.sourceInformation(composer, "1557@64498L53");
                sb.append(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2027getDateRangePickerDayInRangeadMyvUU(), composer, 6));
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-852203741);
                composer.endReplaceableGroup();
            }
        }
        composer.endReplaceableGroup();
        if (z2) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2023getDatePickerTodayDescriptionadMyvUU(), composer, 6));
        }
        String sb2 = sb.length() == 0 ? null : sb.toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Day(Modifier modifier, boolean z, Function0<Unit> function0, boolean z2, boolean z3, boolean z4, boolean z5, String str, DatePickerColors datePickerColors, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1434777861);
        ComposerKt.sourceInformation(startRestartGroup, "C(Day)P(6,8,7!1,4,9,5,3)1594@65783L102,1599@65971L9,1600@66005L129,1605@66172L150,1582@65195L1472:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z4) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if ((1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434777861, i3, -1, "androidx.compose.material3.Day (DatePicker.kt:1570)");
            }
            Modifier m789requiredSizeVpY3zN4 = SizeKt.m789requiredSizeVpY3zN4(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), DatePickerModalTokens.INSTANCE.m2380getDateStateLayerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m2379getDateStateLayerHeightD9Ej5fM());
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(str);
            DatePickerKt$Day$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new DatePickerKt$Day$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(m789requiredSizeVpY3zN4, true, (Function1) rememberedValue);
            Shape shape = ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getDateContainerShape(), startRestartGroup, 6);
            int i4 = i3 >> 3;
            int i5 = i4 & 14;
            int i6 = i3 >> 15;
            long m3301unboximpl = datePickerColors.dayContainerColor$material3_release(z, z3, z2, startRestartGroup, i5 | ((i3 >> 9) & 112) | (i4 & 896) | (i6 & 7168)).getValue().m3301unboximpl();
            int i7 = (i6 & 14) | (i3 & 112);
            int i8 = i3 >> 12;
            int i9 = i4 & 7168;
            composer2 = startRestartGroup;
            SurfaceKt.m2068Surfaced85dljk(z, function0, semantics, z3, shape, m3301unboximpl, datePickerColors.dayContentColor$material3_release(z4, z, z5, z3, startRestartGroup, i7 | (i8 & 896) | i9 | (i8 & 57344)).getValue().m3301unboximpl(), 0.0f, 0.0f, (!z4 || z) ? null : BorderStrokeKt.m448BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m2381getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m1732getTodayDateBorderColor0d7_KjU$material3_release()), (MutableInteractionSource) null, ComposableLambdaKt.composableLambda(startRestartGroup, -2031780827, true, new DatePickerKt$Day$2(function2, i3)), composer2, i5 | (i4 & 112) | i9, 48, 1408);
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
        endRestartGroup.updateScope(new DatePickerKt$Day$3(modifier, z, function0, z2, z3, z4, z5, str, datePickerColors, function2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void YearPicker(Modifier modifier, Function1<? super Integer, Unit> function1, DatePickerColors datePickerColors, StateData stateData, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1038904873);
        ComposerKt.sourceInformation(startRestartGroup, "C(YearPicker)P(1,2)1635@66923L10,1634@66875L4042:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(stateData) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1038904873, i3, -1, "androidx.compose.material3.YearPicker (DatePicker.kt:1628)");
            }
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), DatePickerModalTokens.INSTANCE.getSelectionYearLabelTextFont()), ComposableLambdaKt.composableLambda(startRestartGroup, -145469688, true, new DatePickerKt$YearPicker$1(stateData, datePickerColors, modifier, function1, i3)), startRestartGroup, 48);
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
        endRestartGroup.updateScope(new DatePickerKt$YearPicker$2(modifier, function1, datePickerColors, stateData, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Year(Modifier modifier, boolean z, boolean z2, Function0<Unit> function0, String str, DatePickerColors datePickerColors, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1441573940);
        ComposerKt.sourceInformation(startRestartGroup, "C(Year)P(4,6,2,5,3)1725@71201L353,1742@71917L90,1746@72076L9,1747@72110L39,1748@72187L98,1736@71559L891:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((2995931 & i3) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1441573940, i3, -1, "androidx.compose.material3.Year (DatePicker.kt:1716)");
            }
            Boolean valueOf = Boolean.valueOf(z2);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i4 = i3 >> 6;
            int i5 = (i4 & 14) | (i3 & 112);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (!z2 || z) ? null : BorderStrokeKt.m448BorderStrokecXLIe8U(DatePickerModalTokens.INSTANCE.m2381getDateTodayContainerOutlineWidthD9Ej5fM(), datePickerColors.m1732getTodayDateBorderColor0d7_KjU$material3_release());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            BorderStroke borderStroke = (BorderStroke) rememberedValue;
            int i6 = i3 >> 12;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(str);
            DatePickerKt$Year$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new DatePickerKt$Year$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i7 = (i3 >> 3) & 14;
            composer2 = startRestartGroup;
            SurfaceKt.m2068Surfaced85dljk(z, function0, SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue2), false, ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getSelectionYearStateLayerShape(), startRestartGroup, 6), datePickerColors.yearContainerColor$material3_release(z, startRestartGroup, i7 | (i6 & 112)).getValue().m3301unboximpl(), datePickerColors.yearContentColor$material3_release(z2, z, startRestartGroup, ((i3 >> 9) & 896) | i5).getValue().m3301unboximpl(), 0.0f, 0.0f, borderStroke, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -68753950, true, new DatePickerKt$Year$2(function2, i3)), startRestartGroup, i7 | (i4 & 112), 48, 1416);
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
        endRestartGroup.updateScope(new DatePickerKt$Year$3(modifier, z, z2, function0, str, datePickerColors, function2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MonthsNavigation(Modifier modifier, boolean z, boolean z2, boolean z3, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Composer composer, int i) {
        int i2;
        Arrangement.HorizontalOrVertical spaceBetween;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1127095896);
        ComposerKt.sourceInformation(startRestartGroup, "C(MonthsNavigation)P(!2,5,7,6)1775@72887L2078:DatePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127095896, i3, -1, "androidx.compose.material3.MonthsNavigation (DatePicker.kt:1765)");
            }
            Modifier m784requiredHeight3ABfNKs = SizeKt.m784requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), MonthYearHeight);
            if (z3) {
                spaceBetween = Arrangement.INSTANCE.getStart();
            } else {
                spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 48);
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
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m784requiredHeight3ABfNKs);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1911928903, "C1787@73264L536:DatePicker.kt#uh7d8r");
            YearPickerMenuButton(function03, z3, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1156508456, true, new DatePickerKt$MonthsNavigation$1$1(str, i3)), startRestartGroup, ((i3 >> 21) & 14) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE | ((i3 >> 6) & 112), 4);
            startRestartGroup.startReplaceableGroup(979007906);
            ComposerKt.sourceInformation(startRestartGroup, "1801@73938L1011");
            if (z3) {
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(Modifier.Companion);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl2, rowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 479941280, "C1802@73991L7,1803@74038L446,1813@74501L434:DatePicker.kt#uh7d8r");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                boolean z4 = consume7 == LayoutDirection.Rtl;
                composer2 = startRestartGroup;
                IconButtonKt.IconButton(function02, null, z2, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1143715416, true, new DatePickerKt$MonthsNavigation$1$2$1(z4)), composer2, ((i3 >> 18) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 896), 26);
                IconButtonKt.IconButton(function0, null, z, null, null, ComposableLambdaKt.composableLambda(composer2, 1336532191, true, new DatePickerKt$MonthsNavigation$1$2$2(z4)), composer2, ((i3 >> 15) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i3 << 3) & 896), 26);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
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
        endRestartGroup.updateScope(new DatePickerKt$MonthsNavigation$2(modifier, z, z2, z3, str, function0, function02, function03, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void YearPickerMenuButton(Function0<Unit> function0, boolean z, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Modifier.Companion companion;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(409654418);
        ComposerKt.sourceInformation(startRestartGroup, "C(YearPickerMenuButton)P(3,1,2)1841@75389L11,1841@75343L75,1836@75206L690:DatePicker.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                companion = i5 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(409654418, i4, -1, "androidx.compose.material3.YearPickerMenuButton (DatePicker.kt:1830)");
                }
                ButtonKt.TextButton(function0, companion, false, RoundedCornerShapeKt.getCircleShape(), ButtonDefaults.INSTANCE.m1606textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1641getOnSurfaceVariant0d7_KjU(), 0L, 0L, startRestartGroup, 24576, 13), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1899012021, true, new DatePickerKt$YearPickerMenuButton$1(function2, i4, z)), startRestartGroup, 807075840 | (i4 & 14) | ((i4 >> 3) & 112), 388);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new DatePickerKt$YearPickerMenuButton$2(function0, z, companion, function2, i, i2));
            return;
        }
        obj = modifier;
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 5851) == 1170) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ButtonKt.TextButton(function0, companion, false, RoundedCornerShapeKt.getCircleShape(), ButtonDefaults.INSTANCE.m1606textButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1641getOnSurfaceVariant0d7_KjU(), 0L, 0L, startRestartGroup, 24576, 13), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1899012021, true, new DatePickerKt$YearPickerMenuButton$1(function2, i4, z)), startRestartGroup, 807075840 | (i4 & 14) | ((i4 >> 3) & 112), 388);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new DatePickerKt$customScrollActions$scrollUpAction$1(lazyGridState, coroutineScope)), new CustomAccessibilityAction(str2, new DatePickerKt$customScrollActions$scrollDownAction$1(lazyGridState, coroutineScope))});
    }

    public static final String toLocalString(int i) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        String format = integerInstance.format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }

    public static final float getRecommendedSizeForAccessibility() {
        return RecommendedSizeForAccessibility;
    }

    public static final float getMonthYearHeight() {
        return MonthYearHeight;
    }

    public static final float getDatePickerHorizontalPadding() {
        return DatePickerHorizontalPadding;
    }

    public static final PaddingValues getDatePickerModeTogglePadding() {
        return DatePickerModeTogglePadding;
    }

    static {
        float f = 12;
        DatePickerHorizontalPadding = Dp.m5607constructorimpl(f);
        DatePickerModeTogglePadding = PaddingKt.m745PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), 3, null);
        float f2 = 24;
        float f3 = 16;
        DatePickerTitlePadding = PaddingKt.m745PaddingValuesa9UjIt4$default(Dp.m5607constructorimpl(f2), Dp.m5607constructorimpl(f3), Dp.m5607constructorimpl(f), 0.0f, 8, null);
        DatePickerHeadlinePadding = PaddingKt.m745PaddingValuesa9UjIt4$default(Dp.m5607constructorimpl(f2), 0.0f, Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), 2, null);
        YearsVerticalPadding = Dp.m5607constructorimpl(f3);
    }
}
