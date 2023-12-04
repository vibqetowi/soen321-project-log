package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyList.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/LazyListMeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyListKt$rememberLazyListMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult> {
    final /* synthetic */ int $beyondBoundsItemCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function0<LazyListItemProvider> $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyListState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1(boolean z, PaddingValues paddingValues, boolean z2, LazyListState lazyListState, Function0<? extends LazyListItemProvider> function0, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, Alignment.Horizontal horizontal2, Alignment.Vertical vertical2) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$state = lazyListState;
        this.$itemProviderLambda = function0;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$beyondBoundsItemCount = i;
        this.$horizontalAlignment = horizontal2;
        this.$verticalAlignment = vertical2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m851invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyListMeasureResult m851invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        int i;
        int i2;
        int i3;
        float mo661getSpacingD9Ej5fM;
        int m5551getMaxWidthimpl;
        long IntOffset;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
        CheckScrollableContainerConstraintsKt.m449checkScrollableContainerConstraintsK40F9xA(j, this.$isVertical ? Orientation.Vertical : Orientation.Horizontal);
        if (this.$isVertical) {
            i = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo698calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i = lazyLayoutMeasureScope.mo582roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (this.$isVertical) {
            i2 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo699calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i2 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int i4 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo700calculateTopPaddingD9Ej5fM());
        int i5 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo697calculateBottomPaddingD9Ej5fM());
        int i6 = i4 + i5;
        int i7 = i + i2;
        boolean z = this.$isVertical;
        int i8 = z ? i6 : i7;
        if (z && !this.$reverseLayout) {
            i3 = i4;
        } else if (z && this.$reverseLayout) {
            i3 = i5;
        } else {
            i3 = (z || this.$reverseLayout) ? i2 : i;
        }
        final int i9 = i8 - i3;
        final long m5567offsetNN6EwU = ConstraintsKt.m5567offsetNN6EwU(j, -i7, -i6);
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope2);
        final LazyListItemProvider invoke = this.$itemProviderLambda.invoke();
        invoke.getItemScope().setMaxSize(Constraints.m5551getMaxWidthimpl(m5567offsetNN6EwU), Constraints.m5550getMaxHeightimpl(m5567offsetNN6EwU));
        if (this.$isVertical) {
            Arrangement.Vertical vertical = this.$verticalArrangement;
            if (vertical == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            mo661getSpacingD9Ej5fM = vertical.mo661getSpacingD9Ej5fM();
        } else {
            Arrangement.Horizontal horizontal = this.$horizontalArrangement;
            if (horizontal == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            mo661getSpacingD9Ej5fM = horizontal.mo661getSpacingD9Ej5fM();
        }
        final int i10 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(mo661getSpacingD9Ej5fM);
        final int itemCount = invoke.getItemCount();
        if (this.$isVertical) {
            m5551getMaxWidthimpl = Constraints.m5550getMaxHeightimpl(j) - i6;
        } else {
            m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j) - i7;
        }
        int i11 = m5551getMaxWidthimpl;
        if (!this.$reverseLayout || i11 > 0) {
            IntOffset = IntOffsetKt.IntOffset(i, i4);
        } else {
            boolean z2 = this.$isVertical;
            if (!z2) {
                i += i11;
            }
            if (z2) {
                i4 += i11;
            }
            IntOffset = IntOffsetKt.IntOffset(i, i4);
        }
        final long j2 = IntOffset;
        final boolean z3 = this.$isVertical;
        final Alignment.Horizontal horizontal2 = this.$horizontalAlignment;
        final Alignment.Vertical vertical2 = this.$verticalAlignment;
        final boolean z4 = this.$reverseLayout;
        final int i12 = i3;
        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(m5567offsetNN6EwU, z3, invoke, lazyLayoutMeasureScope, itemCount, i10, horizontal2, vertical2, z4, i12, i9, j2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ int $itemsCount;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ int $spaceBetweenItems;
            final /* synthetic */ LazyLayoutMeasureScope $this_null;
            final /* synthetic */ Alignment.Vertical $verticalAlignment;
            final /* synthetic */ long $visualItemOffset;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$isVertical = z3;
                this.$this_null = lazyLayoutMeasureScope;
                this.$itemsCount = itemCount;
                this.$spaceBetweenItems = i10;
                this.$horizontalAlignment = horizontal2;
                this.$verticalAlignment = vertical2;
                this.$reverseLayout = z4;
                this.$beforeContentPadding = i12;
                this.$afterContentPadding = i9;
                this.$visualItemOffset = j2;
            }

            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
            public LazyListMeasuredItem createItem(int i13, Object key, Object obj, List<? extends Placeable> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                return new LazyListMeasuredItem(i13, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, i13 == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, obj, null);
            }
        };
        this.$state.m861setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.m859getChildConstraintsmsEJaDk());
        Snapshot.Companion companion = Snapshot.Companion;
        LazyListState lazyListState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyListState.getFirstVisibleItemIndex());
            int firstVisibleItemScrollOffset = lazyListState.getFirstVisibleItemScrollOffset();
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            LazyListMeasureResult m855measureLazyListCD5nmq0 = LazyListMeasureKt.m855measureLazyListCD5nmq0(itemCount, lazyListMeasuredItemProvider, i11, i3, i9, i10, updateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m5567offsetNN6EwU, this.$isVertical, invoke.getHeaderIndexes(), this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope2, this.$state.getPlacementAnimator$foundation_release(), this.$beyondBoundsItemCount, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), new AnonymousClass2(lazyLayoutMeasureScope, j, i7, i6));
            this.$state.applyMeasureResult$foundation_release(m855measureLazyListCD5nmq0);
            return m855measureLazyListCD5nmq0;
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyList.kt */
    @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "placement", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2) {
            super(3);
            this.$this_null = lazyLayoutMeasureScope;
            this.$containerConstraints = j;
            this.$totalHorizontalPadding = i;
            this.$totalVerticalPadding = i2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
            return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
        }

        public final MeasureResult invoke(int i, int i2, Function1<? super Placeable.PlacementScope, Unit> placement) {
            Intrinsics.checkNotNullParameter(placement, "placement");
            return this.$this_null.layout(ConstraintsKt.m5565constrainWidthK40F9xA(this.$containerConstraints, i + this.$totalHorizontalPadding), ConstraintsKt.m5564constrainHeightK40F9xA(this.$containerConstraints, i2 + this.$totalVerticalPadding), MapsKt.emptyMap(), placement);
        }
    }
}
