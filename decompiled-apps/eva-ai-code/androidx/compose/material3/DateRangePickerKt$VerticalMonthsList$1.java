package androidx.compose.material3;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
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
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DateRangePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DateRangePickerKt$VerticalMonthsList$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ DatePickerFormatter $dateFormatter;
    final /* synthetic */ Function1<Long, Boolean> $dateValidator;
    final /* synthetic */ CalendarMonth $firstMonth;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<Long, Unit> $onDateSelected;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ CalendarDate $today;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DateRangePickerKt$VerticalMonthsList$1(LazyListState lazyListState, int i, StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function12) {
        super(2);
        this.$lazyListState = lazyListState;
        this.$$dirty = i;
        this.$stateData = stateData;
        this.$firstMonth = calendarMonth;
        this.$dateFormatter = datePickerFormatter;
        this.$colors = datePickerColors;
        this.$onDateSelected = function1;
        this.$today = calendarDate;
        this.$dateValidator = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C531@21781L24,532@21847L59,533@21944L55,534@22008L2192:DateRangePicker.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(56792252, i, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:530)");
            }
            composer.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            composer.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            composer.endReplaceableGroup();
            LazyDslKt.LazyColumn(SemanticsModifierKt.semantics$default(Modifier.Companion, false, AnonymousClass1.INSTANCE, 1, null), this.$lazyListState, null, false, null, null, null, false, new AnonymousClass2(this.$stateData, this.$firstMonth, this.$dateFormatter, this.$colors, this.$onDateSelected, this.$today, this.$dateValidator, this.$$dirty, this.$lazyListState, coroutineScope, Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2030getDateRangePickerScrollToShowPreviousMonthadMyvUU(), composer, 6), Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2029getDateRangePickerScrollToShowNextMonthadMyvUU(), composer, 6)), composer, (this.$$dirty >> 3) & 112, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<LazyListScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ DatePickerColors $colors;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ DatePickerFormatter $dateFormatter;
        final /* synthetic */ Function1<Long, Boolean> $dateValidator;
        final /* synthetic */ CalendarMonth $firstMonth;
        final /* synthetic */ LazyListState $lazyListState;
        final /* synthetic */ Function1<Long, Unit> $onDateSelected;
        final /* synthetic */ String $scrollToNextMonthLabel;
        final /* synthetic */ String $scrollToPreviousMonthLabel;
        final /* synthetic */ StateData $stateData;
        final /* synthetic */ CalendarDate $today;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function12, int i, LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
            super(1);
            this.$stateData = stateData;
            this.$firstMonth = calendarMonth;
            this.$dateFormatter = datePickerFormatter;
            this.$colors = datePickerColors;
            this.$onDateSelected = function1;
            this.$today = calendarDate;
            this.$dateValidator = function12;
            this.$$dirty = i;
            this.$lazyListState = lazyListState;
            this.$coroutineScope = coroutineScope;
            this.$scrollToPreviousMonthLabel = str;
            this.$scrollToNextMonthLabel = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
            invoke2(lazyListScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DateRangePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ DatePickerColors $colors;
            final /* synthetic */ CoroutineScope $coroutineScope;
            final /* synthetic */ DatePickerFormatter $dateFormatter;
            final /* synthetic */ Function1<Long, Boolean> $dateValidator;
            final /* synthetic */ CalendarMonth $firstMonth;
            final /* synthetic */ LazyListState $lazyListState;
            final /* synthetic */ Function1<Long, Unit> $onDateSelected;
            final /* synthetic */ String $scrollToNextMonthLabel;
            final /* synthetic */ String $scrollToPreviousMonthLabel;
            final /* synthetic */ StateData $stateData;
            final /* synthetic */ CalendarDate $today;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function12, int i, LazyListState lazyListState, CoroutineScope coroutineScope, String str, String str2) {
                super(4);
                this.$stateData = stateData;
                this.$firstMonth = calendarMonth;
                this.$dateFormatter = datePickerFormatter;
                this.$colors = datePickerColors;
                this.$onDateSelected = function1;
                this.$today = calendarDate;
                this.$dateValidator = function12;
                this.$$dirty = i;
                this.$lazyListState = lazyListState;
                this.$coroutineScope = coroutineScope;
                this.$scrollToPreviousMonthLabel = str;
                this.$scrollToNextMonthLabel = str2;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                ComposerKt.sourceInformation(composer, "C548@22622L1554:DateRangePicker.kt#uh7d8r");
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(items) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 112) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 731) != 146 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1246706073, i2, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:542)");
                    }
                    CalendarMonth plusMonths = this.$stateData.getCalendarModel().plusMonths(this.$firstMonth, i);
                    Modifier fillParentMaxWidth$default = LazyItemScope.CC.fillParentMaxWidth$default(items, Modifier.Companion, 0.0f, 1, null);
                    DatePickerFormatter datePickerFormatter = this.$dateFormatter;
                    StateData stateData = this.$stateData;
                    DatePickerColors datePickerColors = this.$colors;
                    Function1<Long, Unit> function1 = this.$onDateSelected;
                    CalendarDate calendarDate = this.$today;
                    Function1<Long, Boolean> function12 = this.$dateValidator;
                    int i4 = this.$$dirty;
                    LazyListState lazyListState = this.$lazyListState;
                    CoroutineScope coroutineScope = this.$coroutineScope;
                    String str = this.$scrollToPreviousMonthLabel;
                    String str2 = this.$scrollToNextMonthLabel;
                    composer.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                    composer.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    Density density = (Density) consume;
                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillParentMaxWidth$default);
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
                    ComposerKt.sourceInformationMarkerStart(composer, 1680467237, "C555@22915L15,551@22731L992,570@23744L414:DateRangePicker.kt#uh7d8r");
                    String formatMonthYear$material3_release = datePickerFormatter.formatMonthYear$material3_release(plusMonths, stateData.getCalendarModel(), CalendarModel_androidKt.defaultLocale(composer, 0));
                    if (formatMonthYear$material3_release == null) {
                        formatMonthYear$material3_release = "-";
                    }
                    TextKt.m2145Text4IGK_g(formatMonthYear$material3_release, SemanticsModifierKt.semantics$default(ClickableKt.m454clickableXHw0xAI$default(PaddingKt.padding(Modifier.Companion, DateRangePickerKt.getCalendarMonthSubheadPadding()), false, null, null, DateRangePickerKt$VerticalMonthsList$1$2$1$1$1.INSTANCE, 7, null), false, new DateRangePickerKt$VerticalMonthsList$1$2$1$1$2(lazyListState, coroutineScope, str, str2), 1, null), datePickerColors.m1730getSubheadContentColor0d7_KjU$material3_release(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131064);
                    int i5 = i4 << 3;
                    int i6 = i4 << 6;
                    DatePickerKt.Month(plusMonths, function1, calendarDate, stateData, true, function12, datePickerFormatter, datePickerColors, composer, ((i4 << 9) & 3670016) | (i5 & 458752) | (i5 & 112) | 24576 | (i6 & 7168) | (29360128 & i6));
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

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.CC.items$default(LazyColumn, this.$stateData.getTotalMonthsInRange(), null, null, ComposableLambdaKt.composableLambdaInstance(1246706073, true, new AnonymousClass1(this.$stateData, this.$firstMonth, this.$dateFormatter, this.$colors, this.$onDateSelected, this.$today, this.$dateValidator, this.$$dirty, this.$lazyListState, this.$coroutineScope, this.$scrollToPreviousMonthLabel, this.$scrollToNextMonthLabel)), 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DateRangePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00521 extends Lambda implements Function0<Float> {
            public static final C00521 INSTANCE = new C00521();

            C00521() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DateRangePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function0<Float> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, new ScrollAxisRange(C00521.INSTANCE, AnonymousClass2.INSTANCE, false, 4, null));
        }
    }
}
