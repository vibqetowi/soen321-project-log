package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
/* compiled from: LazyGridMeasure.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\bH\u0083\bø\u0001\u0000\u001a\u008c\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001aè\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012/\u00101\u001a+\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002040\b¢\u0006\u0002\b5\u0012\u0004\u0012\u00020602H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"calculateExtraItems", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "pinnedItems", "", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "itemConstraints", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Constraints;", "filter", "", "calculateItemsOffsets", "", "lines", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "isVertical", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "measureLazyGrid", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "itemsCount", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "scrollToBeConsumed", "", "constraints", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", TtmlNode.TAG_LAYOUT, "Lkotlin/Function3;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyGrid-ZRKPzZ8", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Ljava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i, boolean z, int i2) {
        return !z ? i : (i2 - i) - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* renamed from: measureLazyGrid-ZRKPzZ8  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LazyGridMeasureResult m883measureLazyGridZRKPzZ8(int i, LazyGridMeasuredLineProvider measuredLineProvider, LazyGridMeasuredItemProvider measuredItemProvider, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LazyGridItemPlacementAnimator placementAnimator, LazyGridSpanLayoutProvider spanLayoutProvider, List<Integer> pinnedItems, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int m5565constrainWidthK40F9xA;
        int m5550getMaxHeightimpl;
        ArrayList arrayList;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f2;
        int i21;
        int i22;
        int i23;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i24;
        int i25;
        Intrinsics.checkNotNullParameter(measuredLineProvider, "measuredLineProvider");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i <= 0) {
            return new LazyGridMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m5553getMinWidthimpl(j)), Integer.valueOf(Constraints.m5552getMinHeightimpl(j)), LazyGridMeasureKt$measureLazyGrid$1.INSTANCE), CollectionsKt.emptyList(), -i3, i2 + i4, 0, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
        }
        int roundToInt = MathKt.roundToInt(f);
        int i26 = i7 - roundToInt;
        if (i6 == 0 && i26 < 0) {
            roundToInt += i26;
            i26 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i27 = -i3;
        int i28 = i27 + (i5 < 0 ? i5 : 0);
        int i29 = i26 + i28;
        int i30 = i6;
        while (i29 < 0 && i30 > 0) {
            int i31 = i30 - 1;
            LazyGridMeasuredLine andMeasure = measuredLineProvider.getAndMeasure(i31);
            arrayDeque.add(0, andMeasure);
            i29 += andMeasure.getMainAxisSizeWithSpacings();
            i30 = i31;
        }
        if (i29 < i28) {
            roundToInt += i29;
            i29 = i28;
        }
        int i32 = i29 - i28;
        int i33 = i2 + i4;
        int i34 = i27;
        int coerceAtLeast = RangesKt.coerceAtLeast(i33, 0);
        int i35 = -i32;
        ArrayDeque arrayDeque2 = arrayDeque;
        int i36 = i33;
        int size = arrayDeque2.size();
        int i37 = i35;
        int i38 = i30;
        for (int i39 = 0; i39 < size; i39++) {
            i38++;
            i37 += ((LazyGridMeasuredLine) arrayDeque2.get(i39)).getMainAxisSizeWithSpacings();
        }
        int i40 = i32;
        int i41 = i37;
        int i42 = i38;
        while (i42 < i && (i41 < coerceAtLeast || i41 <= 0 || arrayDeque.isEmpty())) {
            int i43 = coerceAtLeast;
            LazyGridMeasuredLine andMeasure2 = measuredLineProvider.getAndMeasure(i42);
            if (andMeasure2.isEmpty()) {
                break;
            }
            int mainAxisSizeWithSpacings = i41 + andMeasure2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings <= i28) {
                i24 = i28;
                i25 = mainAxisSizeWithSpacings;
                if (((LazyGridMeasuredItem) ArraysKt.last(andMeasure2.getItems())).getIndex() != i - 1) {
                    i40 -= andMeasure2.getMainAxisSizeWithSpacings();
                    i30 = i42 + 1;
                    i42++;
                    coerceAtLeast = i43;
                    i41 = i25;
                    i28 = i24;
                }
            } else {
                i24 = i28;
                i25 = mainAxisSizeWithSpacings;
            }
            arrayDeque.add(andMeasure2);
            i42++;
            coerceAtLeast = i43;
            i41 = i25;
            i28 = i24;
        }
        if (i41 < i2) {
            int i44 = i2 - i41;
            i40 -= i44;
            i41 += i44;
            while (i40 < i3 && i30 > 0) {
                int i45 = i30 - 1;
                LazyGridMeasuredLine andMeasure3 = measuredLineProvider.getAndMeasure(i45);
                arrayDeque.add(0, andMeasure3);
                i40 += andMeasure3.getMainAxisSizeWithSpacings();
                i30 = i45;
            }
            i8 = 0;
            roundToInt += i44;
            if (i40 < 0) {
                roundToInt += i40;
                i41 += i40;
                i9 = 0;
                int i46 = i41;
                float f3 = (MathKt.getSign(MathKt.roundToInt(f)) == MathKt.getSign(roundToInt) || Math.abs(MathKt.roundToInt(f)) < Math.abs(roundToInt)) ? f : roundToInt;
                if ((i9 < 0 ? 1 : i8) != 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i47 = -i9;
                LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.first();
                LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine.getItems());
                int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : i8;
                LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
                if (lazyGridMeasuredLine2 == null || (items = lazyGridMeasuredLine2.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) {
                    i10 = i8;
                    i11 = i9;
                } else {
                    i11 = i9;
                    i10 = lazyGridMeasuredItem.getIndex();
                }
                int size2 = pinnedItems.size();
                ArrayList arrayList2 = null;
                List list = null;
                while (i8 < size2) {
                    int i48 = i47;
                    int intValue = pinnedItems.get(i8).intValue();
                    if (intValue >= 0 && intValue < index) {
                        i18 = index;
                        i19 = i8;
                        i17 = i36;
                        i20 = i46;
                        f2 = f3;
                        i21 = size2;
                        i22 = i34;
                        i23 = i11;
                        LazyGridMeasuredItem m886getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m886getAndMeasure3p2s80s$default(measuredItemProvider, intValue, 0, measuredLineProvider.m889itemConstraintsOenEA2s(intValue), 2, null);
                        ArrayList arrayList3 = list == null ? new ArrayList() : list;
                        arrayList3.add(m886getAndMeasure3p2s80s$default);
                        list = arrayList3;
                    } else {
                        i17 = i36;
                        i18 = index;
                        i19 = i8;
                        i20 = i46;
                        f2 = f3;
                        i21 = size2;
                        i22 = i34;
                        i23 = i11;
                    }
                    i8 = i19 + 1;
                    i11 = i23;
                    size2 = i21;
                    i47 = i48;
                    i34 = i22;
                    index = i18;
                    i36 = i17;
                    f3 = f2;
                    i46 = i20;
                }
                int i49 = i36;
                int i50 = index;
                int i51 = i47;
                int i52 = i46;
                float f4 = f3;
                int i53 = i34;
                int i54 = i11;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                List list2 = list;
                int size3 = pinnedItems.size();
                int i55 = 0;
                while (i55 < size3) {
                    int intValue2 = pinnedItems.get(i55).intValue();
                    int i56 = i10;
                    if (i56 + 1 <= intValue2 && intValue2 < i) {
                        i14 = i55;
                        i15 = i56;
                        i16 = size3;
                        LazyGridMeasuredItem m886getAndMeasure3p2s80s$default2 = LazyGridMeasuredItemProvider.m886getAndMeasure3p2s80s$default(measuredItemProvider, intValue2, 0, measuredLineProvider.m889itemConstraintsOenEA2s(intValue2), 2, null);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        List list3 = arrayList2;
                        list3.add(m886getAndMeasure3p2s80s$default2);
                        arrayList2 = list3;
                    } else {
                        i14 = i55;
                        i15 = i56;
                        i16 = size3;
                    }
                    i55 = i14 + 1;
                    size3 = i16;
                    i10 = i15;
                }
                int i57 = i10;
                if (arrayList2 == null) {
                    arrayList2 = CollectionsKt.emptyList();
                }
                List list4 = arrayList2;
                if (i3 > 0 || i5 < 0) {
                    int size4 = arrayDeque.size();
                    int i58 = i54;
                    int i59 = 0;
                    while (i59 < size4) {
                        int mainAxisSizeWithSpacings2 = ((LazyGridMeasuredLine) arrayDeque.get(i59)).getMainAxisSizeWithSpacings();
                        if (i58 == 0 || mainAxisSizeWithSpacings2 > i58 || i59 == CollectionsKt.getLastIndex(arrayDeque2)) {
                            break;
                        }
                        i58 -= mainAxisSizeWithSpacings2;
                        i59++;
                        lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.get(i59);
                    }
                    i12 = i58;
                } else {
                    i12 = i54;
                }
                LazyGridMeasuredLine lazyGridMeasuredLine3 = lazyGridMeasuredLine;
                if (z) {
                    m5565constrainWidthK40F9xA = Constraints.m5551getMaxWidthimpl(j);
                    i13 = i52;
                } else {
                    i13 = i52;
                    m5565constrainWidthK40F9xA = ConstraintsKt.m5565constrainWidthK40F9xA(j, i13);
                }
                if (z) {
                    m5550getMaxHeightimpl = ConstraintsKt.m5564constrainHeightK40F9xA(j, i13);
                } else {
                    m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j);
                }
                List<LazyGridMeasuredItem> calculateItemsOffsets = calculateItemsOffsets(arrayDeque2, list2, list4, m5565constrainWidthK40F9xA, m5550getMaxHeightimpl, i13, i2, i51, z, vertical, horizontal, z2, density);
                placementAnimator.onMeasured((int) f4, m5565constrainWidthK40F9xA, m5550getMaxHeightimpl, calculateItemsOffsets, measuredItemProvider, spanLayoutProvider, z);
                boolean z3 = i57 != i + (-1) || i13 > i2;
                MeasureResult invoke = layout.invoke(Integer.valueOf(m5565constrainWidthK40F9xA), Integer.valueOf(m5550getMaxHeightimpl), new LazyGridMeasureKt$measureLazyGrid$3(calculateItemsOffsets));
                if (list2.isEmpty() && list4.isEmpty()) {
                    arrayList = calculateItemsOffsets;
                } else {
                    ArrayList arrayList4 = new ArrayList(calculateItemsOffsets.size());
                    int size5 = calculateItemsOffsets.size();
                    int i60 = 0;
                    while (i60 < size5) {
                        LazyGridMeasuredItem lazyGridMeasuredItem3 = calculateItemsOffsets.get(i60);
                        int index2 = lazyGridMeasuredItem3.getIndex();
                        int i61 = i50;
                        if (i61 <= index2 && index2 <= i57) {
                            arrayList4.add(lazyGridMeasuredItem3);
                        }
                        i60++;
                        i50 = i61;
                    }
                    arrayList = arrayList4;
                }
                return new LazyGridMeasureResult(lazyGridMeasuredLine3, i12, z3, f4, invoke, arrayList, i53, i49, i, z2, z ? Orientation.Vertical : Orientation.Horizontal, i4, i5);
            }
        } else {
            i8 = 0;
        }
        i9 = i40;
        int i462 = i41;
        if (MathKt.getSign(MathKt.roundToInt(f)) == MathKt.getSign(roundToInt)) {
        }
        if ((i9 < 0 ? 1 : i8) != 0) {
        }
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density) {
        int i6 = z ? i2 : i;
        boolean z3 = true;
        boolean z4 = i3 < Math.min(i6, i4);
        if (z4) {
            if (!(i5 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += list.get(i8).getItems().length;
        }
        ArrayList arrayList = new ArrayList(i7);
        if (z4) {
            if (!((list2.isEmpty() && list3.isEmpty()) ? false : false)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(calculateItemsOffsets$reverseAware(i9, z2, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                iArr2[i10] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i6, iArr, iArr2);
            } else if (horizontal == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else {
                horizontal.arrange(density, i6, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int i11 = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z2, size2));
                    if (z2) {
                        i11 = (i6 - i11) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    CollectionsKt.addAll(arrayList, lazyGridMeasuredLine.position(i11, i, i2));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int i12 = i5;
            int i13 = 0;
            while (i13 < size3) {
                LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(i13);
                int mainAxisSizeWithSpacings = i12 - lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                lazyGridMeasuredItem.position(mainAxisSizeWithSpacings, 0, i, i2, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
                arrayList.add(lazyGridMeasuredItem);
                i13++;
                i12 = mainAxisSizeWithSpacings;
            }
            int size4 = list.size();
            int i14 = i5;
            for (int i15 = 0; i15 < size4; i15++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i15);
                CollectionsKt.addAll(arrayList, lazyGridMeasuredLine2.position(i14, i, i2));
                i14 += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int i16 = i14;
            int i17 = 0;
            for (int size5 = list3.size(); i17 < size5; size5 = size5) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i17);
                lazyGridMeasuredItem2.position(i16, 0, i, i2, (r16 & 16) != 0 ? -1 : 0, (r16 & 32) != 0 ? -1 : 0);
                arrayList.add(lazyGridMeasuredItem2);
                i16 += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
                i17++;
            }
        }
        return arrayList;
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, Function1<? super Integer, Constraints> function1, Function1<? super Integer, Boolean> function12) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int intValue = list.get(i).intValue();
            if (function12.invoke(Integer.valueOf(intValue)).booleanValue()) {
                LazyGridMeasuredItem m886getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m886getAndMeasure3p2s80s$default(lazyGridMeasuredItemProvider, intValue, 0, function1.invoke(Integer.valueOf(intValue)).m5557unboximpl(), 2, null);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m886getAndMeasure3p2s80s$default);
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
