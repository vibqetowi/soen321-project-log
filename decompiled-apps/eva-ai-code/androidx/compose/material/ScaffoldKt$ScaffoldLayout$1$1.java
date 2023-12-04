package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ boolean $isFabDocked;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayout$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, boolean z, Function2<? super Composer, ? super Integer, Unit> function24, int i2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$topBar = function2;
        this.$snackbar = function22;
        this.$fab = function23;
        this.$fabPosition = i;
        this.$isFabDocked = z;
        this.$bottomBar = function24;
        this.$$dirty = i2;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1445invoke0kLqBqw(subcomposeMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m1445invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        return MeasureScope.CC.layout$default(SubcomposeLayout, m5551getMaxWidthimpl, m5550getMaxHeightimpl, null, new AnonymousClass1(SubcomposeLayout, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m5551getMaxWidthimpl, this.$isFabDocked, m5550getMaxHeightimpl, Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$$dirty, this.$content), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
        final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
        final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
        final /* synthetic */ int $fabPosition;
        final /* synthetic */ boolean $isFabDocked;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ int $layoutWidth;
        final /* synthetic */ long $looseConstraints;
        final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
        final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, int i2, boolean z, int i3, long j, Function2<? super Composer, ? super Integer, Unit> function24, int i4, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = function2;
            this.$snackbar = function22;
            this.$fab = function23;
            this.$fabPosition = i;
            this.$layoutWidth = i2;
            this.$isFabDocked = z;
            this.$layoutHeight = i3;
            this.$looseConstraints = j;
            this.$bottomBar = function24;
            this.$$dirty = i4;
            this.$content = function3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0289  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x028d  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x02cd A[LOOP:4: B:119:0x02cb->B:120:0x02cd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x030a A[LOOP:5: B:122:0x0308->B:123:0x030a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x033a A[LOOP:6: B:125:0x0338->B:126:0x033a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0357 A[LOOP:7: B:128:0x0355->B:129:0x0357, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0375 A[LOOP:8: B:131:0x0373->B:132:0x0375, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0393  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01fd A[LOOP:3: B:85:0x01fb->B:86:0x01fd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0220  */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(Placeable.PlacementScope layout) {
            Object obj;
            Object obj2;
            FabPlacement fabPlacement;
            int size;
            int i;
            ArrayList arrayList;
            int i2;
            Object obj3;
            Integer num;
            int i3;
            int size2;
            int i4;
            int size3;
            int i5;
            int size4;
            int i6;
            int size5;
            int i7;
            int size6;
            int i8;
            int size7;
            int i9;
            int height;
            float f;
            int i10;
            int height2;
            float f2;
            Object obj4;
            Object obj5;
            int i11;
            float f3;
            float f4;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, this.$topBar);
            long j = this.$looseConstraints;
            ArrayList arrayList2 = new ArrayList(subcompose.size());
            int size8 = subcompose.size();
            for (int i12 = 0; i12 < size8; i12++) {
                arrayList2.add(subcompose.get(i12).mo4545measureBRTryo0(j));
            }
            ArrayList arrayList3 = arrayList2;
            if (arrayList3.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList3.get(0);
                int height3 = ((Placeable) obj).getHeight();
                int lastIndex = CollectionsKt.getLastIndex(arrayList3);
                if (1 <= lastIndex) {
                    int i13 = 1;
                    while (true) {
                        Object obj6 = arrayList3.get(i13);
                        int height4 = ((Placeable) obj6).getHeight();
                        if (height3 < height4) {
                            obj = obj6;
                            height3 = height4;
                        }
                        if (i13 == lastIndex) {
                            break;
                        }
                        i13++;
                    }
                }
            }
            Placeable placeable = (Placeable) obj;
            int height5 = placeable != null ? placeable.getHeight() : 0;
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, this.$snackbar);
            long j2 = this.$looseConstraints;
            ArrayList arrayList4 = new ArrayList(subcompose2.size());
            int size9 = subcompose2.size();
            for (int i14 = 0; i14 < size9; i14++) {
                arrayList4.add(subcompose2.get(i14).mo4545measureBRTryo0(j2));
            }
            ArrayList arrayList5 = arrayList4;
            if (arrayList5.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList5.get(0);
                int height6 = ((Placeable) obj2).getHeight();
                int lastIndex2 = CollectionsKt.getLastIndex(arrayList5);
                if (1 <= lastIndex2) {
                    int i15 = 1;
                    while (true) {
                        Object obj7 = arrayList5.get(i15);
                        int height7 = ((Placeable) obj7).getHeight();
                        if (height6 < height7) {
                            obj2 = obj7;
                            height6 = height7;
                        }
                        if (i15 == lastIndex2) {
                            break;
                        }
                        i15++;
                    }
                }
            }
            Placeable placeable2 = (Placeable) obj2;
            int height8 = placeable2 != null ? placeable2.getHeight() : 0;
            List<Measurable> subcompose3 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, this.$fab);
            long j3 = this.$looseConstraints;
            ArrayList arrayList6 = new ArrayList(subcompose3.size());
            int size10 = subcompose3.size();
            for (int i16 = 0; i16 < size10; i16++) {
                arrayList6.add(subcompose3.get(i16).mo4545measureBRTryo0(j3));
            }
            ArrayList arrayList7 = arrayList6;
            if (!arrayList7.isEmpty()) {
                if (arrayList7.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList7.get(0);
                    int width = ((Placeable) obj4).getWidth();
                    int lastIndex3 = CollectionsKt.getLastIndex(arrayList7);
                    if (1 <= lastIndex3) {
                        int i17 = 1;
                        while (true) {
                            Object obj8 = arrayList7.get(i17);
                            int width2 = ((Placeable) obj8).getWidth();
                            if (width < width2) {
                                obj4 = obj8;
                                width = width2;
                            }
                            if (i17 == lastIndex3) {
                                break;
                            }
                            i17++;
                        }
                    }
                }
                Placeable placeable3 = (Placeable) obj4;
                int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                if (arrayList7.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList7.get(0);
                    int height9 = ((Placeable) obj5).getHeight();
                    int lastIndex4 = CollectionsKt.getLastIndex(arrayList7);
                    if (1 <= lastIndex4) {
                        int i18 = 1;
                        while (true) {
                            Object obj9 = arrayList7.get(i18);
                            int height10 = ((Placeable) obj9).getHeight();
                            if (height9 < height10) {
                                obj5 = obj9;
                                height9 = height10;
                            }
                            if (i18 == lastIndex4) {
                                break;
                            }
                            i18++;
                        }
                    }
                }
                Placeable placeable4 = (Placeable) obj5;
                int height11 = placeable4 != null ? placeable4.getHeight() : 0;
                if (width3 != 0 && height11 != 0) {
                    if (FabPosition.m1375equalsimpl0(this.$fabPosition, FabPosition.Companion.m1380getEnd5ygKITE())) {
                        if (this.$this_SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr) {
                            int i19 = this.$layoutWidth;
                            SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
                            f4 = ScaffoldKt.FabSpacing;
                            i11 = (i19 - subcomposeMeasureScope.mo582roundToPx0680j_4(f4)) - width3;
                        } else {
                            SubcomposeMeasureScope subcomposeMeasureScope2 = this.$this_SubcomposeLayout;
                            f3 = ScaffoldKt.FabSpacing;
                            i11 = subcomposeMeasureScope2.mo582roundToPx0680j_4(f3);
                        }
                    } else {
                        i11 = (this.$layoutWidth - width3) / 2;
                    }
                    fabPlacement = new FabPlacement(this.$isFabDocked, i11, width3, height11);
                    List<Measurable> subcompose4 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(1529070963, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, this.$bottomBar, this.$$dirty)));
                    long j4 = this.$looseConstraints;
                    ArrayList arrayList8 = new ArrayList(subcompose4.size());
                    size = subcompose4.size();
                    for (i = 0; i < size; i++) {
                        arrayList8.add(subcompose4.get(i).mo4545measureBRTryo0(j4));
                    }
                    arrayList = arrayList8;
                    if (arrayList.isEmpty()) {
                        i2 = 0;
                        obj3 = arrayList.get(0);
                        int height12 = ((Placeable) obj3).getHeight();
                        int lastIndex5 = CollectionsKt.getLastIndex(arrayList);
                        if (1 <= lastIndex5) {
                            int i20 = 1;
                            while (true) {
                                Object obj10 = arrayList.get(i20);
                                int height13 = ((Placeable) obj10).getHeight();
                                if (height12 < height13) {
                                    obj3 = obj10;
                                    height12 = height13;
                                }
                                if (i20 == lastIndex5) {
                                    break;
                                }
                                i20++;
                            }
                        }
                    } else {
                        obj3 = null;
                        i2 = 0;
                    }
                    Placeable placeable5 = (Placeable) obj3;
                    int height14 = placeable5 == null ? placeable5.getHeight() : i2;
                    if (fabPlacement == null) {
                        SubcomposeMeasureScope subcomposeMeasureScope3 = this.$this_SubcomposeLayout;
                        boolean z = this.$isFabDocked;
                        if (height14 == 0) {
                            height = fabPlacement.getHeight();
                            f2 = ScaffoldKt.FabSpacing;
                            i10 = subcomposeMeasureScope3.mo582roundToPx0680j_4(f2);
                        } else if (z) {
                            height2 = height14 + (fabPlacement.getHeight() / 2);
                            num = Integer.valueOf(height2);
                        } else {
                            height = fabPlacement.getHeight() + height14;
                            f = ScaffoldKt.FabSpacing;
                            i10 = subcomposeMeasureScope3.mo582roundToPx0680j_4(f);
                        }
                        height2 = height + i10;
                        num = Integer.valueOf(height2);
                    } else {
                        num = null;
                    }
                    if (height8 == 0) {
                        i3 = height8 + (num != null ? num.intValue() : height14);
                    } else {
                        i3 = i2;
                    }
                    int i21 = this.$layoutHeight - height5;
                    List<Measurable> subcompose5 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(-1132241596, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(this.$this_SubcomposeLayout, height14, this.$content, this.$$dirty)));
                    long j5 = this.$looseConstraints;
                    ArrayList arrayList9 = new ArrayList(subcompose5.size());
                    size2 = subcompose5.size();
                    i4 = 0;
                    while (i4 < size2) {
                        arrayList9.add(subcompose5.get(i4).mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j5, 0, 0, 0, i21, 7, null)));
                        i4++;
                        subcompose5 = subcompose5;
                        size2 = size2;
                        j5 = j5;
                    }
                    ArrayList arrayList10 = arrayList9;
                    size3 = arrayList10.size();
                    i5 = 0;
                    while (i5 < size3) {
                        Placeable.PlacementScope.place$default(layout, (Placeable) arrayList10.get(i5), 0, height5, 0.0f, 4, null);
                        i5++;
                        size3 = size3;
                        height14 = height14;
                    }
                    int i22 = height14;
                    size4 = arrayList3.size();
                    for (i6 = 0; i6 < size4; i6++) {
                        Placeable.PlacementScope.place$default(layout, (Placeable) arrayList3.get(i6), 0, 0, 0.0f, 4, null);
                    }
                    int i23 = this.$layoutHeight;
                    size5 = arrayList5.size();
                    for (i7 = 0; i7 < size5; i7++) {
                        Placeable.PlacementScope.place$default(layout, (Placeable) arrayList5.get(i7), 0, i23 - i3, 0.0f, 4, null);
                    }
                    int i24 = this.$layoutHeight;
                    size6 = arrayList.size();
                    for (i8 = 0; i8 < size6; i8++) {
                        Placeable.PlacementScope.place$default(layout, (Placeable) arrayList.get(i8), 0, i24 - i22, 0.0f, 4, null);
                    }
                    int i25 = this.$layoutHeight;
                    size7 = arrayList7.size();
                    for (i9 = 0; i9 < size7; i9++) {
                        Placeable.PlacementScope.place$default(layout, (Placeable) arrayList7.get(i9), fabPlacement != null ? fabPlacement.getLeft() : 0, i25 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                    }
                }
            }
            fabPlacement = null;
            List<Measurable> subcompose42 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(1529070963, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, this.$bottomBar, this.$$dirty)));
            long j42 = this.$looseConstraints;
            ArrayList arrayList82 = new ArrayList(subcompose42.size());
            size = subcompose42.size();
            while (i < size) {
            }
            arrayList = arrayList82;
            if (arrayList.isEmpty()) {
            }
            Placeable placeable52 = (Placeable) obj3;
            if (placeable52 == null) {
            }
            if (fabPlacement == null) {
            }
            if (height8 == 0) {
            }
            int i212 = this.$layoutHeight - height5;
            List<Measurable> subcompose52 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(-1132241596, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(this.$this_SubcomposeLayout, height14, this.$content, this.$$dirty)));
            long j52 = this.$looseConstraints;
            ArrayList arrayList92 = new ArrayList(subcompose52.size());
            size2 = subcompose52.size();
            i4 = 0;
            while (i4 < size2) {
            }
            ArrayList arrayList102 = arrayList92;
            size3 = arrayList102.size();
            i5 = 0;
            while (i5 < size3) {
            }
            int i222 = height14;
            size4 = arrayList3.size();
            while (i6 < size4) {
            }
            int i232 = this.$layoutHeight;
            size5 = arrayList5.size();
            while (i7 < size5) {
            }
            int i242 = this.$layoutHeight;
            size6 = arrayList.size();
            while (i8 < size6) {
            }
            int i252 = this.$layoutHeight;
            size7 = arrayList7.size();
            while (i9 < size7) {
            }
        }
    }
}
