package com.ifriend.presentation.features.purchases.common.view;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.ifriend.ui.components.canvas.DrawscopeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubscriptionBenefitsList.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsListKt$BenefitsGroup$1$3 extends Lambda implements Function1<DrawScope, Unit> {
    public static final SubscriptionBenefitsListKt$BenefitsGroup$1$3 INSTANCE = new SubscriptionBenefitsListKt$BenefitsGroup$1$3();

    SubscriptionBenefitsListKt$BenefitsGroup$1$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope drawBehind) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        f = SubscriptionBenefitsListKt.borderRadius;
        float f3 = drawBehind.mo588toPx0680j_4(f);
        long m3328getWhite0d7_KjU = Color.Companion.m3328getWhite0d7_KjU();
        f2 = SubscriptionBenefitsListKt.borderWidth;
        DrawscopeKt.m7033drawRoundRectStrokeInsider8hcZFg$default(drawBehind, m3328getWhite0d7_KjU, f2, 0L, 0L, CornerRadiusKt.CornerRadius(f3, f3), 0.0f, null, 0, 236, null);
    }
}
