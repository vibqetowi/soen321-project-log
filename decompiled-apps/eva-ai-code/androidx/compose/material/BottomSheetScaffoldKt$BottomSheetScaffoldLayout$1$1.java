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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $body;
    final /* synthetic */ Function3<Integer, Composer, Integer, Unit> $bottomSheet;
    final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Function0<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomSheetValue.values().length];
            try {
                iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomSheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(Function0<Float> function0, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i, float f, Function2<? super Composer, ? super Integer, Unit> function23, BottomSheetState bottomSheetState, Function3<? super Integer, ? super Composer, ? super Integer, Unit> function3, int i2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32) {
        super(2);
        this.$sheetOffset = function0;
        this.$topBar = function2;
        this.$floatingActionButton = function22;
        this.$floatingActionButtonPosition = i;
        this.$sheetPeekHeight = f;
        this.$snackbarHost = function23;
        this.$sheetState = bottomSheetState;
        this.$bottomSheet = function3;
        this.$$dirty = i2;
        this.$body = function32;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1273invoke0kLqBqw(subcomposeMeasureScope, constraints.m5557unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a A[LOOP:2: B:32:0x0124->B:34:0x012a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0254 A[LOOP:4: B:86:0x024e->B:88:0x0254, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026d  */
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult m1273invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
        ArrayList arrayList;
        int i;
        Function2<Composer, Integer, Unit> function2;
        ArrayList arrayList2;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList3;
        Object obj;
        Object obj2;
        int i7;
        int i8;
        float f2;
        Object obj3;
        Object obj4;
        Object obj5;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j);
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        long m5542copyZbe2FdA$default = Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<Measurable> subcompose = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Sheet, ComposableLambdaKt.composableLambdaInstance(835355605, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceables$1(this.$bottomSheet, m5550getMaxHeightimpl, this.$$dirty)));
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
        for (Measurable measurable : subcompose) {
            arrayList4.add(measurable.mo4545measureBRTryo0(m5542copyZbe2FdA$default));
        }
        ArrayList arrayList5 = arrayList4;
        int roundToInt = MathKt.roundToInt(this.$sheetOffset.invoke().floatValue());
        Function2<Composer, Integer, Unit> function22 = this.$topBar;
        if (function22 != null) {
            List<Measurable> subcompose2 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, function22);
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose2, 10));
            for (Measurable measurable2 : subcompose2) {
                arrayList6.add(measurable2.mo4545measureBRTryo0(m5542copyZbe2FdA$default));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                obj5 = null;
            } else {
                obj5 = arrayList.get(0);
                int height = ((Placeable) obj5).getHeight();
                int lastIndex = CollectionsKt.getLastIndex(arrayList);
                if (1 <= lastIndex) {
                    int i9 = 1;
                    while (true) {
                        Object obj6 = arrayList.get(i9);
                        int height2 = ((Placeable) obj6).getHeight();
                        if (height < height2) {
                            height = height2;
                            obj5 = obj6;
                        }
                        if (i9 == lastIndex) {
                            break;
                        }
                        i9++;
                    }
                }
            }
            Placeable placeable = (Placeable) obj5;
            if (placeable != null) {
                i = placeable.getHeight();
                long m5542copyZbe2FdA$default2 = Constraints.m5542copyZbe2FdA$default(m5542copyZbe2FdA$default, 0, 0, 0, m5550getMaxHeightimpl - i, 7, null);
                int i10 = i;
                List<Measurable> subcompose3 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Body, ComposableLambdaKt.composableLambdaInstance(-2019457358, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceables$1(this.$body, this.$sheetPeekHeight, this.$$dirty)));
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose3, 10));
                for (Measurable measurable3 : subcompose3) {
                    arrayList7.add(measurable3.mo4545measureBRTryo0(m5542copyZbe2FdA$default2));
                }
                ArrayList arrayList8 = arrayList7;
                function2 = this.$floatingActionButton;
                if (function2 == null) {
                    List<Measurable> subcompose4 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Fab, function2);
                    ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose4, 10));
                    for (Measurable measurable4 : subcompose4) {
                        arrayList9.add(measurable4.mo4545measureBRTryo0(m5542copyZbe2FdA$default));
                    }
                    arrayList2 = arrayList9;
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        obj4 = null;
                    } else {
                        obj4 = arrayList2.get(0);
                        int width = ((Placeable) obj4).getWidth();
                        int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                        if (1 <= lastIndex2) {
                            int i11 = 1;
                            while (true) {
                                Object obj7 = arrayList2.get(i11);
                                Object obj8 = obj4;
                                int width2 = ((Placeable) obj7).getWidth();
                                if (width < width2) {
                                    width = width2;
                                    obj4 = obj7;
                                } else {
                                    obj4 = obj8;
                                }
                                if (i11 == lastIndex2) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    Placeable placeable2 = (Placeable) obj4;
                    if (placeable2 != null) {
                        i2 = placeable2.getWidth();
                        if (arrayList2 != null) {
                            if (arrayList2.isEmpty()) {
                                obj3 = null;
                            } else {
                                obj3 = arrayList2.get(0);
                                int height3 = ((Placeable) obj3).getHeight();
                                int lastIndex3 = CollectionsKt.getLastIndex(arrayList2);
                                if (1 <= lastIndex3) {
                                    int i12 = 1;
                                    while (true) {
                                        Object obj9 = arrayList2.get(i12);
                                        Object obj10 = obj3;
                                        int height4 = ((Placeable) obj9).getHeight();
                                        if (height3 < height4) {
                                            height3 = height4;
                                            obj3 = obj9;
                                        } else {
                                            obj3 = obj10;
                                        }
                                        if (i12 == lastIndex3) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            }
                            Placeable placeable3 = (Placeable) obj3;
                            if (placeable3 != null) {
                                i3 = placeable3.getHeight();
                                if (FabPosition.m1375equalsimpl0(this.$floatingActionButtonPosition, FabPosition.Companion.m1379getCenter5ygKITE())) {
                                    f = BottomSheetScaffoldKt.FabSpacing;
                                    i4 = (m5551getMaxWidthimpl - i2) - SubcomposeLayout.mo582roundToPx0680j_4(f);
                                } else {
                                    i4 = (m5551getMaxWidthimpl - i2) / 2;
                                }
                                int i13 = i4;
                                i5 = i3 / 2;
                                if (SubcomposeLayout.mo588toPx0680j_4(this.$sheetPeekHeight) >= i5) {
                                    int i14 = roundToInt - i3;
                                    f2 = BottomSheetScaffoldKt.FabSpacing;
                                    i6 = i14 - SubcomposeLayout.mo582roundToPx0680j_4(f2);
                                } else {
                                    i6 = roundToInt - i5;
                                }
                                int i15 = i6;
                                List<Measurable> subcompose5 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost);
                                ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose5, 10));
                                for (Measurable measurable5 : subcompose5) {
                                    arrayList10.add(measurable5.mo4545measureBRTryo0(m5542copyZbe2FdA$default));
                                }
                                arrayList3 = arrayList10;
                                if (arrayList3.isEmpty()) {
                                    obj = arrayList3.get(0);
                                    int width3 = ((Placeable) obj).getWidth();
                                    int lastIndex4 = CollectionsKt.getLastIndex(arrayList3);
                                    if (1 <= lastIndex4) {
                                        int i16 = 1;
                                        while (true) {
                                            Object obj11 = arrayList3.get(i16);
                                            int width4 = ((Placeable) obj11).getWidth();
                                            if (width3 < width4) {
                                                width3 = width4;
                                                obj = obj11;
                                            }
                                            if (i16 == lastIndex4) {
                                                break;
                                            }
                                            i16++;
                                        }
                                    }
                                } else {
                                    obj = null;
                                }
                                Placeable placeable4 = (Placeable) obj;
                                int width5 = placeable4 == null ? placeable4.getWidth() : 0;
                                if (arrayList3.isEmpty()) {
                                    Object obj12 = arrayList3.get(0);
                                    int height5 = ((Placeable) obj12).getHeight();
                                    int lastIndex5 = CollectionsKt.getLastIndex(arrayList3);
                                    if (1 <= lastIndex5) {
                                        int i17 = height5;
                                        Object obj13 = obj12;
                                        int i18 = 1;
                                        while (true) {
                                            Object obj14 = arrayList3.get(i18);
                                            int height6 = ((Placeable) obj14).getHeight();
                                            if (i17 < height6) {
                                                i17 = height6;
                                                obj13 = obj14;
                                            }
                                            if (i18 == lastIndex5) {
                                                break;
                                            }
                                            i18++;
                                        }
                                        obj2 = obj13;
                                    } else {
                                        obj2 = obj12;
                                    }
                                } else {
                                    obj2 = null;
                                }
                                Placeable placeable5 = (Placeable) obj2;
                                int height7 = placeable5 == null ? placeable5.getHeight() : 0;
                                int i19 = (m5551getMaxWidthimpl - width5) / 2;
                                i7 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
                                if (i7 != 1) {
                                    i8 = i15 - height7;
                                } else if (i7 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    i8 = m5550getMaxHeightimpl - height7;
                                }
                                return MeasureScope.CC.layout$default(SubcomposeLayout, m5551getMaxWidthimpl, m5550getMaxHeightimpl, null, new AnonymousClass1(arrayList8, arrayList, arrayList5, arrayList2, arrayList3, i10, roundToInt, i13, i15, i19, i8), 4, null);
                            }
                        }
                        i3 = 0;
                        if (FabPosition.m1375equalsimpl0(this.$floatingActionButtonPosition, FabPosition.Companion.m1379getCenter5ygKITE())) {
                        }
                        int i132 = i4;
                        i5 = i3 / 2;
                        if (SubcomposeLayout.mo588toPx0680j_4(this.$sheetPeekHeight) >= i5) {
                        }
                        int i152 = i6;
                        List<Measurable> subcompose52 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost);
                        ArrayList arrayList102 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose52, 10));
                        while (r8.hasNext()) {
                        }
                        arrayList3 = arrayList102;
                        if (arrayList3.isEmpty()) {
                        }
                        Placeable placeable42 = (Placeable) obj;
                        if (placeable42 == null) {
                        }
                        if (arrayList3.isEmpty()) {
                        }
                        Placeable placeable52 = (Placeable) obj2;
                        if (placeable52 == null) {
                        }
                        int i192 = (m5551getMaxWidthimpl - width5) / 2;
                        i7 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
                        if (i7 != 1) {
                        }
                        return MeasureScope.CC.layout$default(SubcomposeLayout, m5551getMaxWidthimpl, m5550getMaxHeightimpl, null, new AnonymousClass1(arrayList8, arrayList, arrayList5, arrayList2, arrayList3, i10, roundToInt, i132, i152, i192, i8), 4, null);
                    }
                }
                i2 = 0;
                if (arrayList2 != null) {
                }
                i3 = 0;
                if (FabPosition.m1375equalsimpl0(this.$floatingActionButtonPosition, FabPosition.Companion.m1379getCenter5ygKITE())) {
                }
                int i1322 = i4;
                i5 = i3 / 2;
                if (SubcomposeLayout.mo588toPx0680j_4(this.$sheetPeekHeight) >= i5) {
                }
                int i1522 = i6;
                List<Measurable> subcompose522 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost);
                ArrayList arrayList1022 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose522, 10));
                while (r8.hasNext()) {
                }
                arrayList3 = arrayList1022;
                if (arrayList3.isEmpty()) {
                }
                Placeable placeable422 = (Placeable) obj;
                if (placeable422 == null) {
                }
                if (arrayList3.isEmpty()) {
                }
                Placeable placeable522 = (Placeable) obj2;
                if (placeable522 == null) {
                }
                int i1922 = (m5551getMaxWidthimpl - width5) / 2;
                i7 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
                if (i7 != 1) {
                }
                return MeasureScope.CC.layout$default(SubcomposeLayout, m5551getMaxWidthimpl, m5550getMaxHeightimpl, null, new AnonymousClass1(arrayList8, arrayList, arrayList5, arrayList2, arrayList3, i10, roundToInt, i1322, i1522, i1922, i8), 4, null);
            }
        }
        i = 0;
        long m5542copyZbe2FdA$default22 = Constraints.m5542copyZbe2FdA$default(m5542copyZbe2FdA$default, 0, 0, 0, m5550getMaxHeightimpl - i, 7, null);
        int i102 = i;
        List<Measurable> subcompose32 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Body, ComposableLambdaKt.composableLambdaInstance(-2019457358, true, new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceables$1(this.$body, this.$sheetPeekHeight, this.$$dirty)));
        ArrayList arrayList72 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose32, 10));
        while (r8.hasNext()) {
        }
        ArrayList arrayList82 = arrayList72;
        function2 = this.$floatingActionButton;
        if (function2 == null) {
        }
        if (arrayList2 != null) {
        }
        i2 = 0;
        if (arrayList2 != null) {
        }
        i3 = 0;
        if (FabPosition.m1375equalsimpl0(this.$floatingActionButtonPosition, FabPosition.Companion.m1379getCenter5ygKITE())) {
        }
        int i13222 = i4;
        i5 = i3 / 2;
        if (SubcomposeLayout.mo588toPx0680j_4(this.$sheetPeekHeight) >= i5) {
        }
        int i15222 = i6;
        List<Measurable> subcompose5222 = SubcomposeLayout.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost);
        ArrayList arrayList10222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose5222, 10));
        while (r8.hasNext()) {
        }
        arrayList3 = arrayList10222;
        if (arrayList3.isEmpty()) {
        }
        Placeable placeable4222 = (Placeable) obj;
        if (placeable4222 == null) {
        }
        if (arrayList3.isEmpty()) {
        }
        Placeable placeable5222 = (Placeable) obj2;
        if (placeable5222 == null) {
        }
        int i19222 = (m5551getMaxWidthimpl - width5) / 2;
        i7 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
        if (i7 != 1) {
        }
        return MeasureScope.CC.layout$default(SubcomposeLayout, m5551getMaxWidthimpl, m5550getMaxHeightimpl, null, new AnonymousClass1(arrayList82, arrayList, arrayList5, arrayList2, arrayList3, i102, roundToInt, i13222, i15222, i19222, i8), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ List<Placeable> $bodyPlaceables;
        final /* synthetic */ int $fabOffsetX;
        final /* synthetic */ int $fabOffsetY;
        final /* synthetic */ List<Placeable> $fabPlaceable;
        final /* synthetic */ int $sheetOffsetY;
        final /* synthetic */ List<Placeable> $sheetPlaceables;
        final /* synthetic */ int $snackbarOffsetX;
        final /* synthetic */ int $snackbarOffsetY;
        final /* synthetic */ List<Placeable> $snackbarPlaceables;
        final /* synthetic */ int $topBarHeight;
        final /* synthetic */ List<Placeable> $topBarPlaceables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends Placeable> list, List<? extends Placeable> list2, List<? extends Placeable> list3, List<? extends Placeable> list4, List<? extends Placeable> list5, int i, int i2, int i3, int i4, int i5, int i6) {
            super(1);
            this.$bodyPlaceables = list;
            this.$topBarPlaceables = list2;
            this.$sheetPlaceables = list3;
            this.$fabPlaceable = list4;
            this.$snackbarPlaceables = list5;
            this.$topBarHeight = i;
            this.$sheetOffsetY = i2;
            this.$fabOffsetX = i3;
            this.$fabOffsetY = i4;
            this.$snackbarOffsetX = i5;
            this.$snackbarOffsetY = i6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Placeable> list = this.$bodyPlaceables;
            int i = this.$topBarHeight;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i2), 0, i, 0.0f, 4, null);
            }
            List<Placeable> list2 = this.$topBarPlaceables;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Placeable.PlacementScope.placeRelative$default(layout, list2.get(i3), 0, 0, 0.0f, 4, null);
                }
            }
            List<Placeable> list3 = this.$sheetPlaceables;
            int i4 = this.$sheetOffsetY;
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                Placeable.PlacementScope.placeRelative$default(layout, list3.get(i5), 0, i4, 0.0f, 4, null);
            }
            List<Placeable> list4 = this.$fabPlaceable;
            if (list4 != null) {
                int i6 = this.$fabOffsetX;
                int i7 = this.$fabOffsetY;
                int size4 = list4.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    Placeable.PlacementScope.placeRelative$default(layout, list4.get(i8), i6, i7, 0.0f, 4, null);
                }
            }
            List<Placeable> list5 = this.$snackbarPlaceables;
            int i9 = this.$snackbarOffsetX;
            int i10 = this.$snackbarOffsetY;
            int size5 = list5.size();
            for (int i11 = 0; i11 < size5; i11++) {
                Placeable.PlacementScope.placeRelative$default(layout, list5.get(i11), i9, i10, 0.0f, 4, null);
            }
        }
    }
}
