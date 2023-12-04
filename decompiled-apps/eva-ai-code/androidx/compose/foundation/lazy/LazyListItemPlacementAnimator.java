package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LazyListItemPlacementAnimator.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J<\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0013J\u0006\u0010&\u001a\u00020\u001bJ\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002JE\u0010(\u001a\u00020\u001b*\u00020\u000e26\u0010)\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u001b0*H\u0082\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00010\nj\b\u0012\u0004\u0012\u00020\u0001`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "()V", "activeKeys", "", "firstVisibleIndex", "", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "movingAwayKeys", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "movingAwayToEndBound", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "movingAwayToStartBound", "movingInFromEndBound", "movingInFromStartBound", "hasAnimations", "", "getHasAnimations", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;)Z", "node", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "getNode", "(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "initializeNode", "", "item", "mainAxisOffset", "onMeasured", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "isVertical", "reset", "startAnimationsIfNeeded", "forEachNode", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "placeableIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListItemPlacementAnimator {
    private int firstVisibleIndex;
    private final Set<Object> activeKeys = new LinkedHashSet();
    private LazyLayoutKeyIndexMap keyIndexMap = LazyLayoutKeyIndexMap.Empty;
    private final LinkedHashSet<Object> movingAwayKeys = new LinkedHashSet<>();
    private final List<LazyListMeasuredItem> movingInFromStartBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingInFromEndBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingAwayToStartBound = new ArrayList();
    private final List<LazyListMeasuredItem> movingAwayToEndBound = new ArrayList();

    public final void reset() {
        this.activeKeys.clear();
        this.keyIndexMap = LazyLayoutKeyIndexMap.Empty;
        this.firstVisibleIndex = -1;
    }

    private final void initializeNode(LazyListMeasuredItem lazyListMeasuredItem, int i) {
        long m5721copyiSbpLlY$default;
        long m858getOffsetBjo55l4 = lazyListMeasuredItem.m858getOffsetBjo55l4(0);
        if (lazyListMeasuredItem.isVertical()) {
            m5721copyiSbpLlY$default = IntOffset.m5721copyiSbpLlY$default(m858getOffsetBjo55l4, 0, i, 1, null);
        } else {
            m5721copyiSbpLlY$default = IntOffset.m5721copyiSbpLlY$default(m858getOffsetBjo55l4, i, 0, 2, null);
        }
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyListMeasuredItem.getParentData(i2));
            if (node != null) {
                long m858getOffsetBjo55l42 = lazyListMeasuredItem.m858getOffsetBjo55l4(i2);
                long IntOffset = IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(m858getOffsetBjo55l42) - IntOffset.m5725getXimpl(m858getOffsetBjo55l4), IntOffset.m5726getYimpl(m858getOffsetBjo55l42) - IntOffset.m5726getYimpl(m858getOffsetBjo55l4));
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

    private final void forEachNode(LazyListMeasuredItem lazyListMeasuredItem, Function2<? super Integer, ? super LazyLayoutAnimateItemModifierNode, Unit> function2) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyListMeasuredItem.getParentData(i));
            if (node != null) {
                function2.invoke(Integer.valueOf(i), node);
            }
        }
    }

    public final void onMeasured(int i, int i2, int i3, List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider itemProvider, boolean z) {
        boolean z2;
        long IntOffset;
        int i4;
        List<LazyListMeasuredItem> positionedItems = list;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z2 = false;
                break;
            } else if (getHasAnimations(positionedItems.get(i5))) {
                z2 = true;
                break;
            } else {
                i5++;
            }
        }
        if (!z2 && this.activeKeys.isEmpty()) {
            reset();
            return;
        }
        int i6 = this.firstVisibleIndex;
        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) CollectionsKt.firstOrNull((List<? extends Object>) list);
        this.firstVisibleIndex = lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.keyIndexMap;
        this.keyIndexMap = itemProvider.getKeyIndexMap();
        int i7 = z ? i3 : i2;
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(0, i);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i, 0);
        }
        this.movingAwayKeys.addAll(this.activeKeys);
        int size2 = list.size();
        int i8 = 0;
        while (i8 < size2) {
            LazyListMeasuredItem lazyListMeasuredItem2 = positionedItems.get(i8);
            this.movingAwayKeys.remove(lazyListMeasuredItem2.getKey());
            if (getHasAnimations(lazyListMeasuredItem2)) {
                if (!this.activeKeys.contains(lazyListMeasuredItem2.getKey())) {
                    this.activeKeys.add(lazyListMeasuredItem2.getKey());
                    int index = lazyLayoutKeyIndexMap.getIndex(lazyListMeasuredItem2.getKey());
                    if (index == -1 || lazyListMeasuredItem2.getIndex() == index) {
                        long m858getOffsetBjo55l4 = lazyListMeasuredItem2.m858getOffsetBjo55l4(0);
                        initializeNode(lazyListMeasuredItem2, lazyListMeasuredItem2.isVertical() ? IntOffset.m5726getYimpl(m858getOffsetBjo55l4) : IntOffset.m5725getXimpl(m858getOffsetBjo55l4));
                    } else if (index < i6) {
                        this.movingInFromStartBound.add(lazyListMeasuredItem2);
                    } else {
                        this.movingInFromEndBound.add(lazyListMeasuredItem2);
                    }
                    i4 = size2;
                } else {
                    int placeablesCount = lazyListMeasuredItem2.getPlaceablesCount();
                    int i9 = 0;
                    while (i9 < placeablesCount) {
                        LazyLayoutAnimateItemModifierNode node = getNode(lazyListMeasuredItem2.getParentData(i9));
                        int i10 = size2;
                        if (node != null && !IntOffset.m5724equalsimpl0(node.m894getRawOffsetnOccac(), LazyLayoutAnimateItemModifierNode.Companion.m896getNotInitializednOccac())) {
                            long m894getRawOffsetnOccac = node.m894getRawOffsetnOccac();
                            node.m895setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(m894getRawOffsetnOccac) + IntOffset.m5725getXimpl(IntOffset), IntOffset.m5726getYimpl(m894getRawOffsetnOccac) + IntOffset.m5726getYimpl(IntOffset)));
                        }
                        i9++;
                        size2 = i10;
                    }
                    i4 = size2;
                    startAnimationsIfNeeded(lazyListMeasuredItem2);
                }
            } else {
                i4 = size2;
                this.activeKeys.remove(lazyListMeasuredItem2.getKey());
            }
            i8++;
            size2 = i4;
            positionedItems = list;
        }
        List<LazyListMeasuredItem> list2 = this.movingInFromStartBound;
        if (list2.size() > 1) {
            CollectionsKt.sortWith(list2, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t2).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t).getKey())));
                }
            });
        }
        List<LazyListMeasuredItem> list3 = this.movingInFromStartBound;
        int size3 = list3.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size3; i12++) {
            LazyListMeasuredItem lazyListMeasuredItem3 = list3.get(i12);
            i11 += lazyListMeasuredItem3.getSize();
            initializeNode(lazyListMeasuredItem3, 0 - i11);
            startAnimationsIfNeeded(lazyListMeasuredItem3);
        }
        List<LazyListMeasuredItem> list4 = this.movingInFromEndBound;
        if (list4.size() > 1) {
            CollectionsKt.sortWith(list4, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t).getKey())), Integer.valueOf(LazyLayoutKeyIndexMap.this.getIndex(((LazyListMeasuredItem) t2).getKey())));
                }
            });
        }
        List<LazyListMeasuredItem> list5 = this.movingInFromEndBound;
        int size4 = list5.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size4; i14++) {
            LazyListMeasuredItem lazyListMeasuredItem4 = list5.get(i14);
            int i15 = i7 + i13;
            i13 += lazyListMeasuredItem4.getSize();
            initializeNode(lazyListMeasuredItem4, i15);
            startAnimationsIfNeeded(lazyListMeasuredItem4);
        }
        for (Object obj : this.movingAwayKeys) {
            int index2 = this.keyIndexMap.getIndex(obj);
            if (index2 == -1) {
                this.activeKeys.remove(obj);
            } else {
                LazyListMeasuredItem andMeasure = itemProvider.getAndMeasure(index2);
                int placeablesCount2 = andMeasure.getPlaceablesCount();
                boolean z3 = false;
                for (int i16 = 0; i16 < placeablesCount2; i16++) {
                    LazyLayoutAnimateItemModifierNode node2 = getNode(andMeasure.getParentData(i16));
                    if (node2 != null && node2.isAnimationInProgress()) {
                        z3 = true;
                    }
                }
                if (!z3 && index2 == lazyLayoutKeyIndexMap.getIndex(obj)) {
                    this.activeKeys.remove(obj);
                } else if (index2 < this.firstVisibleIndex) {
                    this.movingAwayToStartBound.add(andMeasure);
                } else {
                    this.movingAwayToEndBound.add(andMeasure);
                }
            }
        }
        List<LazyListMeasuredItem> list6 = this.movingAwayToStartBound;
        if (list6.size() > 1) {
            CollectionsKt.sortWith(list6, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
                    lazyLayoutKeyIndexMap2 = LazyListItemPlacementAnimator.this.keyIndexMap;
                    lazyLayoutKeyIndexMap3 = LazyListItemPlacementAnimator.this.keyIndexMap;
                    return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyListMeasuredItem) t2).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(((LazyListMeasuredItem) t).getKey())));
                }
            });
        }
        List<LazyListMeasuredItem> list7 = this.movingAwayToStartBound;
        int size5 = list7.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size5; i18++) {
            LazyListMeasuredItem lazyListMeasuredItem5 = list7.get(i18);
            i17 += lazyListMeasuredItem5.getSize();
            lazyListMeasuredItem5.position(0 - i17, i2, i3);
            list.add(lazyListMeasuredItem5);
            startAnimationsIfNeeded(lazyListMeasuredItem5);
        }
        List<LazyListMeasuredItem> list8 = this.movingAwayToEndBound;
        if (list8.size() > 1) {
            CollectionsKt.sortWith(list8, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3;
                    lazyLayoutKeyIndexMap2 = LazyListItemPlacementAnimator.this.keyIndexMap;
                    lazyLayoutKeyIndexMap3 = LazyListItemPlacementAnimator.this.keyIndexMap;
                    return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyListMeasuredItem) t).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(((LazyListMeasuredItem) t2).getKey())));
                }
            });
        }
        List<LazyListMeasuredItem> list9 = this.movingAwayToEndBound;
        int size6 = list9.size();
        int i19 = 0;
        for (int i20 = 0; i20 < size6; i20++) {
            LazyListMeasuredItem lazyListMeasuredItem6 = list9.get(i20);
            int i21 = i7 + i19;
            i19 += lazyListMeasuredItem6.getSize();
            lazyListMeasuredItem6.position(i21, i2, i3);
            list.add(lazyListMeasuredItem6);
            startAnimationsIfNeeded(lazyListMeasuredItem6);
        }
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.clear();
    }

    private final void startAnimationsIfNeeded(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            LazyLayoutAnimateItemModifierNode node = getNode(lazyListMeasuredItem.getParentData(i));
            if (node != null) {
                long m858getOffsetBjo55l4 = lazyListMeasuredItem.m858getOffsetBjo55l4(i);
                long m894getRawOffsetnOccac = node.m894getRawOffsetnOccac();
                if (!IntOffset.m5724equalsimpl0(m894getRawOffsetnOccac, LazyLayoutAnimateItemModifierNode.Companion.m896getNotInitializednOccac()) && !IntOffset.m5724equalsimpl0(m894getRawOffsetnOccac, m858getOffsetBjo55l4)) {
                    node.m892animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m5725getXimpl(m858getOffsetBjo55l4) - IntOffset.m5725getXimpl(m894getRawOffsetnOccac), IntOffset.m5726getYimpl(m858getOffsetBjo55l4) - IntOffset.m5726getYimpl(m894getRawOffsetnOccac)));
                }
                node.m895setRawOffsetgyyYBs(m858getOffsetBjo55l4);
            }
        }
    }

    private final boolean getHasAnimations(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i = 0; i < placeablesCount; i++) {
            if (getNode(lazyListMeasuredItem.getParentData(i)) != null) {
                return true;
            }
        }
        return false;
    }
}
