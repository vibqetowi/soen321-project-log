package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyStaggeredGridMeasurePolicy.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1 extends Lambda implements Function2<LazyLayoutMeasureScope, Constraints, LazyStaggeredGridMeasureResult> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Function0<LazyStaggeredGridItemProvider> $itemProviderLambda;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ Function2<Density, Constraints, LazyStaggeredGridSlots> $slots;
    final /* synthetic */ LazyStaggeredGridState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1(Orientation orientation, Function2<? super Density, ? super Constraints, LazyStaggeredGridSlots> function2, Function0<? extends LazyStaggeredGridItemProvider> function0, LazyStaggeredGridState lazyStaggeredGridState, PaddingValues paddingValues, boolean z, float f) {
        super(2);
        this.$orientation = orientation;
        this.$slots = function2;
        this.$itemProviderLambda = function0;
        this.$state = lazyStaggeredGridState;
        this.$contentPadding = paddingValues;
        this.$reverseLayout = z;
        this.$mainAxisSpacing = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyStaggeredGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
        return m942invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyStaggeredGridMeasureResult m942invoke0kLqBqw(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j) {
        float beforePadding;
        float afterPadding;
        float startPadding;
        long IntOffset;
        Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
        CheckScrollableContainerConstraintsKt.m449checkScrollableContainerConstraintsK40F9xA(j, this.$orientation);
        LazyStaggeredGridSlots invoke = this.$slots.invoke(lazyLayoutMeasureScope, Constraints.m5539boximpl(j));
        boolean z = this.$orientation == Orientation.Vertical;
        LazyStaggeredGridItemProvider invoke2 = this.$itemProviderLambda.invoke();
        this.$state.setSlots$foundation_release(invoke);
        this.$state.setVertical$foundation_release(z);
        this.$state.setSpanProvider$foundation_release(invoke2.getSpanProvider());
        beforePadding = LazyStaggeredGridMeasurePolicyKt.beforePadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int i = lazyLayoutMeasureScope.mo582roundToPx0680j_4(beforePadding);
        afterPadding = LazyStaggeredGridMeasurePolicyKt.afterPadding(this.$contentPadding, this.$orientation, this.$reverseLayout, lazyLayoutMeasureScope.getLayoutDirection());
        int i2 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(afterPadding);
        startPadding = LazyStaggeredGridMeasurePolicyKt.startPadding(this.$contentPadding, this.$orientation, lazyLayoutMeasureScope.getLayoutDirection());
        int i3 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(startPadding);
        int m5550getMaxHeightimpl = ((z ? Constraints.m5550getMaxHeightimpl(j) : Constraints.m5551getMaxWidthimpl(j)) - i) - i2;
        if (z) {
            IntOffset = IntOffsetKt.IntOffset(i3, i);
        } else {
            IntOffset = IntOffsetKt.IntOffset(i, i3);
        }
        long j2 = IntOffset;
        PaddingValues paddingValues = this.$contentPadding;
        int i4 = lazyLayoutMeasureScope.mo582roundToPx0680j_4(Dp.m5607constructorimpl(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()) + PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection())));
        PaddingValues paddingValues2 = this.$contentPadding;
        LazyStaggeredGridMeasureResult m940measureStaggeredGriddSVRQoE = LazyStaggeredGridMeasureKt.m940measureStaggeredGriddSVRQoE(lazyLayoutMeasureScope, this.$state, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(invoke2, this.$state.getPinnedItems$foundation_release(), this.$state.getBeyondBoundsInfo$foundation_release()), invoke2, invoke, Constraints.m5542copyZbe2FdA$default(j, ConstraintsKt.m5565constrainWidthK40F9xA(j, i4), 0, ConstraintsKt.m5564constrainHeightK40F9xA(j, lazyLayoutMeasureScope.mo582roundToPx0680j_4(Dp.m5607constructorimpl(paddingValues2.mo700calculateTopPaddingD9Ej5fM() + paddingValues2.mo697calculateBottomPaddingD9Ej5fM()))), 0, 10, null), z, this.$reverseLayout, j2, m5550getMaxHeightimpl, lazyLayoutMeasureScope.mo582roundToPx0680j_4(this.$mainAxisSpacing), i, i2);
        this.$state.applyMeasureResult$foundation_release(m940measureStaggeredGriddSVRQoE);
        return m940measureStaggeredGriddSVRQoE;
    }
}
