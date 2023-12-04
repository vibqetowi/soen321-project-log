package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PagerMeasure.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/MeasuredPage;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasureKt$measurePager$extraPagesAfter$1 extends Lambda implements Function1<Integer, MeasuredPage> {
    final /* synthetic */ long $childConstraints;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ int $pageAvailableSize;
    final /* synthetic */ PagerLazyLayoutItemProvider $pagerItemProvider;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyLayoutMeasureScope $this_measurePager;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ long $visualPageOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$extraPagesAfter$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z, int i) {
        super(1);
        this.$this_measurePager = lazyLayoutMeasureScope;
        this.$childConstraints = j;
        this.$pagerItemProvider = pagerLazyLayoutItemProvider;
        this.$visualPageOffset = j2;
        this.$orientation = orientation;
        this.$horizontalAlignment = horizontal;
        this.$verticalAlignment = vertical;
        this.$reverseLayout = z;
        this.$pageAvailableSize = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final MeasuredPage invoke(int i) {
        MeasuredPage m972getAndMeasureSGf7dI0;
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.$this_measurePager;
        m972getAndMeasureSGf7dI0 = PagerMeasureKt.m972getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i, this.$childConstraints, this.$pagerItemProvider, this.$visualPageOffset, this.$orientation, this.$horizontalAlignment, this.$verticalAlignment, lazyLayoutMeasureScope.getLayoutDirection(), this.$reverseLayout, this.$pageAvailableSize);
        return m972getAndMeasureSGf7dI0;
    }
}
