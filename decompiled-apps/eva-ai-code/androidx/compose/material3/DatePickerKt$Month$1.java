package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$Month$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ Locale $defaultLocale;
    final /* synthetic */ MutableState<CalendarDate> $endSelection;
    final /* synthetic */ CalendarMonth $month;
    final /* synthetic */ Function1<Long, Unit> $onDateSelected;
    final /* synthetic */ Modifier $rangeSelectionDrawModifier;
    final /* synthetic */ boolean $rangeSelectionEnabled;
    final /* synthetic */ MutableState<CalendarDate> $startSelection;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ CalendarDate $today;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$Month$1(Modifier modifier, CalendarMonth calendarMonth, CalendarDate calendarDate, MutableState<CalendarDate> mutableState, MutableState<CalendarDate> mutableState2, boolean z, int i, DatePickerFormatter datePickerFormatter, Locale locale, Function1<? super Long, Unit> function1, DatePickerColors datePickerColors, StateData stateData, Function1<? super Long, Boolean> function12) {
        super(2);
        this.$rangeSelectionDrawModifier = modifier;
        this.$month = calendarMonth;
        this.$today = calendarDate;
        this.$startSelection = mutableState;
        this.$endSelection = mutableState2;
        this.$rangeSelectionEnabled = z;
        this.$$dirty = i;
        this.$dateFormatter = datePickerFormatter;
        this.$defaultLocale = locale;
        this.$onDateSelected = function1;
        this.$colors = datePickerColors;
        this.$stateData = stateData;
        this.$dateValidator = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    public final void invoke(Composer composer, int i) {
        int i2;
        String str;
        int i3;
        MutableState<CalendarDate> mutableState;
        CalendarDate calendarDate;
        CalendarMonth calendarMonth;
        Function1<Long, Boolean> function1;
        Function1<Long, Unit> function12;
        Locale locale;
        String str2;
        int i4;
        String str3;
        boolean z;
        MutableState<CalendarDate> mutableState2;
        StateData stateData;
        StateData stateData2;
        State state;
        String dayContentDescription;
        String str4;
        ComposerKt.sourceInformation(composer, "C1446@58969L4887:DatePicker.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1776200645, i, -1, "androidx.compose.material3.Month.<anonymous> (DatePicker.kt:1444)");
            }
            Modifier then = SizeKt.m784requiredHeight3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(DatePickerKt.getRecommendedSizeForAccessibility() * 6)).then(this.$rangeSelectionDrawModifier);
            CalendarMonth calendarMonth2 = this.$month;
            CalendarDate calendarDate2 = this.$today;
            MutableState<CalendarDate> mutableState3 = this.$startSelection;
            MutableState<CalendarDate> mutableState4 = this.$endSelection;
            boolean z2 = this.$rangeSelectionEnabled;
            int i5 = this.$$dirty;
            DatePickerFormatter datePickerFormatter = this.$dateFormatter;
            Locale locale2 = this.$defaultLocale;
            Function1<Long, Unit> function13 = this.$onDateSelected;
            DatePickerColors datePickerColors = this.$colors;
            StateData stateData3 = this.$stateData;
            Function1<Long, Boolean> function14 = this.$dateValidator;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.Companion.getStart(), composer, 6);
            composer.startReplaceableGroup(-1323940314);
            String str5 = "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh";
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            Function1<Long, Boolean> function15 = function14;
            String str6 = "C:CompositionLocal.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            Function1<Long, Unit> function16 = function13;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            Locale locale3 = locale2;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
            StateData stateData4 = stateData3;
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String str7 = "C:DatePicker.kt#uh7d8r";
            ComposerKt.sourceInformationMarkerStart(composer, -1111255490, "C:DatePicker.kt#uh7d8r");
            composer.startReplaceableGroup(-713647587);
            ComposerKt.sourceInformation(composer, "*1453@59267L4565");
            int i6 = 0;
            int i7 = 0;
            int i8 = 6;
            while (i7 < i8) {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, str5);
                int i9 = i7;
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, str6);
                Object consume4 = composer.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(composer);
                Density density2 = (Density) consume4;
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, str6);
                Object consume5 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposerKt.sourceInformationMarkerEnd(composer);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                int i10 = i6;
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, str6);
                Object consume6 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposerKt.sourceInformationMarkerEnd(composer);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(fillMaxWidth$default);
                String str8 = str5;
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer);
                Updater.m2900setimpl(m2893constructorimpl2, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl2, density2, ComposeUiNode.Companion.getSetDensity());
                Updater.m2900setimpl(m2893constructorimpl2, layoutDirection2, ComposeUiNode.Companion.getSetLayoutDirection());
                Updater.m2900setimpl(m2893constructorimpl2, viewConfiguration2, ComposeUiNode.Companion.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(composer, -326682283, "C80@4021L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1481813225, str7);
                composer.startReplaceableGroup(-1111255211);
                ComposerKt.sourceInformation(composer, "");
                int i11 = 0;
                int i12 = i10;
                while (i11 < 7) {
                    if (i12 < calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth() || i12 >= calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth() + calendarMonth2.getNumberOfDays()) {
                        i2 = i11;
                        str = str6;
                        i3 = i5;
                        mutableState = mutableState4;
                        calendarDate = calendarDate2;
                        calendarMonth = calendarMonth2;
                        function1 = function15;
                        function12 = function16;
                        locale = locale3;
                        str2 = str8;
                        i4 = i12;
                        str3 = str7;
                        z = z2;
                        mutableState2 = mutableState3;
                        stateData = stateData4;
                        composer.startReplaceableGroup(382636990);
                        ComposerKt.sourceInformation(composer, "1464@59838L291");
                        SpacerKt.Spacer(SizeKt.m789requiredSizeVpY3zN4(Modifier.Companion, DatePickerKt.getRecommendedSizeForAccessibility(), DatePickerKt.getRecommendedSizeForAccessibility()), composer, 6);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(382637385);
                        ComposerKt.sourceInformation(composer, "1478@60757L644,1489@61458L366,1504@62314L32,1509@62702L129,1501@62133L1597");
                        int daysFromStartOfWeekToFirstOfMonth = i12 - calendarMonth2.getDaysFromStartOfWeekToFirstOfMonth();
                        calendarMonth = calendarMonth2;
                        long startUtcTimeMillis = (daysFromStartOfWeekToFirstOfMonth * 86400000) + calendarMonth2.getStartUtcTimeMillis();
                        boolean z3 = startUtcTimeMillis == calendarDate2.getUtcTimeMillis();
                        CalendarDate value = mutableState3.getValue();
                        boolean z4 = value != null && startUtcTimeMillis == value.getUtcTimeMillis();
                        CalendarDate value2 = mutableState4.getValue();
                        boolean z5 = value2 != null && startUtcTimeMillis == value2.getUtcTimeMillis();
                        Boolean valueOf = Boolean.valueOf(z2);
                        Long valueOf2 = Long.valueOf(startUtcTimeMillis);
                        int i13 = (i5 >> 12) & 14;
                        composer.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            stateData2 = stateData4;
                            State derivedStateOf = SnapshotStateKt.derivedStateOf(new DatePickerKt$Month$1$1$1$1$1$inRange$1$1(stateData2, z2, startUtcTimeMillis));
                            composer.updateRememberedValue(derivedStateOf);
                            state = derivedStateOf;
                        } else {
                            state = rememberedValue;
                            stateData2 = stateData4;
                        }
                        composer.endReplaceableGroup();
                        State state2 = (State) state;
                        str2 = str8;
                        stateData = stateData2;
                        boolean z6 = z2;
                        i2 = i11;
                        CalendarDate calendarDate3 = calendarDate2;
                        Function1<Long, Unit> function17 = function16;
                        i4 = i12;
                        MutableState<CalendarDate> mutableState5 = mutableState3;
                        Locale locale4 = locale3;
                        str3 = str7;
                        str = str6;
                        dayContentDescription = DatePickerKt.dayContentDescription(z2, z3, z4, z5, ((Boolean) state2.getValue()).booleanValue(), composer, i13);
                        String formatWithSkeleton = CalendarModel_androidKt.formatWithSkeleton(startUtcTimeMillis, datePickerFormatter.getSelectedDateDescriptionSkeleton$material3_release(), locale4);
                        Modifier.Companion companion = Modifier.Companion;
                        boolean z7 = z4 || z5;
                        Long valueOf3 = Long.valueOf(startUtcTimeMillis);
                        composer.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed2 = composer.changed(function17) | composer.changed(valueOf3);
                        DatePickerKt$Month$1$1$1$1$1$1$1 rememberedValue2 = composer.rememberedValue();
                        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = new DatePickerKt$Month$1$1$1$1$1$1$1(function17, startUtcTimeMillis);
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        composer.endReplaceableGroup();
                        Function0 function0 = rememberedValue2;
                        Long valueOf4 = Long.valueOf(startUtcTimeMillis);
                        composer.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
                        boolean changed3 = composer.changed(valueOf4);
                        Object rememberedValue3 = composer.rememberedValue();
                        if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                            Long valueOf5 = Long.valueOf(startUtcTimeMillis);
                            function1 = function15;
                            rememberedValue3 = Boolean.valueOf(function1.invoke(valueOf5).booleanValue());
                            composer.updateRememberedValue(rememberedValue3);
                        } else {
                            function1 = function15;
                        }
                        composer.endReplaceableGroup();
                        boolean booleanValue = ((Boolean) rememberedValue3).booleanValue();
                        boolean booleanValue2 = ((Boolean) state2.getValue()).booleanValue();
                        if (dayContentDescription != null) {
                            str4 = dayContentDescription + ", " + formatWithSkeleton;
                        } else {
                            str4 = formatWithSkeleton;
                        }
                        boolean z8 = z7;
                        boolean z9 = z4;
                        boolean z10 = z3;
                        i3 = i5;
                        String str9 = str4;
                        z = z6;
                        mutableState = mutableState4;
                        locale = locale4;
                        mutableState2 = mutableState5;
                        function12 = function17;
                        calendarDate = calendarDate3;
                        DatePickerKt.Day(companion, z8, function0, z9, booleanValue, z10, booleanValue2, str9, datePickerColors, ComposableLambdaKt.composableLambda(composer, 1633583293, true, new DatePickerKt$Month$1$1$1$1$1$3(daysFromStartOfWeekToFirstOfMonth)), composer, ((i5 << 3) & 234881024) | 805306374);
                        composer.endReplaceableGroup();
                    }
                    i12 = i4 + 1;
                    i11 = i2 + 1;
                    i5 = i3;
                    z2 = z;
                    mutableState3 = mutableState2;
                    str7 = str3;
                    stateData4 = stateData;
                    calendarMonth2 = calendarMonth;
                    mutableState4 = mutableState;
                    locale3 = locale;
                    calendarDate2 = calendarDate;
                    function16 = function12;
                    str8 = str2;
                    str6 = str;
                    function15 = function1;
                }
                Function1<Long, Unit> function18 = function16;
                int i14 = i12;
                composer.endReplaceableGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                i7 = i9 + 1;
                i8 = 6;
                i6 = i14;
                calendarMonth2 = calendarMonth2;
                locale3 = locale3;
                function16 = function18;
                str5 = str8;
                function15 = function15;
            }
            composer.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
