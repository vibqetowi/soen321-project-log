package androidx.compose.material;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRow$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$ScrollableTabRow$2(float f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i2) {
        super(2);
        this.$edgePadding = f;
        this.$tabs = function2;
        this.$divider = function22;
        this.$selectedTabIndex = i;
        this.$indicator = function3;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C245@11827L21,246@11878L24,247@11935L185,253@12129L2557:TabRow.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1455860572, i, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:244)");
            }
            ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
            composer.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
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
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(rememberScrollState) | composer.changed(coroutineScope);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null))), new AnonymousClass1(this.$edgePadding, this.$tabs, this.$divider, rememberedValue2, this.$selectedTabIndex, this.$indicator, this.$$dirty), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
        final /* synthetic */ float $edgePadding;
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
        final /* synthetic */ ScrollableTabData $scrollableTabData;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(float f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, ScrollableTabData scrollableTabData, int i, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i2) {
            super(2);
            this.$edgePadding = f;
            this.$tabs = function2;
            this.$divider = function22;
            this.$scrollableTabData = scrollableTabData;
            this.$selectedTabIndex = i;
            this.$indicator = function3;
            this.$$dirty = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
            return m1502invoke0kLqBqw(subcomposeMeasureScope, constraints.m5557unboximpl());
        }

        /* renamed from: invoke-0kLqBqw  reason: not valid java name */
        public final MeasureResult m1502invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
            float f;
            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
            f = TabRowKt.ScrollableTabRowMinimumTabWidth;
            int i = SubcomposeLayout.mo582roundToPx0680j_4(f);
            int i2 = SubcomposeLayout.mo582roundToPx0680j_4(this.$edgePadding);
            long m5542copyZbe2FdA$default = Constraints.m5542copyZbe2FdA$default(j, i, 0, 0, 0, 14, null);
            List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
            for (Measurable measurable : subcompose) {
                arrayList.add(measurable.mo4545measureBRTryo0(m5542copyZbe2FdA$default));
            }
            ArrayList<Placeable> arrayList2 = arrayList;
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = i2 * 2;
            Ref.IntRef intRef2 = new Ref.IntRef();
            for (Placeable placeable : arrayList2) {
                intRef.element += placeable.getWidth();
                intRef2.element = Math.max(intRef2.element, placeable.getHeight());
            }
            return MeasureScope.CC.layout$default(SubcomposeLayout, intRef.element, intRef2.element, null, new AnonymousClass2(i2, arrayList2, SubcomposeLayout, this.$divider, this.$scrollableTabData, this.$selectedTabIndex, j, intRef, intRef2, this.$indicator, this.$$dirty), 4, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TabRow.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ long $constraints;
            final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
            final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
            final /* synthetic */ Ref.IntRef $layoutHeight;
            final /* synthetic */ Ref.IntRef $layoutWidth;
            final /* synthetic */ int $padding;
            final /* synthetic */ ScrollableTabData $scrollableTabData;
            final /* synthetic */ int $selectedTabIndex;
            final /* synthetic */ List<Placeable> $tabPlaceables;
            final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(int i, List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, ScrollableTabData scrollableTabData, int i2, long j, Ref.IntRef intRef, Ref.IntRef intRef2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i3) {
                super(1);
                this.$padding = i;
                this.$tabPlaceables = list;
                this.$this_SubcomposeLayout = subcomposeMeasureScope;
                this.$divider = function2;
                this.$scrollableTabData = scrollableTabData;
                this.$selectedTabIndex = i2;
                this.$constraints = j;
                this.$layoutWidth = intRef;
                this.$layoutHeight = intRef2;
                this.$indicator = function3;
                this.$$dirty = i3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                ArrayList arrayList = new ArrayList();
                int i = this.$padding;
                SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
                int i2 = i;
                for (Placeable placeable : this.$tabPlaceables) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, i2, 0, 0.0f, 4, null);
                    arrayList.add(new TabPosition(subcomposeMeasureScope.mo585toDpu2uoSUM(i2), subcomposeMeasureScope.mo585toDpu2uoSUM(placeable.getWidth()), null));
                    i2 += placeable.getWidth();
                }
                long j = this.$constraints;
                Ref.IntRef intRef = this.$layoutWidth;
                Ref.IntRef intRef2 = this.$layoutHeight;
                for (Measurable measurable : this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider)) {
                    Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, intRef.element, intRef.element, 0, 0, 8, null));
                    Placeable.PlacementScope.placeRelative$default(layout, mo4545measureBRTryo0, 0, intRef2.element - mo4545measureBRTryo0.getHeight(), 0.0f, 4, null);
                    intRef = intRef;
                    intRef2 = intRef2;
                    j = j;
                }
                Ref.IntRef intRef3 = this.$layoutWidth;
                Ref.IntRef intRef4 = this.$layoutHeight;
                for (Measurable measurable2 : this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(230769237, true, new AnonymousClass3(this.$indicator, arrayList, this.$$dirty)))) {
                    Placeable.PlacementScope.placeRelative$default(layout, measurable2.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(intRef3.element, intRef4.element)), 0, 0, 0.0f, 4, null);
                }
                this.$scrollableTabData.onLaidOut(this.$this_SubcomposeLayout, this.$padding, arrayList, this.$selectedTabIndex);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: TabRow.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$2$3  reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ int $$dirty;
                final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
                final /* synthetic */ List<TabPosition> $tabPositions;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list, int i) {
                    super(2);
                    this.$indicator = function3;
                    this.$tabPositions = list;
                    this.$$dirty = i;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C301@14237L23:TabRow.kt#jmzs0o");
                    if ((i & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(230769237, i, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:300)");
                    }
                    this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 12) & 112) | 8));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
        }
    }
}
