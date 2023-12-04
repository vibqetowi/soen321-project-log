package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* compiled from: SelectChatStorePager.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SelectChatStorePagerKt$SelectChatStorePager$2$1$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ int $page;
    final /* synthetic */ PagerState $pagerState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectChatStorePagerKt$SelectChatStorePager$2$1$1$1(PagerState pagerState, int i) {
        super(1);
        this.$pagerState = pagerState;
        this.$page = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(MathHelpersKt.lerp(0.3f, 1.0f, 1.0f - RangesKt.coerceIn(Math.abs((this.$pagerState.getCurrentPage() - this.$page) + this.$pagerState.getCurrentPageOffsetFraction()), 0.0f, 1.0f)));
    }
}
