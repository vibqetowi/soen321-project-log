package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
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
/* compiled from: Scaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayout$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, WindowInsets windowInsets, Function2<? super Composer, ? super Integer, Unit> function24, int i2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$topBar = function2;
        this.$snackbar = function22;
        this.$fab = function23;
        this.$fabPosition = i;
        this.$contentWindowInsets = windowInsets;
        this.$bottomBar = function24;
        this.$$dirty = i2;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1952invoke0kLqBqw(subcomposeMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m1952invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        return MeasureScope.CC.layout$default(SubcomposeLayout, m5551getMaxWidthimpl, m5550getMaxHeightimpl, null, new AnonymousClass1(SubcomposeLayout, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m5551getMaxWidthimpl, this.$contentWindowInsets, Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$$dirty, this.$content, m5550getMaxHeightimpl), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
        final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
        final /* synthetic */ WindowInsets $contentWindowInsets;
        final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
        final /* synthetic */ int $fabPosition;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ long $looseConstraints;
        final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, int i2, WindowInsets windowInsets, long j, Function2<? super Composer, ? super Integer, Unit> function24, int i3, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, int i4) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = function2;
            this.$snackbar = function22;
            this.$fab = function23;
            this.$fabPosition = i;
            this.$layoutWidth = i2;
            this.$contentWindowInsets = windowInsets;
            this.$looseConstraints = j;
            this.$bottomBar = function24;
            this.$$dirty = i3;
            this.$content = function3;
            this.$layoutHeight = i4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope layout) {
            Object next;
            Object next2;
            Object next3;
            FabPlacement fabPlacement;
            Object next4;
            Integer num;
            float f;
            int i;
            float f2;
            Object next5;
            Object next6;
            int i2;
            float f3;
            float f4;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, this.$topBar);
            long j = this.$looseConstraints;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
            for (Measurable measurable : subcompose) {
                arrayList.add(measurable.mo4545measureBRTryo0(j));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList<Placeable> arrayList3 = arrayList2;
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int height = ((Placeable) next).getHeight();
                    do {
                        Object next7 = it.next();
                        int height2 = ((Placeable) next7).getHeight();
                        if (height < height2) {
                            next = next7;
                            height = height2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Placeable placeable = (Placeable) next;
            int height3 = placeable != null ? placeable.getHeight() : 0;
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, this.$snackbar);
            WindowInsets windowInsets = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
            long j2 = this.$looseConstraints;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose2, 10));
            for (Measurable measurable2 : subcompose2) {
                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                arrayList4.add(measurable2.mo4545measureBRTryo0(ConstraintsKt.m5567offsetNN6EwU(j2, (-windowInsets.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope2))));
                subcomposeMeasureScope = subcomposeMeasureScope;
            }
            ArrayList<Placeable> arrayList5 = arrayList4;
            Iterator it2 = arrayList5.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    int height4 = ((Placeable) next2).getHeight();
                    do {
                        Object next8 = it2.next();
                        int height5 = ((Placeable) next8).getHeight();
                        if (height4 < height5) {
                            next2 = next8;
                            height4 = height5;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next2 = null;
            }
            Placeable placeable2 = (Placeable) next2;
            int height6 = placeable2 != null ? placeable2.getHeight() : 0;
            Iterator it3 = arrayList5.iterator();
            if (it3.hasNext()) {
                next3 = it3.next();
                if (it3.hasNext()) {
                    int width = ((Placeable) next3).getWidth();
                    do {
                        Object next9 = it3.next();
                        int width2 = ((Placeable) next9).getWidth();
                        if (width < width2) {
                            next3 = next9;
                            width = width2;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next3 = null;
            }
            Placeable placeable3 = (Placeable) next3;
            int width3 = placeable3 != null ? placeable3.getWidth() : 0;
            WindowInsets windowInsets2 = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope3 = this.$this_SubcomposeLayout;
            long j3 = this.$looseConstraints;
            ArrayList arrayList6 = new ArrayList();
            for (Measurable measurable3 : this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, this.$fab)) {
                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope3;
                Placeable mo4545measureBRTryo0 = measurable3.mo4545measureBRTryo0(ConstraintsKt.m5567offsetNN6EwU(j3, (-windowInsets2.getLeft(subcomposeMeasureScope4, subcomposeMeasureScope3.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope4, subcomposeMeasureScope3.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope4)));
                if (!((mo4545measureBRTryo0.getHeight() == 0 || mo4545measureBRTryo0.getWidth() == 0) ? false : true)) {
                    mo4545measureBRTryo0 = null;
                }
                if (mo4545measureBRTryo0 != null) {
                    arrayList6.add(mo4545measureBRTryo0);
                }
            }
            ArrayList<Placeable> arrayList7 = arrayList6;
            if (!arrayList7.isEmpty()) {
                ArrayList arrayList8 = arrayList7;
                Iterator it4 = arrayList8.iterator();
                if (it4.hasNext()) {
                    next5 = it4.next();
                    if (it4.hasNext()) {
                        int width4 = ((Placeable) next5).getWidth();
                        do {
                            Object next10 = it4.next();
                            int width5 = ((Placeable) next10).getWidth();
                            if (width4 < width5) {
                                next5 = next10;
                                width4 = width5;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next5 = null;
                }
                Intrinsics.checkNotNull(next5);
                int width6 = ((Placeable) next5).getWidth();
                Iterator it5 = arrayList8.iterator();
                if (it5.hasNext()) {
                    next6 = it5.next();
                    if (it5.hasNext()) {
                        int height7 = ((Placeable) next6).getHeight();
                        do {
                            Object next11 = it5.next();
                            int height8 = ((Placeable) next11).getHeight();
                            if (height7 < height8) {
                                next6 = next11;
                                height7 = height8;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next6 = null;
                }
                Intrinsics.checkNotNull(next6);
                int height9 = ((Placeable) next6).getHeight();
                if (!FabPosition.m1793equalsimpl0(this.$fabPosition, FabPosition.Companion.m1798getEndERTFSPs())) {
                    i2 = (this.$layoutWidth - width6) / 2;
                } else if (this.$this_SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr) {
                    int i3 = this.$layoutWidth;
                    SubcomposeMeasureScope subcomposeMeasureScope5 = this.$this_SubcomposeLayout;
                    f4 = ScaffoldKt.FabSpacing;
                    i2 = (i3 - subcomposeMeasureScope5.mo582roundToPx0680j_4(f4)) - width6;
                } else {
                    SubcomposeMeasureScope subcomposeMeasureScope6 = this.$this_SubcomposeLayout;
                    f3 = ScaffoldKt.FabSpacing;
                    i2 = subcomposeMeasureScope6.mo582roundToPx0680j_4(f3);
                }
                fabPlacement = new FabPlacement(i2, width6, height9);
            } else {
                fabPlacement = null;
            }
            List<Measurable> subcompose3 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-1455477816, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, this.$bottomBar, this.$$dirty)));
            long j4 = this.$looseConstraints;
            ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose3, 10));
            for (Measurable measurable4 : subcompose3) {
                arrayList9.add(measurable4.mo4545measureBRTryo0(j4));
            }
            ArrayList arrayList10 = arrayList9;
            ArrayList<Placeable> arrayList11 = arrayList10;
            Iterator it6 = arrayList11.iterator();
            if (it6.hasNext()) {
                next4 = it6.next();
                if (it6.hasNext()) {
                    int height10 = ((Placeable) next4).getHeight();
                    do {
                        Object next12 = it6.next();
                        int height11 = ((Placeable) next12).getHeight();
                        if (height10 < height11) {
                            next4 = next12;
                            height10 = height11;
                        }
                    } while (it6.hasNext());
                }
            } else {
                next4 = null;
            }
            Placeable placeable4 = (Placeable) next4;
            Integer valueOf = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
            if (fabPlacement != null) {
                SubcomposeMeasureScope subcomposeMeasureScope7 = this.$this_SubcomposeLayout;
                WindowInsets windowInsets3 = this.$contentWindowInsets;
                if (valueOf == null) {
                    int height12 = fabPlacement.getHeight();
                    f2 = ScaffoldKt.FabSpacing;
                    i = height12 + subcomposeMeasureScope7.mo582roundToPx0680j_4(f2) + windowInsets3.getBottom(subcomposeMeasureScope7);
                } else {
                    int intValue = valueOf.intValue() + fabPlacement.getHeight();
                    f = ScaffoldKt.FabSpacing;
                    i = intValue + subcomposeMeasureScope7.mo582roundToPx0680j_4(f);
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            int intValue2 = height6 != 0 ? height6 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : this.$contentWindowInsets.getBottom(this.$this_SubcomposeLayout)) : 0;
            List<Measurable> subcompose4 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(1643221465, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(this.$contentWindowInsets, this.$this_SubcomposeLayout, arrayList2, height3, arrayList10, valueOf, this.$content, this.$$dirty)));
            long j5 = this.$looseConstraints;
            ArrayList<Placeable> arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose4, 10));
            for (Measurable measurable5 : subcompose4) {
                arrayList12.add(measurable5.mo4545measureBRTryo0(j5));
            }
            for (Placeable placeable5 : arrayList12) {
                Placeable.PlacementScope.place$default(layout, placeable5, 0, 0, 0.0f, 4, null);
                fabPlacement = fabPlacement;
            }
            FabPlacement fabPlacement2 = fabPlacement;
            for (Placeable placeable6 : arrayList3) {
                Placeable.PlacementScope.place$default(layout, placeable6, 0, 0, 0.0f, 4, null);
            }
            int i4 = this.$layoutWidth;
            WindowInsets windowInsets4 = this.$contentWindowInsets;
            SubcomposeMeasureScope subcomposeMeasureScope8 = this.$this_SubcomposeLayout;
            int i5 = this.$layoutHeight;
            for (Placeable placeable7 : arrayList5) {
                Placeable.PlacementScope.place$default(layout, placeable7, windowInsets4.getLeft(subcomposeMeasureScope8, subcomposeMeasureScope8.getLayoutDirection()) + ((i4 - width3) / 2), i5 - intValue2, 0.0f, 4, null);
            }
            int i6 = this.$layoutHeight;
            for (Placeable placeable8 : arrayList11) {
                Placeable.PlacementScope.place$default(layout, placeable8, 0, i6 - (valueOf != null ? valueOf.intValue() : 0), 0.0f, 4, null);
            }
            if (fabPlacement2 != null) {
                int i7 = this.$layoutHeight;
                for (Placeable placeable9 : arrayList7) {
                    int left = fabPlacement2.getLeft();
                    Intrinsics.checkNotNull(num);
                    Placeable.PlacementScope.place$default(layout, placeable9, left, i7 - num.intValue(), 0.0f, 4, null);
                }
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }
}
