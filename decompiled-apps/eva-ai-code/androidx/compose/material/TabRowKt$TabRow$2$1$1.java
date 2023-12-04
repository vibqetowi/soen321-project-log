package androidx.compose.material;

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
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
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
        return m1503invoke0kLqBqw(subcomposeMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m1503invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
        Object next;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        int i = m5551getMaxWidthimpl / size;
        List<Measurable> list = subcompose;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Measurable measurable : list) {
            arrayList.add(measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, i, i, 0, 0, 12, null)));
        }
        ArrayList arrayList2 = arrayList;
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int height = ((Placeable) next).getHeight();
                do {
                    Object next2 = it.next();
                    int height2 = ((Placeable) next2).getHeight();
                    if (height < height2) {
                        next = next2;
                        height = height2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Placeable placeable = (Placeable) next;
        int height3 = placeable != null ? placeable.getHeight() : 0;
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList3.add(new TabPosition(Dp.m5607constructorimpl(SubcomposeLayout.mo585toDpu2uoSUM(i) * i2), SubcomposeLayout.mo585toDpu2uoSUM(i), null));
        }
        return MeasureScope.CC.layout$default(SubcomposeLayout, m5551getMaxWidthimpl, height3, null, new AnonymousClass1(arrayList2, SubcomposeLayout, this.$divider, i, j, height3, this.$indicator, arrayList3, this.$$dirty, m5551getMaxWidthimpl), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1  reason: invalid class name */
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
        final /* synthetic */ int $tabWidth;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, int i, long j, int i2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list2, int i3, int i4) {
            super(1);
            this.$tabPlaceables = list;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$divider = function2;
            this.$tabWidth = i;
            this.$constraints = j;
            this.$tabRowHeight = i2;
            this.$indicator = function3;
            this.$tabPositions = list2;
            this.$$dirty = i3;
            this.$tabRowWidth = i4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            int i = this.$tabWidth;
            int i2 = 0;
            for (Object obj : this.$tabPlaceables) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i2 * i, 0, 0.0f, 4, null);
                i2 = i3;
            }
            long j = this.$constraints;
            int i4 = this.$tabRowHeight;
            for (Measurable measurable : this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider)) {
                Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                Placeable.PlacementScope.placeRelative$default(layout, mo4545measureBRTryo0, 0, i4 - mo4545measureBRTryo0.getHeight(), 0.0f, 4, null);
                i4 = i4;
                j = j;
            }
            int i5 = this.$tabRowWidth;
            int i6 = this.$tabRowHeight;
            for (Measurable measurable2 : this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new AnonymousClass3(this.$indicator, this.$tabPositions, this.$$dirty)))) {
                Placeable.PlacementScope.placeRelative$default(layout, measurable2.mo4545measureBRTryo0(Constraints.Companion.m5559fixedJhjzzOo(i5, i6)), 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TabRow.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1$3  reason: invalid class name */
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
                ComposerKt.sourceInformation(composer, "C176@8314L23:TabRow.kt#jmzs0o");
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1341594997, i, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:175)");
                }
                this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 9) & 112) | 8));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
    }
}
