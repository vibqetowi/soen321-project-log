package androidx.compose.foundation.pager;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PagerMeasurePolicy.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/pager/PagerMeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, PagerMeasureResult> {
    final /* synthetic */ int $beyondBoundsPageCount;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Function0<PagerLazyLayoutItemProvider> $itemProviderLambda;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ Function0<Integer> $pageCount;
    final /* synthetic */ PageSize $pageSize;
    final /* synthetic */ float $pageSpacing;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ PagerState $state;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1(Orientation orientation, PaddingValues paddingValues, boolean z, PagerState pagerState, float f, PageSize pageSize, Function0<PagerLazyLayoutItemProvider> function0, Function0<Integer> function02, Alignment.Vertical vertical, Alignment.Horizontal horizontal, int i) {
        super(2);
        this.$orientation = orientation;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$state = pagerState;
        this.$pageSpacing = f;
        this.$pageSize = pageSize;
        this.$itemProviderLambda = function0;
        this.$pageCount = function02;
        this.$verticalAlignment = vertical;
        this.$horizontalAlignment = horizontal;
        this.$beyondBoundsPageCount = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ PagerMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m975invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final PagerMeasureResult m975invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        int i;
        int i2;
        int i3;
        int m5551getMaxWidthimpl;
        long IntOffset;
        int firstVisiblePageOffset$foundation_release;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
        boolean z = this.$orientation == Orientation.Vertical;
        CheckScrollableContainerConstraintsKt.m449checkScrollableContainerConstraintsK40F9xA(j, z ? Orientation.Vertical : Orientation.Horizontal);
        if (z) {
            i = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo698calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i = lazyLayoutMeasureScope.mo582roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        if (z) {
            i2 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo699calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
        } else {
            i2 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$contentPadding, lazyLayoutMeasureScope.getLayoutDirection()));
        }
        int i4 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo700calculateTopPaddingD9Ej5fM());
        int i5 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo697calculateBottomPaddingD9Ej5fM());
        int i6 = i4 + i5;
        int i7 = i + i2;
        int i8 = z ? i6 : i7;
        if (z && !this.$reverseLayout) {
            i3 = i4;
        } else if (z && this.$reverseLayout) {
            i3 = i5;
        } else {
            i3 = (z || this.$reverseLayout) ? i2 : i;
        }
        int i9 = i8 - i3;
        long m5567offsetNN6EwU = ConstraintsKt.m5567offsetNN6EwU(j, -i7, -i6);
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope2);
        int i10 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$pageSpacing);
        if (z) {
            m5551getMaxWidthimpl = Constraints.m5550getMaxHeightimpl(j) - i6;
        } else {
            m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j) - i7;
        }
        if (!this.$reverseLayout || m5551getMaxWidthimpl > 0) {
            IntOffset = IntOffsetKt.IntOffset(i, i4);
        } else {
            if (!z) {
                i += m5551getMaxWidthimpl;
            }
            if (z) {
                i4 += m5551getMaxWidthimpl;
            }
            IntOffset = IntOffsetKt.IntOffset(i, i4);
        }
        long j2 = IntOffset;
        int calculateMainAxisPageSize = this.$pageSize.calculateMainAxisPageSize(lazyLayoutMeasureScope2, m5551getMaxWidthimpl, i10);
        this.$state.m978setPremeasureConstraintsBRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, this.$orientation == Orientation.Vertical ? Constraints.m5551getMaxWidthimpl(m5567offsetNN6EwU) : calculateMainAxisPageSize, 0, this.$orientation != Orientation.Vertical ? Constraints.m5550getMaxHeightimpl(m5567offsetNN6EwU) : calculateMainAxisPageSize, 5, null));
        Snapshot.Companion companion = Snapshot.Companion;
        PagerState pagerState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            int firstVisiblePage$foundation_release = pagerState.getFirstVisiblePage$foundation_release();
            if (Intrinsics.areEqual(pagerState.getLayoutInfo$foundation_release(), PagerStateKt.getEmptyLayoutInfo())) {
                firstVisiblePageOffset$foundation_release = MathKt.roundToInt(pagerState.getInitialPageOffsetFraction() * calculateMainAxisPageSize);
            } else {
                firstVisiblePageOffset$foundation_release = pagerState.getFirstVisiblePageOffset$foundation_release();
            }
            int i11 = firstVisiblePageOffset$foundation_release;
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            PagerLazyLayoutItemProvider invoke = this.$itemProviderLambda.invoke();
            PagerMeasureResult m973measurePagerntgEbfI = PagerMeasureKt.m973measurePagerntgEbfI(lazyLayoutMeasureScope, this.$pageCount.invoke().intValue(), invoke, m5551getMaxWidthimpl, i3, i9, i10, firstVisiblePage$foundation_release, i11, this.$state.getScrollToBeConsumed$foundation_release(), m5567offsetNN6EwU, this.$orientation, this.$verticalAlignment, this.$horizontalAlignment, this.$reverseLayout, j2, calculateMainAxisPageSize, this.$beyondBoundsPageCount, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedPages$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), new AnonymousClass2(lazyLayoutMeasureScope, j, i7, i6));
            this.$state.applyMeasureResult$foundation_release(m973measurePagerntgEbfI);
            return m973measurePagerntgEbfI;
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PagerMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "placement", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.pager.PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1$2  reason: invalid class name */
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
