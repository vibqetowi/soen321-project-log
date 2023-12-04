package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyStaggeredGridItemPlacementAnimator.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002JD\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0004J\u0006\u0010(\u001a\u00020\u001cJ\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002J!\u0010*\u001a\u00020\u001c*\u00020\u000f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0,H\u0082\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u000bj\b\u0012\u0004\u0012\u00020\u0001`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "", "()V", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/staggeredgrid/ItemInfo;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;)Z", "node", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "getNode", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "initializeNode", "", "item", "mainAxisOffset", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "isVertical", "laneCount", "reset", "startAnimationsIfNeeded", "forEachNode", "block", "Lkotlin/Function1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridItemPlacementAnimator {
    private int firstVisibleIndex;
    private final Map<Object, ItemInfo> keyToItemInfoMap = new LinkedHashMap();
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.Empty;
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyStaggeredGridMeasuredItem> movingInFromStartBound = new ArrayList();
    private final List<LazyStaggeredGridMeasuredItem> movingInFromEndBound = new ArrayList();
    private final List<LazyStaggeredGridMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyStaggeredGridMeasuredItem> movingAwayToEndBound = new ArrayList();

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }

    private final void initializeNode(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem, int i) {
        long m5721copyiSbpLlY$default;
        long mo930getOffsetnOccac = lazyStaggeredGridMeasuredItem.mo930getOffsetnOccac();
        if (lazyStaggeredGridMeasuredItem.isVertical()) {
            m5721copyiSbpLlY$default = IntOffset.m5721copyiSbpLlY$default(mo930getOffsetnOccac, 0, i, 1, null);
        } else {
            m5721copyiSbpLlY$default = IntOffset.m5721copyiSbpLlY$default(mo930getOffsetnOccac, i, 0, 2, null);
        }
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyStaggeredGridMeasuredItem.getParentData(i2));
            if (node != null) {
                long mo930getOffsetnOccac2 = lazyStaggeredGridMeasuredItem.mo930getOffsetnOccac();
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(mo930getOffsetnOccac2) - IntOffset.m5725getXimpl(mo930getOffsetnOccac), IntOffset.m5726getYimpl(mo930getOffsetnOccac2) - IntOffset.m5726getYimpl(mo930getOffsetnOccac));
                node.m895setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(m5721copyiSbpLlY$default) + IntOffset.m5725getXimpl(IntOffset), IntOffset.m5726getYimpl(m5721copyiSbpLlY$default) + IntOffset.m5726getYimpl(IntOffset)));
            }
        }
    }

    private final LazyLayoutAnimateItemModifierNode getNode(Object obj) {
        if (obj instanceof LazyLayoutAnimateItemModifierNode) {
            return (LazyLayoutAnimateItemModifierNode) obj;
        }
        return null;
    }

    private final void forEachNode(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem, Function1<? super LazyLayoutAnimateItemModifierNode, Unit> function1) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyStaggeredGridMeasuredItem.getParentData(i));
            if (node != null) {
                function1.invoke(node);
            }
        }
    }

    public final void onMeasured(int i, int i2, int i3, List<LazyStaggeredGridMeasuredItem> list, LazyStaggeredGridMeasureProvider itemProvider, boolean z, int i4) {
        boolean z2;
        long IntOffset;
        List<LazyStaggeredGridMeasuredItem> list2;
        int i5;
        int i6;
        int i7;
        int i8;
        List<LazyStaggeredGridMeasuredItem> positionedItems = list;
        int i9 = i4;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z2 = false;
                break;
            } else if (getHasAnimations(positionedItems.get(i10))) {
                z2 = true;
                break;
            } else {
                i10++;
            }
        }
        if (!z2 && this.keyToItemInfoMap.isEmpty()) {
            reset();
            return;
        }
        int i11 = this.firstVisibleIndex;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) CollectionsKt.firstOrNull((List<? extends Object>) list);
        this.firstVisibleIndex = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.getIndex() : 0;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.keyIndexMap;
        this.keyIndexMap = itemProvider.getKeyIndexMap();
        int i12 = z ? i3 : i2;
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(0, i);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i, 0);
        }
        this.movingAwayKeys.addAll(this.keyToItemInfoMap.keySet());
        int size2 = list.size();
        int i13 = 0;
        while (i13 < size2) {
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = positionedItems.get(i13);
            this.movingAwayKeys.remove(lazyStaggeredGridMeasuredItem2.getKey());
            if (getHasAnimations(lazyStaggeredGridMeasuredItem2)) {
                ItemInfo itemInfo = this.keyToItemInfoMap.get(lazyStaggeredGridMeasuredItem2.getKey());
                if (itemInfo == null) {
                    i6 = size2;
                    this.keyToItemInfoMap.put(lazyStaggeredGridMeasuredItem2.getKey(), new ItemInfo(lazyStaggeredGridMeasuredItem2.getLane(), lazyStaggeredGridMeasuredItem2.getSpan(), lazyStaggeredGridMeasuredItem2.getCrossAxisOffset()));
                    int index = lazyLayoutKeyIndexMap.getIndex(lazyStaggeredGridMeasuredItem2.getKey());
                    if (index == -1 || lazyStaggeredGridMeasuredItem2.getIndex() == index) {
                        long mo930getOffsetnOccac = lazyStaggeredGridMeasuredItem2.mo930getOffsetnOccac();
                        initializeNode(lazyStaggeredGridMeasuredItem2, lazyStaggeredGridMeasuredItem2.isVertical() ? IntOffset.m5726getYimpl(mo930getOffsetnOccac) : IntOffset.m5725getXimpl(mo930getOffsetnOccac));
                    } else if (index < i11) {
                        this.movingInFromStartBound.add(lazyStaggeredGridMeasuredItem2);
                    } else {
                        this.movingInFromEndBound.add(lazyStaggeredGridMeasuredItem2);
                    }
                    i7 = i13;
                } else {
                    i6 = size2;
                    int placeablesCount = lazyStaggeredGridMeasuredItem2.getPlaceablesCount();
                    int i14 = 0;
                    while (i14 < placeablesCount) {
                        LazyLayoutAnimateItemModifierNode node = getNode(lazyStaggeredGridMeasuredItem2.getParentData(i14));
                        if (node != null) {
                            i8 = i13;
                            if (!IntOffset.m5724equalsimpl0(node.m894getRawOffsetnOccac(), LazyLayoutAnimateItemModifierNode.Companion.m896getNotInitializednOccac())) {
                                long m894getRawOffsetnOccac = node.m894getRawOffsetnOccac();
                                node.m895setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(m894getRawOffsetnOccac) + IntOffset.m5725getXimpl(IntOffset), IntOffset.m5726getYimpl(m894getRawOffsetnOccac) + IntOffset.m5726getYimpl(IntOffset)));
                            }
                        } else {
                            i8 = i13;
                        }
                        i14++;
                        i13 = i8;
                    }
                    i7 = i13;
                    itemInfo.setLane(lazyStaggeredGridMeasuredItem2.getLane());
                    itemInfo.setSpan(lazyStaggeredGridMeasuredItem2.getSpan());
                    itemInfo.setCrossAxisOffset(lazyStaggeredGridMeasuredItem2.getCrossAxisOffset());
                    startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem2);
                }
            } else {
                i6 = size2;
                i7 = i13;
                this.keyToItemInfoMap.remove(lazyStaggeredGridMeasuredItem2.getKey());
            }
            i13 = i7 + 1;
            size2 = i6;
            positionedItems = list;
            i9 = i4;
        }
        int i15 = i9;
        int[] iArr = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr[i16] = 0;
        }
        if (!this.movingInFromStartBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list3 = this.movingInFromStartBound;
            if (list3.size() > 1) {
                CollectionsKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list4 = this.movingInFromStartBound;
            int size3 = list4.size();
            for (int i17 = 0; i17 < size3; i17++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = list4.get(i17);
                int lane = lazyStaggeredGridMeasuredItem3.getLane();
                iArr[lane] = iArr[lane] + lazyStaggeredGridMeasuredItem3.getMainAxisSize();
                initializeNode(lazyStaggeredGridMeasuredItem3, 0 - iArr[lazyStaggeredGridMeasuredItem3.getLane()]);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem3);
            }
            ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        if (!this.movingInFromEndBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list5 = this.movingInFromEndBound;
            if (list5.size() > 1) {
                CollectionsKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list6 = this.movingInFromEndBound;
            int size4 = list6.size();
            for (int i18 = 0; i18 < size4; i18++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = list6.get(i18);
                int lane2 = lazyStaggeredGridMeasuredItem4.getLane();
                iArr[lane2] = iArr[lane2] + lazyStaggeredGridMeasuredItem4.getMainAxisSize();
                initializeNode(lazyStaggeredGridMeasuredItem4, iArr[lazyStaggeredGridMeasuredItem4.getLane()] + i12);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem4);
            }
            ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        for (Object obj : this.movingAwayKeys) {
            ItemInfo itemInfo2 = (ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, obj);
            int index2 = this.keyIndexMap.getIndex(obj);
            if (index2 == -1) {
                this.keyToItemInfoMap.remove(obj);
            } else {
                LazyStaggeredGridMeasuredItem m944getAndMeasurejy6DScQ = itemProvider.m944getAndMeasurejy6DScQ(index2, SpanRange.m949constructorimpl(itemInfo2.getLane(), itemInfo2.getSpan()));
                int placeablesCount2 = m944getAndMeasurejy6DScQ.getPlaceablesCount();
                boolean z3 = false;
                for (int i19 = 0; i19 < placeablesCount2; i19++) {
                    LazyLayoutAnimateItemModifierNode node2 = getNode(m944getAndMeasurejy6DScQ.getParentData(i19));
                    if (node2 != null && node2.isAnimationInProgress()) {
                        z3 = true;
                    }
                }
                if (!z3 && index2 == lazyLayoutKeyIndexMap.getIndex(obj)) {
                    this.keyToItemInfoMap.remove(obj);
                } else if (index2 < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(m944getAndMeasurejy6DScQ);
                } else {
                    this.movingAwayToEndBound.add(m944getAndMeasurejy6DScQ);
                }
            }
        }
        if (!this.movingAwayToStartBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list7 = this.movingAwayToStartBound;
            if (list7.size() > 1) {
                CollectionsKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
                        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
                        lazyLayoutKeyIndexMap2 = LazyStaggeredGridItemPlacementAnimator.this.keyIndexMap;
                        lazyLayoutKeyIndexMap3 = LazyStaggeredGridItemPlacementAnimator.this.keyIndexMap;
                        return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list8 = this.movingAwayToStartBound;
            int size5 = list8.size();
            for (int i20 = 0; i20 < size5; i20++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = list8.get(i20);
                int lane3 = lazyStaggeredGridMeasuredItem5.getLane();
                iArr[lane3] = iArr[lane3] + lazyStaggeredGridMeasuredItem5.getMainAxisSize();
                lazyStaggeredGridMeasuredItem5.position(0 - iArr[lazyStaggeredGridMeasuredItem5.getLane()], ((ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyStaggeredGridMeasuredItem5.getKey())).getCrossAxisOffset(), i12);
                list.add(lazyStaggeredGridMeasuredItem5);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem5);
            }
            list2 = list;
            i5 = 0;
            ArraysKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        } else {
            list2 = list;
            i5 = 0;
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<LazyStaggeredGridMeasuredItem> list9 = this.movingAwayToEndBound;
            if (list9.size() > 1) {
                CollectionsKt.sortWith(list9, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
                        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
                        lazyLayoutKeyIndexMap2 = LazyStaggeredGridItemPlacementAnimator.this.keyIndexMap;
                        lazyLayoutKeyIndexMap3 = LazyStaggeredGridItemPlacementAnimator.this.keyIndexMap;
                        return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyStaggeredGridMeasuredItem) t).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(((LazyStaggeredGridMeasuredItem) t2).getKey())));
                    }
                });
            }
            List<LazyStaggeredGridMeasuredItem> list10 = this.movingAwayToEndBound;
            int size6 = list10.size();
            while (i5 < size6) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = list10.get(i5);
                int lane4 = lazyStaggeredGridMeasuredItem6.getLane();
                iArr[lane4] = iArr[lane4] + lazyStaggeredGridMeasuredItem6.getMainAxisSize();
                lazyStaggeredGridMeasuredItem6.position(iArr[lazyStaggeredGridMeasuredItem6.getLane()] + i12, ((ItemInfo) MapsKt.getValue(this.keyToItemInfoMap, lazyStaggeredGridMeasuredItem6.getKey())).getCrossAxisOffset(), i12);
                list2.add(lazyStaggeredGridMeasuredItem6);
                startAnimationsIfNeeded(lazyStaggeredGridMeasuredItem6);
                i5++;
            }
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    private final void startAnimationsIfNeeded(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyStaggeredGridMeasuredItem.getParentData(i));
            if (node != null) {
                long mo930getOffsetnOccac = lazyStaggeredGridMeasuredItem.mo930getOffsetnOccac();
                long m894getRawOffsetnOccac = node.m894getRawOffsetnOccac();
                if (!IntOffset.m5724equalsimpl0(m894getRawOffsetnOccac, LazyLayoutAnimateItemModifierNode.Companion.m896getNotInitializednOccac()) && !IntOffset.m5724equalsimpl0(m894getRawOffsetnOccac, mo930getOffsetnOccac)) {
                    node.m892animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(mo930getOffsetnOccac) - IntOffset.m5725getXimpl(m894getRawOffsetnOccac), IntOffset.m5726getYimpl(mo930getOffsetnOccac) - IntOffset.m5726getYimpl(m894getRawOffsetnOccac)));
                }
                node.m895setRawOffsetgyyYBs(mo930getOffsetnOccac);
            }
        }
    }

    private final boolean getHasAnimations(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (getNode(lazyStaggeredGridMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }
}
