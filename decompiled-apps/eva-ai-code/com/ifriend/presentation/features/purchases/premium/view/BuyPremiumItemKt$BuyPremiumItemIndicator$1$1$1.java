package com.ifriend.presentation.features.purchases.premium.view;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.features.purchases.common.view.PurchasesCommonComponentsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyPremiumItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyPremiumItemKt$BuyPremiumItemIndicator$1$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ float $topPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumItemKt$BuyPremiumItemIndicator$1$1$1(float f) {
        super(1);
        this.$topPadding = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f = 2;
        float f2 = Canvas.mo588toPx0680j_4(Dp.m5607constructorimpl(f));
        float f3 = f2 / f;
        float f4 = this.$topPadding;
        Canvas.getDrawContext().getTransform().inset(f3, f3, f3, f3);
        DrawScope.CC.m3843drawRoundRectZuiqVtQ$default(Canvas, PurchasesCommonComponentsKt.getPurchaseGradient(), OffsetKt.Offset(0.0f, Canvas.mo588toPx0680j_4(f4)), 0L, CornerRadiusKt.CornerRadius$default(Canvas.mo588toPx0680j_4(Dp.m5607constructorimpl(20)), 0.0f, 2, null), 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 212, null);
        float f5 = -f3;
        Canvas.getDrawContext().getTransform().inset(f5, f5, f5, f5);
    }
}
