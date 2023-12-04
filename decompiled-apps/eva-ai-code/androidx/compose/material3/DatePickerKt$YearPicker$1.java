package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.apache.http.HttpStatus;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatePickerKt$YearPicker$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DatePickerColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Integer, Unit> $onYearSelected;
    final /* synthetic */ StateData $stateData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DatePickerKt$YearPicker$1(StateData stateData, DatePickerColors datePickerColors, Modifier modifier, Function1<? super Integer, Unit> function1, int i) {
        super(2);
        this.$stateData = stateData;
        this.$colors = datePickerColors;
        this.$modifier = modifier;
        this.$onYearSelected = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long m1727getContainerColor0d7_KjU$material3_release;
        float f;
        ComposerKt.sourceInformation(composer, "C1640@67154L329,1648@67656L11,1653@67868L24,1654@67933L53,1655@68025L51,1656@68085L2826:DatePicker.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-145469688, i, -1, "androidx.compose.material3.YearPicker.<anonymous> (DatePicker.kt:1636)");
            }
            int year = this.$stateData.getCurrentMonth().getYear();
            int year2 = this.$stateData.getDisplayedMonth().getYear();
            LazyGridState rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(Math.max(0, (year2 - this.$stateData.getYearRange().getFirst()) - 3), 0, composer, 0, 2);
            composer.startReplaceableGroup(-969349200);
            ComposerKt.sourceInformation(composer, "1649@67705L11,1649@67769L7");
            if (Color.m3292equalsimpl0(this.$colors.m1727getContainerColor0d7_KjU$material3_release(), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1651getSurface0d7_KjU())) {
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = composer.consume(SurfaceKt.getLocalAbsoluteTonalElevation());
                ComposerKt.sourceInformationMarkerEnd(composer);
                m1727getContainerColor0d7_KjU$material3_release = ColorSchemeKt.m1692surfaceColorAtElevation3ABfNKs(colorScheme, ((Dp) consume).m5621unboximpl());
            } else {
                m1727getContainerColor0d7_KjU$material3_release = this.$colors.m1727getContainerColor0d7_KjU$material3_release();
            }
            long j = m1727getContainerColor0d7_KjU$material3_release;
            composer.endReplaceableGroup();
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
            String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2014getDatePickerScrollToShowEarlierYearsadMyvUU(), composer, 6);
            String m2058getStringNWtq282 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2015getDatePickerScrollToShowLaterYearsadMyvUU(), composer, 6);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(BackgroundKt.m421backgroundbw27NRU$default(this.$modifier, j, null, 2, null), false, AnonymousClass1.INSTANCE, 1, null);
            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            Arrangement arrangement = Arrangement.INSTANCE;
            f = DatePickerKt.YearsVerticalPadding;
            LazyGridDslKt.LazyVerticalGrid(fixed, semantics$default, rememberLazyGridState, null, false, arrangement.m655spacedBy0680j_4(f), spaceEvenly, null, false, new AnonymousClass2(this.$stateData, year2, year, this.$onYearSelected, this.$$dirty, this.$colors, rememberLazyGridState, coroutineScope, m2058getStringNWtq28, m2058getStringNWtq282), composer, 1769472, HttpStatus.SC_REQUEST_TIMEOUT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<LazyGridScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ DatePickerColors $colors;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ int $currentYear;
        final /* synthetic */ int $displayedYear;
        final /* synthetic */ LazyGridState $lazyGridState;
        final /* synthetic */ Function1<Integer, Unit> $onYearSelected;
        final /* synthetic */ String $scrollToEarlierYearsLabel;
        final /* synthetic */ String $scrollToLaterYearsLabel;
        final /* synthetic */ StateData $stateData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(StateData stateData, int i, int i2, Function1<? super Integer, Unit> function1, int i3, DatePickerColors datePickerColors, LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
            super(1);
            this.$stateData = stateData;
            this.$displayedYear = i;
            this.$currentYear = i2;
            this.$onYearSelected = function1;
            this.$$dirty = i3;
            this.$colors = datePickerColors;
            this.$lazyGridState = lazyGridState;
            this.$coroutineScope = coroutineScope;
            this.$scrollToEarlierYearsLabel = str;
            this.$scrollToLaterYearsLabel = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
            invoke2(lazyGridScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DatePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ DatePickerColors $colors;
            final /* synthetic */ CoroutineScope $coroutineScope;
            final /* synthetic */ int $currentYear;
            final /* synthetic */ int $displayedYear;
            final /* synthetic */ LazyGridState $lazyGridState;
            final /* synthetic */ Function1<Integer, Unit> $onYearSelected;
            final /* synthetic */ String $scrollToEarlierYearsLabel;
            final /* synthetic */ String $scrollToLaterYearsLabel;
            final /* synthetic */ StateData $stateData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(StateData stateData, int i, int i2, Function1<? super Integer, Unit> function1, int i3, DatePickerColors datePickerColors, LazyGridState lazyGridState, CoroutineScope coroutineScope, String str, String str2) {
                super(4);
                this.$stateData = stateData;
                this.$displayedYear = i;
                this.$currentYear = i2;
                this.$onYearSelected = function1;
                this.$$dirty = i3;
                this.$colors = datePickerColors;
                this.$lazyGridState = lazyGridState;
                this.$coroutineScope = coroutineScope;
                this.$scrollToEarlierYearsLabel = str;
                this.$scrollToLaterYearsLabel = str2;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope items, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                ComposerKt.sourceInformation(composer, "C1697@70359L32,*1698@70427L54,1672@68906L1981:DatePicker.kt#uh7d8r");
                if ((i2 & 112) == 0) {
                    i3 = (composer.changed(i) ? 32 : 16) | i2;
                } else {
                    i3 = i2;
                }
                if ((i3 & 721) != 144 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1369226173, i2, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1669)");
                    }
                    int first = i + this.$stateData.getYearRange().getFirst();
                    String localString = DatePickerKt.toLocalString(first);
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(SizeKt.m789requiredSizeVpY3zN4(Modifier.Companion, DatePickerModalTokens.INSTANCE.m2388getSelectionYearContainerWidthD9Ej5fM(), DatePickerModalTokens.INSTANCE.m2387getSelectionYearContainerHeightD9Ej5fM()), false, new C00501(this.$lazyGridState, i, this.$coroutineScope, this.$scrollToEarlierYearsLabel, this.$scrollToLaterYearsLabel), 1, null);
                    boolean z = first == this.$displayedYear;
                    boolean z2 = first == this.$currentYear;
                    Function1<Integer, Unit> function1 = this.$onYearSelected;
                    Integer valueOf = Integer.valueOf(first);
                    Function1<Integer, Unit> function12 = this.$onYearSelected;
                    composer.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    boolean changed = composer.changed(function1) | composer.changed(valueOf);
                    DatePickerKt$YearPicker$1$2$1$2$1 rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new DatePickerKt$YearPicker$1$2$1$2$1(function12, first);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    String format = String.format(Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2012getDatePickerNavigateToYearDescriptionadMyvUU(), composer, 6), Arrays.copyOf(new Object[]{localString}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                    DatePickerKt.Year(semantics$default, z, z2, (Function0) rememberedValue, format, this.$colors, ComposableLambdaKt.composableLambda(composer, 2095319565, true, new AnonymousClass3(localString)), composer, ((this.$$dirty << 9) & 458752) | 1572864);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DatePicker.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C00501 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                final /* synthetic */ CoroutineScope $coroutineScope;
                final /* synthetic */ int $it;
                final /* synthetic */ LazyGridState $lazyGridState;
                final /* synthetic */ String $scrollToEarlierYearsLabel;
                final /* synthetic */ String $scrollToLaterYearsLabel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00501(LazyGridState lazyGridState, int i, CoroutineScope coroutineScope, String str, String str2) {
                    super(1);
                    this.$lazyGridState = lazyGridState;
                    this.$it = i;
                    this.$coroutineScope = coroutineScope;
                    this.$scrollToEarlierYearsLabel = str;
                    this.$scrollToLaterYearsLabel = str2;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semantics) {
                    List customScrollActions;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    if (this.$lazyGridState.getFirstVisibleItemIndex() != this.$it) {
                        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.lastOrNull((List<? extends Object>) this.$lazyGridState.getLayoutInfo().getVisibleItemsInfo());
                        boolean z = false;
                        if (lazyGridItemInfo != null && lazyGridItemInfo.getIndex() == this.$it) {
                            z = true;
                        }
                        if (!z) {
                            customScrollActions = CollectionsKt.emptyList();
                            SemanticsPropertiesKt.setCustomActions(semantics, customScrollActions);
                        }
                    }
                    customScrollActions = DatePickerKt.customScrollActions(this.$lazyGridState, this.$coroutineScope, this.$scrollToEarlierYearsLabel, this.$scrollToLaterYearsLabel);
                    SemanticsPropertiesKt.setCustomActions(semantics, customScrollActions);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DatePicker.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$3  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ String $localizedYear;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(String str) {
                    super(2);
                    this.$localizedYear = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C1702@70606L263:DatePicker.kt#uh7d8r");
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2095319565, i, -1, "androidx.compose.material3.YearPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1701)");
                        }
                        TextKt.m2145Text4IGK_g(this.$localizedYear, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, C00511.INSTANCE), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 130556);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: DatePicker.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$3$1  reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C00511 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final C00511 INSTANCE = new C00511();

                    C00511() {
                        super(1);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver clearAndSetSemantics) {
                        Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }
            }
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LazyGridScope LazyVerticalGrid) {
            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
            LazyGridScope.CC.items$default(LazyVerticalGrid, CollectionsKt.count(this.$stateData.getYearRange()), null, null, null, ComposableLambdaKt.composableLambdaInstance(1369226173, true, new AnonymousClass1(this.$stateData, this.$displayedYear, this.$currentYear, this.$onYearSelected, this.$$dirty, this.$colors, this.$lazyGridState, this.$coroutineScope, this.$scrollToEarlierYearsLabel, this.$scrollToLaterYearsLabel)), 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DatePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DatePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00491 extends Lambda implements Function0<Float> {
            public static final C00491 INSTANCE = new C00491();

            C00491() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DatePicker.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$2  reason: invalid class name */
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
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, new ScrollAxisRange(C00491.INSTANCE, AnonymousClass2.INSTANCE, false, 4, null));
        }
    }
}
