package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Flow.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FlowKt$Flow$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ FlowCrossAxisAlignment $crossAxisAlignment;
    final /* synthetic */ List<Integer> $crossAxisPositions;
    final /* synthetic */ List<Integer> $crossAxisSizes;
    final /* synthetic */ MainAxisAlignment $lastLineMainAxisAlignment;
    final /* synthetic */ MainAxisAlignment $mainAxisAlignment;
    final /* synthetic */ int $mainAxisLayoutSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ LayoutOrientation $orientation;
    final /* synthetic */ List<List<Placeable>> $sequences;
    final /* synthetic */ MeasureScope $this_Layout;

    /* compiled from: Flow.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowCrossAxisAlignment.values().length];
            try {
                iArr[FlowCrossAxisAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowCrossAxisAlignment.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowCrossAxisAlignment.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt$Flow$1$measure$1(List<List<Placeable>> list, MeasureScope measureScope, float f, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, LayoutOrientation layoutOrientation, int i, FlowCrossAxisAlignment flowCrossAxisAlignment, List<Integer> list2, List<Integer> list3) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = measureScope;
        this.$mainAxisSpacing = f;
        this.$mainAxisAlignment = mainAxisAlignment;
        this.$lastLineMainAxisAlignment = mainAxisAlignment2;
        this.$orientation = layoutOrientation;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisAlignment = flowCrossAxisAlignment;
        this.$crossAxisSizes = list2;
        this.$crossAxisPositions = list3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Arrangement.Vertical arrangement$flowlayout_release;
        boolean z;
        int i;
        FlowCrossAxisAlignment flowCrossAxisAlignment;
        List<Integer> list;
        int i2;
        List<Integer> list2;
        int Flow_F4y8cZ0$crossAxisSize;
        int Flow_F4y8cZ0$crossAxisSize2;
        int Flow_F4y8cZ0$mainAxisSize;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        List<List<Placeable>> list3 = this.$sequences;
        MeasureScope measureScope = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        MainAxisAlignment mainAxisAlignment = this.$mainAxisAlignment;
        MainAxisAlignment mainAxisAlignment2 = this.$lastLineMainAxisAlignment;
        LayoutOrientation layoutOrientation = this.$orientation;
        int i3 = this.$mainAxisLayoutSize;
        FlowCrossAxisAlignment flowCrossAxisAlignment2 = this.$crossAxisAlignment;
        List<Integer> list4 = this.$crossAxisSizes;
        List<Integer> list5 = this.$crossAxisPositions;
        int i4 = 0;
        for (Object obj : list3) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List list6 = (List) obj;
            int size = list6.size();
            int[] iArr = new int[size];
            int i6 = 0;
            while (i6 < size) {
                Flow_F4y8cZ0$mainAxisSize = FlowKt.Flow_F4y8cZ0$mainAxisSize((Placeable) list6.get(i6), layoutOrientation);
                List<Integer> list7 = list5;
                iArr[i6] = Flow_F4y8cZ0$mainAxisSize + (i6 < CollectionsKt.getLastIndex(list6) ? measureScope.mo582roundToPx0680j_4(f) : 0);
                i6++;
                list5 = list7;
            }
            List<Integer> list8 = list5;
            if (i4 < CollectionsKt.getLastIndex(list3)) {
                arrangement$flowlayout_release = mainAxisAlignment.getArrangement$flowlayout_release();
            } else {
                arrangement$flowlayout_release = mainAxisAlignment2.getArrangement$flowlayout_release();
            }
            int[] iArr2 = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr2[i7] = 0;
            }
            arrangement$flowlayout_release.arrange(measureScope, i3, iArr, iArr2);
            int i8 = 0;
            for (Object obj2 : list6) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Placeable placeable = (Placeable) obj2;
                int i10 = WhenMappings.$EnumSwitchMapping$0[flowCrossAxisAlignment2.ordinal()];
                if (i10 == 1) {
                    z = false;
                    i = 0;
                } else if (i10 == 2) {
                    z = false;
                    int intValue = list4.get(i4).intValue();
                    Flow_F4y8cZ0$crossAxisSize = FlowKt.Flow_F4y8cZ0$crossAxisSize(placeable, layoutOrientation);
                    i = intValue - Flow_F4y8cZ0$crossAxisSize;
                } else if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    Alignment center = Alignment.Companion.getCenter();
                    long m5772getZeroYbymL2g = IntSize.Companion.m5772getZeroYbymL2g();
                    int intValue2 = list4.get(i4).intValue();
                    Flow_F4y8cZ0$crossAxisSize2 = FlowKt.Flow_F4y8cZ0$crossAxisSize(placeable, layoutOrientation);
                    int i11 = intValue2 - Flow_F4y8cZ0$crossAxisSize2;
                    z = false;
                    i = IntOffset.m5726getYimpl(center.mo2908alignKFBX0sM(m5772getZeroYbymL2g, IntSizeKt.IntSize(0, i11), LayoutDirection.Ltr));
                }
                if (layoutOrientation == LayoutOrientation.Horizontal) {
                    int i12 = iArr2[i8];
                    List<Integer> list9 = list8;
                    list = list4;
                    flowCrossAxisAlignment = flowCrossAxisAlignment2;
                    Placeable.PlacementScope.place$default(layout, placeable, i12, list9.get(i4).intValue() + i, 0.0f, 4, null);
                    i2 = i4;
                    list2 = list9;
                } else {
                    flowCrossAxisAlignment = flowCrossAxisAlignment2;
                    List<Integer> list10 = list8;
                    list = list4;
                    int i13 = i4;
                    i2 = i13;
                    list2 = list10;
                    Placeable.PlacementScope.place$default(layout, placeable, list10.get(i13).intValue() + i, iArr2[i8], 0.0f, 4, null);
                }
                list4 = list;
                i8 = i9;
                flowCrossAxisAlignment2 = flowCrossAxisAlignment;
                i4 = i2;
                list8 = list2;
            }
            i4 = i5;
            list5 = list8;
        }
    }
}
