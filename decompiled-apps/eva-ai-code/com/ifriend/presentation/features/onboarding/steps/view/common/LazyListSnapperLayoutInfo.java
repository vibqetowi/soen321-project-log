package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BQ\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\u000eJ\b\u0010!\u001a\u00020\u000bH\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J&\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0)2\u0006\u0010*\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bH\u0016J\b\u0010-\u001a\u00020'H\u0002R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/LazyListSnapperLayoutInfo;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutInfo;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "snapOffsetForItem", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "layoutInfo", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;", "item", "", "endContentPadding", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;I)V", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;)V", "currentItem", "getCurrentItem", "()Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnapperLayoutItemInfo;", "currentItem$delegate", "Landroidx/compose/runtime/State;", "endScrollOffset", "getEndScrollOffset", "()I", "itemCount", "getItemCount", "startScrollOffset", "getStartScrollOffset", "totalItemsCount", "getTotalItemsCount", "visibleItems", "Lkotlin/sequences/Sequence;", "getVisibleItems", "()Lkotlin/sequences/Sequence;", "calculateItemSpacing", "canScrollTowardsEnd", "", "canScrollTowardsStart", "determineTargetIndex", "velocity", "", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "maximumFlingDistance", "distanceToIndexSnap", FirebaseAnalytics.Param.INDEX, "estimateDistancePerItem", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListSnapperLayoutInfo extends SnapperLayoutInfo {
    public static final int $stable = 0;
    private final State currentItem$delegate;
    private final LazyListState lazyListState;
    private final Function2<SnapperLayoutInfo, SnapperLayoutItemInfo, Integer> snapOffsetForItem;
    private final int startScrollOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyListSnapperLayoutInfo(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> snapOffsetForItem) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(snapOffsetForItem, "snapOffsetForItem");
        this.lazyListState = lazyListState;
        this.snapOffsetForItem = snapOffsetForItem;
        this.currentItem$delegate = SnapshotStateKt.derivedStateOf(new LazyListSnapperLayoutInfo$currentItem$2(this));
    }

    public /* synthetic */ LazyListSnapperLayoutInfo(LazyListState lazyListState, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListState, function2, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "endContentPadding is no longer necessary to be passed in", replaceWith = @ReplaceWith(expression = "LazyListSnapperLayoutInfo(lazyListState, snapOffsetForItem)", imports = {}))
    public LazyListSnapperLayoutInfo(LazyListState lazyListState, Function2<? super SnapperLayoutInfo, ? super SnapperLayoutItemInfo, Integer> snapOffsetForItem, int i) {
        this(lazyListState, snapOffsetForItem);
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(snapOffsetForItem, "snapOffsetForItem");
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public int getStartScrollOffset() {
        return this.startScrollOffset;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public int getEndScrollOffset() {
        LazyListLayoutInfo layoutInfo = this.lazyListState.getLayoutInfo();
        return layoutInfo.getViewportEndOffset() - layoutInfo.getAfterContentPadding();
    }

    private final int getItemCount() {
        return this.lazyListState.getLayoutInfo().getTotalItemsCount();
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public int getTotalItemsCount() {
        return this.lazyListState.getLayoutInfo().getTotalItemsCount();
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public SnapperLayoutItemInfo getCurrentItem() {
        return (SnapperLayoutItemInfo) this.currentItem$delegate.getValue();
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public Sequence<SnapperLayoutItemInfo> getVisibleItems() {
        return SequencesKt.map(CollectionsKt.asSequence(this.lazyListState.getLayoutInfo().getVisibleItemsInfo()), LazyListSnapperLayoutInfo$visibleItems$1.INSTANCE);
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public int distanceToIndexSnap(int i) {
        SnapperLayoutItemInfo snapperLayoutItemInfo;
        int roundToInt;
        int intValue;
        boolean z;
        Iterator<SnapperLayoutItemInfo> it = getVisibleItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                snapperLayoutItemInfo = null;
                break;
            }
            snapperLayoutItemInfo = it.next();
            if (snapperLayoutItemInfo.getIndex() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        SnapperLayoutItemInfo snapperLayoutItemInfo2 = snapperLayoutItemInfo;
        if (snapperLayoutItemInfo2 != null) {
            roundToInt = snapperLayoutItemInfo2.getOffset();
            intValue = this.snapOffsetForItem.invoke(this, snapperLayoutItemInfo2).intValue();
        } else {
            SnapperLayoutItemInfo currentItem = getCurrentItem();
            if (currentItem == null) {
                return 0;
            }
            roundToInt = MathKt.roundToInt((i - currentItem.getIndex()) * estimateDistancePerItem()) + currentItem.getOffset();
            intValue = this.snapOffsetForItem.invoke(this, currentItem).intValue();
        }
        return roundToInt - intValue;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public boolean canScrollTowardsStart() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List<? extends Object>) this.lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex() > 0 || lazyListItemInfo.getOffset() < getStartScrollOffset();
        }
        return false;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public boolean canScrollTowardsEnd() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List<? extends Object>) this.lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return lazyListItemInfo.getIndex() < getItemCount() - 1 || lazyListItemInfo.getOffset() + lazyListItemInfo.getSize() > getEndScrollOffset();
        }
        return false;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.view.common.SnapperLayoutInfo
    public int determineTargetIndex(float f, DecayAnimationSpec<Float> decayAnimationSpec, float f2) {
        float coerceAtLeast;
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        SnapperLayoutItemInfo currentItem = getCurrentItem();
        if (currentItem == null) {
            return -1;
        }
        float estimateDistancePerItem = estimateDistancePerItem();
        if (estimateDistancePerItem <= 0.0f) {
            return currentItem.getIndex();
        }
        int distanceToIndexSnap = distanceToIndexSnap(currentItem.getIndex());
        int distanceToIndexSnap2 = distanceToIndexSnap(currentItem.getIndex() + 1);
        if (Math.abs(f) < 0.5f) {
            return RangesKt.coerceIn(Math.abs(distanceToIndexSnap) < Math.abs(distanceToIndexSnap2) ? currentItem.getIndex() : currentItem.getIndex() + 1, 0, getItemCount() - 1);
        }
        float coerceIn = RangesKt.coerceIn(DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, f), -f2, f2);
        if (f < 0.0f) {
            coerceAtLeast = RangesKt.coerceAtMost(coerceIn + distanceToIndexSnap2, 0.0f);
        } else {
            coerceAtLeast = RangesKt.coerceAtLeast(coerceIn + distanceToIndexSnap, 0.0f);
        }
        double d = estimateDistancePerItem;
        return RangesKt.coerceIn(currentItem.getIndex() + MathKt.roundToInt((coerceAtLeast / d) - (distanceToIndexSnap / d)), 0, getItemCount() - 1);
    }

    private final int calculateItemSpacing() {
        LazyListLayoutInfo layoutInfo = this.lazyListState.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().size() >= 2) {
            LazyListItemInfo lazyListItemInfo = layoutInfo.getVisibleItemsInfo().get(0);
            return layoutInfo.getVisibleItemsInfo().get(1).getOffset() - (lazyListItemInfo.getSize() + lazyListItemInfo.getOffset());
        }
        return 0;
    }

    private final float estimateDistancePerItem() {
        Object next;
        int max;
        LazyListLayoutInfo layoutInfo = this.lazyListState.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        Object obj = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int offset = ((LazyListItemInfo) next).getOffset();
                do {
                    Object next2 = it.next();
                    int offset2 = ((LazyListItemInfo) next2).getOffset();
                    if (offset > offset2) {
                        next = next2;
                        offset = offset2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo == null) {
            return -1.0f;
        }
        Iterator<T> it2 = layoutInfo.getVisibleItemsInfo().iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) obj;
                int offset3 = lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize();
                do {
                    Object next3 = it2.next();
                    LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) next3;
                    int offset4 = lazyListItemInfo3.getOffset() + lazyListItemInfo3.getSize();
                    if (offset3 < offset4) {
                        obj = next3;
                        offset3 = offset4;
                    }
                } while (it2.hasNext());
            }
        }
        LazyListItemInfo lazyListItemInfo4 = (LazyListItemInfo) obj;
        if (lazyListItemInfo4 == null) {
            return -1.0f;
        }
        if (Math.max(lazyListItemInfo.getOffset() + lazyListItemInfo.getSize(), lazyListItemInfo4.getOffset() + lazyListItemInfo4.getSize()) - Math.min(lazyListItemInfo.getOffset(), lazyListItemInfo4.getOffset()) == 0) {
            return -1.0f;
        }
        return (max + calculateItemSpacing()) / layoutInfo.getVisibleItemsInfo().size();
    }
}
