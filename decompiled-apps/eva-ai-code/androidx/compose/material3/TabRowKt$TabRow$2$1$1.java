package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt$TabRow$2$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
    final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
    final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRow$2$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$tabs = function2;
        this.$divider = function22;
        this.$indicator = function3;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m2104invoke0kLqBqw(subcomposeMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m2104invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        Ref.IntRef intRef = new Ref.IntRef();
        if (size > 0) {
            intRef.element = m5551getMaxWidthimpl / size;
        }
        List<Measurable> list = subcompose;
        int i = 0;
        for (Measurable measurable : list) {
            i = Math.max(measurable.maxIntrinsicHeight(intRef.element), i);
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Measurable measurable2 : list) {
            arrayList.add(measurable2.mo4545measureBRTryo0(Constraints.m5541copyZbe2FdA(j, intRef.element, intRef.element, i, i)));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList3.add(new TabPosition(Dp.m5607constructorimpl(SubcomposeLayout.mo585toDpu2uoSUM(intRef.element) * i2), SubcomposeLayout.mo585toDpu2uoSUM(intRef.element), null));
        }
        return MeasureScope.CC.layout$default(SubcomposeLayout, m5551getMaxWidthimpl, i, null, new AnonymousClass1(arrayList2, SubcomposeLayout, this.$divider, intRef, j, i, this.$indicator, arrayList3, this.$$dirty, m5551getMaxWidthimpl), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabRow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.TabRowKt$TabRow$2$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ long $constraints;
        final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
        final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
        final /* synthetic */ List<Placeable> $tabPlaceables;
        final /* synthetic */ List<TabPosition> $tabPositions;
        final /* synthetic */ int $tabRowHeight;
        final /* synthetic */ int $tabRowWidth;
        final /* synthetic */ Ref.IntRef $tabWidth;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, Ref.IntRef intRef, long j, int i, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list2, int i2, int i3) {
            super(1);
            this.$tabPlaceables = list;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$divider = function2;
            this.$tabWidth = intRef;
            this.$constraints = j;
            this.$tabRowHeight = i;
            this.$indicator = function3;
            this.$tabPositions = list2;
            this.$$dirty = i2;
            this.$tabRowWidth = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Ref.IntRef intRef = this.$tabWidth;
            int i = 0;
            for (Object obj : this.$tabPlaceables) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, intRef.element * i, 0, 0.0f, 4, null);
                i = i2;
            }
            long j = this.$constraints;
            int i3 = this.$tabRowHeight;
            for (Measurable measurable : this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider)) {
                Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                Placeable.PlacementScope.placeRelative$default(layout, mo4545measureBRTryo0, 0, i3 - mo4545measureBRTryo0.getHeight(), 0.0f, 4, null);
                i3 = i3;
                j = j;
            }
            int i4 = this.$tabRowWidth;
            int i5 = this.$tabRowHeight;
            for (Measurable measurable2 : this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-976887453, true, new AnonymousClass3(this.$indicator, this.$tabPositions, this.$$dirty)))) {
                Placeable.PlacementScope.placeRelative$default(layout, measurable2.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(i4, i5)), 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TabRow.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.TabRowKt$TabRow$2$1$1$1$3  reason: invalid class name */
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
                ComposerKt.sourceInformation(composer, "C185@8506L23:TabRow.kt#uh7d8r");
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-976887453, i, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:184)");
                }
                this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 9) & 112) | 8));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
    }
}
