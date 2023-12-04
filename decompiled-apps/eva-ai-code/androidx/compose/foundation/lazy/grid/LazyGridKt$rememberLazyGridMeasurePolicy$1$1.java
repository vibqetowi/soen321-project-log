package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "containerConstraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridKt$rememberLazyGridMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function0<LazyGridItemProvider> $itemProviderLambda;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ Function2<Density, Constraints, LazyGridSlots> $slots;
    final /* synthetic */ LazyGridState $state;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridKt$rememberLazyGridMeasurePolicy$1$1(boolean z, PaddingValues paddingValues, boolean z2, Function0<? extends LazyGridItemProvider> function0, Function2<? super Density, ? super Constraints, LazyGridSlots> function2, LazyGridState lazyGridState, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal) {
        super(2);
        this.$isVertical = z;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z2;
        this.$itemProviderLambda = function0;
        this.$slots = function2;
        this.$state = lazyGridState;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m882invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m5557unboximpl());
    }

    /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyGridMeasureResult m882invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        int i;
        int i2;
        int i3;
        float mo661getSpacingD9Ej5fM;
        int m5551getMaxWidthimpl;
        long IntOffset;
        int firstVisibleItemScrollOffset;
        int i4;
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
        int i5 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo700calculateTopPaddingD9Ej5fM());
        int i6 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$contentPadding.mo697calculateBottomPaddingD9Ej5fM());
        int i7 = i5 + i6;
        int i8 = i + i2;
        boolean z = this.$isVertical;
        int i9 = z ? i7 : i8;
        if (z && !this.$reverseLayout) {
            i3 = i5;
        } else if (z && this.$reverseLayout) {
            i3 = i6;
        } else {
            i3 = (z || this.$reverseLayout) ? i2 : i;
        }
        final int i10 = i9 - i3;
        long m5567offsetNN6EwU = ConstraintsKt.m5567offsetNN6EwU(j, -i8, -i7);
        final LazyGridItemProvider invoke = this.$itemProviderLambda.invoke();
        final LazyGridSpanLayoutProvider spanLayoutProvider = invoke.getSpanLayoutProvider();
        final LazyGridSlots invoke2 = this.$slots.invoke(lazyLayoutMeasureScope, Constraints.m5539boximpl(j));
        int length = invoke2.getSizes().length;
        spanLayoutProvider.setSlotsPerLine(length);
        LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
        this.$state.setDensity$foundation_release(lazyLayoutMeasureScope2);
        this.$state.setSlotsPerLine$foundation_release(length);
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
        final int i11 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(mo661getSpacingD9Ej5fM);
        final int itemCount = invoke.getItemCount();
        if (this.$isVertical) {
            m5551getMaxWidthimpl = Constraints.m5550getMaxHeightimpl(j) - i7;
        } else {
            m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j) - i8;
        }
        int i12 = m5551getMaxWidthimpl;
        if (!this.$reverseLayout || i12 > 0) {
            IntOffset = IntOffsetKt.IntOffset(i, i5);
        } else {
            boolean z2 = this.$isVertical;
            if (!z2) {
                i += i12;
            }
            if (z2) {
                i5 += i12;
            }
            IntOffset = IntOffsetKt.IntOffset(i, i5);
        }
        final long j2 = IntOffset;
        final boolean z3 = this.$isVertical;
        final boolean z4 = this.$reverseLayout;
        final int i13 = i3;
        final ?? r18 = new LazyGridMeasuredItemProvider(invoke, lazyLayoutMeasureScope, i11, z3, z4, i13, i10, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
            final /* synthetic */ int $afterContentPadding;
            final /* synthetic */ int $beforeContentPadding;
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ boolean $reverseLayout;
            final /* synthetic */ LazyLayoutMeasureScope $this_null;
            final /* synthetic */ long $visualItemOffset;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.$this_null = lazyLayoutMeasureScope;
                this.$isVertical = z3;
                this.$reverseLayout = z4;
                this.$beforeContentPadding = i13;
                this.$afterContentPadding = i10;
                this.$visualItemOffset = j2;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
            public LazyGridMeasuredItem createItem(int i14, Object key, Object obj, int i15, int i16, List<? extends Placeable> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                return new LazyGridMeasuredItem(i14, key, this.$isVertical, i15, i16, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, obj, null);
            }
        };
        final boolean z5 = this.$isVertical;
        ?? r2 = new LazyGridMeasuredLineProvider(z5, invoke2, itemCount, i11, r18, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ LazyGridSlots $resolvedSlots;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z5, invoke2, itemCount, i11, r18, spanLayoutProvider);
                this.$isVertical = z5;
                this.$resolvedSlots = invoke2;
            }

            @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
            public LazyGridMeasuredLine createLine(int i14, LazyGridMeasuredItem[] items, List<GridItemSpan> spans, int i15) {
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(spans, "spans");
                return new LazyGridMeasuredLine(i14, items, this.$resolvedSlots, spans, this.$isVertical, i15);
            }
        };
        this.$state.setPrefetchInfoRetriever$foundation_release(new AnonymousClass1(spanLayoutProvider, r2));
        Snapshot.Companion companion = Snapshot.Companion;
        LazyGridState lazyGridState = this.$state;
        Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            int updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(invoke, lazyGridState.getFirstVisibleItemIndex());
            if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release >= itemCount && itemCount > 0) {
                i4 = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                firstVisibleItemScrollOffset = 0;
                Unit unit = Unit.INSTANCE;
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                createNonObservableSnapshot.dispose();
                LazyGridMeasureResult m883measureLazyGridZRKPzZ8 = LazyGridMeasureKt.m883measureLazyGridZRKPzZ8(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i3, i10, i11, i4, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m5567offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope2, this.$state.getPlacementAnimator$foundation_release(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), new AnonymousClass3(lazyLayoutMeasureScope, j, i8, i7));
                this.$state.applyMeasureResult$foundation_release(m883measureLazyGridZRKPzZ8);
                return m883measureLazyGridZRKPzZ8;
            }
            int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(updateScrollPositionIfTheFirstItemWasMoved$foundation_release);
            firstVisibleItemScrollOffset = lazyGridState.getFirstVisibleItemScrollOffset();
            i4 = lineIndexOfItem;
            Unit unit2 = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
            createNonObservableSnapshot.dispose();
            LazyGridMeasureResult m883measureLazyGridZRKPzZ82 = LazyGridMeasureKt.m883measureLazyGridZRKPzZ8(itemCount, (LazyGridMeasuredLineProvider) r2, (LazyGridMeasuredItemProvider) r18, i12, i3, i10, i11, i4, firstVisibleItemScrollOffset, this.$state.getScrollToBeConsumed$foundation_release(), m5567offsetNN6EwU, this.$isVertical, this.$verticalArrangement, this.$horizontalArrangement, this.$reverseLayout, lazyLayoutMeasureScope2, this.$state.getPlacementAnimator$foundation_release(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), new AnonymousClass3(lazyLayoutMeasureScope, j, i8, i7));
            this.$state.applyMeasureResult$foundation_release(m883measureLazyGridZRKPzZ82);
            return m883measureLazyGridZRKPzZ82;
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyGrid.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/collections/ArrayList;", "line", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> {
        final /* synthetic */ LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 $measuredLineProvider;
        final /* synthetic */ LazyGridSpanLayoutProvider $spanLayoutProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) {
            super(1);
            this.$spanLayoutProvider = lazyGridSpanLayoutProvider;
            this.$measuredLineProvider = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final ArrayList<Pair<Integer, Constraints>> invoke(int i) {
            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.$spanLayoutProvider.getLineConfiguration(i);
            int firstItemIndex = lineConfiguration.getFirstItemIndex();
            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
            List<GridItemSpan> spans = lineConfiguration.getSpans();
            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = this.$measuredLineProvider;
            int size = spans.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int m867getCurrentLineSpanimpl = GridItemSpan.m867getCurrentLineSpanimpl(spans.get(i3).m870unboximpl());
                arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m5539boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m888childConstraintsJhjzzOo$foundation_release(i2, m867getCurrentLineSpanimpl))));
                firstItemIndex++;
                i2 += m867getCurrentLineSpanimpl;
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyGrid.kt */
    @Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "placement", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {
        final /* synthetic */ long $containerConstraints;
        final /* synthetic */ LazyLayoutMeasureScope $this_null;
        final /* synthetic */ int $totalHorizontalPadding;
        final /* synthetic */ int $totalVerticalPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, int i, int i2) {
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
