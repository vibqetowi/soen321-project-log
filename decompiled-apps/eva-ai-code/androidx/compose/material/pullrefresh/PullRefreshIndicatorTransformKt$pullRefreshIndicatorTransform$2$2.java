package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: PullRefreshIndicatorTransform.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ boolean $scale;
    final /* synthetic */ PullRefreshState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$2$2(PullRefreshState pullRefreshState, boolean z) {
        super(1);
        this.$state = pullRefreshState;
        this.$scale = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(this.$state.getPosition$material_release() - Size.m3084getHeightimpl(graphicsLayer.mo3454getSizeNHjbRc()));
        if (!this.$scale || this.$state.getRefreshing$material_release()) {
            return;
        }
        float coerceIn = RangesKt.coerceIn(EasingKt.getLinearOutSlowInEasing().transform(this.$state.getPosition$material_release() / this.$state.getThreshold$material_release()), 0.0f, 1.0f);
        graphicsLayer.setScaleX(coerceIn);
        graphicsLayer.setScaleY(coerceIn);
    }
}
